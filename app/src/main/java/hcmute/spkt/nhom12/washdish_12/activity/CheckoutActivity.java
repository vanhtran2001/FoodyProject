package hcmute.spkt.nhom12.washdish_12.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import hcmute.spkt.nhom12.washdish_12.R;
import hcmute.spkt.nhom12.washdish_12.dao.CuaHangDAO;
import hcmute.spkt.nhom12.washdish_12.dao.MonAnDAO;
import hcmute.spkt.nhom12.washdish_12.database.Database;
import hcmute.spkt.nhom12.washdish_12.global.Global;
import hcmute.spkt.nhom12.washdish_12.model.CuaHangItem;
import hcmute.spkt.nhom12.washdish_12.model.MonAnItem;
import hcmute.spkt.nhom12.washdish_12.model.OrderItem;
import hcmute.spkt.nhom12.washdish_12.model.UserItem;

public class CheckoutActivity extends AppCompatActivity {

    TextView tvHoTen, tvSDT, tvDiachi, tvGia, tvTongCong, tvMonAn, tvCuaHang;
    ImageView imgBack;
    Button btnDatMon;
    MonAnDAO monAnDAO;
    CuaHangDAO cuaHangDAO;
    MonAnItem monAnItem;
    CuaHangItem cuaHangItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_out);

        tvHoTen = (TextView) findViewById(R.id.textviewFullName);
        tvSDT = (TextView) findViewById(R.id.textviewPhone);
        tvDiachi = (TextView) findViewById(R.id.textviewDiaChi);
        tvGia = (TextView) findViewById(R.id.textviewGiaMonAnCheckOut);
        tvTongCong = (TextView) findViewById(R.id.textviewTongCong);
        imgBack = (ImageView) findViewById(R.id.imageviewBackCheckOut);
        btnDatMon = (Button) findViewById(R.id.buttonDatMon);
        tvMonAn = (TextView) findViewById(R.id.textviewTenMonAnCheckOut);
        tvCuaHang = (TextView) findViewById(R.id.textviewTenCuaHangCheckOut);

        monAnDAO = new MonAnDAO(CheckoutActivity.this);
        cuaHangDAO = new CuaHangDAO(CheckoutActivity.this);

        tvHoTen.setText(Global.getName());
        tvSDT.setText(Global.getPhone());
        tvDiachi.setText(Global.getAdrs());

        int idMonAn = getIntent().getIntExtra("MonAn",0);
        int idCuaHang  = getIntent().getIntExtra("CuaHang", 0);
        monAnItem = monAnDAO.find(idMonAn);
        cuaHangItem = cuaHangDAO.find(idCuaHang);

        tvCuaHang.setText(cuaHangItem.getNameCuaHang());
        tvMonAn.setText(monAnItem.getNameMonAn());
        tvGia.setText(String.valueOf(monAnItem.getPriceMonAn()));
        tvTongCong.setText(String.valueOf(monAnItem.getPriceMonAn() + 15000));

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btnDatMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Database database = new Database(getApplicationContext());
                    OrderItem order = new OrderItem();
                    order.setNameCuaHang(tvCuaHang.getText().toString());
                    order.setNameMonAn(tvMonAn.getText().toString());
                    order.setPrice(Integer.parseInt(tvTongCong.getText().toString()));
                    order.setIdUser(Global.getId());
                    database.themOrder(order);
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setMessage("Đặt hàng thành công! Vui lòng chờ và xác nhận đơn hàng trong mục Đơn hàng.");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent =  new Intent();
                            intent.setClass(CheckoutActivity.this, NavbarActivity.class);
                            startActivity(intent);
                        }
                    });
                    builder.show();
                } catch (Exception e){
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setMessage(e.getMessage());
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.show();
                }
            }
        });

    }

}