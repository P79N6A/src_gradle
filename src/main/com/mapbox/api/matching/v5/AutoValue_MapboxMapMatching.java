

package com.mapbox.api.matching.v5;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapboxMapMatching extends MapboxMapMatching {

  private final String clientAppName;

  private final String accessToken;

  private final Boolean tidy;

  private final String user;

  private final String profile;

  private final String coordinates;

  private final String geometries;

  private final String radiuses;

  private final Boolean steps;

  private final String overview;

  private final String timestamps;

  private final String annotations;

  private final String language;

  private final Boolean roundaboutExits;

  private final Boolean bannerInstructions;

  private final Boolean voiceInstructions;

  private final String voiceUnits;

  private final String waypoints;

  private final String waypointNames;

  private final String approaches;

  private final String baseUrl;

  private AutoValue_MapboxMapMatching(
      @Nullable String clientAppName,
      String accessToken,
      @Nullable Boolean tidy,
      String user,
      String profile,
      String coordinates,
      @Nullable String geometries,
      @Nullable String radiuses,
      @Nullable Boolean steps,
      @Nullable String overview,
      @Nullable String timestamps,
      @Nullable String annotations,
      @Nullable String language,
      @Nullable Boolean roundaboutExits,
      @Nullable Boolean bannerInstructions,
      @Nullable Boolean voiceInstructions,
      @Nullable String voiceUnits,
      @Nullable String waypoints,
      @Nullable String waypointNames,
      @Nullable String approaches,
      String baseUrl) {
    this.clientAppName = clientAppName;
    this.accessToken = accessToken;
    this.tidy = tidy;
    this.user = user;
    this.profile = profile;
    this.coordinates = coordinates;
    this.geometries = geometries;
    this.radiuses = radiuses;
    this.steps = steps;
    this.overview = overview;
    this.timestamps = timestamps;
    this.annotations = annotations;
    this.language = language;
    this.roundaboutExits = roundaboutExits;
    this.bannerInstructions = bannerInstructions;
    this.voiceInstructions = voiceInstructions;
    this.voiceUnits = voiceUnits;
    this.waypoints = waypoints;
    this.waypointNames = waypointNames;
    this.approaches = approaches;
    this.baseUrl = baseUrl;
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

  @Nullable
  @Override
  Boolean tidy() {
    return tidy;
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
  String coordinates() {
    return coordinates;
  }

  @Nullable
  @Override
  String geometries() {
    return geometries;
  }

  @Nullable
  @Override
  String radiuses() {
    return radiuses;
  }

  @Nullable
  @Override
  Boolean steps() {
    return steps;
  }

  @Nullable
  @Override
  String overview() {
    return overview;
  }

  @Nullable
  @Override
  String timestamps() {
    return timestamps;
  }

  @Nullable
  @Override
  String annotations() {
    return annotations;
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
  Boolean bannerInstructions() {
    return bannerInstructions;
  }

  @Nullable
  @Override
  Boolean voiceInstructions() {
    return voiceInstructions;
  }

  @Nullable
  @Override
  String voiceUnits() {
    return voiceUnits;
  }

  @Nullable
  @Override
  String waypoints() {
    return waypoints;
  }

  @Nullable
  @Override
  String waypointNames() {
    return waypointNames;
  }

  @Nullable
  @Override
  String approaches() {
    return approaches;
  }

  @NonNull
  @Override
  protected String baseUrl() {
    return baseUrl;
  }

  @Override
  public String toString() {
    return "MapboxMapMatching{"
         + "clientAppName=" + clientAppName + ", "
         + "accessToken=" + accessToken + ", "
         + "tidy=" + tidy + ", "
         + "user=" + user + ", "
         + "profile=" + profile + ", "
         + "coordinates=" + coordinates + ", "
         + "geometries=" + geometries + ", "
         + "radiuses=" + radiuses + ", "
         + "steps=" + steps + ", "
         + "overview=" + overview + ", "
         + "timestamps=" + timestamps + ", "
         + "annotations=" + annotations + ", "
         + "language=" + language + ", "
         + "roundaboutExits=" + roundaboutExits + ", "
         + "bannerInstructions=" + bannerInstructions + ", "
         + "voiceInstructions=" + voiceInstructions + ", "
         + "voiceUnits=" + voiceUnits + ", "
         + "waypoints=" + waypoints + ", "
         + "waypointNames=" + waypointNames + ", "
         + "approaches=" + approaches + ", "
         + "baseUrl=" + baseUrl
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxMapMatching) {
      MapboxMapMatching that = (MapboxMapMatching) o;
      return ((this.clientAppName == null) ? (that.clientAppName() == null) : this.clientAppName.equals(that.clientAppName()))
           && (this.accessToken.equals(that.accessToken()))
           && ((this.tidy == null) ? (that.tidy() == null) : this.tidy.equals(that.tidy()))
           && (this.user.equals(that.user()))
           && (this.profile.equals(that.profile()))
           && (this.coordinates.equals(that.coordinates()))
           && ((this.geometries == null) ? (that.geometries() == null) : this.geometries.equals(that.geometries()))
           && ((this.radiuses == null) ? (that.radiuses() == null) : this.radiuses.equals(that.radiuses()))
           && ((this.steps == null) ? (that.steps() == null) : this.steps.equals(that.steps()))
           && ((this.overview == null) ? (that.overview() == null) : this.overview.equals(that.overview()))
           && ((this.timestamps == null) ? (that.timestamps() == null) : this.timestamps.equals(that.timestamps()))
           && ((this.annotations == null) ? (that.annotations() == null) : this.annotations.equals(that.annotations()))
           && ((this.language == null) ? (that.language() == null) : this.language.equals(that.language()))
           && ((this.roundaboutExits == null) ? (that.roundaboutExits() == null) : this.roundaboutExits.equals(that.roundaboutExits()))
           && ((this.bannerInstructions == null) ? (that.bannerInstructions() == null) : this.bannerInstructions.equals(that.bannerInstructions()))
           && ((this.voiceInstructions == null) ? (that.voiceInstructions() == null) : this.voiceInstructions.equals(that.voiceInstructions()))
           && ((this.voiceUnits == null) ? (that.voiceUnits() == null) : this.voiceUnits.equals(that.voiceUnits()))
           && ((this.waypoints == null) ? (that.waypoints() == null) : this.waypoints.equals(that.waypoints()))
           && ((this.waypointNames == null) ? (that.waypointNames() == null) : this.waypointNames.equals(that.waypointNames()))
           && ((this.approaches == null) ? (that.approaches() == null) : this.approaches.equals(that.approaches()))
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
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= (tidy == null) ? 0 : tidy.hashCode();
    h$ *= 1000003;
    h$ ^= user.hashCode();
    h$ *= 1000003;
    h$ ^= profile.hashCode();
    h$ *= 1000003;
    h$ ^= coordinates.hashCode();
    h$ *= 1000003;
    h$ ^= (geometries == null) ? 0 : geometries.hashCode();
    h$ *= 1000003;
    h$ ^= (radiuses == null) ? 0 : radiuses.hashCode();
    h$ *= 1000003;
    h$ ^= (steps == null) ? 0 : steps.hashCode();
    h$ *= 1000003;
    h$ ^= (overview == null) ? 0 : overview.hashCode();
    h$ *= 1000003;
    h$ ^= (timestamps == null) ? 0 : timestamps.hashCode();
    h$ *= 1000003;
    h$ ^= (annotations == null) ? 0 : annotations.hashCode();
    h$ *= 1000003;
    h$ ^= (language == null) ? 0 : language.hashCode();
    h$ *= 1000003;
    h$ ^= (roundaboutExits == null) ? 0 : roundaboutExits.hashCode();
    h$ *= 1000003;
    h$ ^= (bannerInstructions == null) ? 0 : bannerInstructions.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceInstructions == null) ? 0 : voiceInstructions.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceUnits == null) ? 0 : voiceUnits.hashCode();
    h$ *= 1000003;
    h$ ^= (waypoints == null) ? 0 : waypoints.hashCode();
    h$ *= 1000003;
    h$ ^= (waypointNames == null) ? 0 : waypointNames.hashCode();
    h$ *= 1000003;
    h$ ^= (approaches == null) ? 0 : approaches.hashCode();
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    return h$;
  }

  static final class Builder extends MapboxMapMatching.Builder {
    private String clientAppName;
    private String accessToken;
    private Boolean tidy;
    private String user;
    private String profile;
    private String coordinates;
    private String geometries;
    private String radiuses;
    private Boolean steps;
    private String overview;
    private String timestamps;
    private String annotations;
    private String language;
    private Boolean roundaboutExits;
    private Boolean bannerInstructions;
    private Boolean voiceInstructions;
    private String voiceUnits;
    private String waypoints;
    private String waypointNames;
    private String approaches;
    private String baseUrl;
    Builder() {
    }
    @Override
    public MapboxMapMatching.Builder clientAppName(String clientAppName) {
      this.clientAppName = clientAppName;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder tidy(@Nullable Boolean tidy) {
      this.tidy = tidy;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder user(String user) {
      if (user == null) {
        throw new NullPointerException("Null user");
      }
      this.user = user;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder profile(String profile) {
      if (profile == null) {
        throw new NullPointerException("Null profile");
      }
      this.profile = profile;
      return this;
    }
    @Override
    protected MapboxMapMatching.Builder coordinates(String coordinates) {
      if (coordinates == null) {
        throw new NullPointerException("Null coordinates");
      }
      this.coordinates = coordinates;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder geometries(@Nullable String geometries) {
      this.geometries = geometries;
      return this;
    }
    @Override
    MapboxMapMatching.Builder radiuses(@Nullable String radiuses) {
      this.radiuses = radiuses;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder steps(@Nullable Boolean steps) {
      this.steps = steps;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder overview(@Nullable String overview) {
      this.overview = overview;
      return this;
    }
    @Override
    protected MapboxMapMatching.Builder timestamps(@Nullable String timestamps) {
      this.timestamps = timestamps;
      return this;
    }
    @Override
    protected MapboxMapMatching.Builder annotations(@Nullable String annotations) {
      this.annotations = annotations;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder language(String language) {
      this.language = language;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder roundaboutExits(@Nullable Boolean roundaboutExits) {
      this.roundaboutExits = roundaboutExits;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder bannerInstructions(@Nullable Boolean bannerInstructions) {
      this.bannerInstructions = bannerInstructions;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder voiceInstructions(@Nullable Boolean voiceInstructions) {
      this.voiceInstructions = voiceInstructions;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder voiceUnits(@Nullable String voiceUnits) {
      this.voiceUnits = voiceUnits;
      return this;
    }
    @Override
    MapboxMapMatching.Builder waypoints(@Nullable String waypoints) {
      this.waypoints = waypoints;
      return this;
    }
    @Override
    MapboxMapMatching.Builder waypointNames(@Nullable String waypointNames) {
      this.waypointNames = waypointNames;
      return this;
    }
    @Override
    MapboxMapMatching.Builder approaches(@Nullable String approaches) {
      this.approaches = approaches;
      return this;
    }
    @Override
    public MapboxMapMatching.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    protected MapboxMapMatching autoBuild() {
      String missing = "";
      if (this.accessToken == null) {
        missing += " accessToken";
      }
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
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxMapMatching(
          this.clientAppName,
          this.accessToken,
          this.tidy,
          this.user,
          this.profile,
          this.coordinates,
          this.geometries,
          this.radiuses,
          this.steps,
          this.overview,
          this.timestamps,
          this.annotations,
          this.language,
          this.roundaboutExits,
          this.bannerInstructions,
          this.voiceInstructions,
          this.voiceUnits,
          this.waypoints,
          this.waypointNames,
          this.approaches,
          this.baseUrl);
    }
  }

}
