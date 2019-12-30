package com.company.project.validations;

import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import utils.ApiUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CategoriesDataValidation {
    private static final Logger logger = LoggerFactory.getLogger("Categories details validation ");


    public boolean validateCategoryDetails(Response response) {

        Assert.assertTrue(ApiUtils.isJSONValid(response.asString()), "The given String is not a valid JSON");
        List<Map> categories = response.jsonPath().get("categories.categories");
        Map cat1= categories.get(0);
        Map cat2= categories.get(1);
        Map cat3= categories.get(2);
        Map cat4= categories.get(3);
        Map cat5= categories.get(4);




        Assert.assertEquals(cat1.get("name"),"Delivery");
        Assert.assertEquals(cat2.get("name"),"Dine-out");
        Assert.assertEquals(cat3.get("name"),"Nightlife");
        Assert.assertEquals(cat4.get("name"),"Catching-up");
        Assert.assertEquals(cat5.get("name"),"Takeaway");


        for (Map category : categories) {
            logger.info("\n" + category.get("id") + "\n" + category.get("name"));
        }

        return true;
    }
}