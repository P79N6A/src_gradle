

package com.mapbox.api.directions.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_DirectionsResponse extends DirectionsResponse {

  private final String code;

  private final String message;

  private final List<DirectionsWaypoint> waypoints;

  private final List<DirectionsRoute> routes;

  private final String uuid;

  $AutoValue_DirectionsResponse(
      String code,
      @Nullable String message,
      @Nullable List<DirectionsWaypoint> waypoints,
      List<DirectionsRoute> routes,
      @Nullable String uuid) {
    if (code == null) {
      throw new NullPointerException("Null code");
    }
    this.code = code;
    this.message = message;
    this.waypoints = waypoints;
    if (routes == null) {
      throw new NullPointerException("Null routes");
    }
    this.routes = routes;
    this.uuid = uuid;
  }

  @NonNull
  @Override
  public String code() {
    return code;
  }

  @Nullable
  @Override
  public String message() {
    return message;
  }

  @Nullable
  @Override
  public List<DirectionsWaypoint> waypoints() {
    return waypoints;
  }

  @NonNull
  @Override
  public List<DirectionsRoute> routes() {
    return routes;
  }

  @Nullable
  @Override
  public String uuid() {
    return uuid;
  }

  @Override
  public String toString() {
    return "DirectionsResponse{"
         + "code=" + code + ", "
         + "message=" + message + ", "
         + "waypoints=" + waypoints + ", "
         + "routes=" + routes + ", "
         + "uuid=" + uuid
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DirectionsResponse) {
      DirectionsResponse that = (DirectionsResponse) o;
      return (this.code.equals(that.code()))
           && ((this.message == null) ? (that.message() == null) : this.message.equals(that.message()))
           && ((this.waypoints == null) ? (that.waypoints() == null) : this.waypoints.equals(that.waypoints()))
           && (this.routes.equals(that.routes()))
           && ((this.uuid == null) ? (that.uuid() == null) : this.uuid.equals(that.uuid()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= code.hashCode();
    h$ *= 1000003;
    h$ ^= (message == null) ? 0 : message.hashCode();
    h$ *= 1000003;
    h$ ^= (waypoints == null) ? 0 : waypoints.hashCode();
    h$ *= 1000003;
    h$ ^= routes.hashCode();
    h$ *= 1000003;
    h$ ^= (uuid == null) ? 0 : uuid.hashCode();
    return h$;
  }

  @Override
  public DirectionsResponse.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends DirectionsResponse.Builder {
    private String code;
    private String message;
    private List<DirectionsWaypoint> waypoints;
    private List<DirectionsRoute> routes;
    private String uuid;
    Builder() {
    }
    private Builder(DirectionsResponse source) {
      this.code = source.code();
      this.message = source.message();
      this.waypoints = source.waypoints();
      this.routes = source.routes();
      this.uuid = source.uuid();
    }
    @Override
    public DirectionsResponse.Builder code(String code) {
      if (code == null) {
        throw new NullPointerException("Null code");
      }
      this.code = code;
      return this;
    }
    @Override
    public DirectionsResponse.Builder message(@Nullable String message) {
      this.message = message;
      return this;
    }
    @Override
    public DirectionsResponse.Builder waypoints(@Nullable List<DirectionsWaypoint> waypoints) {
      this.waypoints = waypoints;
      return this;
    }
    @Override
    public DirectionsResponse.Builder routes(List<DirectionsRoute> routes) {
      if (routes == null) {
        throw new NullPointerException("Null routes");
      }
      this.routes = routes;
      return this;
    }
    @Override
    public DirectionsResponse.Builder uuid(@Nullable String uuid) {
      this.uuid = uuid;
      return this;
    }
    @Override
    public DirectionsResponse build() {
      String missing = "";
      if (this.code == null) {
        missing += " code";
      }
      if (this.routes == null) {
        missing += " routes";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_DirectionsResponse(
          this.code,
          this.message,
          this.waypoints,
          this.routes,
          this.uuid);
    }
  }

}
