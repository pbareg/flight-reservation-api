package org.airlines.api;

import org.airlines.bean.Airport;
import org.airlines.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pbaregal on 5/14/2019.
 */
@RestController
public class AirportAPI {

    @Autowired
    private AirportRepository airportRepo;

    @GetMapping("/airports")
    public ResponseEntity<List<Airport>> getUsers(){
      List<Airport> users= (List<Airport>) airportRepo.findAll();
    return new ResponseEntity<List<Airport>>(users,HttpStatus.OK);
    }

    @PostMapping(value = "/airport",consumes = "application/json", produces = "application/json")
    public ResponseEntity<Airport> postUser(@RequestBody Airport bean){
        Airport airport= airportRepo.save(bean);
        return new ResponseEntity<Airport>(airport,HttpStatus.OK);
    }
    @GetMapping("/airport/{airport}")
    public ResponseEntity<Airport> getUser(@PathVariable(name = "airport") String airport){
        Airport users=  airportRepo.findOne(airport);
        return new ResponseEntity<Airport>(users,HttpStatus.OK);
    }
}