package br.com.casadocodigo.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mreis on 07/02/2016.
 */
public class MainActivity extends Activity {

    private EditText nomeEditText;
    private TextView saudacaoTestView;
    private String saudacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        this.saudacaoTestView = (TextView) findViewById(R.id.saudacaoTextView);
        this.saudacao = getResources().getString(R.string.saudacao);
    }


    public void surpreenderUsuario(View v) {
        Editable texto = this.nomeEditText.getText();
        String msg = saudacao + " " + texto.toString();

        this.saudacaoTestView.setText(msg);


    }
}
