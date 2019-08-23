package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.Resolution;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class VideoModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public LiveVideoRef liveVideoRef = new LiveVideoRef();
    public List<VideoAdRef> videoAdRefList = new ArrayList();
    public VideoRef videoRef = new VideoRef();

    public String getCodec() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91545, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91545, new Class[0], String.class);
        }
        if (this.videoRef != null) {
            VideoInfo videoInfo = this.videoRef.mVideo1;
            if (videoInfo != null) {
                String str = videoInfo.mCodecType;
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        }
        return "h264";
    }

    public String[] allVideoURLs(Resolution resolution) {
        if (PatchProxy.isSupport(new Object[]{resolution}, this, changeQuickRedirect, false, 91544, new Class[]{Resolution.class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{resolution}, this, changeQuickRedirect, false, 91544, new Class[]{Resolution.class}, String[].class);
        }
        if (!(this.videoRef == null && this.liveVideoRef == null)) {
            if (this.videoRef != null) {
                VideoInfo videoInfoWithClarity = this.videoRef.getVideoInfoWithClarity(resolution.toString());
                if (videoInfoWithClarity != null) {
                    return videoInfoWithClarity.mURLs;
                }
            }
            if (this.liveVideoRef != null) {
                LiveVideoInfo liveVideoInfo = this.liveVideoRef.getLiveVideoInfo();
                if (liveVideoInfo != null) {
                    return liveVideoInfo.mURLs;
                }
            }
        }
        return null;
    }

    public int getPreloadInterval(Resolution resolution) {
        if (PatchProxy.isSupport(new Object[]{resolution}, this, changeQuickRedirect, false, 91546, new Class[]{Resolution.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{resolution}, this, changeQuickRedirect, false, 91546, new Class[]{Resolution.class}, Integer.TYPE)).intValue();
        }
        if (this.videoRef != null) {
            VideoInfo videoInfoWithClarity = this.videoRef.getVideoInfoWithClarity(resolution.toString());
            if (videoInfoWithClarity != null) {
                return videoInfoWithClarity.getPreloadInterval();
            }
        }
        return 0;
    }

    public VideoInfo getVideoInfo(Resolution resolution) {
        if (PatchProxy.isSupport(new Object[]{resolution}, this, changeQuickRedirect, false, 91543, new Class[]{Resolution.class}, VideoInfo.class)) {
            return (VideoInfo) PatchProxy.accessDispatch(new Object[]{resolution}, this, changeQuickRedirect, false, 91543, new Class[]{Resolution.class}, VideoInfo.class);
        }
        if (!((this.videoRef == null && this.liveVideoRef == null) || this.videoRef == null)) {
            VideoInfo videoInfoWithClarity = this.videoRef.getVideoInfoWithClarity(resolution.toString());
            if (videoInfoWithClarity != null) {
                return videoInfoWithClarity;
            }
        }
        return null;
    }

    public void extractFields(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91547, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91547, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video_info");
            if (optJSONObject != null) {
                this.videoRef.extractFields(optJSONObject.optJSONObject("data"));
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("video_ad_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        VideoAdRef videoAdRef = new VideoAdRef();
                        videoAdRef.extractFields(optJSONArray.getJSONObject(i));
                        this.videoAdRefList.add(videoAdRef);
                    } catch (Exception unused) {
                    }
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("live_info");
            if (optJSONObject2 != null) {
                this.liveVideoRef.extractFields(optJSONObject2.optJSONObject("data"));
            }
        }
    }
}
