package pe.I202221776.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.I202221776.cibertec.model.Car;

@Repository
public interface ICarRepository extends JpaRepository<Car, Integer> {

}
