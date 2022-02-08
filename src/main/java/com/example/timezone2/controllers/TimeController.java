package com.example.timezone2.controllers;

import com.example.timezone2.models.TimeModel;
import com.example.timezone2.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    TimeService timeService;

    @PostMapping()
    public TimeModel guardarTime(@RequestBody TimeModel time){
        return this.timeService.guardarTime(time);
    }
}
