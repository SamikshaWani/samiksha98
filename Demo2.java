package com.samiksha;
public class Demo2{
	
public void countDesiredBuildings(int arr[]) {
    int maxEle = arr[0];
    int count =1;
     
    for(int i=1;i<arr.length;i++){
        if(arr[i]>maxEle){
            count++;
            maxEle = arr[i];
        }
    }
    System.out.println("Count of building that receive sunlight:" + count);
}


}