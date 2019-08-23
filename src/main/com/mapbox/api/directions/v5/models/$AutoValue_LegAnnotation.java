

package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_LegAnnotation extends LegAnnotation {

  private final List<Double> distance;

  private final List<Double> duration;

  private final List<Double> speed;

  private final List<MaxSpeed> maxspeed;

  private final List<String> congestion;

  $AutoValue_LegAnnotation(
      @Nullable List<Double> distance,
      @Nullable List<Double> duration,
      @Nullable List<Double> speed,
      @Nullable List<MaxSpeed> maxspeed,
      @Nullable List<String> congestion) {
    this.distance = distance;
    this.duration = duration;
    this.speed = speed;
    this.maxspeed = maxspeed;
    this.congestion = congestion;
  }

  @Nullable
  @Override
  public List<Double> distance() {
    return distance;
  }

  @Nullable
  @Override
  public List<Double> duration() {
    return duration;
  }

  @Nullable
  @Override
  public List<Double> speed() {
    return speed;
  }

  @Nullable
  @Override
  public List<MaxSpeed> maxspeed() {
    return maxspeed;
  }

  @Nullable
  @Override
  public List<String> congestion() {
    return congestion;
  }

  @Override
  public String toString() {
    return "LegAnnotation{"
         + "distance=" + distance + ", "
         + "duration=" + duration + ", "
         + "speed=" + speed + ", "
         + "maxspeed=" + maxspeed + ", "
         + "congestion=" + congestion
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LegAnnotation) {
      LegAnnotation that = (LegAnnotation) o;
      return ((this.distance == null) ? (that.distance() == null) : this.distance.equals(that.distance()))
           && ((this.duration == null) ? (that.duration() == null) : this.duration.equals(that.duration()))
           && ((this.speed == null) ? (that.speed() == null) : this.speed.equals(that.speed()))
           && ((this.maxspeed == null) ? (that.maxspeed() == null) : this.maxspeed.equals(that.maxspeed()))
           && ((this.congestion == null) ? (that.congestion() == null) : this.congestion.equals(that.congestion()));
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
    h$ ^= (speed == null) ? 0 : speed.hashCode();
    h$ *= 1000003;
    h$ ^= (maxspeed == null) ? 0 : maxspeed.hashCode();
    h$ *= 1000003;
    h$ ^= (congestion == null) ? 0 : congestion.hashCode();
    return h$;
  }

  @Override
  public LegAnnotation.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends LegAnnotation.Builder {
    private List<Double> distance;
    private List<Double> duration;
    private List<Double> speed;
    private List<MaxSpeed> maxspeed;
    private List<String> congestion;
    Builder() {
    }
    private Builder(LegAnnotation source) {
      this.distance = source.distance();
      this.duration = source.duration();
      this.speed = source.speed();
      this.maxspeed = source.maxspeed();
      this.congestion = source.congestion();
    }
    @Override
    public LegAnnotation.Builder distance(@Nullable List<Double> distance) {
      this.distance = distance;
      return this;
    }
    @Override
    public LegAnnotation.Builder duration(@Nullable List<Double> duration) {
      this.duration = duration;
      return this;
    }
    @Override
    public LegAnnotation.Builder speed(@Nullable List<Double> speed) {
      this.speed = speed;
      return this;
    }
    @Override
    public LegAnnotation.Builder maxspeed(@Nullable List<MaxSpeed> maxspeed) {
      this.maxspeed = maxspeed;
      return this;
    }
    @Override
    public LegAnnotation.Builder congestion(@Nullable List<String> congestion) {
      this.congestion = congestion;
      return this;
    }
    @Override
    public LegAnnotation build() {
      return new AutoValue_LegAnnotation(
          this.distance,
          this.duration,
          this.speed,
          this.maxspeed,
          this.congestion);
    }
  }

}
