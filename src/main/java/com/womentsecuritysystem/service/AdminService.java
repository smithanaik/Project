package com.womentsecuritysystem.service;

import java.util.List;

import com.womentsecuritysystem.dto.ComplaintsDTO;
import com.womentsecuritysystem.dto.WomenSecurityDto;

public interface AdminService {

	boolean readByEmailId(String emailId);

	boolean generateAndSendOTP(String email);

	boolean validateOpt(String email, String otp);

	boolean adminLogin(String email, String password);

	List<WomenSecurityDto> readAll();

	List<ComplaintsDTO> readAllComplaints();

}
