package SmartLicense.SmartLinse.Repository;

import SmartLicense.SmartLinse.Model.Liencense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LiecenseRepository extends JpaRepository<Liencense,Integer> {
}
