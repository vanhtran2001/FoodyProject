package hcmute.spkt.nhom12.washdish_12;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class QuanAnActivity extends AppCompatActivity {

    ListView lvMonAn;
    ImageView imgBack;
    TextView tvTenCuaHang;
    MonAnAdapter adapter;
    ArrayList<MonAnItem> listMonAn;
    MonAnDAO monAnDAO;
    CuaHangDAO cuaHangDAO;
    CuaHangItem cuaHangItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_quan_an);
        listMonAn = new ArrayList<>();
        cuaHangDAO = new CuaHangDAO(QuanAnActivity.this);
        monAnDAO = new MonAnDAO(QuanAnActivity.this);
        int idCuaHang = getIntent().getIntExtra("QuanAn",0);
        listMonAn = monAnDAO.getAllMonAnByIdCuaHang(idCuaHang);

        cuaHangItem = cuaHangDAO.find(idCuaHang);

        lvMonAn = (ListView)findViewById(R.id.listviewMonAn);
        imgBack = (ImageView)findViewById(R.id.imageviewBackQuanAn);
        tvTenCuaHang = (TextView) findViewById(R.id.textviewTenCuaHangQuanAn);

        //Toast.makeText(this, cuaHangItem.getNameCuaHang(), Toast.LENGTH_SHORT).show();
        tvTenCuaHang.setText(cuaHangItem.getNameCuaHang());

        adapter = new MonAnAdapter(QuanAnActivity.this, listMonAn);
        lvMonAn.setAdapter(adapter);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}