package com.mapbox.api.matrix.v1.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import java.io.IOException;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_MatrixResponse extends $AutoValue_MatrixResponse {
  AutoValue_MatrixResponse(String code, @Nullable List<DirectionsWaypoint> destinations,
      @Nullable List<DirectionsWaypoint> sources, @Nullable List<Double[]> durations) {
    super(code, destinations, sources, durations);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<MatrixResponse> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter;
    private volatile TypeAdapter<List<Double[]>> list__array__double_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, MatrixResponse object) throws IOException {
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
      jsonWriter.name("destinations");
      if (object.destinations() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter = this.list__directionsWaypoint_adapter;
        if (list__directionsWaypoint_adapter == null) {
          this.list__directionsWaypoint_adapter = list__directionsWaypoint_adapter = (TypeAdapter<List<DirectionsWaypoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
        }
        list__directionsWaypoint_adapter.write(jsonWriter, object.destinations());
      }
      jsonWriter.name("sources");
      if (object.sources() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter = this.list__directionsWaypoint_adapter;
        if (list__directionsWaypoint_adapter == null) {
          this.list__directionsWaypoint_adapter = list__directionsWaypoint_adapter = (TypeAdapter<List<DirectionsWaypoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
        }
        list__directionsWaypoint_adapter.write(jsonWriter, object.sources());
      }
      jsonWriter.name("durations");
      if (object.durations() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Double[]>> list__array__double_adapter = this.list__array__double_adapter;
        if (list__array__double_adapter == null) {
          this.list__array__double_adapter = list__array__double_adapter = (TypeAdapter<List<Double[]>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
        }
        list__array__double_adapter.write(jsonWriter, object.durations());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public MatrixResponse read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String code = null;
      List<DirectionsWaypoint> destinations = null;
      List<DirectionsWaypoint> sources = null;
      List<Double[]> durations = null;
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
          case "destinations": {
            TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter = this.list__directionsWaypoint_adapter;
            if (list__directionsWaypoint_adapter == null) {
              this.list__directionsWaypoint_adapter = list__directionsWaypoint_adapter = (TypeAdapter<List<DirectionsWaypoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
            }
            destinations = list__directionsWaypoint_adapter.read(jsonReader);
            break;
          }
          case "sources": {
            TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter = this.list__directionsWaypoint_adapter;
            if (list__directionsWaypoint_adapter == null) {
              this.list__directionsWaypoint_adapter = list__directionsWaypoint_adapter = (TypeAdapter<List<DirectionsWaypoint>>) gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
            }
            sources = list__directionsWaypoint_adapter.read(jsonReader);
            break;
          }
          case "durations": {
            TypeAdapter<List<Double[]>> list__array__double_adapter = this.list__array__double_adapter;
            if (list__array__double_adapter == null) {
              this.list__array__double_adapter = list__array__double_adapter = (TypeAdapter<List<Double[]>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
            }
            durations = list__array__double_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_MatrixResponse(code, destinations, sources, durations);
    }
  }
}
