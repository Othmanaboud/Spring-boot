package SmartLicense.SmartLinse.Service;

import SmartLicense.SmartLinse.Model.Liencense;
import SmartLicense.SmartLinse.Repository.LiecenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LiecenseService {

    @Autowired
    private LiecenseRepository liecenseRepository;

    public Liencense saveLiencence(Liencense liencense){
        return liecenseRepository.save(liencense);
    }

    public List<Liencense> saveLiencenses(List<Liencense> liencenses){
        return liecenseRepository.saveAll(liencenses);
    }


    public List<Liencense> getLiencenes(){
        return liecenseRepository.findAll();
    }
    public Optional<Liencense> getLiencenseById(int id){
        return liecenseRepository.findById( id);
    }

    public  String deleteLiencense(int id){
        liecenseRepository.findById(id);
        return "liecense is removed!!" + id;
    }
    public  Liencense updateLiencense(Liencense liencense){
        Liencense existingLiencense = liecenseRepository.findById(liencense.getId()).orElse(null);
        existingLiencense.setZanId(liencense.getZanId());
        existingLiencense.setFirstName(liencense.getFirstName());
        existingLiencense.setLastName(liencense.getLastName());
        existingLiencense.setAddress(liencense.getAddress());
        existingLiencense.setIssudeDate(liencense.getIssudeDate());
        existingLiencense.setExpiredDate(liencense.getExpiredDate());
        return  liecenseRepository.save(existingLiencense);
    }
}
