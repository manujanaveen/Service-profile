package com.idm.edu.Serviceprofile.Web_Controller;
import com.idm.edu.Serviceprofile.module.dto.b;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class bcontroller {

    @GetMapping("b")
    public b getb() {
        b b = new b();
        b.setCity("Mexico");
        b.setCountry("Russia");
        b.setReligion("christian");
        return b;
    }

}