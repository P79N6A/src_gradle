package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_BannerComponents extends $AutoValue_BannerComponents {
  AutoValue_BannerComponents(String text, String type, @Nullable String abbreviation,
      @Nullable Integer abbreviationPriority, @Nullable String imageBaseUrl,
      @Nullable List<String> directions, @Nullable Boolean active) {
    super(text, type, abbreviation, abbreviationPriority, imageBaseUrl, directions, active);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<BannerComponents> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<Integer> integer_adapter;
    private volatile TypeAdapter<List<String>> list__string_adapter;
    private volatile TypeAdapter<Boolean> boolean__adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, BannerComponents object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("text");
      if (object.text() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.text());
      }
      jsonWriter.name("type");
      if (object.type() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.type());
      }
      jsonWriter.name("abbr");
      if (object.abbreviation() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.abbreviation());
      }
      jsonWriter.name("abbr_priority");
      if (object.abbreviationPriority() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Integer> integer_adapter = this.integer_adapter;
        if (integer_adapter == null) {
          this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
        }
        integer_adapter.write(jsonWriter, object.abbreviationPriority());
      }
      jsonWriter.name("imageBaseURL");
      if (object.imageBaseUrl() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.imageBaseUrl());
      }
      jsonWriter.name("directions");
      if (object.directions() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
        if (list__string_adapter == null) {
          this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
        }
        list__string_adapter.write(jsonWriter, object.directions());
      }
      jsonWriter.name("active");
      if (object.active() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.active());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public BannerComponents read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String text = null;
      String type = null;
      String abbreviation = null;
      Integer abbreviationPriority = null;
      String imageBaseUrl = null;
      List<String> directions = null;
      Boolean active = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "text": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            text = string_adapter.read(jsonReader);
            break;
          }
          case "type": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            type = string_adapter.read(jsonReader);
            break;
          }
          case "abbr": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            abbreviation = string_adapter.read(jsonReader);
            break;
          }
          case "abbr_priority": {
            TypeAdapter<Integer> integer_adapter = this.integer_adapter;
            if (integer_adapter == null) {
              this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
            }
            abbreviationPriority = integer_adapter.read(jsonReader);
            break;
          }
          case "imageBaseURL": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            imageBaseUrl = string_adapter.read(jsonReader);
            break;
          }
          case "directions": {
            TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
            if (list__string_adapter == null) {
              this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            }
            directions = list__string_adapter.read(jsonReader);
            break;
          }
          case "active": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            active = boolean__adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_BannerComponents(text, type, abbreviation, abbreviationPriority, imageBaseUrl, directions, active);
    }
  }
}
