package com.example.mylearningonline.DataSample;

import com.example.mylearningonline.DataSetGet.Feed;
import com.example.mylearningonline.DataSetGet.Matkul;

import java.util.ArrayList;

public class Data_Matkul {

        public static String [] [] data =new String[][]{
                {"IK54546","Mobprog","Mr.Dosen","3"},
                {"IK54546","Mobprog","Mr.Dosen","3"},
                {"IK54546","Mobprog","Mr.Dosen","3"}

        };

    public static ArrayList<Matkul> getListData(){
        //Deklarasi Objek
        Matkul matkul = null;
        //Menyusun Objek ke dalam Array Objek
        ArrayList<Matkul> list = new ArrayList<>();
        //Mengisi array yang masih kosong dengan isian data satu per satu dari array String
        for (int i = 0; i <data.length; i++) {
            matkul = new Matkul();
            matkul.setKode_matkul(data[i][0]);
            matkul.setNama_matkul(data[i][1]);
            matkul.setNama_dosen(data[i][2]);
            matkul.setSks(data[i][3]);
            list.add(matkul);
        }
        return list;

    }
}
