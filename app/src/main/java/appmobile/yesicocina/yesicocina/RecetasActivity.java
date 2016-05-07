package appmobile.yesicocina.yesicocina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecetasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);


    }

    public List<Receta> obtenerRecetas(){

        List<Receta> lista = new ArrayList<>();

      /*  for (10){
        Receta r =new Receta();
        r.setTitulo("");
        r.setTitulo("");

            lista.add(r);
        }
*/
        return lista;
    }

}
