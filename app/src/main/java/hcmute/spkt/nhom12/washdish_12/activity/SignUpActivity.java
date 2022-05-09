package hcmute.spkt.nhom12.washdish_12.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import hcmute.spkt.nhom12.washdish_12.database.Database;
import hcmute.spkt.nhom12.washdish_12.R;
import hcmute.spkt.nhom12.washdish_12.model.UserItem;

public class SignUpActivity extends AppCompatActivity {

    private EditText edtEmail, edtPassword, edtFname, edtPhone, edtAddress;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtEmail = (EditText)findViewById(R.id.edittextEmail);
        edtPassword = (EditText)findViewById(R.id.edittextPassword);
        edtFname = (EditText)findViewById(R.id.edittextFname);
        edtPhone = (EditText)findViewById(R.id.edittextPhone);
        edtAddress = (EditText)findViewById(R.id.edittextAddress);
        TextView sign_in = findViewById(R.id.textviewSignin);
        btnSignUp = (Button)findViewById(R.id.buttonSignup);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Database database = new Database(getApplicationContext());
                    UserItem user = new UserItem();
                    user.setEmail(edtEmail.getText().toString());
                    user.setPassword(edtPassword.getText().toString());
                    user.setFname(edtFname.getText().toString());
                    user.setPhone(edtPhone.getText().toString());
                    user.setAdrs(edtAddress.getText().toString());
                    UserItem userItem = database.checkEmailExists(edtEmail.getText().toString());
                    if(userItem == null) {
                        if (database.themUser(user)) {
                            Intent intent = new Intent();
                            intent.setClass(SignUpActivity.this, SignInActivity.class);
                            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                            builder.setMessage("Đăng kí thành công!");
                            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    startActivity(intent);
                                }
                            });
                            builder.show();
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                            builder.setMessage("Đăng ký thất bại!");
                            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            });
                            builder.show();
                        }
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                        builder.setMessage("Email đã tồn tại!");
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                        builder.show();
                    }
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
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}