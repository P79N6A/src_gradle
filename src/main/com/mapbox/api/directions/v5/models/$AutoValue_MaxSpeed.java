

package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MaxSpeed extends MaxSpeed {

  private final Integer speed;

  private final String unit;

  private final Boolean unknown;

  private final Boolean none;

  $AutoValue_MaxSpeed(
      @Nullable Integer speed,
      @Nullable String unit,
      @Nullable Boolean unknown,
      @Nullable Boolean none) {
    this.speed = speed;
    this.unit = unit;
    this.unknown = unknown;
    this.none = none;
  }

  @Nullable
  @Override
  public Integer speed() {
    return speed;
  }

  @Nullable
  @Override
  public String unit() {
    return unit;
  }

  @Nullable
  @Override
  public Boolean unknown() {
    return unknown;
  }

  @Nullable
  @Override
  public Boolean none() {
    return none;
  }

  @Override
  public String toString() {
    return "MaxSpeed{"
         + "speed=" + speed + ", "
         + "unit=" + unit + ", "
         + "unknown=" + unknown + ", "
         + "none=" + none
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MaxSpeed) {
      MaxSpeed that = (MaxSpeed) o;
      return ((this.speed == null) ? (that.speed() == null) : this.speed.equals(that.speed()))
           && ((this.unit == null) ? (that.unit() == null) : this.unit.equals(that.unit()))
           && ((this.unknown == null) ? (that.unknown() == null) : this.unknown.equals(that.unknown()))
           && ((this.none == null) ? (that.none() == null) : this.none.equals(that.none()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (speed == null) ? 0 : speed.hashCode();
    h$ *= 1000003;
    h$ ^= (unit == null) ? 0 : unit.hashCode();
    h$ *= 1000003;
    h$ ^= (unknown == null) ? 0 : unknown.hashCode();
    h$ *= 1000003;
    h$ ^= (none == null) ? 0 : none.hashCode();
    return h$;
  }

  @Override
  public MaxSpeed.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MaxSpeed.Builder {
    private Integer speed;
    private String unit;
    private Boolean unknown;
    private Boolean none;
    Builder() {
    }
    private Builder(MaxSpeed source) {
      this.speed = source.speed();
      this.unit = source.unit();
      this.unknown = source.unknown();
      this.none = source.none();
    }
    @Override
    public MaxSpeed.Builder speed(@Nullable Integer speed) {
      this.speed = speed;
      return this;
    }
    @Override
    public MaxSpeed.Builder unit(@Nullable String unit) {
      this.unit = unit;
      return this;
    }
    @Override
    public MaxSpeed.Builder unknown(@Nullable Boolean unknown) {
      this.unknown = unknown;
      return this;
    }
    @Override
    public MaxSpeed.Builder none(@Nullable Boolean none) {
      this.none = none;
      return this;
    }
    @Override
    public MaxSpeed build() {
      return new AutoValue_MaxSpeed(
          this.speed,
          this.unit,
          this.unknown,
          this.none);
    }
  }

}
