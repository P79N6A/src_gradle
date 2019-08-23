package com.mapbox.api.geocoding.v5.models;

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
final class AutoValue_GeocodingResponse extends $AutoValue_GeocodingResponse {
  AutoValue_GeocodingResponse(String type, List<String> query, List<CarmenFeature> features,
      String attribution) {
    super(type, query, features, attribution);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<GeocodingResponse> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<String>> list__string_adapter;
    private volatile TypeAdapter<List<CarmenFeature>> list__carmenFeature_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, GeocodingResponse object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
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
      jsonWriter.name("query");
      if (object.query() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
        if (list__string_adapter == null) {
          this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
        }
        list__string_adapter.write(jsonWriter, object.query());
      }
      jsonWriter.name("features");
      if (object.features() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<CarmenFeature>> list__carmenFeature_adapter = this.list__carmenFeature_adapter;
        if (list__carmenFeature_adapter == null) {
          this.list__carmenFeature_adapter = list__carmenFeature_adapter = (TypeAdapter<List<CarmenFeature>>) gson.getAdapter(TypeToken.getParameterized(List.class, CarmenFeature.class));
        }
        list__carmenFeature_adapter.write(jsonWriter, object.features());
      }
      jsonWriter.name("attribution");
      if (object.attribution() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.attribution());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public GeocodingResponse read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      List<String> query = null;
      List<CarmenFeature> features = null;
      String attribution = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "type": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            type = string_adapter.read(jsonReader);
            break;
          }
          case "query": {
            TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
            if (list__string_adapter == null) {
              this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            }
            query = list__string_adapter.read(jsonReader);
            break;
          }
          case "features": {
            TypeAdapter<List<CarmenFeature>> list__carmenFeature_adapter = this.list__carmenFeature_adapter;
            if (list__carmenFeature_adapter == null) {
              this.list__carmenFeature_adapter = list__carmenFeature_adapter = (TypeAdapter<List<CarmenFeature>>) gson.getAdapter(TypeToken.getParameterized(List.class, CarmenFeature.class));
            }
            features = list__carmenFeature_adapter.read(jsonReader);
            break;
          }
          case "attribution": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            attribution = string_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_GeocodingResponse(type, query, features, attribution);
    }
  }
}
