package hcmute.spkt.nhom12.washdish_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView sign_in = findViewById(R.id.textviewSignin);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FirstActivity.this,"Ban bam vao nut bam",Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.setClass(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

    }
}