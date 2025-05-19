
# SummaryClub

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profileMedium** | **kotlin.String** | URL to a 60x60 pixel profile picture. |  [optional]
**coverPhoto** | **kotlin.String** | URL to a ~1185x580 pixel cover photo. |  [optional]
**coverPhotoSmall** | **kotlin.String** | URL to a ~360x176  pixel cover photo. |  [optional]
**sportType** | [**inline**](#SportType) | Deprecated. Prefer to use activity_types. |  [optional]
**activityTypes** | [**kotlin.Array&lt;ActivityType&gt;**](ActivityType.md) | The activity types that count for a club. This takes precedence over sport_type. |  [optional]
**city** | **kotlin.String** | The club&#39;s city. |  [optional]
**state** | **kotlin.String** | The club&#39;s state or geographical region. |  [optional]
**country** | **kotlin.String** | The club&#39;s country. |  [optional]
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether the club is private. |  [optional]
**memberCount** | **kotlin.Int** | The club&#39;s member count. |  [optional]
**featured** | **kotlin.Boolean** | Whether the club is featured or not. |  [optional]
**verified** | **kotlin.Boolean** | Whether the club is verified or not. |  [optional]
**url** | **kotlin.String** | The club&#39;s vanity URL. |  [optional]


<a name="SportType"></a>
## Enum: sport_type
Name | Value
---- | -----
sportType | cycling, running, triathlon, other



