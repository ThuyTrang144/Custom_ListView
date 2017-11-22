package com.ex.phongtoda.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Phong Toda on 10/03/2017.
 */

public class Trai_cay_Adapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;

    public Trai_cay_Adapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() {  //tra ve so dong hien thi trong listview

        return traiCayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= inflater.inflate(layout,null);
        //anh xa view
        TextView tvTen=(TextView)view.findViewById(R.id.tv1);
        TextView tvMoTa =(TextView)view.findViewById(R.id.tv2);
        ImageView imgHinh = (ImageView)view.findViewById(R.id.imageviewHinh);

        //gan gia tri
        TraiCay traiCay = traiCayList.get(i);
        tvTen.setText(traiCay.getTen());
        tvMoTa.setText(traiCay.getMoTa());
        imgHinh.setImageResource(traiCay.getHinh());

        return view;
    }
}
