package com.example.ilsan34.security;

import com.example.ilsan34.clientManager.model.Publicist;
import com.example.ilsan34.clientManager.repository.PublicistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final PublicistRepository publicistRepository;

    @Autowired
    public UserDetailsServiceImpl(PublicistRepository publicistRepository) {
        this.publicistRepository = publicistRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Publicist publicist = publicistRepository.findByUserName(userName).orElseThrow(() ->
                new UsernameNotFoundException("User doesn't exist"));
        return SecurityPublicist.fromPublicist(publicist);
    }
}
