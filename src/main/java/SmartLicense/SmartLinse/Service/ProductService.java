package SmartLicense.SmartLinse.Service;

import SmartLicense.SmartLinse.Model.Product;
import SmartLicense.SmartLinse.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;


    public Product getProductById(int id){

        return repository.findById(id).orElse(null);
    }
    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public  List<Product> saveProducts(List<Product> products){
        return  repository.saveAll(products);
    }

    public  String deleteProduct(int id){
        repository.deleteById(id);
        return "Product has been deleted!" + id;
    }

    public  Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setId(product.getId());
        existingProduct.setName(product.getName());
        existingProduct.setQuality(product.getQuality());
        existingProduct.setQuantity(product.getQuantity());
        return saveProduct(existingProduct);
    }
}
