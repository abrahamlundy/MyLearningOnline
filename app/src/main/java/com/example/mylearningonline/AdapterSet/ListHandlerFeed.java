package com.example.mylearningonline.AdapterSet;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mylearningonline.DataSetGet.Feed;
import com.example.mylearningonline.DataSetGet.Pesan;
import com.example.mylearningonline.R;
import com.example.mylearningonline.StringCol;

import java.util.ArrayList;

public class ListHandlerFeed extends RecyclerView.Adapter<ListHandlerFeed.CategoryViewHolder>{
        //private Context context;
        private ArrayList<Feed> listFeed;
        //fungsi ini akan dipanggil nnti dalam void showrecylcle di main activity


    /* =========== MULAI SET GET LOCAL==================*/
    //deklarasi list dengan data bersumber dari BerandaSetGet yang di-listing di BerandaData
    private ArrayList<Feed> getListFeed() {
        return listFeed;
    }

    public void setListFeed(ArrayList<Feed> listFeed) {
        this.listFeed = listFeed;
    }
    /* ===========AKHIR SET GET LOCAL==================
    * DIPERGUNAKAN HANYA UNTUK PENGUJIAN, DAPAT DIHAPUS DIKEMUDIAN HARI*/

    @Override
        public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int
        viewType) {
            View itemRow =
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.list_home_feed, parent, false);
            return new CategoryViewHolder(itemRow);
        }


        @Override
        public void onBindViewHolder(CategoryViewHolder holder, int position) {
            Feed p = listFeed.get(position);
            final int number = position+1;
            //Untuk membuat kustomisasi Nama dengan penanda nomor. Fungsi holder tidak mendukung concate dua string secara langsung
            String urut ;

           holder.Tv_feed.setText(p.getFeed_detail());
           holder.Tv_time.setText(p.getTime());
           holder.wb.setImageResource(R.drawable.image_1);
        }
        @Override
        public int getItemCount() {
            return listFeed.size();
        }


        public ListHandlerFeed(ArrayList<Feed> listFeed) {
            this.listFeed = listFeed;
        }

        class CategoryViewHolder extends RecyclerView.ViewHolder{
            TextView tv_link,Tv_feed,Tv_time;
            ImageView wb;
            Button tonton;
            //CardView Area;
            CategoryViewHolder(View itemView) {
                super(itemView);
                //koneksi view dan atribut control;
                Tv_feed= itemView.findViewById(R.id.tv_feed);
                Tv_time= itemView.findViewById(R.id.tv_tgl);
                tonton = itemView.findViewById(R.id.btn_tonton);
                wb=itemView.findViewById(R.id.wbv_feed);
            }
        }

}

