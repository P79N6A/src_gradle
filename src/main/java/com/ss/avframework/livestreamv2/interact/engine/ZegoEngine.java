package com.ss.avframework.livestreamv2.interact.engine;

import android.app.Application;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.avframework.livestreamv2.interact.LogReporter;
import com.ss.avframework.livestreamv2.interact.LogUtil;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.audio.ZegoAudioClient;
import com.ss.avframework.livestreamv2.interact.audio.ZegoAudioSink;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.livestreamv2.interact.model.Region;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.ss.avframework.livestreamv2.interact.video.ZegoVideoClient;
import com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink;
import com.zego.zegoavkit2.ZegoExternalVideoCapture;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice;
import com.zego.zegoavkit2.ZegoVideoCaptureFactory;
import com.zego.zegoavkit2.audiodevice.ZegoExternalAudioDevice;
import com.zego.zegoavkit2.mixstream.IZegoMixStreamExCallback;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamConfig;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamInfo;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamOutput;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamResultEx;
import com.zego.zegoavkit2.mixstream.ZegoStreamMixer;
import com.zego.zegoavkit2.soundlevel.IZegoSoundLevelCallback;
import com.zego.zegoavkit2.soundlevel.ZegoSoundLevelInfo;
import com.zego.zegoavkit2.soundlevel.ZegoSoundLevelMonitor;
import com.zego.zegoliveroom.ZegoLiveRoom;
import com.zego.zegoliveroom.callback.IZegoAVEngineCallback;
import com.zego.zegoliveroom.callback.IZegoInitSDKCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.callback.IZegoLivePlayerCallback;
import com.zego.zegoliveroom.callback.IZegoLivePublisherCallback;
import com.zego.zegoliveroom.callback.IZegoLoginCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoRoomCallback;
import com.zego.zegoliveroom.constants.ZegoAvConfig;
import com.zego.zegoliveroom.entity.AuxData;
import com.zego.zegoliveroom.entity.ZegoPlayStreamQuality;
import com.zego.zegoliveroom.entity.ZegoPublishStreamQuality;
import com.zego.zegoliveroom.entity.ZegoStreamInfo;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ZegoEngine extends Engine {
    private static ZegoLiveRoom.SDKContext sSDKContext;
    private boolean bExternalAudioDevice;
    private boolean isStarting;
    private ZegoAudioClient mAudioClient;
    private ZegoAudioSink mAudioSink;
    public ZegoStreamInfo[] mCurrentUserInRoom;
    public ZegoSoundLevelInfo[] mGuestSoundLevelInfos;
    private IZegoLiveEventCallback mLiveEventCallback = new IZegoLiveEventCallback() {
        public void onLiveEvent(int i, HashMap<String, String> hashMap) {
            if (i == 3) {
                ZegoEngine.this.mLogReporter.onReconnecting();
                EngineCallback engineCallback = ZegoEngine.this.mCallback;
                engineCallback.onWarn("zego onLiveEvent Publish_BeginRetry: " + hashMap);
            } else if (i == 4) {
                ZegoEngine.this.mLogReporter.onReconnected();
                EngineCallback engineCallback2 = ZegoEngine.this.mCallback;
                engineCallback2.onWarn("zego onLiveEvent Publish_RetrySuccess: " + hashMap);
            } else {
                if (i == 7) {
                    if (hashMap.containsKey("StreamID")) {
                        ZegoEngine.this.mRemoteVideoFrozen.put(ZegoEngine.splitInteractIdFromStreamId(hashMap.get("StreamID")), Long.valueOf(System.currentTimeMillis()));
                    }
                } else if (i == 8 && hashMap.containsKey("StreamID")) {
                    String splitInteractIdFromStreamId = ZegoEngine.splitInteractIdFromStreamId(hashMap.get("StreamID"));
                    if (ZegoEngine.this.mRemoteVideoFrozen.containsKey(splitInteractIdFromStreamId) && ZegoEngine.this.mRemoteVideoFrozen.get(splitInteractIdFromStreamId).longValue() != 0) {
                        ZegoEngine.this.mLogReporter.onRemoteVideoFrozen(splitInteractIdFromStreamId, (int) (System.currentTimeMillis() - ZegoEngine.this.mRemoteVideoFrozen.get(splitInteractIdFromStreamId).longValue()));
                        ZegoEngine.this.mRemoteVideoFrozen.put(splitInteractIdFromStreamId, 0L);
                    }
                }
            }
        }
    };
    private IZegoLivePlayerCallback mLivePlayerCallback = new IZegoLivePlayerCallback() {
        public void onInviteJoinLiveRequest(int i, String str, String str2, String str3) {
        }

        public void onPlayStateUpdate(int i, String str) {
        }

        public void onRecvEndJoinLiveCommand(String str, String str2, String str3) {
        }

        public void onVideoSizeChangedTo(String str, int i, int i2) {
        }

        public void onPlayQualityUpdate(String str, ZegoPlayStreamQuality zegoPlayStreamQuality) {
            LogUtil.d("onPlayQualityUpdate, stream id: " + str + ", quality: " + zegoPlayStreamQuality.quality + ", delay: " + zegoPlayStreamQuality.delay);
            ZegoEngine.this.mCallback.onStreamDelay(zegoPlayStreamQuality.delay);
            ZegoEngine.this.mReceiveAudioBitrate = (int) zegoPlayStreamQuality.akbps;
            ZegoEngine.this.mReceiveVideoBitrate = (int) zegoPlayStreamQuality.vkbps;
            ZegoEngine.this.mStatUid = ZegoEngine.splitInteractIdFromStreamId(str);
        }
    };
    private IZegoLivePublisherCallback mLivePublisherCallback = new IZegoLivePublisherCallback() {
        public AuxData onAuxCallback(int i) {
            return null;
        }

        public void onCaptureVideoSizeChangedTo(int i, int i2) {
        }

        public void onJoinLiveRequest(int i, String str, String str2, String str3) {
        }

        public void onCaptureVideoFirstFrame() {
            LogUtil.d("onCaptureVideoFirstFrame");
        }

        public void onPublishQualityUpdate(String str, ZegoPublishStreamQuality zegoPublishStreamQuality) {
            LogUtil.d("onPublishQualityUpdate, stream id: " + str + ", quality: " + zegoPublishStreamQuality.quality);
            ZegoEngine.this.mCallback.onPushStreamQuality((long) zegoPublishStreamQuality.vkbps, (long) zegoPublishStreamQuality.akbps);
            ZegoEngine.this.mSendAudioBitrate = (int) zegoPublishStreamQuality.akbps;
            ZegoEngine.this.mSendVideoBitrate = (int) zegoPublishStreamQuality.vnetFps;
            ZegoEngine.this.mSendVideoFrameRate = (int) zegoPublishStreamQuality.vnetFps;
            ZegoEngine.this.mUserCount = ZegoEngine.this.getGuestList().size() + 1;
        }

        public void onMixStreamConfigUpdate(int i, String str, HashMap<String, Object> hashMap) {
            LogUtil.d("onMixStreamConfigUpdate: " + i + "， mixStreamID: " + str);
        }

        public void onPublishStateUpdate(int i, String str, HashMap<String, Object> hashMap) {
            LogUtil.d("onPublishStateUpdate, stateCode: " + i + ", streamID: " + str);
            if (i == 0) {
                ZegoEngine.this.mSoundLevelMonitor = ZegoSoundLevelMonitor.getInstance();
                if (ZegoEngine.this.mConfig.getVolumeCallbackInterval() > 0) {
                    ZegoEngine.this.mSoundLevelMonitor.setCycle(ZegoEngine.this.mConfig.getVolumeCallbackInterval());
                    ZegoEngine.this.mSoundLevelMonitor.setCallback(new IZegoSoundLevelCallback() {
                        public void onSoundLevelUpdate(ZegoSoundLevelInfo[] zegoSoundLevelInfoArr) {
                            ZegoEngine.this.mGuestSoundLevelInfos = zegoSoundLevelInfoArr;
                        }

                        public void onCaptureSoundLevelUpdate(ZegoSoundLevelInfo zegoSoundLevelInfo) {
                            int i;
                            boolean z;
                            int i2;
                            boolean z2;
                            if (ZegoEngine.this.mGuestSoundLevelInfos == null || ZegoEngine.this.mGuestSoundLevelInfos.length <= 0) {
                                i = 1;
                            } else {
                                i = ZegoEngine.this.mGuestSoundLevelInfos.length + 1;
                            }
                            String[] strArr = new String[i];
                            boolean[] zArr = new boolean[i];
                            int volumeThreshold = ZegoEngine.this.mConfig.getVolumeThreshold();
                            String splitInteractIdFromStreamId = ZegoEngine.splitInteractIdFromStreamId(zegoSoundLevelInfo.streamID);
                            int i3 = (int) zegoSoundLevelInfo.soundLevel;
                            strArr[0] = splitInteractIdFromStreamId;
                            if (i3 >= volumeThreshold) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zArr[0] = z;
                            if (ZegoEngine.this.mGuestSoundLevelInfos == null) {
                                i2 = 0;
                            } else {
                                i2 = ZegoEngine.this.mGuestSoundLevelInfos.length;
                            }
                            int i4 = 0;
                            while (i4 < i2) {
                                ZegoSoundLevelInfo zegoSoundLevelInfo2 = ZegoEngine.this.mGuestSoundLevelInfos[i4];
                                i4++;
                                strArr[i4] = ZegoEngine.splitInteractIdFromStreamId(zegoSoundLevelInfo2.streamID);
                                if (((int) zegoSoundLevelInfo2.soundLevel) >= volumeThreshold) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zArr[i4] = z2;
                            }
                            ZegoEngine.this.onTalkStateUpdated(strArr, zArr);
                        }
                    });
                    ZegoEngine.this.mSoundLevelMonitor.start();
                } else if (ZegoEngine.this.mSoundLevelMonitor != null) {
                    ZegoEngine.this.mSoundLevelMonitor.stop();
                }
                ZegoEngine.this.continueStart(2);
                ZegoEngine.this.onUserJoined(ZegoEngine.this.mCurrentUserInRoom);
                ZegoEngine.this.mShouldReport = true;
                return;
            }
            LogUtil.e("onStartFailed, state code: " + i);
            ZegoEngine zegoEngine = ZegoEngine.this;
            zegoEngine.onStartFailed(20004, "state code: " + i);
        }
    };
    private IZegoMixStreamExCallback mMixStreamExCallback = new IZegoMixStreamExCallback() {
        public void onMixStreamExConfigUpdate(int i, String str, ZegoMixStreamResultEx zegoMixStreamResultEx) {
            if (i != 0) {
                LogUtil.d("Mix stream error: stateCode " + i + ", mixStreamID " + str);
            }
        }
    };
    private ZegoMixStreamConfig mMixStreamInfo;
    public Map<String, Long> mRemoteVideoFrozen = new HashMap();
    private IZegoRoomCallback mRoomCallback = new IZegoRoomCallback() {
        public void onReconnect(int i, String str) {
        }

        public void onRecvCustomCommand(String str, String str2, String str3, String str4) {
        }

        public void onStreamExtraInfoUpdated(ZegoStreamInfo[] zegoStreamInfoArr, String str) {
        }

        public void onKickOut(int i, String str) {
            EngineCallback engineCallback = ZegoEngine.this.mCallback;
            engineCallback.onWarn("zego onKickOut, reason: " + i + ", roomId: " + str);
        }

        public void onDisconnect(int i, String str) {
            ZegoEngine.this.mLogReporter.onConnectionLost();
            ZegoEngine.this.mLogReporter.onConnectFailed(i, "onDisconnect");
            EngineCallback engineCallback = ZegoEngine.this.mCallback;
            engineCallback.onError("zego onDisconnect, errorCode: " + i + ", roomId: " + str);
        }

        public void onTempBroken(int i, String str) {
            ZegoEngine.this.mLogReporter.onConnectFailed(i, "onTempBroken");
            EngineCallback engineCallback = ZegoEngine.this.mCallback;
            engineCallback.onWarn("zego onTempBroken, errorCode: " + i + ", roomId: " + str);
        }

        public void onStreamUpdated(int i, ZegoStreamInfo[] zegoStreamInfoArr, String str) {
            if (zegoStreamInfoArr != null && zegoStreamInfoArr.length > 0) {
                switch (i) {
                    case 2001:
                        ZegoEngine.this.onUserJoined(zegoStreamInfoArr);
                        return;
                    case 2002:
                        ZegoEngine.this.onUserLeaved(zegoStreamInfoArr);
                        break;
                }
            }
        }
    };
    public ZegoSoundLevelMonitor mSoundLevelMonitor;
    private ZegoVideoSink mVideoSink;
    public ZegoLiveRoom mZegoLiveRoom;
    private ZegoStreamMixer mZegoStreamMixer;
    private int startStatus;

    /* access modifiers changed from: protected */
    public String getVendor() {
        return "zego";
    }

    public void muteAllRemoteAudioStreams(boolean z) {
    }

    public void muteRemoteAudioStream(int i, boolean z) {
    }

    public void destroy() {
        this.mLogReporter.onLeavingChannel();
        if (!this.mZegoLiveRoom.logoutRoom()) {
            LogUtil.d("destroy zego failed");
            this.mCallback.onDestroyFailed(20004, "logout room failed");
        }
        this.mLogReporter.onLeaveChannelReturn();
        super.destroy();
    }

    public void start() {
        int i;
        boolean z;
        EngineCallback engineCallback;
        LogUtil.d("zego start publishing");
        int i2 = 1;
        if (this.mAudioClientFactory != null) {
            this.mAudioClient = new ZegoAudioClient(this.mAudioClientFactory);
        } else {
            this.mZegoLiveRoom.enableMic(true);
        }
        if (this.bExternalAudioDevice) {
            int outPlayerAudioSampleHz = this.mConfig.getOutPlayerAudioSampleHz();
            int outPlayerAudioChannel = this.mConfig.getOutPlayerAudioChannel();
            if (this.mConfig.isClientMixStream()) {
                z = this.mConfig.isAutoPlayRemoteAudio();
            } else {
                z = true;
            }
            if (this.mConfig.isClientMixStream()) {
                engineCallback = this.mCallback;
            } else {
                engineCallback = null;
            }
            ZegoAudioSink zegoAudioSink = new ZegoAudioSink(outPlayerAudioSampleHz, outPlayerAudioChannel, 10, z, engineCallback);
            this.mAudioSink = zegoAudioSink;
        }
        if (this.mConfig.getType() == Config.Type.VIDEO) {
            if (this.mVideoClientFactory == null) {
                this.mZegoLiveRoom.enableCamera(true);
            }
            if (this.mConfig.isClientMixStream()) {
                this.mVideoSink = new ZegoVideoSink(this.mCallback);
            }
        }
        this.isStarting = true;
        if (this.mConfig.getCharacter() != Config.Character.ANCHOR) {
            i2 = 2;
        }
        LogUtil.d("zego start loginRoom");
        boolean loginRoom = this.mZegoLiveRoom.loginRoom(this.mConfig.getChannelName(), i2, new IZegoLoginCompletionCallback() {
            public void onLoginCompletion(int i, ZegoStreamInfo[] zegoStreamInfoArr) {
                if (i != 0) {
                    LogUtil.e("login room failed");
                    ZegoEngine zegoEngine = ZegoEngine.this;
                    zegoEngine.onStartFailed(20001, "login room failed, error code is " + i);
                    ZegoEngine.this.mLogReporter.onErrorOccurs(i);
                    return;
                }
                LogUtil.d("onLoginCompletion");
                ZegoEngine.this.mCurrentUserInRoom = zegoStreamInfoArr;
                ZegoEngine.this.continueStart(1);
                ZegoEngine.this.mLogReporter.onJoinChannelSuccess(ZegoEngine.this.mbFirstJoin);
                ZegoEngine.this.mbFirstJoin = false;
            }
        });
        LogReporter logReporter = this.mLogReporter;
        int i3 = 0;
        if (loginRoom) {
            i = 0;
        } else {
            i = -1;
        }
        logReporter.onJoiningChannel(i);
        ZegoLiveRoom zegoLiveRoom = this.mZegoLiveRoom;
        String streamId = getStreamId(this.mConfig.getInteractId());
        String valueOf = String.valueOf(this.mConfig.getUserId());
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR) {
            i3 = 2;
        }
        if (!zegoLiveRoom.startPublishing(streamId, valueOf, i3)) {
            LogUtil.e("start publishing failed");
            onStartFailed(20002, "start publishing failed");
        }
    }

    public void stop() {
        LogUtil.d("stop zego");
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR && !this.mConfig.isClientMixStream() && this.mZegoStreamMixer != null && this.mMixStreamInfo != null) {
            this.mMixStreamInfo.lenOfUserData = 0;
            this.mMixStreamInfo.inputStreamList = null;
            this.mMixStreamInfo.outputList = null;
            if (this.mZegoStreamMixer.mixStreamEx(this.mMixStreamInfo, getMixStreamId(this.mConfig.getInteractId())) <= 0) {
                LogUtil.e("failed mix stream");
            }
        }
        this.mbStreamPublished = false;
        this.mZegoLiveRoom.enableMic(false);
        this.mZegoLiveRoom.enableAudioRecord(false);
        this.mZegoLiveRoom.enableMicDevice(false);
        this.mZegoLiveRoom.enableCamera(false);
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
        if (this.mVideoSink != null) {
            this.mVideoSink.stop();
            this.mVideoSink.release();
            this.mVideoSink = null;
        }
        boolean stopPublishing = this.mZegoLiveRoom.stopPublishing();
        if (this.mConfig.getVolumeCallbackInterval() > 0 && this.mSoundLevelMonitor != null) {
            this.mSoundLevelMonitor.stop();
        }
        if (stopPublishing) {
            LogUtil.d("stop zego success");
            this.startStatus = 0;
            this.mCallback.onStopSuccess();
            this.mShouldReport = false;
        } else {
            LogUtil.d("stop zego failed");
            this.mCallback.onStopFailed(20003, "stop publishing failed");
        }
        this.mbFirstJoin = true;
    }

    public void init() {
        int i;
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR && !this.mConfig.isClientMixStream() && this.mConfig.getMixStreamConfig() != null) {
            Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
            this.mZegoStreamMixer = new ZegoStreamMixer();
            this.mZegoStreamMixer.setMixStreamExCallback(this.mMixStreamExCallback);
            this.mMixStreamInfo = new ZegoMixStreamConfig();
            this.mMixStreamInfo.outputFps = mixStreamConfig.getVideoFrameRate();
            this.mMixStreamInfo.outputBitrate = mixStreamConfig.getVideoBitrate() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            this.mMixStreamInfo.outputWidth = mixStreamConfig.getVideoWidth();
            this.mMixStreamInfo.outputHeight = mixStreamConfig.getVideoHeight();
            if (mixStreamConfig.getVideoCodec() == Config.VideoCodec.H265) {
                this.mMixStreamInfo.advancedConfig = "video_encode=h265";
            }
            this.mMixStreamInfo.channels = mixStreamConfig.getAudioChannels();
            ZegoMixStreamConfig zegoMixStreamConfig = this.mMixStreamInfo;
            if (mixStreamConfig.getAudioProfile() == Config.AudioProfile.HE) {
                i = 0;
            } else {
                i = 1;
            }
            zegoMixStreamConfig.outputAudioConfig = i;
            this.mMixStreamInfo.outputAudioBitrate = mixStreamConfig.getAudioBitrate() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            this.mMixStreamInfo.outputBackgroundColor = mixStreamConfig.getBackgroundColor() << 8;
            this.mMixStreamInfo.outputList = new ZegoMixStreamOutput[1];
            this.mMixStreamInfo.outputList[0] = new ZegoMixStreamOutput();
            this.mMixStreamInfo.outputList[0].isUrl = true;
            this.mMixStreamInfo.outputList[0].target = mixStreamConfig.getStreamUrl();
        }
        this.mZegoLiveRoom = new ZegoLiveRoom();
        this.mZegoLiveRoom.setLatencyMode(2);
        this.mZegoLiveRoom.setAudioBitrate(80000);
        ZegoAvConfig zegoAvConfig = new ZegoAvConfig(0);
        Config.VideoQuality videoQuality = this.mConfig.getVideoQuality();
        zegoAvConfig.setVideoEncodeResolution(videoQuality.getWidth(), videoQuality.getHeight());
        zegoAvConfig.setVideoCaptureResolution(videoQuality.getWidth(), videoQuality.getHeight());
        zegoAvConfig.setVideoBitrate(videoQuality.getBitrate() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        zegoAvConfig.setVideoFPS(videoQuality.getFps());
        this.mZegoLiveRoom.setAVConfig(zegoAvConfig);
        this.mZegoLiveRoom.setZegoAVEngineCallback(new IZegoAVEngineCallback() {
            public void onAVEngineStart() {
                LogUtil.d("onAVEngineStart");
            }

            public void onAVEngineStop() {
                LogUtil.d("onAVEngineStop, destroy zego success");
                ZegoEngine.this.mZegoLiveRoom.unInitSDK();
                ZegoEngine.this.mCallback.onDestroySuccess();
            }
        });
        this.mZegoLiveRoom.setZegoLivePublisherCallback(this.mLivePublisherCallback);
        this.mZegoLiveRoom.setZegoLivePlayerCallback(this.mLivePlayerCallback);
        this.mZegoLiveRoom.setZegoLiveEventCallback(this.mLiveEventCallback);
        this.mZegoLiveRoom.setZegoRoomCallback(this.mRoomCallback);
        this.mZegoLiveRoom.setPreviewViewMode(1);
        this.mZegoLiveRoom.initSDK(this.mConfig.getZegoAppId(), this.mConfig.getZegoSignature(), new IZegoInitSDKCompletionCallback() {
            public void onInitSDK(int i) {
                if (i == 0) {
                    ZegoEngine.this.mCallback.onInitSuccess();
                    return;
                }
                LogUtil.e("init sdk failed");
                EngineCallback engineCallback = ZegoEngine.this.mCallback;
                engineCallback.onInitFailed(20000, "init sdk failed, error code is " + i);
            }
        });
    }

    public void switchAudio(boolean z) {
        this.mZegoLiveRoom.enableMic(z);
    }

    private String getMixStreamId(int i) {
        return getStreamId(i) + "-mix";
    }

    private String getStreamId(int i) {
        return "s-" + this.mConfig.getChannelName() + "-" + i;
    }

    public static String splitInteractIdFromStreamId(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.contains("-")) {
            return "";
        }
        String[] split = str.split("-");
        if (split.length < 3) {
            return "";
        }
        return split[2];
    }

    public static int splitInteractIdFromUserId(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("_")) {
            return -1;
        }
        String[] split = str.split("_");
        if (split.length <= 0) {
            return -1;
        }
        try {
            return Integer.parseInt(split[0]);
        } catch (Exception unused) {
            return -1;
        }
    }

    private String wrapSEI(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_data", str);
            return jSONObject.toString();
        } catch (JSONException e2) {
            LogUtil.e(e2.toString());
            EngineCallback engineCallback = this.mCallback;
            engineCallback.onWarn("zego wrap sei error: " + e2.toString());
            return null;
        }
    }

    public void continueStart(int i) {
        if (this.isStarting) {
            this.startStatus = i | this.startStatus;
            if (this.startStatus == 3) {
                this.isStarting = false;
                this.mCallback.onStartSuccess();
                if (this.mAudioClient != null) {
                    this.mAudioClient.start();
                }
                if (this.mAudioSink != null) {
                    this.mAudioSink.start();
                }
                if (this.mVideoSink != null) {
                    this.mVideoSink.start();
                }
            }
        }
    }

    public void onUserLeaved(ZegoStreamInfo[] zegoStreamInfoArr) {
        int i;
        if (zegoStreamInfoArr != null && zegoStreamInfoArr.length > 0) {
            for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
                try {
                    i = splitInteractIdFromUserId(zegoStreamInfo.userID);
                } catch (NumberFormatException e2) {
                    LogUtil.e(e2.toString());
                    this.mCallback.onWarn("zego parse user id to int error: " + e2.toString());
                    i = 0;
                }
                this.mLogReporter.onRemoteUserOnlineOffline(false, i);
                this.mZegoLiveRoom.stopPlayingStream(zegoStreamInfo.streamID);
                if (i > 0) {
                    if (this.mVideoSink != null) {
                        this.mVideoSink.onUserLeaved(i);
                    }
                    recordGuestLeaved(i);
                    this.mCallback.onUserLeaved(i);
                }
            }
        }
    }

    public void onUserJoined(ZegoStreamInfo[] zegoStreamInfoArr) {
        if (zegoStreamInfoArr != null && zegoStreamInfoArr.length > 0) {
            for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
                try {
                    int splitInteractIdFromUserId = splitInteractIdFromUserId(zegoStreamInfo.userID);
                    if (splitInteractIdFromUserId > 0) {
                        recordGuestJoined(splitInteractIdFromUserId);
                        if (splitInteractIdFromUserId != this.mConfig.getInteractId()) {
                            this.mCallback.onUserJoined(splitInteractIdFromUserId);
                            this.mLogReporter.onRemoteUserOnlineOffline(true, splitInteractIdFromUserId);
                            this.mCallback.onFirstRemoteAudioFrame(splitInteractIdFromUserId);
                            this.mLogReporter.onFirstRemoteFrame(true, splitInteractIdFromUserId);
                            SurfaceView surfaceView = new SurfaceView(this.mContext);
                            this.mZegoLiveRoom.startPlayingStream(zegoStreamInfo.streamID, surfaceView);
                            this.mCallback.onFirstRemoteVideoFrame(splitInteractIdFromUserId, surfaceView);
                            this.mLogReporter.onFirstRemoteFrame(false, splitInteractIdFromUserId);
                            this.mZegoLiveRoom.setViewMode(1, zegoStreamInfo.streamID);
                            if (this.mConfig.isClientMixStream()) {
                                ZegoVideoSink.enableInternalVideoRender(true, zegoStreamInfo.streamID);
                                if (this.mVideoSink != null) {
                                    this.mVideoSink.onUserJoined(splitInteractIdFromUserId);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } catch (NumberFormatException e2) {
                    LogUtil.e(e2.toString());
                    this.mCallback.onWarn("zego parse user id to int error: " + e2.toString());
                }
            }
        }
    }

    public void onStartFailed(int i, String str) {
        this.isStarting = false;
        this.startStatus = 0;
        this.mCallback.onStartFailed(i, str);
    }

    public void mixStream(List<Region> list, boolean z) {
        int i;
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR) {
            if (this.mConfig.isClientMixStream()) {
                if (!this.mbStreamPublished) {
                    this.mLogReporter.onPublishStream(0);
                    this.mbStreamPublished = true;
                }
            } else if (this.mZegoStreamMixer != null && this.mMixStreamInfo != null) {
                String wrapSEI = wrapSEI(createSei(list));
                byte[] bArr = new byte[0];
                if (wrapSEI != null) {
                    bArr = wrapSEI.getBytes();
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
                allocateDirect.put(bArr);
                this.mMixStreamInfo.userData = allocateDirect;
                this.mMixStreamInfo.lenOfUserData = bArr.length;
                this.mMixStreamInfo.extra = z ^ true ? 1 : 0;
                if (list == null) {
                    i = 0;
                } else {
                    i = list.size();
                }
                ZegoMixStreamInfo[] zegoMixStreamInfoArr = new ZegoMixStreamInfo[i];
                for (int i2 = 0; i2 < i; i2++) {
                    ZegoMixStreamInfo zegoMixStreamInfo = new ZegoMixStreamInfo();
                    Region region = list.get(i2);
                    double d2 = (double) this.mOutputHeight;
                    double y = region.getY();
                    Double.isNaN(d2);
                    zegoMixStreamInfo.top = (int) (d2 * y);
                    int i3 = zegoMixStreamInfo.top;
                    double d3 = (double) this.mOutputHeight;
                    double height = region.getHeight();
                    Double.isNaN(d3);
                    zegoMixStreamInfo.bottom = i3 + ((int) (d3 * height));
                    double d4 = (double) this.mOutputWidth;
                    double x = region.getX();
                    Double.isNaN(d4);
                    zegoMixStreamInfo.left = (int) (d4 * x);
                    int i4 = zegoMixStreamInfo.left;
                    double d5 = (double) this.mOutputWidth;
                    double width = region.getWidth();
                    Double.isNaN(d5);
                    zegoMixStreamInfo.right = i4 + ((int) (d5 * width));
                    zegoMixStreamInfo.streamID = getStreamId(region.getInteractId());
                    zegoMixStreamInfoArr[i2] = zegoMixStreamInfo;
                }
                this.mMixStreamInfo.inputStreamList = zegoMixStreamInfoArr;
                int mixStreamEx = this.mZegoStreamMixer.mixStreamEx(this.mMixStreamInfo, getMixStreamId(this.mConfig.getInteractId()));
                if (mixStreamEx <= 0) {
                    LogUtil.e("failed mix stream");
                }
                if (!this.mbStreamPublished) {
                    this.mLogReporter.onPublishStream(mixStreamEx);
                }
                this.mbStreamPublished = true;
            }
        }
    }

    public ZegoEngine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        super(config, videoClientFactory, audioClientFactory, engineCallback);
        if (sSDKContext == null) {
            AnonymousClass1 r1 = new ZegoLiveRoom.SDKContextEx() {
                public long getLogFileSize() {
                    return 0;
                }

                public String getLogPath() {
                    return null;
                }

                public String getSoFullPath() {
                    return null;
                }

                public Application getAppContext() {
                    return (Application) ZegoEngine.this.mContext.getApplicationContext();
                }
            };
            sSDKContext = r1;
            ZegoLiveRoom.setSDKContext(r1);
            ZegoLiveRoom.setTestEnv(this.mConfig.isTest());
            ZegoLiveRoom.setBusinessType(0);
            ZegoLiveRoom.setVerbose(this.mConfig.isTest());
            LogUtil.i("------ Zego SDK version: " + ZegoLiveRoom.version() + ", version 2: " + ZegoLiveRoom.version2());
            this.mLogReporter.setThirdPartyRtcVersion(ZegoLiveRoom.version());
        }
        ZegoLiveRoom.setUser(this.mConfig.getInteractId() + "_" + this.mConfig.getUserId(), String.valueOf(this.mConfig.getUserId()));
        if (this.mAudioClientFactory != null || this.mConfig.isClientMixStream()) {
            ZegoExternalAudioDevice.enableExternalAudioDevice(true);
            this.bExternalAudioDevice = true;
            if (this.mAudioClientFactory == null && this.mConfig.isClientMixStream()) {
                LogUtil.e("If you want to play audio externally, you should also input audio by yourself !!!");
                throw new AndroidRuntimeException("You need to set an AudioClientFactory !!!");
            } else if (this.mAudioClientFactory != null && !this.mConfig.isClientMixStream()) {
                LogUtil.w("You have set an external audio source, but forget to enable external audio render, the interact sdk will helps you to render it.");
            }
        } else {
            ZegoLiveRoom.setAudioDeviceMode(1);
        }
        if (this.mConfig.getType() == Config.Type.VIDEO) {
            if (this.mVideoClientFactory != null) {
                ZegoExternalVideoCapture.setVideoCaptureFactory(new ZegoVideoCaptureFactory() {
                    /* access modifiers changed from: protected */
                    public void destroy(ZegoVideoCaptureDevice zegoVideoCaptureDevice) {
                    }

                    /* access modifiers changed from: protected */
                    public ZegoVideoCaptureDevice create(String str) {
                        return new ZegoVideoClient(ZegoEngine.this.mVideoClientFactory, ZegoEngine.this.mConfig.getFrameFormat());
                    }
                }, 0);
            }
            if (this.mConfig.isClientMixStream()) {
                ZegoVideoSink.enableExternalVideoRender(true);
            }
        }
        ZegoLiveRoom.requireHardwareDecoder(true);
        ZegoLiveRoom.requireHardwareEncoder(true);
    }
}
