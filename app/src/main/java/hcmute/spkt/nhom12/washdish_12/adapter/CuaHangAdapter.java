package hcmute.spkt.nhom12.washdish_12.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import hcmute.spkt.nhom12.washdish_12.model.CuaHangItem;
import hcmute.spkt.nhom12.washdish_12.activity.QuanAnActivity;
import hcmute.spkt.nhom12.washdish_12.R;

public class CuaHangAdapter extends BaseAdapter {

    Context context;
    ArrayList<CuaHangItem> listCuaHang;

    public CuaHangAdapter (Context context, ArrayList<CuaHangItem> listCuaHang) {
        this.context = context;
        this.listCuaHang = listCuaHang;
    }
    @Override
    public int getCount() {
        return listCuaHang.size();
    }

    @Override
    public Object getItem(int i) {
        return listCuaHang.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            view = inflater.inflate(R.layout.cuahang_item,null);
            holder.tvTenCuaHang = view.findViewById(R.id.textviewTenCuaHang);
            holder.tvMoTaCuaHang = view.findViewById(R.id.texviewMoTaCuaHang);
            holder.imgCuaHang = view.findViewById(R.id.imageCuaHang);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        CuaHangItem cuaHangItem = listCuaHang.get(i);
        holder.tvTenCuaHang.setText(cuaHangItem.getNameCuaHang());
        holder.tvMoTaCuaHang.setText(cuaHangItem.getDesCuaHang());
        String imgName = cuaHangItem.getImageCuaHang();
        int resId = ((Activity)context).getResources().getIdentifier(imgName,"drawable",((Activity)context).getPackageName());
        holder.imgCuaHang.setImageResource(resId);
        holder.imgCuaHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(context, QuanAnActivity.class);
                intent.putExtra("QuanAn",cuaHangItem.getId());
                context.startActivity(intent);
            }
        });
        return view;
    }

    class ViewHolder {
        ImageView imgCuaHang;
        TextView tvTenCuaHang, tvMoTaCuaHang;
    }

    public void filterList(ArrayList<CuaHangItem> list) {
        listCuaHang = list;
        notifyDataSetChanged();
    }
}
