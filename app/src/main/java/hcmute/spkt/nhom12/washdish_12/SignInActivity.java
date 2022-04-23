package hcmute.spkt.nhom12.washdish_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        TextView sign_up = findViewById(R.id.textviewSignup);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FirstActivity.this,"Ban bam vao nut bam",Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.setClass(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
}