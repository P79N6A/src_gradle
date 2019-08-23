package com.mapbox.api.matching.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.mapbox.api.directions.v5.models.BannerComponents;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.BannerText;
import com.mapbox.api.directions.v5.models.DirectionsError;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.IntersectionLanes;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.MaxSpeed;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.api.geocoding.v5.models.CarmenContext;
import com.mapbox.api.geocoding.v5.models.CarmenFeature;
import com.mapbox.api.geocoding.v5.models.GeocodingResponse;
import com.mapbox.api.matrix.v1.models.MatrixResponse;
import com.mapbox.api.optimization.v1.models.OptimizationResponse;
import com.mapbox.api.optimization.v1.models.OptimizationWaypoint;
import java.lang.Override;
import java.lang.SuppressWarnings;

public final class AutoValueGson_MapMatchingAdapterFactory extends MapMatchingAdapterFactory {
  @Override
  @SuppressWarnings("unchecked")
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    Class<?> rawType = type.getRawType();
    if (BannerComponents.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) BannerComponents.typeAdapter(gson);
    } else if (BannerInstructions.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) BannerInstructions.typeAdapter(gson);
    } else if (BannerText.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) BannerText.typeAdapter(gson);
    } else if (CarmenContext.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) CarmenContext.typeAdapter(gson);
    } else if (CarmenFeature.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) CarmenFeature.typeAdapter(gson);
    } else if (DirectionsError.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) DirectionsError.typeAdapter(gson);
    } else if (DirectionsResponse.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) DirectionsResponse.typeAdapter(gson);
    } else if (DirectionsRoute.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) DirectionsRoute.typeAdapter(gson);
    } else if (DirectionsWaypoint.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) DirectionsWaypoint.typeAdapter(gson);
    } else if (GeocodingResponse.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) GeocodingResponse.typeAdapter(gson);
    } else if (IntersectionLanes.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) IntersectionLanes.typeAdapter(gson);
    } else if (LegAnnotation.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) LegAnnotation.typeAdapter(gson);
    } else if (LegStep.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) LegStep.typeAdapter(gson);
    } else if (MapMatchingError.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) MapMatchingError.typeAdapter(gson);
    } else if (MapMatchingMatching.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) MapMatchingMatching.typeAdapter(gson);
    } else if (MapMatchingResponse.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) MapMatchingResponse.typeAdapter(gson);
    } else if (MapMatchingTracepoint.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) MapMatchingTracepoint.typeAdapter(gson);
    } else if (MatrixResponse.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) MatrixResponse.typeAdapter(gson);
    } else if (MaxSpeed.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) MaxSpeed.typeAdapter(gson);
    } else if (OptimizationResponse.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) OptimizationResponse.typeAdapter(gson);
    } else if (OptimizationWaypoint.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) OptimizationWaypoint.typeAdapter(gson);
    } else if (RouteLeg.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) RouteLeg.typeAdapter(gson);
    } else if (RouteOptions.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) RouteOptions.typeAdapter(gson);
    } else if (StepIntersection.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) StepIntersection.typeAdapter(gson);
    } else if (StepManeuver.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) StepManeuver.typeAdapter(gson);
    } else if (VoiceInstructions.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) VoiceInstructions.typeAdapter(gson);
    } else {
      return null;
    }
  }
}
