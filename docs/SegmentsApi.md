# SegmentsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exploreSegments**](SegmentsApi.md#exploreSegments) | **GET** /segments/explore | Explore segments
[**getLoggedInAthleteStarredSegments**](SegmentsApi.md#getLoggedInAthleteStarredSegments) | **GET** /segments/starred | List Starred Segments
[**getSegmentById**](SegmentsApi.md#getSegmentById) | **GET** /segments/{id} | Get Segment
[**starSegment**](SegmentsApi.md#starSegment) | **PUT** /segments/{id}/starred | Star Segment


<a name="exploreSegments"></a>
# **exploreSegments**
> ExplorerResponse exploreSegments(bounds, activityType, minCat, maxCat)

Explore segments

Returns the top 10 segments matching a specified query.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SegmentsApi()
val bounds : kotlin.Array<kotlin.Float> =  // kotlin.Array<kotlin.Float> | The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude]
val activityType : kotlin.String = activityType_example // kotlin.String | Desired activity type.
val minCat : kotlin.Int = 56 // kotlin.Int | The minimum climbing category.
val maxCat : kotlin.Int = 56 // kotlin.Int | The maximum climbing category.
try {
    val result : ExplorerResponse = apiInstance.exploreSegments(bounds, activityType, minCat, maxCat)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#exploreSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#exploreSegments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bounds** | [**kotlin.Array&lt;kotlin.Float&gt;**](kotlin.Float.md)| The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude] |
 **activityType** | **kotlin.String**| Desired activity type. | [optional] [enum: running, riding]
 **minCat** | **kotlin.Int**| The minimum climbing category. | [optional]
 **maxCat** | **kotlin.Int**| The maximum climbing category. | [optional]

### Return type

[**ExplorerResponse**](ExplorerResponse.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedInAthleteStarredSegments"></a>
# **getLoggedInAthleteStarredSegments**
> kotlin.Array&lt;SummarySegment&gt; getLoggedInAthleteStarredSegments(page, perPage)

List Starred Segments

List of the authenticated athlete&#39;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SegmentsApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number. Defaults to 1.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<SummarySegment> = apiInstance.getLoggedInAthleteStarredSegments(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getLoggedInAthleteStarredSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getLoggedInAthleteStarredSegments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number. Defaults to 1. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;SummarySegment&gt;**](SummarySegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentById"></a>
# **getSegmentById**
> DetailedSegment getSegmentById(id)

Get Segment

Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the segment.
try {
    val result : DetailedSegment = apiInstance.getSegmentById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getSegmentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getSegmentById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the segment. |

### Return type

[**DetailedSegment**](DetailedSegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="starSegment"></a>
# **starSegment**
> DetailedSegment starSegment(id, starred)

Star Segment

Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the segment to star.
val starred : kotlin.Boolean = true // kotlin.Boolean | If true, star the segment; if false, unstar the segment.
try {
    val result : DetailedSegment = apiInstance.starSegment(id, starred)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#starSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#starSegment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the segment to star. |
 **starred** | **kotlin.Boolean**| If true, star the segment; if false, unstar the segment. | [default to false]

### Return type

[**DetailedSegment**](DetailedSegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

