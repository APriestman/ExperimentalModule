/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sleuthkit.autopsy.experimental.autoingest;

import org.openide.modules.ModuleInstall;
import java.lang.IllegalStateException;

/**
 
 */
public class Installer extends ModuleInstall{
    public Installer() {
        //UserPreferences.setAppName("Viking");
    }
    
    @Override 
    public void validate() throws IllegalStateException{
        //throw new IllegalStateException("Testing");
    }
}