/*
 * generated by Xtext
 */
package co.edu.uniandes.miso4202.ehicletax.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractVtdslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage.eINSTANCE);
		return result;
	}
}