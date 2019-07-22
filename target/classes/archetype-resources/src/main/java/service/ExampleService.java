#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;

import ${package}.entity.InputExample;
import ${package}.entity.OutputExample;
import ${package}.entity.Productos;

public interface ExampleService {
	
	public List<Productos> getProductos(String in);
	
	public OutputExample setExample(InputExample in);

}
