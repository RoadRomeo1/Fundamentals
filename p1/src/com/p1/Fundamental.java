package com.p1;
import java.util.*;
import java.io.*;


public class Fundamental{

public static void main(String args[]){

String arr[][]=new String[7][8];

arr[0][0]="1001";
arr[0][1]="Ashish";
arr[0][2]="01/04/2009";
arr[0][3]="e";
arr[0][4]="R&D";
arr[0][5]="20000";
arr[0][6]="8000";
arr[0][7]="3000";

arr[1][0]="1002";
arr[1][1]="Sushma";
arr[1][2]="23/08/2012";
arr[1][3]="c";
arr[1][4]="PM";
arr[1][5]="30000";
arr[1][6]="12000";
arr[1][7]="9000";

arr[2][0]="1003";
arr[2][1]="Rahul";
arr[2][2]="12/11/2008";
arr[2][3]="k";
arr[2][4]="Acct";
arr[2][5]="10000";
arr[2][6]="8000";
arr[2][7]="1000";

arr[3][0]="1004";
arr[3][1]="Chahat";
arr[3][2]="29/01/2013";
arr[3][3]="r";
arr[3][4]="Front Desk";
arr[3][5]="12000";
arr[3][6]="6000";
arr[3][7]="2000";

arr[4][0]="1005";
arr[4][1]="Ranjan";
arr[4][2]="16/07/2005";
arr[4][3]="m";
arr[4][4]="Engg";
arr[4][5]="50000";
arr[4][6]="20000";
arr[4][7]="20000";

arr[5][0]="1006";
arr[5][1]="Suman";
arr[5][2]="1/1/2000";
arr[5][3]="e";
arr[5][4]="Manufacturing";
arr[5][5]="23000";
arr[5][6]="9000";
arr[5][7]="4400";

arr[6][0]="1007";
arr[6][1]="Tanmay";
arr[6][2]="12/06/2006";
arr[6][3]="c";
arr[6][4]="PM";
arr[6][5]="29000";
arr[6][6]="12000";
arr[6][7]="10000";

String arr1[][]=new String[5][3];

arr1[0][0]="e";
arr1[0][1]="Engineer";
arr1[0][2]="20000";

arr1[1][0]="c";
arr1[1][1]="Consultant";
arr1[1][2]="32000";

arr1[2][0]="k";
arr1[2][1]="clerk";
arr1[2][2]="12000";

arr1[3][0]="r";
arr1[3][1]="Receptionist";
arr1[3][2]="15000";

arr1[4][0]="m";
arr1[4][1]="Manager";
arr1[4][2]="40000";


int sal[]=new int[7];
for(int i=0;i<7;i++){
int j=3;

switch(arr[i][j]){

case "e":
sal[i]=20000;
break;

case "c":
sal[i]=32000;
break;

case "k":
sal[i]=12000;
break;

case "r":
sal[i]=15000;
break;

case "m":
sal[i]=40000;	
break;

default:
System.out.println("Error");
break;
}}

for(int i=0;i<7;i++)
{
int j=7;
sal[i]=sal[i]-Integer.parseInt(arr[i][j]);
}

for(int i=0;i<7;i++){
int j=5;
sal[i]=sal[i]+Integer.parseInt(arr[i][j]);
}


for(int i=0;i<7;i++){
int j=6;
sal[i]=sal[i]+Integer.parseInt(arr[i][j]);
}

String arr2[][]=new String[7][5];

for(int i=0;i<7;i++){
for(int j=0;j<2;j++){
arr2[i][j]=arr[i][j];
}
int k=4,j=2;
arr2[i][j]=arr[i][k];
}

for(int i=0;i<7;i++){
int j=3;

switch(arr[i][j]){

case "e":
arr2[i][j]="Engineer";
break;

case "c":
arr2[i][j]="Consultant";
break;

case "k":
arr2[i][j]="Clerk";
break;

case "r":
arr2[i][j]="Receptionist";
break;

case "m":
arr2[i][j]="Manager";
break;

default:
System.out.println("Error");
break;

}
}

for(int i=0;i<7;i++){
int j=4;
arr2[i][j]=Integer.toString(sal[i]);
}

String str=args[0];

switch(args[0]){

case "1001":
int a=0;
for(int j=0;j<5;j++){
System.out.print(arr2[a][j]+" ");
}
break;

case "1002":
int b=1;
for(int j=0;j<5;j++){
System.out.print(arr2[b][j]+" ");
}
break;


case "1003":
int c=2;
for(int j=0;j<5;j++){
System.out.print(arr2[c][j]+" ");
}
break;


case "1004":
int d=3;
for(int j=0;j<5;j++){
System.out.print(arr2[d][j]+" ");
}
break;


case "1005":
int e=4;
for(int j=0;j<5;j++){
System.out.print(arr2[e][j]+" ");
}
break;



case "1006":
int f=5;
for(int j=0;j<5;j++){
System.out.print(arr2[f][j]+" ");
}
break;



case "1007":
int g=6;
for(int j=0;j<5;j++){
System.out.print(arr2[g][j]+" ");
}
break;



default:
System.out.println("No Employee Found");
break;

}


}}
