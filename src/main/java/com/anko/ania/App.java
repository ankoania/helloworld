package com.anko.ania;

import com.anko.ania.zwierzeta.Grayhound;
import com.anko.ania.zwierzeta.Pies;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        Pies pies1 = new Pies(10, "Burek");
        Pies pies2 = new Pies(pies1.getWiek()+2, pies1.getImie()+"s");

        ArrayList<Pies> mojePsy = new ArrayList<Pies>();

        for(int i=10; i<20; i++) {
            Pies nowyPies = new Pies(i + 10, "Burek numer " + i);
            if(i!=13) {
                mojePsy.add(nowyPies);
            }else {
                nowyPies.szczek();
            }
        }

        mojePsy.add(new Grayhound(14,"Szarak"));

        try {
            mojePsy.remove(59);
        }catch (Exception e) {
            System.out.println( "wyjatek byl!" );
        }

        System.out.println( "Hello World!" );
    }
}
