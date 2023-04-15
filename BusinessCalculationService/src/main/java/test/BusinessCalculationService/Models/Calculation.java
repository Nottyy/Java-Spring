package test.BusinessCalculationService.Models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import test.BusinessCalculationService.Interfaces.DataService;

import java.util.Arrays;

@Component
public class Calculation {
    private DataService dataService;

    public Calculation(@Qualifier("con") DataService dataService){
        this.dataService = dataService;
    }

    public int getMax(){
        return Arrays.stream(this.dataService.retrieveData()).max().orElse(0);
    }
}
