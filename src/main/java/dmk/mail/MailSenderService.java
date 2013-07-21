package dmk.mail;

public interface MailSenderService {

	public void send(String subject, String content, String... recipients);
}
