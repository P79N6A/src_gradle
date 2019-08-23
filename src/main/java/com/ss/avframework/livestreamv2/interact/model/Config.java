package com.ss.avframework.livestreamv2.interact.model;

import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import javax.microedition.khronos.egl.EGLContext;

public class Config {
    private String mAgoraAppId = "";
    private String mAgoraAppKey = "";
    private boolean mAutoPlayRemoteAudio;
    private boolean mAutoUpdateSeiForTalk;
    private String mByteAppId = "";
    private String mByteToken = "";
    private String mChannelName = "";
    private Character mCharacter = Character.GUEST;
    private boolean mClientMixStream;
    private Context mContext;
    private String mDeviceId = "";
    private EGLContext mEGLContext;
    private long mEGLNativeAddr;
    private FrameFormat mFrameFormat = FrameFormat.TEXTURE_2D;
    private Handler mHandler;
    private int mInteractId;
    private InteractMode mInteractMode = InteractMode.NORMAL;
    private String mLogFile;
    private int mLogReportInterval = 2;
    private MixStreamConfig mMixStreamConfig;
    private int mOutPlayerAudioChannel = 1;
    private int mOutPlayerAudioSampleHz = 16000;
    private String mProjectKey = "";
    private int mSeiVersion;
    private boolean mTest;
    private Type mType = Type.VIDEO;
    private int mUpdateTalkSeiInterval = 900;
    private long mUserId;
    private Vendor mVendor = Vendor.AGORA;
    private VideoQuality mVideoQuality = VideoQuality.GUEST_NORMAL;
    private int mVolumeCallbackInterval;
    private int mVolumeThreshold;
    private long mZegoAppId;
    private byte[] mZegoSignature;
    private int mixedStreamDefaultLayout = 3;
    private int mixedStreamLifecycle = 2;

    public enum AudioProfile {
        LC,
        HE
    }

    public enum AudioSampleRate {
        SAMPLE_RATE_16K,
        SAMPLE_RATE_32K,
        SAMPLE_RATE_44K,
        SAMPLE_RATE_48K
    }

    public enum Character {
        ANCHOR,
        GUEST
    }

    public enum FrameFormat {
        TEXTURE_2D,
        TEXTURE_OES
    }

    public enum InteractMode {
        PK,
        NORMAL
    }

    public static class MixStreamConfig {
        private int audioBitrate = SearchJediMixFeedAdapter.f42517f;
        private int audioChannels = 2;
        private AudioProfile audioProfile = AudioProfile.LC;
        private AudioSampleRate audioSampleRate = AudioSampleRate.SAMPLE_RATE_44K;
        private int backgroundColor;
        private String mStreamUrl = "";
        private int videoBitrate = 800;
        private VideoCodec videoCodec = VideoCodec.H264;
        private int videoFrameRate = 15;
        private float videoGop = 2.0f;
        private int videoHeight = 640;
        private VideoProfile videoProfile = VideoProfile.HIGH;
        private int videoWidth = 360;

        public int getAudioBitrate() {
            return this.audioBitrate;
        }

        public int getAudioChannels() {
            return this.audioChannels;
        }

        public AudioProfile getAudioProfile() {
            return this.audioProfile;
        }

        public AudioSampleRate getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getStreamUrl() {
            return this.mStreamUrl;
        }

        public int getVideoBitrate() {
            return this.videoBitrate;
        }

        public VideoCodec getVideoCodec() {
            return this.videoCodec;
        }

        public int getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public float getVideoGop() {
            return this.videoGop;
        }

        public int getVideoHeight() {
            return this.videoHeight;
        }

        public int getVideoWidth() {
            return this.videoWidth;
        }

        public VideoProfile getVideoProfile() {
            if (this.videoCodec == VideoCodec.H265) {
                this.videoProfile = VideoProfile.MAIN;
            }
            return this.videoProfile;
        }

        public int getAudioSampleRateValue() {
            switch (this.audioSampleRate) {
                case SAMPLE_RATE_16K:
                    return 16000;
                case SAMPLE_RATE_32K:
                    return 32000;
                case SAMPLE_RATE_48K:
                    return 48000;
                default:
                    return 44100;
            }
        }

        public MixStreamConfig setAudioProfile(AudioProfile audioProfile2) {
            this.audioProfile = audioProfile2;
            return this;
        }

        public MixStreamConfig setAudioSampleRate(AudioSampleRate audioSampleRate2) {
            this.audioSampleRate = audioSampleRate2;
            return this;
        }

        public MixStreamConfig setBackgroundColor(int i) {
            this.backgroundColor = i;
            return this;
        }

        public MixStreamConfig setStreamUrl(String str) {
            this.mStreamUrl = str;
            return this;
        }

        public MixStreamConfig setVideoCodec(VideoCodec videoCodec2) {
            this.videoCodec = videoCodec2;
            return this;
        }

        public MixStreamConfig setVideoProfile(VideoProfile videoProfile2) {
            this.videoProfile = videoProfile2;
            return this;
        }

        public MixStreamConfig setAudioBitrate(int i) {
            if (i < 32) {
                i = 32;
            } else if (i > 256) {
                i = 256;
            }
            this.audioBitrate = i;
            return this;
        }

        public MixStreamConfig setAudioChannels(int i) {
            if (!(i == 1 || i == 2)) {
                i = 2;
            }
            this.audioChannels = i;
            return this;
        }

        public MixStreamConfig setVideoBitrate(int i) {
            if (i < 100) {
                i = 100;
            } else if (i > 5000) {
                i = 5000;
            }
            this.videoBitrate = i;
            return this;
        }

        public MixStreamConfig setVideoFrameRate(int i) {
            if (i < 5) {
                i = 5;
            } else if (i > 50) {
                i = 50;
            }
            this.videoFrameRate = i;
            return this;
        }

        public MixStreamConfig setVideoGop(float f2) {
            if (f2 < 1.0f) {
                f2 = 1.0f;
            } else if (f2 > 10.0f) {
                f2 = 10.0f;
            }
            this.videoGop = f2;
            return this;
        }

        public MixStreamConfig setAudioSampleRate(int i) {
            int[] iArr = {16000, 32000, 44100, 48000};
            AudioSampleRate[] audioSampleRateArr = {AudioSampleRate.SAMPLE_RATE_16K, AudioSampleRate.SAMPLE_RATE_32K, AudioSampleRate.SAMPLE_RATE_44K, AudioSampleRate.SAMPLE_RATE_48K};
            for (int i2 = 0; i2 < 4; i2++) {
                if (i <= iArr[i2]) {
                    this.audioSampleRate = audioSampleRateArr[i2];
                    return this;
                }
            }
            this.audioSampleRate = AudioSampleRate.SAMPLE_RATE_44K;
            return this;
        }

        public MixStreamConfig setVideoSize(int i, int i2) {
            this.videoWidth = i;
            this.videoHeight = i2;
            return this;
        }
    }

    public enum Type {
        AUDIO,
        VIDEO
    }

    public enum Vendor {
        AGORA,
        ZEGO,
        BYTE
    }

    public enum VideoCodec {
        H264,
        H265
    }

    public enum VideoOutputFormat {
        PIXEL_FORMAT_UNKNOWN,
        PIXEL_FORMAT_I420,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_BGRA32,
        PIXEL_FORMAT_RGBA32,
        PIXEL_FORMAT_ARGB32,
        PIXEL_FORMAT_ABGR32,
        TEXTURE_2D,
        TEXTURE_OES
    }

    public enum VideoProfile {
        BASELINE,
        MAIN,
        HIGH
    }

    public static class VideoQuality {
        public static final VideoQuality ANCHOR_HIGH = new VideoQuality(480, 848, 15, 1200);
        public static final VideoQuality ANCHOR_NORMAL = new VideoQuality(360, 640, 15, 800);
        public static final VideoQuality GUEST_HIGH = new VideoQuality(240, 320, 15, 360);
        public static final VideoQuality GUEST_NORMAL = new VideoQuality(180, 240, 15, 240);
        public static final VideoQuality MIN = new VideoQuality(16, 16, 15, 50);
        private int mBitrate;
        private int mFps;
        private int mHeight;
        private int mWidth;

        public int getBitrate() {
            return this.mBitrate;
        }

        public int getFps() {
            return this.mFps;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getWidth() {
            return this.mWidth;
        }

        VideoQuality(int i, int i2, int i3, int i4) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mFps = i3;
            this.mBitrate = i4;
        }
    }

    public String getAgoraAppId() {
        return this.mAgoraAppId;
    }

    public String getAgoraAppKey() {
        return this.mAgoraAppKey;
    }

    public String getByteAppId() {
        return this.mByteAppId;
    }

    public String getByteToken() {
        return this.mByteToken;
    }

    public String getChannelName() {
        return this.mChannelName;
    }

    public Character getCharacter() {
        return this.mCharacter;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public long getEGLNativeAddr() {
        return this.mEGLNativeAddr;
    }

    public FrameFormat getFrameFormat() {
        return this.mFrameFormat;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public int getInteractId() {
        return this.mInteractId;
    }

    public InteractMode getInteractMode() {
        return this.mInteractMode;
    }

    public String getLogFile() {
        return this.mLogFile;
    }

    public int getLogReportInterval() {
        return this.mLogReportInterval;
    }

    public MixStreamConfig getMixStreamConfig() {
        return this.mMixStreamConfig;
    }

    public int getMixedStreamDefaultLayout() {
        return this.mixedStreamDefaultLayout;
    }

    public int getMixedStreamLifecycle() {
        return this.mixedStreamLifecycle;
    }

    public int getOutPlayerAudioChannel() {
        return this.mOutPlayerAudioChannel;
    }

    public int getOutPlayerAudioSampleHz() {
        return this.mOutPlayerAudioSampleHz;
    }

    public String getProjectKey() {
        return this.mProjectKey;
    }

    public int getSeiVersion() {
        return this.mSeiVersion;
    }

    public EGLContext getSharedEGLContext() {
        return this.mEGLContext;
    }

    public Type getType() {
        return this.mType;
    }

    public int getUpdateTalkSeiInterval() {
        return this.mUpdateTalkSeiInterval;
    }

    public long getUserId() {
        return this.mUserId;
    }

    public Vendor getVendor() {
        return this.mVendor;
    }

    public VideoQuality getVideoQuality() {
        return this.mVideoQuality;
    }

    public int getVolumeCallbackInterval() {
        return this.mVolumeCallbackInterval;
    }

    public long getZegoAppId() {
        return this.mZegoAppId;
    }

    public byte[] getZegoSignature() {
        return this.mZegoSignature;
    }

    public boolean isAutoUpdateSeiForTalk() {
        return this.mAutoUpdateSeiForTalk;
    }

    public boolean isClientMixStream() {
        return this.mClientMixStream;
    }

    public boolean isTest() {
        return this.mTest;
    }

    public boolean isAutoPlayRemoteAudio() {
        if (!this.mClientMixStream || this.mAutoPlayRemoteAudio) {
            return true;
        }
        return false;
    }

    public int getVolumeThreshold() {
        if (this.mVolumeThreshold > 0) {
            return this.mVolumeThreshold;
        }
        if (this.mVendor == Vendor.ZEGO) {
            return 11;
        }
        return 30;
    }

    public Config setAgoraAppId(String str) {
        this.mAgoraAppId = str;
        return this;
    }

    public Config setAgoraAppKey(String str) {
        this.mAgoraAppKey = str;
        return this;
    }

    public Config setAutoPlayRemoteAudio(boolean z) {
        this.mAutoPlayRemoteAudio = z;
        return this;
    }

    public Config setAutoUpdateSeiForTalk(boolean z) {
        this.mAutoUpdateSeiForTalk = z;
        return this;
    }

    public Config setByteAppId(String str) {
        this.mByteAppId = str;
        return this;
    }

    public Config setByteToken(String str) {
        this.mByteToken = str;
        return this;
    }

    public Config setChannelName(String str) {
        this.mChannelName = str;
        return this;
    }

    public Config setCharacter(Character character) {
        this.mCharacter = character;
        return this;
    }

    public Config setClientMixStream(boolean z) {
        this.mClientMixStream = z;
        return this;
    }

    public Config setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public Config setDeviceId(String str) {
        this.mDeviceId = str;
        return this;
    }

    public Config setEGLNativeAddr(long j) {
        this.mEGLNativeAddr = j;
        return this;
    }

    public Config setFrameFormat(FrameFormat frameFormat) {
        this.mFrameFormat = frameFormat;
        return this;
    }

    public Config setHandler(Handler handler) {
        this.mHandler = handler;
        return this;
    }

    public Config setInteractId(int i) {
        this.mInteractId = i;
        return this;
    }

    public Config setInteractMode(InteractMode interactMode) {
        this.mInteractMode = interactMode;
        return this;
    }

    public Config setLogFile(String str) {
        this.mLogFile = str;
        return this;
    }

    public Config setLogReportInterval(int i) {
        this.mLogReportInterval = i;
        return this;
    }

    public Config setMixStreamConfig(MixStreamConfig mixStreamConfig) {
        this.mMixStreamConfig = mixStreamConfig;
        return this;
    }

    public Config setMixedStreamDefaultLayout(int i) {
        this.mixedStreamDefaultLayout = i;
        return this;
    }

    public Config setMixedStreamLifecycle(int i) {
        this.mixedStreamLifecycle = i;
        return this;
    }

    public Config setOutPlayerAudioChannel(int i) {
        this.mOutPlayerAudioChannel = i;
        return this;
    }

    public Config setOutPlayerAudioSampleHz(int i) {
        this.mOutPlayerAudioSampleHz = i;
        return this;
    }

    public Config setProjectKey(String str) {
        this.mProjectKey = str;
        return this;
    }

    public Config setSeiVersion(int i) {
        this.mSeiVersion = i;
        return this;
    }

    public Config setSharedEGLContext(EGLContext eGLContext) {
        this.mEGLContext = eGLContext;
        return this;
    }

    public Config setTest(boolean z) {
        this.mTest = z;
        return this;
    }

    public Config setType(Type type) {
        this.mType = type;
        return this;
    }

    public Config setUpdateTalkSeiInterval(int i) {
        this.mUpdateTalkSeiInterval = i;
        return this;
    }

    public Config setUserId(long j) {
        this.mUserId = j;
        return this;
    }

    public Config setVendor(Vendor vendor) {
        this.mVendor = vendor;
        return this;
    }

    public Config setVideoQuality(VideoQuality videoQuality) {
        this.mVideoQuality = videoQuality;
        return this;
    }

    public Config setVolumeCallbackInterval(int i) {
        this.mVolumeCallbackInterval = i;
        return this;
    }

    public Config setVolumeThreshold(int i) {
        this.mVolumeThreshold = i;
        return this;
    }

    public Config setZegoAppId(long j) {
        this.mZegoAppId = j;
        return this;
    }

    public Config setZegoSignature(byte[] bArr) {
        this.mZegoSignature = bArr;
        return this;
    }
}
