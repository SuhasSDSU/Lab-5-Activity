package edu.sdsu.builder;

public abstract class HouseBuilder {
    public final void buildHouse(){
        buildFoundation();
        buildWindows();
        buildPillars();
        buildWalls();
    }

    public void buildFoundation(){
        System.out.println("House Foundation");
    }
    public abstract void buildWindows();

    public void buildPillars(){

    }

    public abstract void buildWalls();
}
