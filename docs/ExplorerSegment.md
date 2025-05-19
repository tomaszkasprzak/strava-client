
# ExplorerSegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** | The unique identifier of this segment |  [optional]
**name** | **kotlin.String** | The name of this segment |  [optional]
**climbCategory** | **kotlin.Int** | The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category. If climb_category &#x3D; 5, climb_category_desc &#x3D; HC. If climb_category &#x3D; 2, climb_category_desc &#x3D; 3. |  [optional]
**climbCategoryDesc** | [**inline**](#ClimbCategoryDesc) | The description for the category of the climb |  [optional]
**avgGrade** | **kotlin.Float** | The segment&#39;s average grade, in percents |  [optional]
**startLatlng** | [**LatLng**](LatLng.md) |  |  [optional]
**endLatlng** | [**LatLng**](LatLng.md) |  |  [optional]
**elevDifference** | **kotlin.Float** | The segments&#39;s evelation difference, in meters |  [optional]
**distance** | **kotlin.Float** | The segment&#39;s distance, in meters |  [optional]
**points** | **kotlin.String** | The polyline of the segment |  [optional]


<a name="ClimbCategoryDesc"></a>
## Enum: climb_category_desc
Name | Value
---- | -----
climbCategoryDesc | NC, 4, 3, 2, 1, HC



