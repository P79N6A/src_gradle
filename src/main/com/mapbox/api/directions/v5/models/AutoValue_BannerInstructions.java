package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_BannerInstructions extends $AutoValue_BannerInstructions {
  AutoValue_BannerInstructions(double distanceAlongGeometry, @Nullable BannerText primary,
      @Nullable BannerText secondary, @Nullable BannerText sub) {
    super(distanceAlongGeometry, primary, secondary, sub);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<BannerInstructions> {
    private volatile TypeAdapter<Double> double__adapter;
    private volatile TypeAdapter<BannerText> bannerText_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, BannerInstructions object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("distanceAlongGeometry");
      {
        TypeAdapter<Double> double__adapter = this.double__adapter;
        if (double__adapter == null) {
          this.double__adapter = double__adapter = gson.getAdapter(Double.class);
        }
        double__adapter.write(jsonWriter, object.distanceAlongGeometry());
      }
      jsonWriter.name("primary");
      if (object.primary() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<BannerText> bannerText_adapter = this.bannerText_adapter;
        if (bannerText_adapter == null) {
          this.bannerText_adapter = bannerText_adapter = gson.getAdapter(BannerText.class);
        }
        bannerText_adapter.write(jsonWriter, object.primary());
      }
      jsonWriter.name("secondary");
      if (object.secondary() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<BannerText> bannerText_adapter = this.bannerText_adapter;
        if (bannerText_adapter == null) {
          this.bannerText_adapter = bannerText_adapter = gson.getAdapter(BannerText.class);
        }
        bannerText_adapter.write(jsonWriter, object.secondary());
      }
      jsonWriter.name("sub");
      if (object.sub() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<BannerText> bannerText_adapter = this.bannerText_adapter;
        if (bannerText_adapter == null) {
          this.bannerText_adapter = bannerText_adapter = gson.getAdapter(BannerText.class);
        }
        bannerText_adapter.write(jsonWriter, object.sub());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public BannerInstructions read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      double distanceAlongGeometry = 0.0d;
      BannerText primary = null;
      BannerText secondary = null;
      BannerText sub = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "distanceAlongGeometry": {
            TypeAdapter<Double> double__adapter = this.double__adapter;
            if (double__adapter == null) {
              this.double__adapter = double__adapter = gson.getAdapter(Double.class);
            }
            distanceAlongGeometry = double__adapter.read(jsonReader);
            break;
          }
          case "primary": {
            TypeAdapter<BannerText> bannerText_adapter = this.bannerText_adapter;
            if (bannerText_adapter == null) {
              this.bannerText_adapter = bannerText_adapter = gson.getAdapter(BannerText.class);
            }
            primary = bannerText_adapter.read(jsonReader);
            break;
          }
          case "secondary": {
            TypeAdapter<BannerText> bannerText_adapter = this.bannerText_adapter;
            if (bannerText_adapter == null) {
              this.bannerText_adapter = bannerText_adapter = gson.getAdapter(BannerText.class);
            }
            secondary = bannerText_adapter.read(jsonReader);
            break;
          }
          case "sub": {
            TypeAdapter<BannerText> bannerText_adapter = this.bannerText_adapter;
            if (bannerText_adapter == null) {
              this.bannerText_adapter = bannerText_adapter = gson.getAdapter(BannerText.class);
            }
            sub = bannerText_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_BannerInstructions(distanceAlongGeometry, primary, secondary, sub);
    }
  }
}
