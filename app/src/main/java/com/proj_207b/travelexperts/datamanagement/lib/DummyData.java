package com.proj_207b.travelexperts.datamanagement.lib;

import java.util.ArrayList;

public class DummyData {

    public ArrayList<Agent> getAgentList() {

        ArrayList<Agent> returnValue = new ArrayList<>();

        returnValue.add(new Agent(
                1,
                "James",
                "P",
                "Defant",
                "4035554444",
                "james@sait.ca",
                "Head Designer",
                1
        ));
        returnValue.add(new Agent(
                2,
                "Andi",
                "M",
                "Crowe-Swords",
                "5874449999",
                "andi@gmail.ca",
                "Marketing Lead",
                1
        ));

        return returnValue;
    }
}
