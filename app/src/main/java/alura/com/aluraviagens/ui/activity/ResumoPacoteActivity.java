package alura.com.aluraviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import alura.com.aluraviagens.R;
import alura.com.aluraviagens.model.Pacote;
import alura.com.aluraviagens.util.DataUtil;
import alura.com.aluraviagens.util.DiasUtil;
import alura.com.aluraviagens.util.MoedaUtil;
import alura.com.aluraviagens.util.ResourceUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    public static final String TITLE = "Resumo do pacote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        setTitle(TITLE);

        Pacote pacoteSaoPaulo = new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));

        mostraImagem(pacoteSaoPaulo);
        mostrarLocal(pacoteSaoPaulo);
        mostraDia(pacoteSaoPaulo);
        mostraPreco(pacoteSaoPaulo);
        mostraDatas(pacoteSaoPaulo);

    }

    private void mostraImagem(Pacote pacote) {
        ImageView imageView = findViewById(R.id.resumo_pacote_imageview);
        Drawable drawable = ResourceUtil.devolveDrawable(this, pacote.getImagem());
        imageView.setImageDrawable(drawable);
    }

    private void mostraDatas(Pacote pacote) {
        TextView textData = findViewById(R.id.resumo_pacote_datas);
        String dataPacote = DataUtil.periodoEmTexto(pacote.getDias());
        textData.setText(dataPacote);
    }

    private void mostraPreco(Pacote pacote) {
        TextView textPreco = findViewById(R.id.resumo_pacote_preco);
        textPreco.setText(MoedaUtil.formataMoeda(pacote.getPreco()));
    }

    private void mostraDia(Pacote pacote) {
        TextView textDia = findViewById(R.id.resumo_pacote_dias);
        textDia.setText(DiasUtil.formataDias(pacote.getDias()));
    }

    private void mostrarLocal(Pacote pacote) {
        TextView textLocal = findViewById(R.id.resumo_pacote_local);
        textLocal.setText(pacote.getLocal());
    }
}