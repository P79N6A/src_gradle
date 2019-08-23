package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.Point;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_RouteOptions extends $AutoValue_RouteOptions {
  AutoValue_RouteOptions(String baseUrl, String user, String profile, List<Point> coordinates,
      @Nullable Boolean alternatives, @Nullable String language, @Nullable String radiuses,
      @Nullable String bearings, @Nullable Boolean continueStraight,
      @Nullable Boolean roundaboutExits, String geometries, @Nullable String overview,
      @Nullable Boolean steps, @Nullable String annotations, @Nullable String exclude,
      @Nullable Boolean voiceInstructions, @Nullable Boolean bannerInstructions,
      @Nullable String voiceUnits, String accessToken, String requestUuid,
      @Nullable String approaches, @Nullable String waypointNames) {
    super(baseUrl, user, profile, coordinates, alternatives, language, radiuses, bearings, continueStraight, roundaboutExits, geometries, overview, steps, annotations, exclude, voiceInstructions, bannerInstructions, voiceUnits, accessToken, requestUuid, approaches, waypointNames);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<RouteOptions> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<Point>> list__point_adapter;
    private volatile TypeAdapter<Boolean> boolean__adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, RouteOptions object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("baseUrl");
      if (object.baseUrl() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.baseUrl());
      }
      jsonWriter.name("user");
      if (object.user() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.user());
      }
      jsonWriter.name("profile");
      if (object.profile() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.profile());
      }
      jsonWriter.name("coordinates");
      if (object.coordinates() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Point>> list__point_adapter = this.list__point_adapter;
        if (list__point_adapter == null) {
          this.list__point_adapter = list__point_adapter = (TypeAdapter<List<Point>>) gson.getAdapter(TypeToken.getParameterized(List.class, Point.class));
        }
        list__point_adapter.write(jsonWriter, object.coordinates());
      }
      jsonWriter.name("alternatives");
      if (object.alternatives() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.alternatives());
      }
      jsonWriter.name("language");
      if (object.language() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.language());
      }
      jsonWriter.name("radiuses");
      if (object.radiuses() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.radiuses());
      }
      jsonWriter.name("bearings");
      if (object.bearings() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.bearings());
      }
      jsonWriter.name("continueStraight");
      if (object.continueStraight() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.continueStraight());
      }
      jsonWriter.name("roundaboutExits");
      if (object.roundaboutExits() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.roundaboutExits());
      }
      jsonWriter.name("geometries");
      if (object.geometries() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.geometries());
      }
      jsonWriter.name("overview");
      if (object.overview() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.overview());
      }
      jsonWriter.name("steps");
      if (object.steps() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.steps());
      }
      jsonWriter.name("annotations");
      if (object.annotations() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.annotations());
      }
      jsonWriter.name("exclude");
      if (object.exclude() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.exclude());
      }
      jsonWriter.name("voiceInstructions");
      if (object.voiceInstructions() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.voiceInstructions());
      }
      jsonWriter.name("bannerInstructions");
      if (object.bannerInstructions() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.bannerInstructions());
      }
      jsonWriter.name("voiceUnits");
      if (object.voiceUnits() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.voiceUnits());
      }
      jsonWriter.name("accessToken");
      if (object.accessToken() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.accessToken());
      }
      jsonWriter.name("requestUuid");
      if (object.requestUuid() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.requestUuid());
      }
      jsonWriter.name("approaches");
      if (object.approaches() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.approaches());
      }
      jsonWriter.name("waypointNames");
      if (object.waypointNames() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.waypointNames());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public RouteOptions read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String baseUrl = null;
      String user = null;
      String profile = null;
      List<Point> coordinates = null;
      Boolean alternatives = null;
      String language = null;
      String radiuses = null;
      String bearings = null;
      Boolean continueStraight = null;
      Boolean roundaboutExits = null;
      String geometries = null;
      String overview = null;
      Boolean steps = null;
      String annotations = null;
      String exclude = null;
      Boolean voiceInstructions = null;
      Boolean bannerInstructions = null;
      String voiceUnits = null;
      String accessToken = null;
      String requestUuid = null;
      String approaches = null;
      String waypointNames = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "baseUrl": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            baseUrl = string_adapter.read(jsonReader);
            break;
          }
          case "user": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            user = string_adapter.read(jsonReader);
            break;
          }
          case "profile": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            profile = string_adapter.read(jsonReader);
            break;
          }
          case "coordinates": {
            TypeAdapter<List<Point>> list__point_adapter = this.list__point_adapter;
            if (list__point_adapter == null) {
              this.list__point_adapter = list__point_adapter = (TypeAdapter<List<Point>>) gson.getAdapter(TypeToken.getParameterized(List.class, Point.class));
            }
            coordinates = list__point_adapter.read(jsonReader);
            break;
          }
          case "alternatives": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            alternatives = boolean__adapter.read(jsonReader);
            break;
          }
          case "language": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            language = string_adapter.read(jsonReader);
            break;
          }
          case "radiuses": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            radiuses = string_adapter.read(jsonReader);
            break;
          }
          case "bearings": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            bearings = string_adapter.read(jsonReader);
            break;
          }
          case "continueStraight": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            continueStraight = boolean__adapter.read(jsonReader);
            break;
          }
          case "roundaboutExits": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            roundaboutExits = boolean__adapter.read(jsonReader);
            break;
          }
          case "geometries": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            geometries = string_adapter.read(jsonReader);
            break;
          }
          case "overview": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            overview = string_adapter.read(jsonReader);
            break;
          }
          case "steps": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            steps = boolean__adapter.read(jsonReader);
            break;
          }
          case "annotations": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            annotations = string_adapter.read(jsonReader);
            break;
          }
          case "exclude": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            exclude = string_adapter.read(jsonReader);
            break;
          }
          case "voiceInstructions": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            voiceInstructions = boolean__adapter.read(jsonReader);
            break;
          }
          case "bannerInstructions": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            bannerInstructions = boolean__adapter.read(jsonReader);
            break;
          }
          case "voiceUnits": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            voiceUnits = string_adapter.read(jsonReader);
            break;
          }
          case "accessToken": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            accessToken = string_adapter.read(jsonReader);
            break;
          }
          case "requestUuid": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            requestUuid = string_adapter.read(jsonReader);
            break;
          }
          case "approaches": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            approaches = string_adapter.read(jsonReader);
            break;
          }
          case "waypointNames": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            waypointNames = string_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_RouteOptions(baseUrl, user, profile, coordinates, alternatives, language, radiuses, bearings, continueStraight, roundaboutExits, geometries, overview, steps, annotations, exclude, voiceInstructions, bannerInstructions, voiceUnits, accessToken, requestUuid, approaches, waypointNames);
    }
  }
}
