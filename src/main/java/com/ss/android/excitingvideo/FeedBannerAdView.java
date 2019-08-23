package com.ss.android.excitingvideo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.excitingvideo.BannerAdView;
import com.ss.android.excitingvideo.model.ExcitingAdEventModel;
import com.ss.android.excitingvideo.model.ExcitingDownloadAdEventModel;
import com.ss.android.excitingvideo.model.ImageInfo;
import com.ss.android.excitingvideo.network.OkNetwork;
import com.ss.android.excitingvideo.sdk.DownloadProgressView;
import com.ss.android.excitingvideo.sdk.InnerVideoAd;
import com.ss.android.excitingvideo.utils.UIUtils;
import com.ss.android.ugc.aweme.C0906R;

public class FeedBannerAdView extends BannerAdView implements View.OnClickListener {
    private int mBannerHeight;
    public int mBannerWidth;
    private ExcitingDownloadAdEventModel mDownloadEvent;
    public DownloadProgressView mDownloadProgressView;
    private IDownloadStatus mDownloadStatus = new IDownloadStatus() {
        public void onDownloadStart() {
            FeedBannerAdView.this.mDownloadProgressView.setText("立即下载");
            FeedBannerAdView.this.mDownloadProgressView.setStatus(DownloadProgressView.Status.IDLE);
        }

        public void onFail() {
            FeedBannerAdView.this.mDownloadProgressView.setText("重新下载");
            FeedBannerAdView.this.mDownloadProgressView.setStatus(DownloadProgressView.Status.IDLE);
        }

        public void onFinish() {
            FeedBannerAdView.this.mDownloadProgressView.setText("立即安装");
            FeedBannerAdView.this.mDownloadProgressView.setStatus(DownloadProgressView.Status.FINISH);
        }

        public void onIdle() {
            FeedBannerAdView.this.mDownloadProgressView.setText("立即下载");
            FeedBannerAdView.this.mDownloadProgressView.setStatus(DownloadProgressView.Status.IDLE);
        }

        public void onInstalled() {
            FeedBannerAdView.this.mDownloadProgressView.setText("立即打开");
            FeedBannerAdView.this.mDownloadProgressView.setStatus(DownloadProgressView.Status.FINISH);
        }

        public void onPause(int i) {
            FeedBannerAdView.this.mDownloadProgressView.setText("继续下载");
            FeedBannerAdView.this.mDownloadProgressView.setStatus(DownloadProgressView.Status.DOWNLOADING);
            FeedBannerAdView.this.mDownloadProgressView.setProgressInt(i);
        }

        public void onDownloading(int i) {
            DownloadProgressView downloadProgressView = FeedBannerAdView.this.mDownloadProgressView;
            downloadProgressView.setText(i + "%");
            FeedBannerAdView.this.mDownloadProgressView.setStatus(DownloadProgressView.Status.DOWNLOADING);
            FeedBannerAdView.this.mDownloadProgressView.setProgressInt(i);
        }
    };
    private IImageLoadListener mIconImageLoad;
    public View mIconImageView;
    public RelativeLayout mIconRootView;
    private RelativeLayout mRightLayout;
    private TextView mRightTextView;
    private int mRightWidth;
    private RelativeLayout mRootLayout;
    private int mScreenWidth;

    public void setViewOnClickListener() {
        setOnClickListener(this);
        this.mIconImageView.setOnClickListener(this);
        this.mImageView.setOnClickListener(this);
    }

    public void bannerAdShowEvent() {
        InnerVideoAd.inst().onBannerAdEvent(this.mActivity, new ExcitingAdEventModel.Builder().setTag("applet_ad").setLabel("show").setAdId(this.mBannerAd.getId()).setLogExtra(this.mBannerAd.getLogExtra()).setAdUnitId(this.mAdUnitId).setRefer("card").build());
    }

    public void constructEventModel() {
        if (this.mDownloadEvent == null) {
            this.mDownloadEvent = new ExcitingDownloadAdEventModel.Builder().setClickButtonTag("applet_ad").setClickStartLabel("click_start").setClickPauseLabel("click_pause").setClickContinueLabel("click_continue").setClickInstallLabel("click_install").setClickOpenLabel("click_open").setClickTag("applet_ad").setClickStartTag("applet_ad").setClickPauseTag("applet_ad").setClickContinueTag("applet_ad").setClickInstallTag("applet_ad").setClickOpenTag("applet_ad").setDetailAdTag("landing_h5_download_ad_button").setIsEnableClickEvent(true).setIsEnableNoChargeClickEvent(true).setIsEnableV3Event(false).build();
        }
        this.mBannerAd.setDownloadEvent(this.mDownloadEvent);
    }

    /* access modifiers changed from: protected */
    public void bindData() {
        final int i;
        int i2;
        this.mRightLayout.setVisibility(0);
        this.mRightTextView.setText(this.mBannerAd.getSource());
        if (TextUtils.isEmpty(this.mBannerAd.getAvatarUrl())) {
            this.mIconImageView.setVisibility(8);
            this.mIconRootView.setVisibility(8);
        } else {
            int dip2Px = (int) ((UIUtils.dip2Px(this.mActivity, 44.0f) * ((float) this.mBannerWidth)) / ((float) this.mScreenWidth));
            updateIconImageView(dip2Px);
            this.mIconImageLoad.setUrl(this.mActivity, this.mBannerAd.getAvatarUrl(), dip2Px, dip2Px, new ImageLoadCallback() {
                public void onSuccess() {
                }

                public void onFail() {
                    FeedBannerAdView.this.mIconImageView.setVisibility(8);
                    FeedBannerAdView.this.mIconRootView.setVisibility(8);
                }
            });
        }
        if (!TextUtils.isEmpty(this.mBannerAd.getButtonText())) {
            this.mDownloadProgressView.setText(this.mBannerAd.getButtonText());
        }
        if (this.mBannerAd.isDownload()) {
            InnerVideoAd.inst().getDownload().bind(this.mActivity, this.mBannerAd.getId(), this.mBannerAd.getDownloadUrl(), this.mDownloadStatus, this.mBannerAd);
        }
        this.mDownloadProgressView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!FeedBannerAdView.this.mBannerAd.getClickTrackUrl().isEmpty()) {
                    OkNetwork.inst().sendTrackUrl(FeedBannerAdView.this.mBannerAd.getClickTrackUrl(), false);
                }
                if (FeedBannerAdView.this.mBannerAd.isWeb()) {
                    if (InnerVideoAd.inst().getOpenWebListener() != null) {
                        InnerVideoAd.inst().getOpenWebListener().openWebUrl(FeedBannerAdView.this.mActivity, FeedBannerAdView.this.mBannerAd.getOpenUrl(), FeedBannerAdView.this.mBannerAd.getWebUrl(), FeedBannerAdView.this.mBannerAd);
                    }
                    InnerVideoAd.inst().onBannerAdEvent(FeedBannerAdView.this.mActivity, new ExcitingAdEventModel.Builder().setTag("applet_ad").setLabel("click").setAdId(FeedBannerAdView.this.mBannerAd.getId()).setLogExtra(FeedBannerAdView.this.mBannerAd.getLogExtra()).setAdUnitId(FeedBannerAdView.this.mAdUnitId).setRefer("card_more_button").build());
                    return;
                }
                if (FeedBannerAdView.this.mBannerAd.isDownload() && InnerVideoAd.inst().getDownload() != null) {
                    FeedBannerAdView.this.constructEventModel();
                    InnerVideoAd.inst().getDownload().download(FeedBannerAdView.this.mActivity, FeedBannerAdView.this.mBannerAd.getDownloadUrl(), FeedBannerAdView.this.mBannerAd);
                }
            }
        });
        ImageInfo imageInfo = this.mBannerAd.getImageInfo();
        if (this.mImageWidth != 0) {
            int i3 = this.mImageWidth;
            double d2 = (double) this.mImageWidth;
            Double.isNaN(d2);
            double height = (double) imageInfo.getHeight();
            Double.isNaN(height);
            double d3 = d2 * 1.0d * height;
            double width = (double) imageInfo.getWidth();
            Double.isNaN(width);
            i2 = i3;
            i = (int) (d3 / width);
        } else {
            int dip2Px2 = (int) UIUtils.dip2Px(this.mActivity, 90.0f);
            double d4 = (double) dip2Px2;
            Double.isNaN(d4);
            double height2 = (double) imageInfo.getHeight();
            Double.isNaN(height2);
            double d5 = (d4 * 1.0d) / height2;
            double width2 = (double) imageInfo.getWidth();
            Double.isNaN(width2);
            i = dip2Px2;
            i2 = (int) (d5 * width2);
        }
        buildImageLayoutParams(i2, i);
        buildRightLayoutParams(i);
        if (this.mBannerWidth < this.mScreenWidth) {
            this.mImageLoad.setRadius(this.mActivity, UIUtils.dip2Px(this.mActivity, 4.0f), 0.0f, 0.0f, UIUtils.dip2Px(this.mActivity, 4.0f));
            this.mRightLayout.setBackgroundResource(2130838656);
        }
        this.mImageLoad.setUrl(this.mActivity, imageInfo.getUrl(), i2, i, new ImageLoadCallback() {
            public void onFail() {
                if (FeedBannerAdView.this.mListener != null) {
                    FeedBannerAdView.this.mListener.error(8, "图片加载失败");
                }
            }

            public void onSuccess() {
                if (FeedBannerAdView.this.mBannerAd.isShowClose()) {
                    FeedBannerAdView.this.mCloseView.setVisibility(0);
                }
                FeedBannerAdView.this.mCloseView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        FeedBannerAdView.this.hide();
                        InnerVideoAd.inst().onBannerAdEvent(FeedBannerAdView.this.mActivity, new ExcitingAdEventModel.Builder().setTag("applet_ad").setLabel("close").setAdId(FeedBannerAdView.this.mBannerAd.getId()).setLogExtra(FeedBannerAdView.this.mBannerAd.getLogExtra()).setAdUnitId(FeedBannerAdView.this.mAdUnitId).setRefer("card").build());
                    }
                });
                if (!TextUtils.isEmpty(FeedBannerAdView.this.mBannerAd.getLabel())) {
                    FeedBannerAdView.this.mLabel.setText(FeedBannerAdView.this.mBannerAd.getLabel());
                } else {
                    FeedBannerAdView.this.mLabel.setText("广告");
                }
                FeedBannerAdView.this.mLabel.setVisibility(0);
                FeedBannerAdView.this.setViewOnClickListener();
                if (FeedBannerAdView.this.mListener != null) {
                    FeedBannerAdView.this.mListener.success(FeedBannerAdView.this.mBannerWidth, i);
                }
            }
        });
    }

    public FeedBannerAdView(@NonNull Context context) {
        super(context);
    }

    private void updateIconImageView(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mIconImageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.mIconImageView.setLayoutParams(layoutParams);
    }

    private void buildRightLayoutParams(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mRightLayout.getLayoutParams();
        layoutParams.width = this.mRightWidth;
        layoutParams.height = i;
        this.mRightLayout.setLayoutParams(layoutParams);
        this.mDownloadProgressView.setStatus(DownloadProgressView.Status.IDLE);
        this.mDownloadProgressView.setText(this.mBannerAd.getButtonText());
        ViewGroup.LayoutParams layoutParams2 = this.mRootLayout.getLayoutParams();
        layoutParams2.width = this.mBannerWidth;
        layoutParams2.height = i;
    }

    public void setWidth(int i) {
        double d2 = (double) this.mScreenWidth;
        Double.isNaN(d2);
        if (((double) i) < d2 * 0.8d) {
            double d3 = (double) this.mScreenWidth;
            Double.isNaN(d3);
            i = (int) (d3 * 0.8d);
        } else if (i > this.mScreenWidth) {
            i = this.mScreenWidth;
        }
        this.mBannerWidth = i;
        double d4 = (double) i;
        Double.isNaN(d4);
        this.mImageWidth = (int) (d4 * 0.619d);
        this.mRightWidth = i - this.mImageWidth;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        String str = "card_blank";
        if (view == this.mIconImageView) {
            str = "card_source";
        } else if (view == this.mImageView) {
            str = "card_image";
        }
        if (!this.mBannerAd.getClickTrackUrl().isEmpty()) {
            OkNetwork.inst().sendTrackUrl(this.mBannerAd.getClickTrackUrl(), false);
        }
        if (InnerVideoAd.inst().getOpenWebListener() != null) {
            constructEventModel();
            InnerVideoAd.inst().getOpenWebListener().openWebUrl(this.mActivity, this.mBannerAd.getOpenUrl(), this.mBannerAd.getWebUrl(), this.mBannerAd);
        }
        InnerVideoAd.inst().onBannerAdEvent(this.mActivity, new ExcitingAdEventModel.Builder().setTag("applet_ad").setLabel("click").setAdId(this.mBannerAd.getId()).setLogExtra(this.mBannerAd.getLogExtra()).setAdUnitId(this.mAdUnitId).setRefer(str).build());
    }

    /* access modifiers changed from: protected */
    public void init(Context context) {
        if (InnerVideoAd.inst().isInit()) {
            this.mActivity = (Activity) context;
            this.mScreenWidth = UIUtils.getScreenWidth(this.mActivity);
            this.mRootLayout = new RelativeLayout(context);
            this.mRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            this.mImageLoad = InnerVideoAd.inst().getImageFactory().createImageLoad();
            this.mImageView = this.mImageLoad.createImageView(this.mActivity, 0.0f);
            this.mImageView.setId(C0906R.id.aar);
            this.mImageView.setBackgroundResource(2130838664);
            this.mCloseView = new ImageView(this.mActivity);
            this.mCloseView.setScaleType(ImageView.ScaleType.FIT_XY);
            this.mCloseView.setImageResource(2130838654);
            int dip2Px = (int) UIUtils.dip2Px(this.mActivity, 20.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dip2Px, dip2Px);
            layoutParams.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 5.0f);
            layoutParams.topMargin = (int) UIUtils.dip2Px(this.mActivity, 5.0f);
            layoutParams.addRule(10, -1);
            this.mCloseView.setLayoutParams(layoutParams);
            this.mLabel = new TextView(this.mActivity);
            this.mLabel.setTextSize(1, 10.0f);
            this.mLabel.setTextColor(Color.parseColor("#ccffffff"));
            this.mLabel.setBackgroundResource(2130838655);
            this.mLabel.setGravity(17);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) UIUtils.dip2Px(this.mActivity, 26.0f), (int) UIUtils.dip2Px(this.mActivity, 14.0f));
            layoutParams2.addRule(12, -1);
            layoutParams2.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 5.0f);
            layoutParams2.bottomMargin = (int) UIUtils.dip2Px(this.mActivity, 5.0f);
            this.mLabel.setIncludeFontPadding(false);
            this.mLabel.setLayoutParams(layoutParams2);
            this.mRootLayout.addView(this.mImageView);
            this.mRootLayout.addView(this.mCloseView);
            this.mRootLayout.addView(this.mLabel);
            this.mCloseView.setVisibility(4);
            this.mLabel.setVisibility(4);
            this.mRightLayout = new RelativeLayout(this.mActivity);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(1, C0906R.id.aar);
            this.mRightLayout.setLayoutParams(layoutParams3);
            this.mRightLayout.setBackgroundColor(-1);
            this.mRightLayout.setVisibility(8);
            LinearLayout linearLayout = new LinearLayout(this.mActivity);
            linearLayout.setOrientation(1);
            this.mIconImageLoad = InnerVideoAd.inst().getImageFactory().createImageLoad();
            this.mIconImageView = this.mIconImageLoad.createImageView(this.mActivity, UIUtils.dip2Px(this.mActivity, 6.0f));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) UIUtils.dip2Px(this.mActivity, 44.0f), (int) UIUtils.dip2Px(this.mActivity, 44.0f));
            layoutParams4.gravity = 1;
            int dip2Px2 = (int) UIUtils.dip2Px(this.mActivity, 0.8f);
            layoutParams5.leftMargin = dip2Px2;
            layoutParams5.topMargin = dip2Px2;
            layoutParams5.rightMargin = dip2Px2;
            layoutParams5.bottomMargin = dip2Px2;
            layoutParams5.addRule(13);
            this.mIconRootView = new RelativeLayout(this.mActivity);
            this.mIconRootView.setLayoutParams(layoutParams4);
            this.mIconImageView.setLayoutParams(layoutParams5);
            this.mIconRootView.setBackgroundResource(2130838659);
            this.mIconRootView.addView(this.mIconImageView);
            linearLayout.addView(this.mIconRootView);
            this.mRightTextView = new TextView(this.mActivity);
            this.mRightTextView.setTextColor(Color.parseColor("#ff505050"));
            this.mRightTextView.setTextSize(1, 12.0f);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams6.topMargin = (int) UIUtils.dip2Px(this.mActivity, 4.0f);
            layoutParams6.gravity = 1;
            this.mRightTextView.setSingleLine(true);
            this.mRightTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.mRightTextView.setLayoutParams(layoutParams6);
            linearLayout.addView(this.mRightTextView);
            this.mDownloadProgressView = new DownloadProgressView(this.mActivity);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) UIUtils.dip2Px(this.mActivity, 56.0f), (int) UIUtils.dip2Px(this.mActivity, 24.0f));
            layoutParams7.topMargin = (int) UIUtils.dip2Px(this.mActivity, 6.0f);
            layoutParams7.gravity = 1;
            this.mDownloadProgressView.setLayoutParams(layoutParams7);
            this.mDownloadProgressView.setBackgroundResource(2130838663);
            this.mDownloadProgressView.setTextSize(1, 12.0f);
            this.mDownloadProgressView.setMinHeight(0);
            this.mDownloadProgressView.setPadding(0, 0, 0, 0);
            this.mDownloadProgressView.setTextColor(Color.parseColor("#ffffff"));
            linearLayout.addView(this.mDownloadProgressView);
            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams8.addRule(13, -1);
            linearLayout.setLayoutParams(layoutParams8);
            this.mRightLayout.addView(linearLayout);
            this.mRootLayout.addView(this.mRightLayout);
            addView(this.mRootLayout);
            return;
        }
        throw new RuntimeException("must invoke ExcitingVideoAd.init(INetworkListener,IImageLoadListener,IDownloadListener) method");
    }

    public FeedBannerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void createBannerAd(String str, BannerAdView.BannerAdListener bannerAdListener) {
        this.mListener = bannerAdListener;
        this.mGameId = str;
        InnerVideoAd.inst().getNetwork().requestGet("https://i.snssdk.com/api/ad/v1/banner/" + String.format("?ad_from=applet&creator_id=%s", new Object[]{this.mGameId}), this.mNetWorkCallback);
        hide();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.mBannerAd != null && this.mBannerAd.isDownload()) {
                InnerVideoAd.inst().getDownload().bind(this.mActivity, this.mBannerAd.getId(), this.mBannerAd.getDownloadUrl(), this.mDownloadStatus, this.mBannerAd);
            }
        } else if (this.mBannerAd != null && this.mBannerAd.isDownload()) {
            InnerVideoAd.inst().getDownload().unbind(this.mActivity, this.mBannerAd.getDownloadUrl(), this.mBannerAd);
        }
    }

    public FeedBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void createBannerAd(String str, BannerAdView.BannerAdListener bannerAdListener, String str2) {
        this.mListener = bannerAdListener;
        this.mGameId = str;
        InnerVideoAd.inst().getNetwork().requestGet("https://i.snssdk.com/api/ad/v1/banner/" + String.format("?ad_from=%1$s&creator_id=%2$s", new Object[]{str2, this.mGameId}), this.mNetWorkCallback);
        hide();
    }
}
