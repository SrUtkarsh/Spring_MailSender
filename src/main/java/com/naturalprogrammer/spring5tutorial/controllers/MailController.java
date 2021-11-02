package com.naturalprogrammer.spring5tutorial.controllers;

import com.naturalprogrammer.spring5tutorial.mail.MailSender;
import com.naturalprogrammer.spring5tutorial.mail.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {


    private MailSender mailSender;

    public MailController(MailSender mock)
    {
        this.mailSender = mock;
    }



    @RequestMapping("/mail")
    public String mail() throws MessagingException {
mailSender.send(" sutkarsh213@example.com"," A test mail"," Body of the mail");
        return "Mail Sent";
}

}
