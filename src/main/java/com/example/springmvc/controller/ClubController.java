package com.example.springmvc.controller;


import com.example.springmvc.model.ClubModel;
import com.example.springmvc.service.ClubService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ClubController {

    private Logger log = LoggerFactory.getLogger(ClubController.class);
    private ClubService service;

    @Autowired
    public ClubController(ClubService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("message", "Fuck u boyz");

        return "index.html";
    }

    @PostMapping("/club/new")
    public String newClub(@ModelAttribute("club") ClubModel club) {

        service.addClub(club);

        return "redirect:/";
    }

//    @GetMapping("/club/get/{id}")
//    public String getClub(@PathVariable("id") Long id, Model model){
//
//        Optional<ClubModel> retrievedClub = service.getClub(id);
//
//        model.addAttribute("clubName", retrievedClub.get().getTitle());
//        model.addAttribute("clubContent", retrievedClub.get().getContent());
//        model.addAttribute("photoURL", retrievedClub.get().getPhotoURL());
//
//        log.info("retrieved club: " + retrievedClub.get().getPhotoURL());
//
//        return "allClubs.html";
//    }
//

    @GetMapping("/get/clubs")
    public String getClubs(Model model){

        List<ClubModel> allClubs = service.getAllClubs();
        model.addAttribute("clubs", allClubs);

        return "allClubs.html";
    }



}
