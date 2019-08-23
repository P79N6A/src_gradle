package com.ss.avframework.livestreamv2.interact.engine;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.ss.avframework.livestreamv2.interact.LogReporter;
import com.ss.avframework.livestreamv2.interact.LogUtil;
import com.ss.avframework.livestreamv2.interact.audio.AgoraAudioClient;
import com.ss.avframework.livestreamv2.interact.audio.AgoraAudioSink;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.livestreamv2.interact.model.Region;
import com.ss.avframework.livestreamv2.interact.video.AgoraVideoClient;
import com.ss.avframework.livestreamv2.interact.video.AgoraVideoSink;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.RtcEngine;
import io.agora.rtc.internal.RtcEngineImpl;
import io.agora.rtc.live.LiveTranscoding;
import io.agora.rtc.video.VideoCanvas;
import io.agora.rtc.video.VideoEncoderConfiguration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgoraEngine extends Engine {
    public AgoraAudioClient mAudioClient;
    public AgoraAudioSink mAudioSink;
    private LiveTranscoding mLiveTranscoding;
    public boolean mReconnecting;
    public Map<Integer, Long> mRemoteVideoFrozen = new HashMap();
    public RtcEngine mRtcEngine;
    private IRtcEngineEventHandler mRtcEngineEventHandler = new IRtcEngineEventHandler() {
        public void onConnectionLost() {
            LogUtil.w("agora onConnectionLost");
            AgoraEngine.this.mCallback.onWarn("agora onConnectionLost");
            AgoraEngine.this.mLogReporter.onConnectionLost();
        }

        public void onLocalVideoStats(IRtcEngineEventHandler.LocalVideoStats localVideoStats) {
            AgoraEngine.this.mSendVideoFrameRate = localVideoStats.sentFrameRate;
        }

        public void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats) {
            AgoraEngine.this.mCallback.onStreamDelay(remoteAudioStats.networkTransportDelay);
        }

        public void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
            LogUtil.d("onLeaveChannel");
            AgoraEngine.this.mCallback.onStopSuccess();
            AgoraEngine.this.mLogReporter.onLeaveChannelReturn();
            AgoraEngine.this.mShouldReport = false;
        }

        public void onError(int i) {
            AgoraEngine.this.mLogReporter.onErrorOccurs(i);
            EngineCallback engineCallback = AgoraEngine.this.mCallback;
            engineCallback.onError("agora onError, code: " + i);
            LogUtil.e("agora error: " + i);
        }

        public void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            AgoraEngine.this.mCallback.onPushStreamQuality((long) rtcStats.txVideoKBitRate, (long) rtcStats.txAudioKBitRate);
            AgoraEngine.this.mSendAudioBitrate = rtcStats.txAudioKBitRate;
            AgoraEngine.this.mReceiveAudioBitrate = rtcStats.rxAudioKBitRate;
            AgoraEngine.this.mSendVideoBitrate = rtcStats.txVideoKBitRate;
            AgoraEngine.this.mReceiveVideoBitrate = rtcStats.rxVideoKBitRate;
            AgoraEngine.this.mUserCount = rtcStats.users;
        }

        public void onWarning(int i) {
            EngineCallback engineCallback = AgoraEngine.this.mCallback;
            engineCallback.onWarn("agora onWarning, code: " + i);
            LogUtil.w("agora warning: " + i);
        }

        public void onNetworkTypeChanged(int i) {
            String[] strArr = {"Unknown", "Disconnected", "LAN", "WIFI", "2G", "3G", "4G"};
            String str = strArr[0];
            if (i >= 0 && i < 7) {
                str = strArr[i];
            }
            LogUtil.w("agora network type changed to " + str);
            EngineCallback engineCallback = AgoraEngine.this.mCallback;
            engineCallback.onWarn("agora network type changed to " + str);
            AgoraEngine.this.mLogReporter.onNetworkChanged(str);
        }

        public void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            boolean z;
            int length = audioVolumeInfoArr.length;
            String[] strArr = new String[length];
            boolean[] zArr = new boolean[length];
            int volumeThreshold = AgoraEngine.this.mConfig.getVolumeThreshold();
            for (int i2 = 0; i2 < length; i2++) {
                IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i2];
                int i3 = audioVolumeInfo.uid;
                if (i3 == 0) {
                    i3 = AgoraEngine.this.mConfig.getInteractId();
                }
                strArr[i2] = String.valueOf(i3);
                if (audioVolumeInfo.volume >= volumeThreshold) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i2] = z;
            }
            AgoraEngine.this.onTalkStateUpdated(strArr, zArr);
        }

        public void onFirstRemoteAudioFrame(int i, int i2) {
            LogUtil.d("onFirstRemoteAudioFrame: " + i);
            if (i != AgoraEngine.this.mConfig.getInteractId()) {
                AgoraEngine.this.mCallback.onFirstRemoteAudioFrame(i);
                LogReporter logReporter = AgoraEngine.this.mLogReporter;
                logReporter.onFirstRemoteFrame(true, i);
            }
        }

        public void onUserJoined(int i, int i2) {
            LogUtil.d("onUserJoined: " + i);
            if (i != AgoraEngine.this.mConfig.getInteractId()) {
                AgoraEngine.this.recordGuestJoined(i);
                AgoraEngine.this.mCallback.onUserJoined(i);
                LogReporter logReporter = AgoraEngine.this.mLogReporter;
                logReporter.onRemoteUserOnlineOffline(true, i);
            }
        }

        public void onRemoteVideoStateChanged(int i, int i2) {
            if (i2 == 2) {
                AgoraEngine.this.mRemoteVideoFrozen.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (i2 == 1 && AgoraEngine.this.mRemoteVideoFrozen.containsKey(Integer.valueOf(i)) && AgoraEngine.this.mRemoteVideoFrozen.get(Integer.valueOf(i)).longValue() != 0) {
                long currentTimeMillis = System.currentTimeMillis() - AgoraEngine.this.mRemoteVideoFrozen.get(Integer.valueOf(i)).longValue();
                LogReporter logReporter = AgoraEngine.this.mLogReporter;
                logReporter.onRemoteVideoFrozen(i, (int) currentTimeMillis);
                AgoraEngine.this.mRemoteVideoFrozen.put(Integer.valueOf(i), 0L);
            }
        }

        public void onUserOffline(int i, int i2) {
            LogUtil.d("onUserOffline: " + i);
            if (AgoraEngine.this.mConfig.isClientMixStream()) {
                AgoraEngine.this.mRtcEngine.setRemoteVideoRenderer(i, null);
            }
            AgoraEngine.this.recordGuestLeaved(i);
            AgoraEngine.this.mCallback.onUserLeaved(i);
            LogReporter logReporter = AgoraEngine.this.mLogReporter;
            logReporter.onRemoteUserOnlineOffline(false, i);
        }

        public void onConnectionStateChanged(int i, int i2) {
            String str;
            String str2;
            String[] strArr = {"CONNECTION_STATE_NONE", "CONNECTION_STATE_DISCONNECTED", "CONNECTION_STATE_CONNECTING", "CONNECTION_STATE_CONNECTED", "CONNECTION_STATE_RECONNECTING", "CONNECTION_STATE_FAILED"};
            String[] strArr2 = {"CONNECTION_CHANGED_CONNECTING", "CONNECTION_CHANGED_JOIN_SUCCESS", "CONNECTION_CHANGED_INTERRUPTED", "CONNECTION_CHANGED_BANNED_BY_SERVER", "CONNECTION_CHANGED_JOIN_FAILED", "CONNECTION_CHANGED_LEAVE_CHANNEL"};
            if (i < 0 || i >= 6) {
                str = String.valueOf(i);
            } else {
                str = strArr[i];
            }
            if (i2 < 0 || i2 >= 6) {
                str2 = String.valueOf(i2);
            } else {
                str2 = strArr2[i2];
            }
            String str3 = "agora onConnectionStateChanged: state " + str + ", reason " + str2;
            AgoraEngine.this.mCallback.onWarn(str3);
            LogUtil.w(str3);
            if (i == 4) {
                AgoraEngine.this.mReconnecting = true;
                AgoraEngine.this.mLogReporter.onReconnecting();
                return;
            }
            if (i == 3) {
                if (AgoraEngine.this.mReconnecting) {
                    AgoraEngine.this.mReconnecting = false;
                    AgoraEngine.this.mLogReporter.onReconnected();
                }
            } else if (i == 5) {
                AgoraEngine.this.mLogReporter.onConnectFailed(i, str2);
                AgoraEngine.this.mReconnecting = false;
            }
        }

        public void onRtmpStreamingStateChanged(String str, int i, int i2) {
            AgoraEngine.this.mLogReporter.onStreamStateChange(i2, "IRtcEngineEventHandler.onRtmpStreamingStateChanged: url " + str, i);
        }

        public void onJoinChannelSuccess(String str, int i, int i2) {
            LogUtil.d("onJoinChannelSuccess");
            AgoraEngine.this.mCallback.onStartSuccess();
            AgoraEngine.this.mShouldReport = true;
            AgoraEngine.this.mLogReporter.onJoinChannelSuccess(AgoraEngine.this.mbFirstJoin);
            AgoraEngine.this.mbFirstJoin = false;
            if (AgoraEngine.this.mConfig.getType() == Config.Type.VIDEO && AgoraEngine.this.mVideoClient != null) {
                AgoraEngine.this.mVideoClient.start();
            }
            if (AgoraEngine.this.mAudioClient != null) {
                AgoraEngine.this.mAudioClient.start();
            }
            if (AgoraEngine.this.mAudioSink != null) {
                AgoraEngine.this.mAudioSink.start();
            }
        }

        public void onFirstRemoteVideoDecoded(final int i, int i2, int i3, int i4) {
            LogUtil.d("onFirstRemoteVideoDecoded: " + i);
            if (i != AgoraEngine.this.mConfig.getInteractId()) {
                AgoraEngine.this.mMainThreadHandler.post(new Runnable() {
                    public void run() {
                        SurfaceView CreateRendererView = RtcEngine.CreateRendererView(AgoraEngine.this.mContext);
                        if (AgoraEngine.this.mConfig.isClientMixStream()) {
                            AgoraEngine.this.mRtcEngine.setRemoteVideoRenderer(i, new AgoraVideoSink(i, AgoraEngine.this.mCallback, CreateRendererView));
                        } else {
                            AgoraEngine.this.mRtcEngine.setupRemoteVideo(new VideoCanvas(CreateRendererView, 1, i));
                        }
                        AgoraEngine.this.mCallback.onFirstRemoteVideoFrame(i, CreateRendererView);
                    }
                });
                LogReporter logReporter = AgoraEngine.this.mLogReporter;
                logReporter.onFirstRemoteFrame(false, i);
            }
        }
    };
    public AgoraVideoClient mVideoClient;

    /* renamed from: com.ss.avframework.livestreamv2.interact.engine.AgoraEngine$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioProfile = new int[Config.AudioProfile.values().length];
        static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoCodec = new int[Config.VideoCodec.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0081 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008b */
        static {
            /*
                com.ss.avframework.livestreamv2.interact.model.Config$VideoProfile[] r0 = com.ss.avframework.livestreamv2.interact.model.Config.VideoProfile.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoProfile = r0
                r0 = 1
                int[] r1 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoProfile     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.avframework.livestreamv2.interact.model.Config$VideoProfile r2 = com.ss.avframework.livestreamv2.interact.model.Config.VideoProfile.MAIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoProfile     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.avframework.livestreamv2.interact.model.Config$VideoProfile r3 = com.ss.avframework.livestreamv2.interact.model.Config.VideoProfile.HIGH     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoProfile     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.avframework.livestreamv2.interact.model.Config$VideoProfile r4 = com.ss.avframework.livestreamv2.interact.model.Config.VideoProfile.BASELINE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.ss.avframework.livestreamv2.interact.model.Config$VideoCodec[] r3 = com.ss.avframework.livestreamv2.interact.model.Config.VideoCodec.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoCodec = r3
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoCodec     // Catch:{ NoSuchFieldError -> 0x003d }
                com.ss.avframework.livestreamv2.interact.model.Config$VideoCodec r4 = com.ss.avframework.livestreamv2.interact.model.Config.VideoCodec.H265     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoCodec     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.ss.avframework.livestreamv2.interact.model.Config$VideoCodec r4 = com.ss.avframework.livestreamv2.interact.model.Config.VideoCodec.H264     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                com.ss.avframework.livestreamv2.interact.model.Config$AudioProfile[] r3 = com.ss.avframework.livestreamv2.interact.model.Config.AudioProfile.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioProfile = r3
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioProfile     // Catch:{ NoSuchFieldError -> 0x005a }
                com.ss.avframework.livestreamv2.interact.model.Config$AudioProfile r4 = com.ss.avframework.livestreamv2.interact.model.Config.AudioProfile.HE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioProfile     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.ss.avframework.livestreamv2.interact.model.Config$AudioProfile r4 = com.ss.avframework.livestreamv2.interact.model.Config.AudioProfile.LC     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.ss.avframework.livestreamv2.interact.model.Config$AudioSampleRate[] r3 = com.ss.avframework.livestreamv2.interact.model.Config.AudioSampleRate.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioSampleRate = r3
                int[] r3 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.ss.avframework.livestreamv2.interact.model.Config$AudioSampleRate r4 = com.ss.avframework.livestreamv2.interact.model.Config.AudioSampleRate.SAMPLE_RATE_16K     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x0081 }
                com.ss.avframework.livestreamv2.interact.model.Config$AudioSampleRate r3 = com.ss.avframework.livestreamv2.interact.model.Config.AudioSampleRate.SAMPLE_RATE_32K     // Catch:{ NoSuchFieldError -> 0x0081 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0081 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0081 }
            L_0x0081:
                int[] r0 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x008b }
                com.ss.avframework.livestreamv2.interact.model.Config$AudioSampleRate r1 = com.ss.avframework.livestreamv2.interact.model.Config.AudioSampleRate.SAMPLE_RATE_48K     // Catch:{ NoSuchFieldError -> 0x008b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008b }
            L_0x008b:
                int[] r0 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x0096 }
                com.ss.avframework.livestreamv2.interact.model.Config$AudioSampleRate r1 = com.ss.avframework.livestreamv2.interact.model.Config.AudioSampleRate.SAMPLE_RATE_44K     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.engine.AgoraEngine.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public String getVendor() {
        return "agora";
    }

    public void destroy() {
        this.mCallback.onDestroySuccess();
        super.destroy();
    }

    public void start() {
        String str;
        this.mRtcEngine.enableAudio();
        if (this.mAudioClientFactory != null) {
            this.mAudioClient = new AgoraAudioClient(this.mAudioClientFactory, this.mRtcEngine);
        }
        if (this.mConfig.isClientMixStream()) {
            this.mAudioSink = new AgoraAudioSink(this.mRtcEngine, this.mConfig.isAutoPlayRemoteAudio(), this.mCallback, this.mConfig);
        }
        this.mRtcEngine.setAudioProfile(2, 1);
        if (this.mConfig.getType() == Config.Type.VIDEO) {
            this.mRtcEngine.enableVideo();
            if (this.mVideoClientFactory != null) {
                this.mVideoClient = new AgoraVideoClient(this.mVideoClientFactory, this.mConfig.getFrameFormat());
                this.mRtcEngine.setVideoSource(this.mVideoClient);
            }
        } else {
            this.mRtcEngine.disableVideo();
        }
        this.mRtcEngine.setAudioProfile(2, 1);
        if (this.mConfig.isAutoPlayRemoteAudio()) {
            str = "false";
        } else {
            str = "true";
        }
        RtcEngine rtcEngine = this.mRtcEngine;
        rtcEngine.setParameters("{\"che.audio.external_render\":" + str + "}");
        int joinChannel = this.mRtcEngine.joinChannel(this.mConfig.getAgoraAppKey(), this.mConfig.getChannelName(), null, this.mConfig.getInteractId());
        this.mLogReporter.onJoiningChannel(joinChannel);
        if (joinChannel < 0) {
            EngineCallback engineCallback = this.mCallback;
            engineCallback.onStartFailed(10006, "result: " + joinChannel);
            return;
        }
        LogUtil.d("agora start join channel: " + this.mConfig.getChannelName());
    }

    public void stop() {
        if (this.mConfig.getType() == Config.Type.VIDEO && this.mVideoClientFactory != null) {
            this.mRtcEngine.setVideoSource(null);
            if (this.mVideoClient != null) {
                this.mVideoClient.stop();
                this.mVideoClient.release();
                this.mVideoClient = null;
            }
        }
        if (this.mAudioClient != null) {
            this.mAudioClient.stop();
            this.mAudioClient.release();
            this.mAudioClient = null;
        }
        if (this.mAudioSink != null) {
            this.mAudioSink.stop();
            this.mAudioSink.release();
            this.mAudioSink = null;
        }
        this.mRtcEngine.disableAudio();
        this.mRtcEngine.enableLocalAudio(false);
        if (!this.mConfig.isClientMixStream() && this.mConfig.getMixStreamConfig() != null) {
            this.mRtcEngine.removePublishStreamUrl(this.mConfig.getMixStreamConfig().getStreamUrl());
        }
        this.mbStreamPublished = false;
        this.mLogReporter.onLeavingChannel();
        int leaveChannel = this.mRtcEngine.leaveChannel();
        if (leaveChannel < 0) {
            EngineCallback engineCallback = this.mCallback;
            engineCallback.onStopFailed(10007, "result: " + leaveChannel);
            this.mLogReporter.onLeaveChannelReturn();
        }
        this.mbFirstJoin = true;
    }

    public void init() {
        try {
            RtcEngine.destroy();
            this.mRtcEngine = RtcEngine.create(this.mContext, this.mConfig.getAgoraAppId(), this.mRtcEngineEventHandler);
            LogUtil.i("------ Agora SDK version: " + RtcEngine.getSdkVersion());
            this.mLogReporter.setThirdPartyRtcVersion(RtcEngine.getSdkVersion());
            int channelProfile = this.mRtcEngine.setChannelProfile(1);
            if (channelProfile < 0) {
                EngineCallback engineCallback = this.mCallback;
                engineCallback.onInitFailed(10001, "result: " + channelProfile + ", channel profile: 1");
                return;
            }
            int clientRole = this.mRtcEngine.setClientRole(1);
            if (clientRole < 0) {
                EngineCallback engineCallback2 = this.mCallback;
                engineCallback2.onInitFailed(10002, "result: " + clientRole + ", role: 1");
                return;
            }
            Config.VideoQuality videoQuality = this.mConfig.getVideoQuality();
            RtcEngine rtcEngine = this.mRtcEngine;
            VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration(videoQuality.getWidth(), videoQuality.getHeight(), getAgoraFrameRate(videoQuality.getFps()), videoQuality.getBitrate(), VideoEncoderConfiguration.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE);
            int videoEncoderConfiguration2 = rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
            if (videoEncoderConfiguration2 < 0) {
                EngineCallback engineCallback3 = this.mCallback;
                engineCallback3.onInitFailed(10003, "result: " + videoEncoderConfiguration2);
                return;
            }
            if (this.mConfig.getVolumeCallbackInterval() > 0) {
                int enableAudioVolumeIndication = this.mRtcEngine.enableAudioVolumeIndication(this.mConfig.getVolumeCallbackInterval(), 3);
                if (enableAudioVolumeIndication < 0) {
                    EngineCallback engineCallback4 = this.mCallback;
                    engineCallback4.onInitFailed(10004, "result: " + enableAudioVolumeIndication + ", interval: " + this.mConfig.getVolumeCallbackInterval());
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.mConfig.getLogFile())) {
                this.mRtcEngine.setLogFile(this.mConfig.getLogFile());
            }
            this.mRtcEngine.setParameters("{\"che.video.moreFecSchemeEnable\":true}");
            this.mCallback.onInitSuccess();
        } catch (Exception e2) {
            LogUtil.e(e2.toString());
            this.mCallback.onInitFailed(10000, e2.toString());
        }
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        this.mRtcEngine.muteAllRemoteAudioStreams(z);
    }

    public void switchAudio(boolean z) {
        this.mRtcEngine.muteLocalAudioStream(!z);
    }

    private LiveTranscoding.AudioCodecProfileType getAgoraAudioProfile(Config.AudioProfile audioProfile) {
        if (AnonymousClass2.$SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$AudioProfile[audioProfile.ordinal()] != 1) {
            return LiveTranscoding.AudioCodecProfileType.LC_AAC;
        }
        return LiveTranscoding.AudioCodecProfileType.HE_AAC;
    }

    private LiveTranscoding.AudioSampleRateType getAgoraAudioSampleRate(Config.AudioSampleRate audioSampleRate) {
        switch (audioSampleRate) {
            case SAMPLE_RATE_16K:
            case SAMPLE_RATE_32K:
                return LiveTranscoding.AudioSampleRateType.TYPE_32000;
            case SAMPLE_RATE_48K:
                return LiveTranscoding.AudioSampleRateType.TYPE_48000;
            default:
                return LiveTranscoding.AudioSampleRateType.TYPE_44100;
        }
    }

    private LiveTranscoding.VideoCodecType getAgoraVideoCodec(Config.VideoCodec videoCodec) {
        if (AnonymousClass2.$SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$VideoCodec[videoCodec.ordinal()] != 1) {
            return LiveTranscoding.VideoCodecType.H264;
        }
        return LiveTranscoding.VideoCodecType.H265;
    }

    private LiveTranscoding.VideoCodecProfileType getAgoraVideoProfile(Config.VideoProfile videoProfile) {
        switch (videoProfile) {
            case MAIN:
                return LiveTranscoding.VideoCodecProfileType.MAIN;
            case HIGH:
                return LiveTranscoding.VideoCodecProfileType.HIGH;
            default:
                return LiveTranscoding.VideoCodecProfileType.BASELINE;
        }
    }

    private VideoEncoderConfiguration.FRAME_RATE getAgoraFrameRate(int i) {
        if (i <= (VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_1.getValue() + VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_7.getValue()) / 2) {
            return VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_1;
        }
        if (i <= (VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_7.getValue() + VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_10.getValue()) / 2) {
            return VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_7;
        }
        if (i <= (VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_10.getValue() + VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_15.getValue()) / 2) {
            return VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_10;
        }
        if (i <= (VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_15.getValue() + VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_24.getValue()) / 2) {
            return VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_15;
        }
        if (i <= (VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_24.getValue() + VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_30.getValue()) / 2) {
            return VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_24;
        }
        return VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_30;
    }

    public void muteRemoteAudioStream(int i, boolean z) {
        this.mRtcEngine.muteRemoteAudioStream(i, z);
    }

    public void mixStream(List<Region> list, boolean z) {
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR) {
            int i = 0;
            if (this.mConfig.isClientMixStream()) {
                if (!this.mbStreamPublished) {
                    this.mLogReporter.onPublishStream(0);
                    this.mbStreamPublished = true;
                }
            } else if (this.mConfig.getMixStreamConfig() != null) {
                Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
                if (this.mLiveTranscoding == null) {
                    this.mLiveTranscoding = new LiveTranscoding();
                    this.mLiveTranscoding.audioSampleRate = getAgoraAudioSampleRate(mixStreamConfig.getAudioSampleRate());
                    this.mLiveTranscoding.audioChannels = mixStreamConfig.getAudioChannels();
                    this.mLiveTranscoding.audioCodecProfile = getAgoraAudioProfile(mixStreamConfig.getAudioProfile());
                    this.mLiveTranscoding.audioBitrate = mixStreamConfig.getAudioBitrate();
                    this.mLiveTranscoding.width = mixStreamConfig.getVideoWidth();
                    this.mLiveTranscoding.height = mixStreamConfig.getVideoHeight();
                    this.mLiveTranscoding.videoFramerate = mixStreamConfig.getVideoFrameRate();
                    this.mLiveTranscoding.videoBitrate = mixStreamConfig.getVideoBitrate();
                    this.mLiveTranscoding.videoCodecType = getAgoraVideoCodec(mixStreamConfig.getVideoCodec());
                    this.mLiveTranscoding.videoCodecProfile = getAgoraVideoProfile(mixStreamConfig.getVideoProfile());
                    this.mLiveTranscoding.videoGop = (int) (mixStreamConfig.getVideoGop() * ((float) mixStreamConfig.getVideoFrameRate()));
                    this.mLiveTranscoding.setBackgroundColor(mixStreamConfig.getBackgroundColor());
                }
                this.mLiveTranscoding.setUsers(null);
                this.mLiveTranscoding.userConfigExtraInfo = null;
                if (list != null) {
                    for (Region next : list) {
                        LiveTranscoding.TranscodingUser transcodingUser = new LiveTranscoding.TranscodingUser();
                        transcodingUser.uid = next.getInteractId();
                        double videoWidth = (double) mixStreamConfig.getVideoWidth();
                        double x = next.getX();
                        Double.isNaN(videoWidth);
                        transcodingUser.x = (int) (videoWidth * x);
                        double videoHeight = (double) mixStreamConfig.getVideoHeight();
                        double y = next.getY();
                        Double.isNaN(videoHeight);
                        transcodingUser.y = (int) (videoHeight * y);
                        double videoWidth2 = (double) mixStreamConfig.getVideoWidth();
                        double width = next.getWidth();
                        Double.isNaN(videoWidth2);
                        transcodingUser.width = (int) (videoWidth2 * width);
                        double videoHeight2 = (double) mixStreamConfig.getVideoHeight();
                        double height = next.getHeight();
                        Double.isNaN(videoHeight2);
                        transcodingUser.height = (int) (videoHeight2 * height);
                        transcodingUser.zOrder = i;
                        this.mLiveTranscoding.addUser(transcodingUser);
                        i++;
                    }
                    String createSei = createSei(list);
                    LogUtil.i(createSei);
                    this.mLiveTranscoding.userConfigExtraInfo = createSei;
                }
                this.mRtcEngine.setLiveTranscoding(this.mLiveTranscoding);
                if (!this.mbStreamPublished) {
                    this.mLogReporter.onPublishStream(this.mRtcEngine.addPublishStreamUrl(mixStreamConfig.getStreamUrl(), true));
                    this.mbStreamPublished = true;
                }
            }
        }
    }

    public AgoraEngine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        super(config, videoClientFactory, audioClientFactory, engineCallback);
        RtcEngineImpl.loadNativeLibrary();
    }
}
