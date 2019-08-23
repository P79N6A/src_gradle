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
final class AutoValue_BannerText extends $AutoValue_BannerText {
  AutoValue_BannerText(@Nullable String text, @Nullable List<BannerComponents> components,
      @Nullable String type, @Nullable String modifier, @Nullable Double degrees,
      @Nullable String drivingSide) {
    super(text, components, type, modifier, degrees, drivingSide);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<BannerText> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<List<BannerComponents>> list__bannerComponents_adapter;
    private volatile TypeAdapter<Double> double__adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, BannerText object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
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
      jsonWriter.name("components");
      if (object.components() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<BannerComponents>> list__bannerComponents_adapter = this.list__bannerComponents_adapter;
        if (list__bannerComponents_adapter == null) {
          this.list__bannerComponents_adapter = list__bannerComponents_adapter = (TypeAdapter<List<BannerComponents>>) gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
        }
        list__bannerComponents_adapter.write(jsonWriter, object.components());
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
      jsonWriter.name("degrees");
      if (object.degrees() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.degrees());
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
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public BannerText read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String text = null;
      List<BannerComponents> components = null;
      String type = null;
      String modifier = null;
      Double degrees = null;
      String drivingSide = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "text": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            text = string_adapter.read(jsonReader);
            break;
          }
          case "components": {
            TypeAdapter<List<BannerComponents>> list__bannerComponents_adapter = this.list__bannerComponents_adapter;
            if (list__bannerComponents_adapter == null) {
              this.list__bannerComponents_adapter = list__bannerComponents_adapter = (TypeAdapter<List<BannerComponents>>) gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
            }
            components = list__bannerComponents_adapter.read(jsonReader);
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
          case "degrees": {
            TypeAdapter<Double> double__adapter = this.double__adapter;
            if (double__adapter == null) {
              this.double__adapter = double__adapter = gson.getAdapter(Double.class);
            }
            degrees = double__adapter.read(jsonReader);
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
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_BannerText(text, components, type, modifier, degrees, drivingSide);
    }
  }
}
