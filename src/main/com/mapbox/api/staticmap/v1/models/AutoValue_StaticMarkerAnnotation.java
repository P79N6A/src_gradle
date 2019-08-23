

package com.mapbox.api.staticmap.v1.models;

import android.support.annotation.Nullable;
import com.mapbox.geojson.Point;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_StaticMarkerAnnotation extends StaticMarkerAnnotation {

  private final String name;

  private final String label;

  private final String color;

  private final Point lnglat;

  private final String iconUrl;

  private AutoValue_StaticMarkerAnnotation(
      @Nullable String name,
      @Nullable String label,
      @Nullable String color,
      @Nullable Point lnglat,
      @Nullable String iconUrl) {
    this.name = name;
    this.label = label;
    this.color = color;
    this.lnglat = lnglat;
    this.iconUrl = iconUrl;
  }

  @Nullable
  @Override
  String name() {
    return name;
  }

  @Nullable
  @Override
  String label() {
    return label;
  }

  @Nullable
  @Override
  String color() {
    return color;
  }

  @Nullable
  @Override
  Point lnglat() {
    return lnglat;
  }

  @Nullable
  @Override
  String iconUrl() {
    return iconUrl;
  }

  @Override
  public String toString() {
    return "StaticMarkerAnnotation{"
         + "name=" + name + ", "
         + "label=" + label + ", "
         + "color=" + color + ", "
         + "lnglat=" + lnglat + ", "
         + "iconUrl=" + iconUrl
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StaticMarkerAnnotation) {
      StaticMarkerAnnotation that = (StaticMarkerAnnotation) o;
      return ((this.name == null) ? (that.name() == null) : this.name.equals(that.name()))
           && ((this.label == null) ? (that.label() == null) : this.label.equals(that.label()))
           && ((this.color == null) ? (that.color() == null) : this.color.equals(that.color()))
           && ((this.lnglat == null) ? (that.lnglat() == null) : this.lnglat.equals(that.lnglat()))
           && ((this.iconUrl == null) ? (that.iconUrl() == null) : this.iconUrl.equals(that.iconUrl()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (name == null) ? 0 : name.hashCode();
    h$ *= 1000003;
    h$ ^= (label == null) ? 0 : label.hashCode();
    h$ *= 1000003;
    h$ ^= (color == null) ? 0 : color.hashCode();
    h$ *= 1000003;
    h$ ^= (lnglat == null) ? 0 : lnglat.hashCode();
    h$ *= 1000003;
    h$ ^= (iconUrl == null) ? 0 : iconUrl.hashCode();
    return h$;
  }

  @Override
  public StaticMarkerAnnotation.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends StaticMarkerAnnotation.Builder {
    private String name;
    private String label;
    private String color;
    private Point lnglat;
    private String iconUrl;
    Builder() {
    }
    private Builder(StaticMarkerAnnotation source) {
      this.name = source.name();
      this.label = source.label();
      this.color = source.color();
      this.lnglat = source.lnglat();
      this.iconUrl = source.iconUrl();
    }
    @Override
    public StaticMarkerAnnotation.Builder name(String name) {
      this.name = name;
      return this;
    }
    @Override
    public StaticMarkerAnnotation.Builder label(String label) {
      this.label = label;
      return this;
    }
    @Override
    public StaticMarkerAnnotation.Builder color(@Nullable String color) {
      this.color = color;
      return this;
    }
    @Override
    public StaticMarkerAnnotation.Builder lnglat(Point lnglat) {
      this.lnglat = lnglat;
      return this;
    }
    @Override
    public StaticMarkerAnnotation.Builder iconUrl(@Nullable String iconUrl) {
      this.iconUrl = iconUrl;
      return this;
    }
    @Override
    StaticMarkerAnnotation autoBuild() {
      return new AutoValue_StaticMarkerAnnotation(
          this.name,
          this.label,
          this.color,
          this.lnglat,
          this.iconUrl);
    }
  }

}
