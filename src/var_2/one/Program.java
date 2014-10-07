/*
В лістингу 1 наведено приклад програмної реалізації паттерна Фасад (Facade) 
з пропущеними фрагментами коду, приведена діаграма класів та результат
роботи програми. Додайте необхідні фрагменти коду, щоб про-грама стала працездатною. 
 */
package var_2.one;

import java.io.IOException;

class SubSystemOne {

    public void methodOne() {
	System.out.println(" SubSystemOne Method ");
    }
}

class SubSystemTwo {

    public void methodTwo() {
	System.out.println(" SubSystemTwo Method ");
    }
}

class SubSystemThree {

    public void methodThree() {
	System.out.println(" SubSystemThree Method");
    }
}

class SubSystemFour {

    public void methodFour() {
	System.out.println(" SubSystemFour Method");
    }
}

class Facade {

    private SubSystemOne _one;
    private SubSystemTwo _two;
    private SubSystemThree _three;
    private SubSystemFour _four;

    public Facade() {
	_one = new SubSystemOne();
	_two = new SubSystemTwo();
	_three = new SubSystemThree();
	_four = new SubSystemFour();
    }

    public void methodA() {
	System.out.println("\nMethodA() ---- ");
	_one.methodOne();
	_two.methodTwo();
	_four.methodFour();
    }

    public void methodB() {
	System.out.println("\nMethodB() ---- ");
	_two.methodTwo();
	_three.methodThree();
    }
}

public class Program {

   public static void main(String[] args) throws  IOException {
       
	Facade facade = new Facade();
	facade.methodA();
	facade.methodB();
	
	System.out.println("\nPlease press \"enter\" to continue");
        System.in.read(); 
    }
}
