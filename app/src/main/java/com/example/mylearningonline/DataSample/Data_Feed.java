package com.example.mylearningonline.DataSample;

import com.example.mylearningonline.DataSetGet.Feed;
import com.example.mylearningonline.DataSetGet.Pesan;

import java.util.ArrayList;

public class Data_Feed {

        public static String [] [] data =new String[][]{
                {"https://www.youtube.com/watch?v=jZOg39v73c4","Video dari salah satu perkuliahan baru saja diupload","recent"},
                {"https://www.youtube.com/watch?v=jZOg39v73c4","Video dari salah satu perkuliahan baru saja diupload","recent"},
                {"https://www.youtube.com/watch?v=jZOg39v73c4","Video dari salah satu perkuliahan baru saja diupload","recent"},
                {"https://www.youtube.com/watch?v=jZOg39v73c4","Video dari salah satu perkuliahan baru saja diupload","recent"},
                {"https://www.youtube.com/watch?v=jZOg39v73c4","Video dari salah satu perkuliahan baru saja diupload","recent"}

        };

    public static ArrayList<Feed> getListData(){
        //Deklarasi Objek
        Feed feed = null;
        //Menyusun Objek ke dalam Array Objek
        ArrayList<Feed> list = new ArrayList<>();
        //Mengisi array yang masih kosong dengan isian data satu per satu dari array String
        for (int i = 0; i <data.length; i++) {
            feed = new Feed();
            feed.setLink(data[i][0]);
            feed.setFeed_detail(data[i][1]);
            feed.setTime(data[i][2]);
            list.add(feed);
        }
        return list;

    }
}
