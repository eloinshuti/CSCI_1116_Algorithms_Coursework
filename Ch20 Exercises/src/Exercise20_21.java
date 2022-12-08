/*
Author: Eloi Nshuti
Date: 12/08/2022

Description: Programming Exercise 20-21
*/
import java.util.*;

public class Exercise20_21 {
  public static void main(String[] args) {
    GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
        new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
        new Circle(6.5), new Rectangle(4, 5)};
    
    selectionSort(list, new GeometricObjectComparator());
    
    for (int i = 0; i < list.length; i++)
      System.out.println(list[i].getArea() + " ");
  }

  public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
	  List<E> list1 = Arrays.asList(list);
	  Collections.sort(list1,comparator);
  }
}