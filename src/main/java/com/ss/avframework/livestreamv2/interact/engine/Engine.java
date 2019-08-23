package com.ss.avframework.livestreamv2.interact.engine;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.avframework.livestreamv2.interact.LogReporter;
import com.ss.avframework.livestreamv2.interact.LogUtil;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.livestreamv2.interact.model.Region;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Engine {
    private int mAnchor;
    AudioClientFactory mAudioClientFactory;
    int mBackgroundColor;
    private List<Region> mCachedRegion;
    EngineCallback mCallback;
    Config mConfig;
    Context mContext;
    private List<Integer> mGuestList;
    private long mLastTimeUpdateSeiForTalk;
    public Runnable mLogReportRunnable;
    protected LogReporter mLogReporter;
    Handler mMainThreadHandler;
    int mOutputHeight;
    int mOutputWidth;
    protected int mReceiveAudioBitrate;
    protected int mReceiveVideoBitrate;
    protected int mSendAudioBitrate;
    protected int mSendVideoBitrate;
    protected int mSendVideoFrameRate;
    protected boolean mShouldReport;
    protected String mStatUid = "";
    private Map<String, Boolean> mTalkStateMap = new HashMap();
    private int mUpdateTalkSeiInterval;
    protected int mUserCount;
    VideoClientFactory mVideoClientFactory;
    protected boolean mbFirstJoin = true;
    protected boolean mbStreamPublished;

    class LogReportRunnable implements Runnable {
        public void run() {
            if (Engine.this.mShouldReport) {
                Engine.this.mLogReporter.onInteractStatus(Engine.this.mSendAudioBitrate, Engine.this.mReceiveAudioBitrate, Engine.this.mSendVideoBitrate, Engine.this.mReceiveVideoBitrate, Engine.this.mSendVideoFrameRate, Engine.this.mUserCount, Engine.this.mStatUid);
                Engine.this.mSendAudioBitrate = 0;
                Engine.this.mReceiveAudioBitrate = 0;
                Engine.this.mSendVideoBitrate = 0;
                Engine.this.mReceiveVideoBitrate = 0;
                Engine.this.mSendVideoFrameRate = 0;
                Engine.this.mUserCount = 0;
                Engine.this.mStatUid = "";
            }
            Engine.this.mMainThreadHandler.postDelayed(Engine.this.mLogReportRunnable, (long) (Engine.this.mConfig.getLogReportInterval() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
        }

        private LogReportRunnable() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract String getVendor();

    public abstract void init();

    public abstract void mixStream(List<Region> list, boolean z);

    public abstract void muteAllRemoteAudioStreams(boolean z);

    public abstract void muteRemoteAudioStream(int i, boolean z);

    public abstract void start();

    public abstract void stop();

    public abstract void switchAudio(boolean z);

    public int getAnchor() {
        return this.mAnchor;
    }

    public List<Integer> getGuestList() {
        return this.mGuestList;
    }

    public int getOutputHeight() {
        return this.mOutputHeight;
    }

    public int getOutputWidth() {
        return this.mOutputWidth;
    }

    public void destroy() {
        this.mMainThreadHandler.removeCallbacks(this.mLogReportRunnable);
    }

    private void configStreamParameters() {
        Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
        if (mixStreamConfig != null) {
            this.mOutputWidth = mixStreamConfig.getVideoWidth();
            this.mOutputHeight = mixStreamConfig.getVideoHeight();
            this.mBackgroundColor = mixStreamConfig.getBackgroundColor();
        }
    }

    public void mixStream(List<Region> list) {
        mixStream(list, true);
    }

    public String getBackgroundColorString(int i) {
        int i2;
        char[] cArr = new char[7];
        cArr[0] = '#';
        for (int i3 = 0; i3 < 6; i3++) {
            char c2 = (char) (i & 15);
            i >>= 4;
            if (c2 <= 9) {
                i2 = c2 + '0';
            } else {
                i2 = (c2 + 'A') - 10;
            }
            cArr[6 - i3] = (char) i2;
        }
        return new String(cArr);
    }

    /* access modifiers changed from: package-private */
    public void recordGuestJoined(int i) {
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR) {
            Iterator<Integer> it2 = this.mGuestList.iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() == i) {
                    it2.remove();
                }
            }
            this.mGuestList.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    public void recordGuestLeaved(int i) {
        this.mTalkStateMap.remove(String.valueOf(i));
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR) {
            Iterator<Integer> it2 = this.mGuestList.iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() == i) {
                    it2.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String createSei(List<Region> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", this.mConfig.getSeiVersion());
            jSONObject.put("vendor", getVendor());
            jSONObject.put("timestamp", System.currentTimeMillis());
            JSONArray jSONArray = new JSONArray();
            for (Region next : list) {
                if (next.needWriteToSei()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", next.getMediaType());
                    int i = 1;
                    jSONObject2.put("alpha", 1);
                    jSONObject2.put("w", next.getWidth());
                    jSONObject2.put("h", next.getHeight());
                    jSONObject2.put("x", next.getX());
                    jSONObject2.put("y", next.getY());
                    jSONObject2.put("account", next.getUserId());
                    jSONObject2.put("uid", next.getInteractId());
                    jSONObject2.put("zorder", 0);
                    jSONObject2.put("stat", next.getStatus());
                    String valueOf = String.valueOf(next.getInteractId());
                    if (!this.mTalkStateMap.containsKey(valueOf) || !this.mTalkStateMap.get(valueOf).booleanValue()) {
                        i = 0;
                    }
                    jSONObject2.put("talk", i);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("grids", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", this.mOutputWidth);
            jSONObject3.put("height", this.mOutputHeight);
            jSONObject3.put("background", getBackgroundColorString(this.mBackgroundColor));
            jSONObject.put("canvas", jSONObject3);
            this.mCachedRegion = list;
            return jSONObject.toString();
        } catch (JSONException e2) {
            LogUtil.e(e2.toString());
            EngineCallback engineCallback = this.mCallback;
            engineCallback.onWarn("create sei failed: " + e2.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
        this.mCallback.onTalkStateUpdated(strArr, zArr);
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR && this.mConfig.isAutoUpdateSeiForTalk()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastTimeUpdateSeiForTalk >= ((long) this.mUpdateTalkSeiInterval)) {
                int length = strArr.length;
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    String str = strArr[i];
                    boolean z2 = zArr[i];
                    if (!this.mTalkStateMap.containsKey(str) || this.mTalkStateMap.get(str).booleanValue() != z2) {
                        z = true;
                    }
                    this.mTalkStateMap.put(str, Boolean.valueOf(z2));
                }
                if (z) {
                    mixStream(this.mCachedRegion, false);
                    LogUtil.d("update sei for talk");
                    this.mLastTimeUpdateSeiForTalk = currentTimeMillis;
                }
            }
        }
    }

    Engine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        this.mConfig = config;
        this.mVideoClientFactory = videoClientFactory;
        this.mAudioClientFactory = audioClientFactory;
        this.mContext = config.getContext();
        this.mCallback = engineCallback;
        this.mLogReporter = new LogReporter(engineCallback, config);
        this.mLogReportRunnable = new LogReportRunnable();
        this.mUpdateTalkSeiInterval = config.getUpdateTalkSeiInterval();
        if (config.getCharacter() == Config.Character.ANCHOR) {
            this.mAnchor = config.getInteractId();
        }
        this.mGuestList = new ArrayList();
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mMainThreadHandler.postDelayed(this.mLogReportRunnable, (long) (this.mConfig.getLogReportInterval() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
        configStreamParameters();
    }
}
