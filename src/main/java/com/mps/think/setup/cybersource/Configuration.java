package com.mps.think.setup.cybersource;

import java.util.Properties;

public class Configuration {
	public static Properties getMerchantDetails() {
		Properties props = new Properties();

		// HTTP_Signature = http_signature and JWT = jwt
		props.setProperty("authenticationType", "http_signature");
		props.setProperty("merchantID", "think_mpstest");
		props.setProperty("runEnvironment", "apitest.cybersource.com");
	//	props.setProperty("requestJsonPath", "src/main/resources/request.json");

		// MetaKey Parameters
		props.setProperty("portfolioID", "");
		props.setProperty("useMetaKey", "false");

		// JWT Parameters
//		props.setProperty("keyAlias", "testrest");
//		props.setProperty("keyPass", "testrest");
//		props.setProperty("keyFileName", "testrest");

		// P12 key path. Enter the folder path where the .p12 file is located.

//		props.setProperty("keysDirectory", "src/main/resources");
//		// HTTP Parameters
//		props.setProperty("merchantKeyId", "08c94330-f618-42a3-b09d-e1e43be5efda");
//		props.setProperty("merchantsecretKey", "yBJxy6LjM2TmcPGu+GaJrHtkke25fPpUX+UY6/L/1tE=");
		props.setProperty("merchantKeyId", "c51aa078-d9ed-48af-9310-fa91cd8db54e");
		props.setProperty("merchantsecretKey", "+EH51QggXOcQWnCenuG3XqeGP37BpxSGlFNRkeDqVTM=");
		// Logging to be enabled or not.
		props.setProperty("enableLog", "true");
		// Log directory Path
		props.setProperty("logDirectory", "log");
		props.setProperty("logFilename", "cybs");

		// Log file size in KB
		props.setProperty("logMaximumSize", "5M");

//		// OAuth related properties.
//		props.setProperty("enableClientCert", "false");
//		props.setProperty("clientCertDirectory", "src/main/resources");
//		props.setProperty("clientCertFile", "");
//		props.setProperty("clientCertPassword", "");
//		props.setProperty("clientId", "");
//		props.setProperty("clientSecret", "");

		return props;

	}
	
//	public static Properties getAlternativeMerchantDetails() {
//		Properties props = new Properties();
//
//		// HTTP_Signature = http_signature and JWT = jwt
//		props.setProperty("authenticationType", "http_signature");
//		props.setProperty("merchantID", "testrest_cpctv");
//		props.setProperty("runEnvironment", "apitest.cybersource.com");
//		props.setProperty("requestJsonPath", "src/main/resources/request.json");
//
//		// JWT Parameters
//		props.setProperty("keyAlias", "testrest_cpctv");
//		props.setProperty("keyPass", "testrest_cpctv");
//		props.setProperty("keyFileName", "testrest_cpctv");
//
//		// P12 key path. Enter the folder path where the .p12 file is located.
//
//		props.setProperty("keysDirectory", "src/main/resources");
//		// HTTP Parameters
//		props.setProperty("merchantKeyId", "e547c3d3-16e4-444c-9313-2a08784b906a");
//		props.setProperty("merchantsecretKey", "JXm4dqKYIxWofM1TIbtYY9HuYo7Cg1HPHxn29f6waRo=");
//		// Logging to be enabled or not.
//		props.setProperty("enableLog", "true");
//		// Log directory Path
//		props.setProperty("logDirectory", "log");
//		props.setProperty("logFilename", "cybs");
//
//		// Log file size in KB
//		props.setProperty("logMaximumSize", "5M");
//
//		return props;
//
//	}

}