

package com.mapbox.api.directions.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.geojson.Point;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_RouteOptions extends RouteOptions {

  private final String baseUrl;

  private final String user;

  private final String profile;

  private final List<Point> coordinates;

  private final Boolean alternatives;

  private final String language;

  private final String radiuses;

  private final String bearings;

  private final Boolean continueStraight;

  private final Boolean roundaboutExits;

  private final String geometries;

  private final String overview;

  private final Boolean steps;

  private final String annotations;

  private final String exclude;

  private final Boolean voiceInstructions;

  private final Boolean bannerInstructions;

  private final String voiceUnits;

  private final String accessToken;

  private final String requestUuid;

  private final String approaches;

  private final String waypointNames;

  $AutoValue_RouteOptions(
      String baseUrl,
      String user,
      String profile,
      List<Point> coordinates,
      @Nullable Boolean alternatives,
      @Nullable String language,
      @Nullable String radiuses,
      @Nullable String bearings,
      @Nullable Boolean continueStraight,
      @Nullable Boolean roundaboutExits,
      String geometries,
      @Nullable String overview,
      @Nullable Boolean steps,
      @Nullable String annotations,
      @Nullable String exclude,
      @Nullable Boolean voiceInstructions,
      @Nullable Boolean bannerInstructions,
      @Nullable String voiceUnits,
      String accessToken,
      String requestUuid,
      @Nullable String approaches,
      @Nullable String waypointNames) {
    if (baseUrl == null) {
      throw new NullPointerException("Null baseUrl");
    }
    this.baseUrl = baseUrl;
    if (user == null) {
      throw new NullPointerException("Null user");
    }
    this.user = user;
    if (profile == null) {
      throw new NullPointerException("Null profile");
    }
    this.profile = profile;
    if (coordinates == null) {
      throw new NullPointerException("Null coordinates");
    }
    this.coordinates = coordinates;
    this.alternatives = alternatives;
    this.language = language;
    this.radiuses = radiuses;
    this.bearings = bearings;
    this.continueStraight = continueStraight;
    this.roundaboutExits = roundaboutExits;
    if (geometries == null) {
      throw new NullPointerException("Null geometries");
    }
    this.geometries = geometries;
    this.overview = overview;
    this.steps = steps;
    this.annotations = annotations;
    this.exclude = exclude;
    this.voiceInstructions = voiceInstructions;
    this.bannerInstructions = bannerInstructions;
    this.voiceUnits = voiceUnits;
    if (accessToken == null) {
      throw new NullPointerException("Null accessToken");
    }
    this.accessToken = accessToken;
    if (requestUuid == null) {
      throw new NullPointerException("Null requestUuid");
    }
    this.requestUuid = requestUuid;
    this.approaches = approaches;
    this.waypointNames = waypointNames;
  }

  @NonNull
  @Override
  public String baseUrl() {
    return baseUrl;
  }

  @NonNull
  @Override
  public String user() {
    return user;
  }

  @NonNull
  @Override
  public String profile() {
    return profile;
  }

  @NonNull
  @Override
  public List<Point> coordinates() {
    return coordinates;
  }

  @Nullable
  @Override
  public Boolean alternatives() {
    return alternatives;
  }

  @Nullable
  @Override
  public String language() {
    return language;
  }

  @Nullable
  @Override
  public String radiuses() {
    return radiuses;
  }

  @Nullable
  @Override
  public String bearings() {
    return bearings;
  }

  @Nullable
  @Override
  public Boolean continueStraight() {
    return continueStraight;
  }

  @Nullable
  @Override
  public Boolean roundaboutExits() {
    return roundaboutExits;
  }

  @Override
  public String geometries() {
    return geometries;
  }

  @Nullable
  @Override
  public String overview() {
    return overview;
  }

  @Nullable
  @Override
  public Boolean steps() {
    return steps;
  }

  @Nullable
  @Override
  public String annotations() {
    return annotations;
  }

  @Nullable
  @Override
  public String exclude() {
    return exclude;
  }

  @Nullable
  @Override
  public Boolean voiceInstructions() {
    return voiceInstructions;
  }

  @Nullable
  @Override
  public Boolean bannerInstructions() {
    return bannerInstructions;
  }

  @Nullable
  @Override
  public String voiceUnits() {
    return voiceUnits;
  }

  @NonNull
  @Override
  public String accessToken() {
    return accessToken;
  }

  @NonNull
  @Override
  public String requestUuid() {
    return requestUuid;
  }

  @Nullable
  @Override
  public String approaches() {
    return approaches;
  }

  @Nullable
  @Override
  public String waypointNames() {
    return waypointNames;
  }

  @Override
  public String toString() {
    return "RouteOptions{"
         + "baseUrl=" + baseUrl + ", "
         + "user=" + user + ", "
         + "profile=" + profile + ", "
         + "coordinates=" + coordinates + ", "
         + "alternatives=" + alternatives + ", "
         + "language=" + language + ", "
         + "radiuses=" + radiuses + ", "
         + "bearings=" + bearings + ", "
         + "continueStraight=" + continueStraight + ", "
         + "roundaboutExits=" + roundaboutExits + ", "
         + "geometries=" + geometries + ", "
         + "overview=" + overview + ", "
         + "steps=" + steps + ", "
         + "annotations=" + annotations + ", "
         + "exclude=" + exclude + ", "
         + "voiceInstructions=" + voiceInstructions + ", "
         + "bannerInstructions=" + bannerInstructions + ", "
         + "voiceUnits=" + voiceUnits + ", "
         + "accessToken=" + accessToken + ", "
         + "requestUuid=" + requestUuid + ", "
         + "approaches=" + approaches + ", "
         + "waypointNames=" + waypointNames
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouteOptions) {
      RouteOptions that = (RouteOptions) o;
      return (this.baseUrl.equals(that.baseUrl()))
           && (this.user.equals(that.user()))
           && (this.profile.equals(that.profile()))
           && (this.coordinates.equals(that.coordinates()))
           && ((this.alternatives == null) ? (that.alternatives() == null) : this.alternatives.equals(that.alternatives()))
           && ((this.language == null) ? (that.language() == null) : this.language.equals(that.language()))
           && ((this.radiuses == null) ? (that.radiuses() == null) : this.radiuses.equals(that.radiuses()))
           && ((this.bearings == null) ? (that.bearings() == null) : this.bearings.equals(that.bearings()))
           && ((this.continueStraight == null) ? (that.continueStraight() == null) : this.continueStraight.equals(that.continueStraight()))
           && ((this.roundaboutExits == null) ? (that.roundaboutExits() == null) : this.roundaboutExits.equals(that.roundaboutExits()))
           && (this.geometries.equals(that.geometries()))
           && ((this.overview == null) ? (that.overview() == null) : this.overview.equals(that.overview()))
           && ((this.steps == null) ? (that.steps() == null) : this.steps.equals(that.steps()))
           && ((this.annotations == null) ? (that.annotations() == null) : this.annotations.equals(that.annotations()))
           && ((this.exclude == null) ? (that.exclude() == null) : this.exclude.equals(that.exclude()))
           && ((this.voiceInstructions == null) ? (that.voiceInstructions() == null) : this.voiceInstructions.equals(that.voiceInstructions()))
           && ((this.bannerInstructions == null) ? (that.bannerInstructions() == null) : this.bannerInstructions.equals(that.bannerInstructions()))
           && ((this.voiceUnits == null) ? (that.voiceUnits() == null) : this.voiceUnits.equals(that.voiceUnits()))
           && (this.accessToken.equals(that.accessToken()))
           && (this.requestUuid.equals(that.requestUuid()))
           && ((this.approaches == null) ? (that.approaches() == null) : this.approaches.equals(that.approaches()))
           && ((this.waypointNames == null) ? (that.waypointNames() == null) : this.waypointNames.equals(that.waypointNames()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    h$ *= 1000003;
    h$ ^= user.hashCode();
    h$ *= 1000003;
    h$ ^= profile.hashCode();
    h$ *= 1000003;
    h$ ^= coordinates.hashCode();
    h$ *= 1000003;
    h$ ^= (alternatives == null) ? 0 : alternatives.hashCode();
    h$ *= 1000003;
    h$ ^= (language == null) ? 0 : language.hashCode();
    h$ *= 1000003;
    h$ ^= (radiuses == null) ? 0 : radiuses.hashCode();
    h$ *= 1000003;
    h$ ^= (bearings == null) ? 0 : bearings.hashCode();
    h$ *= 1000003;
    h$ ^= (continueStraight == null) ? 0 : continueStraight.hashCode();
    h$ *= 1000003;
    h$ ^= (roundaboutExits == null) ? 0 : roundaboutExits.hashCode();
    h$ *= 1000003;
    h$ ^= geometries.hashCode();
    h$ *= 1000003;
    h$ ^= (overview == null) ? 0 : overview.hashCode();
    h$ *= 1000003;
    h$ ^= (steps == null) ? 0 : steps.hashCode();
    h$ *= 1000003;
    h$ ^= (annotations == null) ? 0 : annotations.hashCode();
    h$ *= 1000003;
    h$ ^= (exclude == null) ? 0 : exclude.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceInstructions == null) ? 0 : voiceInstructions.hashCode();
    h$ *= 1000003;
    h$ ^= (bannerInstructions == null) ? 0 : bannerInstructions.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceUnits == null) ? 0 : voiceUnits.hashCode();
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= requestUuid.hashCode();
    h$ *= 1000003;
    h$ ^= (approaches == null) ? 0 : approaches.hashCode();
    h$ *= 1000003;
    h$ ^= (waypointNames == null) ? 0 : waypointNames.hashCode();
    return h$;
  }

  static final class Builder extends RouteOptions.Builder {
    private String baseUrl;
    private String user;
    private String profile;
    private List<Point> coordinates;
    private Boolean alternatives;
    private String language;
    private String radiuses;
    private String bearings;
    private Boolean continueStraight;
    private Boolean roundaboutExits;
    private String geometries;
    private String overview;
    private Boolean steps;
    private String annotations;
    private String exclude;
    private Boolean voiceInstructions;
    private Boolean bannerInstructions;
    private String voiceUnits;
    private String accessToken;
    private String requestUuid;
    private String approaches;
    private String waypointNames;
    Builder() {
    }
    @Override
    public RouteOptions.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    public RouteOptions.Builder user(String user) {
      if (user == null) {
        throw new NullPointerException("Null user");
      }
      this.user = user;
      return this;
    }
    @Override
    public RouteOptions.Builder profile(String profile) {
      if (profile == null) {
        throw new NullPointerException("Null profile");
      }
      this.profile = profile;
      return this;
    }
    @Override
    public RouteOptions.Builder coordinates(List<Point> coordinates) {
      if (coordinates == null) {
        throw new NullPointerException("Null coordinates");
      }
      this.coordinates = coordinates;
      return this;
    }
    @Override
    public RouteOptions.Builder alternatives(@Nullable Boolean alternatives) {
      this.alternatives = alternatives;
      return this;
    }
    @Override
    public RouteOptions.Builder language(String language) {
      this.language = language;
      return this;
    }
    @Override
    public RouteOptions.Builder radiuses(String radiuses) {
      this.radiuses = radiuses;
      return this;
    }
    @Override
    public RouteOptions.Builder bearings(String bearings) {
      this.bearings = bearings;
      return this;
    }
    @Override
    public RouteOptions.Builder continueStraight(Boolean continueStraight) {
      this.continueStraight = continueStraight;
      return this;
    }
    @Override
    public RouteOptions.Builder roundaboutExits(@Nullable Boolean roundaboutExits) {
      this.roundaboutExits = roundaboutExits;
      return this;
    }
    @Override
    public RouteOptions.Builder geometries(String geometries) {
      if (geometries == null) {
        throw new NullPointerException("Null geometries");
      }
      this.geometries = geometries;
      return this;
    }
    @Override
    public RouteOptions.Builder overview(@Nullable String overview) {
      this.overview = overview;
      return this;
    }
    @Override
    public RouteOptions.Builder steps(@Nullable Boolean steps) {
      this.steps = steps;
      return this;
    }
    @Override
    public RouteOptions.Builder annotations(String annotations) {
      this.annotations = annotations;
      return this;
    }
    @Override
    public RouteOptions.Builder exclude(String exclude) {
      this.exclude = exclude;
      return this;
    }
    @Override
    public RouteOptions.Builder voiceInstructions(Boolean voiceInstructions) {
      this.voiceInstructions = voiceInstructions;
      return this;
    }
    @Override
    public RouteOptions.Builder bannerInstructions(Boolean bannerInstructions) {
      this.bannerInstructions = bannerInstructions;
      return this;
    }
    @Override
    public RouteOptions.Builder voiceUnits(@Nullable String voiceUnits) {
      this.voiceUnits = voiceUnits;
      return this;
    }
    @Override
    public RouteOptions.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public RouteOptions.Builder requestUuid(String requestUuid) {
      if (requestUuid == null) {
        throw new NullPointerException("Null requestUuid");
      }
      this.requestUuid = requestUuid;
      return this;
    }
    @Override
    public RouteOptions.Builder approaches(String approaches) {
      this.approaches = approaches;
      return this;
    }
    @Override
    public RouteOptions.Builder waypointNames(@Nullable String waypointNames) {
      this.waypointNames = waypointNames;
      return this;
    }
    @Override
    public RouteOptions build() {
      String missing = "";
      if (this.baseUrl == null) {
        missing += " baseUrl";
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
      if (this.geometries == null) {
        missing += " geometries";
      }
      if (this.accessToken == null) {
        missing += " accessToken";
      }
      if (this.requestUuid == null) {
        missing += " requestUuid";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_RouteOptions(
          this.baseUrl,
          this.user,
          this.profile,
          this.coordinates,
          this.alternatives,
          this.language,
          this.radiuses,
          this.bearings,
          this.continueStraight,
          this.roundaboutExits,
          this.geometries,
          this.overview,
          this.steps,
          this.annotations,
          this.exclude,
          this.voiceInstructions,
          this.bannerInstructions,
          this.voiceUnits,
          this.accessToken,
          this.requestUuid,
          this.approaches,
          this.waypointNames);
    }
  }

}
