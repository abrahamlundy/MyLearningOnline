package com.example.mylearningonline.AdapterSet;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mylearningonline.DataSetGet.Matkul;
import com.example.mylearningonline.R;

import java.util.ArrayList;

public class ListHandlerMatkul extends RecyclerView.Adapter<ListHandlerMatkul.CategoryViewHolder>{
        //private Context context;
        private ArrayList<Matkul> listMatkul;
        //fungsi ini akan dipanggil nnti dalam void showrecylcle di main activity


    /* =========== MULAI SET GET LOCAL==================*/
    //deklarasi list dengan data bersumber dari BerandaSetGet yang di-listing di BerandaData
    private ArrayList<Matkul> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<Matkul> listMatkul) {
        this.listMatkul = listMatkul;
    }
    /* ===========AKHIR SET GET LOCAL==================
    * DIPERGUNAKAN HANYA UNTUK PENGUJIAN, DAPAT DIHAPUS DIKEMUDIAN HARI*/

    @Override
        public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int
        viewType) {
            View itemRow =
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.list_matkul_row, parent, false);
            return new CategoryViewHolder(itemRow);
        }


        @Override
        public void onBindViewHolder(CategoryViewHolder holder, int position) {
            Matkul p = listMatkul.get(position);
            final int number = position+1;
            //Untuk membuat kustomisasi Nama dengan penanda nomor. Fungsi holder tidak mendukung concate dua string secara langsung
            String urut ;

           holder.tv_matkul.setText(p.getKode_matkul()+" "+p.getNama_matkul());
           holder.tv_detail.setText(p.getNama_dosen()+p.getSks());
           //holder.wb.setImageResource(R.drawable.image_1);
        }
        @Override
        public int getItemCount() {
            return listMatkul.size();
        }


        public ListHandlerMatkul(ArrayList<Matkul> listMatkul) {
            this.listMatkul = listMatkul;
        }

        class CategoryViewHolder extends RecyclerView.ViewHolder {
            TextView tv_matkul, tv_detail;
            ImageView wb;
            Button tonton;

            //CardView Area;
            CategoryViewHolder(View itemView) {
                super(itemView);
                //koneksi view dan atribut control;
                tv_matkul = itemView.findViewById(R.id.tv_nama_kuliah);
                tv_detail = itemView.findViewById(R.id.tv_dosen_sks);

            }
        }

}

