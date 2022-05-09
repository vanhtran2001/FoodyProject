package hcmute.spkt.nhom12.washdish_12.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import hcmute.spkt.nhom12.washdish_12.activity.CheckoutActivity;
import hcmute.spkt.nhom12.washdish_12.activity.QuanAnActivity;
import hcmute.spkt.nhom12.washdish_12.model.MonAnItem;
import hcmute.spkt.nhom12.washdish_12.R;

public class MonAnAdapter extends BaseAdapter {

    Context context;
    ArrayList<MonAnItem> listMonAn;

    public MonAnAdapter(Context context, ArrayList<MonAnItem> listMonAn) {
        this.context = context;
        this.listMonAn = listMonAn;
    }

    @Override
    public int getCount() {
        return listMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return listMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view = inflater.inflate(R.layout.monan_item, null);
            holder.tvTenMonAn = view.findViewById(R.id.textviewTenMonAn);
            holder.tvMoTaMonAn = view.findViewById(R.id.textviewMoTaMonAn);
            holder.tvGiaMonAn = view.findViewById(R.id.textviewGiaMonAn);
            holder.imgMonAn = view.findViewById(R.id.imageviewFood);
            holder.imgDatHang =  view.findViewById(R.id.imageviewDatHang);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        MonAnItem monAnItem = listMonAn.get(i);
        holder.tvTenMonAn.setText(monAnItem.getNameMonAn());
        holder.tvMoTaMonAn.setText(monAnItem.getDesMonAn());
        holder.tvGiaMonAn.setText(String.valueOf(monAnItem.getPriceMonAn()));
        String imgName = monAnItem.getImageMonAn();
        int resId = ((Activity)context).getResources().getIdentifier(imgName,"drawable",((Activity)context).getPackageName());
        holder.imgMonAn.setImageResource(resId);

        holder.imgDatHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CheckoutActivity.class);
                intent.putExtra("MonAn",monAnItem.getIdMonAn());
                intent.putExtra("CuaHang",monAnItem.getIdCuaHang());
                context.startActivity(intent);
            }
        });

        return view;
    }

    class ViewHolder {
        ImageView imgMonAn, imgDatHang;
        TextView tvTenMonAn, tvMoTaMonAn, tvGiaMonAn;
    }
}
