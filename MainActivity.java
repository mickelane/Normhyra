package com.example.normhyra;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button1);
        final EditText et1 = (EditText)findViewById(R.id.hyra);
        final EditText et2 = (EditText)findViewById(R.id.yta);
        final EditText et3 = (EditText)findViewById(R.id.rum);
        final TextView result = (TextView)findViewById(R.id.textView1);
        btn.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                //int x = new Integer(et1.getText().toString());
                //int z = new Integer(et2.getText().toString());
                float h = new Float(et1.getText().toString());
                float y = new Float(et2.getText().toString());
                float r = new Float(et3.getText().toString());

                switch ((int) r) {
                    case 1:
                        r = 40;
                        break;
                    case 2:
                        r = 45;
                        break;
                    case 3:
                        r = 50;
                        break;
                    case 4:
                        r = 54;
                        break;
                    case 5:
                        r = 57;
                        break;
                    case 6:
                        r = 60;
                        break;
                }



                float res = y * h/(y + r)* (float)127/(float)77;

                //int sum = x + z;
                result.setText(String.format("Normhyran är  %.0f kr/kvm", res));
            }
        });
    }
}
