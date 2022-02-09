package com.example.factory.creational.builder.carBuilder.builders;

import com.example.factory.creational.builder.carBuilder.cars.CarType;
import com.example.factory.creational.builder.carBuilder.components.Engine;
import com.example.factory.creational.builder.carBuilder.components.GPSNavigator;
import com.example.factory.creational.builder.carBuilder.components.Transmission;
import com.example.factory.creational.builder.carBuilder.components.TripComputer;
import com.example.factory.creational.carBuild.components.*;

public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
