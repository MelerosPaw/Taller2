package es.codictados.todoscondagger.taller2.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import es.codictados.todoscondagger.cajaherramientas.MartilloPercutor;
import es.codictados.todoscondagger.cajaherramientas.ModuloCajaHerramientas;

@Module(includes = ModuloCajaHerramientas.class)
public class ModuloTaller {

    @Provides
    @Singleton
    protected MartilloPercutor provideMartilloPercutor() {
        return new MartilloPercutor();
    }
}
