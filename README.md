# io.swagger.client - Kotlin client library for Strava API v3

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://www.strava.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivitiesApi* | [**createActivity**](docs/ActivitiesApi.md#createactivity) | **POST** /activities | Create an Activity
*ActivitiesApi* | [**getActivityById**](docs/ActivitiesApi.md#getactivitybyid) | **GET** /activities/{id} | Get Activity
*ActivitiesApi* | [**getCommentsByActivityId**](docs/ActivitiesApi.md#getcommentsbyactivityid) | **GET** /activities/{id}/comments | List Activity Comments
*ActivitiesApi* | [**getKudoersByActivityId**](docs/ActivitiesApi.md#getkudoersbyactivityid) | **GET** /activities/{id}/kudos | List Activity Kudoers
*ActivitiesApi* | [**getLapsByActivityId**](docs/ActivitiesApi.md#getlapsbyactivityid) | **GET** /activities/{id}/laps | List Activity Laps
*ActivitiesApi* | [**getLoggedInAthleteActivities**](docs/ActivitiesApi.md#getloggedinathleteactivities) | **GET** /athlete/activities | List Athlete Activities
*ActivitiesApi* | [**getZonesByActivityId**](docs/ActivitiesApi.md#getzonesbyactivityid) | **GET** /activities/{id}/zones | Get Activity Zones
*ActivitiesApi* | [**updateActivityById**](docs/ActivitiesApi.md#updateactivitybyid) | **PUT** /activities/{id} | Update Activity
*AthletesApi* | [**getLoggedInAthlete**](docs/AthletesApi.md#getloggedinathlete) | **GET** /athlete | Get Authenticated Athlete
*AthletesApi* | [**getLoggedInAthleteZones**](docs/AthletesApi.md#getloggedinathletezones) | **GET** /athlete/zones | Get Zones
*AthletesApi* | [**getStats**](docs/AthletesApi.md#getstats) | **GET** /athletes/{id}/stats | Get Athlete Stats
*AthletesApi* | [**updateLoggedInAthlete**](docs/AthletesApi.md#updateloggedinathlete) | **PUT** /athlete | Update Athlete
*ClubsApi* | [**getClubActivitiesById**](docs/ClubsApi.md#getclubactivitiesbyid) | **GET** /clubs/{id}/activities | List Club Activities
*ClubsApi* | [**getClubAdminsById**](docs/ClubsApi.md#getclubadminsbyid) | **GET** /clubs/{id}/admins | List Club Administrators
*ClubsApi* | [**getClubById**](docs/ClubsApi.md#getclubbyid) | **GET** /clubs/{id} | Get Club
*ClubsApi* | [**getClubMembersById**](docs/ClubsApi.md#getclubmembersbyid) | **GET** /clubs/{id}/members | List Club Members
*ClubsApi* | [**getLoggedInAthleteClubs**](docs/ClubsApi.md#getloggedinathleteclubs) | **GET** /athlete/clubs | List Athlete Clubs
*GearsApi* | [**getGearById**](docs/GearsApi.md#getgearbyid) | **GET** /gear/{id} | Get Equipment
*RoutesApi* | [**getRouteAsGPX**](docs/RoutesApi.md#getrouteasgpx) | **GET** /routes/{id}/export_gpx | Export Route GPX
*RoutesApi* | [**getRouteAsTCX**](docs/RoutesApi.md#getrouteastcx) | **GET** /routes/{id}/export_tcx | Export Route TCX
*RoutesApi* | [**getRouteById**](docs/RoutesApi.md#getroutebyid) | **GET** /routes/{id} | Get Route
*RoutesApi* | [**getRoutesByAthleteId**](docs/RoutesApi.md#getroutesbyathleteid) | **GET** /athletes/{id}/routes | List Athlete Routes
*SegmentEffortsApi* | [**getEffortsBySegmentId**](docs/SegmentEffortsApi.md#geteffortsbysegmentid) | **GET** /segment_efforts | List Segment Efforts
*SegmentEffortsApi* | [**getSegmentEffortById**](docs/SegmentEffortsApi.md#getsegmenteffortbyid) | **GET** /segment_efforts/{id} | Get Segment Effort
*SegmentsApi* | [**exploreSegments**](docs/SegmentsApi.md#exploresegments) | **GET** /segments/explore | Explore segments
*SegmentsApi* | [**getLoggedInAthleteStarredSegments**](docs/SegmentsApi.md#getloggedinathletestarredsegments) | **GET** /segments/starred | List Starred Segments
*SegmentsApi* | [**getSegmentById**](docs/SegmentsApi.md#getsegmentbyid) | **GET** /segments/{id} | Get Segment
*SegmentsApi* | [**starSegment**](docs/SegmentsApi.md#starsegment) | **PUT** /segments/{id}/starred | Star Segment
*StreamsApi* | [**getActivityStreams**](docs/StreamsApi.md#getactivitystreams) | **GET** /activities/{id}/streams | Get Activity Streams
*StreamsApi* | [**getRouteStreams**](docs/StreamsApi.md#getroutestreams) | **GET** /routes/{id}/streams | Get Route Streams
*StreamsApi* | [**getSegmentEffortStreams**](docs/StreamsApi.md#getsegmenteffortstreams) | **GET** /segment_efforts/{id}/streams | Get Segment Effort Streams
*StreamsApi* | [**getSegmentStreams**](docs/StreamsApi.md#getsegmentstreams) | **GET** /segments/{id}/streams | Get Segment Streams
*UploadsApi* | [**createUpload**](docs/UploadsApi.md#createupload) | **POST** /uploads | Upload Activity
*UploadsApi* | [**getUploadById**](docs/UploadsApi.md#getuploadbyid) | **GET** /uploads/{uploadId} | Get Upload


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.ActivityStats](docs/ActivityStats.md)
 - [io.swagger.client.models.ActivityTotal](docs/ActivityTotal.md)
 - [io.swagger.client.models.ActivityType](docs/ActivityType.md)
 - [io.swagger.client.models.ActivityZone](docs/ActivityZone.md)
 - [io.swagger.client.models.AltitudeStream](docs/AltitudeStream.md)
 - [io.swagger.client.models.BaseStream](docs/BaseStream.md)
 - [io.swagger.client.models.CadenceStream](docs/CadenceStream.md)
 - [io.swagger.client.models.ClubActivity](docs/ClubActivity.md)
 - [io.swagger.client.models.ClubAthlete](docs/ClubAthlete.md)
 - [io.swagger.client.models.Comment](docs/Comment.md)
 - [io.swagger.client.models.DetailedActivity](docs/DetailedActivity.md)
 - [io.swagger.client.models.DetailedAthlete](docs/DetailedAthlete.md)
 - [io.swagger.client.models.DetailedClub](docs/DetailedClub.md)
 - [io.swagger.client.models.DetailedGear](docs/DetailedGear.md)
 - [io.swagger.client.models.DetailedSegment](docs/DetailedSegment.md)
 - [io.swagger.client.models.DetailedSegmentEffort](docs/DetailedSegmentEffort.md)
 - [io.swagger.client.models.DistanceStream](docs/DistanceStream.md)
 - [io.swagger.client.models.Error](docs/Error.md)
 - [io.swagger.client.models.ExplorerResponse](docs/ExplorerResponse.md)
 - [io.swagger.client.models.ExplorerSegment](docs/ExplorerSegment.md)
 - [io.swagger.client.models.Fault](docs/Fault.md)
 - [io.swagger.client.models.HeartRateZoneRanges](docs/HeartRateZoneRanges.md)
 - [io.swagger.client.models.HeartrateStream](docs/HeartrateStream.md)
 - [io.swagger.client.models.Lap](docs/Lap.md)
 - [io.swagger.client.models.LatLng](docs/LatLng.md)
 - [io.swagger.client.models.LatLngStream](docs/LatLngStream.md)
 - [io.swagger.client.models.MetaActivity](docs/MetaActivity.md)
 - [io.swagger.client.models.MetaAthlete](docs/MetaAthlete.md)
 - [io.swagger.client.models.MetaClub](docs/MetaClub.md)
 - [io.swagger.client.models.MovingStream](docs/MovingStream.md)
 - [io.swagger.client.models.PhotosSummary](docs/PhotosSummary.md)
 - [io.swagger.client.models.PhotosSummaryPrimary](docs/PhotosSummaryPrimary.md)
 - [io.swagger.client.models.PolylineMap](docs/PolylineMap.md)
 - [io.swagger.client.models.PowerStream](docs/PowerStream.md)
 - [io.swagger.client.models.PowerZoneRanges](docs/PowerZoneRanges.md)
 - [io.swagger.client.models.Route](docs/Route.md)
 - [io.swagger.client.models.SmoothGradeStream](docs/SmoothGradeStream.md)
 - [io.swagger.client.models.SmoothVelocityStream](docs/SmoothVelocityStream.md)
 - [io.swagger.client.models.Split](docs/Split.md)
 - [io.swagger.client.models.SportType](docs/SportType.md)
 - [io.swagger.client.models.StreamSet](docs/StreamSet.md)
 - [io.swagger.client.models.SummaryActivity](docs/SummaryActivity.md)
 - [io.swagger.client.models.SummaryAthlete](docs/SummaryAthlete.md)
 - [io.swagger.client.models.SummaryClub](docs/SummaryClub.md)
 - [io.swagger.client.models.SummaryGear](docs/SummaryGear.md)
 - [io.swagger.client.models.SummaryPRSegmentEffort](docs/SummaryPRSegmentEffort.md)
 - [io.swagger.client.models.SummarySegment](docs/SummarySegment.md)
 - [io.swagger.client.models.SummarySegmentEffort](docs/SummarySegmentEffort.md)
 - [io.swagger.client.models.TemperatureStream](docs/TemperatureStream.md)
 - [io.swagger.client.models.TimeStream](docs/TimeStream.md)
 - [io.swagger.client.models.TimedZoneDistribution](docs/TimedZoneDistribution.md)
 - [io.swagger.client.models.TimedZoneRange](docs/TimedZoneRange.md)
 - [io.swagger.client.models.UpdatableActivity](docs/UpdatableActivity.md)
 - [io.swagger.client.models.Upload](docs/Upload.md)
 - [io.swagger.client.models.Waypoint](docs/Waypoint.md)
 - [io.swagger.client.models.ZoneRange](docs/ZoneRange.md)
 - [io.swagger.client.models.ZoneRanges](docs/ZoneRanges.md)
 - [io.swagger.client.models.Zones](docs/Zones.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="strava_oauth"></a>
### strava_oauth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.strava.com/api/v3/oauth/authorize
- **Scopes**: 
  - read: Read public segments, public routes, public profile data, public posts, public events, club feeds, and leaderboards
  - read_all: Read private routes, private segments, and private events for the user
  - profile:read_all: Read all profile information even if the user has set their profile visibility to Followers or Only You
  - profile:write: Update the user&#39;s weight and Functional Threshold Power (FTP), and access to star or unstar segments on their behalf
  - activity:read: Read the user&#39;s activity data for activities that are visible to Everyone and Followers, excluding privacy zone data
  - activity:read_all: The same access as activity:read, plus privacy zone data and access to read the user&#39;s activities with visibility set to Only You
  - activity:write: Access to create manual activities and uploads, and access to edit any activities that are visible to the app, based on activity read access level

