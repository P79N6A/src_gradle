

package com.mapbox.api.tilequery;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapboxTilequery extends MapboxTilequery {

  private final String baseUrl;

  private final String accessToken;

  private final String mapIds;

  private final String query;

  private final Integer radius;

  private final Integer limit;

  private final Boolean dedupe;

  private final String geometry;

  private final String layers;

  private AutoValue_MapboxTilequery(
      String baseUrl,
      String accessToken,
      String mapIds,
      String query,
      @Nullable Integer radius,
      @Nullable Integer limit,
      @Nullable Boolean dedupe,
      @Nullable String geometry,
      @Nullable String layers) {
    this.baseUrl = baseUrl;
    this.accessToken = accessToken;
    this.mapIds = mapIds;
    this.query = query;
    this.radius = radius;
    this.limit = limit;
    this.dedupe = dedupe;
    this.geometry = geometry;
    this.layers = layers;
  }

  @NonNull
  @Override
  protected String baseUrl() {
    return baseUrl;
  }

  @NonNull
  @Override
  String accessToken() {
    return accessToken;
  }

  @NonNull
  @Override
  String mapIds() {
    return mapIds;
  }

  @NonNull
  @Override
  String query() {
    return query;
  }

  @Nullable
  @Override
  Integer radius() {
    return radius;
  }

  @Nullable
  @Override
  Integer limit() {
    return limit;
  }

  @Nullable
  @Override
  Boolean dedupe() {
    return dedupe;
  }

  @Nullable
  @TilequeryCriteria.TilequeryGeometry
  @Override
  String geometry() {
    return geometry;
  }

  @Nullable
  @Override
  String layers() {
    return layers;
  }

  @Override
  public String toString() {
    return "MapboxTilequery{"
         + "baseUrl=" + baseUrl + ", "
         + "accessToken=" + accessToken + ", "
         + "mapIds=" + mapIds + ", "
         + "query=" + query + ", "
         + "radius=" + radius + ", "
         + "limit=" + limit + ", "
         + "dedupe=" + dedupe + ", "
         + "geometry=" + geometry + ", "
         + "layers=" + layers
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxTilequery) {
      MapboxTilequery that = (MapboxTilequery) o;
      return (this.baseUrl.equals(that.baseUrl()))
           && (this.accessToken.equals(that.accessToken()))
           && (this.mapIds.equals(that.mapIds()))
           && (this.query.equals(that.query()))
           && ((this.radius == null) ? (that.radius() == null) : this.radius.equals(that.radius()))
           && ((this.limit == null) ? (that.limit() == null) : this.limit.equals(that.limit()))
           && ((this.dedupe == null) ? (that.dedupe() == null) : this.dedupe.equals(that.dedupe()))
           && ((this.geometry == null) ? (that.geometry() == null) : this.geometry.equals(that.geometry()))
           && ((this.layers == null) ? (that.layers() == null) : this.layers.equals(that.layers()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= mapIds.hashCode();
    h$ *= 1000003;
    h$ ^= query.hashCode();
    h$ *= 1000003;
    h$ ^= (radius == null) ? 0 : radius.hashCode();
    h$ *= 1000003;
    h$ ^= (limit == null) ? 0 : limit.hashCode();
    h$ *= 1000003;
    h$ ^= (dedupe == null) ? 0 : dedupe.hashCode();
    h$ *= 1000003;
    h$ ^= (geometry == null) ? 0 : geometry.hashCode();
    h$ *= 1000003;
    h$ ^= (layers == null) ? 0 : layers.hashCode();
    return h$;
  }

  static final class Builder extends MapboxTilequery.Builder {
    private String baseUrl;
    private String accessToken;
    private String mapIds;
    private String query;
    private Integer radius;
    private Integer limit;
    private Boolean dedupe;
    private String geometry;
    private String layers;
    Builder() {
    }
    @Override
    public MapboxTilequery.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    public MapboxTilequery.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public MapboxTilequery.Builder mapIds(String mapIds) {
      if (mapIds == null) {
        throw new NullPointerException("Null mapIds");
      }
      this.mapIds = mapIds;
      return this;
    }
    @Override
    public MapboxTilequery.Builder query(String query) {
      if (query == null) {
        throw new NullPointerException("Null query");
      }
      this.query = query;
      return this;
    }
    @Override
    public MapboxTilequery.Builder radius(@Nullable Integer radius) {
      this.radius = radius;
      return this;
    }
    @Override
    public MapboxTilequery.Builder limit(@Nullable Integer limit) {
      this.limit = limit;
      return this;
    }
    @Override
    public MapboxTilequery.Builder dedupe(@Nullable Boolean dedupe) {
      this.dedupe = dedupe;
      return this;
    }
    @Override
    public MapboxTilequery.Builder geometry(@Nullable String geometry) {
      this.geometry = geometry;
      return this;
    }
    @Override
    public MapboxTilequery.Builder layers(@Nullable String layers) {
      this.layers = layers;
      return this;
    }
    @Override
    MapboxTilequery autoBuild() {
      String missing = "";
      if (this.baseUrl == null) {
        missing += " baseUrl";
      }
      if (this.accessToken == null) {
        missing += " accessToken";
      }
      if (this.mapIds == null) {
        missing += " mapIds";
      }
      if (this.query == null) {
        missing += " query";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxTilequery(
          this.baseUrl,
          this.accessToken,
          this.mapIds,
          this.query,
          this.radius,
          this.limit,
          this.dedupe,
          this.geometry,
          this.layers);
    }
  }

}
