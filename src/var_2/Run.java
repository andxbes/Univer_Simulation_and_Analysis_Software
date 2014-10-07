/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package var_2;

import java.io.IOException;

/**
 *
 * @author Andr
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
	
	System.out.println("//================== Answer one =====================\\\\");
	var_2.one.Program.main(args);
	System.out.println("//============== The end answer one =================\\\\");
	
	System.out.println("//================== Answer two =====================\\\\");
	var_2.two.Program.main(args);
	System.out.println("//============== The end answer two =================\\\\");
	
	System.out.println("//================== Answer three =====================\\\\");
	var_2.three.Program.main(args);
	System.out.println("//============== The end answer three =================\\\\");
    }

}
