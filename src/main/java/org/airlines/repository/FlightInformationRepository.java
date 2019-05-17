package org.airlines.repository;

import org.airlines.bean.Airport;
import org.airlines.bean.FlightInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pbaregal on 5/14/2019.
 */
@Repository
public interface FlightInformationRepository extends CrudRepository<FlightInformation,String>{
}
