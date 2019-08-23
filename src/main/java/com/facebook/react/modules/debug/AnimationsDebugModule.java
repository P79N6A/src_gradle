package com.facebook.react.modules.debug;

import android.os.Build;
import android.widget.Toast;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.ss.android.ugc.aweme.utils.eq;
import java.util.Locale;
import javax.annotation.Nullable;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

@ReactModule(name = "AnimationsDebugModule")
public class AnimationsDebugModule extends ReactContextBaseJavaModule {
    @Nullable
    private final DeveloperSettings mCatalystSettings;
    @Nullable
    private FpsDebugFrameCallback mFrameCallback;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(toast);
            }
            toast.show();
        }
    }

    public String getName() {
        return "AnimationsDebugModule";
    }

    public void onCatalystInstanceDestroy() {
        if (this.mFrameCallback != null) {
            this.mFrameCallback.stop();
            this.mFrameCallback = null;
        }
    }

    @ReactMethod
    public void startRecordingFps() {
        if (this.mCatalystSettings != null && this.mCatalystSettings.isAnimationFpsDebugEnabled()) {
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new FpsDebugFrameCallback(ChoreographerCompat.getInstance(), getReactApplicationContext());
                this.mFrameCallback.startAndRecordFpsAtEachFrame();
                return;
            }
            throw new JSApplicationCausedNativeException("Already recording FPS!");
        }
    }

    @ReactMethod
    public void stopRecordingFps(double d2) {
        if (this.mFrameCallback != null) {
            this.mFrameCallback.stop();
            FpsDebugFrameCallback.FpsInfo fpsInfo = this.mFrameCallback.getFpsInfo((long) d2);
            if (fpsInfo == null) {
                Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
            } else {
                String format = String.format(Locale.US, "FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(fpsInfo.fps), Integer.valueOf(fpsInfo.totalFrames), Integer.valueOf(fpsInfo.totalExpectedFrames)});
                String format2 = String.format(Locale.US, "JS FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(fpsInfo.jsFps), Integer.valueOf(fpsInfo.totalJsFrames), Integer.valueOf(fpsInfo.totalExpectedFrames)});
                String str = format + "\n" + format2 + "\nTotal Time MS: " + String.format(Locale.US, "%d", new Object[]{Integer.valueOf(fpsInfo.totalTimeMs)});
                FLog.d("ReactNative", str);
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(getReactApplicationContext(), str, 1));
            }
            this.mFrameCallback = null;
        }
    }

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, DeveloperSettings developerSettings) {
        super(reactApplicationContext);
        this.mCatalystSettings = developerSettings;
    }
}
