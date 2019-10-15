# Lab 2 - Random Writing : Thought Questions

_Self Check_ Problem 3.2: What is the difference between the add(v) and add(i,v) methods of Vector?
  * *The add(v) method of Vector adds the v object to the end of the array while the add(i,v) method of Vector inserts the v object to the specified index at i.*

_Self Check_ Problem 3.3: What is the difference between the add(i,v) method and the set(i,v) method?
  * *The add(i,v) method inserts an object v at the index specified by i, while the set(i,v) method changes the value at index i to object v without moving the other objects in the array.*

_Self Check_ Problem 3.4: What is the difference between the remove(v) method (v is an Object value), and the remove(i) (i is an int)?
  * *The remove(v) method deletes the element in the vector that corresponds to Object value v, while the remove(i) method deletes the Object at index i.*

Problem 3.6: Consider a fictional class called BitVector that has an interface similar to Vector, but the values stored within the BitVector are all known to be boolean (the primitive type). What is the primary advantage of having a special-purpose vector, like BitVector?
  * *The primary advantage of having a special-purpose vector is that all the elements of the vector are of the same type. This eliminates a lot of opportunities for error when trying to change between types when using different methods in the class.*
*$(-1) this is solved with generics.  What other advantages might there be?
