package com.LabFinal.labFinal.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class PRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Map<String, Object>> getHighPopulationCountries() {
        String sql = "SELECT \n" +
                "        p.pais AS Pais, \n" +
                "        d.2018 AS Poblacion\n" +
                "    FROM \n" +
                "        paises p \n" +
                "    JOIN datos d ON p.codigo = d.codigo\n" +
                "    WHERE \n" +
                "        d.2018 IS NOT NULL AND \n" +
                "        p.nivel != 'Agregados' AND \n" +
                "        p.pais NOT LIKE 'Mundo' AND\n" +
                "        p.pais NOT LIKE '%Fede%' AND\n" +
                "        p.pais NOT LIKE \"%Côte d'Ivoire%\" \n" +
                "    ORDER BY \n" +
                "        d.2018 DESC\n" +
                "    LIMIT 10;";

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getPopulationIncrease() {
        String sql = "SELECT " +
                "p.pais AS Country, " +
                "(t.`2018` - t.`2017`) AS populationIncrease, " +
                "ROUND(((t.`2018` - t.`2017`) / t.`2017`) * 100, 2) AS percentageIncrease " +
                "FROM datos t " +
                "INNER JOIN paises p ON p.codigo = t.codigo " +
                "WHERE t.`2018` IS NOT NULL AND " +
                "t.`2017` IS NOT NULL AND " +
                "p.nivel != 'Agregados' AND " +
                "p.pais NOT LIKE 'Mundo' AND " +
                "p.pais NOT LIKE '%Fede%' AND " +
                "p.pais NOT LIKE \"%Côte d'Ivoire%\" " +
                "GROUP BY p.codigo " +
                "HAVING populationIncrease > 0 AND percentageIncrease > 0 " +
                "ORDER BY percentageIncrease DESC";




        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getPopulationGrowth() {
        String sql = "SELECT " +
                "p.pais AS Country, " +
                "(t.`1970` - t.`1960`) AS PopulationIncrease, " +
                "ROUND(((t.`1970` - t.`1960`) / t.`1960`) * 100, 2) AS GrowthPercentage " +
                "FROM datos t " +
                "INNER JOIN paises p ON p.codigo = t.codigo " +
                "WHERE p.pais IN ('Alemania', 'Italia', 'España', 'Francia')";

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getPopulationDecrease() {
        String sql = "SELECT " +
                "p.pais AS Country, " +
                "(t.`2000` - t.`2010`) AS populationDecrease, " +
                "ROUND(((t.`2000` - t.`2010`) / t.`2000`) * 100, 2) AS percentageDecrease " +
                "FROM datos t " +
                "INNER JOIN paises p ON p.codigo = t.codigo " +
                "WHERE t.`2010` < t.`2000` " +
                "ORDER BY percentageDecrease DESC";

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getPopulationIncreaseGrowth() {
        String sql = "SELECT " +
                "p.pais AS Country, " +
                "(t.`2018` - t.`2017`) AS populationIncrease, " +
                "ROUND(((t.`2018` - t.`2017`) / t.`2017`) * 100, 2) AS percentageIncrease " +
                "FROM datos t " +
                "INNER JOIN paises p ON p.codigo = t.codigo " +
                "WHERE t.`2018` > t.`2017` " +
                "ORDER BY percentageIncrease DESC";

        return jdbcTemplate.queryForList(sql);
    }
}
