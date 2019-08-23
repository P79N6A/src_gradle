

package com.mapbox.api.matching.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MapMatchingResponse extends MapMatchingResponse {

  private final String code;

  private final String message;

  private final List<MapMatchingMatching> matchings;

  private final List<MapMatchingTracepoint> tracepoints;

  $AutoValue_MapMatchingResponse(
      String code,
      @Nullable String message,
      @Nullable List<MapMatchingMatching> matchings,
      @Nullable List<MapMatchingTracepoint> tracepoints) {
    if (code == null) {
      throw new NullPointerException("Null code");
    }
    this.code = code;
    this.message = message;
    this.matchings = matchings;
    this.tracepoints = tracepoints;
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
  public List<MapMatchingMatching> matchings() {
    return matchings;
  }

  @Nullable
  @Override
  public List<MapMatchingTracepoint> tracepoints() {
    return tracepoints;
  }

  @Override
  public String toString() {
    return "MapMatchingResponse{"
         + "code=" + code + ", "
         + "message=" + message + ", "
         + "matchings=" + matchings + ", "
         + "tracepoints=" + tracepoints
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapMatchingResponse) {
      MapMatchingResponse that = (MapMatchingResponse) o;
      return (this.code.equals(that.code()))
           && ((this.message == null) ? (that.message() == null) : this.message.equals(that.message()))
           && ((this.matchings == null) ? (that.matchings() == null) : this.matchings.equals(that.matchings()))
           && ((this.tracepoints == null) ? (that.tracepoints() == null) : this.tracepoints.equals(that.tracepoints()));
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
    h$ ^= (matchings == null) ? 0 : matchings.hashCode();
    h$ *= 1000003;
    h$ ^= (tracepoints == null) ? 0 : tracepoints.hashCode();
    return h$;
  }

  @Override
  public MapMatchingResponse.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MapMatchingResponse.Builder {
    private String code;
    private String message;
    private List<MapMatchingMatching> matchings;
    private List<MapMatchingTracepoint> tracepoints;
    Builder() {
    }
    private Builder(MapMatchingResponse source) {
      this.code = source.code();
      this.message = source.message();
      this.matchings = source.matchings();
      this.tracepoints = source.tracepoints();
    }
    @Override
    public MapMatchingResponse.Builder code(@Nullable String code) {
      if (code == null) {
        throw new NullPointerException("Null code");
      }
      this.code = code;
      return this;
    }
    @Override
    public MapMatchingResponse.Builder message(@Nullable String message) {
      this.message = message;
      return this;
    }
    @Override
    public MapMatchingResponse.Builder matchings(@Nullable List<MapMatchingMatching> matchings) {
      this.matchings = matchings;
      return this;
    }
    @Override
    public MapMatchingResponse.Builder tracepoints(@Nullable List<MapMatchingTracepoint> tracepoints) {
      this.tracepoints = tracepoints;
      return this;
    }
    @Override
    public MapMatchingResponse build() {
      String missing = "";
      if (this.code == null) {
        missing += " code";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapMatchingResponse(
          this.code,
          this.message,
          this.matchings,
          this.tracepoints);
    }
  }

}
