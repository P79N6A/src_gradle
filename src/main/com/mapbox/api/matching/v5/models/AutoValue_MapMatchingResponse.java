package com.mapbox.api.matching.v5.models;

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
final class AutoValue_MapMatchingResponse extends $AutoValue_MapMatchingResponse {
  AutoValue_MapMatchingResponse(String code, @Nullable String message,
      @Nullable List<MapMatchingMatching> matchings,
      @Nullable List<MapMatchingTracepoint> tracepoints) {
    super(code, message, matchings, tracepoints);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<MapMatchingResponse> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<MapMatchingMatching>> list__mapMatchingMatching_adapter;
    private volatile TypeAdapter<List<MapMatchingTracepoint>> list__mapMatchingTracepoint_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, MapMatchingResponse object) throws IOException {
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
      jsonWriter.name("matchings");
      if (object.matchings() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<MapMatchingMatching>> list__mapMatchingMatching_adapter = this.list__mapMatchingMatching_adapter;
        if (list__mapMatchingMatching_adapter == null) {
          this.list__mapMatchingMatching_adapter = list__mapMatchingMatching_adapter = (TypeAdapter<List<MapMatchingMatching>>) gson.getAdapter(TypeToken.getParameterized(List.class, MapMatchingMatching.class));
        }
        list__mapMatchingMatching_adapter.write(jsonWriter, object.matchings());
      }
      jsonWriter.name("tracepoints");
      if (object.tracepoints() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<MapMatchingTracepoint>> list__mapMatchingTracepoint_adapter = this.list__mapMatchingTracepoint_adapter;
        if (list__mapMatchingTracepoint_adapter == null) {
          this.list__mapMatchingTracepoint_adapter = list__mapMatchingTracepoint_adapter = (TypeAdapter<List<MapMatchingTracepoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, MapMatchingTracepoint.class));
        }
        list__mapMatchingTracepoint_adapter.write(jsonWriter, object.tracepoints());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public MapMatchingResponse read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String code = null;
      String message = null;
      List<MapMatchingMatching> matchings = null;
      List<MapMatchingTracepoint> tracepoints = null;
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
          case "matchings": {
            TypeAdapter<List<MapMatchingMatching>> list__mapMatchingMatching_adapter = this.list__mapMatchingMatching_adapter;
            if (list__mapMatchingMatching_adapter == null) {
              this.list__mapMatchingMatching_adapter = list__mapMatchingMatching_adapter = (TypeAdapter<List<MapMatchingMatching>>) gson.getAdapter(TypeToken.getParameterized(List.class, MapMatchingMatching.class));
            }
            matchings = list__mapMatchingMatching_adapter.read(jsonReader);
            break;
          }
          case "tracepoints": {
            TypeAdapter<List<MapMatchingTracepoint>> list__mapMatchingTracepoint_adapter = this.list__mapMatchingTracepoint_adapter;
            if (list__mapMatchingTracepoint_adapter == null) {
              this.list__mapMatchingTracepoint_adapter = list__mapMatchingTracepoint_adapter = (TypeAdapter<List<MapMatchingTracepoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, MapMatchingTracepoint.class));
            }
            tracepoints = list__mapMatchingTracepoint_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_MapMatchingResponse(code, message, matchings, tracepoints);
    }
  }
}
