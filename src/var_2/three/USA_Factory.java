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
public class USA_Factory implements Factory{

    @Override
    public Furniture createFurniture() {
	return new Chair();
    }

    @Override
    public Material createMaterial() {
	return new Plastic();
    }
    
       @Override
    public String toString() {
	return "Prodaction  -  " + this.getClass().getSimpleName();
    }
}
