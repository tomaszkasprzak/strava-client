
# BaseStream

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originalSize** | **kotlin.Int** | The number of data points in this stream |  [optional]
**resolution** | [**inline**](#Resolution) | The level of detail (sampling) in which this stream was returned |  [optional]
**seriesType** | [**inline**](#SeriesType) | The base series used in the case the stream was downsampled |  [optional]


<a name="Resolution"></a>
## Enum: resolution
Name | Value
---- | -----
resolution | low, medium, high


<a name="SeriesType"></a>
## Enum: series_type
Name | Value
---- | -----
seriesType | distance, time



