/*
* generated by Xtext
*/
package co.edu.uniandes.miso4202.ehicletax;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VtdslStandaloneSetup extends VtdslStandaloneSetupGenerated{

	public static void doSetup() {
		new VtdslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

