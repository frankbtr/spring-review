package stereotype_annotations;

import stereotype_annotations.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.ExtraHours;
import stereotype_annotations.model.Microservice;

public class App {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        DataStructure dt = container.getBean(DataStructure.class);
        dt.getTotalHours();

        Microservice ms = container.getBean(Microservice.class);
        ms.getTotalHours();

        ExtraHours extraHours = container.getBean(ExtraHours.class);
        System.out.println("Extra hours: " + extraHours.getHours());
    }
}
