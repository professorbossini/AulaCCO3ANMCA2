package br.com.bossini.meuprimeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflando a view
        setContentView(R.layout.activity_main);
        //Toast.makeText(this, "Exibindo uma mensagem numa torrada", Toast.LENGTH_SHORT).show();

    }

    public void sendMessage (View view){
        //Toast.makeText(this, ((Button) view).getText(), Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String s = editText.getEditableText().toString();
        i.putExtra("msg", s);
        startActivity(i);
    }

    public static final String msg = "msg";
}
