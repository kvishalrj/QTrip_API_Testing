package qtriptest.APITests;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;
import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.Test;



public class testCase_API_01 {

    @Test(description= "Verify registration and login", groups={"API Tests"})
    public void testCase01() {
        
    //Hit the register api
    RestAssured.baseURI = "https://content-qtripdynamic-qa-backend.azurewebsites.net"; 
    RestAssured.basePath="/api/v1/register";

    RequestSpecification httpRequest = RestAssured.given(); 
    httpRequest.contentType (ContentType.JSON);

    //defining dynamic email id for multiple registration 
    Random random = new Random();
    int randomNumber = random.nextInt(100);
    String dynamicEmail = "QA_API"+randomNumber+"@gmail.com";

    HashMap<Object, Object> map= new HashMap<Object, Object>(); 
    map.put("email", dynamicEmail);
    map.put("password", "testtest"); 
    map.put("confirmpassword", "testtest");

    httpRequest.body(map);
    Response response = httpRequest.request (Method.POST);

    // int actualStatusCode
    response.getStatusCode();
    response.then().assertThat().statusCode (201);

    //Hit login api and validate
    String loginEndPointURL="https://content-qtripdynamic-qa-backend.azurewebsites.net/api/v1/login";

    RequestSpecification httpRequest2 = RestAssured.given();
    httpRequest2.contentType (ContentType.JSON);

    //Make payload from existing map for hitting login api 
    map.remove("confirmpassword");

    httpRequest2.body(map);
    Response response2 = httpRequest2.post(loginEndPointURL); 
    System.out.println(response2.getBody().asPrettyString());
    response2.then().assertThat().statusCode (201);

    JsonPath jsonpath = response2.jsonPath();
    boolean statusValue = jsonpath.get("success");
    Assert.assertTrue(statusValue);

    String token = jsonpath.get("data.token"); 
    System.out.println(token);

    } 
}
