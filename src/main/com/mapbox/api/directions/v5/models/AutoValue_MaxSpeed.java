package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_MaxSpeed extends $AutoValue_MaxSpeed {
  AutoValue_MaxSpeed(@Nullable Integer speed, @Nullable String unit, @Nullable Boolean unknown,
      @Nullable Boolean none) {
    super(speed, unit, unknown, none);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<MaxSpeed> {
    private volatile TypeAdapter<Integer> integer_adapter;
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<Boolean> boolean__adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, MaxSpeed object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("speed");
      if (object.speed() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Integer> integer_adapter = this.integer_adapter;
        if (integer_adapter == null) {
          this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
        }
        integer_adapter.write(jsonWriter, object.speed());
      }
      jsonWriter.name("unit");
      if (object.unit() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.unit());
      }
      jsonWriter.name("unknown");
      if (object.unknown() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.unknown());
      }
      jsonWriter.name("none");
      if (object.none() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.none());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public MaxSpeed read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      Integer speed = null;
      String unit = null;
      Boolean unknown = null;
      Boolean none = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "speed": {
            TypeAdapter<Integer> integer_adapter = this.integer_adapter;
            if (integer_adapter == null) {
              this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
            }
            speed = integer_adapter.read(jsonReader);
            break;
          }
          case "unit": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            unit = string_adapter.read(jsonReader);
            break;
          }
          case "unknown": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            unknown = boolean__adapter.read(jsonReader);
            break;
          }
          case "none": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            none = boolean__adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_MaxSpeed(speed, unit, unknown, none);
    }
  }
}
