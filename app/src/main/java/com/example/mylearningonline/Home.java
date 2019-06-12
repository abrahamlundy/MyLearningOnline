package com.example.mylearningonline;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mylearningonline.AdapterSet.ListHandlerFeed;
import com.example.mylearningonline.AdapterSet.ListHandlerMatkul;
import com.example.mylearningonline.DataSample.Data_Feed;
import com.example.mylearningonline.DataSample.Data_Matkul;
import com.example.mylearningonline.DataSetGet.Feed;
import com.example.mylearningonline.DataSetGet.Matkul;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;


/*
  A simple {@link Fragment} subclass.
  Activities that contain this fragment must implement the
  {@link Home.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home extends Fragment {
    //  Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    //  Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    private OnFragmentInteractionListener mListener;


    /*
    *
    *
    *
    * */

    private RecyclerView rv_home,rv_home2;
    private ArrayList<Feed> listfeed;
    private ArrayList<Matkul> listmatkul;
    RecyclerView.LayoutManager lm;
    ListHandlerFeed adapter2;
    ListHandlerMatkul adapter1;

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};


    public Home() {
        // Required empty public constructor
    }

    /*
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */


    // Rename and change types and number of parameters

    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        carouselView = view.findViewById(R.id.carouselView);
        carouselView.setImageListener(imageListener);
        carouselView.setPageCount(sampleImages.length);

        rv_home = view.findViewById(R.id.rc_ly_matkul);
        rv_home.setHasFixedSize(true);

        rv_home2 = view.findViewById(R.id.rc_ly_feed);
        rv_home2.setHasFixedSize(true);

        listfeed = new ArrayList<>();
        listmatkul = new ArrayList<>();
        listfeed.addAll(Data_Feed.getListData());
        listmatkul.addAll(Data_Matkul.getListData());

        adapter1=new ListHandlerMatkul(listmatkul);
        adapter2=new ListHandlerFeed(listfeed);

        aturAdapter(rv_home,adapter1);
        aturAdapter(rv_home2,adapter2);


    }

    public void aturAdapter(RecyclerView rv_base, RecyclerView.Adapter adapter){
        rv_base.setAdapter(adapter);
        rv_base.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_base.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        // rv_pesan.setLayoutManager(lm);
    }

    public void perbarui_list(RecyclerView.Adapter adapter){
        adapter.notifyDataSetChanged();
    }


    //  Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {

        }
    }



    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

    public interface OnFragmentInteractionListener {
        //  Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
