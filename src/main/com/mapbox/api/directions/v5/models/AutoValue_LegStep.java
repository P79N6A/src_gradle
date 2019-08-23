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
final class AutoValue_LegStep extends $AutoValue_LegStep {
  AutoValue_LegStep(double distance, double duration, @Nullable String geometry,
      @Nullable String name, @Nullable String ref, @Nullable String destinations, String mode,
      @Nullable String pronunciation, @Nullable String rotaryName,
      @Nullable String rotaryPronunciation, StepManeuver maneuver,
      @Nullable List<VoiceInstructions> voiceInstructions,
      @Nullable List<BannerInstructions> bannerInstructions, @Nullable String drivingSide,
      double weight, @Nullable List<StepIntersection> intersections, @Nullable String exits) {
    super(distance, duration, geometry, name, ref, destinations, mode, pronunciation, rotaryName, rotaryPronunciation, maneuver, voiceInstructions, bannerInstructions, drivingSide, weight, intersections, exits);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<LegStep> {
    private volatile TypeAdapter<Double> double__adapter;
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<StepManeuver> stepManeuver_adapter;
    private volatile TypeAdapter<List<VoiceInstructions>> list__voiceInstructions_adapter;
    private volatile TypeAdapter<List<BannerInstructions>> list__bannerInstructions_adapter;
    private volatile TypeAdapter<List<StepIntersection>> list__stepIntersection_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, LegStep object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("distance");
      {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.distance());
      }
      jsonWriter.name("duration");
      {
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
      jsonWriter.name("name");
      if (object.name() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.name());
      }
      jsonWriter.name("ref");
      if (object.ref() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.ref());
      }
      jsonWriter.name("destinations");
      if (object.destinations() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.destinations());
      }
      jsonWriter.name("mode");
      if (object.mode() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.mode());
      }
      jsonWriter.name("pronunciation");
      if (object.pronunciation() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.pronunciation());
      }
      jsonWriter.name("rotary_name");
      if (object.rotaryName() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.rotaryName());
      }
      jsonWriter.name("rotary_pronunciation");
      if (object.rotaryPronunciation() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.rotaryPronunciation());
      }
      jsonWriter.name("maneuver");
      if (object.maneuver() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<StepManeuver> stepManeuver_adapter = this.stepManeuver_adapter;
        if (stepManeuver_adapter == null) {
          this.stepManeuver_adapter = stepManeuver_adapter = gson.getAdapter(StepManeuver.class);
        }
        stepManeuver_adapter.write(jsonWriter, object.maneuver());
      }
      jsonWriter.name("voiceInstructions");
      if (object.voiceInstructions() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<VoiceInstructions>> list__voiceInstructions_adapter = this.list__voiceInstructions_adapter;
        if (list__voiceInstructions_adapter == null) {
          this.list__voiceInstructions_adapter = list__voiceInstructions_adapter = (TypeAdapter<List<VoiceInstructions>>) gson.getAdapter(TypeToken.getParameterized(List.class, VoiceInstructions.class));
        }
        list__voiceInstructions_adapter.write(jsonWriter, object.voiceInstructions());
      }
      jsonWriter.name("bannerInstructions");
      if (object.bannerInstructions() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<BannerInstructions>> list__bannerInstructions_adapter = this.list__bannerInstructions_adapter;
        if (list__bannerInstructions_adapter == null) {
          this.list__bannerInstructions_adapter = list__bannerInstructions_adapter = (TypeAdapter<List<BannerInstructions>>) gson.getAdapter(TypeToken.getParameterized(List.class, BannerInstructions.class));
        }
        list__bannerInstructions_adapter.write(jsonWriter, object.bannerInstructions());
      }
      jsonWriter.name("driving_side");
      if (object.drivingSide() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.drivingSide());
      }
      jsonWriter.name("weight");
      {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.weight());
      }
      jsonWriter.name("intersections");
      if (object.intersections() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<StepIntersection>> list__stepIntersection_adapter = this.list__stepIntersection_adapter;
        if (list__stepIntersection_adapter == null) {
          this.list__stepIntersection_adapter = list__stepIntersection_adapter = (TypeAdapter<List<StepIntersection>>) gson.getAdapter(TypeToken.getParameterized(List.class, StepIntersection.class));
        }
        list__stepIntersection_adapter.write(jsonWriter, object.intersections());
      }
      jsonWriter.name("exits");
      if (object.exits() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.exits());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public LegStep read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      double distance = 0.0d;
      double duration = 0.0d;
      String geometry = null;
      String name = null;
      String ref = null;
      String destinations = null;
      String mode = null;
      String pronunciation = null;
      String rotaryName = null;
      String rotaryPronunciation = null;
      StepManeuver maneuver = null;
      List<VoiceInstructions> voiceInstructions = null;
      List<BannerInstructions> bannerInstructions = null;
      String drivingSide = null;
      double weight = 0.0d;
      List<StepIntersection> intersections = null;
      String exits = null;
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
          case "name": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            name = string_adapter.read(jsonReader);
            break;
          }
          case "ref": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            ref = string_adapter.read(jsonReader);
            break;
          }
          case "destinations": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            destinations = string_adapter.read(jsonReader);
            break;
          }
          case "mode": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            mode = string_adapter.read(jsonReader);
            break;
          }
          case "pronunciation": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            pronunciation = string_adapter.read(jsonReader);
            break;
          }
          case "rotary_name": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            rotaryName = string_adapter.read(jsonReader);
            break;
          }
          case "rotary_pronunciation": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            rotaryPronunciation = string_adapter.read(jsonReader);
            break;
          }
          case "maneuver": {
            TypeAdapter<StepManeuver> stepManeuver_adapter = this.stepManeuver_adapter;
            if (stepManeuver_adapter == null) {
              this.stepManeuver_adapter = stepManeuver_adapter = gson.getAdapter(StepManeuver.class);
            }
            maneuver = stepManeuver_adapter.read(jsonReader);
            break;
          }
          case "voiceInstructions": {
            TypeAdapter<List<VoiceInstructions>> list__voiceInstructions_adapter = this.list__voiceInstructions_adapter;
            if (list__voiceInstructions_adapter == null) {
              this.list__voiceInstructions_adapter = list__voiceInstructions_adapter = (TypeAdapter<List<VoiceInstructions>>) gson.getAdapter(TypeToken.getParameterized(List.class, VoiceInstructions.class));
            }
            voiceInstructions = list__voiceInstructions_adapter.read(jsonReader);
            break;
          }
          case "bannerInstructions": {
            TypeAdapter<List<BannerInstructions>> list__bannerInstructions_adapter = this.list__bannerInstructions_adapter;
            if (list__bannerInstructions_adapter == null) {
              this.list__bannerInstructions_adapter = list__bannerInstructions_adapter = (TypeAdapter<List<BannerInstructions>>) gson.getAdapter(TypeToken.getParameterized(List.class, BannerInstructions.class));
            }
            bannerInstructions = list__bannerInstructions_adapter.read(jsonReader);
            break;
          }
          case "driving_side": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            drivingSide = string_adapter.read(jsonReader);
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
          case "intersections": {
            TypeAdapter<List<StepIntersection>> list__stepIntersection_adapter = this.list__stepIntersection_adapter;
            if (list__stepIntersection_adapter == null) {
              this.list__stepIntersection_adapter = list__stepIntersection_adapter = (TypeAdapter<List<StepIntersection>>) gson.getAdapter(TypeToken.getParameterized(List.class, StepIntersection.class));
            }
            intersections = list__stepIntersection_adapter.read(jsonReader);
            break;
          }
          case "exits": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            exits = string_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_LegStep(distance, duration, geometry, name, ref, destinations, mode, pronunciation, rotaryName, rotaryPronunciation, maneuver, voiceInstructions, bannerInstructions, drivingSide, weight, intersections, exits);
    }
  }
}
