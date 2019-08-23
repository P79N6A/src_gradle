package com.facebook.react.modules.debug;

import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.Nullable;

public class FpsDebugFrameCallback extends ChoreographerCompat.FrameCallback {
    private int m4PlusFrameStutters;
    private final ChoreographerCompat mChoreographer;
    private final DidJSUpdateUiDuringFrameDetector mDidJSUpdateUiDuringFrameDetector;
    private int mExpectedNumFramesPrev;
    private long mFirstFrameTime = -1;
    private boolean mIsRecordingFpsInfoAtEachFrame;
    private long mLastFrameTime = -1;
    private int mNumFrameCallbacks;
    private int mNumFrameCallbacksWithBatchDispatches;
    private final ReactContext mReactContext;
    private boolean mShouldStop;
    @Nullable
    private TreeMap<Long, FpsInfo> mTimeToFps;
    private final UIManagerModule mUIManagerModule;

    public static class FpsInfo {
        public final double fps;
        public final double jsFps;
        public final int total4PlusFrameStutters;
        public final int totalExpectedFrames;
        public final int totalFrames;
        public final int totalJsFrames;
        public final int totalTimeMs;

        public FpsInfo(int i, int i2, int i3, int i4, double d2, double d3, int i5) {
            this.totalFrames = i;
            this.totalJsFrames = i2;
            this.totalExpectedFrames = i3;
            this.total4PlusFrameStutters = i4;
            this.fps = d2;
            this.jsFps = d3;
            this.totalTimeMs = i5;
        }
    }

    public int get4PlusFrameStutters() {
        return this.m4PlusFrameStutters;
    }

    public int getNumFrames() {
        return this.mNumFrameCallbacks - 1;
    }

    public int getNumJSFrames() {
        return this.mNumFrameCallbacksWithBatchDispatches - 1;
    }

    public void startAndRecordFpsAtEachFrame() {
        this.mTimeToFps = new TreeMap<>();
        this.mIsRecordingFpsInfoAtEachFrame = true;
        start();
    }

    public int getExpectedNumFrames() {
        double totalTimeMS = (double) getTotalTimeMS();
        Double.isNaN(totalTimeMS);
        return (int) ((totalTimeMS / 16.9d) + 1.0d);
    }

    public int getTotalTimeMS() {
        double d2 = (double) this.mLastFrameTime;
        double d3 = (double) this.mFirstFrameTime;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return ((int) (d2 - d3)) / 1000000;
    }

    public void reset() {
        this.mFirstFrameTime = -1;
        this.mLastFrameTime = -1;
        this.mNumFrameCallbacks = 0;
        this.m4PlusFrameStutters = 0;
        this.mNumFrameCallbacksWithBatchDispatches = 0;
        this.mIsRecordingFpsInfoAtEachFrame = false;
        this.mTimeToFps = null;
    }

    public void start() {
        this.mShouldStop = false;
        this.mReactContext.getCatalystInstance().addBridgeIdleDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        this.mUIManagerModule.setViewHierarchyUpdateDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        this.mChoreographer.postFrameCallback(this);
    }

    public void stop() {
        this.mShouldStop = true;
        this.mReactContext.getCatalystInstance().removeBridgeIdleDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        this.mUIManagerModule.setViewHierarchyUpdateDebugListener(null);
    }

    public double getFPS() {
        if (this.mLastFrameTime == this.mFirstFrameTime) {
            return 0.0d;
        }
        double numFrames = (double) getNumFrames();
        Double.isNaN(numFrames);
        double d2 = (double) (this.mLastFrameTime - this.mFirstFrameTime);
        Double.isNaN(d2);
        return (numFrames * 1.0E9d) / d2;
    }

    public double getJSFPS() {
        if (this.mLastFrameTime == this.mFirstFrameTime) {
            return 0.0d;
        }
        double numJSFrames = (double) getNumJSFrames();
        Double.isNaN(numJSFrames);
        double d2 = (double) (this.mLastFrameTime - this.mFirstFrameTime);
        Double.isNaN(d2);
        return (numJSFrames * 1.0E9d) / d2;
    }

    @Nullable
    public FpsInfo getFpsInfo(long j) {
        a.a(this.mTimeToFps, "FPS was not recorded at each frame!");
        Map.Entry<Long, FpsInfo> floorEntry = this.mTimeToFps.floorEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }

    public void doFrame(long j) {
        if (!this.mShouldStop) {
            if (this.mFirstFrameTime == -1) {
                this.mFirstFrameTime = j;
            }
            long j2 = this.mLastFrameTime;
            this.mLastFrameTime = j;
            if (this.mDidJSUpdateUiDuringFrameDetector.getDidJSHitFrameAndCleanup(j2, j)) {
                this.mNumFrameCallbacksWithBatchDispatches++;
            }
            this.mNumFrameCallbacks++;
            int expectedNumFrames = getExpectedNumFrames();
            if ((expectedNumFrames - this.mExpectedNumFramesPrev) - 1 >= 4) {
                this.m4PlusFrameStutters++;
            }
            if (this.mIsRecordingFpsInfoAtEachFrame) {
                a.b(this.mTimeToFps);
                FpsInfo fpsInfo = new FpsInfo(getNumFrames(), getNumJSFrames(), expectedNumFrames, this.m4PlusFrameStutters, getFPS(), getJSFPS(), getTotalTimeMS());
                this.mTimeToFps.put(Long.valueOf(System.currentTimeMillis()), fpsInfo);
            }
            this.mExpectedNumFramesPrev = expectedNumFrames;
            this.mChoreographer.postFrameCallback(this);
        }
    }

    public FpsDebugFrameCallback(ChoreographerCompat choreographerCompat, ReactContext reactContext) {
        this.mChoreographer = choreographerCompat;
        this.mReactContext = reactContext;
        this.mUIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.mDidJSUpdateUiDuringFrameDetector = new DidJSUpdateUiDuringFrameDetector();
    }
}
