package com.hello.listviewcustem;

import android.widget.TextView;

/**
 * Created by iwan on 16/4/15.
 */
public class CustomListCellViewHolder {

    private TextView tv_title,tv_age;

    public CustomListCellViewHolder(TextView tv_age, TextView tv_title) {
        this.tv_age = tv_age;
        this.tv_title = tv_title;
    }

    public TextView getTv_title() {
        return tv_title;
    }

    public TextView getTv_age() {
        return tv_age;
    }
}
