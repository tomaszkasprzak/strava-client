
# SummarySegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** | The unique identifier of this segment |  [optional]
**name** | **kotlin.String** | The name of this segment |  [optional]
**activityType** | [**inline**](#ActivityType) |  |  [optional]
**distance** | **kotlin.Float** | The segment&#39;s distance, in meters |  [optional]
**averageGrade** | **kotlin.Float** | The segment&#39;s average grade, in percents |  [optional]
**maximumGrade** | **kotlin.Float** | The segments&#39;s maximum grade, in percents |  [optional]
**elevationHigh** | **kotlin.Float** | The segments&#39;s highest elevation, in meters |  [optional]
**elevationLow** | **kotlin.Float** | The segments&#39;s lowest elevation, in meters |  [optional]
**startLatlng** | [**LatLng**](LatLng.md) |  |  [optional]
**endLatlng** | [**LatLng**](LatLng.md) |  |  [optional]
**climbCategory** | **kotlin.Int** | The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category. |  [optional]
**city** | **kotlin.String** | The segments&#39;s city. |  [optional]
**state** | **kotlin.String** | The segments&#39;s state or geographical region. |  [optional]
**country** | **kotlin.String** | The segment&#39;s country. |  [optional]
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether this segment is private. |  [optional]
**athletePrEffort** | [**SummaryPRSegmentEffort**](SummaryPRSegmentEffort.md) |  |  [optional]
**athleteSegmentStats** | [**SummarySegmentEffort**](SummarySegmentEffort.md) |  |  [optional]


<a name="ActivityType"></a>
## Enum: activity_type
Name | Value
---- | -----
activityType | Ride, Run



