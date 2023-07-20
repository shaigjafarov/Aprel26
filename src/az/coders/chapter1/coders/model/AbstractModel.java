package az.coders.chapter1.coders.model;

import az.coders.chapter1.coders.enums.SateteEnum;

import java.time.LocalDateTime;

public class AbstractModel {


     LocalDateTime createdAt;

     SateteEnum state;


     public LocalDateTime getCreatedAt() {
          return createdAt;
     }

     public void setCreatedAt(LocalDateTime createdAt) {
          this.createdAt = createdAt;
     }

     public SateteEnum getState() {
          return state;
     }

     public void setState(SateteEnum state) {
          this.state = state;
     }
}
