package com.abc.service;

import com.abc.dto.Student;

public interface StudentService {

	public String save(String sid, String sname, String saddress);

	public String update(String sid, String sname, String address);

	public Student findById(String sid);

	public String delete(String sid);

}
