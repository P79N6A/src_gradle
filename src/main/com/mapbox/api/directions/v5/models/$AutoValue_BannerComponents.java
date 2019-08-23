

package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_BannerComponents extends BannerComponents {

  private final String text;

  private final String type;

  private final String abbreviation;

  private final Integer abbreviationPriority;

  private final String imageBaseUrl;

  private final List<String> directions;

  private final Boolean active;

  $AutoValue_BannerComponents(
      String text,
      String type,
      @Nullable String abbreviation,
      @Nullable Integer abbreviationPriority,
      @Nullable String imageBaseUrl,
      @Nullable List<String> directions,
      @Nullable Boolean active) {
    if (text == null) {
      throw new NullPointerException("Null text");
    }
    this.text = text;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.abbreviation = abbreviation;
    this.abbreviationPriority = abbreviationPriority;
    this.imageBaseUrl = imageBaseUrl;
    this.directions = directions;
    this.active = active;
  }

  @Override
  public String text() {
    return text;
  }

  @Override
  public String type() {
    return type;
  }

  @Nullable
  @SerializedName(value = "abbr")
  @Override
  public String abbreviation() {
    return abbreviation;
  }

  @Nullable
  @SerializedName(value = "abbr_priority")
  @Override
  public Integer abbreviationPriority() {
    return abbreviationPriority;
  }

  @Nullable
  @SerializedName(value = "imageBaseURL")
  @Override
  public String imageBaseUrl() {
    return imageBaseUrl;
  }

  @Nullable
  @Override
  public List<String> directions() {
    return directions;
  }

  @Nullable
  @Override
  public Boolean active() {
    return active;
  }

  @Override
  public String toString() {
    return "BannerComponents{"
         + "text=" + text + ", "
         + "type=" + type + ", "
         + "abbreviation=" + abbreviation + ", "
         + "abbreviationPriority=" + abbreviationPriority + ", "
         + "imageBaseUrl=" + imageBaseUrl + ", "
         + "directions=" + directions + ", "
         + "active=" + active
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BannerComponents) {
      BannerComponents that = (BannerComponents) o;
      return (this.text.equals(that.text()))
           && (this.type.equals(that.type()))
           && ((this.abbreviation == null) ? (that.abbreviation() == null) : this.abbreviation.equals(that.abbreviation()))
           && ((this.abbreviationPriority == null) ? (that.abbreviationPriority() == null) : this.abbreviationPriority.equals(that.abbreviationPriority()))
           && ((this.imageBaseUrl == null) ? (that.imageBaseUrl() == null) : this.imageBaseUrl.equals(that.imageBaseUrl()))
           && ((this.directions == null) ? (that.directions() == null) : this.directions.equals(that.directions()))
           && ((this.active == null) ? (that.active() == null) : this.active.equals(that.active()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= text.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= (abbreviation == null) ? 0 : abbreviation.hashCode();
    h$ *= 1000003;
    h$ ^= (abbreviationPriority == null) ? 0 : abbreviationPriority.hashCode();
    h$ *= 1000003;
    h$ ^= (imageBaseUrl == null) ? 0 : imageBaseUrl.hashCode();
    h$ *= 1000003;
    h$ ^= (directions == null) ? 0 : directions.hashCode();
    h$ *= 1000003;
    h$ ^= (active == null) ? 0 : active.hashCode();
    return h$;
  }

  @Override
  public BannerComponents.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends BannerComponents.Builder {
    private String text;
    private String type;
    private String abbreviation;
    private Integer abbreviationPriority;
    private String imageBaseUrl;
    private List<String> directions;
    private Boolean active;
    Builder() {
    }
    private Builder(BannerComponents source) {
      this.text = source.text();
      this.type = source.type();
      this.abbreviation = source.abbreviation();
      this.abbreviationPriority = source.abbreviationPriority();
      this.imageBaseUrl = source.imageBaseUrl();
      this.directions = source.directions();
      this.active = source.active();
    }
    @Override
    public BannerComponents.Builder text(String text) {
      if (text == null) {
        throw new NullPointerException("Null text");
      }
      this.text = text;
      return this;
    }
    @Override
    public BannerComponents.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public BannerComponents.Builder abbreviation(@Nullable String abbreviation) {
      this.abbreviation = abbreviation;
      return this;
    }
    @Override
    public BannerComponents.Builder abbreviationPriority(@Nullable Integer abbreviationPriority) {
      this.abbreviationPriority = abbreviationPriority;
      return this;
    }
    @Override
    public BannerComponents.Builder imageBaseUrl(@Nullable String imageBaseUrl) {
      this.imageBaseUrl = imageBaseUrl;
      return this;
    }
    @Override
    public BannerComponents.Builder directions(List<String> directions) {
      this.directions = directions;
      return this;
    }
    @Override
    public BannerComponents.Builder active(Boolean active) {
      this.active = active;
      return this;
    }
    @Override
    public BannerComponents build() {
      String missing = "";
      if (this.text == null) {
        missing += " text";
      }
      if (this.type == null) {
        missing += " type";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_BannerComponents(
          this.text,
          this.type,
          this.abbreviation,
          this.abbreviationPriority,
          this.imageBaseUrl,
          this.directions,
          this.active);
    }
  }

}
