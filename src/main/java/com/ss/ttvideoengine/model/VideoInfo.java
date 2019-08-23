package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.utils.TTHelper;
import java.util.ArrayList;
import org.json.JSONObject;

public class VideoInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isAutoDefinition;
    public String mBackupUrl1;
    public String mBackupUrl2;
    public String mBackupUrl3;
    public String mCodecType;
    public String mDefinition;
    public String mFileHash;
    public int mGbr;
    public String mMainUrl;
    public long mSize;
    private int mSocketBuffer;
    public String mStorePath;
    public String[] mURLs;
    public int mVHeight;
    public String mVType;
    public int mVWidth;
    public int mVideoDuration;
    public int playLoadMaxStep;
    public int playLoadMinStep;
    public int preloadInterval;
    public int preloadSize;
    public int useVideoProxy = 1;

    public int getPreloadInterval() {
        return this.preloadInterval;
    }

    public int getSocketBuffer() {
        return this.mSocketBuffer;
    }

    public boolean isUseVideoProxy() {
        if (this.useVideoProxy == 1) {
            return true;
        }
        return false;
    }

    public VideoInfo copyInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91542, new Class[0], VideoInfo.class)) {
            return (VideoInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91542, new Class[0], VideoInfo.class);
        }
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.mURLs = this.mURLs;
        videoInfo.mMainUrl = this.mMainUrl;
        videoInfo.mBackupUrl1 = this.mBackupUrl1;
        videoInfo.mBackupUrl2 = this.mBackupUrl2;
        videoInfo.mBackupUrl3 = this.mBackupUrl3;
        videoInfo.mVWidth = this.mVWidth;
        videoInfo.mVHeight = this.mVHeight;
        videoInfo.mGbr = this.mGbr;
        videoInfo.mStorePath = this.mStorePath;
        videoInfo.mVType = this.mVType;
        videoInfo.mCodecType = this.mCodecType;
        videoInfo.mFileHash = this.mFileHash;
        videoInfo.mDefinition = this.mDefinition;
        videoInfo.preloadSize = this.preloadSize;
        videoInfo.playLoadMinStep = this.playLoadMinStep;
        videoInfo.playLoadMaxStep = this.playLoadMaxStep;
        videoInfo.mSize = this.mSize;
        videoInfo.mVideoDuration = this.mVideoDuration;
        videoInfo.preloadInterval = this.preloadInterval;
        videoInfo.useVideoProxy = this.useVideoProxy;
        videoInfo.mSocketBuffer = this.mSocketBuffer;
        videoInfo.isAutoDefinition = this.isAutoDefinition;
        return videoInfo;
    }

    public void extractFields(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91541, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91541, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.mMainUrl = jSONObject.optString("main_url");
        this.mBackupUrl1 = jSONObject.optString("backup_url_1");
        this.mBackupUrl2 = jSONObject.optString("backup_url_2");
        this.mBackupUrl3 = jSONObject.optString("backup_url_3");
        if (!TextUtils.isEmpty(this.mMainUrl)) {
            arrayList.add(TTHelper.base64Decode(this.mMainUrl));
        }
        if (!TextUtils.isEmpty(this.mBackupUrl1)) {
            arrayList.add(TTHelper.base64Decode(this.mBackupUrl1));
        }
        if (!TextUtils.isEmpty(this.mBackupUrl2)) {
            arrayList.add(TTHelper.base64Decode(this.mBackupUrl2));
        }
        if (!TextUtils.isEmpty(this.mBackupUrl3)) {
            arrayList.add(TTHelper.base64Decode(this.mBackupUrl3));
        }
        this.mURLs = new String[arrayList.size()];
        arrayList.toArray(this.mURLs);
        try {
            this.mVWidth = Integer.valueOf(jSONObject.optString("vwidth")).intValue();
        } catch (NumberFormatException unused) {
            this.mVWidth = 0;
        }
        try {
            this.mVHeight = Integer.valueOf(jSONObject.optString("vheight")).intValue();
        } catch (NumberFormatException unused2) {
            this.mVHeight = 0;
        }
        this.mGbr = jSONObject.optInt("gbr");
        this.mStorePath = jSONObject.optString("storePath");
        this.mVType = jSONObject.optString("vtype");
        this.mDefinition = jSONObject.optString("definition");
        this.mCodecType = jSONObject.optString("codec_type");
        this.mFileHash = jSONObject.optString("file_hash");
        try {
            this.mSize = jSONObject.optLong("size", 0);
        } catch (Exception unused3) {
            this.mSize = 0;
        }
        this.preloadSize = jSONObject.optInt("preload_size");
        this.playLoadMinStep = jSONObject.optInt("play_load_min_step");
        this.playLoadMaxStep = jSONObject.optInt("play_load_max_step");
        this.preloadInterval = jSONObject.optInt("preload_interval", -1);
        this.useVideoProxy = jSONObject.optInt("use_video_proxy", 1);
        this.mSocketBuffer = jSONObject.optInt("socket_buffer", 0);
    }
}
