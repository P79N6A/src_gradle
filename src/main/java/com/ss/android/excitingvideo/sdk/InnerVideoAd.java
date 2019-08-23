package com.ss.android.excitingvideo.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.excitingvideo.ExcitingVideoListener;
import com.ss.android.excitingvideo.IAdEventListener;
import com.ss.android.excitingvideo.IDialogFactory;
import com.ss.android.excitingvideo.IDownloadListener;
import com.ss.android.excitingvideo.IImageLoadFactory;
import com.ss.android.excitingvideo.INetworkListener;
import com.ss.android.excitingvideo.IOpenWebListener;
import com.ss.android.excitingvideo.model.ExcitingAdEventModel;
import com.ss.android.excitingvideo.model.VideoAd;
import org.json.JSONException;
import org.json.JSONObject;

public class InnerVideoAd {
    private static InnerVideoAd sInstance = new InnerVideoAd();
    private boolean isInit;
    private IAdEventListener mAdEventListener;
    private String mAdUnitId;
    private IDialogFactory mDialogFactory;
    private IDownloadListener mDownload;
    private IImageLoadFactory mImageLoadFactory;
    private INetworkListener mNetwork;
    private IOpenWebListener mOpenWebListener;
    private VideoAd mVideoAd;
    private ExcitingVideoListener mVideoListener;

    private InnerVideoAd() {
    }

    public static InnerVideoAd inst() {
        return sInstance;
    }

    public String getAdUnitId() {
        return this.mAdUnitId;
    }

    public IDialogFactory getDialogFactory() {
        return this.mDialogFactory;
    }

    public IDownloadListener getDownload() {
        return this.mDownload;
    }

    public IImageLoadFactory getImageFactory() {
        return this.mImageLoadFactory;
    }

    public INetworkListener getNetwork() {
        return this.mNetwork;
    }

    public IOpenWebListener getOpenWebListener() {
        return this.mOpenWebListener;
    }

    public VideoAd getVideoAd() {
        return this.mVideoAd;
    }

    public ExcitingVideoListener getVideoListener() {
        return this.mVideoListener;
    }

    public boolean isInit() {
        return this.isInit;
    }

    public void setAdUnitId(String str) {
        this.mAdUnitId = str;
    }

    public void setDialogFactory(IDialogFactory iDialogFactory) {
        this.mDialogFactory = iDialogFactory;
    }

    public void setVideoAd(VideoAd videoAd) {
        this.mVideoAd = videoAd;
    }

    public void setVideoListener(ExcitingVideoListener excitingVideoListener) {
        this.mVideoListener = excitingVideoListener;
    }

    public void onAdClickVideoEvent(Context context) {
        if (this.mAdEventListener != null) {
            long j = 0;
            String str = null;
            if (this.mVideoAd != null) {
                j = this.mVideoAd.getId();
                str = this.mVideoAd.getLogExtra();
            }
            long j2 = j;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", "game");
                jSONObject.put("is_ad_event", 1);
                jSONObject.put("log_extra", str);
                if (!TextUtils.isEmpty(this.mAdUnitId)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", this.mAdUnitId);
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            this.mAdEventListener.onAdEvent(context, "game_ad", "otherclick", j2, 0, null, jSONObject, 0);
        }
    }

    public void onBannerAdEvent(Context context, ExcitingAdEventModel excitingAdEventModel) {
        if (this.mAdEventListener != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", excitingAdEventModel.getRefer());
                jSONObject.put("is_ad_event", 1);
                if (!TextUtils.isEmpty(excitingAdEventModel.getAdUnitId())) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", excitingAdEventModel.getAdUnitId());
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
                jSONObject.put("log_extra", excitingAdEventModel.getLogExtra());
            } catch (JSONException unused) {
            }
            this.mAdEventListener.onAdEvent(context, excitingAdEventModel.getTag(), excitingAdEventModel.getLabel(), excitingAdEventModel.getAdId(), 0, null, jSONObject, 0);
        }
    }

    public void init(INetworkListener iNetworkListener, IImageLoadFactory iImageLoadFactory, IDownloadListener iDownloadListener, IOpenWebListener iOpenWebListener, IAdEventListener iAdEventListener) {
        this.mNetwork = iNetworkListener;
        this.mImageLoadFactory = iImageLoadFactory;
        this.mDownload = iDownloadListener;
        this.mOpenWebListener = iOpenWebListener;
        this.mAdEventListener = iAdEventListener;
        this.isInit = true;
    }

    public void onAdEvent(Context context, String str, String str2, long j, String str3) {
        onAdEvent(context, str, str2, j, str3, this.mVideoAd.getLogExtra());
    }

    public void onAdEvent(Context context, String str, String str2, long j, JSONObject jSONObject) {
        if (this.mAdEventListener != null) {
            this.mAdEventListener.onAdEvent(context, str, str2, j, 0, null, jSONObject, 0);
        }
    }

    public void onAdEvent(Context context, String str, String str2, long j, String str3, String str4) {
        if (this.mAdEventListener != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", str3);
                jSONObject.put("is_ad_event", 1);
                jSONObject.put("log_extra", str4);
                if (!TextUtils.isEmpty(this.mAdUnitId)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", this.mAdUnitId);
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            this.mAdEventListener.onAdEvent(context, str, str2, j, 0, null, jSONObject, 0);
        }
    }

    public void onBannerAdEvent(Context context, String str, String str2, long j, String str3, String str4) {
        if (this.mAdEventListener != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", "banner");
                jSONObject.put("is_ad_event", 1);
                if (!TextUtils.isEmpty(str4)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", str4);
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
                jSONObject.put("log_extra", str3);
            } catch (JSONException unused) {
            }
            this.mAdEventListener.onAdEvent(context, str, str2, j, 0, null, jSONObject, 0);
        }
    }
}
