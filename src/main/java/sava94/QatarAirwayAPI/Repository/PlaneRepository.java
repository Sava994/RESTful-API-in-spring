package sava94.QatarAirwayAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sava94.QatarAirwayAPI.Models.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Integer> {

}
