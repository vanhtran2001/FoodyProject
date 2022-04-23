package hcmute.spkt.nhom12.washdish_12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CuaHangAdapter extends RecyclerView.Adapter<CuaHangAdapter.CuaHangViewHolder> {

    private ArrayList<hcmute.spkt.nhom12.washdish_12.CuaHangItem> listCuaHang;
    private OnItemClickListener itemClickListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClicktener(OnItemClickListener listener) {
        itemClickListener = listener;
    }

    @NonNull
    @Override
    public CuaHangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cuahang_item,parent,false);
        CuaHangViewHolder cuaHangViewHolder = new CuaHangViewHolder(view,itemClickListener);
        return cuaHangViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CuaHangViewHolder holder, int position) {
        hcmute.spkt.nhom12.washdish_12.CuaHangItem cuaHangItem = listCuaHang.get(position);

        holder.anhCuaHang.setImageResource(cuaHangItem.getImageCuaHang());
        holder.tenCuaHang.setText(cuaHangItem.getNameCuaHang());
        holder.motaCuaHang.setText(cuaHangItem.getDesCuaHang());
    }

    @Override
    public int getItemCount() {
        return listCuaHang.size();
    }

    public void filterList(ArrayList<hcmute.spkt.nhom12.washdish_12.CuaHangItem> filteredList) {
        listCuaHang = filteredList;
        notifyDataSetChanged();
    }

    public static class CuaHangViewHolder extends RecyclerView.ViewHolder {
        public ImageView anhCuaHang;
        public TextView tenCuaHang;
        public TextView motaCuaHang;
        public CuaHangViewHolder(@NonNull View itemView, OnItemClickListener listener) {
            super(itemView);
            anhCuaHang = itemView.findViewById(R.id.imageCuaHang);
            tenCuaHang = itemView.findViewById(R.id.textviewTenCuaHang);
            motaCuaHang = itemView.findViewById(R.id.texviewMoTaCuaHang);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION) {
                            listener.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
    public CuaHangAdapter(ArrayList<hcmute.spkt.nhom12.washdish_12.CuaHangItem> mangCuaHang) {
        listCuaHang = mangCuaHang;
    }
}
