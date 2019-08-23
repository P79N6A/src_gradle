

package com.mapbox.api.directions.v5;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.geojson.Point;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapboxDirections extends MapboxDirections {

  private final String user;

  private final String profile;

  private final List<Point> coordinates;

  private final String baseUrl;

  private final String accessToken;

  private final Boolean alternatives;

  private final String geometries;

  private final String overview;

  private final String radius;

  private final String bearing;

  private final Boolean steps;

  private final Boolean continueStraight;

  private final String annotation;

  private final String language;

  private final Boolean roundaboutExits;

  private final String clientAppName;

  private final Boolean voiceInstructions;

  private final Boolean bannerInstructions;

  private final String voiceUnits;

  private final String exclude;

  private final String approaches;

  private final String waypointNames;

  private AutoValue_MapboxDirections(
      String user,
      String profile,
      List<Point> coordinates,
      String baseUrl,
      String accessToken,
      @Nullable Boolean alternatives,
      @Nullable String geometries,
      @Nullable String overview,
      @Nullable String radius,
      @Nullable String bearing,
      @Nullable Boolean steps,
      @Nullable Boolean continueStraight,
      @Nullable String annotation,
      @Nullable String language,
      @Nullable Boolean roundaboutExits,
      @Nullable String clientAppName,
      @Nullable Boolean voiceInstructions,
      @Nullable Boolean bannerInstructions,
      @Nullable String voiceUnits,
      @Nullable String exclude,
      @Nullable String approaches,
      @Nullable String waypointNames) {
    this.user = user;
    this.profile = profile;
    this.coordinates = coordinates;
    this.baseUrl = baseUrl;
    this.accessToken = accessToken;
    this.alternatives = alternatives;
    this.geometries = geometries;
    this.overview = overview;
    this.radius = radius;
    this.bearing = bearing;
    this.steps = steps;
    this.continueStraight = continueStraight;
    this.annotation = annotation;
    this.language = language;
    this.roundaboutExits = roundaboutExits;
    this.clientAppName = clientAppName;
    this.voiceInstructions = voiceInstructions;
    this.bannerInstructions = bannerInstructions;
    this.voiceUnits = voiceUnits;
    this.exclude = exclude;
    this.approaches = approaches;
    this.waypointNames = waypointNames;
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

  @NonNull
  @Override
  List<Point> coordinates() {
    return coordinates;
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

  @Nullable
  @Override
  Boolean alternatives() {
    return alternatives;
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
  String radius() {
    return radius;
  }

  @Nullable
  @Override
  String bearing() {
    return bearing;
  }

  @Nullable
  @Override
  Boolean steps() {
    return steps;
  }

  @Nullable
  @Override
  Boolean continueStraight() {
    return continueStraight;
  }

  @Nullable
  @Override
  String annotation() {
    return annotation;
  }

  @Nullable
  @Override
  String language() {
    return language;
  }

  @Nullable
  @Override
  Boolean roundaboutExits() {
    return roundaboutExits;
  }

  @Nullable
  @Override
  String clientAppName() {
    return clientAppName;
  }

  @Nullable
  @Override
  Boolean voiceInstructions() {
    return voiceInstructions;
  }

  @Nullable
  @Override
  Boolean bannerInstructions() {
    return bannerInstructions;
  }

  @Nullable
  @Override
  String voiceUnits() {
    return voiceUnits;
  }

  @Nullable
  @Override
  String exclude() {
    return exclude;
  }

  @Nullable
  @Override
  String approaches() {
    return approaches;
  }

  @Nullable
  @Override
  String waypointNames() {
    return waypointNames;
  }

  @Override
  public String toString() {
    return "MapboxDirections{"
         + "user=" + user + ", "
         + "profile=" + profile + ", "
         + "coordinates=" + coordinates + ", "
         + "baseUrl=" + baseUrl + ", "
         + "accessToken=" + accessToken + ", "
         + "alternatives=" + alternatives + ", "
         + "geometries=" + geometries + ", "
         + "overview=" + overview + ", "
         + "radius=" + radius + ", "
         + "bearing=" + bearing + ", "
         + "steps=" + steps + ", "
         + "continueStraight=" + continueStraight + ", "
         + "annotation=" + annotation + ", "
         + "language=" + language + ", "
         + "roundaboutExits=" + roundaboutExits + ", "
         + "clientAppName=" + clientAppName + ", "
         + "voiceInstructions=" + voiceInstructions + ", "
         + "bannerInstructions=" + bannerInstructions + ", "
         + "voiceUnits=" + voiceUnits + ", "
         + "exclude=" + exclude + ", "
         + "approaches=" + approaches + ", "
         + "waypointNames=" + waypointNames
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxDirections) {
      MapboxDirections that = (MapboxDirections) o;
      return (this.user.equals(that.user()))
           && (this.profile.equals(that.profile()))
           && (this.coordinates.equals(that.coordinates()))
           && (this.baseUrl.equals(that.baseUrl()))
           && (this.accessToken.equals(that.accessToken()))
           && ((this.alternatives == null) ? (that.alternatives() == null) : this.alternatives.equals(that.alternatives()))
           && ((this.geometries == null) ? (that.geometries() == null) : this.geometries.equals(that.geometries()))
           && ((this.overview == null) ? (that.overview() == null) : this.overview.equals(that.overview()))
           && ((this.radius == null) ? (that.radius() == null) : this.radius.equals(that.radius()))
           && ((this.bearing == null) ? (that.bearing() == null) : this.bearing.equals(that.bearing()))
           && ((this.steps == null) ? (that.steps() == null) : this.steps.equals(that.steps()))
           && ((this.continueStraight == null) ? (that.continueStraight() == null) : this.continueStraight.equals(that.continueStraight()))
           && ((this.annotation == null) ? (that.annotation() == null) : this.annotation.equals(that.annotation()))
           && ((this.language == null) ? (that.language() == null) : this.language.equals(that.language()))
           && ((this.roundaboutExits == null) ? (that.roundaboutExits() == null) : this.roundaboutExits.equals(that.roundaboutExits()))
           && ((this.clientAppName == null) ? (that.clientAppName() == null) : this.clientAppName.equals(that.clientAppName()))
           && ((this.voiceInstructions == null) ? (that.voiceInstructions() == null) : this.voiceInstructions.equals(that.voiceInstructions()))
           && ((this.bannerInstructions == null) ? (that.bannerInstructions() == null) : this.bannerInstructions.equals(that.bannerInstructions()))
           && ((this.voiceUnits == null) ? (that.voiceUnits() == null) : this.voiceUnits.equals(that.voiceUnits()))
           && ((this.exclude == null) ? (that.exclude() == null) : this.exclude.equals(that.exclude()))
           && ((this.approaches == null) ? (that.approaches() == null) : this.approaches.equals(that.approaches()))
           && ((this.waypointNames == null) ? (that.waypointNames() == null) : this.waypointNames.equals(that.waypointNames()));
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
    h$ ^= coordinates.hashCode();
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= (alternatives == null) ? 0 : alternatives.hashCode();
    h$ *= 1000003;
    h$ ^= (geometries == null) ? 0 : geometries.hashCode();
    h$ *= 1000003;
    h$ ^= (overview == null) ? 0 : overview.hashCode();
    h$ *= 1000003;
    h$ ^= (radius == null) ? 0 : radius.hashCode();
    h$ *= 1000003;
    h$ ^= (bearing == null) ? 0 : bearing.hashCode();
    h$ *= 1000003;
    h$ ^= (steps == null) ? 0 : steps.hashCode();
    h$ *= 1000003;
    h$ ^= (continueStraight == null) ? 0 : continueStraight.hashCode();
    h$ *= 1000003;
    h$ ^= (annotation == null) ? 0 : annotation.hashCode();
    h$ *= 1000003;
    h$ ^= (language == null) ? 0 : language.hashCode();
    h$ *= 1000003;
    h$ ^= (roundaboutExits == null) ? 0 : roundaboutExits.hashCode();
    h$ *= 1000003;
    h$ ^= (clientAppName == null) ? 0 : clientAppName.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceInstructions == null) ? 0 : voiceInstructions.hashCode();
    h$ *= 1000003;
    h$ ^= (bannerInstructions == null) ? 0 : bannerInstructions.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceUnits == null) ? 0 : voiceUnits.hashCode();
    h$ *= 1000003;
    h$ ^= (exclude == null) ? 0 : exclude.hashCode();
    h$ *= 1000003;
    h$ ^= (approaches == null) ? 0 : approaches.hashCode();
    h$ *= 1000003;
    h$ ^= (waypointNames == null) ? 0 : waypointNames.hashCode();
    return h$;
  }

  @Override
  public MapboxDirections.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MapboxDirections.Builder {
    private String user;
    private String profile;
    private List<Point> coordinates;
    private String baseUrl;
    private String accessToken;
    private Boolean alternatives;
    private String geometries;
    private String overview;
    private String radius;
    private String bearing;
    private Boolean steps;
    private Boolean continueStraight;
    private String annotation;
    private String language;
    private Boolean roundaboutExits;
    private String clientAppName;
    private Boolean voiceInstructions;
    private Boolean bannerInstructions;
    private String voiceUnits;
    private String exclude;
    private String approaches;
    private String waypointNames;
    Builder() {
    }
    private Builder(MapboxDirections source) {
      this.user = source.user();
      this.profile = source.profile();
      this.coordinates = source.coordinates();
      this.baseUrl = source.baseUrl();
      this.accessToken = source.accessToken();
      this.alternatives = source.alternatives();
      this.geometries = source.geometries();
      this.overview = source.overview();
      this.radius = source.radius();
      this.bearing = source.bearing();
      this.steps = source.steps();
      this.continueStraight = source.continueStraight();
      this.annotation = source.annotation();
      this.language = source.language();
      this.roundaboutExits = source.roundaboutExits();
      this.clientAppName = source.clientAppName();
      this.voiceInstructions = source.voiceInstructions();
      this.bannerInstructions = source.bannerInstructions();
      this.voiceUnits = source.voiceUnits();
      this.exclude = source.exclude();
      this.approaches = source.approaches();
      this.waypointNames = source.waypointNames();
    }
    @Override
    public MapboxDirections.Builder user(String user) {
      if (user == null) {
        throw new NullPointerException("Null user");
      }
      this.user = user;
      return this;
    }
    @Override
    public MapboxDirections.Builder profile(String profile) {
      if (profile == null) {
        throw new NullPointerException("Null profile");
      }
      this.profile = profile;
      return this;
    }
    @Override
    MapboxDirections.Builder coordinates(List<Point> coordinates) {
      if (coordinates == null) {
        throw new NullPointerException("Null coordinates");
      }
      this.coordinates = coordinates;
      return this;
    }
    @Override
    public MapboxDirections.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    public MapboxDirections.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public MapboxDirections.Builder alternatives(@Nullable Boolean alternatives) {
      this.alternatives = alternatives;
      return this;
    }
    @Override
    public MapboxDirections.Builder geometries(String geometries) {
      this.geometries = geometries;
      return this;
    }
    @Override
    public MapboxDirections.Builder overview(@Nullable String overview) {
      this.overview = overview;
      return this;
    }
    @Override
    MapboxDirections.Builder radius(@Nullable String radius) {
      this.radius = radius;
      return this;
    }
    @Override
    MapboxDirections.Builder bearing(@Nullable String bearing) {
      this.bearing = bearing;
      return this;
    }
    @Override
    public MapboxDirections.Builder steps(@Nullable Boolean steps) {
      this.steps = steps;
      return this;
    }
    @Override
    public MapboxDirections.Builder continueStraight(@Nullable Boolean continueStraight) {
      this.continueStraight = continueStraight;
      return this;
    }
    @Override
    MapboxDirections.Builder annotation(@Nullable String annotation) {
      this.annotation = annotation;
      return this;
    }
    @Override
    MapboxDirections.Builder language(@Nullable String language) {
      this.language = language;
      return this;
    }
    @Override
    public MapboxDirections.Builder roundaboutExits(@Nullable Boolean roundaboutExits) {
      this.roundaboutExits = roundaboutExits;
      return this;
    }
    @Override
    public MapboxDirections.Builder clientAppName(String clientAppName) {
      this.clientAppName = clientAppName;
      return this;
    }
    @Override
    public MapboxDirections.Builder voiceInstructions(@Nullable Boolean voiceInstructions) {
      this.voiceInstructions = voiceInstructions;
      return this;
    }
    @Override
    public MapboxDirections.Builder bannerInstructions(@Nullable Boolean bannerInstructions) {
      this.bannerInstructions = bannerInstructions;
      return this;
    }
    @Override
    public MapboxDirections.Builder voiceUnits(@Nullable String voiceUnits) {
      this.voiceUnits = voiceUnits;
      return this;
    }
    @Override
    public MapboxDirections.Builder exclude(String exclude) {
      this.exclude = exclude;
      return this;
    }
    @Override
    MapboxDirections.Builder approaches(@Nullable String approaches) {
      this.approaches = approaches;
      return this;
    }
    @Override
    MapboxDirections.Builder waypointNames(@Nullable String waypointNames) {
      this.waypointNames = waypointNames;
      return this;
    }
    @Override
    MapboxDirections autoBuild() {
      String missing = "";
      if (this.user == null) {
        missing += " user";
      }
      if (this.profile == null) {
        missing += " profile";
      }
      if (this.coordinates == null) {
        missing += " coordinates";
      }
      if (this.baseUrl == null) {
        missing += " baseUrl";
      }
      if (this.accessToken == null) {
        missing += " accessToken";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxDirections(
          this.user,
          this.profile,
          this.coordinates,
          this.baseUrl,
          this.accessToken,
          this.alternatives,
          this.geometries,
          this.overview,
          this.radius,
          this.bearing,
          this.steps,
          this.continueStraight,
          this.annotation,
          this.language,
          this.roundaboutExits,
          this.clientAppName,
          this.voiceInstructions,
          this.bannerInstructions,
          this.voiceUnits,
          this.exclude,
          this.approaches,
          this.waypointNames);
    }
  }

}
