package com.raf.br.EmailAPI.consumers;

import com.raf.br.EmailAPI.dto.EmailDTO;
import com.raf.br.EmailAPI.models.Email;
import com.raf.br.EmailAPI.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDTO emailDTO){
        Email email = new Email();
        BeanUtils.copyProperties(emailDTO, email);
        emailService.sendEmail(email);
        System.out.println("Email Status: "+ email.getStatusEmail().toString());
    }
}
