package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Filter {
    protected int treshold;
    public Filter(int treshold) {
        this.treshold = treshold;
    }
    public Filter(){

    }

    public List<Integer> randomList(int n, int m) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
        }
        return list;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) >= treshold) {
                logger.log("Элемент " + source.get(i) + " проходит");
                result.add(source.get(i));
            } else {
                logger.log("Элемент " + source.get(i) + " не проходит");
            }
        }
        System.out.print("Отфильтрованный список: ");
        System.out.println(Arrays.toString(result.toArray()).replaceAll("\\[|\\]|,", ""));
        return result;
    }
}
