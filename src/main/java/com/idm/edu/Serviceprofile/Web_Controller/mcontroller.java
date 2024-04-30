package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.m;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mcontroller {
    @GetMapping("m")
    public m getdm() {
        m m = new m();
        m.setCompanyname("Uniliver");
        m.setLocation("Horana");

        return m;
    }
}
