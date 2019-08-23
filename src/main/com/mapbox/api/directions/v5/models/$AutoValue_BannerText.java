

package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_BannerText extends BannerText {

  private final String text;

  private final List<BannerComponents> components;

  private final String type;

  private final String modifier;

  private final Double degrees;

  private final String drivingSide;

  $AutoValue_BannerText(
      @Nullable String text,
      @Nullable List<BannerComponents> components,
      @Nullable String type,
      @Nullable String modifier,
      @Nullable Double degrees,
      @Nullable String drivingSide) {
    this.text = text;
    this.components = components;
    this.type = type;
    this.modifier = modifier;
    this.degrees = degrees;
    this.drivingSide = drivingSide;
  }

  @Nullable
  @Override
  public String text() {
    return text;
  }

  @Nullable
  @Override
  public List<BannerComponents> components() {
    return components;
  }

  @Nullable
  @Override
  public String type() {
    return type;
  }

  @Nullable
  @Override
  public String modifier() {
    return modifier;
  }

  @Nullable
  @Override
  public Double degrees() {
    return degrees;
  }

  @Nullable
  @SerializedName(value = "driving_side")
  @Override
  public String drivingSide() {
    return drivingSide;
  }

  @Override
  public String toString() {
    return "BannerText{"
         + "text=" + text + ", "
         + "components=" + components + ", "
         + "type=" + type + ", "
         + "modifier=" + modifier + ", "
         + "degrees=" + degrees + ", "
         + "drivingSide=" + drivingSide
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BannerText) {
      BannerText that = (BannerText) o;
      return ((this.text == null) ? (that.text() == null) : this.text.equals(that.text()))
           && ((this.components == null) ? (that.components() == null) : this.components.equals(that.components()))
           && ((this.type == null) ? (that.type() == null) : this.type.equals(that.type()))
           && ((this.modifier == null) ? (that.modifier() == null) : this.modifier.equals(that.modifier()))
           && ((this.degrees == null) ? (that.degrees() == null) : this.degrees.equals(that.degrees()))
           && ((this.drivingSide == null) ? (that.drivingSide() == null) : this.drivingSide.equals(that.drivingSide()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (text == null) ? 0 : text.hashCode();
    h$ *= 1000003;
    h$ ^= (components == null) ? 0 : components.hashCode();
    h$ *= 1000003;
    h$ ^= (type == null) ? 0 : type.hashCode();
    h$ *= 1000003;
    h$ ^= (modifier == null) ? 0 : modifier.hashCode();
    h$ *= 1000003;
    h$ ^= (degrees == null) ? 0 : degrees.hashCode();
    h$ *= 1000003;
    h$ ^= (drivingSide == null) ? 0 : drivingSide.hashCode();
    return h$;
  }

  @Override
  public BannerText.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends BannerText.Builder {
    private String text;
    private List<BannerComponents> components;
    private String type;
    private String modifier;
    private Double degrees;
    private String drivingSide;
    Builder() {
    }
    private Builder(BannerText source) {
      this.text = source.text();
      this.components = source.components();
      this.type = source.type();
      this.modifier = source.modifier();
      this.degrees = source.degrees();
      this.drivingSide = source.drivingSide();
    }
    @Override
    public BannerText.Builder text(String text) {
      this.text = text;
      return this;
    }
    @Override
    public BannerText.Builder components(List<BannerComponents> components) {
      this.components = components;
      return this;
    }
    @Override
    public BannerText.Builder type(@Nullable String type) {
      this.type = type;
      return this;
    }
    @Override
    public BannerText.Builder modifier(@Nullable String modifier) {
      this.modifier = modifier;
      return this;
    }
    @Override
    public BannerText.Builder degrees(Double degrees) {
      this.degrees = degrees;
      return this;
    }
    @Override
    public BannerText.Builder drivingSide(@Nullable String drivingSide) {
      this.drivingSide = drivingSide;
      return this;
    }
    @Override
    public BannerText build() {
      return new AutoValue_BannerText(
          this.text,
          this.components,
          this.type,
          this.modifier,
          this.degrees,
          this.drivingSide);
    }
  }

}
