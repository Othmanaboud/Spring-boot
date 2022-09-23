package SmartLicense.SmartLinse.Controller;

import SmartLicense.SmartLinse.Model.Liencense;
import SmartLicense.SmartLinse.Service.LiecenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController


@CrossOrigin(origins = "*")

public class LiencenseController {

    @Autowired

    private LiecenseService liecenseService;

    @PostMapping("/addLiencense")
    public Liencense addLiencense(@RequestBody Liencense liencense){
        return liecenseService.saveLiencence(liencense);
    }
    @PostMapping("/addLiencenses")
    public List<Liencense> addLiencenses (@RequestBody List<Liencense> liencenses){
        return liecenseService.saveLiencenses(liencenses);
    }
    @GetMapping("/liencense")
    public  List<Liencense> findAllLiencense(){
        return liecenseService.getLiencenes();
    }
    @GetMapping("/getLiecense/{id}")

    public Optional<Liencense> findLienenseById(@PathVariable int id){
        return  liecenseService.getLiencenseById(id);
    }

    @DeleteMapping("/deleteLiecense/{id}")
    public String deleteLiencense(@PathVariable int id){
        return liecenseService.deleteLiencense(id);
    }
    @PutMapping("/updateLience")
    public  Liencense updateLiencense(@RequestBody Liencense liencense){
        return liecenseService.updateLiencense(liencense);

    }


}
