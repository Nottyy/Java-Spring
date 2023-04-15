package test.BusinessCalculationService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.BusinessCalculationService.Models.Calculation;

@SpringBootApplication
public class BusinessCalculationServiceApplication {

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(BusinessCalculationServiceApplication.class)) {
            int max = ctx.getBean(Calculation.class).getMax();
            System.out.println(max);
        }
    }
}
