package org.airlines.api;

import org.airlines.bean.BookingInformation;
import org.airlines.repository.BookingInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pbaregal on 5/14/2019.
 */
@RestController
public class BookingInformationAPI {

    @Autowired
    private BookingInformationRepository bookingRepo;

    @GetMapping("/bookings")
    public ResponseEntity<List<BookingInformation>> getUsers(){
      List<BookingInformation> users= (List<BookingInformation>) bookingRepo.findAll();
    return new ResponseEntity<List<BookingInformation>>(users,HttpStatus.OK);
    }

    @PostMapping(value = "/book",consumes = "application/json", produces = "application/json")
    public ResponseEntity<BookingInformation> postUser(@RequestBody BookingInformation bean){
        BookingInformation user= bookingRepo.save(bean);
        return new ResponseEntity<BookingInformation>(user,HttpStatus.OK);
    }
    @GetMapping("/book/{bookId}")
    public ResponseEntity<BookingInformation> getUser(@PathVariable(name = "bookId") String bookId){
        BookingInformation users=  bookingRepo.findOne(bookId);
        return new ResponseEntity<BookingInformation>(users,HttpStatus.OK);
    }
}
