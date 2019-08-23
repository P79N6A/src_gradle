package com.mapbox.api.optimization.v1.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_OptimizationResponse extends $AutoValue_OptimizationResponse {
  AutoValue_OptimizationResponse(@Nullable String code,
      @Nullable List<OptimizationWaypoint> waypoints, @Nullable List<DirectionsRoute> trips) {
    super(code, waypoints, trips);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<OptimizationResponse> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<OptimizationWaypoint>> list__optimizationWaypoint_adapter;
    private volatile TypeAdapter<List<DirectionsRoute>> list__directionsRoute_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, OptimizationResponse object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("code");
      if (object.code() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.code());
      }
      jsonWriter.name("waypoints");
      if (object.waypoints() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<OptimizationWaypoint>> list__optimizationWaypoint_adapter = this.list__optimizationWaypoint_adapter;
        if (list__optimizationWaypoint_adapter == null) {
          this.list__optimizationWaypoint_adapter = list__optimizationWaypoint_adapter = (TypeAdapter<List<OptimizationWaypoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, OptimizationWaypoint.class));
        }
        list__optimizationWaypoint_adapter.write(jsonWriter, object.waypoints());
      }
      jsonWriter.name("trips");
      if (object.trips() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<DirectionsRoute>> list__directionsRoute_adapter = this.list__directionsRoute_adapter;
        if (list__directionsRoute_adapter == null) {
          this.list__directionsRoute_adapter = list__directionsRoute_adapter = (TypeAdapter<List<DirectionsRoute>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
        }
        list__directionsRoute_adapter.write(jsonWriter, object.trips());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public OptimizationResponse read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String code = null;
      List<OptimizationWaypoint> waypoints = null;
      List<DirectionsRoute> trips = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "code": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            code = string_adapter.read(jsonReader);
            break;
          }
          case "waypoints": {
            TypeAdapter<List<OptimizationWaypoint>> list__optimizationWaypoint_adapter = this.list__optimizationWaypoint_adapter;
            if (list__optimizationWaypoint_adapter == null) {
              this.list__optimizationWaypoint_adapter = list__optimizationWaypoint_adapter = (TypeAdapter<List<OptimizationWaypoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, OptimizationWaypoint.class));
            }
            waypoints = list__optimizationWaypoint_adapter.read(jsonReader);
            break;
          }
          case "trips": {
            TypeAdapter<List<DirectionsRoute>> list__directionsRoute_adapter = this.list__directionsRoute_adapter;
            if (list__directionsRoute_adapter == null) {
              this.list__directionsRoute_adapter = list__directionsRoute_adapter = (TypeAdapter<List<DirectionsRoute>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
            }
            trips = list__directionsRoute_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_OptimizationResponse(code, waypoints, trips);
    }
  }
}
