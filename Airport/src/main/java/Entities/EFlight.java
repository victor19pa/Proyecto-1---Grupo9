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

@Getter @Setter @ToString

public class EFlight {
    private int idFlight;
    private String origin;
    private String destiny;
    private Date departureTime;
    private Date expectedTime;
    private Date arrivalTime;
    private Date expectedArrivalTime;
    private String airline;
    private String binnacle;
    private char status;
    private EAirplane airplane;
}
