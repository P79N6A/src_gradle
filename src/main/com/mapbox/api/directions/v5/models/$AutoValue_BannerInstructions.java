

package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_BannerInstructions extends BannerInstructions {

  private final double distanceAlongGeometry;

  private final BannerText primary;

  private final BannerText secondary;

  private final BannerText sub;

  $AutoValue_BannerInstructions(
      double distanceAlongGeometry,
      @Nullable BannerText primary,
      @Nullable BannerText secondary,
      @Nullable BannerText sub) {
    this.distanceAlongGeometry = distanceAlongGeometry;
    this.primary = primary;
    this.secondary = secondary;
    this.sub = sub;
  }

  @Override
  public double distanceAlongGeometry() {
    return distanceAlongGeometry;
  }

  @Nullable
  @Override
  public BannerText primary() {
    return primary;
  }

  @Nullable
  @Override
  public BannerText secondary() {
    return secondary;
  }

  @Nullable
  @Override
  public BannerText sub() {
    return sub;
  }

  @Override
  public String toString() {
    return "BannerInstructions{"
         + "distanceAlongGeometry=" + distanceAlongGeometry + ", "
         + "primary=" + primary + ", "
         + "secondary=" + secondary + ", "
         + "sub=" + sub
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BannerInstructions) {
      BannerInstructions that = (BannerInstructions) o;
      return (Double.doubleToLongBits(this.distanceAlongGeometry) == Double.doubleToLongBits(that.distanceAlongGeometry()))
           && ((this.primary == null) ? (that.primary() == null) : this.primary.equals(that.primary()))
           && ((this.secondary == null) ? (that.secondary() == null) : this.secondary.equals(that.secondary()))
           && ((this.sub == null) ? (that.sub() == null) : this.sub.equals(that.sub()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(distanceAlongGeometry) >>> 32) ^ Double.doubleToLongBits(distanceAlongGeometry));
    h$ *= 1000003;
    h$ ^= (primary == null) ? 0 : primary.hashCode();
    h$ *= 1000003;
    h$ ^= (secondary == null) ? 0 : secondary.hashCode();
    h$ *= 1000003;
    h$ ^= (sub == null) ? 0 : sub.hashCode();
    return h$;
  }

  @Override
  public BannerInstructions.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends BannerInstructions.Builder {
    private Double distanceAlongGeometry;
    private BannerText primary;
    private BannerText secondary;
    private BannerText sub;
    Builder() {
    }
    private Builder(BannerInstructions source) {
      this.distanceAlongGeometry = source.distanceAlongGeometry();
      this.primary = source.primary();
      this.secondary = source.secondary();
      this.sub = source.sub();
    }
    @Override
    public BannerInstructions.Builder distanceAlongGeometry(double distanceAlongGeometry) {
      this.distanceAlongGeometry = distanceAlongGeometry;
      return this;
    }
    @Override
    public BannerInstructions.Builder primary(@Nullable BannerText primary) {
      this.primary = primary;
      return this;
    }
    @Override
    public BannerInstructions.Builder secondary(@Nullable BannerText secondary) {
      this.secondary = secondary;
      return this;
    }
    @Override
    public BannerInstructions.Builder sub(@Nullable BannerText sub) {
      this.sub = sub;
      return this;
    }
    @Override
    public BannerInstructions build() {
      String missing = "";
      if (this.distanceAlongGeometry == null) {
        missing += " distanceAlongGeometry";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_BannerInstructions(
          this.distanceAlongGeometry,
          this.primary,
          this.secondary,
          this.sub);
    }
  }

}
