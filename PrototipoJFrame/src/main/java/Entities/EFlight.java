/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author victor
 */
@Getter @Setter @ToString
public class EFlight {
    private String origin;
    private String destiny;
    private Date departureTime;
    private Date expectedDepartureTime;
    private Date arrivalTime;
    private Date expectedArrivalTime;
    private String airline;
    private char status;
    //private EAirplane airplane;
}