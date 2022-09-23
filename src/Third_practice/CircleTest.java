package Third_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CircleTest {
    ArrayList<Circle> list;
    private int numberOfElem;

    public CircleTest(ArrayList<Circle> list) {
        this.list = list;
    }

    public int getNumberOfElem() {
        this.numberOfElem = list.size();
        return numberOfElem;
    }

    public int findMax() {
        int max = 0;
        for (int i = 0; i < this.list.size(); i++) {
            for (int j = 1; j < this.list.size(); j++) {
                if (this.list.get(i).getR() > this.list.get(j).getR()) {
                    max = this.list.get(i).getR();
                }
            }
        }
        return max;
    }
    public int findMin() {
        int min = 1000;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if(list.get(i).getR() > list.get(j).getR())
                    min = list.get(j).getR();
            }
        }
        return min;
    }

    public String toString() {
        return "CircleTest{" +
                "list=" + list +
                ", numberOfElem=" + numberOfElem +
                '}';
    }

    public CircleTest SortedList() {
        for (int i = 0; i < this.list.size(); i++) {
            for (int j = 1; j < this.list.size(); j++) {
                if(this.list.get(i).getR() > this.list.get(j).getR()) {
                    Collections.swap(this.list, i, j);
                }
            }
        }
        return this;
    }
}
