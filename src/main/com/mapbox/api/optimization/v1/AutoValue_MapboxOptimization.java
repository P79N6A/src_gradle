

package com.mapbox.api.optimization.v1;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapboxOptimization extends MapboxOptimization {

  private final String user;

  private final String profile;

  private final Boolean roundTrip;

  private final String distributions;

  private final String source;

  private final String destination;

  private final String geometries;

  private final String overview;

  private final Boolean steps;

  private final String clientAppName;

  private final String accessToken;

  private final String baseUrl;

  private final String language;

  private final String radiuses;

  private final String bearings;

  private final String coordinates;

  private final String annotations;

  private AutoValue_MapboxOptimization(
      String user,
      String profile,
      @Nullable Boolean roundTrip,
      @Nullable String distributions,
      @Nullable String source,
      @Nullable String destination,
      @Nullable String geometries,
      @Nullable String overview,
      @Nullable Boolean steps,
      @Nullable String clientAppName,
      String accessToken,
      String baseUrl,
      @Nullable String language,
      @Nullable String radiuses,
      @Nullable String bearings,
      String coordinates,
      @Nullable String annotations) {
    this.user = user;
    this.profile = profile;
    this.roundTrip = roundTrip;
    this.distributions = distributions;
    this.source = source;
    this.destination = destination;
    this.geometries = geometries;
    this.overview = overview;
    this.steps = steps;
    this.clientAppName = clientAppName;
    this.accessToken = accessToken;
    this.baseUrl = baseUrl;
    this.language = language;
    this.radiuses = radiuses;
    this.bearings = bearings;
    this.coordinates = coordinates;
    this.annotations = annotations;
  }

  @NonNull
  @Override
  String user() {
    return user;
  }

  @NonNull
  @Override
  String profile() {
    return profile;
  }

  @Nullable
  @Override
  Boolean roundTrip() {
    return roundTrip;
  }

  @Nullable
  @Override
  String distributions() {
    return distributions;
  }

  @Nullable
  @Override
  String source() {
    return source;
  }

  @Nullable
  @Override
  String destination() {
    return destination;
  }

  @Nullable
  @Override
  String geometries() {
    return geometries;
  }

  @Nullable
  @Override
  String overview() {
    return overview;
  }

  @Nullable
  @Override
  Boolean steps() {
    return steps;
  }

  @Nullable
  @Override
  String clientAppName() {
    return clientAppName;
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
  String language() {
    return language;
  }

  @Nullable
  @Override
  String radiuses() {
    return radiuses;
  }

  @Nullable
  @Override
  String bearings() {
    return bearings;
  }

  @NonNull
  @Override
  String coordinates() {
    return coordinates;
  }

  @Nullable
  @Override
  String annotations() {
    return annotations;
  }

  @Override
  public String toString() {
    return "MapboxOptimization{"
         + "user=" + user + ", "
         + "profile=" + profile + ", "
         + "roundTrip=" + roundTrip + ", "
         + "distributions=" + distributions + ", "
         + "source=" + source + ", "
         + "destination=" + destination + ", "
         + "geometries=" + geometries + ", "
         + "overview=" + overview + ", "
         + "steps=" + steps + ", "
         + "clientAppName=" + clientAppName + ", "
         + "accessToken=" + accessToken + ", "
         + "baseUrl=" + baseUrl + ", "
         + "language=" + language + ", "
         + "radiuses=" + radiuses + ", "
         + "bearings=" + bearings + ", "
         + "coordinates=" + coordinates + ", "
         + "annotations=" + annotations
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxOptimization) {
      MapboxOptimization that = (MapboxOptimization) o;
      return (this.user.equals(that.user()))
           && (this.profile.equals(that.profile()))
           && ((this.roundTrip == null) ? (that.roundTrip() == null) : this.roundTrip.equals(that.roundTrip()))
           && ((this.distributions == null) ? (that.distributions() == null) : this.distributions.equals(that.distributions()))
           && ((this.source == null) ? (that.source() == null) : this.source.equals(that.source()))
           && ((this.destination == null) ? (that.destination() == null) : this.destination.equals(that.destination()))
           && ((this.geometries == null) ? (that.geometries() == null) : this.geometries.equals(that.geometries()))
           && ((this.overview == null) ? (that.overview() == null) : this.overview.equals(that.overview()))
           && ((this.steps == null) ? (that.steps() == null) : this.steps.equals(that.steps()))
           && ((this.clientAppName == null) ? (that.clientAppName() == null) : this.clientAppName.equals(that.clientAppName()))
           && (this.accessToken.equals(that.accessToken()))
           && (this.baseUrl.equals(that.baseUrl()))
           && ((this.language == null) ? (that.language() == null) : this.language.equals(that.language()))
           && ((this.radiuses == null) ? (that.radiuses() == null) : this.radiuses.equals(that.radiuses()))
           && ((this.bearings == null) ? (that.bearings() == null) : this.bearings.equals(that.bearings()))
           && (this.coordinates.equals(that.coordinates()))
           && ((this.annotations == null) ? (that.annotations() == null) : this.annotations.equals(that.annotations()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= user.hashCode();
    h$ *= 1000003;
    h$ ^= profile.hashCode();
    h$ *= 1000003;
    h$ ^= (roundTrip == null) ? 0 : roundTrip.hashCode();
    h$ *= 1000003;
    h$ ^= (distributions == null) ? 0 : distributions.hashCode();
    h$ *= 1000003;
    h$ ^= (source == null) ? 0 : source.hashCode();
    h$ *= 1000003;
    h$ ^= (destination == null) ? 0 : destination.hashCode();
    h$ *= 1000003;
    h$ ^= (geometries == null) ? 0 : geometries.hashCode();
    h$ *= 1000003;
    h$ ^= (overview == null) ? 0 : overview.hashCode();
    h$ *= 1000003;
    h$ ^= (steps == null) ? 0 : steps.hashCode();
    h$ *= 1000003;
    h$ ^= (clientAppName == null) ? 0 : clientAppName.hashCode();
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    h$ *= 1000003;
    h$ ^= (language == null) ? 0 : language.hashCode();
    h$ *= 1000003;
    h$ ^= (radiuses == null) ? 0 : radiuses.hashCode();
    h$ *= 1000003;
    h$ ^= (bearings == null) ? 0 : bearings.hashCode();
    h$ *= 1000003;
    h$ ^= coordinates.hashCode();
    h$ *= 1000003;
    h$ ^= (annotations == null) ? 0 : annotations.hashCode();
    return h$;
  }

  static final class Builder extends MapboxOptimization.Builder {
    private String user;
    private String profile;
    private Boolean roundTrip;
    private String distributions;
    private String source;
    private String destination;
    private String geometries;
    private String overview;
    private Boolean steps;
    private String clientAppName;
    private String accessToken;
    private String baseUrl;
    private String language;
    private String radiuses;
    private String bearings;
    private String coordinates;
    private String annotations;
    Builder() {
    }
    @Override
    public MapboxOptimization.Builder user(String user) {
      if (user == null) {
        throw new NullPointerException("Null user");
      }
      this.user = user;
      return this;
    }
    @Override
    public MapboxOptimization.Builder profile(String profile) {
      if (profile == null) {
        throw new NullPointerException("Null profile");
      }
      this.profile = profile;
      return this;
    }
    @Override
    public MapboxOptimization.Builder roundTrip(@Nullable Boolean roundTrip) {
      this.roundTrip = roundTrip;
      return this;
    }
    @Override
    MapboxOptimization.Builder distributions(@Nullable String distributions) {
      this.distributions = distributions;
      return this;
    }
    @Override
    public MapboxOptimization.Builder source(@Nullable String source) {
      this.source = source;
      return this;
    }
    @Override
    public MapboxOptimization.Builder destination(@Nullable String destination) {
      this.destination = destination;
      return this;
    }
    @Override
    public MapboxOptimization.Builder geometries(@Nullable String geometries) {
      this.geometries = geometries;
      return this;
    }
    @Override
    public MapboxOptimization.Builder overview(@Nullable String overview) {
      this.overview = overview;
      return this;
    }
    @Override
    public MapboxOptimization.Builder steps(@Nullable Boolean steps) {
      this.steps = steps;
      return this;
    }
    @Override
    public MapboxOptimization.Builder clientAppName(String clientAppName) {
      this.clientAppName = clientAppName;
      return this;
    }
    @Override
    public MapboxOptimization.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public MapboxOptimization.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    public MapboxOptimization.Builder language(@Nullable String language) {
      this.language = language;
      return this;
    }
    @Override
    MapboxOptimization.Builder radiuses(@Nullable String radiuses) {
      this.radiuses = radiuses;
      return this;
    }
    @Override
    MapboxOptimization.Builder bearings(@Nullable String bearings) {
      this.bearings = bearings;
      return this;
    }
    @Override
    MapboxOptimization.Builder coordinates(String coordinates) {
      if (coordinates == null) {
        throw new NullPointerException("Null coordinates");
      }
      this.coordinates = coordinates;
      return this;
    }
    @Override
    MapboxOptimization.Builder annotations(@Nullable String annotations) {
      this.annotations = annotations;
      return this;
    }
    @Override
    MapboxOptimization autoBuild() {
      String missing = "";
      if (this.user == null) {
        missing += " user";
      }
      if (this.profile == null) {
        missing += " profile";
      }
      if (this.accessToken == null) {
        missing += " accessToken";
      }
      if (this.baseUrl == null) {
        missing += " baseUrl";
      }
      if (this.coordinates == null) {
        missing += " coordinates";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxOptimization(
          this.user,
          this.profile,
          this.roundTrip,
          this.distributions,
          this.source,
          this.destination,
          this.geometries,
          this.overview,
          this.steps,
          this.clientAppName,
          this.accessToken,
          this.baseUrl,
          this.language,
          this.radiuses,
          this.bearings,
          this.coordinates,
          this.annotations);
    }
  }

}
