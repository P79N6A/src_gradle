

package com.mapbox.api.optimization.v1.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_OptimizationWaypoint extends OptimizationWaypoint {

  private final int waypointIndex;

  private final int tripsIndex;

  private final String name;

  private final double[] rawLocation;

  $AutoValue_OptimizationWaypoint(
      int waypointIndex,
      int tripsIndex,
      @Nullable String name,
      @Nullable double[] rawLocation) {
    this.waypointIndex = waypointIndex;
    this.tripsIndex = tripsIndex;
    this.name = name;
    this.rawLocation = rawLocation;
  }

  @SerializedName(value = "waypoint_index")
  @Override
  public int waypointIndex() {
    return waypointIndex;
  }

  @SerializedName(value = "trips_index")
  @Override
  public int tripsIndex() {
    return tripsIndex;
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
    return "OptimizationWaypoint{"
         + "waypointIndex=" + waypointIndex + ", "
         + "tripsIndex=" + tripsIndex + ", "
         + "name=" + name + ", "
         + "rawLocation=" + Arrays.toString(rawLocation)
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OptimizationWaypoint) {
      OptimizationWaypoint that = (OptimizationWaypoint) o;
      return (this.waypointIndex == that.waypointIndex())
           && (this.tripsIndex == that.tripsIndex())
           && ((this.name == null) ? (that.name() == null) : this.name.equals(that.name()))
           && (Arrays.equals(this.rawLocation, (that instanceof $AutoValue_OptimizationWaypoint) ? (($AutoValue_OptimizationWaypoint) that).rawLocation : that.rawLocation()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= waypointIndex;
    h$ *= 1000003;
    h$ ^= tripsIndex;
    h$ *= 1000003;
    h$ ^= (name == null) ? 0 : name.hashCode();
    h$ *= 1000003;
    h$ ^= Arrays.hashCode(rawLocation);
    return h$;
  }

  @Override
  public OptimizationWaypoint.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends OptimizationWaypoint.Builder {
    private Integer waypointIndex;
    private Integer tripsIndex;
    private String name;
    private double[] rawLocation;
    Builder() {
    }
    private Builder(OptimizationWaypoint source) {
      this.waypointIndex = source.waypointIndex();
      this.tripsIndex = source.tripsIndex();
      this.name = source.name();
      this.rawLocation = source.rawLocation();
    }
    @Override
    public OptimizationWaypoint.Builder waypointIndex(int waypointIndex) {
      this.waypointIndex = waypointIndex;
      return this;
    }
    @Override
    public OptimizationWaypoint.Builder tripsIndex(int tripsIndex) {
      this.tripsIndex = tripsIndex;
      return this;
    }
    @Override
    public OptimizationWaypoint.Builder name(@Nullable String name) {
      this.name = name;
      return this;
    }
    @Override
    public OptimizationWaypoint.Builder rawLocation(double[] rawLocation) {
      this.rawLocation = rawLocation;
      return this;
    }
    @Override
    public OptimizationWaypoint build() {
      String missing = "";
      if (this.waypointIndex == null) {
        missing += " waypointIndex";
      }
      if (this.tripsIndex == null) {
        missing += " tripsIndex";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_OptimizationWaypoint(
          this.waypointIndex,
          this.tripsIndex,
          this.name,
          this.rawLocation);
    }
  }

}
