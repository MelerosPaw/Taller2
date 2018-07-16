package es.codictados.todoscondagger.taller2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.codictados.todoscondagger.cajaherramientas.Grasa;
import es.codictados.todoscondagger.cajaherramientas.MartilloPercutor;
import es.codictados.todoscondagger.taller2.dagger.DIManagerTaller;

public class MainActivity extends AppCompatActivity {

    @Inject MartilloPercutor mMartilloPercutor1;
    @Inject MartilloPercutor mMartilloPercutor2;
    @Inject MartilloPercutor mMartilloPercutor3;
    @Inject Grasa mGrasa1;
    @Inject Grasa mGrasa2;
    @Inject Grasa mGrasa3;

    @BindView(R.id.scroll)          ScrollView scroll;
    @BindView(R.id.resultados)      TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DIManagerTaller.getComponente().inject(this);
        mostrarInformacion();
    }

    public void mostrarInformacion() {
        incluirResultado(mGrasa1.getDescripcion());
        incluirResultado(mGrasa2.getDescripcion());
        incluirResultado(mGrasa3.getDescripcion());
        incluirResultado(mMartilloPercutor1.getDescripcion());
        incluirResultado(mMartilloPercutor2.getDescripcion());
        incluirResultado(mMartilloPercutor3.getDescripcion());
    }

    private void incluirResultado(String resultado) {
        String nuevoResultado = resultados.getText() + resultado + "\n\n";
        resultados.setText(nuevoResultado);
        scrollHastaElFinal();
    }

    private void scrollHastaElFinal() {
        scroll.post(new Runnable() {
            @Override
            public void run() {
                scroll.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });
    }
}
