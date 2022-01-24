package hu.mySpring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Fish{
    private @Getter @Setter String name;

}
