# ActivitiesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActivity**](ActivitiesApi.md#createActivity) | **POST** /activities | Create an Activity
[**getActivityById**](ActivitiesApi.md#getActivityById) | **GET** /activities/{id} | Get Activity
[**getCommentsByActivityId**](ActivitiesApi.md#getCommentsByActivityId) | **GET** /activities/{id}/comments | List Activity Comments
[**getKudoersByActivityId**](ActivitiesApi.md#getKudoersByActivityId) | **GET** /activities/{id}/kudos | List Activity Kudoers
[**getLapsByActivityId**](ActivitiesApi.md#getLapsByActivityId) | **GET** /activities/{id}/laps | List Activity Laps
[**getLoggedInAthleteActivities**](ActivitiesApi.md#getLoggedInAthleteActivities) | **GET** /athlete/activities | List Athlete Activities
[**getZonesByActivityId**](ActivitiesApi.md#getZonesByActivityId) | **GET** /activities/{id}/zones | Get Activity Zones
[**updateActivityById**](ActivitiesApi.md#updateActivityById) | **PUT** /activities/{id} | Update Activity


<a name="createActivity"></a>
# **createActivity**
> DetailedActivity createActivity(name, sportType, startDateLocal, elapsedTime, type, description, distance, trainer, commute)

Create an Activity

Creates a manual activity for an athlete, requires activity:write scope.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ActivitiesApi()
val name : kotlin.String = name_example // kotlin.String | The name of the activity.
val sportType : kotlin.String = sportType_example // kotlin.String | Sport type of activity. For example - Run, MountainBikeRide, Ride, etc.
val startDateLocal : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | ISO 8601 formatted date time.
val elapsedTime : kotlin.Int = 56 // kotlin.Int | In seconds.
val type : kotlin.String = type_example // kotlin.String | Type of activity. For example - Run, Ride etc.
val description : kotlin.String = description_example // kotlin.String | Description of the activity.
val distance : kotlin.Float = 3.4 // kotlin.Float | In meters.
val trainer : kotlin.Int = 56 // kotlin.Int | Set to 1 to mark as a trainer activity.
val commute : kotlin.Int = 56 // kotlin.Int | Set to 1 to mark as commute.
try {
    val result : DetailedActivity = apiInstance.createActivity(name, sportType, startDateLocal, elapsedTime, type, description, distance, trainer, commute)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivitiesApi#createActivity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivitiesApi#createActivity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| The name of the activity. |
 **sportType** | **kotlin.String**| Sport type of activity. For example - Run, MountainBikeRide, Ride, etc. |
 **startDateLocal** | **java.time.LocalDateTime**| ISO 8601 formatted date time. |
 **elapsedTime** | **kotlin.Int**| In seconds. |
 **type** | **kotlin.String**| Type of activity. For example - Run, Ride etc. | [optional]
 **description** | **kotlin.String**| Description of the activity. | [optional]
 **distance** | **kotlin.Float**| In meters. | [optional]
 **trainer** | **kotlin.Int**| Set to 1 to mark as a trainer activity. | [optional]
 **commute** | **kotlin.Int**| Set to 1 to mark as commute. | [optional]

### Return type

[**DetailedActivity**](DetailedActivity.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActivityById"></a>
# **getActivityById**
> DetailedActivity getActivityById(id, includeAllEfforts)

Get Activity

Returns the given activity that is owned by the authenticated athlete. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ActivitiesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the activity.
val includeAllEfforts : kotlin.Boolean = true // kotlin.Boolean | To include all segments efforts.
try {
    val result : DetailedActivity = apiInstance.getActivityById(id, includeAllEfforts)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivitiesApi#getActivityById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivitiesApi#getActivityById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the activity. |
 **includeAllEfforts** | **kotlin.Boolean**| To include all segments efforts. | [optional]

### Return type

[**DetailedActivity**](DetailedActivity.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommentsByActivityId"></a>
# **getCommentsByActivityId**
> kotlin.Array&lt;Comment&gt; getCommentsByActivityId(id, page, perPage, pageSize, afterCursor)

List Activity Comments

Returns the comments on the given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ActivitiesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the activity.
val page : kotlin.Int = 56 // kotlin.Int | Deprecated. Prefer to use after_cursor.
val perPage : kotlin.Int = 56 // kotlin.Int | Deprecated. Prefer to use page_size.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
val afterCursor : kotlin.String = afterCursor_example // kotlin.String | Cursor of the last item in the previous page of results, used to request the subsequent page of results.  When omitted, the first page of results is fetched.
try {
    val result : kotlin.Array<Comment> = apiInstance.getCommentsByActivityId(id, page, perPage, pageSize, afterCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivitiesApi#getCommentsByActivityId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivitiesApi#getCommentsByActivityId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the activity. |
 **page** | **kotlin.Int**| Deprecated. Prefer to use after_cursor. | [optional]
 **perPage** | **kotlin.Int**| Deprecated. Prefer to use page_size. | [optional] [default to 30]
 **pageSize** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]
 **afterCursor** | **kotlin.String**| Cursor of the last item in the previous page of results, used to request the subsequent page of results.  When omitted, the first page of results is fetched. | [optional]

### Return type

[**kotlin.Array&lt;Comment&gt;**](Comment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKudoersByActivityId"></a>
# **getKudoersByActivityId**
> kotlin.Array&lt;SummaryAthlete&gt; getKudoersByActivityId(id, page, perPage)

List Activity Kudoers

Returns the athletes who kudoed an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ActivitiesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the activity.
val page : kotlin.Int = 56 // kotlin.Int | Page number. Defaults to 1.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<SummaryAthlete> = apiInstance.getKudoersByActivityId(id, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivitiesApi#getKudoersByActivityId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivitiesApi#getKudoersByActivityId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the activity. |
 **page** | **kotlin.Int**| Page number. Defaults to 1. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;SummaryAthlete&gt;**](SummaryAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLapsByActivityId"></a>
# **getLapsByActivityId**
> kotlin.Array&lt;Lap&gt; getLapsByActivityId(id)

List Activity Laps

Returns the laps of an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ActivitiesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the activity.
try {
    val result : kotlin.Array<Lap> = apiInstance.getLapsByActivityId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivitiesApi#getLapsByActivityId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivitiesApi#getLapsByActivityId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the activity. |

### Return type

[**kotlin.Array&lt;Lap&gt;**](Lap.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedInAthleteActivities"></a>
# **getLoggedInAthleteActivities**
> kotlin.Array&lt;SummaryActivity&gt; getLoggedInAthleteActivities(before, after, page, perPage)

List Athlete Activities

Returns the activities of an athlete for a specific identifier. Requires activity:read. Only Me activities will be filtered out unless requested by a token with activity:read_all.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ActivitiesApi()
val before : kotlin.Int = 56 // kotlin.Int | An epoch timestamp to use for filtering activities that have taken place before a certain time.
val after : kotlin.Int = 56 // kotlin.Int | An epoch timestamp to use for filtering activities that have taken place after a certain time.
val page : kotlin.Int = 56 // kotlin.Int | Page number. Defaults to 1.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<SummaryActivity> = apiInstance.getLoggedInAthleteActivities(before, after, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivitiesApi#getLoggedInAthleteActivities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivitiesApi#getLoggedInAthleteActivities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **kotlin.Int**| An epoch timestamp to use for filtering activities that have taken place before a certain time. | [optional]
 **after** | **kotlin.Int**| An epoch timestamp to use for filtering activities that have taken place after a certain time. | [optional]
 **page** | **kotlin.Int**| Page number. Defaults to 1. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;SummaryActivity&gt;**](SummaryActivity.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZonesByActivityId"></a>
# **getZonesByActivityId**
> kotlin.Array&lt;ActivityZone&gt; getZonesByActivityId(id)

Get Activity Zones

Summit Feature. Returns the zones of a given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ActivitiesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the activity.
try {
    val result : kotlin.Array<ActivityZone> = apiInstance.getZonesByActivityId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivitiesApi#getZonesByActivityId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivitiesApi#getZonesByActivityId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the activity. |

### Return type

[**kotlin.Array&lt;ActivityZone&gt;**](ActivityZone.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateActivityById"></a>
# **updateActivityById**
> DetailedActivity updateActivityById(id, body)

Update Activity

Updates the given activity that is owned by the authenticated athlete. Requires activity:write. Also requires activity:read_all in order to update Only Me activities

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ActivitiesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the activity.
val body : UpdatableActivity =  // UpdatableActivity | 
try {
    val result : DetailedActivity = apiInstance.updateActivityById(id, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivitiesApi#updateActivityById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivitiesApi#updateActivityById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the activity. |
 **body** | [**UpdatableActivity**](UpdatableActivity.md)|  | [optional]

### Return type

[**DetailedActivity**](DetailedActivity.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

