
# DetailedSegmentEffort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the segment on which this effort was performed |  [optional]
**activity** | [**MetaActivity**](MetaActivity.md) |  |  [optional]
**athlete** | [**MetaAthlete**](MetaAthlete.md) |  |  [optional]
**movingTime** | **kotlin.Int** | The effort&#39;s moving time |  [optional]
**startIndex** | **kotlin.Int** | The start index of this effort in its activity&#39;s stream |  [optional]
**endIndex** | **kotlin.Int** | The end index of this effort in its activity&#39;s stream |  [optional]
**averageCadence** | **kotlin.Float** | The effort&#39;s average cadence |  [optional]
**averageWatts** | **kotlin.Float** | The average wattage of this effort |  [optional]
**deviceWatts** | **kotlin.Boolean** | For riding efforts, whether the wattage was reported by a dedicated recording device |  [optional]
**averageHeartrate** | **kotlin.Float** | The heart heart rate of the athlete during this effort |  [optional]
**maxHeartrate** | **kotlin.Float** | The maximum heart rate of the athlete during this effort |  [optional]
**segment** | [**SummarySegment**](SummarySegment.md) |  |  [optional]
**komRank** | **kotlin.Int** | The rank of the effort on the global leaderboard if it belongs in the top 10 at the time of upload |  [optional]
**prRank** | **kotlin.Int** | The rank of the effort on the athlete&#39;s leaderboard if it belongs in the top 3 at the time of upload |  [optional]
**hidden** | **kotlin.Boolean** | Whether this effort should be hidden when viewed within an activity |  [optional]



