package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_DirectionsWaypoint extends $AutoValue_DirectionsWaypoint {
  AutoValue_DirectionsWaypoint(@Nullable String name, @Nullable double[] rawLocation) {
    super(name, rawLocation);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<DirectionsWaypoint> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<double[]> array__double_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, DirectionsWaypoint object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
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
    public DirectionsWaypoint read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String name = null;
      double[] rawLocation = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
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
      return new AutoValue_DirectionsWaypoint(name, rawLocation);
    }
  }
}
