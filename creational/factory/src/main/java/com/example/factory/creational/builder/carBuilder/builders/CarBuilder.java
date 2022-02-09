package com.example.factory.creational.builder.carBuilder.builders;

import com.example.factory.creational.builder.carBuilder.cars.CarType;
import com.example.factory.creational.builder.carBuilder.components.Engine;
import com.example.factory.creational.builder.carBuilder.components.GPSNavigator;
import com.example.factory.creational.builder.carBuilder.components.Transmission;
import com.example.factory.creational.builder.carBuilder.cars.Car;
import com.example.factory.creational.builder.carBuilder.components.TripComputer;

public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
