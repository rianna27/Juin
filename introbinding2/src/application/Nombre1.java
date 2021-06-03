package application;

import javafx.beans.property.*;

public class Nombre1 {
	
	private DoubleProperty num;
	
	public final double getNombre1()
	{
		if(num != null)
			return num.get();
		return 0;
	}

	public final void setNombre1(double number)
	{
		this.nombreProperty().set(number);
	}
	
	public final DoubleProperty nombreProperty()
	{
		if(num==null)
			num=new SimpleDoubleProperty(0);
		return num;
	}
}
