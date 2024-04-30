package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.d;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dcontroller {

    @GetMapping("d")
    public d getd() {
        d d = new d();
        d.setGrade("Grade 9");
        d.setSchool("SCC");
        d.setProvince("Western");
        return d;
    }
}
