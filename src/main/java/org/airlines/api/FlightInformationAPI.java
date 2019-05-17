package org.airlines.api;

import org.airlines.bean.FlightInformation;
import org.airlines.repository.FlightInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pbaregal on 5/14/2019.
 */
@RestController
public class FlightInformationAPI {

    @Autowired
    private FlightInformationRepository flightRepo;

    @GetMapping("/flights")
    public ResponseEntity<List<FlightInformation>> getUsers(){
      List<FlightInformation> users= (List<FlightInformation>) flightRepo.findAll();
    return new ResponseEntity<List<FlightInformation>>(users,HttpStatus.OK);
    }

    @PostMapping(value = "/flight",consumes = "application/json", produces = "application/json")
    public ResponseEntity<FlightInformation> postUser(@RequestBody FlightInformation bean){
        FlightInformation user= flightRepo.save(bean);
        return new ResponseEntity<FlightInformation>(user,HttpStatus.OK);
    }
    @GetMapping("/flight/{flight}")
    public ResponseEntity<FlightInformation> getUser(@PathVariable(name = "flight") String flight){
        FlightInformation users= flightRepo.findOne(flight);
        return new ResponseEntity<FlightInformation>(users,HttpStatus.OK);
    }
}
