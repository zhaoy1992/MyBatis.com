package com.zy.mybaty.utils;

public class Mystery {

	public static void main(String[] arg){
		int [] data ={10,50,70,60,20,30,40};
		mystery(data,1,data.length-2);
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]+" ");
		}
	}
	
	public static void mystery(int[] data,int first,int n){
		int n1;
		int n2;
		if(n>1)
		{
			n1=n/2;
			n2=n-n1;
			mystery(data,first,n1);
			mystery(data,first+n1,n2);
			merge(data,first,n1,n2);
		}
	}
	private static void merge(int data[],int first,int n1,int n2){
		int [] temp = new int[n1+n2];
		int copied=0;
		int copied1=0;
		int copied2=0;
		int i;
		while((copied1 < n1) && (copied2 < n2)){
			if(data[first+copied1]< data[first+n1+copied2]){
				temp[copied++]=data[first+(copied1++)];
			  }else{
					temp[copied++]=data[first+n1+(copied2++)];
				}
			}
			
		while(copied1 < n1){
			temp[copied++]=data[first+(copied1++)];
		}
		
		while(copied2 < n2){
			temp[copied++]=data[first+n1+(copied2++)];
		}
		for(i=0;i<n1+n2;i++){
			data[first+i]=temp[i];
		}
	}
}
