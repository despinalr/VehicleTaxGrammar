/*
* generated by Xtext
*/
package co.edu.uniandes.miso4202.ehicletax;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VtdslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return co.edu.uniandes.miso4202.ehicletax.ui.internal.VtdslActivator.getInstance().getInjector("co.edu.uniandes.miso4202.ehicletax.Vtdsl");
	}
	
}
