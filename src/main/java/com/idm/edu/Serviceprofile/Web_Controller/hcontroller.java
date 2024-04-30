package com.idm.edu.Serviceprofile.Web_Controller;
import com.idm.edu.Serviceprofile.module.dto.h;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class hcontroller {

    @GetMapping("h")
    public h geth() {
        h h = new h();
        h.setRice("SAMBA");
        h.setBiscut(" NICE");
        h.setBread("PRIMA");
        return h;
    }

}