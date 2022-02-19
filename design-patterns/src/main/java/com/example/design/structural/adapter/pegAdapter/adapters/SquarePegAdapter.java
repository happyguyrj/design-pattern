package com.example.design.structural.adapter.pegAdapter.adapters;

import com.example.design.structural.adapter.pegAdapter.round.RoundPeg;
import com.example.design.structural.adapter.pegAdapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
