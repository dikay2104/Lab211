/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Elements;
import View.Menu;
import java.util.Random;
import java.util.Scanner;
import javax.lang.model.element.Element;

/**
 *
 * @author ntkhai
 */
public class Algorithm extends Menu{
    Array_Processing arr = new Array_Processing();
    Elements element = new Elements();
    Scanner scanner = new Scanner(System.in);
   public Algorithm() {
        super("Select Type Of Sort", new String[] {
            "Bubble Sort", "Quick Sort", "Exit"
        });
    } 
    
   public void BubbleSort(int a[])
   {
       int size = a.length;
       for(int i = 0; i < size; i++)
       {
           for(int j = 0; j < size - i - 1; j++)
           {
               if(a[j] > a[j+1])
               {
                    int temp = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = temp;
               }
           }
       }
   }

   public void doBubbleSort()
   {
       int[] a = arr.generateRandomArray();
       element.setArr(a);
       arr.showArr("Unsorted", a);
       System.out.println("");
       BubbleSort(a);
       arr.showArr("Sorted", a);
   }
   
   
   public void quickSort(int low, int high, int a[]) {
        if (low < high) {
            int partitionIndex = partition(low, high, a);
            quickSort(low, partitionIndex - 1, a);
            quickSort(partitionIndex + 1, high, a);
        }
        
    }

   public int partition(int low, int high, int arr[]) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(i, j,arr);
            }
        }
        swap(i + 1, high,arr);
        return i + 1;
    }

    public void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   
    public void doQuickSort(){
        int[] a = arr.generateRandomArray();
        element.setArr(a);
        int size = a.length;
        element.setArr(a);
        arr.showArr("Unsorted", a);
        System.out.println("");
       
        quickSort(0, size - 1,a);
        arr.showArr("Sorted", a);
   }
    
    public void doBinarySearch(){
        int[] a = arr.generateRandomArray();
        element.setArr(a);
        int size = a.length;
        element.setArr(a);
        arr.showArr("Unsorted", a);
        System.out.println("");
       
        quickSort(0, size - 1,a);
        arr.showArr("Sorted", a);
       
        System.out.println("/nEnter number to search: ");
        int n = scanner.nextInt();
        System.out.println("Your number found in index = " + binarySearch(a, n));
    }
   
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
   
    @Override
    public void execute(int choice) {
        switch(choice) {
            case 1:
                doBubbleSort();
                break;
            case 2:
                doQuickSort();
                break;
            case 3:
                doBinarySearch();
                break;
        }
    }
    
    
}
