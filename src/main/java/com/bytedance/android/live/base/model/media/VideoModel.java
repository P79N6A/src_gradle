package com.bytedance.android.live.base.model.media;

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
    @SerializedName(alternate = {"dynamic_cover"}, value = "cover_animated")
    private ImageModel dynamicCoverModel;
    @SerializedName("first_frame")
    private ImageModel firstFrame;
    @SerializedName("gif_type")
    private int gifType;
    @SerializedName("gif_url_list")
    private List<String> gifUrlList;
    @SerializedName("h265_uri")
    private String h265Uri;
    @SerializedName("h265_url")
    private List<String> h265UrlList;
    @SerializedName("height")
    private int height;
    @SerializedName("long_duration")
    private float longDuration;
    @SerializedName("long_uri")
    private String longUri;
    @SerializedName("long_url")
    private List<String> longUrls;
    private a mCoverType = DEFAULT_COVER_TYPE;
    @SerializedName("preload_size")
    private int preloadSize = 512000;
    @SerializedName("quality_info")
    private List<Object> qualityInfo;
    @SerializedName("uri")
    private String uri;
    @SerializedName("url_list")
    private List<String> urlList;
    @SerializedName("videoLocalPath")
    private String videoLocalPath;
    @SerializedName("watermark")
    private boolean waterMark;
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

    public ImageModel getFirstFrame() {
        return this.firstFrame;
    }

    public int getGifType() {
        return this.gifType;
    }

    public List<String> getGifUrlList() {
        return this.gifUrlList;
    }

    public String getH265Uri() {
        return this.h265Uri;
    }

    public List<String> getH265UrlList() {
        return this.h265UrlList;
    }

    public int getHeight() {
        return this.height;
    }

    public float getLongDuration() {
        return this.longDuration;
    }

    public String getLongUri() {
        return this.longUri;
    }

    public List<String> getLongUrls() {
        return this.longUrls;
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

    public String getVideoLocalPath() {
        return this.videoLocalPath;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAllowCache() {
        return this.allowCache;
    }

    public boolean isWaterMark() {
        return this.waterMark;
    }

    public String getUnbitratedUri() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 68, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 68, new Class[0], String.class);
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

    public void setFirstFrame(ImageModel imageModel) {
        this.firstFrame = imageModel;
    }

    public void setGifType(int i) {
        this.gifType = i;
    }

    public void setGifUrlList(List<String> list) {
        this.gifUrlList = list;
    }

    public void setH265Uri(String str) {
        this.h265Uri = str;
    }

    public void setH265UrlList(List<String> list) {
        this.h265UrlList = list;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLongDuration(float f2) {
        this.longDuration = f2;
    }

    public void setLongUri(String str) {
        this.longUri = str;
    }

    public void setLongUrls(List<String> list) {
        this.longUrls = list;
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

    public void setVideoLocalPath(String str) {
        this.videoLocalPath = str;
    }

    public void setWaterMark(boolean z) {
        this.waterMark = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
