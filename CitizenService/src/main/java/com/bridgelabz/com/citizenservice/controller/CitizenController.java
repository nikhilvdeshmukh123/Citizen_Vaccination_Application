package com.bridgelabz.com.citizenservice.controller;

import com.bridgelabz.com.citizenservice.entity.Citizen;
import com.bridgelabz.com.citizenservice.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    private CitizenRepository citizenRepository;

    // To test Api working or not
    @RequestMapping(path = "/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    // to get citizen by vaccination center id
    @RequestMapping(path = "/id/{id}")
    public ResponseEntity<java.util.List<Citizen>> getById(@PathVariable Integer id){
        List<Citizen> listCitizen = citizenRepository.findByVaccinationCenterId(id);
        return new ResponseEntity<>(listCitizen, HttpStatus.OK);
    }

    // To add citizen to database
    @PostMapping(path = "/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){
        Citizen citizen = citizenRepository.save(newCitizen);
        return new ResponseEntity<>(citizen, HttpStatus.OK);
    }

}
