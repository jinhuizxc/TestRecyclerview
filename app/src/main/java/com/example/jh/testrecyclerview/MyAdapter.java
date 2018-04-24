package com.example.jh.testrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jinhui on 2018/4/24.
 * email: 1004260403@qq.com
 *
 * https://blog.csdn.net/qq_26239671/article/details/54293735
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    //动态数组
    private List<ItemVO> mList;

    //构造
    public MyAdapter(List<ItemVO> mList) {
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //绑定行布局
        View view = View.inflate(parent.getContext(),R.layout.item,null);
        //实例化ViewHolder
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //设置数据
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //获取当前实体类对象
        ItemVO vo = mList.get(position);
        //设置
        holder.text.setText(vo.getmName());
        holder.img.setImageResource(vo.getmImg());
    }

    //数量
    @Override
    public int getItemCount() {
        return mList.size();
    }

    //内部类
    class ViewHolder extends RecyclerView.ViewHolder{
        //行布局中的控件
        ImageView img;
        TextView text;
        public ViewHolder(View itemView) {
            super(itemView);
            //绑定控件
            img = (ImageView) itemView.findViewById(R.id.item_img);
            text = (TextView) itemView.findViewById(R.id.item_text);
        }
    }
}
