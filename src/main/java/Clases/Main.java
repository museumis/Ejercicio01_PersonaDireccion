package Clases;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("contexto-bean.xml");
		Persona p = (Persona) appContext.getBean("persona1");
		System.out.println(p);
	
	}

}
