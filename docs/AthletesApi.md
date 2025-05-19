# AthletesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoggedInAthlete**](AthletesApi.md#getLoggedInAthlete) | **GET** /athlete | Get Authenticated Athlete
[**getLoggedInAthleteZones**](AthletesApi.md#getLoggedInAthleteZones) | **GET** /athlete/zones | Get Zones
[**getStats**](AthletesApi.md#getStats) | **GET** /athletes/{id}/stats | Get Athlete Stats
[**updateLoggedInAthlete**](AthletesApi.md#updateLoggedInAthlete) | **PUT** /athlete | Update Athlete


<a name="getLoggedInAthlete"></a>
# **getLoggedInAthlete**
> DetailedAthlete getLoggedInAthlete()

Get Authenticated Athlete

Returns the currently authenticated athlete. Tokens with profile:read_all scope will receive a detailed athlete representation; all others will receive a summary representation.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AthletesApi()
try {
    val result : DetailedAthlete = apiInstance.getLoggedInAthlete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AthletesApi#getLoggedInAthlete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AthletesApi#getLoggedInAthlete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DetailedAthlete**](DetailedAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedInAthleteZones"></a>
# **getLoggedInAthleteZones**
> Zones getLoggedInAthleteZones()

Get Zones

Returns the the authenticated athlete&#39;s heart rate and power zones. Requires profile:read_all.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AthletesApi()
try {
    val result : Zones = apiInstance.getLoggedInAthleteZones()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AthletesApi#getLoggedInAthleteZones")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AthletesApi#getLoggedInAthleteZones")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Zones**](Zones.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStats"></a>
# **getStats**
> ActivityStats getStats(id)

Get Athlete Stats

Returns the activity stats of an athlete. Only includes data from activities set to Everyone visibilty.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AthletesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the athlete. Must match the authenticated athlete.
try {
    val result : ActivityStats = apiInstance.getStats(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AthletesApi#getStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AthletesApi#getStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the athlete. Must match the authenticated athlete. |

### Return type

[**ActivityStats**](ActivityStats.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoggedInAthlete"></a>
# **updateLoggedInAthlete**
> DetailedAthlete updateLoggedInAthlete(weight)

Update Athlete

Update the currently authenticated athlete. Requires profile:write scope.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AthletesApi()
val weight : kotlin.Float = 3.4 // kotlin.Float | The weight of the athlete in kilograms.
try {
    val result : DetailedAthlete = apiInstance.updateLoggedInAthlete(weight)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AthletesApi#updateLoggedInAthlete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AthletesApi#updateLoggedInAthlete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **weight** | **kotlin.Float**| The weight of the athlete in kilograms. |

### Return type

[**DetailedAthlete**](DetailedAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

