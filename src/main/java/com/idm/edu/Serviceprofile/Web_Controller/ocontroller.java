package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.o;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ocontroller {
    @GetMapping("o")
    public o getn() {
        o o = new o();
        o.setCricket_team("South Africa");
        o.setScore("345");

        return o;
    }
}
