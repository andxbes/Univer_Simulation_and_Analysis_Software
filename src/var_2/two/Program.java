/*
Задание:
По заданій діаграмі класів створити програмне забезпечення,
що реалізує паттерн Ітератор (Iterator).

*/
package var_2.two;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Andr
 */
public class Program {

    public static void main(String[] args) throws IOException {
	String[] s = {"Иванов", "Петров", "Сидоров", "Федоров"};

	ConcreteAggregate<String> testIterator =
		new ConcreteAggregate<>(Arrays.asList(s));
        
	System.out.println("Тест через for-each ,\n"
		+ " ибо он работает только с классами реализующими итератор \n");
	forech(testIterator);
	
	System.out.println("\nСписок в обратном порядке :\n");
	forech(testIterator.reversed());
	
	System.out.println("                  -----------                    ");
	
	System.out.println("\nПеребор итератора  классическим путем :\n");
	classic(testIterator);
	
	System.out.println("\nСписок в обратном порядке :\n");
	classic(testIterator.reversed());
	System.out.println("\nPlease press \"enter\" to continue");
	System.in.read();
 
    }
      
    //methods for print
    private static void forech(Aggregate<String> i){
            for(String s : i) 
		System.out.println(s);  
    }
    
    private static void classic(Aggregate<String> i){
        Iterator it = i.iterator();
	while(it.hasNext()){
	    System.out.println(it.next());
	}
    }
    
    
    
}
