package org.yourcompany.yourproject.Adaptor;

import org.yourcompany.yourproject.Adaptor.AdaptorDesign.AdaptorClass;
import org.yourcompany.yourproject.Adaptor.LegacyMachine.LegacyMachineClass;

public class MainClass {
    public static void main(String[] args) {
        
        LegacyMachineClass legacyMachineClass = new LegacyMachineClass(23);
        AdaptorClass adaptorClass = new AdaptorClass(legacyMachineClass);
        System.out.println(adaptorClass.getWeightInPounds());
        
    }
}
