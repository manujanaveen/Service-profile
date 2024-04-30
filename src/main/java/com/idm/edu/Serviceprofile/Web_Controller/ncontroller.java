package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.n;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ncontroller {
    @GetMapping("n")
    public n getn() {
        n n = new n();
        n.setphone_model("Iphone 12pro");
        n.setcolour("Red");

        return n;
    }
}
