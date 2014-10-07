/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package var_2.three;



/**
 *
 * @author Andr
 */
public class UAFactory implements Factory{

    @Override
    public Furniture createFurniture() {
	return new Bed();
    }

    @Override
    public Material createMaterial() {
	return new Metal();
    }

    @Override
    public String toString() {
	return "Production  -  " + this.getClass().getSimpleName();
    }
    
    
    
}
