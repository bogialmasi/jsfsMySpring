package hu.mySpring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class FishingRod {
    private @Getter @Setter Fisher owner;

    @Autowired
    public void setOwner(@Qualifier("Orvhorgász") Fisher owner) { /* A primary helyett az Orvhorgász nevű komponenst kéri ! */
        this.owner = owner;
        System.out.println(this.owner);
    }
}
