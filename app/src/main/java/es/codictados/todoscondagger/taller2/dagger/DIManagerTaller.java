package es.codictados.todoscondagger.taller2.dagger;

public class DIManagerTaller {

    private static ComponenteTaller sComponente;

    private DIManagerTaller(){}

    public static void init() {
        sComponente = DaggerComponenteTaller.builder()
                .build();
    }

    public static ComponenteTaller getComponente() {
        return sComponente;
    }
}
