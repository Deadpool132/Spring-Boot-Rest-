package com.appsdeveloperblog.app.ws.mobileappws.io.service;

import com.appsdeveloperblog.app.ws.mobileappws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto userDto);
}
