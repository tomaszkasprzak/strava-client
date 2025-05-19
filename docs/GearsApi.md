# GearsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGearById**](GearsApi.md#getGearById) | **GET** /gear/{id} | Get Equipment


<a name="getGearById"></a>
# **getGearById**
> DetailedGear getGearById(id)

Get Equipment

Returns an equipment using its identifier.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = GearsApi()
val id : kotlin.String = id_example // kotlin.String | The identifier of the gear.
try {
    val result : DetailedGear = apiInstance.getGearById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GearsApi#getGearById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GearsApi#getGearById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The identifier of the gear. |

### Return type

[**DetailedGear**](DetailedGear.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

