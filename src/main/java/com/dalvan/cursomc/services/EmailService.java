package com.dalvan.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.dalvan.cursomc.domain.Cliente;
import com.dalvan.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
