package SmartLicense.SmartLinse.Controller;

import SmartLicense.SmartLinse.Model.Boat;
import SmartLicense.SmartLinse.Service.BoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(allowedHeaders ="*", origins = "*")

public class BoatController {
    @Autowired
    private BoatService boatService;

    @PostMapping("/addBoat")
   public  Boat addBoat(@RequestBody Boat boat){

        return boatService.saveBoat(boat);
   }
   @PostMapping("/addBoats")
   public List<Boat> addBoats(@RequestBody List<Boat> boats){

        return  boatService.saveBoats(boats);
   }
   @GetMapping("/boats")
   public  List<Boat> findBoats(){

        return boatService.getBoats();
   }
    @GetMapping("/boat/{id}")
    public Boat findById(@PathVariable int id){
        return boatService.getBoatById(id);
    }
     @PutMapping("/update/{id}")
    public Boat updateBoat(@RequestBody Boat boat){

        return boatService.updateBoat(boat);
    }
    @DeleteMapping("/delete/{id}")
    public  String deleteBoat(@PathVariable int id){
        return  boatService.deleteBoat(id);
    }

}
