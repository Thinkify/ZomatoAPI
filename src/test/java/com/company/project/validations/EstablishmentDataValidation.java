package com.company.project.validations;

import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import utils.ApiUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EstablishmentDataValidation {
    private static final Logger logger = LoggerFactory.getLogger("Establishment details validation ");


    public boolean validateEstablishmentDetails(Response response) {

        Assert.assertTrue(ApiUtils.isJSONValid(response.asString()), "The given String is not a valid JSON");
        List<Map> establishments = response.jsonPath().get("establishments.establishment");
        for (Map establishment : establishments) {
           // logger.info("\n" + establishment.get("id") + "\n" + establishment.get("name"));
            Set set = establishment.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                System.out.print("key: " + mentry.getKey() + " & Value: ");
                System.out.println(mentry.getValue());
                String s = (mentry.getValue()).toString();
                Assert.assertTrue(StringUtils.isNotBlank(s));
            }

        }
        return true;
    }

}