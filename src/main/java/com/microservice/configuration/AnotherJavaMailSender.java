package com.microservice.configuration;

import com.starter.conditionals.SubstituteDefaultExceptionMessageSender;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;

import javax.mail.internet.MimeMessage;
import java.io.InputStream;

public class AnotherJavaMailSender implements JavaMailSender {

    @Override
    public MimeMessage createMimeMessage() {
        return null;
    }

    @Override
    public MimeMessage createMimeMessage(InputStream inputStream) throws MailException {
        return null;
    }

    @Override
    public void send(MimeMessage mimeMessage) throws MailException {
        System.out.println("Sender - another implementation");
    }

    @Override
    public void send(MimeMessage... mimeMessages) throws MailException {
        System.out.println("Sender - another implementation");
    }

    @Override
    public void send(MimeMessagePreparator mimeMessagePreparator) throws MailException {
        System.out.println("Sender - another implementation");
    }

    @Override
    public void send(MimeMessagePreparator... mimeMessagePreparators) throws MailException {
        System.out.println("Sender - another implementation");
    }

    @Override
    public void send(SimpleMailMessage simpleMailMessage) throws MailException {
        System.out.println("Sender - another implementation");
    }

    @Override
    public void send(SimpleMailMessage... simpleMailMessages) throws MailException {
        System.out.println("Sender - another implementation");
    }
}
