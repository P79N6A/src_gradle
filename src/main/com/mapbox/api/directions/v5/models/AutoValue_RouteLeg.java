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
final class AutoValue_RouteLeg extends $AutoValue_RouteLeg {
  AutoValue_RouteLeg(@Nullable Double distance, @Nullable Double duration, @Nullable String summary,
      @Nullable List<LegStep> steps, @Nullable LegAnnotation annotation) {
    super(distance, duration, summary, steps, annotation);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<RouteLeg> {
    private volatile TypeAdapter<Double> double__adapter;
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<LegStep>> list__legStep_adapter;
    private volatile TypeAdapter<LegAnnotation> legAnnotation_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, RouteLeg object) throws IOException {
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
      jsonWriter.name("summary");
      if (object.summary() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.summary());
      }
      jsonWriter.name("steps");
      if (object.steps() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<LegStep>> list__legStep_adapter = this.list__legStep_adapter;
        if (list__legStep_adapter == null) {
          this.list__legStep_adapter = list__legStep_adapter = (TypeAdapter<List<LegStep>>) gson.getAdapter(TypeToken.getParameterized(List.class, LegStep.class));
        }
        list__legStep_adapter.write(jsonWriter, object.steps());
      }
      jsonWriter.name("annotation");
      if (object.annotation() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<LegAnnotation> legAnnotation_adapter = this.legAnnotation_adapter;
        if (legAnnotation_adapter == null) {
          this.legAnnotation_adapter = legAnnotation_adapter = gson.getAdapter(LegAnnotation.class);
        }
        legAnnotation_adapter.write(jsonWriter, object.annotation());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public RouteLeg read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      Double distance = null;
      Double duration = null;
      String summary = null;
      List<LegStep> steps = null;
      LegAnnotation annotation = null;
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
          case "summary": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            summary = string_adapter.read(jsonReader);
            break;
          }
          case "steps": {
            TypeAdapter<List<LegStep>> list__legStep_adapter = this.list__legStep_adapter;
            if (list__legStep_adapter == null) {
              this.list__legStep_adapter = list__legStep_adapter = (TypeAdapter<List<LegStep>>) gson.getAdapter(TypeToken.getParameterized(List.class, LegStep.class));
            }
            steps = list__legStep_adapter.read(jsonReader);
            break;
          }
          case "annotation": {
            TypeAdapter<LegAnnotation> legAnnotation_adapter = this.legAnnotation_adapter;
            if (legAnnotation_adapter == null) {
              this.legAnnotation_adapter = legAnnotation_adapter = gson.getAdapter(LegAnnotation.class);
            }
            annotation = legAnnotation_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_RouteLeg(distance, duration, summary, steps, annotation);
    }
  }
}
