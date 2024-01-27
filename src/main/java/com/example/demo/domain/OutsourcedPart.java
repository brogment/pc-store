package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class OutsourcedPart extends Part{
String companyName;

    public OutsourcedPart() {
    }

    public OutsourcedPart( String name, double price, int inv, String companyName, int maxInv, int minInv) {
      super(name, price, inv, maxInv, minInv);
      this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
