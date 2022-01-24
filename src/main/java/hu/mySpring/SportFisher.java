package hu.mySpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SportFisher implements Fisher {
    @Override
    public void catchFish(Fish fish) {
        System.out.println("Caught a " + fish.getName() + " at the competition ! ");
    }
}
