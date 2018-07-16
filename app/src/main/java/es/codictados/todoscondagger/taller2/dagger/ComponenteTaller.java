package es.codictados.todoscondagger.taller2.dagger;

import javax.inject.Singleton;

import dagger.Component;
import es.codictados.todoscondagger.taller2.MainActivity;

@Singleton
@Component(modules = { ModuloTaller.class })
public interface ComponenteTaller {
    void inject(MainActivity activity);
}
