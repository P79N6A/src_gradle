

package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.NonNull;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_GeocodingResponse extends GeocodingResponse {

  private final String type;

  private final List<String> query;

  private final List<CarmenFeature> features;

  private final String attribution;

  $AutoValue_GeocodingResponse(
      String type,
      List<String> query,
      List<CarmenFeature> features,
      String attribution) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (query == null) {
      throw new NullPointerException("Null query");
    }
    this.query = query;
    if (features == null) {
      throw new NullPointerException("Null features");
    }
    this.features = features;
    if (attribution == null) {
      throw new NullPointerException("Null attribution");
    }
    this.attribution = attribution;
  }

  @NonNull
  @Override
  public String type() {
    return type;
  }

  @NonNull
  @Override
  public List<String> query() {
    return query;
  }

  @NonNull
  @Override
  public List<CarmenFeature> features() {
    return features;
  }

  @NonNull
  @Override
  public String attribution() {
    return attribution;
  }

  @Override
  public String toString() {
    return "GeocodingResponse{"
         + "type=" + type + ", "
         + "query=" + query + ", "
         + "features=" + features + ", "
         + "attribution=" + attribution
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GeocodingResponse) {
      GeocodingResponse that = (GeocodingResponse) o;
      return (this.type.equals(that.type()))
           && (this.query.equals(that.query()))
           && (this.features.equals(that.features()))
           && (this.attribution.equals(that.attribution()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= query.hashCode();
    h$ *= 1000003;
    h$ ^= features.hashCode();
    h$ *= 1000003;
    h$ ^= attribution.hashCode();
    return h$;
  }

  @Override
  public GeocodingResponse.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends GeocodingResponse.Builder {
    private String type;
    private List<String> query;
    private List<CarmenFeature> features;
    private String attribution;
    Builder() {
    }
    private Builder(GeocodingResponse source) {
      this.type = source.type();
      this.query = source.query();
      this.features = source.features();
      this.attribution = source.attribution();
    }
    @Override
    GeocodingResponse.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public GeocodingResponse.Builder query(List<String> query) {
      if (query == null) {
        throw new NullPointerException("Null query");
      }
      this.query = query;
      return this;
    }
    @Override
    public GeocodingResponse.Builder features(List<CarmenFeature> features) {
      if (features == null) {
        throw new NullPointerException("Null features");
      }
      this.features = features;
      return this;
    }
    @Override
    public GeocodingResponse.Builder attribution(String attribution) {
      if (attribution == null) {
        throw new NullPointerException("Null attribution");
      }
      this.attribution = attribution;
      return this;
    }
    @Override
    public GeocodingResponse build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (this.query == null) {
        missing += " query";
      }
      if (this.features == null) {
        missing += " features";
      }
      if (this.attribution == null) {
        missing += " attribution";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_GeocodingResponse(
          this.type,
          this.query,
          this.features,
          this.attribution);
    }
  }

}
