package com.emailtest.tast.controller;

import com.emailtest.tast.dto.EmailRequestDto;
import com.emailtest.tast.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/login/mailConfirm")
    public String mailConfirm(@RequestBody EmailRequestDto email) throws Exception {
        String code = emailService.sendSimpleMessage(email.getEmail());
        log.info("인증코드 : " + code);
        return code;
    }
}

