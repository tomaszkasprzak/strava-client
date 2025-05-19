# ClubsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClubActivitiesById**](ClubsApi.md#getClubActivitiesById) | **GET** /clubs/{id}/activities | List Club Activities
[**getClubAdminsById**](ClubsApi.md#getClubAdminsById) | **GET** /clubs/{id}/admins | List Club Administrators
[**getClubById**](ClubsApi.md#getClubById) | **GET** /clubs/{id} | Get Club
[**getClubMembersById**](ClubsApi.md#getClubMembersById) | **GET** /clubs/{id}/members | List Club Members
[**getLoggedInAthleteClubs**](ClubsApi.md#getLoggedInAthleteClubs) | **GET** /athlete/clubs | List Athlete Clubs


<a name="getClubActivitiesById"></a>
# **getClubActivitiesById**
> kotlin.Array&lt;ClubActivity&gt; getClubActivitiesById(id, page, perPage)

List Club Activities

Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ClubsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the club.
val page : kotlin.Int = 56 // kotlin.Int | Page number. Defaults to 1.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<ClubActivity> = apiInstance.getClubActivitiesById(id, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClubsApi#getClubActivitiesById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClubsApi#getClubActivitiesById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the club. |
 **page** | **kotlin.Int**| Page number. Defaults to 1. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;ClubActivity&gt;**](ClubActivity.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClubAdminsById"></a>
# **getClubAdminsById**
> kotlin.Array&lt;SummaryAthlete&gt; getClubAdminsById(id, page, perPage)

List Club Administrators

Returns a list of the administrators of a given club.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ClubsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the club.
val page : kotlin.Int = 56 // kotlin.Int | Page number. Defaults to 1.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<SummaryAthlete> = apiInstance.getClubAdminsById(id, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClubsApi#getClubAdminsById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClubsApi#getClubAdminsById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the club. |
 **page** | **kotlin.Int**| Page number. Defaults to 1. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;SummaryAthlete&gt;**](SummaryAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClubById"></a>
# **getClubById**
> DetailedClub getClubById(id)

Get Club

Returns a given club using its identifier.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ClubsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the club.
try {
    val result : DetailedClub = apiInstance.getClubById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClubsApi#getClubById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClubsApi#getClubById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the club. |

### Return type

[**DetailedClub**](DetailedClub.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClubMembersById"></a>
# **getClubMembersById**
> kotlin.Array&lt;ClubAthlete&gt; getClubMembersById(id, page, perPage)

List Club Members

Returns a list of the athletes who are members of a given club.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ClubsApi()
val id : kotlin.Long = 789 // kotlin.Long | The identifier of the club.
val page : kotlin.Int = 56 // kotlin.Int | Page number. Defaults to 1.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<ClubAthlete> = apiInstance.getClubMembersById(id, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClubsApi#getClubMembersById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClubsApi#getClubMembersById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The identifier of the club. |
 **page** | **kotlin.Int**| Page number. Defaults to 1. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;ClubAthlete&gt;**](ClubAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedInAthleteClubs"></a>
# **getLoggedInAthleteClubs**
> kotlin.Array&lt;SummaryClub&gt; getLoggedInAthleteClubs(page, perPage)

List Athlete Clubs

Returns a list of the clubs whose membership includes the authenticated athlete.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ClubsApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number. Defaults to 1.
val perPage : kotlin.Int = 56 // kotlin.Int | Number of items per page. Defaults to 30.
try {
    val result : kotlin.Array<SummaryClub> = apiInstance.getLoggedInAthleteClubs(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClubsApi#getLoggedInAthleteClubs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClubsApi#getLoggedInAthleteClubs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number. Defaults to 1. | [optional]
 **perPage** | **kotlin.Int**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**kotlin.Array&lt;SummaryClub&gt;**](SummaryClub.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

