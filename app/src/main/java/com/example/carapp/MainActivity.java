package com.example.carapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

import com.dlong.rep.dlroundmenuview.DLRoundMenuView;
import com.dlong.rep.dlroundmenuview.Interface.OnMenuClickListener;
import com.dlong.rep.dlroundmenuview.Interface.OnMenuTouchListener;

public class MainActivity extends AppCompatActivity {
    private DLRoundMenuView dlRoundMenuView;
    private Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dlRoundMenuView = findViewById(R.id.dl_rmv);
        dlRoundMenuView.setOnMenuClickListener(new OnMenuClickListener() {
            @Override
            public void OnMenuClick(int position) {
                //Toast.makeText(mContext, "点击了："+position,Toast.LENGTH_SHORT).show();
                Log.e("TAG", "点击了："+position);
            }
        });
        dlRoundMenuView.setOnMenuTouchListener((event, position) -> {
            Toast.makeText(mContext, "点击了："+position+event.toString(),Toast.LENGTH_SHORT).show();
        });
    }
}