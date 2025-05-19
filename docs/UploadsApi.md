# UploadsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUpload**](UploadsApi.md#createUpload) | **POST** /uploads | Upload Activity
[**getUploadById**](UploadsApi.md#getUploadById) | **GET** /uploads/{uploadId} | Get Upload


<a name="createUpload"></a>
# **createUpload**
> Upload createUpload(file, name, description, trainer, commute, dataType, externalId)

Upload Activity

Uploads a new data file to create an activity from. Requires activity:write scope.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = UploadsApi()
val file : java.io.File = /path/to/file.txt // java.io.File | The uploaded file.
val name : kotlin.String = name_example // kotlin.String | The desired name of the resulting activity.
val description : kotlin.String = description_example // kotlin.String | The desired description of the resulting activity.
val trainer : kotlin.String = trainer_example // kotlin.String | Whether the resulting activity should be marked as having been performed on a trainer.
val commute : kotlin.String = commute_example // kotlin.String | Whether the resulting activity should be tagged as a commute.
val dataType : kotlin.String = dataType_example // kotlin.String | The format of the uploaded file.
val externalId : kotlin.String = externalId_example // kotlin.String | The desired external identifier of the resulting activity.
try {
    val result : Upload = apiInstance.createUpload(file, name, description, trainer, commute, dataType, externalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#createUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#createUpload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| The uploaded file. | [optional]
 **name** | **kotlin.String**| The desired name of the resulting activity. | [optional]
 **description** | **kotlin.String**| The desired description of the resulting activity. | [optional]
 **trainer** | **kotlin.String**| Whether the resulting activity should be marked as having been performed on a trainer. | [optional]
 **commute** | **kotlin.String**| Whether the resulting activity should be tagged as a commute. | [optional]
 **dataType** | **kotlin.String**| The format of the uploaded file. | [optional] [enum: fit, fit.gz, tcx, tcx.gz, gpx, gpx.gz]
 **externalId** | **kotlin.String**| The desired external identifier of the resulting activity. | [optional]

### Return type

[**Upload**](Upload.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getUploadById"></a>
# **getUploadById**
> Upload getUploadById(uploadId)

Get Upload

Returns an upload for a given identifier. Requires activity:write scope.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = UploadsApi()
val uploadId : kotlin.Long = 789 // kotlin.Long | The identifier of the upload.
try {
    val result : Upload = apiInstance.getUploadById(uploadId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#getUploadById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#getUploadById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **kotlin.Long**| The identifier of the upload. |

### Return type

[**Upload**](Upload.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

