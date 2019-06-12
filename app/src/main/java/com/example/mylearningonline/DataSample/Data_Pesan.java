package com.example.mylearningonline.DataSample;

import com.example.mylearningonline.DataSetGet.Pesan;

import java.util.ArrayList;

public class Data_Pesan {

        public static String [] [] data =new String[][]{
                {"System","Ujian baru saja diupload. Cek ke evaluasi segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"},
                {"System", "Tugas baru saja diupload. Cek ke Tugas segera untuk info lebih lanjut"}
        };

    public static ArrayList<Pesan> getListData(){
        //Deklarasi Objek
        Pesan pesan = null;
        //Menyusun Objek ke dalam Array Objek
        ArrayList<Pesan> list = new ArrayList<>();
        //Mengisi array yang masih kosong dengan isian data satu per satu dari array String
        for (int i = 0; i <data.length; i++) {
            pesan = new Pesan();
            pesan.setSender_id(data[i][0]);
            pesan.setMessage(data[i][1]);
            list.add(pesan);
        }
        return list;

    }
}
