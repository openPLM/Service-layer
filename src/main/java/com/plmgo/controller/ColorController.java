package com.plmgo.controller;


import com.plmgo.model.Color;
import com.plmgo.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ColorController {

    @Autowired
    ColorRepository colorRepo;

    @GetMapping("/colors")
    public ResponseEntity<Object> getAllColors() {
        List<Color> colors = colorRepo.findAll();
        return  new ResponseEntity<Object>(colors, HttpStatus.OK);
    }
}
