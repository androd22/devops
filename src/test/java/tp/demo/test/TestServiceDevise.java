package tp.demo.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp.demo.model.Devise;
import tp.demo.service.ServiceDevise;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestServiceDevise {

    private ServiceDevise serviceDevise; // a tester

    @BeforeEach
    public void init(){
         serviceDevise =new ServiceDevise ();
    }

    @Test
    public void testFindAllDevises(){
         List<Devise> liste  = serviceDevise.findAllDevises();
         assertTrue(liste.size()>=2);
    }

}
