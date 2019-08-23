

package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_DirectionsRoute extends DirectionsRoute {

  private final Double distance;

  private final Double duration;

  private final String geometry;

  private final Double weight;

  private final String weightName;

  private final List<RouteLeg> legs;

  private final RouteOptions routeOptions;

  private final String voiceLanguage;

  $AutoValue_DirectionsRoute(
      @Nullable Double distance,
      @Nullable Double duration,
      @Nullable String geometry,
      @Nullable Double weight,
      @Nullable String weightName,
      @Nullable List<RouteLeg> legs,
      @Nullable RouteOptions routeOptions,
      @Nullable String voiceLanguage) {
    this.distance = distance;
    this.duration = duration;
    this.geometry = geometry;
    this.weight = weight;
    this.weightName = weightName;
    this.legs = legs;
    this.routeOptions = routeOptions;
    this.voiceLanguage = voiceLanguage;
  }

  @Nullable
  @Override
  public Double distance() {
    return distance;
  }

  @Nullable
  @Override
  public Double duration() {
    return duration;
  }

  @Nullable
  @Override
  public String geometry() {
    return geometry;
  }

  @Nullable
  @Override
  public Double weight() {
    return weight;
  }

  @Nullable
  @SerializedName(value = "weight_name")
  @Override
  public String weightName() {
    return weightName;
  }

  @Nullable
  @Override
  public List<RouteLeg> legs() {
    return legs;
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
    return "DirectionsRoute{"
         + "distance=" + distance + ", "
         + "duration=" + duration + ", "
         + "geometry=" + geometry + ", "
         + "weight=" + weight + ", "
         + "weightName=" + weightName + ", "
         + "legs=" + legs + ", "
         + "routeOptions=" + routeOptions + ", "
         + "voiceLanguage=" + voiceLanguage
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DirectionsRoute) {
      DirectionsRoute that = (DirectionsRoute) o;
      return ((this.distance == null) ? (that.distance() == null) : this.distance.equals(that.distance()))
           && ((this.duration == null) ? (that.duration() == null) : this.duration.equals(that.duration()))
           && ((this.geometry == null) ? (that.geometry() == null) : this.geometry.equals(that.geometry()))
           && ((this.weight == null) ? (that.weight() == null) : this.weight.equals(that.weight()))
           && ((this.weightName == null) ? (that.weightName() == null) : this.weightName.equals(that.weightName()))
           && ((this.legs == null) ? (that.legs() == null) : this.legs.equals(that.legs()))
           && ((this.routeOptions == null) ? (that.routeOptions() == null) : this.routeOptions.equals(that.routeOptions()))
           && ((this.voiceLanguage == null) ? (that.voiceLanguage() == null) : this.voiceLanguage.equals(that.voiceLanguage()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (distance == null) ? 0 : distance.hashCode();
    h$ *= 1000003;
    h$ ^= (duration == null) ? 0 : duration.hashCode();
    h$ *= 1000003;
    h$ ^= (geometry == null) ? 0 : geometry.hashCode();
    h$ *= 1000003;
    h$ ^= (weight == null) ? 0 : weight.hashCode();
    h$ *= 1000003;
    h$ ^= (weightName == null) ? 0 : weightName.hashCode();
    h$ *= 1000003;
    h$ ^= (legs == null) ? 0 : legs.hashCode();
    h$ *= 1000003;
    h$ ^= (routeOptions == null) ? 0 : routeOptions.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceLanguage == null) ? 0 : voiceLanguage.hashCode();
    return h$;
  }

  @Override
  public DirectionsRoute.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends DirectionsRoute.Builder {
    private Double distance;
    private Double duration;
    private String geometry;
    private Double weight;
    private String weightName;
    private List<RouteLeg> legs;
    private RouteOptions routeOptions;
    private String voiceLanguage;
    Builder() {
    }
    private Builder(DirectionsRoute source) {
      this.distance = source.distance();
      this.duration = source.duration();
      this.geometry = source.geometry();
      this.weight = source.weight();
      this.weightName = source.weightName();
      this.legs = source.legs();
      this.routeOptions = source.routeOptions();
      this.voiceLanguage = source.voiceLanguage();
    }
    @Override
    public DirectionsRoute.Builder distance(@Nullable Double distance) {
      this.distance = distance;
      return this;
    }
    @Override
    public DirectionsRoute.Builder duration(@Nullable Double duration) {
      this.duration = duration;
      return this;
    }
    @Override
    public DirectionsRoute.Builder geometry(@Nullable String geometry) {
      this.geometry = geometry;
      return this;
    }
    @Override
    public DirectionsRoute.Builder weight(@Nullable Double weight) {
      this.weight = weight;
      return this;
    }
    @Override
    public DirectionsRoute.Builder weightName(@Nullable String weightName) {
      this.weightName = weightName;
      return this;
    }
    @Override
    public DirectionsRoute.Builder legs(@Nullable List<RouteLeg> legs) {
      this.legs = legs;
      return this;
    }
    @Override
    public DirectionsRoute.Builder routeOptions(@Nullable RouteOptions routeOptions) {
      this.routeOptions = routeOptions;
      return this;
    }
    @Override
    public DirectionsRoute.Builder voiceLanguage(@Nullable String voiceLanguage) {
      this.voiceLanguage = voiceLanguage;
      return this;
    }
    @Override
    public DirectionsRoute build() {
      return new AutoValue_DirectionsRoute(
          this.distance,
          this.duration,
          this.geometry,
          this.weight,
          this.weightName,
          this.legs,
          this.routeOptions,
          this.voiceLanguage);
    }
  }

}
