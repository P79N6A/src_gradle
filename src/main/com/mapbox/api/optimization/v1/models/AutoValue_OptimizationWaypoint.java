package com.mapbox.api.optimization.v1.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_OptimizationWaypoint extends $AutoValue_OptimizationWaypoint {
  AutoValue_OptimizationWaypoint(int waypointIndex, int tripsIndex, @Nullable String name,
      @Nullable double[] rawLocation) {
    super(waypointIndex, tripsIndex, name, rawLocation);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<OptimizationWaypoint> {
    private volatile TypeAdapter<Integer> int__adapter;
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<double[]> array__double_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, OptimizationWaypoint object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("waypoint_index");
      {
        TypeAdapter<Integer> int__adapter = this.int__adapter;
        if (int__adapter == null) {
          this.int__adapter = int__adapter = gson.getAdapter(Integer.class);
        }
        int__adapter.write(jsonWriter, object.waypointIndex());
      }
      jsonWriter.name("trips_index");
      {
        TypeAdapter<Integer> int__adapter = this.int__adapter;
        if (int__adapter == null) {
          this.int__adapter = int__adapter = gson.getAdapter(Integer.class);
        }
        int__adapter.write(jsonWriter, object.tripsIndex());
      }
      jsonWriter.name("name");
      if (object.name() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.name());
      }
      jsonWriter.name("location");
      if (object.rawLocation() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<double[]> array__double_adapter = this.array__double_adapter;
        if (array__double_adapter == null) {
          this.array__double_adapter = array__double_adapter = gson.getAdapter(double[].class);
        }
        array__double_adapter.write(jsonWriter, object.rawLocation());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public OptimizationWaypoint read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      int waypointIndex = 0;
      int tripsIndex = 0;
      String name = null;
      double[] rawLocation = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "waypoint_index": {
            TypeAdapter<Integer> int__adapter = this.int__adapter;
            if (int__adapter == null) {
              this.int__adapter = int__adapter = gson.getAdapter(Integer.class);
            }
            waypointIndex = int__adapter.read(jsonReader);
            break;
          }
          case "trips_index": {
            TypeAdapter<Integer> int__adapter = this.int__adapter;
            if (int__adapter == null) {
              this.int__adapter = int__adapter = gson.getAdapter(Integer.class);
            }
            tripsIndex = int__adapter.read(jsonReader);
            break;
          }
          case "name": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            name = string_adapter.read(jsonReader);
            break;
          }
          case "location": {
            TypeAdapter<double[]> array__double_adapter = this.array__double_adapter;
            if (array__double_adapter == null) {
              this.array__double_adapter = array__double_adapter = gson.getAdapter(double[].class);
            }
            rawLocation = array__double_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_OptimizationWaypoint(waypointIndex, tripsIndex, name, rawLocation);
    }
  }
}
