

package com.mapbox.api.staticmap.v1;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.api.staticmap.v1.models.StaticMarkerAnnotation;
import com.mapbox.api.staticmap.v1.models.StaticPolylineAnnotation;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Point;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapboxStaticMap extends MapboxStaticMap {

  private final String accessToken;

  private final String baseUrl;

  private final String user;

  private final String styleId;

  private final boolean logo;

  private final boolean attribution;

  private final boolean retina;

  private final Point cameraPoint;

  private final double cameraZoom;

  private final double cameraBearing;

  private final double cameraPitch;

  private final boolean cameraAuto;

  private final String beforeLayer;

  private final int width;

  private final int height;

  private final GeoJson geoJson;

  private final List<StaticMarkerAnnotation> staticMarkerAnnotations;

  private final List<StaticPolylineAnnotation> staticPolylineAnnotations;

  private final int precision;

  private AutoValue_MapboxStaticMap(
      String accessToken,
      String baseUrl,
      String user,
      String styleId,
      boolean logo,
      boolean attribution,
      boolean retina,
      Point cameraPoint,
      double cameraZoom,
      double cameraBearing,
      double cameraPitch,
      boolean cameraAuto,
      @Nullable String beforeLayer,
      int width,
      int height,
      @Nullable GeoJson geoJson,
      @Nullable List<StaticMarkerAnnotation> staticMarkerAnnotations,
      @Nullable List<StaticPolylineAnnotation> staticPolylineAnnotations,
      int precision) {
    this.accessToken = accessToken;
    this.baseUrl = baseUrl;
    this.user = user;
    this.styleId = styleId;
    this.logo = logo;
    this.attribution = attribution;
    this.retina = retina;
    this.cameraPoint = cameraPoint;
    this.cameraZoom = cameraZoom;
    this.cameraBearing = cameraBearing;
    this.cameraPitch = cameraPitch;
    this.cameraAuto = cameraAuto;
    this.beforeLayer = beforeLayer;
    this.width = width;
    this.height = height;
    this.geoJson = geoJson;
    this.staticMarkerAnnotations = staticMarkerAnnotations;
    this.staticPolylineAnnotations = staticPolylineAnnotations;
    this.precision = precision;
  }

  @NonNull
  @Override
  String accessToken() {
    return accessToken;
  }

  @NonNull
  @Override
  String baseUrl() {
    return baseUrl;
  }

  @NonNull
  @Override
  String user() {
    return user;
  }

  @NonNull
  @Override
  String styleId() {
    return styleId;
  }

  @Override
  boolean logo() {
    return logo;
  }

  @Override
  boolean attribution() {
    return attribution;
  }

  @Override
  boolean retina() {
    return retina;
  }

  @NonNull
  @Override
  Point cameraPoint() {
    return cameraPoint;
  }

  @Override
  double cameraZoom() {
    return cameraZoom;
  }

  @Override
  double cameraBearing() {
    return cameraBearing;
  }

  @Override
  double cameraPitch() {
    return cameraPitch;
  }

  @Override
  boolean cameraAuto() {
    return cameraAuto;
  }

  @Nullable
  @Override
  String beforeLayer() {
    return beforeLayer;
  }

  @Override
  int width() {
    return width;
  }

  @Override
  int height() {
    return height;
  }

  @Nullable
  @Override
  GeoJson geoJson() {
    return geoJson;
  }

  @Nullable
  @Override
  List<StaticMarkerAnnotation> staticMarkerAnnotations() {
    return staticMarkerAnnotations;
  }

  @Nullable
  @Override
  List<StaticPolylineAnnotation> staticPolylineAnnotations() {
    return staticPolylineAnnotations;
  }

  @Override
  int precision() {
    return precision;
  }

  @Override
  public String toString() {
    return "MapboxStaticMap{"
         + "accessToken=" + accessToken + ", "
         + "baseUrl=" + baseUrl + ", "
         + "user=" + user + ", "
         + "styleId=" + styleId + ", "
         + "logo=" + logo + ", "
         + "attribution=" + attribution + ", "
         + "retina=" + retina + ", "
         + "cameraPoint=" + cameraPoint + ", "
         + "cameraZoom=" + cameraZoom + ", "
         + "cameraBearing=" + cameraBearing + ", "
         + "cameraPitch=" + cameraPitch + ", "
         + "cameraAuto=" + cameraAuto + ", "
         + "beforeLayer=" + beforeLayer + ", "
         + "width=" + width + ", "
         + "height=" + height + ", "
         + "geoJson=" + geoJson + ", "
         + "staticMarkerAnnotations=" + staticMarkerAnnotations + ", "
         + "staticPolylineAnnotations=" + staticPolylineAnnotations + ", "
         + "precision=" + precision
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxStaticMap) {
      MapboxStaticMap that = (MapboxStaticMap) o;
      return (this.accessToken.equals(that.accessToken()))
           && (this.baseUrl.equals(that.baseUrl()))
           && (this.user.equals(that.user()))
           && (this.styleId.equals(that.styleId()))
           && (this.logo == that.logo())
           && (this.attribution == that.attribution())
           && (this.retina == that.retina())
           && (this.cameraPoint.equals(that.cameraPoint()))
           && (Double.doubleToLongBits(this.cameraZoom) == Double.doubleToLongBits(that.cameraZoom()))
           && (Double.doubleToLongBits(this.cameraBearing) == Double.doubleToLongBits(that.cameraBearing()))
           && (Double.doubleToLongBits(this.cameraPitch) == Double.doubleToLongBits(that.cameraPitch()))
           && (this.cameraAuto == that.cameraAuto())
           && ((this.beforeLayer == null) ? (that.beforeLayer() == null) : this.beforeLayer.equals(that.beforeLayer()))
           && (this.width == that.width())
           && (this.height == that.height())
           && ((this.geoJson == null) ? (that.geoJson() == null) : this.geoJson.equals(that.geoJson()))
           && ((this.staticMarkerAnnotations == null) ? (that.staticMarkerAnnotations() == null) : this.staticMarkerAnnotations.equals(that.staticMarkerAnnotations()))
           && ((this.staticPolylineAnnotations == null) ? (that.staticPolylineAnnotations() == null) : this.staticPolylineAnnotations.equals(that.staticPolylineAnnotations()))
           && (this.precision == that.precision());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    h$ *= 1000003;
    h$ ^= user.hashCode();
    h$ *= 1000003;
    h$ ^= styleId.hashCode();
    h$ *= 1000003;
    h$ ^= logo ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= attribution ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= retina ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= cameraPoint.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(cameraZoom) >>> 32) ^ Double.doubleToLongBits(cameraZoom));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(cameraBearing) >>> 32) ^ Double.doubleToLongBits(cameraBearing));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(cameraPitch) >>> 32) ^ Double.doubleToLongBits(cameraPitch));
    h$ *= 1000003;
    h$ ^= cameraAuto ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (beforeLayer == null) ? 0 : beforeLayer.hashCode();
    h$ *= 1000003;
    h$ ^= width;
    h$ *= 1000003;
    h$ ^= height;
    h$ *= 1000003;
    h$ ^= (geoJson == null) ? 0 : geoJson.hashCode();
    h$ *= 1000003;
    h$ ^= (staticMarkerAnnotations == null) ? 0 : staticMarkerAnnotations.hashCode();
    h$ *= 1000003;
    h$ ^= (staticPolylineAnnotations == null) ? 0 : staticPolylineAnnotations.hashCode();
    h$ *= 1000003;
    h$ ^= precision;
    return h$;
  }

  static final class Builder extends MapboxStaticMap.Builder {
    private String accessToken;
    private String baseUrl;
    private String user;
    private String styleId;
    private Boolean logo;
    private Boolean attribution;
    private Boolean retina;
    private Point cameraPoint;
    private Double cameraZoom;
    private Double cameraBearing;
    private Double cameraPitch;
    private Boolean cameraAuto;
    private String beforeLayer;
    private Integer width;
    private Integer height;
    private GeoJson geoJson;
    private List<StaticMarkerAnnotation> staticMarkerAnnotations;
    private List<StaticPolylineAnnotation> staticPolylineAnnotations;
    private Integer precision;
    Builder() {
    }
    @Override
    public MapboxStaticMap.Builder accessToken(String accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder baseUrl(String baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder user(String user) {
      if (user == null) {
        throw new NullPointerException("Null user");
      }
      this.user = user;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder styleId(String styleId) {
      if (styleId == null) {
        throw new NullPointerException("Null styleId");
      }
      this.styleId = styleId;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder logo(boolean logo) {
      this.logo = logo;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder attribution(boolean attribution) {
      this.attribution = attribution;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder retina(boolean retina) {
      this.retina = retina;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder cameraPoint(@Nullable Point cameraPoint) {
      if (cameraPoint == null) {
        throw new NullPointerException("Null cameraPoint");
      }
      this.cameraPoint = cameraPoint;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder cameraZoom(double cameraZoom) {
      this.cameraZoom = cameraZoom;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder cameraBearing(double cameraBearing) {
      this.cameraBearing = cameraBearing;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder cameraPitch(double cameraPitch) {
      this.cameraPitch = cameraPitch;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder cameraAuto(boolean cameraAuto) {
      this.cameraAuto = cameraAuto;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder beforeLayer(@Nullable String beforeLayer) {
      this.beforeLayer = beforeLayer;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder width(int width) {
      this.width = width;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder height(int height) {
      this.height = height;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder geoJson(@Nullable GeoJson geoJson) {
      this.geoJson = geoJson;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder staticMarkerAnnotations(@Nullable List<StaticMarkerAnnotation> staticMarkerAnnotations) {
      this.staticMarkerAnnotations = staticMarkerAnnotations;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder staticPolylineAnnotations(@Nullable List<StaticPolylineAnnotation> staticPolylineAnnotations) {
      this.staticPolylineAnnotations = staticPolylineAnnotations;
      return this;
    }
    @Override
    public MapboxStaticMap.Builder precision(int precision) {
      this.precision = precision;
      return this;
    }
    @Override
    MapboxStaticMap autoBuild() {
      String missing = "";
      if (this.accessToken == null) {
        missing += " accessToken";
      }
      if (this.baseUrl == null) {
        missing += " baseUrl";
      }
      if (this.user == null) {
        missing += " user";
      }
      if (this.styleId == null) {
        missing += " styleId";
      }
      if (this.logo == null) {
        missing += " logo";
      }
      if (this.attribution == null) {
        missing += " attribution";
      }
      if (this.retina == null) {
        missing += " retina";
      }
      if (this.cameraPoint == null) {
        missing += " cameraPoint";
      }
      if (this.cameraZoom == null) {
        missing += " cameraZoom";
      }
      if (this.cameraBearing == null) {
        missing += " cameraBearing";
      }
      if (this.cameraPitch == null) {
        missing += " cameraPitch";
      }
      if (this.cameraAuto == null) {
        missing += " cameraAuto";
      }
      if (this.width == null) {
        missing += " width";
      }
      if (this.height == null) {
        missing += " height";
      }
      if (this.precision == null) {
        missing += " precision";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxStaticMap(
          this.accessToken,
          this.baseUrl,
          this.user,
          this.styleId,
          this.logo,
          this.attribution,
          this.retina,
          this.cameraPoint,
          this.cameraZoom,
          this.cameraBearing,
          this.cameraPitch,
          this.cameraAuto,
          this.beforeLayer,
          this.width,
          this.height,
          this.geoJson,
          this.staticMarkerAnnotations,
          this.staticPolylineAnnotations,
          this.precision);
    }
  }

}
