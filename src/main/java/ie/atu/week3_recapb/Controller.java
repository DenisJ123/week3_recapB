package ie.atu.week3_recapb;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/storage")
public class Controller {
    private List<Product> products = new ArrayList<>();
    Service service = new Service();

    @GetMapping("/get")
    public List<Product> getProducts() {
        return service.getProductList();
    }

    @PostMapping("/add")
    public String addProduct(@Valid @RequestBody Product product) {
        products.add(product);
        return service.addProduct(product);
    }
}