package com.womentsecuritysystem.repository;


import com.womentsecuritysystem.entity.AdminEntity;

public interface AdminRepo {

	AdminEntity readByEmailId(String emailId);

	boolean updateOptById(int id, String otp);

	

}
