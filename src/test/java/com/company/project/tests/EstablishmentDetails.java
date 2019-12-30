package com.company.project.tests;

import com.company.project.validations.EstablishmentDataValidation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import utils.ApiConfig;
import utils.ApiUtils;

import static utils.ResponseCode.OK;



    public class EstablishmentDetails {
        ApiConfig apiConfig=new ApiConfig();
        ApiUtils apiUtils=new ApiUtils();
        private static final Logger logger= LoggerFactory.getLogger("establishment details ");
        EstablishmentDataValidation dataValidation=new EstablishmentDataValidation();


        int cityId=4;


        @Test
        public void getEstablishmentDetailsByid(){
            logger.info("Fetching establishment data with respect to city ");
            RestAssured.baseURI= apiConfig.getHost();
            String uri=String.format(apiConfig.getEstablishmentDetails(),cityId);
            Response response= apiUtils.getApiResponse(OK,uri);
           dataValidation.validateEstablishmentDetails(response);
        }
    }



