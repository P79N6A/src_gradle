

package com.mapbox.api.matrix.v1;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapboxMatrix extends MapboxMatrix {

  private final String clientAppName;

  private final String user;

  private final String coordinates;

  private final String accessToken;

  private final String profile;

  private final String sources;

  private final String destinations;

  private final String baseUrl;

  private AutoValue_MapboxMatrix(
      @Nullable String clientAppName,
      String user,
      String coordinates,
      String accessToken,
      String profile,
      @Nullable String sources,
      @Nullable String destinations,
      String baseUrl) {
    this.clientAppName = clientAppName;
    this.user = user;
    this.coordinates = coordinates;
    this.accessToken = accessToken;
    this.profile = profile;
    this.sources = sources;
    this.destinations = destinations;
    this.baseUrl = baseUrl;
  }

  @Nullable
  @Override
  String clientAppName() {
    return clientAppName;
  }

  @NonNull
  @Override
  String user() {
    return user;
  }

  @NonNull
  @Override
  String coordinates() {
    return coordinates;
  }

  @NonNull
  @Override
  String accessToken() {
    return accessToken;
  }

  @NonNull
  @Override
  String profile() {
    return profile;
  }

  @Nullable
  @Override
  String sources() {
    return sources;
  }

  @Nullable
  @Override
  String destinations() {
    return destinations;
  }

  @NonNull
  @Override
  protected String baseUrl() {
    return baseUrl;
  }

  @Override
  public String toString() {
    return "MapboxMatrix{"
         + "clientAppName=" + clientAppName + ", "
         + "user=" + user + ", "
         + "coordinates=" + coordinates + ", "
         + "accessToken=" + accessToken + ", "
         + "profile=" + profile + ", "
         + "sources=" + sources + ", "
         + "destinations=" + destinations + ", "
         + "baseUrl=" + baseUrl
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxMatrix) {
      MapboxMatrix that = (MapboxMatrix) o;
      return ((this.clientAppName == null) ? (that.clientAppName() == null) : this.clientAppName.equals(that.clientAppName()))
           && (this.user.equals(that.user()))
           && (this.coordinates.equals(that.coordinates()))
           && (this.accessToken.equals(that.accessToken()))
           && (this.profile.equals(that.profile()))
           && ((this.sources == null) ? (that.sources() == null) : this.sources.equals(that.sources()))
           && ((this.destinations == null) ? (that.destinations() == null) : this.destinations.equals(that.destinations()))
           && (this.baseUrl.equals(that.baseUrl()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (clientAppName == null) ? 0 : clientAppName.hashCode();
    h$ *= 1000003;
    h$ ^= user.hashCode();
    h$ *= 1000003;
    h$ ^= coordinates.hashCode();
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= profile.hashCode();
    h$ *= 1000003;
    h$ ^= (sources == null) ? 0 : sources.hashCode();
    h$ *= 1000003;
    h$ ^= (destinations == null) ? 0 : destinations.hashCode();
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    return h$;
  }

  static final class Builder extends MapboxMatrix.Builder {
    private String clientAppName;
    private String user;
    private String coordinates;
    private String accessToken;
    private String profile;
    private String sources;
    private String destinations;
    private String baseUrl;
    Builder() {
    }
    @Override
    public MapboxMatrix.Builder clientAppName(String clientAppName) {
      this.clientAppName = clientAppName;
      return this;
    }
    @Override
    public MapboxMatrix.Builder user(String user) {
      if (user == null) {
        throw new NullPointerException("Null user");
      }
      this.user = user;
      return this;
    }
    @Override
    MapboxMatrix.Builder coordinates(String coordinates) {
      if (coordinates == null) {
        throw new NullPointerException("Null coordinates");
      }
      this.coordinates = coordinates;
      return this;
    }
    @Override
    public MapboxMatrix.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public MapboxMatrix.Builder profile(String profile) {
      if (profile == null) {
        throw new NullPointerException("Null profile");
      }
      this.profile = profile;
      return this;
    }
    @Override
    MapboxMatrix.Builder sources(@Nullable String sources) {
      this.sources = sources;
      return this;
    }
    @Override
    MapboxMatrix.Builder destinations(@Nullable String destinations) {
      this.destinations = destinations;
      return this;
    }
    @Override
    public MapboxMatrix.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    MapboxMatrix autoBuild() {
      String missing = "";
      if (this.user == null) {
        missing += " user";
      }
      if (this.coordinates == null) {
        missing += " coordinates";
      }
      if (this.accessToken == null) {
        missing += " accessToken";
      }
      if (this.profile == null) {
        missing += " profile";
      }
      if (this.baseUrl == null) {
        missing += " baseUrl";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxMatrix(
          this.clientAppName,
          this.user,
          this.coordinates,
          this.accessToken,
          this.profile,
          this.sources,
          this.destinations,
          this.baseUrl);
    }
  }

}
