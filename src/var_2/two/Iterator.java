/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package var_2.two;

/**
 *
 * @author Andr
 */
public interface Iterator<T> extends java.util.Iterator<T>{

    @Override
    public boolean hasNext();

    @Override
    public T next();

    
}
