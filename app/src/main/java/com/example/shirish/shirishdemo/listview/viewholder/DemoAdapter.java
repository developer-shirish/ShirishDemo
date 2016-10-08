package com.example.shirish.shirishdemo.listview.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.shirish.shirishdemo.R;

import java.util.ArrayList;

/**
 * Created by shirish on 8/10/16.
 */

public class DemoAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<PoJo> poJoArrayList;
    private LayoutInflater inflater;

    public DemoAdapter(Context context, ArrayList<PoJo> poJos){
        this.context = context;
        this.poJoArrayList = poJos;
    }

    @Override
    public int getCount() {
        return poJoArrayList.size();
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
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){
            convertView = inflater.inflate(R.layout.list_item_1,null);

            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.text_name);
            holder.address = (TextView) convertView.findViewById(R.id.text_address);
            holder.age = (TextView) convertView.findViewById(R.id.text_age);

            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(poJoArrayList.get(position).getName());
        holder.address.setText(poJoArrayList.get(position).getAddress());
        holder.age.setText(poJoArrayList.get(position).getAge());

        return convertView;
    }

    static class ViewHolder{
        TextView name, address, age;
    }
}
