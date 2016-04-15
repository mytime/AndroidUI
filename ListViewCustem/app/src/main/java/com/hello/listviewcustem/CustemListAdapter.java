package com.hello.listviewcustem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iwan on 16/4/15.
 */
public class CustemListAdapter extends BaseAdapter{

    private Context context;
    //Student类型的数组
    private List<Student> students = new ArrayList<>();
    //公开
    public Context getContext() {
        return context;
    }
    //构造
    public CustemListAdapter(Context context) {
        this.context = context;
    }

    public void add(Student s){
        students.add(s);
    }


    //BaseAdapter的四个公开的get方法，用来操作ArrayList()

    @Override
    public int getCount() {
        return students.size(); //数组的总条数,每一条都是一个对象
    }

    @Override
    public Student getItem(int position) {
        return students.get(position); //获取被点击的那个对象
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if(convertView==null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custem_listview,null);

            holder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            holder.tv_age = (TextView) convertView.findViewById(R.id.tv_age);


            convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        Student item = getItem(position);
        holder.tv_title.setText(item.getName());
        holder.tv_age.setText(item.getAge()+""); //需要转换成字符创类型

        return convertView;
    }

    //优化类
    class ViewHolder{
        TextView tv_title;
        TextView tv_age;
    }




}
