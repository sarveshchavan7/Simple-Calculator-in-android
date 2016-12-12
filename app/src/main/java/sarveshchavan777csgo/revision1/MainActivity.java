package sarveshchavan777csgo.revision1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    Button b1,b2,b3,b4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.edt1);
        e2=(EditText)findViewById(R.id.edt2);
        t1=(TextView)findViewById(R.id.txt1);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.sub);
        b3=(Button)findViewById(R.id.mul);
        b4=(Button)findViewById(R.id.div);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int s1=Integer.parseInt(e1.getText().toString());
                int s2=Integer.parseInt(e2.getText().toString());
                InputMethodManager mm=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                mm.hideSoftInputFromWindow(b1.getWindowToken(),0);
                int k=s1+s2;
                t1.setText("Addition is: "+k);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int s1=Integer.parseInt(e1.getText().toString());
                int s2=Integer.parseInt(e2.getText().toString());
                int k=s1-s2;
                InputMethodManager mm=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                mm.hideSoftInputFromWindow(b2.getWindowToken(),0);
                t1.setText("Substraction: "+k);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               int s1=Integer.parseInt(e1.getText().toString());
               int s2=Integer.parseInt(e2.getText().toString());
                int k=s1*s2;
               InputMethodManager mm=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
               mm.hideSoftInputFromWindow(b3.getWindowToken(),0);
                t1.setText("Multiplication: "+k);
           }
       });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s1=Integer.parseInt(e1.getText().toString());
                int s2=Integer.parseInt(e2.getText().toString());

                if(s2==0)
                {
                    InputMethodManager mm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    mm.hideSoftInputFromWindow(b4.getWindowToken(), 0);
                 t1.setText("please :( dont div my zero");
                }
                else {
                    int k = s1 / s2;
                    InputMethodManager mm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    mm.hideSoftInputFromWindow(b4.getWindowToken(), 0);
                    t1.setText("Division: " + k);
                }
            }
       });

    }
}
