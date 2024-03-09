package com.example.eventmanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.eventmanagementsystem.model.Sponsor;
import com.example.eventmanagementsystem.model.Event;

// Write your code here
public interface SponsorRepository {
  ArrayList<Sponsor> getSponsors();

  Sponsor getSponsorById(int sponsorId);

  Sponsor addSponsor(Sponsor sponsor);

  Sponsor updateSponsor(int SponsorId, Sponsor sponsor);

  void deleteSponsor(int sponsorId);

  List<Event> getSponsorEvents(int sponsorId);
}