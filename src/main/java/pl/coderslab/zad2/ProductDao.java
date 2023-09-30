package pl.coderslab.zad2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ProductDao {

    public List<Product> getList() {
        List<Product> productList = new ArrayList<>();
        Random rand = new Random();
        productList.add(new Product(1L,"prod" + rand.nextInt(10), rand.nextDouble()));
        productList.add(new Product(2L,"prod" + rand.nextInt(10), rand.nextDouble()));
        productList.add(new Product(3L,"prod" + rand.nextInt(10), rand.nextDouble()));
        productList.add(new Product(4L,"prod" + rand.nextInt(10), rand.nextDouble()));
        productList.add(new Product(5L,"prod" + rand.nextInt(10), rand.nextDouble()));
        productList.add(new Product(6L,"prod" + rand.nextInt(10), rand.nextDouble()));
        return productList;
    }
}
