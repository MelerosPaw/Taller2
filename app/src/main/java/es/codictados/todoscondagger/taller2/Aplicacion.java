package es.codictados.todoscondagger.taller2;

import android.app.Application;

import es.codictados.todoscondagger.cajaherramientas.DIManagerCajaHerramientas;
import es.codictados.todoscondagger.taller2.dagger.DIManagerTaller;

public class Aplicacion extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DIManagerTaller.init();
        DIManagerCajaHerramientas.init();
    }
}
