package hu.mySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ToolCollection {

    private ArrayList<FishingRod> myCollection = new ArrayList<>();

    @Autowired
    public void addFishingRod(FishingRod fishingRod){
        myCollection.add(fishingRod);
        System.out.println(myCollection);
    }
}
