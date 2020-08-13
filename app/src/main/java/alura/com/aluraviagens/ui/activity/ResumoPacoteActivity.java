package alura.com.aluraviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;

import alura.com.aluraviagens.R;
import alura.com.aluraviagens.model.Pacote;
import alura.com.aluraviagens.util.DiasUtil;
import alura.com.aluraviagens.util.MoedaUtil;
import alura.com.aluraviagens.util.ResourceUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        Pacote pacoteSaoPaulo = new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));

        ImageView imageView = findViewById(R.id.resumo_pacote_imageview);
        Drawable drawable = ResourceUtil.devolveDrawable(this, pacoteSaoPaulo.getImagem());
        imageView.setImageDrawable(drawable);

        TextView textLocal = findViewById(R.id.resumo_pacote_local);
        textLocal.setText(pacoteSaoPaulo.getLocal());

        TextView textDia = findViewById(R.id.resumo_pacote_dias);
        textDia.setText(DiasUtil.formataDias(pacoteSaoPaulo.getDias()));

        TextView textPreco = findViewById(R.id.resumo_pacote_preco);
        textPreco.setText(MoedaUtil.formataMoeda(pacoteSaoPaulo.getPreco()));
    }
}