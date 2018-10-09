package com.example.greendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.greendao.dao.CardInfo;
import com.example.greendao.dao.CardInfoManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CardInfo> list;
    TextView tvShow;
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvShow = findViewById(R.id.tvshow);
        findViewById(R.id.tvinsert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1();
            }
        });
        findViewById(R.id.tvdelete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f3();
            }
        });

        findViewById(R.id.tvsearch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list = f2();
                if(list.size() == 0){
                    str = "";
                    tvShow.setText(str);
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    str+="名称："+list.get(i).getCard()+",";
                }
                tvShow.setText(str);
            }
        });

    }

    void f1(){
        CardInfo cardInfo = new CardInfo();
        cardInfo.setId(1l);
        cardInfo.setCard("测试1");
        cardInfo.setNum(001);

        CardInfo cardInfo2 = new CardInfo();
        cardInfo2.setId(2l);
        cardInfo2.setCard("测试2");
        cardInfo2.setNum(002);

        CardInfoManager.insert(cardInfo);
        CardInfoManager.insert(cardInfo2);
    }

    void f3(){
        CardInfoManager.deleteAll();
    }

    List<CardInfo> f2(){
        List<CardInfo> list = CardInfoManager.queryAll();
        return list;
    }
}
