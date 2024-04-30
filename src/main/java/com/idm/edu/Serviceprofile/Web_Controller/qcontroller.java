package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.q;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class qcontroller {
    @GetMapping("q")
    public q getq() {
        q q = new q();
        q.setVechicle("BMW");
        q.setYear("2023");

        return q;
    }
}

