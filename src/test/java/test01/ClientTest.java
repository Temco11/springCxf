package test01;

import java.util.List;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.yncmcc.com.bean.Person;
import org.yncmcc.com.service.PersonService;

public class ClientTest {
	public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(PersonService.class);
        factory.setAddress("http://localhost:8080/hello/person");
        PersonService service = (PersonService)factory.create();
        List<Person> list = (List<Person>)service.findAll("уе");
        for(Person person : list) {
            System.out.println("name=" + person.getName());
            System.out.println("age=" + person.getAge());
        }
    }
}
