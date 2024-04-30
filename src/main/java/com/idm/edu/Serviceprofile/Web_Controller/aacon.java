package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.aa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("aa")
public class aacon {
    @GetMapping("aa")
    public List<aacon> getAllProfiles() {
        return new ArrayList<>();
    }

    @GetMapping({"byId/{id}"})
    public aacon getById() {
        return new aacon();
    }
}
