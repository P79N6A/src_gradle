package com.mapbox.api.matching.v5.models;

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
final class AutoValue_MapMatchingTracepoint extends $AutoValue_MapMatchingTracepoint {
  AutoValue_MapMatchingTracepoint(@Nullable Integer matchingsIndex,
      @Nullable Integer alternativesCount, @Nullable Integer waypointIndex, @Nullable String name,
      @Nullable double[] rawLocation) {
    super(matchingsIndex, alternativesCount, waypointIndex, name, rawLocation);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<MapMatchingTracepoint> {
    private volatile TypeAdapter<Integer> integer_adapter;
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<double[]> array__double_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, MapMatchingTracepoint object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("matchings_index");
      if (object.matchingsIndex() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Integer> integer_adapter = this.integer_adapter;
        if (integer_adapter == null) {
          this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
        }
        integer_adapter.write(jsonWriter, object.matchingsIndex());
      }
      jsonWriter.name("alternatives_count");
      if (object.alternativesCount() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Integer> integer_adapter = this.integer_adapter;
        if (integer_adapter == null) {
          this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
        }
        integer_adapter.write(jsonWriter, object.alternativesCount());
      }
      jsonWriter.name("waypoint_index");
      if (object.waypointIndex() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Integer> integer_adapter = this.integer_adapter;
        if (integer_adapter == null) {
          this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
        }
        integer_adapter.write(jsonWriter, object.waypointIndex());
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
    public MapMatchingTracepoint read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      Integer matchingsIndex = null;
      Integer alternativesCount = null;
      Integer waypointIndex = null;
      String name = null;
      double[] rawLocation = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "matchings_index": {
            TypeAdapter<Integer> integer_adapter = this.integer_adapter;
            if (integer_adapter == null) {
              this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
            }
            matchingsIndex = integer_adapter.read(jsonReader);
            break;
          }
          case "alternatives_count": {
            TypeAdapter<Integer> integer_adapter = this.integer_adapter;
            if (integer_adapter == null) {
              this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
            }
            alternativesCount = integer_adapter.read(jsonReader);
            break;
          }
          case "waypoint_index": {
            TypeAdapter<Integer> integer_adapter = this.integer_adapter;
            if (integer_adapter == null) {
              this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
            }
            waypointIndex = integer_adapter.read(jsonReader);
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
      return new AutoValue_MapMatchingTracepoint(matchingsIndex, alternativesCount, waypointIndex, name, rawLocation);
    }
  }
}
