# RoutesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRouteAsGPX**](RoutesApi.md#getRouteAsGPX) | **GET** /routes/{id}/export_gpx | Export Route GPX
[**getRouteAsTCX**](RoutesApi.md#getRouteAsTCX) | **GET** /routes/{id}/export_tcx | Export Route TCX
[**getRouteById**](RoutesApi.md#getRouteById) | **GET** /routes/{id} | Get Route
[**getRoutesByAthleteId**](RoutesApi.md#getRoutesByAthleteId) | **GET** /athletes/{id}/routes | List Athlete Routes


<a name="getRouteAsGPX"></a>
# **getRouteAsGPX**
> getRouteAsGPX(id)

Export Route GPX

Returns a GPX file of the route. Requires read_all scope for private routes.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RoutesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the route.
try {
    apiInstance.getRouteAsGPX(id)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getRouteAsGPX")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getRouteAsGPX")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the route. |

### Return type

null (empty response body)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRouteAsTCX"></a>
# **getRouteAsTCX**
> getRouteAsTCX(id)

Export Route TCX

Returns a TCX file of the route. Requires read_all scope for private routes.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RoutesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the route.
try {
    apiInstance.getRouteAsTCX(id)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getRouteAsTCX")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getRouteAsTCX")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the route. |

### Return type

null (empty response body)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRouteById"></a>
# **getRouteById**
> Route getRouteById(id)

Get Route

Returns a route using its identifier. Requires read_all scope for private routes.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RoutesApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the route.
try {
    val result : Route = apiInstance.getRouteById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getRouteById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getRouteById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the route. |

### Return type

[**Route**](Route.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoutesByAthleteId"></a>
# **getRoutesByAthleteId**
> kotlin.Array&lt;Route&gt; getRoutesByAthleteId(page, perPage)

List Athlete Routes

Returns a list of the routes created by the authenticated athlete. Private routes are filtered out unless requested by a token with read_all scope.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RoutesApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number. Defaults to 1.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<Route> = apiInstance.getRoutesByAthleteId(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getRoutesByAthleteId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getRoutesByAthleteId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number. Defaults to 1. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;Route&gt;**](Route.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

