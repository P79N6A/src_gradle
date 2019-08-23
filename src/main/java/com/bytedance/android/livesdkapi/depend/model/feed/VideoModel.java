package com.bytedance.android.livesdkapi.depend.model.feed;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

@Keep
public class VideoModel {
    private static final a DEFAULT_COVER_TYPE = a.LARGE;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("allow_cache")
    private boolean allowCache;
    @SerializedName("avg_color")
    private int avgColor;
    @SerializedName("cover_medium")
    private ImageModel coverMediumModel;
    @SerializedName("cover")
    private ImageModel coverModel;
    @SerializedName("cover_thumb")
    private ImageModel coverThumbModel;
    @SerializedName("download_url")
    private List<String> downloadList;
    @SerializedName("duration")
    private double duration;
    @SerializedName("dynamic_cover")
    private ImageModel dynamicCoverModel;
    @SerializedName("height")
    private int height;
    private a mCoverType = DEFAULT_COVER_TYPE;
    @SerializedName("preload_size")
    private int preloadSize = 512000;
    @SerializedName("quality_info")
    private List<Object> qualityInfo;
    @SerializedName("uri")
    private String uri;
    @SerializedName("url_list")
    private List<String> urlList;
    @SerializedName("width")
    private int width;

    public enum a {
        LARGE,
        MEDIUM,
        THUMB;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public List<Object> getBitRate() {
        return this.qualityInfo;
    }

    public ImageModel getCoverMediumModel() {
        return this.coverMediumModel;
    }

    public ImageModel getCoverModel() {
        return this.coverModel;
    }

    public ImageModel getCoverThumbModel() {
        return this.coverThumbModel;
    }

    public a getCoverType() {
        return this.mCoverType;
    }

    public List<String> getDownloadList() {
        return this.downloadList;
    }

    public double getDuration() {
        return this.duration;
    }

    public ImageModel getDynamicCoverModel() {
        return this.dynamicCoverModel;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPreloadSize() {
        return this.preloadSize;
    }

    public List<Object> getQualityInfo() {
        return this.qualityInfo;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAllowCache() {
        return this.allowCache;
    }

    public String getUnbitratedUri() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14964, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14964, new Class[0], String.class);
        } else if (TextUtils.isEmpty(getUri())) {
            return "";
        } else {
            return getUri();
        }
    }

    public void setAllowCache(boolean z) {
        this.allowCache = z;
    }

    public void setCoverMediumModel(ImageModel imageModel) {
        this.coverMediumModel = imageModel;
    }

    public void setCoverModel(ImageModel imageModel) {
        this.coverModel = imageModel;
    }

    public void setCoverThumbModel(ImageModel imageModel) {
        this.coverThumbModel = imageModel;
    }

    public void setCoverType(a aVar) {
        this.mCoverType = aVar;
    }

    public void setDownloadList(List<String> list) {
        this.downloadList = list;
    }

    public void setDuration(double d2) {
        this.duration = d2;
    }

    public void setDynamicCoverModel(ImageModel imageModel) {
        this.dynamicCoverModel = imageModel;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setPreloadSize(int i) {
        this.preloadSize = i;
    }

    public void setQualityInfo(List<Object> list) {
        this.qualityInfo = list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
