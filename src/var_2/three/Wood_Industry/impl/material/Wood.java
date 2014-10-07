/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package var_2.three.Wood_Industry.impl.material;

import var_2.three.Wood_Industry.interfaces.Material;

/**
 *
 * @author Andr
 */
public class Wood implements Material{
    @Override
    public String toString() {
	return this.getClass().getSimpleName();
    }
}
