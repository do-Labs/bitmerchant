package com.bitmerchant.tools;


public class DataSources {

	public static String APP_NAME = "bitmerchant-wallet";
	
	public static final Integer SPARK_WEB_PORT = 4567;
		
	public static final String EXTERNAL_IP = Tools.httpGet("http://checkip.amazonaws.com/").trim();
	
	public static final String WEB_SERVICE_URL = "http://" + EXTERNAL_IP + ":" + SPARK_WEB_PORT + "/";
	
	// The path to the bitmerchant dir
	public static final String HOME_DIR = System.getProperty( "user.home" ) + "/.bitmerchant-wallet/";
	
	public static final String CODE_DIR = System.getProperty("user.dir");
	
	public static final String DB_FILE = HOME_DIR + APP_NAME + ".db";
	
	public static final String SQL_FILE = CODE_DIR + "/src/main/resources/bitmerchant-wallet.sql";
	
	public static final String SQL_VIEWS_FILE = CODE_DIR + "/src/main/resources/bitmerchant-wallet-views.sql";
	
	public static final String BUTTON_JSON_REQ ="{\n \"button\" : {\n    \"name\": \"kittin mittinz\",\n    \"type\": \"buy_now\",\n       \"text\": \"Buy with USD/BTC\",\n    \"price_string\": \"1.23\",\n    \"price_currency_iso\": \"USD\",\n    \"callback_url\": \"http://www.example.com/my_custom_button_callback\",\n    \"description\": \"Sample description\"\n  }\n   \n}";
	
	
	
	
}
