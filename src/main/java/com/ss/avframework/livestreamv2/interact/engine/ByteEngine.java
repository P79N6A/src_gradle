package com.ss.avframework.livestreamv2.interact.engine;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.avframework.livestreamv2.interact.LogReporter;
import com.ss.avframework.livestreamv2.interact.LogUtil;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.livestreamv2.interact.model.Region;
import com.ss.avframework.livestreamv2.interact.video.ByteVideoClient;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.ss.video.rtc.engine.RtcEngine;
import com.ss.video.rtc.engine.VideoCanvas;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.ss.video.rtc.engine.live.LiveTranscoding;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoader;
import com.ss.video.rtc.engine.ui.RenderView;
import com.ss.video.rtc.engine.utils.ExtVideoFrame;
import java.util.List;
import org.json.JSONObject;

public class ByteEngine extends Engine {
    public RtcEngine mRtcEngine;
    private IRtcEngineEventHandler mRtcEngineEventHandler = new IRtcEngineEventHandler() {
        public void onConnectionBanned() {
            ByteEngine.this.mLogReporter.onConnectFailed(-2, "onConnectionBanned");
            ByteEngine.this.mCallback.onError("byte onConnectionBanned");
            LogUtil.e("byte onConnectionBanned");
        }

        public void onConnectionInterrupted() {
            ByteEngine.this.mLogReporter.onConnectFailed(-1, "onConnectionInterrupted");
            ByteEngine.this.mCallback.onWarn("byte onConnectionInterrupted");
            LogUtil.w("byte onConnectionInterrupted");
        }

        public void onConnectionLost() {
            ByteEngine.this.mLogReporter.onConnectionLost();
            ByteEngine.this.mCallback.onWarn("byte onConnectionLost");
            LogUtil.w("byte onConnectionLost");
        }

        public void onLocalVideoStats(IRtcEngineEventHandler.LocalVideoStats localVideoStats) {
            ByteEngine.this.mSendVideoFrameRate = localVideoStats.sentFrameRate;
        }

        public void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
            LogUtil.d("onLeaveChannel");
            ByteEngine.this.mCallback.onStopSuccess();
            ByteEngine.this.mLogReporter.onLeaveChannelReturn();
            ByteEngine.this.mShouldReport = false;
        }

        public void onError(int i) {
            ByteEngine.this.mLogReporter.onErrorOccurs(i);
            EngineCallback engineCallback = ByteEngine.this.mCallback;
            engineCallback.onError("byte onError, code: " + i);
            LogUtil.e("byte error: " + i);
        }

        public void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            ByteEngine.this.mCallback.onPushStreamQuality((long) rtcStats.txVideoKBitRate, (long) rtcStats.txAudioKBitRate);
            ByteEngine.this.mSendAudioBitrate = rtcStats.txAudioKBitRate;
            ByteEngine.this.mReceiveAudioBitrate = rtcStats.rxAudioKBitRate;
            ByteEngine.this.mSendVideoBitrate = rtcStats.txVideoKBitRate;
            ByteEngine.this.mReceiveVideoBitrate = rtcStats.rxVideoKBitRate;
            ByteEngine.this.mUserCount = rtcStats.users;
        }

        public void onWarning(int i) {
            EngineCallback engineCallback = ByteEngine.this.mCallback;
            engineCallback.onWarn("byte onWarning, code: " + i);
            LogUtil.w("byte warning: " + i);
        }

        public void onLogReport(String str, JSONObject jSONObject) {
            ByteEngine.this.mCallback.onLogReport(str, jSONObject);
        }

        public void onUserJoined(String str, int i) {
            LogUtil.d("onUserJoined: " + str);
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt != ByteEngine.this.mConfig.getInteractId()) {
                    ByteEngine.this.recordGuestJoined(parseInt);
                    ByteEngine.this.mCallback.onUserJoined(parseInt);
                    ByteEngine.this.mLogReporter.onRemoteUserOnlineOffline(true, str);
                }
            } catch (NumberFormatException e2) {
                LogUtil.e(e2.toString());
            }
        }

        public void onUserOffline(String str, int i) {
            LogUtil.d("onUserOffline: " + str);
            try {
                int parseInt = Integer.parseInt(str);
                ByteEngine.this.recordGuestLeaved(parseInt);
                ByteEngine.this.mCallback.onUserLeaved(parseInt);
                ByteEngine.this.mLogReporter.onRemoteUserOnlineOffline(false, str);
            } catch (NumberFormatException e2) {
                LogUtil.e(e2.toString());
            }
        }

        public void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            boolean z;
            int length = audioVolumeInfoArr.length;
            String[] strArr = new String[length];
            boolean[] zArr = new boolean[length];
            int volumeThreshold = ByteEngine.this.mConfig.getVolumeThreshold();
            for (int i2 = 0; i2 < length; i2++) {
                IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i2];
                try {
                    int parseInt = Integer.parseInt(audioVolumeInfo.uid);
                    if (parseInt == 0) {
                        parseInt = ByteEngine.this.mConfig.getInteractId();
                    }
                    strArr[i2] = String.valueOf(parseInt);
                    if (audioVolumeInfo.volume >= volumeThreshold) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zArr[i2] = z;
                } catch (NumberFormatException e2) {
                    LogUtil.e(e2.toString());
                }
            }
            ByteEngine.this.onTalkStateUpdated(strArr, zArr);
        }

        public void onFirstRemoteAudioFrame(String str, long j) {
            LogUtil.d("onFirstRemoteAudioFrame: " + str);
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt != ByteEngine.this.mConfig.getInteractId()) {
                    ByteEngine.this.mCallback.onFirstRemoteAudioFrame(parseInt);
                    LogReporter logReporter = ByteEngine.this.mLogReporter;
                    logReporter.onFirstRemoteFrame(true, parseInt);
                }
            } catch (NumberFormatException e2) {
                LogUtil.e(e2.toString());
            }
        }

        public void onJoinChannelSuccess(String str, String str2, int i) {
            LogUtil.d("onJoinChannelSuccess");
            ByteEngine.this.mCallback.onStartSuccess();
            ByteEngine.this.mShouldReport = true;
            ByteEngine.this.mLogReporter.onJoinChannelSuccess(ByteEngine.this.mbFirstJoin);
            ByteEngine.this.mbFirstJoin = false;
            if (ByteEngine.this.mConfig.getType() == Config.Type.VIDEO) {
                ByteEngine.this.mVideoClient.stop();
                ByteEngine.this.mVideoClient.start();
            }
        }

        public void onAudioQuality(String str, int i, short s, short s2) {
            ByteEngine.this.mCallback.onStreamDelay(s);
        }

        public void onFirstRemoteVideoFrame(final String str, int i, int i2, int i3) {
            LogUtil.d("onFirstRemoteVideoFrame: " + str);
            try {
                final int parseInt = Integer.parseInt(str);
                if (parseInt != ByteEngine.this.mConfig.getInteractId()) {
                    ByteEngine.this.mMainThreadHandler.post(new Runnable() {
                        public void run() {
                            RenderView CreateRenderView = RtcEngine.CreateRenderView(ByteEngine.this.mContext);
                            CreateRenderView.setZOrderMediaOverlay(false);
                            ByteEngine.this.mRtcEngine.setupRemoteVideo(new VideoCanvas(CreateRenderView, 1, str));
                            ByteEngine.this.mCallback.onFirstRemoteVideoFrame(parseInt, CreateRenderView);
                        }
                    });
                    LogReporter logReporter = ByteEngine.this.mLogReporter;
                    logReporter.onFirstRemoteFrame(false, parseInt);
                }
            } catch (NumberFormatException e2) {
                LogUtil.e(e2.toString());
            }
        }
    };
    public ByteVideoClient mVideoClient;

    /* access modifiers changed from: protected */
    public String getVendor() {
        return "byte";
    }

    public void destroy() {
        this.mCallback.onDestroySuccess();
        super.destroy();
    }

    public void stop() {
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR && !this.mConfig.isClientMixStream()) {
            this.mRtcEngine.disableLiveTranscoding();
        }
        this.mbStreamPublished = false;
        if (this.mConfig.getType() == Config.Type.VIDEO) {
            this.mVideoClient.stop();
            this.mVideoClient.release();
        }
        this.mLogReporter.onLeavingChannel();
        int leaveChannel = this.mRtcEngine.leaveChannel();
        if (leaveChannel < 0) {
            EngineCallback engineCallback = this.mCallback;
            engineCallback.onStopFailed(30007, "result: " + leaveChannel);
            this.mLogReporter.onLeaveChannelReturn();
        }
        this.mRtcEngine.disableAudio();
        this.mRtcEngine.enableLocalAudio(false);
        this.mbFirstJoin = true;
    }

    public void init() {
        int i;
        try {
            RtcEngine.destroy();
            RtcEngine.setRtcNativeLibraryLoader(new RtcNativeLibraryLoader() {
                public boolean load(String str) {
                    return true;
                }
            });
            this.mRtcEngine = RtcEngine.create(this.mContext, this.mConfig.getByteAppId(), this.mRtcEngineEventHandler);
            LogUtil.i("------ ByteRtc SDK version: " + RtcEngine.getSdkVersion());
            this.mLogReporter.setThirdPartyRtcVersion(RtcEngine.getSdkVersion());
            int channelProfile = this.mRtcEngine.setChannelProfile(1);
            if (channelProfile < 0) {
                EngineCallback engineCallback = this.mCallback;
                engineCallback.onInitFailed(30001, "result: " + channelProfile + ", channel profile: 1");
                return;
            }
            int clientRole = this.mRtcEngine.setClientRole(1);
            if (clientRole < 0) {
                EngineCallback engineCallback2 = this.mCallback;
                engineCallback2.onInitFailed(30002, "result: " + clientRole + ", role: 1");
                return;
            }
            Config.VideoQuality videoQuality = this.mConfig.getVideoQuality();
            if (videoQuality == Config.VideoQuality.ANCHOR_HIGH) {
                i = 46;
            } else {
                if (videoQuality != Config.VideoQuality.ANCHOR_NORMAL) {
                    if (videoQuality == Config.VideoQuality.GUEST_HIGH) {
                        i = 21;
                    } else if (videoQuality == Config.VideoQuality.GUEST_NORMAL) {
                        i = 14;
                    }
                }
                i = 34;
            }
            int videoProfile = this.mRtcEngine.setVideoProfile(i, true);
            if (videoProfile < 0) {
                EngineCallback engineCallback3 = this.mCallback;
                engineCallback3.onInitFailed(10003, "result: " + videoProfile + ", video profile: " + i);
                return;
            }
            if (this.mConfig.getVolumeCallbackInterval() > 0) {
                int enableAudioVolumeIndication = this.mRtcEngine.enableAudioVolumeIndication(this.mConfig.getVolumeCallbackInterval(), 3);
                if (enableAudioVolumeIndication < 0) {
                    EngineCallback engineCallback4 = this.mCallback;
                    engineCallback4.onInitFailed(30004, "result: " + enableAudioVolumeIndication + ", interval: " + this.mConfig.getVolumeCallbackInterval());
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.mConfig.getLogFile())) {
                this.mRtcEngine.setLogFile(this.mConfig.getLogFile());
            }
            this.mCallback.onInitSuccess();
        } catch (Exception e2) {
            LogUtil.e(e2.toString());
            this.mCallback.onInitFailed(30000, e2.toString());
        }
    }

    public void start() {
        String str;
        String str2;
        LiveTranscoding.AACProfile aACProfile;
        this.mRtcEngine.enableAudio();
        if (this.mConfig.getType() == Config.Type.VIDEO) {
            this.mVideoClient = new ByteVideoClient(this.mVideoClientFactory, this.mConfig.getFrameFormat(), new ByteVideoClient.ByteVideoCallback() {
                public boolean updateVideoFrame(ExtVideoFrame extVideoFrame) {
                    if (ByteEngine.this.mRtcEngine.pushExternalVideoFrame(extVideoFrame)) {
                        return true;
                    }
                    LogUtil.e("push external video frame failed");
                    return false;
                }
            });
            this.mRtcEngine.setExternalVideoSource(true, true, true);
            this.mRtcEngine.enableVideo();
            this.mVideoClient.prepare();
        } else {
            this.mRtcEngine.disableVideo();
        }
        this.mRtcEngine.startPreview();
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR && !this.mConfig.isClientMixStream() && this.mConfig.getMixStreamConfig() != null) {
            LiveTranscoding defualtLiveTranscode = LiveTranscoding.getDefualtLiveTranscode();
            Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
            LiveTranscoding.VideoConfig height = defualtLiveTranscode.getVideo().setBitRate(mixStreamConfig.getVideoBitrate() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).setFps(mixStreamConfig.getVideoFrameRate()).setWidth(mixStreamConfig.getVideoWidth()).setHeight(mixStreamConfig.getVideoHeight());
            if (mixStreamConfig.getVideoCodec() == Config.VideoCodec.H264) {
                str2 = "H264";
            } else {
                str2 = "H265";
            }
            height.setCodec(str2).setGop((int) (mixStreamConfig.getVideoGop() * ((float) mixStreamConfig.getVideoFrameRate())));
            LiveTranscoding.AudioConfig sampleRate = defualtLiveTranscode.getAudio().setChannels(mixStreamConfig.getAudioChannels()).setSampleRate(mixStreamConfig.getAudioSampleRateValue());
            if (mixStreamConfig.getAudioProfile() == Config.AudioProfile.HE) {
                aACProfile = LiveTranscoding.AACProfile.HEV1;
            } else {
                aACProfile = LiveTranscoding.AACProfile.LC;
            }
            sampleRate.setAacProfile(aACProfile).setBitRate(mixStreamConfig.getAudioBitrate() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            defualtLiveTranscode.setUrl(mixStreamConfig.getStreamUrl());
            LiveTranscoding.Layout.Builder builder = new LiveTranscoding.Layout.Builder();
            LiveTranscoding.Layout.Region region = new LiveTranscoding.Layout.Region();
            region.uid(String.valueOf(this.mConfig.getInteractId())).position(0.0d, 0.0d).size(1.0d, 1.0d).zorder(0).alpha(1.0d).renderMode(1);
            builder.addRegoin(region);
            defualtLiveTranscode.setLayout(builder.builder());
            this.mRtcEngine.enableLiveTranscoding(defualtLiveTranscode);
        }
        if (this.mConfig.getByteToken() == null) {
            str = "";
        } else {
            str = this.mConfig.getByteToken();
        }
        int joinChannel = this.mRtcEngine.joinChannel(str, this.mConfig.getChannelName(), null, String.valueOf(this.mConfig.getInteractId()));
        this.mLogReporter.onJoiningChannel(joinChannel);
        this.mLogReporter.onPublishStream(joinChannel);
        this.mbStreamPublished = true;
        LogUtil.d("channel name: " + this.mConfig.getChannelName());
        if (joinChannel < 0) {
            EngineCallback engineCallback = this.mCallback;
            engineCallback.onStartFailed(30006, "result: " + joinChannel);
        }
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        this.mRtcEngine.muteAllRemoteAudioStreams(z);
    }

    public void switchAudio(boolean z) {
        this.mRtcEngine.muteLocalAudioStream(!z);
    }

    public void muteRemoteAudioStream(int i, boolean z) {
        this.mRtcEngine.muteRemoteAudioStream(String.valueOf(i), z);
    }

    public void mixStream(List<Region> list, boolean z) {
        if (!this.mConfig.isClientMixStream()) {
            LiveTranscoding.Layout.Builder builder = new LiveTranscoding.Layout.Builder();
            builder.backgroundColor(getBackgroundColorString(this.mBackgroundColor));
            int i = 0;
            for (Region next : list) {
                LiveTranscoding.Layout.Region region = new LiveTranscoding.Layout.Region();
                region.uid(String.valueOf(next.getInteractId())).position(next.getX(), next.getY()).size(next.getWidth(), next.getHeight()).renderMode(1).alpha(1.0d).zorder(i);
                builder.addRegoin(region);
                i++;
            }
            String createSei = createSei(list);
            LogUtil.i(createSei);
            builder.appData(createSei);
            this.mRtcEngine.setVideoCompositingLayout(builder.builder());
        }
    }

    public ByteEngine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        super(config, videoClientFactory, audioClientFactory, engineCallback);
    }
}
