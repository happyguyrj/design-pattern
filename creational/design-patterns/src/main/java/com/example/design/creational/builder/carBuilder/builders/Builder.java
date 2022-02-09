package com.example.design.creational.builder.carBuilder.builders;

import com.example.design.creational.builder.carBuilder.cars.CarType;
import com.example.design.creational.builder.carBuilder.components.Engine;
import com.example.design.creational.builder.carBuilder.components.GPSNavigator;
import com.example.design.creational.builder.carBuilder.components.Transmission;
import com.example.design.creational.builder.carBuilder.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
