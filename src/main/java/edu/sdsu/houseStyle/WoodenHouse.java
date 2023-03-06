package edu.sdsu.houseStyle;

import edu.sdsu.builder.HouseBuilder;

public class WoodenHouse extends HouseBuilder {
    @Override
    public void buildFoundation() {
        super.buildFoundation();
    }

    @Override
    public void buildWindows() {
        System.out.println("Building windows for wooden House");
    }

    @Override
    public void buildPillars() {
        super.buildPillars();
    }

    @Override
    public void buildWalls() {
        System.out.println("Building walls for the wooden house");
    }
}
