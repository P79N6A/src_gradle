package com.brentvatne.react;

import com.brentvatne.react.b;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import javax.annotation.Nullable;

public class ReactVideoViewManager extends SimpleViewManager<b> {
    public String getName() {
        return "RCTVideo";
    }

    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        for (b.a aVar : b.a.values()) {
            builder.put(aVar.toString(), MapBuilder.of("registrationName", aVar.toString()));
        }
        return builder.build();
    }

    @Nullable
    public Map getExportedViewConstants() {
        return MapBuilder.of("ScaleNone", Integer.toString(com.yqritc.scalablevideoview.b.LEFT_TOP.ordinal()), "ScaleToFill", Integer.toString(com.yqritc.scalablevideoview.b.FIT_XY.ordinal()), "ScaleAspectFit", Integer.toString(com.yqritc.scalablevideoview.b.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.toString(com.yqritc.scalablevideoview.b.CENTER_CROP.ordinal()));
    }

    /* access modifiers changed from: protected */
    public b createViewInstance(ThemedReactContext themedReactContext) {
        return new b(themedReactContext);
    }

    public void onDropViewInstance(b bVar) {
        super.onDropViewInstance(bVar);
        if (bVar.f7517d != null) {
            bVar.f7517d.hide();
        }
        if (bVar.m != null) {
            bVar.i = false;
            bVar.a();
        }
        if (bVar.h) {
            bVar.setFullscreen(false);
        }
    }

    @ReactProp(defaultBoolean = false, name = "controls")
    public void setControls(b bVar, boolean z) {
        bVar.setControls(z);
    }

    @ReactProp(defaultBoolean = false, name = "fullscreen")
    public void setFullscreen(b bVar, boolean z) {
        bVar.setFullscreen(z);
    }

    @ReactProp(defaultBoolean = false, name = "muted")
    public void setMuted(b bVar, boolean z) {
        bVar.setMutedModifier(z);
    }

    @ReactProp(defaultBoolean = false, name = "paused")
    public void setPaused(b bVar, boolean z) {
        bVar.setPausedModifier(z);
    }

    @ReactProp(defaultBoolean = false, name = "playInBackground")
    public void setPlayInBackground(b bVar, boolean z) {
        bVar.setPlayInBackground(z);
    }

    @ReactProp(defaultFloat = 250.0f, name = "progressUpdateInterval")
    public void setProgressUpdateInterval(b bVar, float f2) {
        bVar.setProgressUpdateInterval(f2);
    }

    @ReactProp(name = "rate")
    public void setRate(b bVar, float f2) {
        bVar.setRateModifier(f2);
    }

    @ReactProp(defaultBoolean = false, name = "repeat")
    public void setRepeat(b bVar, boolean z) {
        bVar.setRepeatModifier(z);
    }

    @ReactProp(name = "stereoPan")
    public void setStereoPan(b bVar, float f2) {
        bVar.setStereoPan(f2);
    }

    @ReactProp(defaultFloat = 1.0f, name = "volume")
    public void setVolume(b bVar, float f2) {
        bVar.setVolumeModifier(f2);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(b bVar, String str) {
        bVar.setResizeModeModifier(com.yqritc.scalablevideoview.b.values()[Integer.parseInt(str)]);
    }

    @ReactProp(name = "seek")
    public void setSeek(b bVar, float f2) {
        bVar.seekTo(Math.round(f2 * 1000.0f));
    }

    @ReactProp(name = "src")
    public void setSrc(b bVar, @Nullable ReadableMap readableMap) {
        int i;
        int i2;
        int i3 = readableMap.getInt("mainVer");
        int i4 = readableMap.getInt("patchVer");
        if (i3 < 0) {
            i = 0;
        } else {
            i = i3;
        }
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i > 0) {
            bVar.a(readableMap.getString("uri"), readableMap.getString("type"), readableMap.getBoolean("isNetwork"), readableMap.getBoolean("isAsset"), readableMap.getMap("requestHeaders"), i, i2);
            return;
        }
        bVar.a(readableMap.getString("uri"), readableMap.getString("type"), readableMap.getBoolean("isNetwork"), readableMap.getBoolean("isAsset"), readableMap.getMap("requestHeaders"));
    }
}
