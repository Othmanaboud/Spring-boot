package SmartLicense.SmartLinse.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Boat_tb")
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String boatName;
    private  String boatType;
    private String boatSize;
    private String standOfBoat;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public String getBoatType() {
        return boatType;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    public String getBoatSize() {
        return boatSize;
    }

    public void setBoatSize(String boatSize) {
        this.boatSize = boatSize;
    }

    public String getStandOfBoat() {
        return standOfBoat;
    }

    public void setStandOfBoat(String standOfBoat) {
        this.standOfBoat = standOfBoat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
