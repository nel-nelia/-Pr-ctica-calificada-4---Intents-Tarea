package com.example.upt.foodtruck_salamanca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_nombre;
    CheckBox ckb_opcion1;
    CheckBox ckb_opcion2;
    CheckBox ckb_opcion3;
    CheckBox ckb_opcion4;
    CheckBox ckb_opcion5;
    CheckBox ckb_opcion6;
    Button btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nombre = (EditText) findViewById(R.id.edt_nombre);
        btn_enviar = (Button) findViewById(R.id.btn_enviar);
        ckb_opcion1 = (CheckBox) findViewById(R.id.ckb_op1);
        ckb_opcion2 = (CheckBox) findViewById(R.id.ckb_op2);
        ckb_opcion3 = (CheckBox) findViewById(R.id.ckb_op3);
        ckb_opcion4 = (CheckBox) findViewById(R.id.ckb_op4);
        ckb_opcion5 = (CheckBox) findViewById(R.id.ckb_op5);
        ckb_opcion6 = (CheckBox) findViewById(R.id.ckb_op6);

        btn_enviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent sendIntent = new Intent();
                String nombre = edt_nombre.getText().toString();

                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,edt_nombre.getText().toString());

                if (ckb_opcion1.isChecked()) {

                    Toast t = Toast.makeText(getApplicationContext(),"Pedido del cliente "+nombre+" agregado", Toast.LENGTH_SHORT);
                    t.show();
                    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion1.getText().toString());
                }
                else if (ckb_opcion2.isChecked())
                {
                    Toast t = Toast.makeText(getApplicationContext(),"Pedido del cliente "+nombre+" agregado", Toast.LENGTH_SHORT);
                    t.show();
                    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion2.getText().toString());

                }
                else if (ckb_opcion3.isChecked())
                {
                    Toast t = Toast.makeText(getApplicationContext(),"Pedido del cliente "+nombre+" agregado", Toast.LENGTH_SHORT);
                    t.show();
                    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion3.getText().toString());
                }
                else if (ckb_opcion4.isChecked())
                {
                    Toast t = Toast.makeText(getApplicationContext(),"Pedido del cliente "+nombre+" agregado", Toast.LENGTH_SHORT);
                    t.show();
                    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion4.getText().toString());
                }
                else if (ckb_opcion5.isChecked())
                {
                    Toast t = Toast.makeText(getApplicationContext(),"Pedido del cliente "+nombre+" agregado", Toast.LENGTH_SHORT);
                    t.show();
                    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion5.getText().toString());
                }
                else if (ckb_opcion6.isChecked())
                {
                    Toast t = Toast.makeText(getApplicationContext(),"Pedido del cliente "+nombre+" agregado", Toast.LENGTH_SHORT);
                    t.show();
                    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion6.getText().toString());
                }

                sendIntent.setType("text/plain");

                if(null != sendIntent.resolveActivity(getPackageManager()))
                {
                    startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
                }
            }
        });
    }
}
