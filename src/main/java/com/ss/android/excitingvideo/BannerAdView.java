package com.ss.android.excitingvideo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.excitingvideo.INetworkListener;
import com.ss.android.excitingvideo.model.BaseAd;
import com.ss.android.excitingvideo.model.ImageInfo;
import com.ss.android.excitingvideo.network.OkNetwork;
import com.ss.android.excitingvideo.sdk.InnerVideoAd;
import com.ss.android.excitingvideo.utils.SSLog;
import com.ss.android.excitingvideo.utils.UIUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class BannerAdView extends FrameLayout {
    protected Activity mActivity;
    protected String mAdUnitId;
    protected BaseAd mBannerAd;
    protected ImageView mCloseView;
    public IDownloadStatus mDownloadStatus = new IDownloadStatus() {
        public void onDownloadStart() {
        }

        public void onDownloading(int i) {
        }

        public void onFail() {
        }

        public void onFinish() {
        }

        public void onIdle() {
        }

        public void onInstalled() {
        }

        public void onPause(int i) {
        }
    };
    protected String mGameId;
    protected IImageLoadListener mImageLoad;
    private int mImageMaxHeight;
    private int mImageMinHeight;
    protected View mImageView;
    protected int mImageWidth;
    protected TextView mLabel;
    protected BannerAdListener mListener;
    protected INetworkListener.NetworkCallback mNetWorkCallback = new INetworkListener.NetworkCallback() {
        public void onSuccess(String str) {
            if (TextUtils.isEmpty(str)) {
                if (BannerAdView.this.mListener != null) {
                    BannerAdView.this.mListener.error(7, "response is empty");
                }
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("code");
                if (optInt != 0) {
                    String optString = jSONObject.optString("message");
                    String str2 = "服务端错误, errorCode = " + optInt + ", message: " + optString;
                    if (BannerAdView.this.mListener != null) {
                        BannerAdView.this.mListener.error(optInt, str2);
                    }
                    SSLog.error(str2 + "\nresponse: " + str);
                    return;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_item");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        BannerAdView.this.mBannerAd = new BaseAd(optJSONArray.optJSONObject(0));
                        if (!BannerAdView.this.mBannerAd.isValid()) {
                            if (BannerAdView.this.mListener != null) {
                                BannerAdView.this.mListener.error(5, "无效的广告");
                            }
                            SSLog.error("无效的广告\nresponse: " + str);
                            return;
                        }
                        BannerAdView.this.bindData();
                        return;
                    }
                }
                if (BannerAdView.this.mListener != null) {
                    BannerAdView.this.mListener.error(4, "服务端没有返回广告");
                }
                SSLog.error("服务端没有返回广告\nresponse: " + str);
            } catch (Exception unused) {
                if (BannerAdView.this.mListener != null) {
                    BannerAdView.this.mListener.error(3, "JSON 数据解析异常");
                }
                SSLog.error("JSON 数据解析异常\nresponse: " + str);
            }
        }

        public void onFail(int i, String str) {
            String format = String.format("网络请求错误，errorCode = %d, message: %s", new Object[]{Integer.valueOf(i), str});
            if (BannerAdView.this.mListener != null) {
                BannerAdView.this.mListener.error(1, format);
            }
            SSLog.error("JSON 数据解析异常\nresponse:" + format);
        }
    };

    public interface BannerAdListener {
        void error(int i, String str);

        void success(int i, int i2);
    }

    public void setVisibility(int i) {
    }

    public void hide() {
        super.setVisibility(8);
    }

    public void bannerAdShowEvent() {
        InnerVideoAd.inst().onBannerAdEvent(this.mActivity, "game_ad", "show", this.mBannerAd.getId(), this.mBannerAd.getLogExtra(), this.mAdUnitId);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (InnerVideoAd.inst().getDownload() != null && this.mBannerAd != null) {
            InnerVideoAd.inst().getDownload().unbind(this.mActivity, this.mBannerAd.getDownloadUrl(), this.mBannerAd);
        }
    }

    public void show() {
        super.setVisibility(0);
        if (this.mBannerAd != null) {
            if (!this.mBannerAd.getTrackUrl().isEmpty()) {
                OkNetwork.inst().sendTrackUrl(this.mBannerAd.getTrackUrl());
            }
            bannerAdShowEvent();
        }
    }

    /* access modifiers changed from: protected */
    public void bindData() {
        final int i;
        final int i2;
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
            int dip2Px = (int) UIUtils.dip2Px(this.mActivity, 90.0f);
            double d4 = (double) dip2Px;
            Double.isNaN(d4);
            double height2 = (double) imageInfo.getHeight();
            Double.isNaN(height2);
            double d5 = (d4 * 1.0d) / height2;
            double width2 = (double) imageInfo.getWidth();
            Double.isNaN(width2);
            i = dip2Px;
            i2 = (int) (d5 * width2);
        }
        buildImageLayoutParams(i2, i);
        this.mImageLoad.setUrl(this.mActivity, imageInfo.getUrl(), i2, i, new ImageLoadCallback() {
            public void onFail() {
                if (BannerAdView.this.mListener != null) {
                    BannerAdView.this.mListener.error(8, "图片加载失败");
                }
            }

            public void onSuccess() {
                if (BannerAdView.this.mBannerAd.isShowClose()) {
                    BannerAdView.this.mCloseView.setVisibility(0);
                }
                BannerAdView.this.mCloseView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        BannerAdView.this.hide();
                        InnerVideoAd.inst().onBannerAdEvent(BannerAdView.this.mActivity, "game_ad", "close", BannerAdView.this.mBannerAd.getId(), BannerAdView.this.mBannerAd.getLogExtra(), BannerAdView.this.mAdUnitId);
                    }
                });
                if (!TextUtils.isEmpty(BannerAdView.this.mBannerAd.getLabel())) {
                    BannerAdView.this.mLabel.setText(BannerAdView.this.mBannerAd.getLabel());
                } else {
                    BannerAdView.this.mLabel.setText("广告");
                }
                BannerAdView.this.mLabel.setVisibility(0);
                BannerAdView.this.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (!BannerAdView.this.mBannerAd.getClickTrackUrl().isEmpty()) {
                            OkNetwork.inst().sendTrackUrl(BannerAdView.this.mBannerAd.getClickTrackUrl(), false);
                        }
                        if (BannerAdView.this.mBannerAd.isWeb()) {
                            if (InnerVideoAd.inst().getOpenWebListener() != null) {
                                InnerVideoAd.inst().getOpenWebListener().openWebUrl(BannerAdView.this.mActivity, BannerAdView.this.mBannerAd.getOpenUrl(), BannerAdView.this.mBannerAd.getWebUrl(), BannerAdView.this.mBannerAd);
                            }
                        } else if (BannerAdView.this.mBannerAd.isDownload() && InnerVideoAd.inst().getDownload() != null) {
                            InnerVideoAd.inst().getDownload().bind(BannerAdView.this.mActivity, BannerAdView.this.mBannerAd.getId(), BannerAdView.this.mBannerAd.getDownloadUrl(), BannerAdView.this.mDownloadStatus, BannerAdView.this.mBannerAd);
                            InnerVideoAd.inst().getDownload().download(BannerAdView.this.mActivity, BannerAdView.this.mBannerAd.getDownloadUrl(), BannerAdView.this.mBannerAd);
                        }
                        InnerVideoAd.inst().onBannerAdEvent(BannerAdView.this.mActivity, "game_ad", "click", BannerAdView.this.mBannerAd.getId(), BannerAdView.this.mBannerAd.getLogExtra(), BannerAdView.this.mAdUnitId);
                    }
                });
                if (BannerAdView.this.mListener != null) {
                    BannerAdView.this.mListener.success(i2, i);
                }
            }
        });
    }

    public void setAdUnitId(String str) {
        this.mAdUnitId = str;
    }

    public BannerAdView(Context context) {
        super(context);
        init(context);
    }

    public void setWidth(int i) {
        int width = this.mImageView.getWidth();
        if (width != 0) {
            double height = (double) (this.mImageView.getHeight() * i);
            Double.isNaN(height);
            double d2 = (double) width;
            Double.isNaN(d2);
            buildImageLayoutParams(i, (int) ((height * 1.0d) / d2));
            return;
        }
        this.mImageWidth = i;
        if (this.mBannerAd != null) {
            ImageInfo imageInfo = this.mBannerAd.getImageInfo();
            if (imageInfo != null && imageInfo.getWidth() > 0 && imageInfo.getWidth() > 0) {
                double height2 = (double) imageInfo.getHeight();
                Double.isNaN(height2);
                double d3 = (double) this.mImageWidth;
                Double.isNaN(d3);
                double width2 = (double) imageInfo.getWidth();
                Double.isNaN(width2);
                buildImageLayoutParams(i, (int) (((height2 * 1.0d) * d3) / width2));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void init(Context context) {
        if (InnerVideoAd.inst().isInit()) {
            this.mActivity = (Activity) context;
            this.mImageLoad = InnerVideoAd.inst().getImageFactory().createImageLoad();
            this.mImageView = this.mImageLoad.createImageView(this.mActivity, 0.0f);
            this.mCloseView = new ImageView(this.mActivity);
            this.mCloseView.setScaleType(ImageView.ScaleType.FIT_XY);
            this.mCloseView.setImageResource(2130838654);
            int dip2Px = (int) UIUtils.dip2Px(this.mActivity, 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dip2Px, dip2Px);
            layoutParams.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 3.0f);
            layoutParams.topMargin = (int) UIUtils.dip2Px(this.mActivity, 3.0f);
            this.mCloseView.setLayoutParams(layoutParams);
            this.mLabel = new TextView(this.mActivity);
            this.mLabel.setTextSize(1, 10.0f);
            this.mLabel.setTextColor(Color.parseColor("#ccffffff"));
            this.mLabel.setBackgroundResource(2130838653);
            this.mLabel.setGravity(17);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) UIUtils.dip2Px(this.mActivity, 30.0f), (int) UIUtils.dip2Px(this.mActivity, 14.0f));
            layoutParams2.gravity = 80;
            this.mLabel.setLayoutParams(layoutParams2);
            this.mImageMaxHeight = (int) UIUtils.dip2Px(this.mActivity, 107.0f);
            this.mImageMinHeight = (int) UIUtils.dip2Px(this.mActivity, 72.0f);
            addView(this.mImageView);
            addView(this.mCloseView);
            addView(this.mLabel);
            this.mCloseView.setVisibility(4);
            this.mLabel.setVisibility(4);
            return;
        }
        throw new RuntimeException("must invoke ExcitingVideoAd.init(INetworkListener,IImageLoadListener,IDownloadListener) method");
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void buildImageLayoutParams(int i, int i2) {
        if (i > 0 && i2 > 0 && this.mImageView != null) {
            ViewGroup.LayoutParams layoutParams = this.mImageView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i, i2);
            } else {
                layoutParams.width = i;
                layoutParams.height = i2;
            }
            this.mImageView.setLayoutParams(layoutParams);
        }
    }

    public void createBannerAd(String str, BannerAdListener bannerAdListener) {
        this.mListener = bannerAdListener;
        this.mGameId = str;
        InnerVideoAd.inst().getNetwork().requestGet("https://i.snssdk.com/api/ad/v1/banner/" + String.format("?ad_from=game&creator_id=%s", new Object[]{this.mGameId}), this.mNetWorkCallback);
        hide();
    }

    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
