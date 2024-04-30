package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.h;
import com.idm.edu.Serviceprofile.module.dto.i;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController

    public class icontroller {

        @GetMapping("i")
        public i geti() {
            i i = new i();
            i.setCat("Kitty");
            i.setDog("Tommy");
            i.setRat("rat");
            return i;
        }

    }


