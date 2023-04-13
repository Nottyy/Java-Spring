package example.DependencyInjectionExercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{

	private Dependency1 dep1;
	private Dependency2 dep2;

	public YourBusinessClass(Dependency1 dep1, Dependency2 dep2){
		this.dep1 = dep1;
		this.dep2 = dep2;
	}

	@Override
	public String toString() {
		return "Using " + dep1.getClass().getSimpleName() + " and " + dep2.getClass().getSimpleName();
	}
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}
@SpringBootApplication
public class DependencyInjectionExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionExerciseApplication.class, args);

		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionExerciseApplication.class)){
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		}

	}

}
