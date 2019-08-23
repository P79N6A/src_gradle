

package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_VoiceInstructions extends VoiceInstructions {

  private final Double distanceAlongGeometry;

  private final String announcement;

  private final String ssmlAnnouncement;

  $AutoValue_VoiceInstructions(
      @Nullable Double distanceAlongGeometry,
      @Nullable String announcement,
      @Nullable String ssmlAnnouncement) {
    this.distanceAlongGeometry = distanceAlongGeometry;
    this.announcement = announcement;
    this.ssmlAnnouncement = ssmlAnnouncement;
  }

  @Nullable
  @Override
  public Double distanceAlongGeometry() {
    return distanceAlongGeometry;
  }

  @Nullable
  @Override
  public String announcement() {
    return announcement;
  }

  @Nullable
  @Override
  public String ssmlAnnouncement() {
    return ssmlAnnouncement;
  }

  @Override
  public String toString() {
    return "VoiceInstructions{"
         + "distanceAlongGeometry=" + distanceAlongGeometry + ", "
         + "announcement=" + announcement + ", "
         + "ssmlAnnouncement=" + ssmlAnnouncement
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VoiceInstructions) {
      VoiceInstructions that = (VoiceInstructions) o;
      return ((this.distanceAlongGeometry == null) ? (that.distanceAlongGeometry() == null) : this.distanceAlongGeometry.equals(that.distanceAlongGeometry()))
           && ((this.announcement == null) ? (that.announcement() == null) : this.announcement.equals(that.announcement()))
           && ((this.ssmlAnnouncement == null) ? (that.ssmlAnnouncement() == null) : this.ssmlAnnouncement.equals(that.ssmlAnnouncement()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (distanceAlongGeometry == null) ? 0 : distanceAlongGeometry.hashCode();
    h$ *= 1000003;
    h$ ^= (announcement == null) ? 0 : announcement.hashCode();
    h$ *= 1000003;
    h$ ^= (ssmlAnnouncement == null) ? 0 : ssmlAnnouncement.hashCode();
    return h$;
  }

  @Override
  public VoiceInstructions.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends VoiceInstructions.Builder {
    private Double distanceAlongGeometry;
    private String announcement;
    private String ssmlAnnouncement;
    Builder() {
    }
    private Builder(VoiceInstructions source) {
      this.distanceAlongGeometry = source.distanceAlongGeometry();
      this.announcement = source.announcement();
      this.ssmlAnnouncement = source.ssmlAnnouncement();
    }
    @Override
    public VoiceInstructions.Builder distanceAlongGeometry(Double distanceAlongGeometry) {
      this.distanceAlongGeometry = distanceAlongGeometry;
      return this;
    }
    @Override
    public VoiceInstructions.Builder announcement(String announcement) {
      this.announcement = announcement;
      return this;
    }
    @Override
    public VoiceInstructions.Builder ssmlAnnouncement(String ssmlAnnouncement) {
      this.ssmlAnnouncement = ssmlAnnouncement;
      return this;
    }
    @Override
    public VoiceInstructions build() {
      return new AutoValue_VoiceInstructions(
          this.distanceAlongGeometry,
          this.announcement,
          this.ssmlAnnouncement);
    }
  }

}
