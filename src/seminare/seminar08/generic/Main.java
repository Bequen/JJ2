package seminare.seminar08.generic;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //krabicka pro integery
	    BoxInt intBox = new BoxInt(1);

        //obecnejsi krabicka (double zvladne i int, ale chovani je trochu jine...)
        BoxDouble doubleBox = new BoxDouble(1);
        BoxDouble doubleBox2 = new BoxDouble(1.0);

        //jeste obecnejsi krabicka (Number je predek vsech cisel)
        BoxNumber numberBox1 = new BoxNumber(1);
        BoxNumber numberBox2 = new BoxNumber(1.0);
        BoxNumber numberBox3 = new BoxNumber(new BigDecimal(1));

        //obsah krabicky jako double
        System.out.println(numberBox2.getValue().doubleValue());

        //krabicka pro pole je uz ale uplne jina...
        BoxArray arrayBox = new BoxArray(new int[]{1,1,1});

        //krabicka pro object to zdanlive resi, ...
        BoxObject objectBox1 = new BoxObject(1);
        BoxObject objectBox2 = new BoxObject(1.0);
        BoxObject objectBox3 = new BoxObject(new BigDecimal(1));
        BoxObject objectBox4 = new BoxObject(new int[]{1,1,1});


        //... ale ...
        int bo1Val = (int)objectBox1.getValue();
        double bo2Val = (double)objectBox2.getValue();
        BigDecimal bo3Val = (BigDecimal)objectBox3.getValue();
        int[] bo4Val = (int[])objectBox4.getValue();
        //... toto je dost nachylne k chybam
        // programator si musi pamatovat, kam co dal
        // realne se vzdavame typove kontroly


        //mimo to si vsimnete, ze vsechny krabicky maji skoro stejny kod
        // - lisi se jen v typech


        // generika - jedna genericka trida
        // nam diky pridani typoveho parametru
        // umozni "generovat" vsechny tridy vyse na pozadani


        //diamond notation pri vytvareni instance
        GenericBox<Integer> genericBoxInt = new GenericBox<>(1);

        GenericBox<Double> genericBoxDouble1 = new GenericBox<>(Double.valueOf(1));
        GenericBox<Double> genericBoxDouble2 = new GenericBox<>(1.0);

        GenericBox<Number> genericBoxNumber1 = new GenericBox<>(1);
        GenericBox<Number> genericBoxNumber2 = new GenericBox<>(1.0);
        GenericBox<Number> genericBoxNumber3 = new GenericBox<>(new BigDecimal(1));

        GenericBox<int[]> genericBoxArray1 = new GenericBox<>(new int[]{1,1,1});

        GenericBox<Object> genericBoxObject1 = new GenericBox<>(1);
        GenericBox<Object> genericBoxObject2 = new GenericBox<>(1.0);
        GenericBox<Object> genericBoxObject3 = new GenericBox<>(new BigDecimal(1));
        GenericBox<Object> genericBoxObject4 = new GenericBox<>(new int[]{1,1,1});

        //tedy misto peti ruznych krabic, nam staci jeden predpis pro krabice
        //a kdyz nekdo bude chtit krabici, tak si rekne pro jaky typ

        //typicky se pouziva pro kolekce - vizte dale
        //ale lze pouzit i jinde

        //vice typovych parametru a jejich omezeni
        // - trida ComparablePair<U,V>
        ComparablePair<ExtendedItemA, ExtendedItemB> pair =
                new ComparablePair<>(
                        new ExtendedItemA(100, 15),
                        new ExtendedItemB(150, 2));
        System.out.println(pair.min());
    }



    //JINE POUZITI GENERIKY

    //metody s generickymi parametry
    public static double sumOfList1(CustomDataStructure<Number> customDataStructure) {
        double s = 0.0;
        for (Number n : customDataStructure)
            s += n.doubleValue();
        return s;
    }

    //vs

    public static double sumOfList2(CustomDataStructure<? extends Number> customDataStructure) {
        double s = 0.0;
        for (Number n : customDataStructure)
            s += n.doubleValue();
        return s;
    }

    //tedy <? extends Number> je horni mez - musi to byt odvozeno od Number
    CustomDataStructure<? extends Number> numbersExtendsNumber = new CustomDataStructure<Number>();  // Number "dědí" Number
    CustomDataStructure<? extends Number> integersExtendsNumber = new CustomDataStructure<Integer>(); // Integer dědí Number
    CustomDataStructure<? extends Number> doublesExtendsNumber = new CustomDataStructure<Double>();  // Double dědí Number

    //podobne mame <? super Number> - dolni mez - Number musi byt odvozeno od pouziteho typu
    CustomDataStructure<? super Integer> numbersSuperInteger = new CustomDataStructure<Integer>();  // Integer je "superclass" třídy Integer
    CustomDataStructure<? super Integer> integerSuperInteger = new CustomDataStructure<Number>();   // Number je superclass třídy Integer
    CustomDataStructure<? super Integer> ObjectSuperInteger = new CustomDataStructure<Object>();   // Object je superclass třídy Integer

    //existuji jeste genericke metody, ale to je ted trochu moc - zajemci kouknete do dokumentace

    // vice typovych parametru
    // omezeni na typove parametry - extends pouzivame ve smyslu dedeni tridy i implementace rozhrani
    // vice omezeni kombinujeme pomoci &
    //zde za T lze dosadit typ, ktery dedi z BaseItem a navic implementuje Comparable vuci U
    // u U jsou podminky analogicke
    public static class ComparablePair<T extends BaseItem & Comparable<U>, U extends BaseItem & Comparable<T>> {
        T x;
        U y;

        public ComparablePair(T x, U y) {
            this.x = x;
            this.y = y;
        }

        public T getX() {
            return x;
        }

        //spoleham na to, ze T je potomkem BaseItem
        public int getXParentValue(){
            return getX().value;
        }

        public U getY() {
            return y;
        }

        public void setX(T x) {
            this.x = x;
        }

        public void setY(U y) {
            this.y = y;
        }

        public Object min(){
            //spoleham na implemetaci Comparable<U> v T
            if (getX().compareTo(getY()) <= 0) {
                return getX();
            }
            return getY();
        }

        // co se stane, kdyz umazete
        // nektery z pozadavku na typove parametry T a U?
        // umazat lze omezeni jen u jednoho, u ktereho a proc?
    }
}
