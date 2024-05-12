package com.codeEceEcommerce.ecommerceEce.services.authentification;

import com.codeEceEcommerce.ecommerceEce.dto.SignupRequestDTO;
import com.codeEceEcommerce.ecommerceEce.dto.UserDto;

public interface AuthService {
    UserDto signupClient(SignupRequestDTO signupRequestDTO);
    Boolean presentByEmail(String email);
    UserDto signupCompany(SignupRequestDTO signupRequestDTO);
}
