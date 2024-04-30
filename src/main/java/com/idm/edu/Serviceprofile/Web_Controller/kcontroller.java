package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.k;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kcontroller {
    @GetMapping("k")
    public k getj() {
        k k = new k();
        k.setLecture("Advance Programming");
        k.setLecture_Name("ISURU JAYAKODI");

        return k;
    }
}
