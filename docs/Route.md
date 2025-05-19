
# Route

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**athlete** | [**SummaryAthlete**](SummaryAthlete.md) |  |  [optional]
**description** | **kotlin.String** | The description of the route |  [optional]
**distance** | **kotlin.Float** | The route&#39;s distance, in meters |  [optional]
**elevationGain** | **kotlin.Float** | The route&#39;s elevation gain. |  [optional]
**id** | **kotlin.Long** | The unique identifier of this route |  [optional]
**idStr** | **kotlin.String** | The unique identifier of the route in string format |  [optional]
**map** | [**PolylineMap**](PolylineMap.md) |  |  [optional]
**name** | **kotlin.String** | The name of this route |  [optional]
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether this route is private |  [optional]
**starred** | **kotlin.Boolean** | Whether this route is starred by the logged-in athlete |  [optional]
**timestamp** | **kotlin.Int** | An epoch timestamp of when the route was created |  [optional]
**type** | **kotlin.Int** | This route&#39;s type (1 for ride, 2 for runs) |  [optional]
**subType** | **kotlin.Int** | This route&#39;s sub-type (1 for road, 2 for mountain bike, 3 for cross, 4 for trail, 5 for mixed) |  [optional]
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The time at which the route was created |  [optional]
**updatedAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The time at which the route was last updated |  [optional]
**estimatedMovingTime** | **kotlin.Int** | Estimated time in seconds for the authenticated athlete to complete route |  [optional]
**segments** | [**kotlin.Array&lt;SummarySegment&gt;**](SummarySegment.md) | The segments traversed by this route |  [optional]
**waypoints** | [**kotlin.Array&lt;Waypoint&gt;**](Waypoint.md) | The custom waypoints along this route |  [optional]



