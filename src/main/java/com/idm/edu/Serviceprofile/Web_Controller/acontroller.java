package com.idm.edu.Serviceprofile.Web_Controller;


import com.idm.edu.Serviceprofile.module.dto.a;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class acontroller {


    @GetMapping("a")
    public a geta() {
        a a = new a();
        a.setName("Gotabaya");
        a.setAddress("SRI LANKA");
        a.setMobileNumber("071-2830603");
return a;
    }

}