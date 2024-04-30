package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.profiledto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProfileController {
    @GetMapping("all")
    public String getAllprofile() {
        return "Test String";
    }

    @GetMapping("default")
    public profiledto getProfileByName() {
        profiledto profiledto = new profiledto();
        profiledto.setName("Manuja");
        profiledto.setAddress("F/195,2nd Step, Ranpokunagama, Nittambuwa");
        return profiledto;


    }

}
