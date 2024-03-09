package com.example.eventmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.eventmanagementsystem.service.EventJpaService;

import java.util.ArrayList;
import java.util.List;

import com.example.eventmanagementsystem.model.Event;
import com.example.eventmanagementsystem.model.Sponsor;

@RestController

// Write your code here
public class EventController {

    @Autowired
    private EventJpaService ejs;

    @GetMapping("/events")
    public ArrayList<Event> getEvents() {
        return ejs.getEvents();
    }

    @GetMapping("/events/{eventId}")
    public Event getEventById(@PathVariable("eventId") int eventId) {
        return ejs.getEventById(eventId);
    }

    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event) {
        return ejs.addEvent(event);
    }

    @PutMapping("/events/{eventId}")
    public Event updateEvent(@PathVariable("eventId") int eventId, @RequestBody Event event) {
        return ejs.updateEvent(eventId, event);
    }

    @DeleteMapping("/events/{eventId}")
    public void deleteEvent(@PathVariable("eventId") int eventId) {
        ejs.deleteEvent(eventId);
    }

    @GetMapping("/events/{eventId}/sponsors")
    public List<Sponsor> getEventSponsors(@PathVariable("eventId") int eventId) {
        return ejs.getEventSponsors(eventId);
    }

}
