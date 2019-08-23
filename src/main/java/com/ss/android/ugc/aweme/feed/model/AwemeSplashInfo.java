package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class AwemeSplashInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient boolean adCardShownOnce;
    @SerializedName("awesome_splash_id")
    private String awesomeSplashId;
    public transient boolean contextTrackSent;
    @SerializedName("disable_hotstart_show")
    private boolean disableHotStartShow;
    @SerializedName("enable_splash_open")
    private boolean enableSplashOpen;
    @SerializedName("end_time")
    private int endTime;
    @SerializedName("hot_show_type")
    private int hotShowType;
    @SerializedName("is_invalid_ad")
    private boolean isInvalidAd;
    @Expose(deserialize = false, serialize = false)
    private transient boolean isShown;
    @SerializedName("label_info")
    private LabelInfo labelInfo;
    @SerializedName("predownload_text")
    private String predownloadText;
    @SerializedName("preload_type")
    private int preloadType;
    @SerializedName("skip_info")
    private SkipInfo skipInfo;
    @SerializedName("splash_show_time")
    private float splashShowTime = 3000.0f;

    public class LabelInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background_color")
        private String backgroundColor;
        @SerializedName("position")
        private int position;
        @SerializedName("text")
        private String text;
        @SerializedName("text_color")
        private String textColor;

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public LabelInfo() {
        }
    }

    public class SkipInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background_color")
        private String backgroundColor;
        @SerializedName("countdown_unit")
        private String countdownUnit;
        @SerializedName("countdown_enable")
        private int countdown_enable;
        @SerializedName("height_extra_size")
        private int heightExtraSize;
        @SerializedName("text")
        private String text;
        @SerializedName("text_color")
        private String textColor;
        @SerializedName("width_extra_size")
        private int widthExtraSize;

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getCountdownUnit() {
            return this.countdownUnit;
        }

        public int getHeightExtraSize() {
            return this.heightExtraSize;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public int getWidthExtraSize() {
            return this.widthExtraSize;
        }

        public boolean isCountdown_enable() {
            if (this.countdown_enable == 1) {
                return true;
            }
            return false;
        }

        public SkipInfo() {
        }
    }

    public String getAwesomeSplashId() {
        return this.awesomeSplashId;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public int getHotShowType() {
        return this.hotShowType;
    }

    public LabelInfo getLabelInfo() {
        return this.labelInfo;
    }

    public String getPredownloadText() {
        return this.predownloadText;
    }

    public int getPreloadType() {
        return this.preloadType;
    }

    public SkipInfo getSkipInfo() {
        return this.skipInfo;
    }

    public float getSplashShowTime() {
        return this.splashShowTime;
    }

    public boolean isDisableHotStartShow() {
        return this.disableHotStartShow;
    }

    public boolean isEnableSplashOpen() {
        return this.enableSplashOpen;
    }

    public boolean isInvalidAd() {
        return this.isInvalidAd;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public void setAwesomeSplashId(String str) {
        this.awesomeSplashId = str;
    }

    public void setEnableSplashOpen(boolean z) {
        this.enableSplashOpen = z;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setHotShowType(int i) {
        this.hotShowType = i;
    }

    public void setInvalidAd(boolean z) {
        this.isInvalidAd = z;
    }

    public void setPreloadType(int i) {
        this.preloadType = i;
    }

    public void setShown(boolean z) {
        this.isShown = z;
    }

    public void setSplashShowTime(float f2) {
        this.splashShowTime = f2;
    }
}
