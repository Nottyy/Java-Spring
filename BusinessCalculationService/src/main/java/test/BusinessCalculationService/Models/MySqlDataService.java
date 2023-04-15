package test.BusinessCalculationService.Models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import test.BusinessCalculationService.Interfaces.DataService;

@Component
@Primary
public class MySqlDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    }
}
