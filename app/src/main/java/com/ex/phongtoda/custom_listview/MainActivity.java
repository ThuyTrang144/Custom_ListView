package com.ex.phongtoda.custom_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    ArrayList<TraiCay>traiCayArrayList;
    Trai_cay_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTraiCay = (ListView)findViewById(R.id.listviewTraiCay);
        traiCayArrayList= new ArrayList<>();
        //thêm dữ liệu firebase vao day
        traiCayArrayList.add(new TraiCay("Dâu tây","Dâu tây Đà Lạt",R.drawable.dau_tay));
        traiCayArrayList.add(new TraiCay("Chuối","Chuối Quảng Nam",R.drawable.chuoi));
        traiCayArrayList.add(new TraiCay("Chôm chôm","Chôm chôm Bình Định",R.drawable.chom_chom));
        traiCayArrayList.add(new TraiCay("Hồng","Hồng Trà Vinh",R.drawable.hong));
        traiCayArrayList.add(new TraiCay("Táo","Táo Hà Nội",R.drawable.tao));
        adapter = new Trai_cay_Adapter(this,R.layout.dong_trai_cay,traiCayArrayList);
        lvTraiCay.setAdapter(adapter);
    }
}
