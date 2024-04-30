package com.idm.edu.Serviceprofile.Web_Controller;
import com.idm.edu.Serviceprofile.module.dto.c;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ccontroller {
    @GetMapping("c")
    public c getc() {
        c c = new c();
        c.setLaptop("HP");
        c.setMobilephone("Samsung");

        return c;
    }
}
