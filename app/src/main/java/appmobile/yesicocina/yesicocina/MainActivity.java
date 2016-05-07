package appmobile.yesicocina.yesicocina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imagenMain;
    private LinearLayout btn1;
    private LinearLayout btn2;
    private LinearLayout btn3;
    private LinearLayout btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenMain = (ImageView)findViewById(R.id.img);
        btn1 = (LinearLayout)findViewById(R.id.btn1);
        btn2 = (LinearLayout)findViewById(R.id.btn2);
        btn3 = (LinearLayout)findViewById(R.id.btn3);
        btn4 = (LinearLayout)findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(v.getContext(),RecetasActivity.class);
                startActivity(intent);
            }

        });

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(v.getContext(),RecetasActivity.class);
                startActivity(intent);
            }

        });

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(v.getContext(),RecetasActivity.class);
                startActivity(intent);
            }

        });

        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(v.getContext(),RecetasActivity.class);
                startActivity(intent);
            }

        });
    }
}
