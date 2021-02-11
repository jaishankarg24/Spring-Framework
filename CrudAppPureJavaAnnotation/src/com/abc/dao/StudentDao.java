package com.abc.dao;

import com.abc.dto.Student;

public interface StudentDao {
	public String save(String sid, String sname, String saddress);

	public String update(String sid, String sname, String saddress);

	public Student findById(String sid);

	public String delete(String sid);

}
