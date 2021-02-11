package com.abc.controller;

import java.io.BufferedReader;


import java.io.InputStreamReader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.config.StudentConfig;
import com.abc.dto.Student;
import com.abc.service.StudentService;

public class MainApp {

	public static void main(String[] args) throws Exception {

		// Activate the IOC container
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				//"applicationContext.xml");
		
		//Through Annotation
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				StudentConfig.class);

		// Get the bean from the container

		StudentService studentService = (StudentService) applicationContext.getBean("studentService");

		// use the bean
		String sid = "", sname = "", saddress = "", status = "";
		try {
			while (true) {

				System.out.println("Student Service Applictation");
				System.out.println("1.CREATE 2.READ 3.UPDATE 4.DELETE 5.EXIT");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter ur choice to get the Service:");
				int option = Integer.parseInt(br.readLine());

				switch (option) {
				case 1:
					System.out.print("Enter the sid: ");
					sid = br.readLine();
					System.out.print("Enter the sname: ");
					sname = br.readLine();
					System.out.print("Enter the saddress:");
					saddress = br.readLine();

					status = studentService.save(sid, sname, saddress);
					if (status == "success") {
						System.out.println("Record Inserted Succesfully");
					}
					if (status == "failure") {
						System.out.println("Failed to insert the record");
					}
					if (status.equals("Already Existed")) {
						System.out.println("Record alreay existed");
					}

					break;
				case 2:
					System.out.print("Enter the sid: ");
					sid = br.readLine();

					Student student = studentService.findById(sid);
					if (student == null) {
						System.out.println("Student record does not exists");
					} else {
						System.out.println("Student record is :" + student);
					}

					break;
				case 3:
					System.out.print("Enter the sid of the record to be updated:  ");
					sid = br.readLine();

					Student dbStudent = studentService.findById(sid);

					if (dbStudent == null) {
						// Record does not exists for UPDATION
						System.out.println("Updation not possible.Record doesnot exists.");
					} else {
						// Record exists to perform UPDATION
						System.out.println("The record existed for :" + dbStudent);

						// Create a new Student DTO object to for UPDATION
						Student updateStudent = new Student();

						// Update the new Student DTO object with the updated values

						// Since SID(PK) do not ask the user rather we should set the value from DB
						updateStudent.setSid(dbStudent.getSid());

						System.out.print("Student Name : oldValue :" + dbStudent.getSname() + " Enter new Value :");
						sname = br.readLine();

						// Performing basic validation and make the changes in the database
						if (sname == null || sname.equals("")) {

							// User has not enter anything so keep old value only.
							updateStudent.setSname(dbStudent.getSname());

						} else {

							// User has entered the value so set the new value only
							updateStudent.setSname(sname);
						}

						System.out.print(
								"Student Address :oldValue :" + dbStudent.getSaddress() + " Enter new Address :");
						saddress = br.readLine();

						// Performing basic validation and make the changes in the database
						if (saddress == null || saddress.equals("")) {

							// User has not enter anything so keep old value only.
							updateStudent.setSaddress(dbStudent.getSaddress());

						} else {
							// User has enter the value so set the new value only
							updateStudent.setSaddress(saddress);
						}

						status = studentService.update(updateStudent.getSid(), updateStudent.getSname(),
								updateStudent.getSaddress());

						if (status == "success") {
							System.out.println("Student record updated Succesfully!!!!!");
						} else {
							System.out.println("Failed to update the record!!!!!");
						}

					}

					break;
				case 4:
					System.out.print("Enter the sid: ");
					sid = br.readLine();
					status = studentService.delete(sid);
					if (status.equals("success")) {
						System.out.println("Student Record deleted Succesfully!!!!!");
					}
					if (status.equals("failure")) {
						System.out.println("Student Record failed to delete!!!!!");
					}
					if (status.equals("not found")) {
						System.out.println("Student Record doesnot exist for deleting!!!!");
					}

					break;
				case 5:
					System.out.println("Thanks for using Application");
					System.exit(0);// Takes the control back to JVM
					break;

				default:
					System.out.println("Invalid choice");
				}

			}
		} finally {
			applicationContext.close();
		}

	}

}


/*---------------------------------------------
Student Service Applictation

1.CREATE 2.READ 3.UPDATE 4.DELETE 5.EXIT

Enter ur choice to get the Service:1
Enter the sid: IND18
Enter the sname: Virat
Enter the saddress: Delhi

Record Inserted Succesfully

Student Service Applictation
1.CREATE 2.READ 3.UPDATE 4.DELETE 5.EXIT

Enter ur choice to get the Service:2
Enter the sid: IND18
Student record is : [sid=IND18, sname=Virat, saddress= Delhi]

Student Service Applictation
1.CREATE 2.READ 3.UPDATE 4.DELETE 5.EXIT

Enter ur choice to get the Service:3
Enter the sid of the record to be updated:  IND18 
The record existed for : [sid=IND18, sname=Virat, saddress= Delhi]
Student Name : oldValue :Virat Enter new Value :VIRAT
Student Address :oldValue : Delhi Enter new Address :DELHI
Student record updated Succesfully!!!!!

Student Service Applictation
1.CREATE 2.READ 3.UPDATE 4.DELETE 5.EXIT

Enter ur choice to get the Service:7
Invalid choice

Student Service Applictation
1.CREATE 2.READ 3.UPDATE 4.DELETE 5.EXIT

Enter ur choice to get the Service:5
Thanks for using Application
*/