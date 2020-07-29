/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomer1;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class ArrayMultiDimensi  {
    



    public static void main(String[] args) {

        // Membuat Array 
        String[][] matkul = {{"sabtu" , "elektronika, algoritma dan pemrogaman 1, sistem basis data"}, {"minggu" , "matematika, struktur data, amaliyah an-nadliyah, pkn, islam nusantara"}};
    
        // menampilkan isi Array
        System.out.println("MATA KULIAH ILKOM UNU BLITAR");
        for(int x=0; x < matkul.length; x++){
            System.out.println("hari : " + matkul[x][0]);
            System.out.println("matkul : " + matkul[x][1]);
            System.out.println("________________________");
    }
}

   

         
    }


    


