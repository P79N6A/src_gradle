package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_StepManeuver extends $AutoValue_StepManeuver {
  AutoValue_StepManeuver(double[] rawLocation, @Nullable Double bearingBefore,
      @Nullable Double bearingAfter, @Nullable String instruction, @Nullable String type,
      @Nullable String modifier, @Nullable Integer exit) {
    super(rawLocation, bearingBefore, bearingAfter, instruction, type, modifier, exit);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<StepManeuver> {
    private volatile TypeAdapter<double[]> array__double_adapter;
    private volatile TypeAdapter<Double> double__adapter;
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<Integer> integer_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, StepManeuver object) throws IOException {
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
      jsonWriter.name("bearing_before");
      if (object.bearingBefore() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.bearingBefore());
      }
      jsonWriter.name("bearing_after");
      if (object.bearingAfter() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.bearingAfter());
      }
      jsonWriter.name("instruction");
      if (object.instruction() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.instruction());
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
      jsonWriter.name("modifier");
      if (object.modifier() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.modifier());
      }
      jsonWriter.name("exit");
      if (object.exit() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Integer> integer_adapter = this.integer_adapter;
        if (integer_adapter == null) {
          this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
        }
        integer_adapter.write(jsonWriter, object.exit());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public StepManeuver read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      double[] rawLocation = null;
      Double bearingBefore = null;
      Double bearingAfter = null;
      String instruction = null;
      String type = null;
      String modifier = null;
      Integer exit = null;
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
          case "bearing_before": {
            TypeAdapter<Double> double__adapter = this.double__adapter;
            if (double__adapter == null) {
              this.double__adapter = double__adapter = gson.getAdapter(Double.class);
            }
            bearingBefore = double__adapter.read(jsonReader);
            break;
          }
          case "bearing_after": {
            TypeAdapter<Double> double__adapter = this.double__adapter;
            if (double__adapter == null) {
              this.double__adapter = double__adapter = gson.getAdapter(Double.class);
            }
            bearingAfter = double__adapter.read(jsonReader);
            break;
          }
          case "instruction": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            instruction = string_adapter.read(jsonReader);
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
          case "modifier": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            modifier = string_adapter.read(jsonReader);
            break;
          }
          case "exit": {
            TypeAdapter<Integer> integer_adapter = this.integer_adapter;
            if (integer_adapter == null) {
              this.integer_adapter = integer_adapter = gson.getAdapter(Integer.class);
            }
            exit = integer_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_StepManeuver(rawLocation, bearingBefore, bearingAfter, instruction, type, modifier, exit);
    }
  }
}
