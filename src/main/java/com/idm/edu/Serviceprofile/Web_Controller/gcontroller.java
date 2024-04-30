package com.idm.edu.Serviceprofile.Web_Controller;
import com.idm.edu.Serviceprofile.module.dto.g;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class gcontroller {

    @GetMapping("g")
    public g getg() {
        g g = new g();
        g.setChannel("ITN");
        g.setTime(" 8.00 PM ");
        g.setProgramme("Thathparayak Denna");
        return g;
    }

}