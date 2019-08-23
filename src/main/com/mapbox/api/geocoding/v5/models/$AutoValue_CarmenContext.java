

package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_CarmenContext extends CarmenContext {

  private final String id;

  private final String text;

  private final String shortCode;

  private final String wikidata;

  private final String category;

  private final String maki;

  $AutoValue_CarmenContext(
      @Nullable String id,
      @Nullable String text,
      @Nullable String shortCode,
      @Nullable String wikidata,
      @Nullable String category,
      @Nullable String maki) {
    this.id = id;
    this.text = text;
    this.shortCode = shortCode;
    this.wikidata = wikidata;
    this.category = category;
    this.maki = maki;
  }

  @Nullable
  @Override
  public String id() {
    return id;
  }

  @Nullable
  @Override
  public String text() {
    return text;
  }

  @Nullable
  @SerializedName(value = "short_code")
  @Override
  public String shortCode() {
    return shortCode;
  }

  @Nullable
  @Override
  public String wikidata() {
    return wikidata;
  }

  @Nullable
  @Override
  public String category() {
    return category;
  }

  @Nullable
  @Override
  public String maki() {
    return maki;
  }

  @Override
  public String toString() {
    return "CarmenContext{"
         + "id=" + id + ", "
         + "text=" + text + ", "
         + "shortCode=" + shortCode + ", "
         + "wikidata=" + wikidata + ", "
         + "category=" + category + ", "
         + "maki=" + maki
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CarmenContext) {
      CarmenContext that = (CarmenContext) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && ((this.text == null) ? (that.text() == null) : this.text.equals(that.text()))
           && ((this.shortCode == null) ? (that.shortCode() == null) : this.shortCode.equals(that.shortCode()))
           && ((this.wikidata == null) ? (that.wikidata() == null) : this.wikidata.equals(that.wikidata()))
           && ((this.category == null) ? (that.category() == null) : this.category.equals(that.category()))
           && ((this.maki == null) ? (that.maki() == null) : this.maki.equals(that.maki()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (id == null) ? 0 : id.hashCode();
    h$ *= 1000003;
    h$ ^= (text == null) ? 0 : text.hashCode();
    h$ *= 1000003;
    h$ ^= (shortCode == null) ? 0 : shortCode.hashCode();
    h$ *= 1000003;
    h$ ^= (wikidata == null) ? 0 : wikidata.hashCode();
    h$ *= 1000003;
    h$ ^= (category == null) ? 0 : category.hashCode();
    h$ *= 1000003;
    h$ ^= (maki == null) ? 0 : maki.hashCode();
    return h$;
  }

  @Override
  public CarmenContext.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends CarmenContext.Builder {
    private String id;
    private String text;
    private String shortCode;
    private String wikidata;
    private String category;
    private String maki;
    Builder() {
    }
    private Builder(CarmenContext source) {
      this.id = source.id();
      this.text = source.text();
      this.shortCode = source.shortCode();
      this.wikidata = source.wikidata();
      this.category = source.category();
      this.maki = source.maki();
    }
    @Override
    public CarmenContext.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    public CarmenContext.Builder text(String text) {
      this.text = text;
      return this;
    }
    @Override
    public CarmenContext.Builder shortCode(@Nullable String shortCode) {
      this.shortCode = shortCode;
      return this;
    }
    @Override
    public CarmenContext.Builder wikidata(@Nullable String wikidata) {
      this.wikidata = wikidata;
      return this;
    }
    @Override
    public CarmenContext.Builder category(@Nullable String category) {
      this.category = category;
      return this;
    }
    @Override
    public CarmenContext.Builder maki(@Nullable String maki) {
      this.maki = maki;
      return this;
    }
    @Override
    public CarmenContext build() {
      return new AutoValue_CarmenContext(
          this.id,
          this.text,
          this.shortCode,
          this.wikidata,
          this.category,
          this.maki);
    }
  }

}
