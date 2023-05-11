package products;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Epic ("Rest Assured POC - PRoducts Tests")
@Feature ("products api crud example")
@Story ("REST API complete")
public class ProductTests {
    @Test
    @Description ("get product by id")
    @Severity (SeverityLevel.NORMAL)
    public void testGetProductById() {
        given()
                .when()
                .get("http://localhost:3000/products/1")
                .then()
                .statusCode(200)
                .and()
                .assertThat()
                .body ("id", equalTo(1))
                .body("price", lessThan(45000));
    }


    @DataProvider(name = "postData")
    public Iterator<Object[]> postData () {
        final List<Object[]> postData = new ArrayList<>();
        // these data must be inline with parameter type and order
        // int id, String name, int price
        // id is 1, name is iPhone, price is 40000
        postData.add (new Object[] { 1, "iPhone", 40000 });
        postData.add (new Object[] { 2, "Pixel", 45000 }); // fail, no data
        // add products for data driven testing
        return postData.iterator ();
    }

    // to link the data provider with test function, where as ostData is name of the provider function
    // now testGetProductByIdDataDriven which is a test shall be called for every data point in the provided data
    @Test (dataProvider = "postData")
    @Description ("get product by id data driven")
    @Severity (SeverityLevel.NORMAL)
    public void testGetProductByIdDataDriven(int id, String name, int price) {
        System.out.println("testGetProductByIdDataDriven called " +  id + "," + name + "," + price);
        given()
                .when()
                .get("http://localhost:3000/products/"  + id)
                .then()
                .statusCode(200)
                .and()
                .assertThat()
                .body ("id", equalTo(id))
                .body("name", equalTo(name))
                .body("price", lessThanOrEqualTo(price));
    }

}
