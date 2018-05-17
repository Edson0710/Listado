package com.example.usuario.listado;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView Lista = (ListView) findViewById(R.id.Lista);
        OrigenDatos DataAdapter = new OrigenDatos();
        TarjetaAdapter adapter = new TarjetaAdapter();
        adapter.contexto = this;
        adapter.DataAdapter = DataAdapter.getDatos();
        Lista.setAdapter(adapter);
        adapter.Imagenes = DataAdapter.getImagen();



    }
}
