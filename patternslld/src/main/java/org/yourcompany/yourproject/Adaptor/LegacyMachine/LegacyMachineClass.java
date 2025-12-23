package org.yourcompany.yourproject.Adaptor.LegacyMachine;

public class LegacyMachineClass implements LegacyMachineInterface {
    public int weight ;

    public LegacyMachineClass(int weight) {
        this.weight = weight;
    }
    
    @Override
    public int getWeightInKg() {
        return weight;
    }
 }
