#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ${package}.entity.InputExample;
import ${package}.entity.OutputExample;
import ${package}.entity.Productos;
import ${package}.service.${artifactId}Service;

@Service("${artifactId}Service")
public class ${artifactId}ServiceImpl implements ${artifactId}Service {

	@Override
	public List<Productos> getProductos(String in) {
		
		
		return null;
	}

	@Override
	public OutputExample setExample(InputExample in) {
		
		OutputExample response = new OutputExample();
		response.setMessageExample("Input recibido : " + "|name: " + in.getNameExample() + " |alias: " + in.getAliasExample() + " |operation: " + in.getOperationExampe());
		response.setResultExample("Input succes for operation " + in.getOperationExampe());

		return response;
	}

}
