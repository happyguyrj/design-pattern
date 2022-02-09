package com.example.factory.creational.builder.carBuilder.builders;

import com.example.factory.creational.builder.carBuilder.components.Engine;
import com.example.factory.creational.builder.carBuilder.components.GPSNavigator;
import com.example.factory.creational.builder.carBuilder.components.Transmission;
import com.example.factory.creational.builder.carBuilder.cars.CarType;
import com.example.factory.creational.builder.carBuilder.cars.Manual;
import com.example.factory.creational.builder.carBuilder.components.TripComputer;
import com.example.factory.creational.carBuild.components.*;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}