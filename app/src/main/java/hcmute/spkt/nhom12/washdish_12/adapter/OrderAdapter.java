package hcmute.spkt.nhom12.washdish_12.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import hcmute.spkt.nhom12.washdish_12.R;
import hcmute.spkt.nhom12.washdish_12.model.OrderItem;

public class OrderAdapter extends BaseAdapter {

    Context context;
    ArrayList<OrderItem> listOrder;

    public OrderAdapter (Context context, ArrayList<OrderItem> listOrder) {
        this.context = context;
        this.listOrder = listOrder;
    }

    @Override
    public int getCount() {
        return listOrder.size();
    }

    @Override
    public Object getItem(int i) {
        return listOrder.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view = inflater.inflate(R.layout.order_item, null);
            holder.tvCuaHang = view.findViewById(R.id.textviewTenCuaHangOrder);
            holder.tvMonAn = view.findViewById(R.id.textviewTenMonAnOrder);
            holder.tvGia = view.findViewById(R.id.textviewGiaMonAnOrder);
            holder.tvTrangThai = view.findViewById(R.id.textviewTrangThai);
            holder.btnXacNhan = view.findViewById(R.id.buttonXacNhan);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        OrderItem orderItem = listOrder.get(i);
        holder.tvCuaHang.setText(orderItem.getNameCuaHang());
        holder.tvMonAn.setText(orderItem.getNameMonAn());
        holder.tvGia.setText(String.valueOf(orderItem.getPrice()));


        return view;
    }

    class ViewHolder {
        TextView tvCuaHang, tvMonAn, tvGia, tvTrangThai;
        Button btnXacNhan;
    }

}
