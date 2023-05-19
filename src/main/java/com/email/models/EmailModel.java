package com.email.models;

import java.time.LocalDateTime;
import java.util.UUID;

import com.email.Enum.StatusEmail;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_email")
public class EmailModel {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID emailId;
	private String ownerRef;
	private String emailFrom;
	private String emailTo;
	private String subject;
	@Column(columnDefinition = "TEXT")
	private String text;
	private LocalDateTime sendDateEmail;
	private StatusEmail stausEmail;

	public EmailModel() {
	}

	public EmailModel(UUID emailId, String ownerRef, String emailFrom, String emailTo, String subject, String text,
			LocalDateTime sendDateEmail, StatusEmail stausEmail) {
		this.emailId = emailId;
		this.ownerRef = ownerRef;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.text = text;
		this.sendDateEmail = sendDateEmail;
		this.stausEmail = stausEmail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UUID getEmailId() {
		return emailId;
	}

	public String getOwnerRef() {
		return ownerRef;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public String getText() {
		return text;
	}

	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}

	public StatusEmail getStausEmail() {
		return stausEmail;
	}

	public void setStatusEmail(StatusEmail status) {
		this.stausEmail = status;
	}

	public void setSendDateEmail(LocalDateTime dateTime) {
		this.sendDateEmail = dateTime;
	}
}
