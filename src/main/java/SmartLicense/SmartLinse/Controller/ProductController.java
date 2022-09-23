package SmartLicense.SmartLinse.Controller;

import SmartLicense.SmartLinse.Model.Product;
import SmartLicense.SmartLinse.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/Products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @PostMapping("/addProduct")
    public  Product addProduct(@RequestBody Product product){

        return  service.saveProduct(product);
    }
    @GetMapping("/getProduct/{id}")
    public  Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }
    @DeleteMapping("deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return  service.updateProduct(product);
    }


}
