package com.mps.think.setup.utils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.util.ByteArrayDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class MailTemplateUtils {
	
	@Autowired
	private Environment env;
	
public void sendMailToCus(String emailFrom,String emailTo,String emailCC,String emailSubject,String emailContent) throws AddressException, MessagingException  {
		
		Properties props = new Properties();
		props.put("mail.smtp.host", env.getProperty("MAIL_SMTP_HOST"));
		Session session = Session.getDefaultInstance(props);
		
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(emailFrom.trim()));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo.trim()));
		if (!emailCC.trim().isEmpty()) {
			message.addRecipient(Message.RecipientType.CC, new InternetAddress(emailCC.trim()));
		}
		
		String subject = emailSubject;
		String content = emailContent;
//				"<p>Hello,</p>"
//						+ "This is your first time password.\n " + generatedPassword;
		
		message.setSubject(subject, "UTF-8");
		message.setContent(content, "text/html; charset=utf-8");
		Transport.send(message);
		
	}

//public void sendMailWithAttachment(String emailFrom,String emailTo,String emailCC,String emailSubject,String emailContent,String fileName,byte[] fileData) throws AddressException, MessagingException, IOException  {
//	
//	Properties props = new Properties();
//	props.put("mail.smtp.host", env.getProperty("MAIL_SMTP_HOST"));
//	Session session = Session.getDefaultInstance(props);
//	
//	MimeMessage message = new MimeMessage(session);
//	message.setFrom(new InternetAddress(emailFrom.trim()));
//	message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo.trim()));
//	if (!emailCC.trim().isEmpty()) {
//		message.addRecipient(Message.RecipientType.CC, new InternetAddress(emailCC.trim()));
//	}
//	
//	String subject = emailSubject;
//	String content = emailContent;
////	File myfile=file;
////			"<p>Hello,</p>"
////					+ "This is your first time password.\n " + generatedPassword;
//	
//	message.setSubject(subject, "UTF-8");
//	MimeBodyPart textBody=new MimeBodyPart();
//	textBody.setText(content);
////	MimeBodyPart attachment=new MimeBodyPart();
////	attachment.attachFile(file.getOriginalFilename());
////	MimeMultipart mimeMultipart=new MimeMultipart();
////	mimeMultipart.addBodyPart(textBody);
////	mimeMultipart.addBodyPart(attachment);
////	message.setContent(mimeMultipart, "text/html; charset=utf-8");
//	 if (fileName != null && fileData != null) {
//		 message.addAttachment(fileName, new ByteArrayResource(fileData));
//     }
//	Transport.send(message);
//	
//}



public void sendMailWithAttachment(String emailFrom, String emailTo, String emailCC, String emailSubject, String emailContent, String fileName, byte[] fileData) throws AddressException, MessagingException, IOException {

    Properties props = new Properties();
    props.put("mail.smtp.host", env.getProperty("MAIL_SMTP_HOST"));
    Session session = Session.getDefaultInstance(props);

    MimeMessage message = new MimeMessage(session);
    message.setFrom(new InternetAddress(emailFrom.trim()));
    message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo.trim()));
    if (!emailCC.trim().isEmpty()) {
        message.addRecipient(Message.RecipientType.CC, new InternetAddress(emailCC.trim()));
    }

    String subject = emailSubject;
    String content = emailContent;

    message.setSubject(subject, "UTF-8");
    MimeBodyPart textBody = new MimeBodyPart();
    textBody.setText(content);

    MimeMultipart mimeMultipart = new MimeMultipart();
    mimeMultipart.addBodyPart(textBody);

    if (fileName != null && fileData != null) {
        DataSource dataSource = new ByteArrayDataSource(fileData, "application/octet-stream");
        MimeBodyPart attachment = new MimeBodyPart();
        attachment.setDataHandler(new DataHandler(dataSource));
        attachment.setFileName(fileName);
        mimeMultipart.addBodyPart(attachment);
    }

    message.setContent(mimeMultipart);

    Transport.send(message);
}

}
