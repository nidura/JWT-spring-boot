package com.jwt.demo.controller;

import com.jwt.demo.config.TokenProvider;
import com.jwt.demo.model.AuthToken;
import com.jwt.demo.model.ParseToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nidura on 2018-10-18.
 */
@RestController
@RequestMapping("/token")
public class AuthenticationController {

    @Autowired
    private TokenProvider tokenProvider;

    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
    public ResponseEntity<?> register(@RequestBody ParseToken parseToken) throws AuthenticationException {
        String token = tokenProvider.generateToken(parseToken);
        SecurityContextHolder.getContext().setAuthentication(tokenProvider.getAuthentication(token));

        return ResponseEntity.ok(new AuthToken(token));
    }

}
