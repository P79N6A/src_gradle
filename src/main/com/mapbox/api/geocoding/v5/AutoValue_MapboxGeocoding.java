

package com.mapbox.api.geocoding.v5;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapboxGeocoding extends MapboxGeocoding {

  private final String query;

  private final String mode;

  private final String accessToken;

  private final String baseUrl;

  private final String country;

  private final String proximity;

  private final String geocodingTypes;

  private final Boolean autocomplete;

  private final String bbox;

  private final String limit;

  private final String languages;

  private final String reverseMode;

  private final String clientAppName;

  private AutoValue_MapboxGeocoding(
      String query,
      String mode,
      String accessToken,
      String baseUrl,
      @Nullable String country,
      @Nullable String proximity,
      @Nullable String geocodingTypes,
      @Nullable Boolean autocomplete,
      @Nullable String bbox,
      @Nullable String limit,
      @Nullable String languages,
      @Nullable String reverseMode,
      @Nullable String clientAppName) {
    this.query = query;
    this.mode = mode;
    this.accessToken = accessToken;
    this.baseUrl = baseUrl;
    this.country = country;
    this.proximity = proximity;
    this.geocodingTypes = geocodingTypes;
    this.autocomplete = autocomplete;
    this.bbox = bbox;
    this.limit = limit;
    this.languages = languages;
    this.reverseMode = reverseMode;
    this.clientAppName = clientAppName;
  }

  @NonNull
  @Override
  String query() {
    return query;
  }

  @NonNull
  @Override
  String mode() {
    return mode;
  }

  @NonNull
  @Override
  String accessToken() {
    return accessToken;
  }

  @NonNull
  @Override
  protected String baseUrl() {
    return baseUrl;
  }

  @Nullable
  @Override
  String country() {
    return country;
  }

  @Nullable
  @Override
  String proximity() {
    return proximity;
  }

  @Nullable
  @Override
  String geocodingTypes() {
    return geocodingTypes;
  }

  @Nullable
  @Override
  Boolean autocomplete() {
    return autocomplete;
  }

  @Nullable
  @Override
  String bbox() {
    return bbox;
  }

  @Nullable
  @Override
  String limit() {
    return limit;
  }

  @Nullable
  @Override
  String languages() {
    return languages;
  }

  @Nullable
  @Override
  String reverseMode() {
    return reverseMode;
  }

  @Nullable
  @Override
  String clientAppName() {
    return clientAppName;
  }

  @Override
  public String toString() {
    return "MapboxGeocoding{"
         + "query=" + query + ", "
         + "mode=" + mode + ", "
         + "accessToken=" + accessToken + ", "
         + "baseUrl=" + baseUrl + ", "
         + "country=" + country + ", "
         + "proximity=" + proximity + ", "
         + "geocodingTypes=" + geocodingTypes + ", "
         + "autocomplete=" + autocomplete + ", "
         + "bbox=" + bbox + ", "
         + "limit=" + limit + ", "
         + "languages=" + languages + ", "
         + "reverseMode=" + reverseMode + ", "
         + "clientAppName=" + clientAppName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxGeocoding) {
      MapboxGeocoding that = (MapboxGeocoding) o;
      return (this.query.equals(that.query()))
           && (this.mode.equals(that.mode()))
           && (this.accessToken.equals(that.accessToken()))
           && (this.baseUrl.equals(that.baseUrl()))
           && ((this.country == null) ? (that.country() == null) : this.country.equals(that.country()))
           && ((this.proximity == null) ? (that.proximity() == null) : this.proximity.equals(that.proximity()))
           && ((this.geocodingTypes == null) ? (that.geocodingTypes() == null) : this.geocodingTypes.equals(that.geocodingTypes()))
           && ((this.autocomplete == null) ? (that.autocomplete() == null) : this.autocomplete.equals(that.autocomplete()))
           && ((this.bbox == null) ? (that.bbox() == null) : this.bbox.equals(that.bbox()))
           && ((this.limit == null) ? (that.limit() == null) : this.limit.equals(that.limit()))
           && ((this.languages == null) ? (that.languages() == null) : this.languages.equals(that.languages()))
           && ((this.reverseMode == null) ? (that.reverseMode() == null) : this.reverseMode.equals(that.reverseMode()))
           && ((this.clientAppName == null) ? (that.clientAppName() == null) : this.clientAppName.equals(that.clientAppName()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= query.hashCode();
    h$ *= 1000003;
    h$ ^= mode.hashCode();
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    h$ *= 1000003;
    h$ ^= (country == null) ? 0 : country.hashCode();
    h$ *= 1000003;
    h$ ^= (proximity == null) ? 0 : proximity.hashCode();
    h$ *= 1000003;
    h$ ^= (geocodingTypes == null) ? 0 : geocodingTypes.hashCode();
    h$ *= 1000003;
    h$ ^= (autocomplete == null) ? 0 : autocomplete.hashCode();
    h$ *= 1000003;
    h$ ^= (bbox == null) ? 0 : bbox.hashCode();
    h$ *= 1000003;
    h$ ^= (limit == null) ? 0 : limit.hashCode();
    h$ *= 1000003;
    h$ ^= (languages == null) ? 0 : languages.hashCode();
    h$ *= 1000003;
    h$ ^= (reverseMode == null) ? 0 : reverseMode.hashCode();
    h$ *= 1000003;
    h$ ^= (clientAppName == null) ? 0 : clientAppName.hashCode();
    return h$;
  }

  static final class Builder extends MapboxGeocoding.Builder {
    private String query;
    private String mode;
    private String accessToken;
    private String baseUrl;
    private String country;
    private String proximity;
    private String geocodingTypes;
    private Boolean autocomplete;
    private String bbox;
    private String limit;
    private String languages;
    private String reverseMode;
    private String clientAppName;
    Builder() {
    }
    @Override
    public MapboxGeocoding.Builder query(String query) {
      if (query == null) {
        throw new NullPointerException("Null query");
      }
      this.query = query;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder mode(String mode) {
      if (mode == null) {
        throw new NullPointerException("Null mode");
      }
      this.mode = mode;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder country(String country) {
      this.country = country;
      return this;
    }
    @Override
    MapboxGeocoding.Builder proximity(String proximity) {
      this.proximity = proximity;
      return this;
    }
    @Override
    MapboxGeocoding.Builder geocodingTypes(String geocodingTypes) {
      this.geocodingTypes = geocodingTypes;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder autocomplete(Boolean autocomplete) {
      this.autocomplete = autocomplete;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder bbox(String bbox) {
      this.bbox = bbox;
      return this;
    }
    @Override
    MapboxGeocoding.Builder limit(String limit) {
      this.limit = limit;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder languages(String languages) {
      this.languages = languages;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder reverseMode(@Nullable String reverseMode) {
      this.reverseMode = reverseMode;
      return this;
    }
    @Override
    public MapboxGeocoding.Builder clientAppName(String clientAppName) {
      this.clientAppName = clientAppName;
      return this;
    }
    @Override
    MapboxGeocoding autoBuild() {
      String missing = "";
      if (this.query == null) {
        missing += " query";
      }
      if (this.mode == null) {
        missing += " mode";
      }
      if (this.accessToken == null) {
        missing += " accessToken";
      }
      if (this.baseUrl == null) {
        missing += " baseUrl";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxGeocoding(
          this.query,
          this.mode,
          this.accessToken,
          this.baseUrl,
          this.country,
          this.proximity,
          this.geocodingTypes,
          this.autocomplete,
          this.bbox,
          this.limit,
          this.languages,
          this.reverseMode,
          this.clientAppName);
    }
  }

}
