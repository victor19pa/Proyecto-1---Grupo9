/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class EAirplane {
    private int idAirplane;
    private String model;
    private int passengerCapacity;
    private double tankCapacity;
    private boolean available;
    
}
