package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.e;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class econtroller {

    @GetMapping("e")
    public e gete() {
        e e = new e();
        e.setMothername("Nilanthi");
        e.setFathername("Nimal");

        return e;
    }
}
