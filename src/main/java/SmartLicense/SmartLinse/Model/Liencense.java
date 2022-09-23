package SmartLicense.SmartLinse.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name ="Liecense_tb")
public class Liencense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int zanId;
    private  String firstName;
    private String lastName;
    private String address;
    private String issudeDate;
    private String expiredDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZanId() {
        return zanId;
    }

    public void setZanId(int zanId) {
        this.zanId = zanId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIssudeDate() {
        return issudeDate;
    }

    public void setIssudeDate(String issudeDate) {
        this.issudeDate = issudeDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }
}
