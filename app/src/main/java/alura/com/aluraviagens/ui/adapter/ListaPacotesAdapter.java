package alura.com.aluraviagens.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import alura.com.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import util.DiasUtil;
import util.MoedaUtil;
import util.ResourceUtil;

public class ListaPacotesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private final Context context;

    public ListaPacotesAdapter(List<Pacote> pacotes, Context context) {
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Pacote getItem(int i) {
        return pacotes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_pacote, viewGroup, false);

        Pacote pacote = pacotes.get(i);

        mostraImagem(inflate, pacote);
        mostrarLocal(inflate, pacote);
        mostraDias(inflate, pacote);
        mostraPreco(inflate, pacote);

        return inflate;
    }

    private void mostraPreco(View inflate, Pacote pacote) {
        TextView preco = inflate.findViewById(R.id.item_pacote_valor);
        String moeda = MoedaUtil.formataMoeda(pacote.getPreco());
        preco.setText(moeda);
    }

    private void mostraDias(View inflate, Pacote pacote) {
        TextView dias = inflate.findViewById(R.id.item_pacote_dias);
        String diasEmTexto = DiasUtil.formataDias(pacote.getDias());
        dias.setText(diasEmTexto);
    }

    private void mostraImagem(View inflate, Pacote pacote) {
        ImageView imagem = inflate.findViewById(R.id.item_pacote_imagem);
        Drawable resourcesDrawable = ResourceUtil.devolveDrawable(context, pacote.getImagem());
        imagem.setImageDrawable(resourcesDrawable);
    }

    private void mostrarLocal(View inflate, Pacote pacote) {
        TextView local = inflate.findViewById(R.id.item_pacote_local);
        local.setText(pacote.getLocal());
    }

}
