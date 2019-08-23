

package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MapMatchingTracepoint extends MapMatchingTracepoint {

  private final Integer matchingsIndex;

  private final Integer alternativesCount;

  private final Integer waypointIndex;

  private final String name;

  private final double[] rawLocation;

  $AutoValue_MapMatchingTracepoint(
      @Nullable Integer matchingsIndex,
      @Nullable Integer alternativesCount,
      @Nullable Integer waypointIndex,
      @Nullable String name,
      @Nullable double[] rawLocation) {
    this.matchingsIndex = matchingsIndex;
    this.alternativesCount = alternativesCount;
    this.waypointIndex = waypointIndex;
    this.name = name;
    this.rawLocation = rawLocation;
  }

  @Nullable
  @SerializedName(value = "matchings_index")
  @Override
  public Integer matchingsIndex() {
    return matchingsIndex;
  }

  @Nullable
  @SerializedName(value = "alternatives_count")
  @Override
  public Integer alternativesCount() {
    return alternativesCount;
  }

  @Nullable
  @SerializedName(value = "waypoint_index")
  @Override
  public Integer waypointIndex() {
    return waypointIndex;
  }

  @Nullable
  @Override
  public String name() {
    return name;
  }

  @Nullable
  @SerializedName(value = "location")
  @SuppressWarnings(value = {"mutable"})
  @Override
  double[] rawLocation() {
    return rawLocation;
  }

  @Override
  public String toString() {
    return "MapMatchingTracepoint{"
         + "matchingsIndex=" + matchingsIndex + ", "
         + "alternativesCount=" + alternativesCount + ", "
         + "waypointIndex=" + waypointIndex + ", "
         + "name=" + name + ", "
         + "rawLocation=" + Arrays.toString(rawLocation)
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapMatchingTracepoint) {
      MapMatchingTracepoint that = (MapMatchingTracepoint) o;
      return ((this.matchingsIndex == null) ? (that.matchingsIndex() == null) : this.matchingsIndex.equals(that.matchingsIndex()))
           && ((this.alternativesCount == null) ? (that.alternativesCount() == null) : this.alternativesCount.equals(that.alternativesCount()))
           && ((this.waypointIndex == null) ? (that.waypointIndex() == null) : this.waypointIndex.equals(that.waypointIndex()))
           && ((this.name == null) ? (that.name() == null) : this.name.equals(that.name()))
           && (Arrays.equals(this.rawLocation, (that instanceof $AutoValue_MapMatchingTracepoint) ? (($AutoValue_MapMatchingTracepoint) that).rawLocation : that.rawLocation()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (matchingsIndex == null) ? 0 : matchingsIndex.hashCode();
    h$ *= 1000003;
    h$ ^= (alternativesCount == null) ? 0 : alternativesCount.hashCode();
    h$ *= 1000003;
    h$ ^= (waypointIndex == null) ? 0 : waypointIndex.hashCode();
    h$ *= 1000003;
    h$ ^= (name == null) ? 0 : name.hashCode();
    h$ *= 1000003;
    h$ ^= Arrays.hashCode(rawLocation);
    return h$;
  }

  @Override
  public MapMatchingTracepoint.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MapMatchingTracepoint.Builder {
    private Integer matchingsIndex;
    private Integer alternativesCount;
    private Integer waypointIndex;
    private String name;
    private double[] rawLocation;
    Builder() {
    }
    private Builder(MapMatchingTracepoint source) {
      this.matchingsIndex = source.matchingsIndex();
      this.alternativesCount = source.alternativesCount();
      this.waypointIndex = source.waypointIndex();
      this.name = source.name();
      this.rawLocation = source.rawLocation();
    }
    @Override
    public MapMatchingTracepoint.Builder matchingsIndex(@Nullable Integer matchingsIndex) {
      this.matchingsIndex = matchingsIndex;
      return this;
    }
    @Override
    public MapMatchingTracepoint.Builder alternativesCount(@Nullable Integer alternativesCount) {
      this.alternativesCount = alternativesCount;
      return this;
    }
    @Override
    public MapMatchingTracepoint.Builder waypointIndex(@Nullable Integer waypointIndex) {
      this.waypointIndex = waypointIndex;
      return this;
    }
    @Override
    public MapMatchingTracepoint.Builder name(@Nullable String name) {
      this.name = name;
      return this;
    }
    @Override
    public MapMatchingTracepoint.Builder rawLocation(double[] rawLocation) {
      this.rawLocation = rawLocation;
      return this;
    }
    @Override
    public MapMatchingTracepoint build() {
      return new AutoValue_MapMatchingTracepoint(
          this.matchingsIndex,
          this.alternativesCount,
          this.waypointIndex,
          this.name,
          this.rawLocation);
    }
  }

}
