/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.ActivityZone;
import io.swagger.client.model.Comment;
import io.swagger.client.model.DetailedActivity;
import io.swagger.client.model.Fault;
import io.swagger.client.model.Lap;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.SummaryActivity;
import io.swagger.client.model.SummaryAthlete;
import io.swagger.client.model.UpdatableActivity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
@Ignore
public class ActivitiesApiTest {

    private final ActivitiesApi api = new ActivitiesApi();

    
    /**
     * Create an Activity
     *
     * Creates a manual activity for an athlete, requires activity:write scope.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createActivityTest() throws Exception {
        String name = null;
        String sportType = null;
        OffsetDateTime startDateLocal = null;
        Integer elapsedTime = null;
        String type = null;
        String description = null;
        Float distance = null;
        Integer trainer = null;
        Integer commute = null;
        DetailedActivity response = api.createActivity(name, sportType, startDateLocal, elapsedTime, type, description, distance, trainer, commute);

        // TODO: test validations
    }
    
    /**
     * Get Activity
     *
     * Returns the given activity that is owned by the authenticated athlete. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getActivityByIdTest() throws Exception {
        Long id = null;
        Boolean includeAllEfforts = null;
        DetailedActivity response = api.getActivityById(id, includeAllEfforts);

        // TODO: test validations
    }
    
    /**
     * List Activity Comments
     *
     * Returns the comments on the given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCommentsByActivityIdTest() throws Exception {
        Long id = null;
        Integer page = null;
        Integer perPage = null;
        Integer pageSize = null;
        String afterCursor = null;
        List<Comment> response = api.getCommentsByActivityId(id, page, perPage, pageSize, afterCursor);

        // TODO: test validations
    }
    
    /**
     * List Activity Kudoers
     *
     * Returns the athletes who kudoed an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getKudoersByActivityIdTest() throws Exception {
        Long id = null;
        Integer page = null;
        Integer perPage = null;
        List<SummaryAthlete> response = api.getKudoersByActivityId(id, page, perPage);

        // TODO: test validations
    }
    
    /**
     * List Activity Laps
     *
     * Returns the laps of an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLapsByActivityIdTest() throws Exception {
        Long id = null;
        List<Lap> response = api.getLapsByActivityId(id);

        // TODO: test validations
    }
    
    /**
     * List Athlete Activities
     *
     * Returns the activities of an athlete for a specific identifier. Requires activity:read. Only Me activities will be filtered out unless requested by a token with activity:read_all.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLoggedInAthleteActivitiesTest() throws Exception {
        Integer before = null;
        Integer after = null;
        Integer page = null;
        Integer perPage = null;
        List<SummaryActivity> response = api.getLoggedInAthleteActivities(before, after, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Get Activity Zones
     *
     * Summit Feature. Returns the zones of a given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getZonesByActivityIdTest() throws Exception {
        Long id = null;
        List<ActivityZone> response = api.getZonesByActivityId(id);

        // TODO: test validations
    }
    
    /**
     * Update Activity
     *
     * Updates the given activity that is owned by the authenticated athlete. Requires activity:write. Also requires activity:read_all in order to update Only Me activities
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateActivityByIdTest() throws Exception {
        Long id = null;
        UpdatableActivity body = null;
        DetailedActivity response = api.updateActivityById(id, body);

        // TODO: test validations
    }
    
}
