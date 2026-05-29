package com.framework.tests.api;

import com.framework.core.api.ApiClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserApiTest {
    @Test
    public void testGetUser() {
        Response response = ApiClient.getUser("2");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getString("name").contains("ReqRes API"));
    }
}
