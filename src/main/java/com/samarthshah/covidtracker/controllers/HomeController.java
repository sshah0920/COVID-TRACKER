package com.samarthshah.covidtracker.controllers;

import com.samarthshah.covidtracker.models.LocStat;
import com.samarthshah.covidtracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/")
    public String homepage(Model model) {
       List<LocStat> allStats = covidDataService.getAllStats();
       int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getCurrentTotal()).sum();
       model.addAttribute("locationStats", allStats);
       model.addAttribute("totalReportedCases", totalReportedCases);

       return "homepage";
    }

}
