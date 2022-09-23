package SmartLicense.SmartLinse.Service;

import SmartLicense.SmartLinse.Model.Boat;
import SmartLicense.SmartLinse.Repository.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoatService {

    @Autowired
    private BoatRepository boatRepository;

    public Boat saveBoat(Boat boat){


        return boatRepository.save(boat);
    }
    public List<Boat> saveBoats(List<Boat> boats){
        return boatRepository.saveAll(boats);
    }

    public Boat getBoatById(int id){
        return boatRepository.findById(id).orElse(null);
    }
    public List<Boat> getBoats(){
        return boatRepository.findAll();
    }

    public String deleteBoat(int id){
        boatRepository.deleteById(id);
        return "Boat has been removed"+ id;
    }

    public  Boat updateBoat(Boat boat){
        Boat existingBoat = boatRepository.findById(boat.getId()).orElse(null);
        existingBoat.setBoatName(boat.getBoatName());
        existingBoat.setBoatType(boat.getBoatType());
        existingBoat.setBoatSize(boat.getBoatSize());
        existingBoat.setStandOfBoat(boat.getStandOfBoat());
        existingBoat.setDate(boat.getDate());
        return boatRepository.save(existingBoat);
    }
}
