package org.zekula.api.user_api.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.zekula.api.user_api.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
