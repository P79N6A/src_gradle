

package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_DirectionsError extends DirectionsError {

  private final String code;

  private final String message;

  $AutoValue_DirectionsError(
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
    return "DirectionsError{"
         + "code=" + code + ", "
         + "message=" + message
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DirectionsError) {
      DirectionsError that = (DirectionsError) o;
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

  @Override
  public DirectionsError.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends DirectionsError.Builder {
    private String code;
    private String message;
    Builder() {
    }
    private Builder(DirectionsError source) {
      this.code = source.code();
      this.message = source.message();
    }
    @Override
    public DirectionsError.Builder code(String code) {
      this.code = code;
      return this;
    }
    @Override
    public DirectionsError.Builder message(String message) {
      this.message = message;
      return this;
    }
    @Override
    public DirectionsError build() {
      return new AutoValue_DirectionsError(
          this.code,
          this.message);
    }
  }

}
