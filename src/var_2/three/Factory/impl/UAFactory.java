/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package var_2.three.Factory.impl;

import var_2.three.Factory.interfaces.Factory;
import var_2.three.Wood_Industry.impl.furniture.Bed;
import var_2.three.Wood_Industry.impl.material.Metal;
import var_2.three.Wood_Industry.interfaces.Furniture;
import var_2.three.Wood_Industry.interfaces.Material;

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
