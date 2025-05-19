
# SummaryAthlete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceState** | **kotlin.Int** | Resource state, indicates level of detail. Possible values: 1 -&gt; \&quot;meta\&quot;, 2 -&gt; \&quot;summary\&quot;, 3 -&gt; \&quot;detail\&quot; |  [optional]
**firstname** | **kotlin.String** | The athlete&#39;s first name. |  [optional]
**lastname** | **kotlin.String** | The athlete&#39;s last name. |  [optional]
**profileMedium** | **kotlin.String** | URL to a 62x62 pixel profile picture. |  [optional]
**profile** | **kotlin.String** | URL to a 124x124 pixel profile picture. |  [optional]
**city** | **kotlin.String** | The athlete&#39;s city. |  [optional]
**state** | **kotlin.String** | The athlete&#39;s state or geographical region. |  [optional]
**country** | **kotlin.String** | The athlete&#39;s country. |  [optional]
**sex** | [**inline**](#Sex) | The athlete&#39;s sex. |  [optional]
**premium** | **kotlin.Boolean** | Deprecated.  Use summit field instead. Whether the athlete has any Summit subscription. |  [optional]
**summit** | **kotlin.Boolean** | Whether the athlete has any Summit subscription. |  [optional]
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The time at which the athlete was created. |  [optional]
**updatedAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The time at which the athlete was last updated. |  [optional]


<a name="Sex"></a>
## Enum: sex
Name | Value
---- | -----
sex | M, F



