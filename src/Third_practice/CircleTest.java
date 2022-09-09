package Third_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CircleTest {
    ArrayList<Circle> list = new ArrayList<>();
    private int numberOfElem;

    public CircleTest(ArrayList<Circle> list) {
        this.list = list;
    }

    public int getNumberOfElem() {
        this.numberOfElem = list.size();
        return numberOfElem;
    }

    public Circle findMax() {
        Point temp = new Point(0,0);
        Circle max = new Circle(temp, 0);
        for (int i = 0; i < this.list.size(); i++) {
            for (int j = 1; j < this.list.size(); j++) {
                if(this.list.get(i).getR() > this.list.get(j).getR())
                    max = this.list.get(i);
            }
        }
        return max;
    }
    public Circle findMin() {
        Point temp = new Point(0,0);
        Circle min = new Circle(temp, 1000);
        for (int i = 0; i < this.list.size(); i++) {
            for (int j = 1; j < this.list.size(); j++) {
                if(this.list.get(i).getR() > this.list.get(j).getR())
                    min = this.list.get(j);
            }
        }
        return min;
    }

    public CircleTest SortedList() {
        for (int i = 0; i < this.list.size(); i++) {
            for (int j = 1; j < this.list.size(); j++) {
                if(this.list.get(i).getR() > this.list.get(j).getR()) {
                    Point temp1 = new Point(0,0);
                    Circle temp = new Circle(temp1);
                    temp = this.list.get(j);
//                    this.list.get(j) = this.list.get(i);
//                    this.list.get(i) = temp;
                    // TODO: Сделать сортировку по радиусу
                }
            }
        }
        return this;
    }
}
