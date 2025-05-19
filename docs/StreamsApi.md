# StreamsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActivityStreams**](StreamsApi.md#getActivityStreams) | **GET** /activities/{id}/streams | Get Activity Streams
[**getRouteStreams**](StreamsApi.md#getRouteStreams) | **GET** /routes/{id}/streams | Get Route Streams
[**getSegmentEffortStreams**](StreamsApi.md#getSegmentEffortStreams) | **GET** /segment_efforts/{id}/streams | Get Segment Effort Streams
[**getSegmentStreams**](StreamsApi.md#getSegmentStreams) | **GET** /segments/{id}/streams | Get Segment Streams


<a name="getActivityStreams"></a>
# **getActivityStreams**
> StreamSet getActivityStreams(id, keys, keyByType)

Get Activity Streams

Returns the given activity&#39;s streams. Requires activity:read scope. Requires activity:read_all scope for Only Me activities.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StreamsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the activity.
val keys : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Desired stream types.
val keyByType : kotlin.Boolean = true // kotlin.Boolean | Must be true.
try {
    val result : StreamSet = apiInstance.getActivityStreams(id, keys, keyByType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getActivityStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getActivityStreams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the activity. |
 **keys** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Desired stream types. | [enum: time, distance, latlng, altitude, velocity_smooth, heartrate, cadence, watts, temp, moving, grade_smooth]
 **keyByType** | **kotlin.Boolean**| Must be true. | [default to true]

### Return type

[**StreamSet**](StreamSet.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRouteStreams"></a>
# **getRouteStreams**
> StreamSet getRouteStreams(id)

Get Route Streams

Returns the given route&#39;s streams. Requires read_all scope for private routes.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StreamsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the route.
try {
    val result : StreamSet = apiInstance.getRouteStreams(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getRouteStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getRouteStreams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the route. |

### Return type

[**StreamSet**](StreamSet.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentEffortStreams"></a>
# **getSegmentEffortStreams**
> StreamSet getSegmentEffortStreams(id, keys, keyByType)

Get Segment Effort Streams

Returns a set of streams for a segment effort completed by the authenticated athlete. Requires read_all scope.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StreamsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the segment effort.
val keys : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | The types of streams to return.
val keyByType : kotlin.Boolean = true // kotlin.Boolean | Must be true.
try {
    val result : StreamSet = apiInstance.getSegmentEffortStreams(id, keys, keyByType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getSegmentEffortStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getSegmentEffortStreams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the segment effort. |
 **keys** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| The types of streams to return. | [enum: time, distance, latlng, altitude, velocity_smooth, heartrate, cadence, watts, temp, moving, grade_smooth]
 **keyByType** | **kotlin.Boolean**| Must be true. | [default to true]

### Return type

[**StreamSet**](StreamSet.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentStreams"></a>
# **getSegmentStreams**
> StreamSet getSegmentStreams(id, keys, keyByType)

Get Segment Streams

Returns the given segment&#39;s streams. Requires read_all scope for private segments.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StreamsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the segment.
val keys : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | The types of streams to return.
val keyByType : kotlin.Boolean = true // kotlin.Boolean | Must be true.
try {
    val result : StreamSet = apiInstance.getSegmentStreams(id, keys, keyByType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getSegmentStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getSegmentStreams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the segment. |
 **keys** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| The types of streams to return. | [enum: distance, latlng, altitude]
 **keyByType** | **kotlin.Boolean**| Must be true. | [default to true]

### Return type

[**StreamSet**](StreamSet.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

