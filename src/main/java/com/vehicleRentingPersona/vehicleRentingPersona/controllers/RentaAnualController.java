package com.vehicleRentingPersona.vehicleRentingPersona.controllers;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequestApiValidationException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;
import com.vehicleRentingPersona.vehicleRentingPersona.models.RentaAnual;
import com.vehicleRentingPersona.vehicleRentingPersona.services.PersonaService;
import com.vehicleRentingPersona.vehicleRentingPersona.services.RentaAnualService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentaAnualController {

    RentaAnualService rentaAnualService;


    public RentaAnualController(RentaAnualService rentaAnualService) {
        this.rentaAnualService = rentaAnualService;
    }

    @PostMapping("/rentaAnual")
    ResponseEntity addRentaAnual(@RequestBody RentaAnual rentaAnual){

        rentaAnualService.addRentaAnual(rentaAnual);
        return ResponseEntity.ok(rentaAnual);
    }

}

