package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.f;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fcontroller {

    @GetMapping("f")
    public f getf() {
        f f = new f();
        f.setColour("Blue");
        f.setBrand("Maltilac");

        return f;
    }
}
