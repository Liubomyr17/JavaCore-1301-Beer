package com.company;

/*

Level 13 Lection 2. Beer

Reasons for the existence of interfaces - support for declared behavior
 
Beer
1. Think about which of the two interfaces you need to implement in the Beer class.
2. Add this interface to the Beer class and implement all its methods.
3. Consider how the READY_TO_GO_HOME variable and the isReadyToGoHome method are related.
4. Return the value of the READY_TO_GO_HOME variable in the isReadyToGoHome method.

Requirements:
1. The Beer class should implement (implements) the Alcohol interface.
2. The Beer class should not implement the Drink interface directly (only indirectly through Alcohol)
3. In the Beer class, all methods of the Alcohol interface must be implemented.
4. In the Beer class, all methods of the Drink interface must be implemented.
5. The isReadyToGoHome method should return the value of the READY_TO_GO_HOME variable.



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol {
        @Override
        public void askMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {

        }
    }
}


