package com.LabFinal.labFinal.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "datos")
public class Datos implements Serializable {
    @Id
    @Column(name = "codigo")
    private String codigo;

    @OneToOne
    @JoinColumn(name = "codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    private Pais pais;

    @Column(name = "1960")
    private Float year1960;

    @Column(name = "1961")
    private Float year1961;

    @Column(name = "1962")
    private Float year1962;

    @Column(name = "1963")
    private Float year1963;

    @Column(name = "1964")
    private Float year1964;

    @Column(name = "1965")
    private Float year1965;

    @Column(name = "1966")
    private Float year1966;

    @Column(name = "1967")
    private Float year1967;

    @Column(name = "1968")
    private Float year1968;

    @Column(name = "1969")
    private Float year1969;

    @Column(name = "1970")
    private Float year1970;

    @Column(name = "1971")
    private Float year1971;

    @Column(name = "1972")
    private Float year1972;

    @Column(name = "1973")
    private Float year1973;

    @Column(name = "1974")
    private Float year1974;

    @Column(name = "1975")
    private Float year1975;

    @Column(name = "1976")
    private Float year1976;

    @Column(name = "1977")
    private Float year1977;

    @Column(name = "1978")
    private Float year1978;

    @Column(name = "1979")
    private Float year1979;

    @Column(name = "1980")
    private Float year1980;

    @Column(name = "1981")
    private Float year1981;

    @Column(name = "1982")
    private Float year1982;

    @Column(name = "1983")
    private Float year1983;

    @Column(name = "1984")
    private Float year1984;

    @Column(name = "1985")
    private Float year1985;

    @Column(name = "1986")
    private Float year1986;

    @Column(name = "1987")
    private Float year1987;

    @Column(name = "1988")
    private Float year1988;

    @Column(name = "1989")
    private Float year1989;

    @Column(name = "1990")
    private Float year1990;

    @Column(name = "1991")
    private Float year1991;

    @Column(name = "1992")
    private Float year1992;

    @Column(name = "1993")
    private Float year1993;

    @Column(name = "1994")
    private Float year1994;

    @Column(name = "1995")
    private Float year1995;

    @Column(name = "1996")
    private Float year1996;

    @Column(name = "1997")
    private Float year1997;

    @Column(name = "1998")
    private Float year1998;

    @Column(name = "1999")
    private Float year1999;

    @Column(name = "2000")
    private Float year2000;

    @Column(name = "2001")
    private Float year2001;

    @Column(name = "2002")
    private Float year2002;

    @Column(name = "2003")
    private Float year2003;

    @Column(name = "2004")
    private Float year2004;

    @Column(name = "2005")
    private Float year2005;

    @Column(name = "2006")
    private Float year2006;

    @Column(name = "2007")
    private Float year2007;

    @Column(name = "2008")
    private Float year2008;

    @Column(name = "2009")
    private Float year2009;

    @Column(name = "2010")
    private Float year2010;

    @Column(name = "2011")
    private Float year2011;

    @Column(name = "2012")
    private Float year2012;

    @Column(name = "2013")
    private Float year2013;

    @Column(name = "2014")
    private Float year2014;

    @Column(name = "2015")
    private Float year2015;

    @Column(name = "2016")
    private Float year2016;

    @Column(name = "2017")
    private Float year2017;

    @Column(name = "2018")
    private Float year2018;
}
