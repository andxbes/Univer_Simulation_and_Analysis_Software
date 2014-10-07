/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package var_2.three.Factory.interfaces;

import var_2.three.Wood_Industry.interfaces.Furniture;
import var_2.three.Wood_Industry.interfaces.Material;



/**
 *
 * @author Andr
 */
public interface Factory {
    public Furniture createFurniture();
    public Material createMaterial();
    
}
