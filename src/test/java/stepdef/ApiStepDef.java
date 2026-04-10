package stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.HashMap;
import java.util.Map;

public class ApiStepdef {
    @Given("create the request body")
    public void createTheRequestBody() {
        Map<String, Double>
                map = new HashMap<>();
        map.put("electricity", 20.0);
        map.put("petrol", 30.0);
        map.put("wastage",15.0);
        System.out.println(map);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() +","+entry.getValue());
        }
    }

    @Then("validate the response code {string}")
    public void validateTheResponseCode(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
