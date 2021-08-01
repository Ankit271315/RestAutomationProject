package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;

public class BaseClass {

//RequestSpecification res;
	Response res;
	JsonPath js;
	AddTestData testData;

	public String requestSpecification() throws Exception {

		ApiResources.valueOf(null);
		PrintStream stream = new PrintStream(new FileOutputStream("log.txt"));
		RestAssured.baseURI = getBaseEndPoint("baseurl");
		res = given().header("Content-Type", "application/json").body(testData.getCredentialsBody()).when()
				.post("/auth/1/session");

		String response = res.getBody().asString();

		js = new JsonPath(response);
		return js.get("checkforPull");
	}

	public String getBaseEndPoint(String str) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "");
		prop.load(fis);
		return prop.getProperty(str);
	}

}
