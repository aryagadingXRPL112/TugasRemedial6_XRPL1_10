import java.util.ArrayList;
import java.io.*;
/*
 *
 *
 * @author Nur Hidayat
 */

public class Search { 

ArrayList al=new ArrayList(); 
  
public void tambah(){  
//method Untuk mengisi ArrayList   
   al.add("A");
   al.add("B");
   al.add("C");
   al.add("D");
   al.add("F");
   al.add("G");
   al.add("H");
   al.add("I");
   al.add("J");
   al.add("K");
   al.add("L");
   al.add("M");
   al.add("N");
   al.add("O");
   al.add("P");
   al.add("Q");
   al.add("R");
   al.add("S");
   al.add("T");
   al.add("U");
   al.add("V");
   al.add("W");
   al.add("X");
   al.add("Y");
   al.add("Z");
  
   
}
public void cetak(){  
// method untuk mengeluarkan isi dari //ArrayList    
System.out.println("Isi Array :"+ al);
}

public void cari(String golek){  
   int n=1;
   boolean ketemu=false;
    for(int i=n;i<al.size();i++){ 
       if (al.get(i) ==golek){
          ketemu=true;
          n=i;
        }
    }
 if (ketemu==true){ 
   System.out.println("Data Ada Di Index Ke "+n);
  }else{ 
           System.out.println("Data Tidak Ditemukan");
        }
   }

 /*
  *
  * @param args the command line arguments 
  */    
public static void main(String[] args) {
     Search s=new Search(); 
    s.tambah();
 //untuk mengisi ArrayList dengan Data    
 s.cari("M");// untuk melakukan pencarian karakter A 
   }
}