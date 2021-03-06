package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.abc.dao.StudentDao;
import com.abc.dto.Student;

@Service("studentService")
public class StudentServiceImp implements StudentService {

	@Autowired(required = true)
	private StudentDao studentDao;

	@Override
	public String save(String sid, String sname, String saddress) {

		return studentDao.save(sid, sname, saddress);
	}

	@Override
	public String update(String sid, String sname, String address) {
		return null;
	}

	@Override
	public Student findById(String sid) {
		return null;
	}

	@Override
	public String delete(String sid) {
		return null;
	}

}
