package com.example.mylearningonline.AdapterSet;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mylearningonline.DataSetGet.Pesan;
import com.example.mylearningonline.R;

import java.util.ArrayList;

public class ListHandlerPesan extends RecyclerView.Adapter<ListHandlerPesan.CategoryViewHolder>{
        //private Context context;
        private ArrayList<Pesan> listPesan;
        //fungsi ini akan dipanggil nnti dalam void showrecylcle di main activity


    /* =========== MULAI SET GET LOCAL==================*/
    //deklarasi list dengan data bersumber dari BerandaSetGet yang di-listing di BerandaData
    private ArrayList<Pesan> getListPesan() {
        return listPesan;
    }

    public void setListPesan(ArrayList<Pesan> listPesan) {
        this.listPesan = listPesan;
    }
    /* ===========AKHIR SET GET LOCAL==================
    * DIPERGUNAKAN HANYA UNTUK PENGUJIAN, DAPAT DIHAPUS DIKEMUDIAN HARI*/

    @Override
        public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int
        viewType) {
            View itemRow =
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.list_pesan_row, parent, false);
            return new CategoryViewHolder(itemRow);
        }


        @Override
        public void onBindViewHolder(CategoryViewHolder holder, int position) {
            Pesan p = listPesan.get(position);
            final int number = position+1;
            //Untuk membuat kustomisasi Nama dengan penanda nomor. Fungsi holder tidak mendukung concate dua string secara langsung
            //String urut = String.valueOf(number)+". Latitude : "+p.getLatitude();
           //holder.tvLat.setText(urut);
           //holder.tvLong.setText("Posisi : "+p.getLongitude());
        }
        @Override
        public int getItemCount() {
            return listPesan.size();
        }


        public ListHandlerPesan(ArrayList<Pesan> listPesan) {
            this.listPesan = listPesan;
        }

        class CategoryViewHolder extends RecyclerView.ViewHolder{
            TextView tv_sender;
            TextView tv_message;
            //CardView Area;
            CategoryViewHolder(View itemView) {
                super(itemView);
                //koneksi view dan atribut control
                tv_sender= itemView.findViewById(R.id.sender_lay_mess);
                tv_message= itemView.findViewById(R.id.content_lay_mess);

            }
        }

}

