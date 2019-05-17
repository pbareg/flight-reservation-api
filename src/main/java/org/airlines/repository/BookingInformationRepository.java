package org.airlines.repository;

import org.airlines.bean.BookingInformation;
import org.airlines.bean.FlightInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pbaregal on 5/14/2019.
 */
@Repository
public interface BookingInformationRepository extends CrudRepository<BookingInformation,String>{
}
