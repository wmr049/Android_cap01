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

    public void surpreenderUsuario(View v) {

        Intent intent = new Intent(SaudacaoActivity.ACAO_EXIBIR_SAUDACAO);
        intent.addCategory(SaudacaoActivity.CATEGORIA_SAUDACAO);
        String texto = nomeEditText.getText().toString();
        intent.putExtra(SaudacaoActivity.EXTRA_NOME_USUARIO, texto);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        this.saudacaoTestView = (TextView) findViewById(R.id.saudacaoTextView);
        this.saudacao = getResources().getString(R.string.saudacao);
    }

    @Override
    protected void onStart() {
        super.onStart();
// A activity está prestes a se tornar visível
    }

    @Override
    protected void onResume() {
        super.onResume();
// A activity está visível
    }

    @Override
    protected void onPause() {
        super.onPause();
/* Outra activity está recebendo o foco. Esta activity
ficará pausada */
    }

    @Override
    protected void onStop() {
        super.onStop();
// A activity não está mais visível
// mas permanece em memória
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
// A activity está prestes a ser destruída
// (removida da memória)
    }
}
