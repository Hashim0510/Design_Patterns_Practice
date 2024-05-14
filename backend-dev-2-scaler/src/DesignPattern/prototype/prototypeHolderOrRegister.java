package DesignPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class prototypeHolderOrRegister {

    HashMap<String, student> studentPrototypeRegistry = new HashMap<>();

    //methods to store and access prototypes

    public void storeprototypes(String key, student prototype){

        studentPrototypeRegistry.put(key, prototype);

    }

    public student accessPrototype(String key){

        return studentPrototypeRegistry.get(key);

    }



}
