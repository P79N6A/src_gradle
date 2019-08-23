package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Video implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bit_rate")
    public List<BitRate> bitRate;
    @SerializedName("caption_download_addr")
    public UrlModel captionDownloadAddr;
    @SerializedName("cover")
    public UrlModel cover;
    @SerializedName("download_addr")
    public UrlModel downloadAddr;
    @SerializedName("dynamic_cover")
    public UrlModel dynamicCover;
    @SerializedName("has_download_suffix_logo_addr")
    public boolean hasSuffixWaterMark;
    @SerializedName("has_watermark")
    public boolean hasWaterMark;
    @SerializedName("height")
    public int height;
    @SerializedName("new_download_addr")
    public UrlModel newDownloadAddr;
    @SerializedName("origin_cover")
    public UrlModel originCover;
    @SerializedName("play_addr")
    public VideoUrlModel playAddr;
    @SerializedName("play_addr_265")
    public VideoUrlModel playAddrH265;
    @SerializedName("ratio")
    public String ratio;
    @SerializedName("download_suffix_logo_addr")
    public UrlModel suffixLogoAddr;
    @SerializedName("ui_alike_download_addr")
    public UrlModel uiAlikeAddr;
    @SerializedName("duration")
    public int videoLength;
    @SerializedName("width")
    public int width;

    public boolean isLowBr() {
        return false;
    }

    public List<BitRate> getBitRate() {
        return this.bitRate;
    }

    public UrlModel getCaptionDownloadAddr() {
        return this.captionDownloadAddr;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDownloadAddr() {
        return this.downloadAddr;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public int getHeight() {
        return this.height;
    }

    public UrlModel getNewDownloadAddr() {
        return this.newDownloadAddr;
    }

    public String getRatio() {
        return this.ratio;
    }

    public UrlModel getSuffixLogoDownloadAddr() {
        return this.suffixLogoAddr;
    }

    public UrlModel getUIAlikeDownloadAddr() {
        return this.uiAlikeAddr;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean hasEndWaterMark() {
        return this.hasSuffixWaterMark;
    }

    public boolean isHasWaterMark() {
        return this.hasWaterMark;
    }

    public UrlModel getOriginCover() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41488, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41488, new Class[0], UrlModel.class);
        } else if (isOriginCoverValid() || !isCoverValid()) {
            return this.originCover;
        } else {
            return this.cover;
        }
    }

    public VideoUrlModel getPlayAddrH264() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41480, new Class[0], VideoUrlModel.class)) {
            return (VideoUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41480, new Class[0], VideoUrlModel.class);
        }
        checkBitRateAndDurationCopy();
        if (this.playAddr != null) {
            this.playAddr.setH265(false);
            this.playAddr.setRatio(this.ratio);
        }
        return this.playAddr;
    }

    public VideoUrlModel getPlayAddrH265() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41481, new Class[0], VideoUrlModel.class)) {
            return (VideoUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41481, new Class[0], VideoUrlModel.class);
        }
        checkBitRateAndDurationCopy();
        if (this.playAddrH265 != null) {
            this.playAddrH265.setH265(true);
            this.playAddrH265.setRatio(this.ratio);
        }
        return this.playAddrH265;
    }

    public VideoUrlModel getProperPlayAddr() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41477, new Class[0], VideoUrlModel.class)) {
            return getPlayAddr();
        }
        return (VideoUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41477, new Class[0], VideoUrlModel.class);
    }

    public boolean isCoverValid() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41486, new Class[0], Boolean.TYPE)) {
            return isUrlModelValid(this.cover);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41486, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isOriginCoverValid() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41487, new Class[0], Boolean.TYPE)) {
            return isUrlModelValid(this.originCover);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41487, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private void checkBitRateAndDurationCopy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41484, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.playAddrH265 == null || this.playAddrH265.getBitRate() == this.bitRate)) {
            this.playAddrH265.setBitRate(this.bitRate);
            this.playAddrH265.setDuration((double) this.videoLength);
            this.playAddrH265.setH265(true);
        }
        if (!(this.playAddr == null || this.playAddr.getBitRate() == this.bitRate)) {
            this.playAddr.setBitRate(this.bitRate);
            this.playAddr.setDuration((double) this.videoLength);
            this.playAddr.setH265(false);
        }
    }

    public VideoUrlModel getPlayAddr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41478, new Class[0], VideoUrlModel.class)) {
            return (VideoUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41478, new Class[0], VideoUrlModel.class);
        }
        checkBitRateAndDurationCopy();
        if (this.playAddrH265 != null) {
            this.playAddrH265.setH265(true);
            this.playAddrH265.setRatio(this.ratio);
        }
        if (this.playAddr != null) {
            this.playAddr.setH265(false);
            this.playAddr.setRatio(this.ratio);
        }
        if (checkVideo(this.playAddrH265)) {
            return this.playAddrH265;
        }
        return this.playAddr;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41489, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41489, new Class[0], String.class);
        }
        return "Video{playAddr=" + this.playAddr + ", playAddrH265=" + this.playAddrH265 + ", cover=" + this.cover + ", dynamicCover=" + this.dynamicCover + ", originCover=" + this.originCover + ", height=" + this.height + ", width=" + this.width + ", ratio='" + this.ratio + '\'' + ", downloadAddr=" + this.downloadAddr + ", hasWaterMark=" + this.hasWaterMark + ", videoLength=" + this.videoLength + ", bitRate=" + this.bitRate + ", newDownloadAddr=" + this.newDownloadAddr + ", suffixLogoAddr=" + this.suffixLogoAddr + ", hasSuffixWaterMark=" + this.hasSuffixWaterMark + '}';
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDownloadAddr(UrlModel urlModel) {
        this.downloadAddr = urlModel;
    }

    public void setDuration(double d2) {
        this.videoLength = (int) d2;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setHasWaterMark(boolean z) {
        this.hasWaterMark = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setNewDownloadAddr(UrlModel urlModel) {
        this.newDownloadAddr = urlModel;
    }

    public void setOriginCover(UrlModel urlModel) {
        this.originCover = urlModel;
    }

    public void setPlayAddr(VideoUrlModel videoUrlModel) {
        this.playAddr = videoUrlModel;
    }

    public void setPlayAddrH265(VideoUrlModel videoUrlModel) {
        this.playAddrH265 = videoUrlModel;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setVideoLength(int i) {
        this.videoLength = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setSourceId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 41483, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 41483, new Class[]{String.class}, Void.TYPE);
            return;
        }
        setRationAndSourceId(str);
    }

    private static boolean isUrlModelValid(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, null, changeQuickRedirect, true, 41485, new Class[]{UrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, null, changeQuickRedirect, true, 41485, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkVideo(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, changeQuickRedirect, false, 41479, new Class[]{UrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, this, changeQuickRedirect, false, 41479, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (urlModel == null) {
            return false;
        } else {
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null || urlList.isEmpty()) {
                return false;
            }
            Iterator<String> it2 = urlList.iterator();
            while (it2.hasNext()) {
                if (TextUtils.isEmpty(it2.next())) {
                    it2.remove();
                }
            }
            if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
                return false;
            }
            return true;
        }
    }

    public void setRationAndSourceId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 41482, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 41482, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.playAddrH265 != null) {
            this.playAddrH265.setRatio(this.ratio).setSourceId(str);
            this.playAddrH265.setH265(true);
        }
        if (this.playAddr != null) {
            this.playAddr.setRatio(this.ratio).setSourceId(str);
            this.playAddr.setH265(false);
        }
    }
}
