/*
 * все интрфейсы унаследовал от базовых , лишь для совместимости .
 * Базовые интерфейсы не имеют реализаций , и даже обладают большим количеством методов 
 * чем сдесь необходимо .Обращая внимание на пример в задаче , тут нужен 2 сторонний проход ,
 * а потому еще один метод .
 */
package var_2.two;

import java.util.List;

/**
 *
 * @author Andr
 * @param <T>
 */
public class ConcreteAggregate<T>  implements Aggregate<T>  {

    private final List<T> items ;

    public ConcreteAggregate(List<T> items) {
        this.items = items;
    }
    
    @Override
    public var_2.two.Iterator<T> iterator() {

    //анонимный  класс , реализация Iterator  для этой колекции 
	return new Iterator<T>() {
	    private int index = 0;

	    @Override
	    public boolean hasNext() {
		return index < items.size();
	    }

	    @Override
	    public T next() {
                return items.get(index++);
	    }

	}; 
    }
    
    //метод адаптер для Iterator , реверс 
    public Aggregate<T> reversed(){
          return new Aggregate<T>() {

	      @Override
	      public Iterator<T> iterator() {
                   return new Iterator<T>() {
                       private int curent  = items.size()-1;
		       @Override
		       public boolean hasNext() {
                             return curent > -1;
		       }

		       @Override
		       public T next() {
                           return items.get(curent--);
		       }
		   };
	      }
	  };
    }
    
}


