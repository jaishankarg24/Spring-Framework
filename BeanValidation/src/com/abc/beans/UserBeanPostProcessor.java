package com.abc.beans;

import org.springframework.beans.BeansException;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class UserBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		User user =(User)bean;
		String uname = user.getUname();
		int uage = user.getUage();
		String uemail = user.getUemail();
		String uphone = user.getUphone();
		
		String uname_Error_Msg="";
		String uemail_Error_Msg="";
		String uphone_Error_Msg="";
		String uage_Error_Msg="";
		
		boolean status=true;
		
		if (uname.equals("")) {
			uname_Error_Msg+="Name is a Compulsory Attribute";
			status=false;
			
		} else if(!uemail.endsWith("@gmail.com")){
			uemail_Error_Msg+="Email should comulsory ends with @gmail.com";
			status=false;
			
		}
		else if(!(uage>18 && uage<30)) {
			uage_Error_Msg+="Invalid age of the User";
			status=false;
		}
		else if(!(uphone.length()==10)){
			uphone_Error_Msg+="Invalid Phone number, length should be 10 digits";
			status=false;

		}
		
		if(status==false) {
			System.out.println("Validation details are :");
			System.out.println(uname_Error_Msg);
			System.out.println(uage_Error_Msg);
			System.out.println(uemail_Error_Msg);
			System.out.println(uphone_Error_Msg);
			System.out.println("---------------");
		}
		
		return user;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		return bean;
	}

}
