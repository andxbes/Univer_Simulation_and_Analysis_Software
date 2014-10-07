/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package var_2.three.Factory.impl;

import var_2.three.Factory.interfaces.Factory;
import var_2.three.Wood_Industry.impl.furniture.Chair;
import var_2.three.Wood_Industry.impl.material.Plastic;
import var_2.three.Wood_Industry.interfaces.Furniture;
import var_2.three.Wood_Industry.interfaces.Material;

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
