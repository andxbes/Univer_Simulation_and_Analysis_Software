/*
   Застосувати паттерн Абстрактна фабрика для сімейств класів:
1) Меблі та його нащадки „Стіл”, „Стілець”, „Ліжко”
2) Матеріали та його нащадки „Дерево”, „Метал”.
На екран видавати назву типу екземпляру класу, що створюється в клієнтському коді. 

 */

package var_2.three;

import java.util.Scanner;
import var_2.three.Factory.impl.UAFactory;
import var_2.three.Factory.impl.USA_Factory;
import var_2.three.Factory.interfaces.Factory;

/**
 *
 * @author Andr
 */
public class Program {
    public static void main(String ... args) {
       Factory factory ;
       System.out.println("Select Factory : \n 1)Ukraine ;\n 2)USA;\n");
       String select = new Scanner(System.in).next();

        switch(select){
	    case "1" : factory = new UAFactory();
		break;
            case"2": factory = new USA_Factory();
                    break;
		default: System.out.println("Selection error");
		  return;
	}
	
	
	System.out.println(factory);
	System.out.println(factory.createFurniture());
	System.out.println(factory.createMaterial());
	
	
	 
	
	 
    }
}
