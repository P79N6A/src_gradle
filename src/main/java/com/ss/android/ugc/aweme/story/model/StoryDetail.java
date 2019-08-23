package com.ss.android.ugc.aweme.story.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.d.a;
import java.util.List;
import org.json.JSONObject;

@Keep
public class StoryDetail implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_list")
    List<Aweme> awemeList;
    @SerializedName("requestId")
    String requestId;
    @SerializedName("status_code")
    int statusCode;

    public List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public StoryDetail clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84807, new Class[0], StoryDetail.class)) {
            return (StoryDetail) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84807, new Class[0], StoryDetail.class);
        }
        StoryDetail storyDetail = null;
        try {
            storyDetail = (StoryDetail) super.clone();
        } catch (CloneNotSupportedException unused) {
        }
        return storyDetail;
    }

    @Nullable
    public JSONObject getRequestIdJsonObject() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84806, new Class[0], JSONObject.class)) {
            return a.a(this.requestId);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84806, new Class[0], JSONObject.class);
    }

    @Nullable
    public Aweme getFirstAweme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84804, new Class[0], Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84804, new Class[0], Aweme.class);
        } else if (getAwemeList() == null || getAwemeList().size() <= 0) {
            return null;
        } else {
            return getAwemeList().get(0);
        }
    }

    public boolean needDownloadFirstCover() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84805, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84805, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Aweme firstAweme = getFirstAweme();
        if (!(firstAweme == null || firstAweme.getVideo() == null)) {
            ImageRequest[] a2 = c.a(firstAweme.getVideo().getOriginCover(), (ResizeOptions) null, (Postprocessor) null);
            if (a2.length > 0) {
                ImagePipeline imagePipeline = Fresco.getImagePipeline();
                for (ImageRequest isInBitmapMemoryCache : a2) {
                    if (imagePipeline.isInBitmapMemoryCache(isInBitmapMemoryCache)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84803, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84803, new Class[0], String.class);
        }
        return "StoryListResponse{statusCode=" + this.statusCode + ", awemeList=" + this.awemeList + '}';
    }

    public void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }
}
