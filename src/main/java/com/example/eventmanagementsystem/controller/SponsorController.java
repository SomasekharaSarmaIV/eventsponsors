/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here

package com.example.eventmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.eventmanagementsystem.service.SponsorJpaService;

import java.util.ArrayList;
import java.util.List;

import com.example.eventmanagementsystem.model.Event;
import com.example.eventmanagementsystem.model.Sponsor;

@RestController

// Write your code here
public class SponsorController {

    @Autowired
    private SponsorJpaService ejs;

    @GetMapping("/events/sponsors")
    public ArrayList<Sponsor> getSponsors() {
        return ejs.getSponsors();
    }

    @GetMapping("/events/sponsors/{sponsorId}")
    public Sponsor getSponsorById(@PathVariable("sponsorId") int sponsorId) {
        return ejs.getSponsorById(sponsorId);
    }

    @PostMapping("/events/sponsors")
    public Sponsor addSponsor(@RequestBody Sponsor sponsor) {
        return ejs.addSponsor(sponsor);
    }

    @PutMapping("/events/sponsors/{sponsorId}")
    public Sponsor updateSponsor(@PathVariable("sponsorId") int sponsorId, @RequestBody Sponsor sponsor) {
        return ejs.updateSponsor(sponsorId, sponsor);
    }

    @DeleteMapping("/events/sponsors/{sponsorId}")
    public void deleteSponsor(@PathVariable("sponsorId") int sponsorId) {
        ejs.deleteSponsor(sponsorId);
    }

    @GetMapping("/sponsors/{sponsorId}/events")
    public List<Event> getSponsorEvents(@PathVariable("sponsorId") int sponsorId) {
        return ejs.getSponsorEvents(sponsorId);
    }

}
