package com.ss.android.excitingvideo.model;

public class ExcitingDownloadAdEventModel {
    private String mClickButtonTag;
    private String mClickContinueLabel;
    private String mClickContinueTag;
    private String mClickInstallLabel;
    private String mClickInstallTag;
    private String mClickItemTag;
    private String mClickLabel;
    private String mClickOpenLabel;
    private String mClickOpenTag;
    private String mClickPauseLabel;
    private String mClickPauseTag;
    private String mClickStartLabel;
    private String mClickStartTag;
    private String mClickTag;
    private String mCompletedEventTag;
    private String mDetailAdTag;
    private int mDownloadScene;
    private Object mExtraEventObject;
    private boolean mIsEnableClickEvent;
    private boolean mIsEnableCompletedEvent;
    private boolean mIsEnableNoChargeClickEvent;
    private boolean mIsEnableV3Event;
    private String mOpenLabel;
    private String mOpenTag;

    public static final class Builder {
        public String mClickButtonTag;
        public String mClickContinueLabel;
        public String mClickContinueTag;
        public String mClickInstallLabel;
        public String mClickInstallTag;
        public String mClickItemTag;
        public String mClickLabel;
        public String mClickOpenLabel;
        public String mClickOpenTag;
        public String mClickPauseLabel;
        public String mClickPauseTag;
        public String mClickStartLabel;
        public String mClickStartTag;
        public String mClickTag;
        public String mCompletedEventTag;
        public String mDetailAdTag;
        public int mDownloadScene;
        public Object mExtraEventObject;
        public boolean mIsEnableClickEvent = true;
        public boolean mIsEnableCompletedEvent = true;
        public boolean mIsEnableNoChargeClickEvent = true;
        public boolean mIsEnableV3Event = true;
        public String mOpenLabel;
        public String mOpenTag;

        public final ExcitingDownloadAdEventModel build() {
            return new ExcitingDownloadAdEventModel(this);
        }

        public final Builder setClickButtonTag(String str) {
            this.mClickButtonTag = str;
            return this;
        }

        public final Builder setClickContinueLabel(String str) {
            this.mClickContinueLabel = str;
            return this;
        }

        public final Builder setClickContinueTag(String str) {
            this.mClickContinueTag = str;
            return this;
        }

        public final Builder setClickInstallLabel(String str) {
            this.mClickInstallLabel = str;
            return this;
        }

        public final Builder setClickInstallTag(String str) {
            this.mClickInstallTag = str;
            return this;
        }

        public final Builder setClickItemTag(String str) {
            this.mClickItemTag = str;
            return this;
        }

        public final Builder setClickLabel(String str) {
            this.mClickLabel = str;
            return this;
        }

        public final Builder setClickOpenLabel(String str) {
            this.mClickOpenLabel = str;
            return this;
        }

        public final Builder setClickOpenTag(String str) {
            this.mClickOpenTag = str;
            return this;
        }

        public final Builder setClickPauseLabel(String str) {
            this.mClickPauseLabel = str;
            return this;
        }

        public final Builder setClickPauseTag(String str) {
            this.mClickPauseTag = str;
            return this;
        }

        public final Builder setClickStartLabel(String str) {
            this.mClickStartLabel = str;
            return this;
        }

        public final Builder setClickStartTag(String str) {
            this.mClickStartTag = str;
            return this;
        }

        public final Builder setClickTag(String str) {
            this.mClickTag = str;
            return this;
        }

        public final Builder setCompletedEventTag(String str) {
            this.mCompletedEventTag = str;
            return this;
        }

        public final Builder setDetailAdTag(String str) {
            this.mDetailAdTag = str;
            return this;
        }

        public final Builder setDownloadScene(int i) {
            this.mDownloadScene = i;
            return this;
        }

        public final Builder setExtraEventObject(Object obj) {
            this.mExtraEventObject = obj;
            return this;
        }

        public final Builder setIsEnableClickEvent(boolean z) {
            this.mIsEnableClickEvent = z;
            return this;
        }

        public final Builder setIsEnableCompletedEvent(boolean z) {
            this.mIsEnableCompletedEvent = z;
            return this;
        }

        public final Builder setIsEnableNoChargeClickEvent(boolean z) {
            this.mIsEnableNoChargeClickEvent = z;
            return this;
        }

        public final Builder setIsEnableV3Event(boolean z) {
            this.mIsEnableV3Event = z;
            return this;
        }

        public final Builder setOpenLabel(String str) {
            this.mOpenLabel = str;
            return this;
        }

        public final Builder setOpenTag(String str) {
            this.mOpenTag = str;
            return this;
        }
    }

    public ExcitingDownloadAdEventModel() {
    }

    public String getClickButtonTag() {
        return this.mClickButtonTag;
    }

    public String getClickContinueLabel() {
        return this.mClickContinueLabel;
    }

    public String getClickContinueTag() {
        return this.mClickContinueTag;
    }

    public String getClickInstallLabel() {
        return this.mClickInstallLabel;
    }

    public String getClickInstallTag() {
        return this.mClickInstallTag;
    }

    public String getClickItemTag() {
        return this.mClickItemTag;
    }

    public String getClickLabel() {
        return this.mClickLabel;
    }

    public String getClickOpenLabel() {
        return this.mClickOpenLabel;
    }

    public String getClickOpenTag() {
        return this.mClickOpenTag;
    }

    public String getClickPauseLabel() {
        return this.mClickPauseLabel;
    }

    public String getClickPauseTag() {
        return this.mClickPauseTag;
    }

    public String getClickStartLabel() {
        return this.mClickStartLabel;
    }

    public String getClickStartTag() {
        return this.mClickStartTag;
    }

    public String getClickTag() {
        return this.mClickTag;
    }

    public String getCompletedEventTag() {
        return this.mCompletedEventTag;
    }

    public String getDetailAdTag() {
        return this.mDetailAdTag;
    }

    public int getDownloadScene() {
        return this.mDownloadScene;
    }

    public Object getExtraEventObject() {
        return this.mExtraEventObject;
    }

    public String getOpenLabel() {
        return this.mOpenLabel;
    }

    public String getOpenTag() {
        return this.mOpenTag;
    }

    public boolean isEnableClickEvent() {
        return this.mIsEnableClickEvent;
    }

    public boolean isEnableCompletedEvent() {
        return this.mIsEnableCompletedEvent;
    }

    public boolean isEnableNoChargeClickEvent() {
        return this.mIsEnableNoChargeClickEvent;
    }

    public boolean isEnableV3Event() {
        return this.mIsEnableV3Event;
    }

    public void setExtraEventObject(Object obj) {
        this.mExtraEventObject = obj;
    }

    private ExcitingDownloadAdEventModel(Builder builder) {
        this.mClickButtonTag = builder.mClickButtonTag;
        this.mClickItemTag = builder.mClickItemTag;
        this.mCompletedEventTag = builder.mCompletedEventTag;
        this.mClickTag = builder.mClickTag;
        this.mClickStartTag = builder.mClickStartTag;
        this.mClickPauseTag = builder.mClickPauseTag;
        this.mClickContinueTag = builder.mClickContinueTag;
        this.mClickInstallTag = builder.mClickInstallTag;
        this.mClickOpenTag = builder.mClickOpenTag;
        this.mOpenTag = builder.mOpenTag;
        this.mClickLabel = builder.mClickLabel;
        this.mClickStartLabel = builder.mClickStartLabel;
        this.mClickPauseLabel = builder.mClickPauseLabel;
        this.mClickContinueLabel = builder.mClickContinueLabel;
        this.mClickInstallLabel = builder.mClickInstallLabel;
        this.mClickOpenLabel = builder.mClickOpenLabel;
        this.mOpenLabel = builder.mOpenLabel;
        this.mExtraEventObject = builder.mExtraEventObject;
        this.mDownloadScene = builder.mDownloadScene;
        this.mIsEnableClickEvent = builder.mIsEnableClickEvent;
        this.mIsEnableNoChargeClickEvent = builder.mIsEnableNoChargeClickEvent;
        this.mIsEnableCompletedEvent = builder.mIsEnableCompletedEvent;
        this.mIsEnableV3Event = builder.mIsEnableV3Event;
        this.mDetailAdTag = builder.mDetailAdTag;
    }
}
