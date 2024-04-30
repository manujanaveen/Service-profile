package com.idm.edu.Serviceprofile.Web_Controller;

import com.idm.edu.Serviceprofile.module.dto.FacebookCommentDto;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("comment")
public class FacebookCommentController {


    @PostMapping()
    public FacebookCommentDto createcomment(@RequestBody FacebookCommentDto FacebookCommentdto) {
        return new FacebookCommentDto();

    }
    @GetMapping("*/all")
    public List<FacebookCommentDto> getAllComment(){

        return new ArrayList<>();
    }

    @GetMapping("/*id")
    public FacebookCommentDto getById(@PathVariable long id){

        return new FacebookCommentDto();
    }

    @PutMapping("*/{id}") {
        public FacebookCommentDto updateComment{@PathVariable long id,(@RequestBody FacebookCommentdto FacebookCommentDto){
                return FacebookCommentDto;
            }
        }
    }
    }

