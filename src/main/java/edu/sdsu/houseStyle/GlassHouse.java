package edu.sdsu.houseStyle;

import edu.sdsu.builder.HouseBuilder;

public class GlassHouse extends HouseBuilder {
    @Override
    public void buildWindows() {
        System.out.println("The window is being built for GlassHouse");
    }

    @Override
    public void buildFoundation() {
        super.buildFoundation();
    }

    @Override
    public void buildPillars() {
        super.buildPillars();
    }

    @Override
    public void buildWalls() {
      System.out.println("Build-walls is called from the GlassHouse");
    }
}
