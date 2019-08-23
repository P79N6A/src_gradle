

package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MapMatchingError extends MapMatchingError {

  private final String code;

  private final String message;

  $AutoValue_MapMatchingError(
      @Nullable String code,
      @Nullable String message) {
    this.code = code;
    this.message = message;
  }

  @Nullable
  @Override
  public String code() {
    return code;
  }

  @Nullable
  @Override
  public String message() {
    return message;
  }

  @Override
  public String toString() {
    return "MapMatchingError{"
         + "code=" + code + ", "
         + "message=" + message
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapMatchingError) {
      MapMatchingError that = (MapMatchingError) o;
      return ((this.code == null) ? (that.code() == null) : this.code.equals(that.code()))
           && ((this.message == null) ? (that.message() == null) : this.message.equals(that.message()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (code == null) ? 0 : code.hashCode();
    h$ *= 1000003;
    h$ ^= (message == null) ? 0 : message.hashCode();
    return h$;
  }

  static final class Builder extends MapMatchingError.Builder {
    private String code;
    private String message;
    Builder() {
    }
    @Override
    public MapMatchingError.Builder code(String code) {
      this.code = code;
      return this;
    }
    @Override
    public MapMatchingError.Builder message(String message) {
      this.message = message;
      return this;
    }
    @Override
    public MapMatchingError build() {
      return new AutoValue_MapMatchingError(
          this.code,
          this.message);
    }
  }

}
