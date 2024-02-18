package test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("splitText.xml");

		/* For webserviceCalling.xml  and sqlDatabase
		Gateway gateway = (Gateway) ctx.getBean("gateway");
		gateway.sendMessage("Hello World");*/


	}

}
 