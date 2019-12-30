package com.company.project.tests;
import com.company.project.validations.CategoriesDataValidation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import utils.ApiConfig;
import utils.ApiUtils;
import utils.ResponseCode;


public class CategoryDetails extends BaseTest implements ResponseCode {

    private static final Logger logger = LoggerFactory.getLogger("CategoryDetails");
    ApiConfig apiConfig=new ApiConfig();
    ApiUtils apiUtils=new ApiUtils();


    @Test
    public void getCategoriesDetails() {
        logger.info("Fetching category data with respect to id ");
        CategoriesDataValidation categories= new CategoriesDataValidation();

        RestAssured.baseURI=apiConfig.getHost();


        String uri =String.format(apiConfig.getCategoriesDetails());

        Response response= apiUtils.getApiResponse(OK,uri);
       categories.validateCategoryDetails(response);



    }
}