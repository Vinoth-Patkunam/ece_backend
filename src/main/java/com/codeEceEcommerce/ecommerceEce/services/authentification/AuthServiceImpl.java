package com.codeEceEcommerce.ecommerceEce.services.authentification;
import com.codeEceEcommerce.ecommerceEce.dto.SignupRequestDTO;
import com.codeEceEcommerce.ecommerceEce.dto.UserDto;
import com.codeEceEcommerce.ecommerceEce.repository.UserRepository;
import com.codeEceEcommerce.ecommerceEce.enums.UserRole;
import com.codeEceEcommerce.ecommerceEce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository userRepository;
    public UserDto signupClient(SignupRequestDTO signupRequestDTO){
        User user = new User() ;
        user.setName(signupRequestDTO.getName());
        user.setLastname(signupRequestDTO.getLastname());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword(signupRequestDTO.getPassword());
        user.setRole(UserRole.CLIENT);
        return userRepository.save(user).getDto();
    }
    public Boolean presentByEmail(String email){
        return userRepository.findFirstByEmail(email) != null;
    }

    public UserDto signupCompany(SignupRequestDTO signupRequestDTO){
        User user = new User() ;

        user.setName(signupRequestDTO.getName());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword(signupRequestDTO.getPassword());
        user.setRole(UserRole.COMPANY);
        return userRepository.save(user).getDto();
    }
}
