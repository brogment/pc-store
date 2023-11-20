package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        OutsourcedPart o= new OutsourcedPart();
//        o.setCompanyName("Western Governors University");
//        o.setName("out test");
//        o.setInv(5);
//        o.setPrice(20.0);
//        o.setId(100L);
//        outsourcedPartRepository.save(o);
//        OutsourcedPart thePart=null;
//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            if(part.getName().equals("out test"))thePart=part;
//        }
//        System.out.println(thePart.getCompanyName());
//
//       List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//       for(OutsourcedPart part:outsourcedParts){
//           System.out.println(part.getName()+" "+part.getCompanyName());
//       }
//
//
//       System.out.println("Started in Bootstrap");
//       System.out.println("Number of Products"+productRepository.count());
//       System.out.println(productRepository.findAll());
//       System.out.println("Number of Parts"+partRepository.count());
//       System.out.println(partRepository.findAll());

        if (productRepository.count() == 0 && outsourcedPartRepository.count() == 0) {

            OutsourcedPart newGPU = new OutsourcedPart("7900 XT", 800.0, 4, "AMD", 10, 0);
            OutsourcedPart oldGPU = new OutsourcedPart("GTX 1660", 150.0, 8, "NVIDIA", 10, 0);
            OutsourcedPart ddr4 = new OutsourcedPart("8GB Ram", 50.0, 10, "Corsair", 10, 0);
            OutsourcedPart storage = new OutsourcedPart("2TB SSD", 200.0, 6, "Samsung", 10, 0);
            OutsourcedPart soundCard = new OutsourcedPart("Sound Blaster", 139.0, 5, "Creative Labs", 10, 0);
            outsourcedPartRepository.save(newGPU);
            outsourcedPartRepository.save(oldGPU);
            outsourcedPartRepository.save(ddr4);
            outsourcedPartRepository.save(storage);
            outsourcedPartRepository.save(soundCard);

            Product gamingPC= new Product(100L, "Gaming PC",3500.0,5);
            Product officePC= new Product(101L, "Office PC",500.0,7);
            Product highEndLaptop = new Product(102L, "Alienware Laptop",1600.0,4);
            Product budgetLaptop = new Product(103L, "Thinkpad Laptop",200.0,10);
            Product videoWorkstation= new Product(104L, "Video Editing PC",5000.0,2);
            productRepository.save(gamingPC);
            productRepository.save(officePC);
            productRepository.save(highEndLaptop);
            productRepository.save(budgetLaptop);
            productRepository.save(videoWorkstation);
        }

    }
}
