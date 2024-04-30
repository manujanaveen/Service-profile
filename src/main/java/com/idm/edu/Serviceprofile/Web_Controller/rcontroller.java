package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.r;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rcontroller {
    @GetMapping("r")
    public r getr() {
        r r = new r();
        r.setPhotographer("NAVI PHOTOGRAPHY");
        r.setRent("RS.25,000.00");

        return r;
    }
}

