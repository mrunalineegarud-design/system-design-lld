package org.yourcompany.yourproject.Adaptor.AdaptorDesign;

import org.yourcompany.yourproject.Adaptor.LegacyMachine.LegacyMachineClass;

public class AdaptorClass implements AdaptorInterface{
    LegacyMachineClass legacyMachineClass1;

    public AdaptorClass (LegacyMachineClass legacyMachineClass) {
        this.legacyMachineClass1 = legacyMachineClass;
    }

    @Override
    public double getWeightInPounds() {
        return convertWeightFromKgToPounds(legacyMachineClass1.weight);
    }

    public double convertWeightFromKgToPounds(int weight) {
        return weight / 0.45;
    }
    
}
