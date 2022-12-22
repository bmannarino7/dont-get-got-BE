package io.DontGetGot;

import io.DontGetGot.DontGetGot.Mission;

public class Wallet {
    
    Mission[] walletContent = new Mission[2];

    public Wallet() {
        for (int i = 0; i < walletContent.length; i++) {
            walletContent[i] = new Mission(i, getMissionText()); // create method to return a mission from a list of missions... eventually it will pull from the db
        }

    }

    
    
}
