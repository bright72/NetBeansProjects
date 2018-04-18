/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.model;

/**
 *
 * @author Tisanai.Cha
 */
public class Browser {

    private Tab[] tabs;
    private int numOfTab;
    private int activeTabPosition;

    public Browser(int maximumTab) {
        this.tabs = new Tab[maximumTab + 1];
        this.tabs[0] = new Tab("Default");
        this.activeTabPosition = 0;
        this.numOfTab = 1;
    }

    public int newTab(Tab tab) {
        int status = -1;
        for (int i = 0; i < tabs.length; i++) {
            if (tabs[i] == null) {
                this.activeTabPosition = i;
                this.tabs[i] = tab;
                this.numOfTab = ++i;
                status = i;
                break;
            }
        }
        return status;
    }

    public boolean setActiveTabIndex(int index) {
        boolean result = false;
        if (index < tabs.length && tabs[index] != null) {
            this.activeTabPosition = index;
            result = true;
        }
        return result;
    }

    public int getMaximumNoOfTab() {
        return this.tabs.length;
    }

    public int getNumOfTab() {
        return this.numOfTab;
    }

    public Tab getActiveTab() {
        return this.tabs[activeTabPosition];
    }

    @Override
    public String toString() {
        String output = "Browser consists of " + this.numOfTab + " tabs:\n";
        for (Tab tempTab : this.tabs) {
            if (tempTab != null) {
                output += tempTab + "\n";
            }
        }
        output += "Active tab = "
                + this.tabs[activeTabPosition].toString();
        return output;
    }

}
