package hcmute.spkt.nhom12.washdish_12.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import hcmute.spkt.nhom12.washdish_12.database.Database;
import hcmute.spkt.nhom12.washdish_12.R;
import hcmute.spkt.nhom12.washdish_12.global.Global;
import hcmute.spkt.nhom12.washdish_12.model.UserItem;

public class SignInActivity extends AppCompatActivity {

    EditText edtEmail,edtPassword;
    CheckBox cbRemember;
    Button btnLogin;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        edtEmail = (EditText)findViewById(R.id.email);
        edtPassword = (EditText)findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.buttonSignIn);
        cbRemember = (CheckBox)findViewById(R.id.checkBox);
        TextView sign_up = findViewById(R.id.textviewSignup);

        sharedPreferences = getSharedPreferences("dataLogin",MODE_PRIVATE);

        edtEmail.setText(sharedPreferences.getString("email",""));
        edtPassword.setText(sharedPreferences.getString("password",""));
        cbRemember.setChecked(sharedPreferences.getBoolean("checked",false));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Database database = new Database(getApplicationContext());
                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                UserItem user = database.checkLogin(email,password);
                if(user == null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setMessage("Sai tài khoản hoặc mật khẩu!");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.show();
                } else {
                    Intent intent = new Intent();
                    intent.setClass(SignInActivity.this, NavbarActivity.class);
                    intent.putExtra("account",user);
                    setResult(RESULT_OK,intent);
                    Global.setId(user.getId());
                    Global.setName(user.getFname());
                    Global.setPhone(user.getPhone());
                    Global.setAdrs(user.getAdrs());
                    startActivity(intent);
                    if(cbRemember.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("email",email);
                        editor.putString("password",password);
                        editor.putBoolean("checked",true);
                        editor.commit();
                    } else {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("email");
                        editor.remove("password");
                        editor.remove("checked");
                        editor.commit();
                    }
                }
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}