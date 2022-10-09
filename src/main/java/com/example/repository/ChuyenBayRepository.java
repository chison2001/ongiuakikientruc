package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, Long>{
	@Query("select s from ChuyenBay s where s.gaDen = ?1")
	List<ChuyenBay> findFlightsTo(String gaDen);
}