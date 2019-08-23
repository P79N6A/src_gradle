

package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Geometry;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_CarmenFeature extends CarmenFeature {

  private final String type;

  private final BoundingBox bbox;

  private final String id;

  private final Geometry geometry;

  private final JsonObject properties;

  private final String text;

  private final String placeName;

  private final List<String> placeType;

  private final String address;

  private final double[] rawCenter;

  private final List<CarmenContext> context;

  private final Double relevance;

  private final String matchingText;

  private final String matchingPlaceName;

  private final String language;

  $AutoValue_CarmenFeature(
      String type,
      @Nullable BoundingBox bbox,
      @Nullable String id,
      @Nullable Geometry geometry,
      @Nullable JsonObject properties,
      @Nullable String text,
      @Nullable String placeName,
      @Nullable List<String> placeType,
      @Nullable String address,
      @Nullable double[] rawCenter,
      @Nullable List<CarmenContext> context,
      @Nullable Double relevance,
      @Nullable String matchingText,
      @Nullable String matchingPlaceName,
      @Nullable String language) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.bbox = bbox;
    this.id = id;
    this.geometry = geometry;
    this.properties = properties;
    this.text = text;
    this.placeName = placeName;
    this.placeType = placeType;
    this.address = address;
    this.rawCenter = rawCenter;
    this.context = context;
    this.relevance = relevance;
    this.matchingText = matchingText;
    this.matchingPlaceName = matchingPlaceName;
    this.language = language;
  }

  @NonNull
  @SerializedName(value = "type")
  @Override
  public String type() {
    return type;
  }

  @Nullable
  @Override
  public BoundingBox bbox() {
    return bbox;
  }

  @Nullable
  @Override
  public String id() {
    return id;
  }

  @Nullable
  @Override
  public Geometry geometry() {
    return geometry;
  }

  @Nullable
  @Override
  public JsonObject properties() {
    return properties;
  }

  @Nullable
  @Override
  public String text() {
    return text;
  }

  @Nullable
  @SerializedName(value = "place_name")
  @Override
  public String placeName() {
    return placeName;
  }

  @Nullable
  @SerializedName(value = "place_type")
  @Override
  public List<String> placeType() {
    return placeType;
  }

  @Nullable
  @Override
  public String address() {
    return address;
  }

  @Nullable
  @SerializedName(value = "center")
  @SuppressWarnings(value = {"mutable"})
  @Override
  double[] rawCenter() {
    return rawCenter;
  }

  @Nullable
  @Override
  public List<CarmenContext> context() {
    return context;
  }

  @Nullable
  @Override
  public Double relevance() {
    return relevance;
  }

  @Nullable
  @SerializedName(value = "matching_text")
  @Override
  public String matchingText() {
    return matchingText;
  }

  @Nullable
  @SerializedName(value = "matching_place_name")
  @Override
  public String matchingPlaceName() {
    return matchingPlaceName;
  }

  @Nullable
  @Override
  public String language() {
    return language;
  }

  @Override
  public String toString() {
    return "CarmenFeature{"
         + "type=" + type + ", "
         + "bbox=" + bbox + ", "
         + "id=" + id + ", "
         + "geometry=" + geometry + ", "
         + "properties=" + properties + ", "
         + "text=" + text + ", "
         + "placeName=" + placeName + ", "
         + "placeType=" + placeType + ", "
         + "address=" + address + ", "
         + "rawCenter=" + Arrays.toString(rawCenter) + ", "
         + "context=" + context + ", "
         + "relevance=" + relevance + ", "
         + "matchingText=" + matchingText + ", "
         + "matchingPlaceName=" + matchingPlaceName + ", "
         + "language=" + language
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CarmenFeature) {
      CarmenFeature that = (CarmenFeature) o;
      return (this.type.equals(that.type()))
           && ((this.bbox == null) ? (that.bbox() == null) : this.bbox.equals(that.bbox()))
           && ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && ((this.geometry == null) ? (that.geometry() == null) : this.geometry.equals(that.geometry()))
           && ((this.properties == null) ? (that.properties() == null) : this.properties.equals(that.properties()))
           && ((this.text == null) ? (that.text() == null) : this.text.equals(that.text()))
           && ((this.placeName == null) ? (that.placeName() == null) : this.placeName.equals(that.placeName()))
           && ((this.placeType == null) ? (that.placeType() == null) : this.placeType.equals(that.placeType()))
           && ((this.address == null) ? (that.address() == null) : this.address.equals(that.address()))
           && (Arrays.equals(this.rawCenter, (that instanceof $AutoValue_CarmenFeature) ? (($AutoValue_CarmenFeature) that).rawCenter : that.rawCenter()))
           && ((this.context == null) ? (that.context() == null) : this.context.equals(that.context()))
           && ((this.relevance == null) ? (that.relevance() == null) : this.relevance.equals(that.relevance()))
           && ((this.matchingText == null) ? (that.matchingText() == null) : this.matchingText.equals(that.matchingText()))
           && ((this.matchingPlaceName == null) ? (that.matchingPlaceName() == null) : this.matchingPlaceName.equals(that.matchingPlaceName()))
           && ((this.language == null) ? (that.language() == null) : this.language.equals(that.language()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= (bbox == null) ? 0 : bbox.hashCode();
    h$ *= 1000003;
    h$ ^= (id == null) ? 0 : id.hashCode();
    h$ *= 1000003;
    h$ ^= (geometry == null) ? 0 : geometry.hashCode();
    h$ *= 1000003;
    h$ ^= (properties == null) ? 0 : properties.hashCode();
    h$ *= 1000003;
    h$ ^= (text == null) ? 0 : text.hashCode();
    h$ *= 1000003;
    h$ ^= (placeName == null) ? 0 : placeName.hashCode();
    h$ *= 1000003;
    h$ ^= (placeType == null) ? 0 : placeType.hashCode();
    h$ *= 1000003;
    h$ ^= (address == null) ? 0 : address.hashCode();
    h$ *= 1000003;
    h$ ^= Arrays.hashCode(rawCenter);
    h$ *= 1000003;
    h$ ^= (context == null) ? 0 : context.hashCode();
    h$ *= 1000003;
    h$ ^= (relevance == null) ? 0 : relevance.hashCode();
    h$ *= 1000003;
    h$ ^= (matchingText == null) ? 0 : matchingText.hashCode();
    h$ *= 1000003;
    h$ ^= (matchingPlaceName == null) ? 0 : matchingPlaceName.hashCode();
    h$ *= 1000003;
    h$ ^= (language == null) ? 0 : language.hashCode();
    return h$;
  }

  @Override
  public CarmenFeature.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends CarmenFeature.Builder {
    private String type;
    private BoundingBox bbox;
    private String id;
    private Geometry geometry;
    private JsonObject properties;
    private String text;
    private String placeName;
    private List<String> placeType;
    private String address;
    private double[] rawCenter;
    private List<CarmenContext> context;
    private Double relevance;
    private String matchingText;
    private String matchingPlaceName;
    private String language;
    Builder() {
    }
    private Builder(CarmenFeature source) {
      this.type = source.type();
      this.bbox = source.bbox();
      this.id = source.id();
      this.geometry = source.geometry();
      this.properties = source.properties();
      this.text = source.text();
      this.placeName = source.placeName();
      this.placeType = source.placeType();
      this.address = source.address();
      this.rawCenter = source.rawCenter();
      this.context = source.context();
      this.relevance = source.relevance();
      this.matchingText = source.matchingText();
      this.matchingPlaceName = source.matchingPlaceName();
      this.language = source.language();
    }
    @Override
    CarmenFeature.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public CarmenFeature.Builder bbox(@Nullable BoundingBox bbox) {
      this.bbox = bbox;
      return this;
    }
    @Override
    public CarmenFeature.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    public CarmenFeature.Builder geometry(@Nullable Geometry geometry) {
      this.geometry = geometry;
      return this;
    }
    @Override
    public CarmenFeature.Builder properties(@Nullable JsonObject properties) {
      this.properties = properties;
      return this;
    }
    @Override
    public CarmenFeature.Builder text(@Nullable String text) {
      this.text = text;
      return this;
    }
    @Override
    public CarmenFeature.Builder placeName(@Nullable String placeName) {
      this.placeName = placeName;
      return this;
    }
    @Override
    public CarmenFeature.Builder placeType(@Nullable List<String> placeType) {
      this.placeType = placeType;
      return this;
    }
    @Override
    public CarmenFeature.Builder address(@Nullable String address) {
      this.address = address;
      return this;
    }
    @Override
    public CarmenFeature.Builder rawCenter(@Nullable double[] rawCenter) {
      this.rawCenter = rawCenter;
      return this;
    }
    @Override
    public CarmenFeature.Builder context(@Nullable List<CarmenContext> context) {
      this.context = context;
      return this;
    }
    @Override
    public CarmenFeature.Builder relevance(@Nullable Double relevance) {
      this.relevance = relevance;
      return this;
    }
    @Override
    public CarmenFeature.Builder matchingText(@Nullable String matchingText) {
      this.matchingText = matchingText;
      return this;
    }
    @Override
    public CarmenFeature.Builder matchingPlaceName(@Nullable String matchingPlaceName) {
      this.matchingPlaceName = matchingPlaceName;
      return this;
    }
    @Override
    public CarmenFeature.Builder language(@Nullable String language) {
      this.language = language;
      return this;
    }
    @Override
    public CarmenFeature build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_CarmenFeature(
          this.type,
          this.bbox,
          this.id,
          this.geometry,
          this.properties,
          this.text,
          this.placeName,
          this.placeType,
          this.address,
          this.rawCenter,
          this.context,
          this.relevance,
          this.matchingText,
          this.matchingPlaceName,
          this.language);
    }
  }

}
