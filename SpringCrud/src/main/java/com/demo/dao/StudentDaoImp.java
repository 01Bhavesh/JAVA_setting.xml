package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.demo.model.Student;

@Repository
public class StudentDaoImp implements StudentDao{
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	public int addStd(Student s) {
		
		return jdbcTemplate.update("insert into student values (?,?,?,?)", new Object[] {s.getId(),s.getName(),s.getPhoneNo(),s.getEmailId()});
	}
	public List<Student> showAll() {
		List<Student> lst = jdbcTemplate.query("select * from student", (rs,num)->{
			Student s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setPhoneNo(rs.getString(3));
			s.setEmailId(rs.getString(4));
			return s;
		});
		return lst;
	}
	@Override
	public int delete(int id) {
		
		return jdbcTemplate.update("delete from student where id = ?", new Object[] {id});
	}
	@Override
	public int updatedById(int id, String name, String number, String email) {
		
		return jdbcTemplate.update("update student set name = ?, phoneno = ?, email = ? where id = ?", new Object[] {name,number,email,id});
	}
	@Override
	public Student showById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from student where id = ?", new Object[] {id},BeanPropertyRowMapper.newInstance(Student.class));
	}


}
