package com.LabFinal.labFinal.repository;

import com.LabFinal.labFinal.entities.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DatosRepository extends JpaRepository<Datos,Long> {
    @Query("SELECT T.pais.pais, T.year2018" +
            " FROM Datos T " +
            "GROUP BY T.pais.pais " +
            "ORDER BY T.year2018 DESC " +
            "Limit 10")
    List<Object[]> HighPopulationCountry();

    @Query("SELECT T.pais.pais, (T.year2018 - T.year2017) " +
            "AS populationIncrease" +
            " FROM Datos T " +
            " GROUP BY T.pais.codigo" +
            " ORDER BY (T.year2018 - T.year2017) DESC" +
            " LIMIT 5")
    List<Object[]> IncreasePopulation();

}
