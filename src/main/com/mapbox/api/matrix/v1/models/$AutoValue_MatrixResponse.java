

package com.mapbox.api.matrix.v1.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MatrixResponse extends MatrixResponse {

  private final String code;

  private final List<DirectionsWaypoint> destinations;

  private final List<DirectionsWaypoint> sources;

  private final List<Double[]> durations;

  $AutoValue_MatrixResponse(
      String code,
      @Nullable List<DirectionsWaypoint> destinations,
      @Nullable List<DirectionsWaypoint> sources,
      @Nullable List<Double[]> durations) {
    if (code == null) {
      throw new NullPointerException("Null code");
    }
    this.code = code;
    this.destinations = destinations;
    this.sources = sources;
    this.durations = durations;
  }

  @NonNull
  @Override
  public String code() {
    return code;
  }

  @Nullable
  @Override
  public List<DirectionsWaypoint> destinations() {
    return destinations;
  }

  @Nullable
  @Override
  public List<DirectionsWaypoint> sources() {
    return sources;
  }

  @Nullable
  @Override
  public List<Double[]> durations() {
    return durations;
  }

  @Override
  public String toString() {
    return "MatrixResponse{"
         + "code=" + code + ", "
         + "destinations=" + destinations + ", "
         + "sources=" + sources + ", "
         + "durations=" + durations
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MatrixResponse) {
      MatrixResponse that = (MatrixResponse) o;
      return (this.code.equals(that.code()))
           && ((this.destinations == null) ? (that.destinations() == null) : this.destinations.equals(that.destinations()))
           && ((this.sources == null) ? (that.sources() == null) : this.sources.equals(that.sources()))
           && ((this.durations == null) ? (that.durations() == null) : this.durations.equals(that.durations()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= code.hashCode();
    h$ *= 1000003;
    h$ ^= (destinations == null) ? 0 : destinations.hashCode();
    h$ *= 1000003;
    h$ ^= (sources == null) ? 0 : sources.hashCode();
    h$ *= 1000003;
    h$ ^= (durations == null) ? 0 : durations.hashCode();
    return h$;
  }

  @Override
  public MatrixResponse.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MatrixResponse.Builder {
    private String code;
    private List<DirectionsWaypoint> destinations;
    private List<DirectionsWaypoint> sources;
    private List<Double[]> durations;
    Builder() {
    }
    private Builder(MatrixResponse source) {
      this.code = source.code();
      this.destinations = source.destinations();
      this.sources = source.sources();
      this.durations = source.durations();
    }
    @Override
    public MatrixResponse.Builder code(String code) {
      if (code == null) {
        throw new NullPointerException("Null code");
      }
      this.code = code;
      return this;
    }
    @Override
    public MatrixResponse.Builder destinations(@Nullable List<DirectionsWaypoint> destinations) {
      this.destinations = destinations;
      return this;
    }
    @Override
    public MatrixResponse.Builder sources(@Nullable List<DirectionsWaypoint> sources) {
      this.sources = sources;
      return this;
    }
    @Override
    public MatrixResponse.Builder durations(@Nullable List<Double[]> durations) {
      this.durations = durations;
      return this;
    }
    @Override
    public MatrixResponse build() {
      String missing = "";
      if (this.code == null) {
        missing += " code";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MatrixResponse(
          this.code,
          this.destinations,
          this.sources,
          this.durations);
    }
  }

}
