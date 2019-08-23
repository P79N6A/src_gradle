package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
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
final class AutoValue_DirectionsRoute extends $AutoValue_DirectionsRoute {
  AutoValue_DirectionsRoute(@Nullable Double distance, @Nullable Double duration,
      @Nullable String geometry, @Nullable Double weight, @Nullable String weightName,
      @Nullable List<RouteLeg> legs, @Nullable RouteOptions routeOptions,
      @Nullable String voiceLanguage) {
    super(distance, duration, geometry, weight, weightName, legs, routeOptions, voiceLanguage);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<DirectionsRoute> {
    private volatile TypeAdapter<Double> double__adapter;
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<RouteLeg>> list__routeLeg_adapter;
    private volatile TypeAdapter<RouteOptions> routeOptions_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, DirectionsRoute object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("distance");
      if (object.distance() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.distance());
      }
      jsonWriter.name("duration");
      if (object.duration() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.duration());
      }
      jsonWriter.name("geometry");
      if (object.geometry() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.geometry());
      }
      jsonWriter.name("weight");
      if (object.weight() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.weight());
      }
      jsonWriter.name("weight_name");
      if (object.weightName() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.weightName());
      }
      jsonWriter.name("legs");
      if (object.legs() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<RouteLeg>> list__routeLeg_adapter = this.list__routeLeg_adapter;
        if (list__routeLeg_adapter == null) {
          this.list__routeLeg_adapter = list__routeLeg_adapter = (TypeAdapter<List<RouteLeg>>) gson.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
        }
        list__routeLeg_adapter.write(jsonWriter, object.legs());
      }
      jsonWriter.name("routeOptions");
      if (object.routeOptions() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<RouteOptions> routeOptions_adapter = this.routeOptions_adapter;
        if (routeOptions_adapter == null) {
          this.routeOptions_adapter = routeOptions_adapter = gson.getAdapter(RouteOptions.class);
        }
        routeOptions_adapter.write(jsonWriter, object.routeOptions());
      }
      jsonWriter.name("voiceLocale");
      if (object.voiceLanguage() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.voiceLanguage());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public DirectionsRoute read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      Double distance = null;
      Double duration = null;
      String geometry = null;
      Double weight = null;
      String weightName = null;
      List<RouteLeg> legs = null;
      RouteOptions routeOptions = null;
      String voiceLanguage = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "distance": {
            TypeAdapter<Double> double__adapter = this.double__adapter;
            if (double__adapter == null) {
              this.double__adapter = double__adapter = gson.getAdapter(Double.class);
            }
            distance = double__adapter.read(jsonReader);
            break;
          }
          case "duration": {
            TypeAdapter<Double> double__adapter = this.double__adapter;
            if (double__adapter == null) {
              this.double__adapter = double__adapter = gson.getAdapter(Double.class);
            }
            duration = double__adapter.read(jsonReader);
            break;
          }
          case "geometry": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            geometry = string_adapter.read(jsonReader);
            break;
          }
          case "weight": {
            TypeAdapter<Double> double__adapter = this.double__adapter;
            if (double__adapter == null) {
              this.double__adapter = double__adapter = gson.getAdapter(Double.class);
            }
            weight = double__adapter.read(jsonReader);
            break;
          }
          case "weight_name": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            weightName = string_adapter.read(jsonReader);
            break;
          }
          case "legs": {
            TypeAdapter<List<RouteLeg>> list__routeLeg_adapter = this.list__routeLeg_adapter;
            if (list__routeLeg_adapter == null) {
              this.list__routeLeg_adapter = list__routeLeg_adapter = (TypeAdapter<List<RouteLeg>>) gson.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
            }
            legs = list__routeLeg_adapter.read(jsonReader);
            break;
          }
          case "routeOptions": {
            TypeAdapter<RouteOptions> routeOptions_adapter = this.routeOptions_adapter;
            if (routeOptions_adapter == null) {
              this.routeOptions_adapter = routeOptions_adapter = gson.getAdapter(RouteOptions.class);
            }
            routeOptions = routeOptions_adapter.read(jsonReader);
            break;
          }
          case "voiceLocale": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            voiceLanguage = string_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_DirectionsRoute(distance, duration, geometry, weight, weightName, legs, routeOptions, voiceLanguage);
    }
  }
}
