package com.airbnb.android.react.lottie;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import org.json.JSONObject;

public class LottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> {
    private static final String TAG = "LottieAnimationViewManager";

    public String getName() {
        return "LottieAnimationView";
    }

    LottieAnimationViewManager() {
    }

    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of("play", 1, "reset", 2);
    }

    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.builder().put("VERSION", 1).build();
    }

    public LottieAnimationView createViewInstance(ThemedReactContext themedReactContext) {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(themedReactContext);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return lottieAnimationView;
    }

    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(LottieAnimationView lottieAnimationView, boolean z) {
        lottieAnimationView.enableMergePathsForKitKatAndAbove(z);
    }

    @ReactProp(name = "hardwareAccelerationAndroid")
    public void setHardwareAcceleration(LottieAnimationView lottieAnimationView, boolean z) {
        lottieAnimationView.useHardwareAcceleration(z);
    }

    @ReactProp(name = "imageAssetsFolder")
    public void setImageAssetsFolder(LottieAnimationView lottieAnimationView, String str) {
        lottieAnimationView.setImageAssetsFolder(str);
    }

    @ReactProp(name = "loop")
    public void setLoop(LottieAnimationView lottieAnimationView, boolean z) {
        lottieAnimationView.loop(z);
    }

    @ReactProp(name = "progress")
    public void setProgress(LottieAnimationView lottieAnimationView, float f2) {
        lottieAnimationView.setProgress(f2);
    }

    @ReactProp(name = "sourceName")
    public void setSourceName(LottieAnimationView lottieAnimationView, String str) {
        lottieAnimationView.setAnimation(str);
    }

    @ReactProp(name = "speed")
    public void setSpeed(LottieAnimationView lottieAnimationView, double d2) {
        lottieAnimationView.setSpeed((float) d2);
    }

    @ReactProp(name = "sourceJson")
    public void setSourceJson(LottieAnimationView lottieAnimationView, String str) {
        try {
            lottieAnimationView.setAnimation(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(LottieAnimationView lottieAnimationView, String str) {
        if ("cover".equals(str)) {
            lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if ("contain".equals(str)) {
            lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else {
            if ("center".equals(str)) {
                lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER);
            }
        }
    }

    public void receiveCommand(final LottieAnimationView lottieAnimationView, int i, final ReadableArray readableArray) {
        switch (i) {
            case 1:
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        int i = readableArray.getInt(0);
                        int i2 = readableArray.getInt(1);
                        if (!(i == -1 || i2 == -1)) {
                            lottieAnimationView.setMinAndMaxFrame(readableArray.getInt(0), readableArray.getInt(1));
                        }
                        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
                            lottieAnimationView.setProgress(0.0f);
                            lottieAnimationView.playAnimation();
                        }
                    }
                });
                return;
            case 2:
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
                            lottieAnimationView.cancelAnimation();
                            lottieAnimationView.setProgress(0.0f);
                        }
                    }
                });
                break;
        }
    }
}
