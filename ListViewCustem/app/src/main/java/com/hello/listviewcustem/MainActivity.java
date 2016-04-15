package com.hello.listviewcustem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * 自定义  BaseAdapute
 */
public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustemListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listView);

        //初始化adapter
        adapter = new CustemListAdapter(this);

        listView.setAdapter(adapter);

        //模拟数据
        adapter.add(new Student("xiaoli",16));
        adapter.add(new Student("xiaohong",18));
        adapter.add(new Student("xiaoming",19));

    }
}
