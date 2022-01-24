package hu.mySpring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component <----- komponens: olyan bean, amit a rendszer rögtön létrehoz !
@Component
public interface Fisher {

    void catchFish(Fish fish);

    /*private @Getter @Setter String name; <---- Lombok miatt nem kell külön Getter és Setter !

    public Fisher() {
        this.setName("Jakab");*/
}