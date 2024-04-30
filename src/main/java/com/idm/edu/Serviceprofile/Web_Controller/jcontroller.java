package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jcontroller {
    @GetMapping("j")
    public j getj() {
        j j = new j();
        j.setLogin("NAVI");
        j.setPassword("MANUJA@1234");

        return j;
    }

}
