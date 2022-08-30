package com.raf.br.EmailAPI.controller;

import com.raf.br.EmailAPI.dto.EmailDTO;
import com.raf.br.EmailAPI.models.Email;
import com.raf.br.EmailAPI.services.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/email")
public class EmailController {

    final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }
    @PostMapping
    public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDTO emailDTO){
        Email email = new Email();
        BeanUtils.copyProperties(emailDTO, email);
        emailService.sendEmail(email);
        return new ResponseEntity<>(email, HttpStatus.CREATED);

    }
}
