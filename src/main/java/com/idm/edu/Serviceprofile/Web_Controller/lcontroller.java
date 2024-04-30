package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.l;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lcontroller {
    @GetMapping("l")
    public l getdl() {
        l l = new l();
        l.setBrothername("Thisaja");
        l.setSistername("Tenuji");

        return l;
    }

}
