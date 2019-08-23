

package com.mapbox.api.directions.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_LegStep extends LegStep {

  private final double distance;

  private final double duration;

  private final String geometry;

  private final String name;

  private final String ref;

  private final String destinations;

  private final String mode;

  private final String pronunciation;

  private final String rotaryName;

  private final String rotaryPronunciation;

  private final StepManeuver maneuver;

  private final List<VoiceInstructions> voiceInstructions;

  private final List<BannerInstructions> bannerInstructions;

  private final String drivingSide;

  private final double weight;

  private final List<StepIntersection> intersections;

  private final String exits;

  $AutoValue_LegStep(
      double distance,
      double duration,
      @Nullable String geometry,
      @Nullable String name,
      @Nullable String ref,
      @Nullable String destinations,
      String mode,
      @Nullable String pronunciation,
      @Nullable String rotaryName,
      @Nullable String rotaryPronunciation,
      StepManeuver maneuver,
      @Nullable List<VoiceInstructions> voiceInstructions,
      @Nullable List<BannerInstructions> bannerInstructions,
      @Nullable String drivingSide,
      double weight,
      @Nullable List<StepIntersection> intersections,
      @Nullable String exits) {
    this.distance = distance;
    this.duration = duration;
    this.geometry = geometry;
    this.name = name;
    this.ref = ref;
    this.destinations = destinations;
    if (mode == null) {
      throw new NullPointerException("Null mode");
    }
    this.mode = mode;
    this.pronunciation = pronunciation;
    this.rotaryName = rotaryName;
    this.rotaryPronunciation = rotaryPronunciation;
    if (maneuver == null) {
      throw new NullPointerException("Null maneuver");
    }
    this.maneuver = maneuver;
    this.voiceInstructions = voiceInstructions;
    this.bannerInstructions = bannerInstructions;
    this.drivingSide = drivingSide;
    this.weight = weight;
    this.intersections = intersections;
    this.exits = exits;
  }

  @Override
  public double distance() {
    return distance;
  }

  @Override
  public double duration() {
    return duration;
  }

  @Nullable
  @Override
  public String geometry() {
    return geometry;
  }

  @Nullable
  @Override
  public String name() {
    return name;
  }

  @Nullable
  @Override
  public String ref() {
    return ref;
  }

  @Nullable
  @Override
  public String destinations() {
    return destinations;
  }

  @NonNull
  @Override
  public String mode() {
    return mode;
  }

  @Nullable
  @Override
  public String pronunciation() {
    return pronunciation;
  }

  @Nullable
  @SerializedName(value = "rotary_name")
  @Override
  public String rotaryName() {
    return rotaryName;
  }

  @Nullable
  @SerializedName(value = "rotary_pronunciation")
  @Override
  public String rotaryPronunciation() {
    return rotaryPronunciation;
  }

  @NonNull
  @Override
  public StepManeuver maneuver() {
    return maneuver;
  }

  @Nullable
  @Override
  public List<VoiceInstructions> voiceInstructions() {
    return voiceInstructions;
  }

  @Nullable
  @Override
  public List<BannerInstructions> bannerInstructions() {
    return bannerInstructions;
  }

  @Nullable
  @SerializedName(value = "driving_side")
  @Override
  public String drivingSide() {
    return drivingSide;
  }

  @Override
  public double weight() {
    return weight;
  }

  @Nullable
  @Override
  public List<StepIntersection> intersections() {
    return intersections;
  }

  @Nullable
  @Override
  public String exits() {
    return exits;
  }

  @Override
  public String toString() {
    return "LegStep{"
         + "distance=" + distance + ", "
         + "duration=" + duration + ", "
         + "geometry=" + geometry + ", "
         + "name=" + name + ", "
         + "ref=" + ref + ", "
         + "destinations=" + destinations + ", "
         + "mode=" + mode + ", "
         + "pronunciation=" + pronunciation + ", "
         + "rotaryName=" + rotaryName + ", "
         + "rotaryPronunciation=" + rotaryPronunciation + ", "
         + "maneuver=" + maneuver + ", "
         + "voiceInstructions=" + voiceInstructions + ", "
         + "bannerInstructions=" + bannerInstructions + ", "
         + "drivingSide=" + drivingSide + ", "
         + "weight=" + weight + ", "
         + "intersections=" + intersections + ", "
         + "exits=" + exits
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LegStep) {
      LegStep that = (LegStep) o;
      return (Double.doubleToLongBits(this.distance) == Double.doubleToLongBits(that.distance()))
           && (Double.doubleToLongBits(this.duration) == Double.doubleToLongBits(that.duration()))
           && ((this.geometry == null) ? (that.geometry() == null) : this.geometry.equals(that.geometry()))
           && ((this.name == null) ? (that.name() == null) : this.name.equals(that.name()))
           && ((this.ref == null) ? (that.ref() == null) : this.ref.equals(that.ref()))
           && ((this.destinations == null) ? (that.destinations() == null) : this.destinations.equals(that.destinations()))
           && (this.mode.equals(that.mode()))
           && ((this.pronunciation == null) ? (that.pronunciation() == null) : this.pronunciation.equals(that.pronunciation()))
           && ((this.rotaryName == null) ? (that.rotaryName() == null) : this.rotaryName.equals(that.rotaryName()))
           && ((this.rotaryPronunciation == null) ? (that.rotaryPronunciation() == null) : this.rotaryPronunciation.equals(that.rotaryPronunciation()))
           && (this.maneuver.equals(that.maneuver()))
           && ((this.voiceInstructions == null) ? (that.voiceInstructions() == null) : this.voiceInstructions.equals(that.voiceInstructions()))
           && ((this.bannerInstructions == null) ? (that.bannerInstructions() == null) : this.bannerInstructions.equals(that.bannerInstructions()))
           && ((this.drivingSide == null) ? (that.drivingSide() == null) : this.drivingSide.equals(that.drivingSide()))
           && (Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(that.weight()))
           && ((this.intersections == null) ? (that.intersections() == null) : this.intersections.equals(that.intersections()))
           && ((this.exits == null) ? (that.exits() == null) : this.exits.equals(that.exits()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(distance) >>> 32) ^ Double.doubleToLongBits(distance));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(duration) >>> 32) ^ Double.doubleToLongBits(duration));
    h$ *= 1000003;
    h$ ^= (geometry == null) ? 0 : geometry.hashCode();
    h$ *= 1000003;
    h$ ^= (name == null) ? 0 : name.hashCode();
    h$ *= 1000003;
    h$ ^= (ref == null) ? 0 : ref.hashCode();
    h$ *= 1000003;
    h$ ^= (destinations == null) ? 0 : destinations.hashCode();
    h$ *= 1000003;
    h$ ^= mode.hashCode();
    h$ *= 1000003;
    h$ ^= (pronunciation == null) ? 0 : pronunciation.hashCode();
    h$ *= 1000003;
    h$ ^= (rotaryName == null) ? 0 : rotaryName.hashCode();
    h$ *= 1000003;
    h$ ^= (rotaryPronunciation == null) ? 0 : rotaryPronunciation.hashCode();
    h$ *= 1000003;
    h$ ^= maneuver.hashCode();
    h$ *= 1000003;
    h$ ^= (voiceInstructions == null) ? 0 : voiceInstructions.hashCode();
    h$ *= 1000003;
    h$ ^= (bannerInstructions == null) ? 0 : bannerInstructions.hashCode();
    h$ *= 1000003;
    h$ ^= (drivingSide == null) ? 0 : drivingSide.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(weight) >>> 32) ^ Double.doubleToLongBits(weight));
    h$ *= 1000003;
    h$ ^= (intersections == null) ? 0 : intersections.hashCode();
    h$ *= 1000003;
    h$ ^= (exits == null) ? 0 : exits.hashCode();
    return h$;
  }

  @Override
  public LegStep.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends LegStep.Builder {
    private Double distance;
    private Double duration;
    private String geometry;
    private String name;
    private String ref;
    private String destinations;
    private String mode;
    private String pronunciation;
    private String rotaryName;
    private String rotaryPronunciation;
    private StepManeuver maneuver;
    private List<VoiceInstructions> voiceInstructions;
    private List<BannerInstructions> bannerInstructions;
    private String drivingSide;
    private Double weight;
    private List<StepIntersection> intersections;
    private String exits;
    Builder() {
    }
    private Builder(LegStep source) {
      this.distance = source.distance();
      this.duration = source.duration();
      this.geometry = source.geometry();
      this.name = source.name();
      this.ref = source.ref();
      this.destinations = source.destinations();
      this.mode = source.mode();
      this.pronunciation = source.pronunciation();
      this.rotaryName = source.rotaryName();
      this.rotaryPronunciation = source.rotaryPronunciation();
      this.maneuver = source.maneuver();
      this.voiceInstructions = source.voiceInstructions();
      this.bannerInstructions = source.bannerInstructions();
      this.drivingSide = source.drivingSide();
      this.weight = source.weight();
      this.intersections = source.intersections();
      this.exits = source.exits();
    }
    @Override
    public LegStep.Builder distance(double distance) {
      this.distance = distance;
      return this;
    }
    @Override
    public LegStep.Builder duration(double duration) {
      this.duration = duration;
      return this;
    }
    @Override
    public LegStep.Builder geometry(@Nullable String geometry) {
      this.geometry = geometry;
      return this;
    }
    @Override
    public LegStep.Builder name(@Nullable String name) {
      this.name = name;
      return this;
    }
    @Override
    public LegStep.Builder ref(@Nullable String ref) {
      this.ref = ref;
      return this;
    }
    @Override
    public LegStep.Builder destinations(@Nullable String destinations) {
      this.destinations = destinations;
      return this;
    }
    @Override
    public LegStep.Builder mode(String mode) {
      if (mode == null) {
        throw new NullPointerException("Null mode");
      }
      this.mode = mode;
      return this;
    }
    @Override
    public LegStep.Builder pronunciation(@Nullable String pronunciation) {
      this.pronunciation = pronunciation;
      return this;
    }
    @Override
    public LegStep.Builder rotaryName(@Nullable String rotaryName) {
      this.rotaryName = rotaryName;
      return this;
    }
    @Override
    public LegStep.Builder rotaryPronunciation(@Nullable String rotaryPronunciation) {
      this.rotaryPronunciation = rotaryPronunciation;
      return this;
    }
    @Override
    public LegStep.Builder maneuver(StepManeuver maneuver) {
      if (maneuver == null) {
        throw new NullPointerException("Null maneuver");
      }
      this.maneuver = maneuver;
      return this;
    }
    @Override
    public LegStep.Builder voiceInstructions(List<VoiceInstructions> voiceInstructions) {
      this.voiceInstructions = voiceInstructions;
      return this;
    }
    @Override
    public LegStep.Builder bannerInstructions(List<BannerInstructions> bannerInstructions) {
      this.bannerInstructions = bannerInstructions;
      return this;
    }
    @Override
    public LegStep.Builder drivingSide(@Nullable String drivingSide) {
      this.drivingSide = drivingSide;
      return this;
    }
    @Override
    public LegStep.Builder weight(double weight) {
      this.weight = weight;
      return this;
    }
    @Override
    public LegStep.Builder intersections(List<StepIntersection> intersections) {
      this.intersections = intersections;
      return this;
    }
    @Override
    public LegStep.Builder exits(@Nullable String exits) {
      this.exits = exits;
      return this;
    }
    @Override
    public LegStep build() {
      String missing = "";
      if (this.distance == null) {
        missing += " distance";
      }
      if (this.duration == null) {
        missing += " duration";
      }
      if (this.mode == null) {
        missing += " mode";
      }
      if (this.maneuver == null) {
        missing += " maneuver";
      }
      if (this.weight == null) {
        missing += " weight";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_LegStep(
          this.distance,
          this.duration,
          this.geometry,
          this.name,
          this.ref,
          this.destinations,
          this.mode,
          this.pronunciation,
          this.rotaryName,
          this.rotaryPronunciation,
          this.maneuver,
          this.voiceInstructions,
          this.bannerInstructions,
          this.drivingSide,
          this.weight,
          this.intersections,
          this.exits);
    }
  }

}
