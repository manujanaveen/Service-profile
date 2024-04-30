package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.p;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pcontroller {
    @GetMapping("p")
    public p getp() {
        p p = new p();
        p.setTree_name("Mango Tree");
        p.setTree_size("20 m");

        return p;
    }
}
