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
final class AutoValue_LegAnnotation extends $AutoValue_LegAnnotation {
  AutoValue_LegAnnotation(@Nullable List<Double> distance, @Nullable List<Double> duration,
      @Nullable List<Double> speed, @Nullable List<MaxSpeed> maxspeed,
      @Nullable List<String> congestion) {
    super(distance, duration, speed, maxspeed, congestion);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<LegAnnotation> {
    private volatile TypeAdapter<List<Double>> list__double_adapter;
    private volatile TypeAdapter<List<MaxSpeed>> list__maxSpeed_adapter;
    private volatile TypeAdapter<List<String>> list__string_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, LegAnnotation object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("distance");
      if (object.distance() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Double>> list__double_adapter = this.list__double_adapter;
        if (list__double_adapter == null) {
          this.list__double_adapter = list__double_adapter = (TypeAdapter<List<Double>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
        }
        list__double_adapter.write(jsonWriter, object.distance());
      }
      jsonWriter.name("duration");
      if (object.duration() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Double>> list__double_adapter = this.list__double_adapter;
        if (list__double_adapter == null) {
          this.list__double_adapter = list__double_adapter = (TypeAdapter<List<Double>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
        }
        list__double_adapter.write(jsonWriter, object.duration());
      }
      jsonWriter.name("speed");
      if (object.speed() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Double>> list__double_adapter = this.list__double_adapter;
        if (list__double_adapter == null) {
          this.list__double_adapter = list__double_adapter = (TypeAdapter<List<Double>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
        }
        list__double_adapter.write(jsonWriter, object.speed());
      }
      jsonWriter.name("maxspeed");
      if (object.maxspeed() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<MaxSpeed>> list__maxSpeed_adapter = this.list__maxSpeed_adapter;
        if (list__maxSpeed_adapter == null) {
          this.list__maxSpeed_adapter = list__maxSpeed_adapter = (TypeAdapter<List<MaxSpeed>>) gson.getAdapter(TypeToken.getParameterized(List.class, MaxSpeed.class));
        }
        list__maxSpeed_adapter.write(jsonWriter, object.maxspeed());
      }
      jsonWriter.name("congestion");
      if (object.congestion() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
        if (list__string_adapter == null) {
          this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
        }
        list__string_adapter.write(jsonWriter, object.congestion());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public LegAnnotation read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      List<Double> distance = null;
      List<Double> duration = null;
      List<Double> speed = null;
      List<MaxSpeed> maxspeed = null;
      List<String> congestion = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "distance": {
            TypeAdapter<List<Double>> list__double_adapter = this.list__double_adapter;
            if (list__double_adapter == null) {
              this.list__double_adapter = list__double_adapter = (TypeAdapter<List<Double>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
            }
            distance = list__double_adapter.read(jsonReader);
            break;
          }
          case "duration": {
            TypeAdapter<List<Double>> list__double_adapter = this.list__double_adapter;
            if (list__double_adapter == null) {
              this.list__double_adapter = list__double_adapter = (TypeAdapter<List<Double>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
            }
            duration = list__double_adapter.read(jsonReader);
            break;
          }
          case "speed": {
            TypeAdapter<List<Double>> list__double_adapter = this.list__double_adapter;
            if (list__double_adapter == null) {
              this.list__double_adapter = list__double_adapter = (TypeAdapter<List<Double>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
            }
            speed = list__double_adapter.read(jsonReader);
            break;
          }
          case "maxspeed": {
            TypeAdapter<List<MaxSpeed>> list__maxSpeed_adapter = this.list__maxSpeed_adapter;
            if (list__maxSpeed_adapter == null) {
              this.list__maxSpeed_adapter = list__maxSpeed_adapter = (TypeAdapter<List<MaxSpeed>>) gson.getAdapter(TypeToken.getParameterized(List.class, MaxSpeed.class));
            }
            maxspeed = list__maxSpeed_adapter.read(jsonReader);
            break;
          }
          case "congestion": {
            TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
            if (list__string_adapter == null) {
              this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            }
            congestion = list__string_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_LegAnnotation(distance, duration, speed, maxspeed, congestion);
    }
  }
}
