package ie.atu.week3_recapb;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Service {
    private List<Product> productList = new ArrayList<>();

    public String addProduct(Product product) {
        productList.add(product);
        return "Product added";
    }


}


