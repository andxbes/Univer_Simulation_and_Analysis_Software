/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package var_2.two;

public interface Aggregate<T> extends Iterable<T> {

    @Override
    public Iterator iterator();
    
}
