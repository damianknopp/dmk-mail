package dmk.mail;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MailSenderServiceDefaultImplTest {
	Logger logger = LoggerFactory.getLogger(MailSenderServiceDefaultImplTest.class);

	
	MailSenderService mailService;
	
	@Before
	public void init(){
		mailService = new MailSenderServiceDefaultImpl();
	}
	
	@Test
	public void sanity(){
		String msg = "JUnit says hi.";
		String recipients = "xxx.xxx@xxx.xxx";
		
		mailService.send("test subject", msg, recipients);
	}
}
