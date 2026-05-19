package com.womentsecuritysystem.repository;

import com.womentsecuritysystem.entity.EmailValidationEntity;

public interface EmailIdValidationRepo {

	boolean saveOtpByEmailId(EmailValidationEntity entity);

	String findLatestOtpByEmail(String email);

	boolean deleteEmailVerificationDataByEmail(String email);

}
