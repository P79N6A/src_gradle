package com.ss.avframework.livestreamv2.interact.controller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceView;
import com.ss.avframework.livestreamv2.interact.LogUtil;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.callback.DataCallback;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.callback.QualityCallback;
import com.ss.avframework.livestreamv2.interact.callback.StateCallback;
import com.ss.avframework.livestreamv2.interact.callback.UserCallback;
import com.ss.avframework.livestreamv2.interact.engine.AgoraEngine;
import com.ss.avframework.livestreamv2.interact.engine.ByteEngine;
import com.ss.avframework.livestreamv2.interact.engine.Engine;
import com.ss.avframework.livestreamv2.interact.engine.ZegoEngine;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public abstract class BaseController implements Handler.Callback, EngineCallback {
    public List<DataCallback> mDataCallbacks = new ArrayList();
    Engine mEngine;
    private long mLastStreamDelayCallbackTime;
    Handler mMainThreadHandler;
    private List<QualityCallback> mQualityCallbacks = new ArrayList();
    volatile State mState;
    public List<StateCallback> mStateCallbacks = new ArrayList();
    public List<UserCallback> mUserCallbacks = new ArrayList();

    /* renamed from: com.ss.avframework.livestreamv2.interact.controller.BaseController$17  reason: invalid class name */
    static /* synthetic */ class AnonymousClass17 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0073 */
        static {
            /*
                com.ss.avframework.livestreamv2.interact.controller.BaseController$State[] r0 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State = r0
                r0 = 1
                int[] r1 = $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.avframework.livestreamv2.interact.controller.BaseController$State r2 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.IDLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.avframework.livestreamv2.interact.controller.BaseController$State r3 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.DESTROYING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.avframework.livestreamv2.interact.controller.BaseController$State r4 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.avframework.livestreamv2.interact.controller.BaseController$State r4 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.STOPPING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.avframework.livestreamv2.interact.controller.BaseController$State r4 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.avframework.livestreamv2.interact.controller.BaseController$State r4 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.STARTING     // Catch:{ NoSuchFieldError -> 0x004b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.avframework.livestreamv2.interact.controller.BaseController$State r4 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.STARTED     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                com.ss.avframework.livestreamv2.interact.model.Config$Vendor[] r3 = com.ss.avframework.livestreamv2.interact.model.Config.Vendor.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$Vendor = r3
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$Vendor     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.ss.avframework.livestreamv2.interact.model.Config$Vendor r4 = com.ss.avframework.livestreamv2.interact.model.Config.Vendor.AGORA     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$Vendor     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.ss.avframework.livestreamv2.interact.model.Config$Vendor r3 = com.ss.avframework.livestreamv2.interact.model.Config.Vendor.ZEGO     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$Vendor     // Catch:{ NoSuchFieldError -> 0x007d }
                com.ss.avframework.livestreamv2.interact.model.Config$Vendor r1 = com.ss.avframework.livestreamv2.interact.model.Config.Vendor.BYTE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.controller.BaseController.AnonymousClass17.<clinit>():void");
        }
    }

    enum State {
        IDLE,
        INITIALIZING,
        INITIALIZED,
        STARTING,
        STARTED,
        STOPPING,
        DESTROYING
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public synchronized void release() {
        this.mUserCallbacks.clear();
        this.mStateCallbacks.clear();
        this.mQualityCallbacks.clear();
    }

    public synchronized void onDestroySuccess() {
        if (this.mState != State.DESTROYING) {
            LogUtil.w("receive onDestroySuccess callback, but state is " + this.mState.name());
            return;
        }
        this.mState = State.IDLE;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndSuccess : BaseController.this.mStateCallbacks) {
                    onEndSuccess.onEndSuccess();
                }
            }
        });
    }

    public synchronized void onInitSuccess() {
        if (this.mState != State.INITIALIZING) {
            LogUtil.w("receive onInitSuccess callback, but state is " + this.mState.name());
            return;
        }
        this.mState = State.STARTING;
        this.mEngine.start();
    }

    public synchronized void onStartSuccess() {
        if (this.mState != State.STARTING) {
            LogUtil.w("receive onStartSuccess callback, but state is " + this.mState.name());
            return;
        }
        this.mState = State.STARTED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartSuccess : BaseController.this.mStateCallbacks) {
                    onStartSuccess.onStartSuccess();
                }
            }
        });
    }

    public synchronized void onStopSuccess() {
        if (this.mState != State.STOPPING) {
            LogUtil.w("receive onStopSuccess callback, but state is " + this.mState.name());
            return;
        }
        this.mState = State.DESTROYING;
        this.mEngine.destroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void end() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = com.ss.avframework.livestreamv2.interact.controller.BaseController.AnonymousClass17.$SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ all -> 0x0037 }
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r1 = r2.mState     // Catch:{ all -> 0x0037 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0037 }
            r0 = r0[r1]     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 3
            if (r0 == r1) goto L_0x0020
            switch(r0) {
                case 5: goto L_0x0020;
                case 6: goto L_0x0015;
                case 7: goto L_0x0015;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x0037 }
        L_0x0014:
            goto L_0x001e
        L_0x0015:
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r0 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.STOPPING     // Catch:{ all -> 0x0037 }
            r2.mState = r0     // Catch:{ all -> 0x0037 }
            com.ss.avframework.livestreamv2.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0037 }
            r0.stop()     // Catch:{ all -> 0x0037 }
        L_0x001e:
            monitor-exit(r2)
            return
        L_0x0020:
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r0 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.DESTROYING     // Catch:{ all -> 0x0037 }
            r2.mState = r0     // Catch:{ all -> 0x0037 }
            com.ss.avframework.livestreamv2.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0037 }
            r0.destroy()     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x002b:
            android.os.Handler r0 = r2.mMainThreadHandler     // Catch:{ all -> 0x0037 }
            com.ss.avframework.livestreamv2.interact.controller.BaseController$2 r1 = new com.ss.avframework.livestreamv2.interact.controller.BaseController$2     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            r0.post(r1)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.controller.BaseController.end():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void start() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = com.ss.avframework.livestreamv2.interact.controller.BaseController.AnonymousClass17.$SwitchMap$com$ss$avframework$livestreamv2$interact$controller$BaseController$State     // Catch:{ all -> 0x0034 }
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r1 = r2.mState     // Catch:{ all -> 0x0034 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0034 }
            r0 = r0[r1]     // Catch:{ all -> 0x0034 }
            switch(r0) {
                case 1: goto L_0x0027;
                case 2: goto L_0x0027;
                case 3: goto L_0x001c;
                case 4: goto L_0x001c;
                case 5: goto L_0x001a;
                case 6: goto L_0x001a;
                case 7: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x0034 }
        L_0x000e:
            goto L_0x0032
        L_0x000f:
            android.os.Handler r0 = r2.mMainThreadHandler     // Catch:{ all -> 0x0034 }
            com.ss.avframework.livestreamv2.interact.controller.BaseController$1 r1 = new com.ss.avframework.livestreamv2.interact.controller.BaseController$1     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            r0.post(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r0 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.STARTING     // Catch:{ all -> 0x0034 }
            r2.mState = r0     // Catch:{ all -> 0x0034 }
            com.ss.avframework.livestreamv2.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0034 }
            r0.start()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0027:
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r0 = com.ss.avframework.livestreamv2.interact.controller.BaseController.State.INITIALIZING     // Catch:{ all -> 0x0034 }
            r2.mState = r0     // Catch:{ all -> 0x0034 }
            com.ss.avframework.livestreamv2.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0034 }
            r0.init()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0032:
            monitor-exit(r2)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.controller.BaseController.start():void");
    }

    public void onError(final String str) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onError : BaseController.this.mStateCallbacks) {
                    onError.onError(str);
                }
            }
        });
    }

    public void onWarn(final String str) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onWarn : BaseController.this.mStateCallbacks) {
                    onWarn.onWarn(str);
                }
            }
        });
    }

    public synchronized void removeDataCallback(DataCallback dataCallback) {
        this.mDataCallbacks.remove(dataCallback);
    }

    public synchronized void removeQualityCallback(QualityCallback qualityCallback) {
        this.mQualityCallbacks.remove(qualityCallback);
    }

    public synchronized void removeStateCallback(StateCallback stateCallback) {
        this.mStateCallbacks.remove(stateCallback);
    }

    public synchronized void removeUserCallback(UserCallback userCallback) {
        this.mUserCallbacks.remove(userCallback);
    }

    public synchronized void addDataCallback(DataCallback dataCallback) {
        if (dataCallback != null) {
            if (!this.mDataCallbacks.contains(dataCallback)) {
                this.mDataCallbacks.add(dataCallback);
            }
        }
    }

    public synchronized void addQualityCallback(QualityCallback qualityCallback) {
        if (qualityCallback != null) {
            if (!this.mQualityCallbacks.contains(qualityCallback)) {
                this.mQualityCallbacks.add(qualityCallback);
            }
        }
    }

    public synchronized void addStateCallback(StateCallback stateCallback) {
        if (stateCallback != null) {
            if (!this.mStateCallbacks.contains(stateCallback)) {
                this.mStateCallbacks.add(stateCallback);
            }
        }
    }

    public synchronized void addUserCallback(UserCallback userCallback) {
        if (userCallback != null) {
            if (!this.mUserCallbacks.contains(userCallback)) {
                this.mUserCallbacks.add(userCallback);
            }
        }
    }

    public synchronized void muteAllRemoteAudioStreams(boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.muteAllRemoteAudioStreams(z);
        }
    }

    public synchronized void switchAudio(boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.switchAudio(z);
        }
    }

    public void onFirstRemoteAudioFrame(final int i) {
        if (this.mState != State.STARTED) {
            LogUtil.w("receive onFirstRemoteAudioFrame callback, but state is " + this.mState.name());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onFirstRemoteAudioFrame : BaseController.this.mUserCallbacks) {
                    onFirstRemoteAudioFrame.onFirstRemoteAudioFrame(i);
                }
            }
        });
    }

    public void onStreamDelay(int i) {
        if (System.currentTimeMillis() - this.mLastStreamDelayCallbackTime >= 10000) {
            this.mLastStreamDelayCallbackTime = System.currentTimeMillis();
            for (QualityCallback onStreamDelay : this.mQualityCallbacks) {
                onStreamDelay.onStreamDelay(i);
            }
        }
    }

    public void onUserJoined(final int i) {
        if (this.mState != State.STARTED) {
            LogUtil.w("receive onUserJoined callback, but state is " + this.mState.name());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserJoined : BaseController.this.mUserCallbacks) {
                    onUserJoined.onUserJoined(i);
                }
            }
        });
    }

    public synchronized void onUserLeaved(final int i) {
        if (this.mState != State.STARTED) {
            LogUtil.w("receive onUserLeaved callback, but state is " + this.mState.name());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserLeaved : BaseController.this.mUserCallbacks) {
                    onUserLeaved.onUserLeaved(i);
                }
            }
        });
    }

    public synchronized void muteRemoteAudioStream(int i, boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.muteRemoteAudioStream(i, z);
        }
    }

    public void onLogReport(String str, JSONObject jSONObject) {
        for (QualityCallback onLogMonitor : this.mQualityCallbacks) {
            onLogMonitor.onLogMonitor(str, jSONObject);
        }
    }

    public void onPushStreamQuality(long j, long j2) {
        for (QualityCallback onPushStreamQuality : this.mQualityCallbacks) {
            onPushStreamQuality.onPushStreamQuality(j, j2);
        }
    }

    public synchronized void onDestroyFailed(final int i, final String str) {
        if (this.mState != State.DESTROYING) {
            LogUtil.w("receive onDestroyFailed callback, but state is " + this.mState.name());
            return;
        }
        this.mState = State.INITIALIZED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndFailed : BaseController.this.mStateCallbacks) {
                    onEndFailed.onEndFailed(i, str);
                }
            }
        });
    }

    public void onFirstRemoteVideoFrame(final int i, final SurfaceView surfaceView) {
        if (this.mState != State.STARTED) {
            LogUtil.w("receive onFirstRemoteVideoFrame callback, but state is " + this.mState.name());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onFirstRemoteVideoFrame : BaseController.this.mUserCallbacks) {
                    onFirstRemoteVideoFrame.onFirstRemoteVideoFrame(i, surfaceView);
                }
            }
        });
    }

    public synchronized void onInitFailed(final int i, final String str) {
        if (this.mState != State.INITIALIZING) {
            LogUtil.w("receive onInitFailed callback, but state is " + this.mState.name());
            return;
        }
        this.mState = State.IDLE;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartFailed : BaseController.this.mStateCallbacks) {
                    onStartFailed.onStartFailed(i, str);
                }
            }
        });
    }

    public synchronized void onStartFailed(final int i, final String str) {
        if (this.mState != State.STARTING) {
            LogUtil.w("receive onStartFailed callback, but state is " + this.mState.name());
            return;
        }
        this.mState = State.INITIALIZED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartFailed : BaseController.this.mStateCallbacks) {
                    onStartFailed.onStartFailed(i, str);
                }
            }
        });
    }

    public synchronized void onStopFailed(final int i, final String str) {
        if (this.mState != State.STOPPING) {
            LogUtil.w("receive onStopFailed callback, but state is " + this.mState.name());
            return;
        }
        this.mState = State.STARTED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndFailed : BaseController.this.mStateCallbacks) {
                    onEndFailed.onEndFailed(i, str);
                }
            }
        });
    }

    public void onTalkStateUpdated(final String[] strArr, final boolean[] zArr) {
        if (this.mState != State.STARTED) {
            LogUtil.w("receive onSelfVolumeUpdated callback, but state is " + this.mState.name());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onTalkStateUpdated : BaseController.this.mUserCallbacks) {
                    onTalkStateUpdated.onTalkStateUpdated(strArr, zArr);
                }
            }
        });
    }

    BaseController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory) {
        Handler handler;
        switch (config.getVendor()) {
            case AGORA:
                this.mEngine = new AgoraEngine(config, videoClientFactory, audioClientFactory, this);
                break;
            case ZEGO:
                this.mEngine = new ZegoEngine(config, videoClientFactory, audioClientFactory, this);
                break;
            case BYTE:
                this.mEngine = new ByteEngine(config, videoClientFactory, audioClientFactory, this);
                break;
            default:
                throw new RuntimeException("unknown vendor");
        }
        this.mState = State.IDLE;
        if (config.getHandler() != null) {
            handler = config.getHandler();
        } else {
            handler = new Handler(Looper.getMainLooper(), this);
        }
        this.mMainThreadHandler = handler;
    }

    public void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        for (DataCallback onPlaybackAudioFrame : this.mDataCallbacks) {
            onPlaybackAudioFrame.onPlaybackAudioFrame(byteBuffer, i, i2, i3, j);
        }
    }

    public void onReceiveVideoBufferFrame(int i, ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, long j) {
        Handler handler = this.mMainThreadHandler;
        final int i5 = i;
        final ByteBuffer byteBuffer2 = byteBuffer;
        final Config.VideoOutputFormat videoOutputFormat2 = videoOutputFormat;
        final int i6 = i2;
        final int i7 = i3;
        final int i8 = i4;
        final long j2 = j;
        AnonymousClass14 r0 = new Runnable() {
            public void run() {
                for (DataCallback onReceiveVideoBufferFrame : BaseController.this.mDataCallbacks) {
                    onReceiveVideoBufferFrame.onReceiveVideoBufferFrame(i5, byteBuffer2, videoOutputFormat2, i6, i7, i8, j2);
                }
            }
        };
        handler.post(r0);
    }

    public void onReceiveTextureFrame(int i, int i2, Config.VideoOutputFormat videoOutputFormat, int i3, int i4, int i5, long j, float[] fArr) {
        for (DataCallback onReceiveTextureFrame : this.mDataCallbacks) {
            onReceiveTextureFrame.onReceiveTextureFrame(i, i2, videoOutputFormat, i3, i4, i5, j, fArr);
        }
    }
}
