package com.example.saito.anbayashiapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);

        // trueに設定すると、サイズが変わらない。パフォーマンスも向上する
        recyclerView.setHasFixedSize(true);

        // レイアウトを決めるレイアウトマネージャーにセット
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        // 縦方向にスクロール
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // リサイクルビューにレイアウトマネージャーをセット
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<AnbayashiData> anbayashiDatas = new ArrayList<AnbayashiData>();

        MyData myData = new MyData();
        ArrayList<Integer> number = myData.getCreatedNumber();
        ArrayList<Integer> addition = myData.getCreateAddition();
        ArrayList<String> comment = myData.getCreateComment();

        for (int i = 0; i < MyData.DATACOUNT; i++) {
            anbayashiDatas.add(new AnbayashiData(
                    number.get(i).intValue(),
                    addition.get(i).intValue(),
                    comment.get(i)
            ));
        }

        RecyclerView.Adapter adapter = new AnbayashiAdapter(anbayashiDatas);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(anbayashiDatas.size() -1); //最後までスクロール

    }
}
