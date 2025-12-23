package org.yourcompany.yourproject;
import org.yourcompany.yourproject.Adaptor.AdaptorDesign.AdaptorClass;
import org.yourcompany.yourproject.Adaptor.LegacyMachine.LegacyMachineClass;

/**
 *
 * @author Mrunalini
 */
public class Patternslld {

    public static void main(String[] args) {
        
        LegacyMachineClass legacyMachineClass = new LegacyMachineClass(23);
        AdaptorClass adaptorClass = new AdaptorClass(legacyMachineClass);
        System.out.println(adaptorClass.getWeightInPounds());
        
    }
}
