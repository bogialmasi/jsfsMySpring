package hu.mySpring;

import org.springframework.stereotype.Component;

@Component("Orvhorgász") /* Elnevezte */
public class Angler implements Fisher {
    @Override
    public void catchFish(Fish fish) {
        System.out.println("Caught " + fish + " fish ! ");
    }
}
