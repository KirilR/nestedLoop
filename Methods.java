package com.company;

public class Methods {

    static void loops(int[] arr, int id){
        if(id>=arr.length){
            for (int e:arr) {
                System.out.print(e);

            }
            System.out.println( );
        }
        else{
            for(int i=0;i<=arr.length;i++){
                arr[id]=i;
                loops(arr,id+1);

            }
        }
    }





}
