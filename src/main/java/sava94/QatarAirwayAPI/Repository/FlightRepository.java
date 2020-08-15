package sava94.QatarAirwayAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sava94.QatarAirwayAPI.Models.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
