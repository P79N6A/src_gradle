package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
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
final class AutoValue_DirectionsResponse extends $AutoValue_DirectionsResponse {
  AutoValue_DirectionsResponse(String code, @Nullable String message,
      @Nullable List<DirectionsWaypoint> waypoints, List<DirectionsRoute> routes,
      @Nullable String uuid) {
    super(code, message, waypoints, routes, uuid);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<DirectionsResponse> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter;
    private volatile TypeAdapter<List<DirectionsRoute>> list__directionsRoute_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, DirectionsResponse object) throws IOException {
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
      jsonWriter.name("message");
      if (object.message() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.message());
      }
      jsonWriter.name("waypoints");
      if (object.waypoints() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter = this.list__directionsWaypoint_adapter;
        if (list__directionsWaypoint_adapter == null) {
          this.list__directionsWaypoint_adapter = list__directionsWaypoint_adapter = (TypeAdapter<List<DirectionsWaypoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
        }
        list__directionsWaypoint_adapter.write(jsonWriter, object.waypoints());
      }
      jsonWriter.name("routes");
      if (object.routes() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<DirectionsRoute>> list__directionsRoute_adapter = this.list__directionsRoute_adapter;
        if (list__directionsRoute_adapter == null) {
          this.list__directionsRoute_adapter = list__directionsRoute_adapter = (TypeAdapter<List<DirectionsRoute>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
        }
        list__directionsRoute_adapter.write(jsonWriter, object.routes());
      }
      jsonWriter.name("uuid");
      if (object.uuid() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.uuid());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public DirectionsResponse read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String code = null;
      String message = null;
      List<DirectionsWaypoint> waypoints = null;
      List<DirectionsRoute> routes = null;
      String uuid = null;
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
          case "message": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            message = string_adapter.read(jsonReader);
            break;
          }
          case "waypoints": {
            TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter = this.list__directionsWaypoint_adapter;
            if (list__directionsWaypoint_adapter == null) {
              this.list__directionsWaypoint_adapter = list__directionsWaypoint_adapter = (TypeAdapter<List<DirectionsWaypoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
            }
            waypoints = list__directionsWaypoint_adapter.read(jsonReader);
            break;
          }
          case "routes": {
            TypeAdapter<List<DirectionsRoute>> list__directionsRoute_adapter = this.list__directionsRoute_adapter;
            if (list__directionsRoute_adapter == null) {
              this.list__directionsRoute_adapter = list__directionsRoute_adapter = (TypeAdapter<List<DirectionsRoute>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
            }
            routes = list__directionsRoute_adapter.read(jsonReader);
            break;
          }
          case "uuid": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            uuid = string_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_DirectionsResponse(code, message, waypoints, routes, uuid);
    }
  }
}
