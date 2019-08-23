

package com.mapbox.api.staticmap.v1.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_StaticPolylineAnnotation extends StaticPolylineAnnotation {

  private final Double strokeWidth;

  private final String strokeColor;

  private final Float strokeOpacity;

  private final String fillColor;

  private final Float fillOpacity;

  private final String polyline;

  private AutoValue_StaticPolylineAnnotation(
      @Nullable Double strokeWidth,
      @Nullable String strokeColor,
      @Nullable Float strokeOpacity,
      @Nullable String fillColor,
      @Nullable Float fillOpacity,
      String polyline) {
    this.strokeWidth = strokeWidth;
    this.strokeColor = strokeColor;
    this.strokeOpacity = strokeOpacity;
    this.fillColor = fillColor;
    this.fillOpacity = fillOpacity;
    this.polyline = polyline;
  }

  @Nullable
  @Override
  Double strokeWidth() {
    return strokeWidth;
  }

  @Nullable
  @Override
  String strokeColor() {
    return strokeColor;
  }

  @Nullable
  @Override
  Float strokeOpacity() {
    return strokeOpacity;
  }

  @Nullable
  @Override
  String fillColor() {
    return fillColor;
  }

  @Nullable
  @Override
  Float fillOpacity() {
    return fillOpacity;
  }

  @NonNull
  @Override
  String polyline() {
    return polyline;
  }

  @Override
  public String toString() {
    return "StaticPolylineAnnotation{"
         + "strokeWidth=" + strokeWidth + ", "
         + "strokeColor=" + strokeColor + ", "
         + "strokeOpacity=" + strokeOpacity + ", "
         + "fillColor=" + fillColor + ", "
         + "fillOpacity=" + fillOpacity + ", "
         + "polyline=" + polyline
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StaticPolylineAnnotation) {
      StaticPolylineAnnotation that = (StaticPolylineAnnotation) o;
      return ((this.strokeWidth == null) ? (that.strokeWidth() == null) : this.strokeWidth.equals(that.strokeWidth()))
           && ((this.strokeColor == null) ? (that.strokeColor() == null) : this.strokeColor.equals(that.strokeColor()))
           && ((this.strokeOpacity == null) ? (that.strokeOpacity() == null) : this.strokeOpacity.equals(that.strokeOpacity()))
           && ((this.fillColor == null) ? (that.fillColor() == null) : this.fillColor.equals(that.fillColor()))
           && ((this.fillOpacity == null) ? (that.fillOpacity() == null) : this.fillOpacity.equals(that.fillOpacity()))
           && (this.polyline.equals(that.polyline()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (strokeWidth == null) ? 0 : strokeWidth.hashCode();
    h$ *= 1000003;
    h$ ^= (strokeColor == null) ? 0 : strokeColor.hashCode();
    h$ *= 1000003;
    h$ ^= (strokeOpacity == null) ? 0 : strokeOpacity.hashCode();
    h$ *= 1000003;
    h$ ^= (fillColor == null) ? 0 : fillColor.hashCode();
    h$ *= 1000003;
    h$ ^= (fillOpacity == null) ? 0 : fillOpacity.hashCode();
    h$ *= 1000003;
    h$ ^= polyline.hashCode();
    return h$;
  }

  @Override
  public StaticPolylineAnnotation.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends StaticPolylineAnnotation.Builder {
    private Double strokeWidth;
    private String strokeColor;
    private Float strokeOpacity;
    private String fillColor;
    private Float fillOpacity;
    private String polyline;
    Builder() {
    }
    private Builder(StaticPolylineAnnotation source) {
      this.strokeWidth = source.strokeWidth();
      this.strokeColor = source.strokeColor();
      this.strokeOpacity = source.strokeOpacity();
      this.fillColor = source.fillColor();
      this.fillOpacity = source.fillOpacity();
      this.polyline = source.polyline();
    }
    @Override
    public StaticPolylineAnnotation.Builder strokeWidth(@Nullable Double strokeWidth) {
      this.strokeWidth = strokeWidth;
      return this;
    }
    @Override
    public StaticPolylineAnnotation.Builder strokeColor(@Nullable String strokeColor) {
      this.strokeColor = strokeColor;
      return this;
    }
    @Override
    public StaticPolylineAnnotation.Builder strokeOpacity(@Nullable Float strokeOpacity) {
      this.strokeOpacity = strokeOpacity;
      return this;
    }
    @Override
    public StaticPolylineAnnotation.Builder fillColor(@Nullable String fillColor) {
      this.fillColor = fillColor;
      return this;
    }
    @Override
    public StaticPolylineAnnotation.Builder fillOpacity(@Nullable Float fillOpacity) {
      this.fillOpacity = fillOpacity;
      return this;
    }
    @Override
    public StaticPolylineAnnotation.Builder polyline(String polyline) {
      if (polyline == null) {
        throw new NullPointerException("Null polyline");
      }
      this.polyline = polyline;
      return this;
    }
    @Override
    public StaticPolylineAnnotation build() {
      String missing = "";
      if (this.polyline == null) {
        missing += " polyline";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_StaticPolylineAnnotation(
          this.strokeWidth,
          this.strokeColor,
          this.strokeOpacity,
          this.fillColor,
          this.fillOpacity,
          this.polyline);
    }
  }

}
