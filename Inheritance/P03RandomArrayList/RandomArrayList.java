package Inheritance.P03RandomArrayList;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList<T> extends ArrayList<T> {



    public Object getRandomElement() {
        int randomIndex = ThreadLocalRandom.current().nextInt(size());
        return remove(randomIndex);
    }}
