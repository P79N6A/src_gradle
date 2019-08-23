

package com.mapbox.api.directions.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_StepManeuver extends StepManeuver {

  private final double[] rawLocation;

  private final Double bearingBefore;

  private final Double bearingAfter;

  private final String instruction;

  private final String type;

  private final String modifier;

  private final Integer exit;

  $AutoValue_StepManeuver(
      double[] rawLocation,
      @Nullable Double bearingBefore,
      @Nullable Double bearingAfter,
      @Nullable String instruction,
      @Nullable String type,
      @Nullable String modifier,
      @Nullable Integer exit) {
    if (rawLocation == null) {
      throw new NullPointerException("Null rawLocation");
    }
    this.rawLocation = rawLocation;
    this.bearingBefore = bearingBefore;
    this.bearingAfter = bearingAfter;
    this.instruction = instruction;
    this.type = type;
    this.modifier = modifier;
    this.exit = exit;
  }

  @NonNull
  @SerializedName(value = "location")
  @SuppressWarnings(value = {"mutable", "WeakerAccess"})
  @Override
  protected double[] rawLocation() {
    return rawLocation;
  }

  @Nullable
  @SerializedName(value = "bearing_before")
  @Override
  public Double bearingBefore() {
    return bearingBefore;
  }

  @Nullable
  @SerializedName(value = "bearing_after")
  @Override
  public Double bearingAfter() {
    return bearingAfter;
  }

  @Nullable
  @Override
  public String instruction() {
    return instruction;
  }

  @Nullable
  @Override
  public String type() {
    return type;
  }

  @Nullable
  @Override
  public String modifier() {
    return modifier;
  }

  @Nullable
  @Override
  public Integer exit() {
    return exit;
  }

  @Override
  public String toString() {
    return "StepManeuver{"
         + "rawLocation=" + Arrays.toString(rawLocation) + ", "
         + "bearingBefore=" + bearingBefore + ", "
         + "bearingAfter=" + bearingAfter + ", "
         + "instruction=" + instruction + ", "
         + "type=" + type + ", "
         + "modifier=" + modifier + ", "
         + "exit=" + exit
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StepManeuver) {
      StepManeuver that = (StepManeuver) o;
      return (Arrays.equals(this.rawLocation, (that instanceof $AutoValue_StepManeuver) ? (($AutoValue_StepManeuver) that).rawLocation : that.rawLocation()))
           && ((this.bearingBefore == null) ? (that.bearingBefore() == null) : this.bearingBefore.equals(that.bearingBefore()))
           && ((this.bearingAfter == null) ? (that.bearingAfter() == null) : this.bearingAfter.equals(that.bearingAfter()))
           && ((this.instruction == null) ? (that.instruction() == null) : this.instruction.equals(that.instruction()))
           && ((this.type == null) ? (that.type() == null) : this.type.equals(that.type()))
           && ((this.modifier == null) ? (that.modifier() == null) : this.modifier.equals(that.modifier()))
           && ((this.exit == null) ? (that.exit() == null) : this.exit.equals(that.exit()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= Arrays.hashCode(rawLocation);
    h$ *= 1000003;
    h$ ^= (bearingBefore == null) ? 0 : bearingBefore.hashCode();
    h$ *= 1000003;
    h$ ^= (bearingAfter == null) ? 0 : bearingAfter.hashCode();
    h$ *= 1000003;
    h$ ^= (instruction == null) ? 0 : instruction.hashCode();
    h$ *= 1000003;
    h$ ^= (type == null) ? 0 : type.hashCode();
    h$ *= 1000003;
    h$ ^= (modifier == null) ? 0 : modifier.hashCode();
    h$ *= 1000003;
    h$ ^= (exit == null) ? 0 : exit.hashCode();
    return h$;
  }

  @Override
  public StepManeuver.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends StepManeuver.Builder {
    private double[] rawLocation;
    private Double bearingBefore;
    private Double bearingAfter;
    private String instruction;
    private String type;
    private String modifier;
    private Integer exit;
    Builder() {
    }
    private Builder(StepManeuver source) {
      this.rawLocation = source.rawLocation();
      this.bearingBefore = source.bearingBefore();
      this.bearingAfter = source.bearingAfter();
      this.instruction = source.instruction();
      this.type = source.type();
      this.modifier = source.modifier();
      this.exit = source.exit();
    }
    @Override
    public StepManeuver.Builder rawLocation(double[] rawLocation) {
      if (rawLocation == null) {
        throw new NullPointerException("Null rawLocation");
      }
      this.rawLocation = rawLocation;
      return this;
    }
    @Override
    public StepManeuver.Builder bearingBefore(@Nullable Double bearingBefore) {
      this.bearingBefore = bearingBefore;
      return this;
    }
    @Override
    public StepManeuver.Builder bearingAfter(@Nullable Double bearingAfter) {
      this.bearingAfter = bearingAfter;
      return this;
    }
    @Override
    public StepManeuver.Builder instruction(@Nullable String instruction) {
      this.instruction = instruction;
      return this;
    }
    @Override
    public StepManeuver.Builder type(@Nullable String type) {
      this.type = type;
      return this;
    }
    @Override
    public StepManeuver.Builder modifier(@Nullable String modifier) {
      this.modifier = modifier;
      return this;
    }
    @Override
    public StepManeuver.Builder exit(@Nullable Integer exit) {
      this.exit = exit;
      return this;
    }
    @Override
    public StepManeuver build() {
      String missing = "";
      if (this.rawLocation == null) {
        missing += " rawLocation";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_StepManeuver(
          this.rawLocation,
          this.bearingBefore,
          this.bearingAfter,
          this.instruction,
          this.type,
          this.modifier,
          this.exit);
    }
  }

}
