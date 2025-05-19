# SegmentEffortsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEffortsBySegmentId**](SegmentEffortsApi.md#getEffortsBySegmentId) | **GET** /segment_efforts | List Segment Efforts
[**getSegmentEffortById**](SegmentEffortsApi.md#getSegmentEffortById) | **GET** /segment_efforts/{id} | Get Segment Effort


<a name="getEffortsBySegmentId"></a>
# **getEffortsBySegmentId**
> kotlin.Array&lt;DetailedSegmentEffort&gt; getEffortsBySegmentId(segmentId, startDateLocal, endDateLocal, perPage)

List Segment Efforts

Returns a set of the authenticated athlete&#39;s segment efforts for a given segment.  Requires subscription.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SegmentEffortsApi()
val segmentId : kotlin.Int = 56 // kotlin.Int | The identifier of the segment.
val startDateLocal : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | ISO 8601 formatted date time.
val endDateLocal : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | ISO 8601 formatted date time.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<DetailedSegmentEffort> = apiInstance.getEffortsBySegmentId(segmentId, startDateLocal, endDateLocal, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentEffortsApi#getEffortsBySegmentId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentEffortsApi#getEffortsBySegmentId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **segmentId** | **kotlin.Int**| The identifier of the segment. |
 **startDateLocal** | **java.time.LocalDateTime**| ISO 8601 formatted date time. | [optional]
 **endDateLocal** | **java.time.LocalDateTime**| ISO 8601 formatted date time. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;DetailedSegmentEffort&gt;**](DetailedSegmentEffort.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentEffortById"></a>
# **getSegmentEffortById**
> DetailedSegmentEffort getSegmentEffortById(id)

Get Segment Effort

Returns a segment effort from an activity that is owned by the authenticated athlete. Requires subscription.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SegmentEffortsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the segment effort.
try {
    val result : DetailedSegmentEffort = apiInstance.getSegmentEffortById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentEffortsApi#getSegmentEffortById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentEffortsApi#getSegmentEffortById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the segment effort. |

### Return type

[**DetailedSegmentEffort**](DetailedSegmentEffort.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

