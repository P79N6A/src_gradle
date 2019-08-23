

package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MapMatchingMatching extends MapMatchingMatching {

  private final double distance;

  private final double duration;

  private final String geometry;

  private final double weight;

  private final String weightName;

  private final List<RouteLeg> legs;

  private final double confidence;

  private final RouteOptions routeOptions;

  private final String voiceLanguage;

  $AutoValue_MapMatchingMatching(
      double distance,
      double duration,
      @Nullable String geometry,
      double weight,
      String weightName,
      List<RouteLeg> legs,
      double confidence,
      @Nullable RouteOptions routeOptions,
      @Nullable String voiceLanguage) {
    this.distance = distance;
    this.duration = duration;
    this.geometry = geometry;
    this.weight = weight;
    if (weightName == null) {
      throw new NullPointerException("Null weightName");
    }
    this.weightName = weightName;
    if (legs == null) {
      throw new NullPointerException("Null legs");
    }
    this.legs = legs;
    this.confidence = confidence;
    this.routeOptions = routeOptions;
    this.voiceLanguage = voiceLanguage;
  }

  @Override
  public double distance() {
    return distance;
  }

  @Override
  public double duration() {
    return duration;
  }

  @Nullable
  @Override
  public String geometry() {
    return geometry;
  }

  @Override
  public double weight() {
    return weight;
  }

  @SerializedName(value = "weight_name")
  @Override
  public String weightName() {
    return weightName;
  }

  @Override
  public List<RouteLeg> legs() {
    return legs;
  }

  @Override
  public double confidence() {
    return confidence;
  }

  @Nullable
  @Override
  public RouteOptions routeOptions() {
    return routeOptions;
  }

  @Nullable
  @SerializedName(value = "voiceLocale")
  @Override
  public String voiceLanguage() {
    return voiceLanguage;
  }

  @Override
  public String toString() {
    return "MapMatchingMatching{"
         + "distance=" + distance + ", "
         + "duration=" + duration + ", "
         + "geometry=" + geometry + ", "
         + "weight=" + weight + ", "
         + "weightName=" + weightName + ", "
         + "legs=" + legs + ", "
         + "confidence=" + confidence + ", "
         + "routeOptions=" + routeOptions + ", "
         + "voiceLanguage=" + voiceLanguage
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapMatchingMatching) {
      MapMatchingMatching that = (MapMatchingMatching) o;
      return (Double.doubleToLongBits(this.distance) == Double.doubleToLongBits(that.distance()))
           && (Double.doubleToLongBits(this.duration) == Double.doubleToLongBits(that.duration()))
           && ((this.geometry == null) ? (that.geometry() == null) : this.geometry.equals(that.geometry()))
           && (Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(that.weight()))
           && (this.weightName.equals(that.weightName()))
           && (this.legs.equals(that.legs()))
           && (Double.doubleToLongBits(this.confidence) == Double.doubleToLongBits(that.confidence()))
           && ((this.routeOptions == null) ? (that.routeOptions() == null) : this.routeOptions.equals(that.routeOptions()))
           && ((this.voiceLanguage == null) ? (that.voiceLanguage() == null) : this.voiceLanguage.equals(that.voiceLanguage()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(distance) >>> 32) ^ Double.doubleToLongBits(distance));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(duration) >>> 32) ^ Double.doubleToLongBits(duration));
    h$ *= 1000003;
    h$ ^= (geometry == null) ? 0 : geometry.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(weight) >>> 32) ^ Double.doubleToLongBits(weight));
    h$ *= 1000003;
    h$ ^= weightName.hashCode();
    h$ *= 1000003;
    h$ ^= legs.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(confidence) >>> 32) ^ Double.doubleToLongBits(confidence));
    h$ *= 1000003;
    h$ ^= (routeOptions == null) ? 0 : routeOptions.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceLanguage == null) ? 0 : voiceLanguage.hashCode();
    return h$;
  }

  @Override
  public MapMatchingMatching.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MapMatchingMatching.Builder {
    private Double distance;
    private Double duration;
    private String geometry;
    private Double weight;
    private String weightName;
    private List<RouteLeg> legs;
    private Double confidence;
    private RouteOptions routeOptions;
    private String voiceLanguage;
    Builder() {
    }
    private Builder(MapMatchingMatching source) {
      this.distance = source.distance();
      this.duration = source.duration();
      this.geometry = source.geometry();
      this.weight = source.weight();
      this.weightName = source.weightName();
      this.legs = source.legs();
      this.confidence = source.confidence();
      this.routeOptions = source.routeOptions();
      this.voiceLanguage = source.voiceLanguage();
    }
    @Override
    public MapMatchingMatching.Builder distance(double distance) {
      this.distance = distance;
      return this;
    }
    @Override
    public MapMatchingMatching.Builder duration(double duration) {
      this.duration = duration;
      return this;
    }
    @Override
    public MapMatchingMatching.Builder geometry(@Nullable String geometry) {
      this.geometry = geometry;
      return this;
    }
    @Override
    public MapMatchingMatching.Builder weight(double weight) {
      this.weight = weight;
      return this;
    }
    @Override
    public MapMatchingMatching.Builder weightName(String weightName) {
      if (weightName == null) {
        throw new NullPointerException("Null weightName");
      }
      this.weightName = weightName;
      return this;
    }
    @Override
    public MapMatchingMatching.Builder legs(List<RouteLeg> legs) {
      if (legs == null) {
        throw new NullPointerException("Null legs");
      }
      this.legs = legs;
      return this;
    }
    @Override
    public MapMatchingMatching.Builder confidence(double confidence) {
      this.confidence = confidence;
      return this;
    }
    @Override
    public MapMatchingMatching.Builder routeOptions(@Nullable RouteOptions routeOptions) {
      this.routeOptions = routeOptions;
      return this;
    }
    @Override
    public MapMatchingMatching.Builder voiceLanguage(@Nullable String voiceLanguage) {
      this.voiceLanguage = voiceLanguage;
      return this;
    }
    @Override
    public MapMatchingMatching build() {
      String missing = "";
      if (this.distance == null) {
        missing += " distance";
      }
      if (this.duration == null) {
        missing += " duration";
      }
      if (this.weight == null) {
        missing += " weight";
      }
      if (this.weightName == null) {
        missing += " weightName";
      }
      if (this.legs == null) {
        missing += " legs";
      }
      if (this.confidence == null) {
        missing += " confidence";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapMatchingMatching(
          this.distance,
          this.duration,
          this.geometry,
          this.weight,
          this.weightName,
          this.legs,
          this.confidence,
          this.routeOptions,
          this.voiceLanguage);
    }
  }

}
