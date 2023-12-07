package com.example.lab9.controller;

import com.example.lab9.model.EcoHeatBot;
import com.example.lab9.service.EcoHeatBotService;
import com.example.lab9.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @Autowired
    private EcoHeatBotService ecoHeatBotService;
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String login() {
        return "main-page";
    }


    @PostMapping("/heat-info")
    public String heatStateInfo(@RequestParam String username, @RequestParam String quantity, Model model) {

        EcoHeatBot ecoHeatBot = new EcoHeatBot();
        String heatInfo = ecoHeatBot.checkHeat(username, quantity);
        model.addAttribute("heatInfo", heatInfo);

        return "heat-info";
    }

}
