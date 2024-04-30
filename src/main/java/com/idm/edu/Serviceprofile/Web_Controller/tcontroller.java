package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.t;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tcontroller {
    @GetMapping("t")
    public t gett() {
        t t = new t();
        t.setUniversity("IDM");
        t.setBranch("Matara");

        return t;
    }
}

