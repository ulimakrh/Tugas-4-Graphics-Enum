/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.genericclass;

/**
 *
 * @author Ulima
 * @param <V>
 */
public class GenericClass<V>{

	private V v;

	public void add(V v)
	{
		this.v = v;
	}

	public V get() { return v; }

	public void getArea() {}

	public static void main(String[] args)
	{
		// Object of generic class Area with parameter Type as Integer
		GenericClass<Integer> rectangle = new GenericClass<Integer>();
                
		// Object of generic class Area with parameter Type as Double
		GenericClass<Double> circle = new GenericClass<Double>();
                
		rectangle.add(10);
		circle.add(2.5);
		System.out.println(rectangle.get());
		System.out.println(circle.get());
	}
}
