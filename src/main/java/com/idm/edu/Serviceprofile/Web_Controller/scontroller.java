package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.s;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class scontroller {
    @GetMapping("s")
    public s gets() {
        s s = new s();
        s.setBoyname("KAMAL");
        s.setGirlname("NAYANA");

        return s;
    }
}

