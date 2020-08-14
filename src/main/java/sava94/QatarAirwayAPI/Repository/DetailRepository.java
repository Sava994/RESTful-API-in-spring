package sava94.QatarAirwayAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sava94.QatarAirwayAPI.Models.Detail;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {

}
