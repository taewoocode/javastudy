package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();


        //숫자만을 입력 하기를 기대
        numberList.add( 1 );
        numberList.add( 2 );
        numberList.add( "문자" );
        System.out.println( numberList );

        Integer num1 = (Integer) numberList.get( 0 );
        Integer num2 = (Integer) numberList.get( 1 );
    }
}
