package generic.test.unit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println( "이름: " + unit.getName() + ", HP: " + unit.getHp() );
    }

    public static <T> void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit unit = t1.out();
        System.out.println( "이름: " + unit.getName() + " , HP: " + unit.getHp() );
    }
}

