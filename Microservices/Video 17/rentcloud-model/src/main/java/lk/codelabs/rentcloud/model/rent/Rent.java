package lk.codelabs.rentcloud.model.rent;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 04:00
 * @Project rentcloudmodel
 */
@Entity
@Table(name = "rent")
@Data
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rentId;
    int customerId;

    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public LocalDateTime getRentFrom() {
        return rentFrom;
    }

    public void setRentFrom(LocalDateTime rentFrom) {
        this.rentFrom = rentFrom;
    }

    public LocalDateTime getRentTill() {
        return rentTill;
    }

    public void setRentTill(LocalDateTime rentTill) {
        this.rentTill = rentTill;
    }

    public int getCurrentOdometer() {
        return currentOdometer;
    }

    public void setCurrentOdometer(int currentOdometer) {
        this.currentOdometer = currentOdometer;
    }

    public String getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(String returnLocation) {
        this.returnLocation = returnLocation;
    }

    int vehicleId;
    LocalDateTime rentFrom;
    LocalDateTime rentTill;
    int currentOdometer;
    String returnLocation;

}
