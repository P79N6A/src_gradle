package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Geometry;
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
final class AutoValue_CarmenFeature extends $AutoValue_CarmenFeature {
  AutoValue_CarmenFeature(String type, @Nullable BoundingBox bbox, @Nullable String id,
      @Nullable Geometry geometry, @Nullable JsonObject properties, @Nullable String text,
      @Nullable String placeName, @Nullable List<String> placeType, @Nullable String address,
      @Nullable double[] rawCenter, @Nullable List<CarmenContext> context,
      @Nullable Double relevance, @Nullable String matchingText, @Nullable String matchingPlaceName,
      @Nullable String language) {
    super(type, bbox, id, geometry, properties, text, placeName, placeType, address, rawCenter, context, relevance, matchingText, matchingPlaceName, language);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<CarmenFeature> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<BoundingBox> boundingBox_adapter;
    private volatile TypeAdapter<Geometry> geometry_adapter;
    private volatile TypeAdapter<JsonObject> jsonObject_adapter;
    private volatile TypeAdapter<List<String>> list__string_adapter;
    private volatile TypeAdapter<double[]> array__double_adapter;
    private volatile TypeAdapter<List<CarmenContext>> list__carmenContext_adapter;
    private volatile TypeAdapter<Double> double__adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, CarmenFeature object) throws IOException {
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
      jsonWriter.name("bbox");
      if (object.bbox() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<BoundingBox> boundingBox_adapter = this.boundingBox_adapter;
        if (boundingBox_adapter == null) {
          this.boundingBox_adapter = boundingBox_adapter = gson.getAdapter(BoundingBox.class);
        }
        boundingBox_adapter.write(jsonWriter, object.bbox());
      }
      jsonWriter.name("id");
      if (object.id() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.id());
      }
      jsonWriter.name("geometry");
      if (object.geometry() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Geometry> geometry_adapter = this.geometry_adapter;
        if (geometry_adapter == null) {
          this.geometry_adapter = geometry_adapter = gson.getAdapter(Geometry.class);
        }
        geometry_adapter.write(jsonWriter, object.geometry());
      }
      jsonWriter.name("properties");
      if (object.properties() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<JsonObject> jsonObject_adapter = this.jsonObject_adapter;
        if (jsonObject_adapter == null) {
          this.jsonObject_adapter = jsonObject_adapter = gson.getAdapter(JsonObject.class);
        }
        jsonObject_adapter.write(jsonWriter, object.properties());
      }
      jsonWriter.name("text");
      if (object.text() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.text());
      }
      jsonWriter.name("place_name");
      if (object.placeName() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.placeName());
      }
      jsonWriter.name("place_type");
      if (object.placeType() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
        if (list__string_adapter == null) {
          this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
        }
        list__string_adapter.write(jsonWriter, object.placeType());
      }
      jsonWriter.name("address");
      if (object.address() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.address());
      }
      jsonWriter.name("center");
      if (object.rawCenter() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<double[]> array__double_adapter = this.array__double_adapter;
        if (array__double_adapter == null) {
          this.array__double_adapter = array__double_adapter = gson.getAdapter(double[].class);
        }
        array__double_adapter.write(jsonWriter, object.rawCenter());
      }
      jsonWriter.name("context");
      if (object.context() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<CarmenContext>> list__carmenContext_adapter = this.list__carmenContext_adapter;
        if (list__carmenContext_adapter == null) {
          this.list__carmenContext_adapter = list__carmenContext_adapter = (TypeAdapter<List<CarmenContext>>) gson.getAdapter(TypeToken.getParameterized(List.class, CarmenContext.class));
        }
        list__carmenContext_adapter.write(jsonWriter, object.context());
      }
      jsonWriter.name("relevance");
      if (object.relevance() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.relevance());
      }
      jsonWriter.name("matching_text");
      if (object.matchingText() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.matchingText());
      }
      jsonWriter.name("matching_place_name");
      if (object.matchingPlaceName() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.matchingPlaceName());
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
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public CarmenFeature read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      String id = null;
      Geometry geometry = null;
      JsonObject properties = null;
      String text = null;
      String placeName = null;
      List<String> placeType = null;
      String address = null;
      double[] rawCenter = null;
      List<CarmenContext> context = null;
      Double relevance = null;
      String matchingText = null;
      String matchingPlaceName = null;
      String language = null;
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
          case "bbox": {
            TypeAdapter<BoundingBox> boundingBox_adapter = this.boundingBox_adapter;
            if (boundingBox_adapter == null) {
              this.boundingBox_adapter = boundingBox_adapter = gson.getAdapter(BoundingBox.class);
            }
            bbox = boundingBox_adapter.read(jsonReader);
            break;
          }
          case "id": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            id = string_adapter.read(jsonReader);
            break;
          }
          case "geometry": {
            TypeAdapter<Geometry> geometry_adapter = this.geometry_adapter;
            if (geometry_adapter == null) {
              this.geometry_adapter = geometry_adapter = gson.getAdapter(Geometry.class);
            }
            geometry = geometry_adapter.read(jsonReader);
            break;
          }
          case "properties": {
            TypeAdapter<JsonObject> jsonObject_adapter = this.jsonObject_adapter;
            if (jsonObject_adapter == null) {
              this.jsonObject_adapter = jsonObject_adapter = gson.getAdapter(JsonObject.class);
            }
            properties = jsonObject_adapter.read(jsonReader);
            break;
          }
          case "text": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            text = string_adapter.read(jsonReader);
            break;
          }
          case "place_name": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            placeName = string_adapter.read(jsonReader);
            break;
          }
          case "place_type": {
            TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
            if (list__string_adapter == null) {
              this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            }
            placeType = list__string_adapter.read(jsonReader);
            break;
          }
          case "address": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            address = string_adapter.read(jsonReader);
            break;
          }
          case "center": {
            TypeAdapter<double[]> array__double_adapter = this.array__double_adapter;
            if (array__double_adapter == null) {
              this.array__double_adapter = array__double_adapter = gson.getAdapter(double[].class);
            }
            rawCenter = array__double_adapter.read(jsonReader);
            break;
          }
          case "context": {
            TypeAdapter<List<CarmenContext>> list__carmenContext_adapter = this.list__carmenContext_adapter;
            if (list__carmenContext_adapter == null) {
              this.list__carmenContext_adapter = list__carmenContext_adapter = (TypeAdapter<List<CarmenContext>>) gson.getAdapter(TypeToken.getParameterized(List.class, CarmenContext.class));
            }
            context = list__carmenContext_adapter.read(jsonReader);
            break;
          }
          case "relevance": {
            TypeAdapter<Double> double__adapter = this.double__adapter;
            if (double__adapter == null) {
              this.double__adapter = double__adapter = gson.getAdapter(Double.class);
            }
            relevance = double__adapter.read(jsonReader);
            break;
          }
          case "matching_text": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            matchingText = string_adapter.read(jsonReader);
            break;
          }
          case "matching_place_name": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            matchingPlaceName = string_adapter.read(jsonReader);
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
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_CarmenFeature(type, bbox, id, geometry, properties, text, placeName, placeType, address, rawCenter, context, relevance, matchingText, matchingPlaceName, language);
    }
  }
}
