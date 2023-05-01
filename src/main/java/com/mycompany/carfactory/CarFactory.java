/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carfactory;

/**
 *
 * @author maxfr
 */
class CarFactory {
    public static void main(String[] args) {
        // Cria um carro Sedan usando a fábrica
        Car sedan = CarFactory.createCar("Sedan");
        sedan.drive(); // Imprime "Dirigindo um Sedan"

        // Cria um carro SUV usando a fábrica
        Car suv = CarFactory.createCar("SUV");
        suv.drive(); // Imprime "Dirigindo um SUV"
    }
    // Método para criar um objeto do tipo Car
    public static Car createCar(String type) {
        if (type.equals("Sedan")) {
            return new Sedan();
        } else if (type.equals("SUV")) {
            return new SUV();
        } else {
            throw new IllegalArgumentException("Tipo de carro desconhecido");
        }
    }
}
