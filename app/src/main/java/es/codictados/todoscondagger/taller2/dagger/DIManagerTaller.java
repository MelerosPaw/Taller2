package es.codictados.todoscondagger.taller2.dagger;

public class DIManagerTaller {

    private static ComponenteTaller sComponente;

    private DIManagerTaller() {}

    public static ComponenteTaller getComponente() {

        if (sComponente == null) {
            sComponente = DaggerComponenteTaller.builder()
                    .build();
        }

        return sComponente;
    }
}
