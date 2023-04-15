package test.BusinessCalculationService.Models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import test.BusinessCalculationService.Interfaces.DataService;

@Component
@Qualifier("con")
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{10, 20, 30, 40, 50, 60};
    }
}
