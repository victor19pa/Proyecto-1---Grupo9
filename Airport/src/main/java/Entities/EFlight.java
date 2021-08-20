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
    private String departureTime;
    private int expectedTime;
    private String arrivalTime;
    private int expectedArrivalTime;
    private String airline;
    private String binnacle;
    private char status;
    private int airplane;
}
