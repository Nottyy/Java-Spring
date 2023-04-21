package demo.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping("/currency-config")
    public CurrencyServiceConfiguration retrieveCourses(){
        return this.currencyServiceConfiguration;
    }
}
