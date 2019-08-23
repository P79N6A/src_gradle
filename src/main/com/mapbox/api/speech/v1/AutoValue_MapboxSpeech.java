

package com.mapbox.api.speech.v1;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import javax.annotation.Generated;
import okhttp3.Cache;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapboxSpeech extends MapboxSpeech {

  private final String language;

  private final String textType;

  private final String outputType;

  private final Cache cache;

  private final String accessToken;

  private final String instruction;

  private final String baseUrl;

  private AutoValue_MapboxSpeech(
      @Nullable String language,
      @Nullable String textType,
      @Nullable String outputType,
      @Nullable Cache cache,
      String accessToken,
      String instruction,
      String baseUrl) {
    this.language = language;
    this.textType = textType;
    this.outputType = outputType;
    this.cache = cache;
    this.accessToken = accessToken;
    this.instruction = instruction;
    this.baseUrl = baseUrl;
  }

  @Nullable
  @Override
  String language() {
    return language;
  }

  @Nullable
  @Override
  String textType() {
    return textType;
  }

  @Nullable
  @Override
  String outputType() {
    return outputType;
  }

  @Nullable
  @Override
  Cache cache() {
    return cache;
  }

  @NonNull
  @Override
  String accessToken() {
    return accessToken;
  }

  @NonNull
  @Override
  String instruction() {
    return instruction;
  }

  @Override
  protected String baseUrl() {
    return baseUrl;
  }

  @Override
  public String toString() {
    return "MapboxSpeech{"
         + "language=" + language + ", "
         + "textType=" + textType + ", "
         + "outputType=" + outputType + ", "
         + "cache=" + cache + ", "
         + "accessToken=" + accessToken + ", "
         + "instruction=" + instruction + ", "
         + "baseUrl=" + baseUrl
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxSpeech) {
      MapboxSpeech that = (MapboxSpeech) o;
      return ((this.language == null) ? (that.language() == null) : this.language.equals(that.language()))
           && ((this.textType == null) ? (that.textType() == null) : this.textType.equals(that.textType()))
           && ((this.outputType == null) ? (that.outputType() == null) : this.outputType.equals(that.outputType()))
           && ((this.cache == null) ? (that.cache() == null) : this.cache.equals(that.cache()))
           && (this.accessToken.equals(that.accessToken()))
           && (this.instruction.equals(that.instruction()))
           && (this.baseUrl.equals(that.baseUrl()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (language == null) ? 0 : language.hashCode();
    h$ *= 1000003;
    h$ ^= (textType == null) ? 0 : textType.hashCode();
    h$ *= 1000003;
    h$ ^= (outputType == null) ? 0 : outputType.hashCode();
    h$ *= 1000003;
    h$ ^= (cache == null) ? 0 : cache.hashCode();
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= instruction.hashCode();
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    return h$;
  }

  static final class Builder extends MapboxSpeech.Builder {
    private String language;
    private String textType;
    private String outputType;
    private Cache cache;
    private String accessToken;
    private String instruction;
    private String baseUrl;
    Builder() {
    }
    @Override
    public MapboxSpeech.Builder language(String language) {
      this.language = language;
      return this;
    }
    @Override
    public MapboxSpeech.Builder textType(String textType) {
      this.textType = textType;
      return this;
    }
    @Override
    public MapboxSpeech.Builder outputType(String outputType) {
      this.outputType = outputType;
      return this;
    }
    @Override
    public MapboxSpeech.Builder cache(Cache cache) {
      this.cache = cache;
      return this;
    }
    @Override
    public MapboxSpeech.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public MapboxSpeech.Builder instruction(String instruction) {
      if (instruction == null) {
        throw new NullPointerException("Null instruction");
      }
      this.instruction = instruction;
      return this;
    }
    @Override
    public MapboxSpeech.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    MapboxSpeech autoBuild() {
      String missing = "";
      if (this.accessToken == null) {
        missing += " accessToken";
      }
      if (this.instruction == null) {
        missing += " instruction";
      }
      if (this.baseUrl == null) {
        missing += " baseUrl";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxSpeech(
          this.language,
          this.textType,
          this.outputType,
          this.cache,
          this.accessToken,
          this.instruction,
          this.baseUrl);
    }
  }

}
