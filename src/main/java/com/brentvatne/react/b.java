package com.brentvatne.react;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.MediaController;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.yqritc.scalablevideoview.c;
import com.yqritc.scalablevideoview.d;
import com.yqritc.scalablevideoview.e;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

@SuppressLint({"ViewConstructor"})
public final class b extends c implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaController.MediaPlayerControl, LifecycleEventListener {
    private float A = 1.0f;
    private float B = 1.0f;
    private boolean C = false;
    private int D = 0;
    private int E = 0;
    private boolean F = false;

    /* renamed from: a  reason: collision with root package name */
    public RCTEventEmitter f7514a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f7515b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public Runnable f7516c = null;

    /* renamed from: d  reason: collision with root package name */
    public MediaController f7517d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7518e = false;

    /* renamed from: f  reason: collision with root package name */
    public float f7519f = 250.0f;
    public boolean g = false;
    boolean h = false;
    public boolean i = false;
    public int j = 0;
    public int k = 0;
    public boolean l = false;
    private ThemedReactContext o;
    private Handler p = new Handler();
    private String q = null;
    private String r = "mp4";
    private ReadableMap s = null;
    private boolean t = false;
    private boolean u = false;
    private com.yqritc.scalablevideoview.b v = com.yqritc.scalablevideoview.b.LEFT_TOP;
    private boolean w = false;
    private boolean x = false;
    private float y = 1.0f;
    private float z = 0.0f;

    public enum a {
        EVENT_LOAD_START("onVideoLoadStart"),
        EVENT_LOAD("onVideoLoad"),
        EVENT_ERROR("onVideoError"),
        EVENT_PROGRESS("onVideoProgress"),
        EVENT_SEEK("onVideoSeek"),
        EVENT_END("onVideoEnd"),
        EVENT_STALLED("onPlaybackStalled"),
        EVENT_RESUME("onPlaybackResume"),
        EVENT_READY_FOR_DISPLAY("onReadyForDisplay"),
        EVENT_FULLSCREEN_WILL_PRESENT("onVideoFullscreenPlayerWillPresent"),
        EVENT_FULLSCREEN_DID_PRESENT("onVideoFullscreenPlayerDidPresent"),
        EVENT_FULLSCREEN_WILL_DISMISS("onVideoFullscreenPlayerWillDismiss"),
        EVENT_FULLSCREEN_DID_DISMISS("onVideoFullscreenPlayerDidDismiss");
        
        private final String mName;

        public final String toString() {
            return this.mName;
        }

        private a(String str) {
            this.mName = str;
        }
    }

    public final boolean canPause() {
        return true;
    }

    public final boolean canSeekBackward() {
        return true;
    }

    public final boolean canSeekForward() {
        return true;
    }

    public final int getAudioSessionId() {
        return 0;
    }

    public final int getBufferPercentage() {
        return 0;
    }

    public final void onHostDestroy() {
    }

    private void c() {
        if (this.f7517d == null) {
            this.f7517d = new MediaController(getContext());
        }
    }

    public final void onDetachedFromWindow() {
        this.i = false;
        super.onDetachedFromWindow();
        setKeepScreenOn(false);
    }

    private float d() {
        return new BigDecimal((double) (this.y * (1.0f - Math.abs(this.z)))).setScale(1, 4).floatValue();
    }

    public final void onHostPause() {
        if (this.i && !this.f7518e && !this.C) {
            this.g = true;
            this.m.pause();
        }
    }

    public final void onHostResume() {
        this.g = false;
        if (this.i && !this.C && !this.f7518e) {
            new Handler().post(new Runnable() {
                public final void run() {
                    b.this.setPausedModifier(false);
                }
            });
        }
    }

    private void b() {
        if (this.m == null) {
            this.i = false;
            this.m = new MediaPlayer();
            this.m.setScreenOnWhilePlaying(true);
            this.m.setOnVideoSizeChangedListener(this);
            this.m.setOnErrorListener(this);
            this.m.setOnPreparedListener(this);
            this.m.setOnBufferingUpdateListener(this);
            this.m.setOnCompletionListener(this);
            this.m.setOnInfoListener(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D > 0) {
            a(this.q, this.r, this.t, this.u, this.s, this.D, this.E);
        } else {
            a(this.q, this.r, this.t, this.u, this.s);
        }
        setKeepScreenOn(true);
    }

    public final void setControls(boolean z2) {
        this.F = z2;
    }

    public final void setPlayInBackground(boolean z2) {
        this.C = z2;
    }

    public final void setProgressUpdateInterval(float f2) {
        this.f7519f = f2;
    }

    public final void setStereoPan(float f2) {
        this.z = f2;
        setMutedModifier(this.x);
    }

    public final void setVolumeModifier(float f2) {
        this.y = f2;
        setMutedModifier(this.x);
    }

    public final void setRepeatModifier(boolean z2) {
        this.w = z2;
        if (this.i) {
            setLooping(z2);
        }
    }

    public final void setResizeModeModifier(com.yqritc.scalablevideoview.b bVar) {
        this.v = bVar;
        if (this.i) {
            setScalableType(bVar);
            invalidate();
        }
    }

    private static Map<String, String> a(@Nullable ReadableMap readableMap) {
        HashMap hashMap = new HashMap();
        if (readableMap == null) {
            return hashMap;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.l = true;
        this.f7514a.receiveEvent(getId(), a.EVENT_END.toString(), null);
        if (!this.w) {
            setKeepScreenOn(false);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.F) {
            c();
            this.f7517d.show();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMutedModifier(boolean z2) {
        this.x = z2;
        if (this.i) {
            if (this.x) {
                a(0.0f, 0.0f);
            } else if (this.z < 0.0f) {
                a(this.y, d());
            } else if (this.z > 0.0f) {
                a(d(), this.y);
            } else {
                a(this.y, this.y);
            }
        }
    }

    public final void setPausedModifier(boolean z2) {
        this.f7518e = z2;
        if (this.i) {
            if (this.f7518e) {
                if (this.m.isPlaying()) {
                    pause();
                }
            } else if (!this.m.isPlaying()) {
                start();
                if (this.A != this.B) {
                    setRateModifier(this.A);
                }
                this.f7515b.post(this.f7516c);
            }
            setKeepScreenOn(!this.f7518e);
        }
    }

    public final void setRateModifier(float f2) {
        this.A = f2;
        if (this.i && Build.VERSION.SDK_INT >= 23 && !this.f7518e) {
            try {
                this.m.setPlaybackParams(this.m.getPlaybackParams().setSpeed(f2));
                this.B = f2;
            } catch (Exception unused) {
            }
        }
    }

    public b(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.o = themedReactContext;
        this.f7514a = (RCTEventEmitter) themedReactContext.getJSModule(RCTEventEmitter.class);
        themedReactContext.addLifecycleEventListener(this);
        b();
        setSurfaceTextureListener(this);
        this.f7516c = new Runnable() {
            public final void run() {
                if (b.this.i && !b.this.l && !b.this.f7518e && !b.this.g) {
                    WritableMap createMap = Arguments.createMap();
                    double currentPosition = (double) b.this.m.getCurrentPosition();
                    Double.isNaN(currentPosition);
                    createMap.putDouble("currentTime", currentPosition / 1000.0d);
                    double d2 = (double) b.this.k;
                    Double.isNaN(d2);
                    createMap.putDouble("playableDuration", d2 / 1000.0d);
                    double d3 = (double) b.this.j;
                    Double.isNaN(d3);
                    createMap.putDouble("seekableDuration", d3 / 1000.0d);
                    b.this.f7514a.receiveEvent(b.this.getId(), a.EVENT_PROGRESS.toString(), createMap);
                    b.this.f7515b.postDelayed(b.this.f7516c, (long) Math.round(b.this.f7519f));
                }
            }
        };
    }

    public final void seekTo(int i2) {
        if (this.i) {
            WritableMap createMap = Arguments.createMap();
            double currentPosition = (double) getCurrentPosition();
            Double.isNaN(currentPosition);
            createMap.putDouble("currentTime", currentPosition / 1000.0d);
            double d2 = (double) i2;
            Double.isNaN(d2);
            createMap.putDouble("seekTime", d2 / 1000.0d);
            this.f7514a.receiveEvent(getId(), a.EVENT_SEEK.toString(), createMap);
            super.seekTo(i2);
            if (this.l && this.j != 0 && i2 < this.j) {
                this.l = false;
            }
        }
    }

    public final void setFullscreen(boolean z2) {
        int i2;
        if (z2 != this.h) {
            this.h = z2;
            Activity currentActivity = this.o.getCurrentActivity();
            if (currentActivity != null) {
                View decorView = currentActivity.getWindow().getDecorView();
                if (this.h) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        i2 = 4102;
                    } else {
                        i2 = 6;
                    }
                    this.f7514a.receiveEvent(getId(), a.EVENT_FULLSCREEN_WILL_PRESENT.toString(), null);
                    decorView.setSystemUiVisibility(i2);
                    this.f7514a.receiveEvent(getId(), a.EVENT_FULLSCREEN_DID_PRESENT.toString(), null);
                    return;
                }
                this.f7514a.receiveEvent(getId(), a.EVENT_FULLSCREEN_WILL_DISMISS.toString(), null);
                decorView.setSystemUiVisibility(0);
                this.f7514a.receiveEvent(getId(), a.EVENT_FULLSCREEN_DID_DISMISS.toString(), null);
            }
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.i = true;
        this.j = mediaPlayer.getDuration();
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("width", mediaPlayer.getVideoWidth());
        createMap.putInt("height", mediaPlayer.getVideoHeight());
        if (mediaPlayer.getVideoWidth() > mediaPlayer.getVideoHeight()) {
            createMap.putString("orientation", "landscape");
        } else {
            createMap.putString("orientation", "portrait");
        }
        WritableMap createMap2 = Arguments.createMap();
        double d2 = (double) this.j;
        Double.isNaN(d2);
        createMap2.putDouble("duration", d2 / 1000.0d);
        double currentPosition = (double) mediaPlayer.getCurrentPosition();
        Double.isNaN(currentPosition);
        createMap2.putDouble("currentTime", currentPosition / 1000.0d);
        createMap2.putMap("naturalSize", createMap);
        createMap2.putBoolean("canPlayFastForward", true);
        createMap2.putBoolean("canPlaySlowForward", true);
        createMap2.putBoolean("canPlaySlowReverse", true);
        createMap2.putBoolean("canPlayReverse", true);
        createMap2.putBoolean("canPlayFastForward", true);
        createMap2.putBoolean("canStepBackward", true);
        createMap2.putBoolean("canStepForward", true);
        this.f7514a.receiveEvent(getId(), a.EVENT_LOAD.toString(), createMap2);
        setResizeModeModifier(this.v);
        setRepeatModifier(this.w);
        setPausedModifier(this.f7518e);
        setMutedModifier(this.x);
        setProgressUpdateInterval(this.f7519f);
        setRateModifier(this.A);
        if (this.F) {
            c();
            this.f7517d.setMediaPlayer(this);
            this.f7517d.setAnchorView(this);
            this.p.post(new Runnable() {
                public final void run() {
                    b.this.f7517d.setEnabled(true);
                    b.this.f7517d.show();
                }
            });
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        double d2 = (double) (this.j * i2);
        Double.isNaN(d2);
        this.k = (int) Math.round(d2 / 100.0d);
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("what", i2);
        createMap.putInt(PushConstants.EXTRA, i3);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("error", createMap);
        this.f7514a.receiveEvent(getId(), a.EVENT_ERROR.toString(), createMap2);
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        if (i2 != 3) {
            switch (i2) {
                case 701:
                    this.f7514a.receiveEvent(getId(), a.EVENT_STALLED.toString(), Arguments.createMap());
                    break;
                case 702:
                    this.f7514a.receiveEvent(getId(), a.EVENT_RESUME.toString(), Arguments.createMap());
                    break;
            }
        } else {
            this.f7514a.receiveEvent(getId(), a.EVENT_READY_FOR_DISPLAY.toString(), Arguments.createMap());
        }
        return false;
    }

    public final void a(String str, String str2, boolean z2, boolean z3, ReadableMap readableMap) {
        a(str, str2, z2, z3, readableMap, 0, 0);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2 && this.i) {
            int videoWidth = getVideoWidth();
            int videoHeight = getVideoHeight();
            if (videoWidth != 0 && videoHeight != 0) {
                Matrix a2 = new d(new e(getWidth(), getHeight()), new e(videoWidth, videoHeight)).a(this.n);
                if (a2 != null) {
                    setTransform(a2);
                }
            }
        }
    }

    public final void a(String str, String str2, boolean z2, boolean z3, ReadableMap readableMap, int i2, int i3) {
        this.q = str;
        this.r = str2;
        this.t = z2;
        this.u = z3;
        this.s = readableMap;
        this.D = i2;
        this.E = i3;
        this.i = false;
        this.j = 0;
        this.k = 0;
        b();
        this.m.reset();
        if (z2) {
            try {
                CookieManager instance = CookieManager.getInstance();
                Uri parse = Uri.parse(str);
                String cookie = instance.getCookie(parse.buildUpon().build().toString());
                HashMap hashMap = new HashMap();
                if (cookie != null) {
                    hashMap.put("Cookie", cookie);
                }
                if (this.s != null) {
                    hashMap.putAll(a(this.s));
                }
                a((Context) this.o, parse, (Map<String, String>) hashMap);
            } catch (Exception unused) {
                return;
            }
        } else if (!z3) {
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.D > 0) {
                try {
                    com.a.a.a.a.b a2 = com.a.a.a.a.a.a(this.o, this.D, this.E);
                    assetFileDescriptor = a2.a(str.replace(".mp4", "") + ".mp4");
                } catch (IOException | NullPointerException unused2) {
                }
            }
            if (assetFileDescriptor == null) {
                int identifier = this.o.getResources().getIdentifier(str, "drawable", this.o.getPackageName());
                if (identifier == 0) {
                    identifier = this.o.getResources().getIdentifier(str, "raw", this.o.getPackageName());
                }
                setRawData(identifier);
            } else {
                a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            }
        } else if (str.startsWith("content://")) {
            a((Context) this.o, Uri.parse(str));
        } else {
            setDataSource(str);
        }
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.merge(this.s);
        createMap.putString("uri", str);
        createMap.putString("type", str2);
        createMap.putMap("requestHeaders", createMap2);
        createMap.putBoolean("isNetwork", z2);
        if (this.D > 0) {
            createMap.putInt("mainVer", this.D);
            if (this.E > 0) {
                createMap.putInt("patchVer", this.E);
            }
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putMap("src", createMap);
        this.f7514a.receiveEvent(getId(), a.EVENT_LOAD_START.toString(), createMap3);
        this.l = false;
        try {
            a(this);
        } catch (Exception unused3) {
        }
    }
}
