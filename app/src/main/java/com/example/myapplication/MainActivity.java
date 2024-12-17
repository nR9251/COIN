package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_coin;
    private TextView tv_times;
    private int times;
    private int tt;
    private int total;
    private int aa;
    private int bb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_coin = (ImageView)findViewById(R.id.coin);
        tv_times = (TextView)findViewById(R.id.times);
        tt = 0;
        total = 0;
    }

    public void CancelAction(View view) {
        tt = 0;
        total = 0;
        tv_times.setText(total + "次！");
    }

    public void LeftAction(View view) {
        if(tt!=0){

        }else{
            aa = (int)(Math.random()*1000) - 1;
            bb = aa%2 ;
            if(bb == -1){
                total +=1;
                iv_coin.setImageDrawable(getDrawable(R.drawable.tachi));
                tv_times.setText(total + "次！");
            }else if(bb == 0){
                total+=1;
                iv_coin.setImageDrawable(getDrawable( R.drawable.left));
                tv_times.setText(total + "次！");
            }else if (bb == 1){
                iv_coin.setImageDrawable(getDrawable( R.drawable.right));
                tt = 1;
            }
        }
    }

    public void RightAction(View view) {
        if (tt != 0) {

        } else {
            aa = (int) (Math.random() * 1000) - 1;
            bb = aa % 2;
            if (bb == -1){
                total +=1;
                iv_coin.setImageDrawable(getDrawable(R.drawable.tachi));
                tv_times.setText(total + "次！");
            }else if (bb == 1) {
                total += 1;
                iv_coin.setImageDrawable(getDrawable( R.drawable.right));
                tv_times.setText(total + "次！");
            } else if (bb == 0) {
                iv_coin.setImageDrawable(getDrawable( R.drawable.left));
                tt = 1;
            }
        }
    }
}