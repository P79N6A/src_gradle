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
final class AutoValue_StepIntersection extends $AutoValue_StepIntersection {
  AutoValue_StepIntersection(double[] rawLocation, @Nullable List<Integer> bearings,
      @Nullable List<String> classes, @Nullable List<Boolean> entry, @Nullable Integer in,
      @Nullable Integer out, @Nullable List<IntersectionLanes> lanes) {
    super(rawLocation, bearings, classes, entry, in, out, lanes);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<StepIntersection> {
    private volatile TypeAdapter<double[]> array__double_adapter;
    private volatile TypeAdapter<List<Integer>> list__integer_adapter;
    private volatile TypeAdapter<List<String>> list__string_adapter;
    private volatile TypeAdapter<List<Boolean>> list__boolean_adapter;
    private volatile TypeAdapter<Integer> integer_adapter;
    private volatile TypeAdapter<List<IntersectionLanes>> list__intersectionLanes_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, StepIntersection object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
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
      jsonWriter.name("bearings");
      if (object.bearings() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Integer>> list__integer_adapter = this.list__integer_adapter;
        if (list__integer_adapter == null) {
          this.list__integer_adapter = list__integer_adapter = (TypeAdapter<List<Integer>>) gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
        }
        list__integer_adapter.write(jsonWriter, object.bearings());
      }
      jsonWriter.name("classes");
      if (object.classes() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
        if (list__string_adapter == null) {
          this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
        }
        list__string_adapter.write(jsonWriter, object.classes());
      }
      jsonWriter.name("entry");
      if (object.entry() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Boolean>> list__boolean_adapter = this.list__boolean_adapter;
        if (list__boolean_adapter == null) {
          this.list__boolean_adapter = list__boolean_adapter = (TypeAdapter<List<Boolean>>) gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
        }
        list__boolean_adapter.write(jsonWriter, object.entry());
      }
      jsonWriter.name("in");
      if (object.in() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Integer> integer_adapter = this.integer_adapter;
        if (integer_adapter == null) {
          this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
        }
        integer_adapter.write(jsonWriter, object.in());
      }
      jsonWriter.name("out");
      if (object.out() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Integer> integer_adapter = this.integer_adapter;
        if (integer_adapter == null) {
          this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
        }
        integer_adapter.write(jsonWriter, object.out());
      }
      jsonWriter.name("lanes");
      if (object.lanes() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<IntersectionLanes>> list__intersectionLanes_adapter = this.list__intersectionLanes_adapter;
        if (list__intersectionLanes_adapter == null) {
          this.list__intersectionLanes_adapter = list__intersectionLanes_adapter = (TypeAdapter<List<IntersectionLanes>>) gson.getAdapter(TypeToken.getParameterized(List.class, IntersectionLanes.class));
        }
        list__intersectionLanes_adapter.write(jsonWriter, object.lanes());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public StepIntersection read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      double[] rawLocation = null;
      List<Integer> bearings = null;
      List<String> classes = null;
      List<Boolean> entry = null;
      Integer in = null;
      Integer out = null;
      List<IntersectionLanes> lanes = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "location": {
            TypeAdapter<double[]> array__double_adapter = this.array__double_adapter;
            if (array__double_adapter == null) {
              this.array__double_adapter = array__double_adapter = gson.getAdapter(double[].class);
            }
            rawLocation = array__double_adapter.read(jsonReader);
            break;
          }
          case "bearings": {
            TypeAdapter<List<Integer>> list__integer_adapter = this.list__integer_adapter;
            if (list__integer_adapter == null) {
              this.list__integer_adapter = list__integer_adapter = (TypeAdapter<List<Integer>>) gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
            }
            bearings = list__integer_adapter.read(jsonReader);
            break;
          }
          case "classes": {
            TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
            if (list__string_adapter == null) {
              this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            }
            classes = list__string_adapter.read(jsonReader);
            break;
          }
          case "entry": {
            TypeAdapter<List<Boolean>> list__boolean_adapter = this.list__boolean_adapter;
            if (list__boolean_adapter == null) {
              this.list__boolean_adapter = list__boolean_adapter = (TypeAdapter<List<Boolean>>) gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
            }
            entry = list__boolean_adapter.read(jsonReader);
            break;
          }
          case "in": {
            TypeAdapter<Integer> integer_adapter = this.integer_adapter;
            if (integer_adapter == null) {
              this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
            }
            in = integer_adapter.read(jsonReader);
            break;
          }
          case "out": {
            TypeAdapter<Integer> integer_adapter = this.integer_adapter;
            if (integer_adapter == null) {
              this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
            }
            out = integer_adapter.read(jsonReader);
            break;
          }
          case "lanes": {
            TypeAdapter<List<IntersectionLanes>> list__intersectionLanes_adapter = this.list__intersectionLanes_adapter;
            if (list__intersectionLanes_adapter == null) {
              this.list__intersectionLanes_adapter = list__intersectionLanes_adapter = (TypeAdapter<List<IntersectionLanes>>) gson.getAdapter(TypeToken.getParameterized(List.class, IntersectionLanes.class));
            }
            lanes = list__intersectionLanes_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_StepIntersection(rawLocation, bearings, classes, entry, in, out, lanes);
    }
  }
}
