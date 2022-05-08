package amtech.at.easysped.bootstrap;

import amtech.at.easysped.repositories.CustomerRepository;
import amtech.at.easysped.repositories.RouteRepository;
import amtech.at.easysped.repositories.TrailerRepository;
import amtech.at.easysped.repositories.TruckRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final RouteRepository routeRepository;
    private final TrailerRepository trailerRepository;
    private final TruckRepository truckRepository;

    public BootStrapData(CustomerRepository customerRepository, RouteRepository routeRepository, TrailerRepository trailerRepository, TruckRepository truckRepository) {
        this.customerRepository = customerRepository;
        this.routeRepository = routeRepository;
        this.trailerRepository = trailerRepository;
        this.truckRepository = truckRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        

    }
}
