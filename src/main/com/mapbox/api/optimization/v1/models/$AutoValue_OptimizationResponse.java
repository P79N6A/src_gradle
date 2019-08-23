

package com.mapbox.api.optimization.v1.models;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_OptimizationResponse extends OptimizationResponse {

  private final String code;

  private final List<OptimizationWaypoint> waypoints;

  private final List<DirectionsRoute> trips;

  $AutoValue_OptimizationResponse(
      @Nullable String code,
      @Nullable List<OptimizationWaypoint> waypoints,
      @Nullable List<DirectionsRoute> trips) {
    this.code = code;
    this.waypoints = waypoints;
    this.trips = trips;
  }

  @Nullable
  @Override
  public String code() {
    return code;
  }

  @Nullable
  @Override
  public List<OptimizationWaypoint> waypoints() {
    return waypoints;
  }

  @Nullable
  @Override
  public List<DirectionsRoute> trips() {
    return trips;
  }

  @Override
  public String toString() {
    return "OptimizationResponse{"
         + "code=" + code + ", "
         + "waypoints=" + waypoints + ", "
         + "trips=" + trips
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OptimizationResponse) {
      OptimizationResponse that = (OptimizationResponse) o;
      return ((this.code == null) ? (that.code() == null) : this.code.equals(that.code()))
           && ((this.waypoints == null) ? (that.waypoints() == null) : this.waypoints.equals(that.waypoints()))
           && ((this.trips == null) ? (that.trips() == null) : this.trips.equals(that.trips()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (code == null) ? 0 : code.hashCode();
    h$ *= 1000003;
    h$ ^= (waypoints == null) ? 0 : waypoints.hashCode();
    h$ *= 1000003;
    h$ ^= (trips == null) ? 0 : trips.hashCode();
    return h$;
  }

  @Override
  public OptimizationResponse.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends OptimizationResponse.Builder {
    private String code;
    private List<OptimizationWaypoint> waypoints;
    private List<DirectionsRoute> trips;
    Builder() {
    }
    private Builder(OptimizationResponse source) {
      this.code = source.code();
      this.waypoints = source.waypoints();
      this.trips = source.trips();
    }
    @Override
    public OptimizationResponse.Builder code(@Nullable String code) {
      this.code = code;
      return this;
    }
    @Override
    public OptimizationResponse.Builder waypoints(@Nullable List<OptimizationWaypoint> waypoints) {
      this.waypoints = waypoints;
      return this;
    }
    @Override
    public OptimizationResponse.Builder trips(@Nullable List<DirectionsRoute> trips) {
      this.trips = trips;
      return this;
    }
    @Override
    public OptimizationResponse build() {
      return new AutoValue_OptimizationResponse(
          this.code,
          this.waypoints,
          this.trips);
    }
  }

}
