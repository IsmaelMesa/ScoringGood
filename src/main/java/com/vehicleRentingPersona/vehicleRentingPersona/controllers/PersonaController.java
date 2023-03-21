package com.vehicleRentingPersona.vehicleRentingPersona.controllers;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequestApiValidationException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequiredMissingFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;
import com.vehicleRentingPersona.vehicleRentingPersona.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/persona")
    ResponseEntity addPersona(@RequestBody Persona persona){

        try{
            this.personaService.addPersona(persona);
        } catch (RequestApiValidationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Compruebe los datos de entrada");
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }
        return ResponseEntity.ok(persona);
    }


}
