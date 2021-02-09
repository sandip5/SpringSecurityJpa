package com.sandip.spring.securityjpa.springsecurityjpa;

import com.sandip.spring.securityjpa.springsecurityjpa.models.MyUserDetails;
import com.sandip.spring.securityjpa.springsecurityjpa.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found : " + userName));
        return user.map(MyUserDetails::new).get();
    }
}
