package alura.com.aluraviagens.ui.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import alura.com.aluraviagens.R;
import alura.com.aluraviagens.ui.adapter.ListaPacotesAdapter;
import br.com.alura.aluraviagens.dao.PacoteDAO;
import br.com.alura.aluraviagens.model.Pacote;

public class ListaPacotesActivity extends AppCompatActivity {

    public static final String TITLE = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        setTitle(TITLE);

        configuraLista();
    }

    private void configuraLista() {
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listview);
        List<Pacote> lista = new PacoteDAO().lista();
        listaDePacotes.setAdapter(new ListaPacotesAdapter(lista, this));
    }
}