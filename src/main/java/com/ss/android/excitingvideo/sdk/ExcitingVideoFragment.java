package com.ss.android.excitingvideo.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.excitingvideo.ExcitingVideoListener;
import com.ss.android.excitingvideo.IDialogClickCallback;
import com.ss.android.excitingvideo.IDownloadStatus;
import com.ss.android.excitingvideo.IImageLoadFactory;
import com.ss.android.excitingvideo.IImageLoadListener;
import com.ss.android.excitingvideo.ImageLoadCallback;
import com.ss.android.excitingvideo.model.VideoAd;
import com.ss.android.excitingvideo.network.OkNetwork;
import com.ss.android.excitingvideo.sdk.DownloadProgressView;
import com.ss.android.excitingvideo.utils.ToolUtils;
import com.ss.android.excitingvideo.utils.UIUtils;
import com.ss.android.excitingvideo.video.BaseVideoView;
import com.ss.android.excitingvideo.video.VideoController;
import com.ss.android.excitingvideo.video.VideoStatusListener;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONException;
import org.json.JSONObject;

public class ExcitingVideoFragment extends Fragment implements View.OnTouchListener, IFragmentBack {
    public boolean hasComplete;
    public boolean hasPlayed;
    public boolean isMute = true;
    public Activity mActivity;
    public Dialog mAlertDialog;
    private int mAvatarSize;
    public View mAvatarView;
    public View mBackgroundView;
    private RelativeLayout mBottomLayout;
    public DownloadProgressView mClickBtn;
    public TextView mCloseAdView;
    private TextView mDescView;
    private RelativeLayout mDialogLayout;
    private IDownloadStatus mDownloadStatus = new IDownloadStatus() {
        public void onDownloadStart() {
            ExcitingVideoFragment.this.mClickBtn.setText("下载应用");
            ExcitingVideoFragment.this.mClickBtn.setStatus(DownloadProgressView.Status.IDLE);
        }

        public void onFail() {
            ExcitingVideoFragment.this.mClickBtn.setText("重新下载");
            ExcitingVideoFragment.this.mClickBtn.setStatus(DownloadProgressView.Status.IDLE);
        }

        public void onFinish() {
            ExcitingVideoFragment.this.mClickBtn.setText("立即安装");
            ExcitingVideoFragment.this.mClickBtn.setStatus(DownloadProgressView.Status.FINISH);
        }

        public void onIdle() {
            ExcitingVideoFragment.this.mClickBtn.setText("下载应用");
            ExcitingVideoFragment.this.mClickBtn.setStatus(DownloadProgressView.Status.IDLE);
        }

        public void onInstalled() {
            ExcitingVideoFragment.this.mClickBtn.setText("立即打开");
            ExcitingVideoFragment.this.mClickBtn.setStatus(DownloadProgressView.Status.FINISH);
        }

        public void onPause(int i) {
            ExcitingVideoFragment.this.mClickBtn.setText("继续下载");
            ExcitingVideoFragment.this.mClickBtn.setStatus(DownloadProgressView.Status.DOWNLOADING);
            ExcitingVideoFragment.this.mClickBtn.setProgressInt(i);
        }

        public void onDownloading(int i) {
            DownloadProgressView downloadProgressView = ExcitingVideoFragment.this.mClickBtn;
            downloadProgressView.setText(i + "%");
            ExcitingVideoFragment.this.mClickBtn.setStatus(DownloadProgressView.Status.DOWNLOADING);
            ExcitingVideoFragment.this.mClickBtn.setProgressInt(i);
        }
    };
    private IFragmentCloseListener mFragmentClose;
    private IImageLoadListener mImageLoad;
    private IImageLoadFactory mImageLoadFactory;
    private boolean mIsDestroy;
    private boolean mIsJumpWeb;
    public ImageView mMuteView;
    public int mPlayCurrentPosition;
    private RelativeLayout mRootView;
    private TextView mTitleView;
    public VideoAd mVideoAd;
    public VideoController mVideoController;
    public ExcitingVideoListener mVideoListener;
    private VideoStatusListener mVideoStatusListener = new VideoStatusListener() {
        public void onPause() {
        }

        public void onPlay() {
            ExcitingVideoFragment.this.mMuteView.setVisibility(0);
            if (!ExcitingVideoFragment.this.hasPlayed && ExcitingVideoFragment.this.mVideoAd != null) {
                ExcitingVideoFragment.this.hasPlayed = true;
                if (!ExcitingVideoFragment.this.mVideoAd.getPlayTrackUrl().isEmpty()) {
                    OkNetwork.inst().sendTrackUrl(ExcitingVideoFragment.this.mVideoAd.getPlayTrackUrl());
                }
                InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "play", ExcitingVideoFragment.this.mVideoAd.getId(), "video");
            }
            if (ExcitingVideoFragment.this.mAlertDialog != null && ExcitingVideoFragment.this.mAlertDialog.isShowing()) {
                ExcitingVideoFragment.this.mVideoController.pause();
            }
        }

        public void onComplete() {
            if (ExcitingVideoFragment.this.mCloseAdView != null) {
                ExcitingVideoFragment.this.mCloseAdView.setText("关闭广告");
            }
            ExcitingVideoFragment.this.hasComplete = true;
            if (!ExcitingVideoFragment.this.mVideoAd.getPlayOverTrackUrl().isEmpty()) {
                OkNetwork.inst().sendTrackUrl(ExcitingVideoFragment.this.mVideoAd.getPlayOverTrackUrl());
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", "video");
                jSONObject.put("duration", ExcitingVideoFragment.this.mPlayCurrentPosition * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                jSONObject.put("video_length", ExcitingVideoFragment.this.mPlayCurrentPosition * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                jSONObject.put("percent", 100);
                jSONObject.put("log_extra", ExcitingVideoFragment.this.mVideoAd.getLogExtra());
                jSONObject.put("is_ad_event", 1);
                if (!TextUtils.isEmpty(InnerVideoAd.inst().getAdUnitId())) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", InnerVideoAd.inst().getAdUnitId());
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "play_over", ExcitingVideoFragment.this.mVideoAd.getId(), jSONObject);
        }

        public void onPlayProgress(int i, int i2) {
            if (ExcitingVideoFragment.this.mVideoAd != null && i == ExcitingVideoFragment.this.mVideoAd.getEffectivePlayTime() && !ExcitingVideoFragment.this.mVideoAd.getEffectPlayTrackUrl().isEmpty()) {
                OkNetwork.inst().sendTrackUrl(ExcitingVideoFragment.this.mVideoAd.getEffectPlayTrackUrl());
            }
            if (i == 5) {
                ExcitingVideoFragment.this.mCloseAdView.setVisibility(0);
            }
            ExcitingVideoFragment.this.mPlayCurrentPosition = i;
            ExcitingVideoFragment.this.setCloseViewText();
        }

        public void onError(int i, String str) {
            if (!ExcitingVideoFragment.this.hasPlayed || ExcitingVideoFragment.this.mVideoAd == null) {
                if (ExcitingVideoFragment.this.mVideoListener != null) {
                    ExcitingVideoFragment.this.mVideoListener.onError(6, String.format("视频播放错误, errorCode = %d, errorMsg = %s", new Object[]{Integer.valueOf(i), str}));
                }
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", "video");
                jSONObject.put("duration", ExcitingVideoFragment.this.mPlayCurrentPosition * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                int duration = ExcitingVideoFragment.this.mVideoAd.getDuration();
                jSONObject.put("video_length", ExcitingVideoFragment.this.mVideoAd.getDuration() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                double d2 = (double) ExcitingVideoFragment.this.mPlayCurrentPosition;
                Double.isNaN(d2);
                double d3 = (double) duration;
                Double.isNaN(d3);
                jSONObject.put("percent", (int) (((d2 * 1.0d) / d3) * 100.0d));
                jSONObject.put("log_extra", ExcitingVideoFragment.this.mVideoAd.getLogExtra());
                jSONObject.put("is_ad_event", 1);
                if (!TextUtils.isEmpty(InnerVideoAd.inst().getAdUnitId())) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", InnerVideoAd.inst().getAdUnitId());
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "play_break", ExcitingVideoFragment.this.mVideoAd.getId(), jSONObject);
            if (ExcitingVideoFragment.this.mVideoListener != null) {
                ExcitingVideoFragment.this.mVideoListener.onError(6, String.format("视频播放错误, errorCode = %d, errorMsg = %s", new Object[]{Integer.valueOf(i), str}));
            }
        }
    };
    private BaseVideoView mVideoView;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
            if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                dialog.dismiss();
                return;
            }
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    /* access modifiers changed from: protected */
    public void close() {
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public void closeAd() {
        close();
        destroy();
        if (this.mFragmentClose != null) {
            this.mFragmentClose.closeFragment();
        }
    }

    public void onStop() {
        super.onStop();
        if (this.mVideoView.getVisibility() == 0) {
            this.mVideoView.setVisibility(4);
        }
    }

    public boolean onBackPressed() {
        if (this.hasPlayed && (this.hasComplete || this.mPlayCurrentPosition >= this.mVideoAd.getInspireTime())) {
            closeAd();
        } else if (this.mVideoAd != null) {
            showAlertDialog();
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        destroy();
        this.mVideoController.release();
        if (this.mAlertDialog != null && this.mAlertDialog.isShowing()) {
            _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(this.mAlertDialog);
        }
        this.mAlertDialog = null;
        this.mVideoStatusListener = null;
        this.mAvatarView = null;
    }

    public void onPause() {
        FragmentInstrumentation.onPause(this);
        super.onPause();
        this.mVideoController.pause();
        if (this.mVideoAd != null && InnerVideoAd.inst().getDownload() != null && this.mVideoAd.getType().equals(PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
            InnerVideoAd.inst().getDownload().unbind(this.mActivity, this.mVideoAd.getDownloadUrl(), this.mVideoAd);
        }
    }

    public void setCloseViewText() {
        if (!this.mVideoController.isVideoComplete() && this.mVideoAd != null) {
            String str = "关闭广告";
            if (this.mVideoAd.getInspireTime() - this.mPlayCurrentPosition > 0) {
                str = "关闭广告 " + r0 + NotifyType.SOUND;
            }
            this.mCloseAdView.setText(str);
        }
    }

    public void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        if (this.mVideoView.getVisibility() == 4) {
            this.mVideoView.setVisibility(0);
        }
        this.mVideoController.resume();
        if (this.mVideoAd != null && InnerVideoAd.inst().getDownload() != null && this.mVideoAd.getType().equals(PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
            InnerVideoAd.inst().getDownload().bind(this.mActivity, this.mVideoAd.getId(), this.mVideoAd.getDownloadUrl(), this.mDownloadStatus, this.mVideoAd);
        }
    }

    private void bindData() {
        if (this.mVideoAd == null) {
            this.mVideoAd = InnerVideoAd.inst().getVideoAd();
            if (this.mVideoAd == null) {
                if (getActivity() != null) {
                    getActivity().finish();
                }
                return;
            }
        }
        if (!(!this.mVideoAd.isHorizonVideo() || this.mVideoAd.getWidth() == 0 || this.mVideoAd.getHeight() == 0)) {
            this.mVideoView.setSize(this.mVideoAd.getWidth(), this.mVideoAd.getHeight());
        }
        this.mVideoController.play(this.mVideoAd.getVideoId(), !this.mVideoAd.isHorizonVideo());
        this.mTitleView.setText(this.mVideoAd.getSource());
        if (TextUtils.isEmpty(this.mVideoAd.getTitle())) {
            this.mDescView.setVisibility(8);
        } else {
            this.mDescView.setText(this.mVideoAd.getTitle());
        }
        setCloseViewText();
        if (!this.mVideoAd.getType().equals(PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
            this.mClickBtn.setText(this.mVideoAd.getButtonText());
        } else if (ToolUtils.isInstalledApp(this.mActivity, this.mVideoAd.getPackageName())) {
            this.mClickBtn.setText("立即打开");
        } else if (InnerVideoAd.inst().getDownload() == null || !InnerVideoAd.inst().getDownload().isDownloaded(this.mActivity, this.mVideoAd.getDownloadUrl())) {
            this.mClickBtn.setText(this.mVideoAd.getButtonText());
        } else {
            this.mClickBtn.setText("立即安装");
        }
        if (TextUtils.isEmpty(this.mVideoAd.getAvatarUrl())) {
            if (this.mAvatarView != null) {
                this.mAvatarView.setVisibility(8);
            }
        } else if (this.mImageLoad != null) {
            this.mImageLoad.setUrl(this.mActivity, this.mVideoAd.getAvatarUrl(), this.mAvatarSize, this.mAvatarSize, new ImageLoadCallback() {
                public void onSuccess() {
                }

                public void onFail() {
                    ExcitingVideoFragment.this.mAvatarView.setVisibility(8);
                }
            });
        }
        if (!this.mVideoAd.getTrackUrl().isEmpty()) {
            OkNetwork.inst().sendTrackUrl(this.mVideoAd.getTrackUrl());
        }
        InnerVideoAd.inst().onAdEvent((Context) this.mActivity, "landing_ad", "othershow", this.mVideoAd.getId(), "card");
        InnerVideoAd.inst().onAdEvent((Context) this.mActivity, "landing_ad", "show", this.mVideoAd.getId(), "video");
    }

    private void destroy() {
        if (!this.mIsDestroy && this.mVideoAd != null) {
            this.mIsDestroy = true;
            if (!this.mVideoController.isVideoComplete() || !this.hasComplete) {
                if (this.mVideoListener != null) {
                    this.mVideoListener.onComplete(this.mVideoController.getCurrentPosition(), this.mVideoAd.getInspireTime(), this.mVideoAd.getDuration());
                }
                if (this.mVideoController.getCurrentPosition() >= this.mVideoAd.getInspireTime()) {
                    InnerVideoAd.inst().onAdEvent((Context) this.mActivity, "landing_ad", "receive_award", this.mVideoAd.getId(), "video");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("refer", "video");
                    jSONObject.put("duration", this.mPlayCurrentPosition * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    int duration = this.mVideoAd.getDuration();
                    jSONObject.put("video_length", this.mVideoAd.getDuration() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    double d2 = (double) this.mPlayCurrentPosition;
                    Double.isNaN(d2);
                    double d3 = (double) duration;
                    Double.isNaN(d3);
                    jSONObject.put("percent", (int) (((d2 * 1.0d) / d3) * 100.0d));
                    jSONObject.put("log_extra", this.mVideoAd.getLogExtra());
                    jSONObject.put("is_ad_event", 1);
                    if (!TextUtils.isEmpty(InnerVideoAd.inst().getAdUnitId())) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("adUnitId", InnerVideoAd.inst().getAdUnitId());
                        jSONObject.put("ad_extra_data", jSONObject2);
                    }
                } catch (JSONException unused) {
                }
                InnerVideoAd.inst().onAdEvent((Context) this.mActivity, "landing_ad", "play_break", this.mVideoAd.getId(), jSONObject);
            } else {
                if (this.mVideoListener != null) {
                    this.mVideoListener.onComplete(this.mVideoAd.getDuration(), this.mVideoAd.getInspireTime(), this.mVideoAd.getDuration());
                }
                InnerVideoAd.inst().onAdEvent((Context) this.mActivity, "landing_ad", "receive_award", this.mVideoAd.getId(), "video");
            }
            InnerVideoAd.inst().setVideoListener(null);
        }
    }

    public void showAlertDialog() {
        if (this.mAlertDialog == null) {
            if (InnerVideoAd.inst().getDialogFactory() != null) {
                this.mAlertDialog = InnerVideoAd.inst().getDialogFactory().createDialog(this.mActivity, this.mVideoAd, new IDialogClickCallback() {

                    /* renamed from: com.ss.android.excitingvideo.sdk.ExcitingVideoFragment$6$_lancet */
                    public class _lancet {
                        private _lancet() {
                        }

                        @TargetClass
                        @Proxy
                        static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
                            if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                dialog.dismiss();
                                return;
                            }
                            throw new IllegalStateException("debug check! this method should be called from main thread!");
                        }
                    }

                    public void cancelClick() {
                        ExcitingVideoFragment.this.mBackgroundView.setVisibility(8);
                        _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(ExcitingVideoFragment.this.mAlertDialog);
                        ExcitingVideoFragment.this.mVideoController.resume();
                        InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "otherclick", ExcitingVideoFragment.this.mVideoAd.getId(), "cancel");
                    }

                    public void confirmClick() {
                        ExcitingVideoFragment.this.mBackgroundView.setVisibility(8);
                        _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(ExcitingVideoFragment.this.mAlertDialog);
                        ExcitingVideoFragment.this.closeAd();
                        InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "otherclick", ExcitingVideoFragment.this.mVideoAd.getId(), "confirm");
                    }
                });
            } else {
                this.mDialogLayout = new RelativeLayout(this.mActivity);
                this.mDialogLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                int dip2Px = (int) UIUtils.dip2Px(this.mActivity, 280.0f);
                int dip2Px2 = (int) UIUtils.dip2Px(this.mActivity, 114.0f);
                this.mDialogLayout.setLayoutParams(new RelativeLayout.LayoutParams(dip2Px, dip2Px2));
                TextView textView = new TextView(this.mActivity);
                if (TextUtils.isEmpty(this.mVideoAd.getQuitText())) {
                    textView.setText("观看完整视频可获得奖励");
                } else {
                    textView.setText(this.mVideoAd.getQuitText());
                }
                textView.setTextColor(Color.parseColor("#222222"));
                textView.setTextSize(1, 17.0f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 24.0f);
                layoutParams.topMargin = (int) UIUtils.dip2Px(this.mActivity, 21.0f);
                textView.setLayoutParams(layoutParams);
                this.mDialogLayout.addView(textView);
                TextView textView2 = new TextView(this.mActivity);
                textView2.setText("关闭广告");
                textView2.setTextColor(Color.parseColor("#2a90d7"));
                textView2.setTextSize(1, 15.0f);
                textView2.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: com.ss.android.excitingvideo.sdk.ExcitingVideoFragment$7$_lancet */
                    public class _lancet {
                        private _lancet() {
                        }

                        @TargetClass
                        @Proxy
                        static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
                            if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                dialog.dismiss();
                                return;
                            }
                            throw new IllegalStateException("debug check! this method should be called from main thread!");
                        }
                    }

                    public void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        ExcitingVideoFragment.this.mBackgroundView.setVisibility(8);
                        _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(ExcitingVideoFragment.this.mAlertDialog);
                        ExcitingVideoFragment.this.closeAd();
                        InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "otherclick", ExcitingVideoFragment.this.mVideoAd.getId(), "confirm");
                    }
                });
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(12, -1);
                layoutParams2.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 117.0f);
                layoutParams2.bottomMargin = (int) UIUtils.dip2Px(this.mActivity, 16.0f);
                textView2.setLayoutParams(layoutParams2);
                this.mDialogLayout.addView(textView2);
                TextView textView3 = new TextView(this.mActivity);
                textView3.setText("继续观看");
                textView3.setTextColor(Color.parseColor("#2a90d7"));
                textView3.setTextSize(1, 15.0f);
                textView3.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: com.ss.android.excitingvideo.sdk.ExcitingVideoFragment$8$_lancet */
                    public class _lancet {
                        private _lancet() {
                        }

                        @TargetClass
                        @Proxy
                        static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
                            if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                dialog.dismiss();
                                return;
                            }
                            throw new IllegalStateException("debug check! this method should be called from main thread!");
                        }
                    }

                    public void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        ExcitingVideoFragment.this.mBackgroundView.setVisibility(8);
                        _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(ExcitingVideoFragment.this.mAlertDialog);
                        ExcitingVideoFragment.this.mVideoController.resume();
                        InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "otherclick", ExcitingVideoFragment.this.mVideoAd.getId(), "cancel");
                    }
                });
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(12, -1);
                layoutParams3.addRule(11, -1);
                layoutParams3.rightMargin = (int) UIUtils.dip2Px(this.mActivity, 18.0f);
                layoutParams3.bottomMargin = (int) UIUtils.dip2Px(this.mActivity, 16.0f);
                textView3.setLayoutParams(layoutParams3);
                this.mDialogLayout.addView(textView3);
                this.mAlertDialog = new AlertDialog.Builder(this.mActivity, C0906R.style.rk).create();
                WindowManager.LayoutParams attributes = this.mAlertDialog.getWindow().getAttributes();
                attributes.width = dip2Px;
                attributes.height = dip2Px2;
                this.mAlertDialog.getWindow().setAttributes(attributes);
                this.mAlertDialog.setCancelable(false);
            }
        }
        this.mBackgroundView.setVisibility(0);
        this.mAlertDialog.show();
        if (InnerVideoAd.inst().getDialogFactory() == null) {
            this.mAlertDialog.setContentView(this.mDialogLayout);
        }
        this.mVideoController.pause();
    }

    private void initView() {
        this.mMuteView = new ImageView(this.mActivity);
        this.mMuteView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.mMuteView.setImageResource(2130838658);
        int dip2Px = (int) UIUtils.dip2Px(this.mActivity, 32.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dip2Px, dip2Px);
        layoutParams.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 16.0f);
        layoutParams.topMargin = (int) UIUtils.dip2Px(this.mActivity, 20.0f);
        this.mMuteView.setLayoutParams(layoutParams);
        this.mMuteView.setVisibility(4);
        this.mMuteView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ExcitingVideoFragment.this.isMute) {
                    ExcitingVideoFragment.this.mMuteView.setImageResource(2130838661);
                    ExcitingVideoFragment.this.isMute = false;
                    InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "vocal", ExcitingVideoFragment.this.mVideoAd.getId(), "video");
                } else {
                    ExcitingVideoFragment.this.mMuteView.setImageResource(2130838658);
                    ExcitingVideoFragment.this.isMute = true;
                    InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "mute", ExcitingVideoFragment.this.mVideoAd.getId(), "video");
                }
                ExcitingVideoFragment.this.mVideoController.setMute(ExcitingVideoFragment.this.isMute);
            }
        });
        this.mRootView.addView(this.mMuteView);
        UIUtils.expandViewTouchDelegate(this.mMuteView, (int) UIUtils.dip2Px(this.mActivity, 10.0f));
        this.mCloseAdView = new TextView(this.mActivity);
        this.mCloseAdView.setTextSize(1, 12.0f);
        this.mCloseAdView.setTextColor(Color.parseColor("#ffffff"));
        this.mCloseAdView.setGravity(17);
        this.mCloseAdView.setBackgroundResource(2130838657);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) UIUtils.dip2Px(this.mActivity, 89.0f), (int) UIUtils.dip2Px(this.mActivity, 32.0f));
        layoutParams2.topMargin = (int) UIUtils.dip2Px(this.mActivity, 20.0f);
        layoutParams2.rightMargin = (int) UIUtils.dip2Px(this.mActivity, 16.0f);
        layoutParams2.addRule(11);
        this.mCloseAdView.setLayoutParams(layoutParams2);
        this.mCloseAdView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!ExcitingVideoFragment.this.hasPlayed || (!ExcitingVideoFragment.this.hasComplete && ExcitingVideoFragment.this.mPlayCurrentPosition < ExcitingVideoFragment.this.mVideoAd.getInspireTime())) {
                    ExcitingVideoFragment.this.showAlertDialog();
                } else {
                    ExcitingVideoFragment.this.closeAd();
                }
                InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "close", ExcitingVideoFragment.this.mVideoAd.getId(), "video");
            }
        });
        this.mCloseAdView.setVisibility(4);
        this.mRootView.addView(this.mCloseAdView);
        View view = new View(this.mActivity);
        view.setBackgroundResource(2130838665);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) UIUtils.dip2Px(this.mActivity, 100.0f));
        layoutParams3.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 2.0f);
        layoutParams3.rightMargin = (int) UIUtils.dip2Px(this.mActivity, 2.0f);
        layoutParams3.bottomMargin = (int) UIUtils.dip2Px(this.mActivity, 2.0f);
        layoutParams3.addRule(12, -1);
        view.setLayoutParams(layoutParams3);
        this.mRootView.addView(view);
        this.mBottomLayout = new RelativeLayout(this.mActivity);
        this.mBottomLayout.setBackgroundResource(2130838662);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, (int) UIUtils.dip2Px(this.mActivity, 80.0f));
        layoutParams4.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 16.0f);
        layoutParams4.rightMargin = (int) UIUtils.dip2Px(this.mActivity, 16.0f);
        layoutParams4.bottomMargin = (int) UIUtils.dip2Px(this.mActivity, 16.0f);
        layoutParams4.addRule(12, -1);
        this.mBottomLayout.setLayoutParams(layoutParams4);
        this.mRootView.addView(this.mBottomLayout);
        if (this.mImageLoadFactory != null) {
            this.mImageLoad = this.mImageLoadFactory.createImageLoad();
            this.mAvatarView = this.mImageLoad.createImageView(this.mActivity, UIUtils.dip2Px(this.mActivity, 14.0f));
            this.mAvatarView.setId(C0906R.id.aas);
            this.mAvatarSize = (int) UIUtils.dip2Px(this.mActivity, 56.0f);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(this.mAvatarSize, this.mAvatarSize);
            layoutParams5.addRule(15);
            layoutParams5.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 12.0f);
            this.mAvatarView.setLayoutParams(layoutParams5);
            this.mBottomLayout.addView(this.mAvatarView);
        }
        this.mClickBtn = new DownloadProgressView(this.mActivity);
        this.mClickBtn.setId(C0906R.id.aat);
        this.mClickBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ExcitingVideoFragment.this.mVideoAd.isWeb()) {
                    if (!ExcitingVideoFragment.this.mVideoAd.getClickTrackUrl().isEmpty()) {
                        OkNetwork.inst().sendTrackUrl(ExcitingVideoFragment.this.mVideoAd.getClickTrackUrl(), false);
                    }
                    if (InnerVideoAd.inst().getOpenWebListener() != null && (!TextUtils.isEmpty(ExcitingVideoFragment.this.mVideoAd.getOpenUrl()) || !TextUtils.isEmpty(ExcitingVideoFragment.this.mVideoAd.getWebUrl()))) {
                        InnerVideoAd.inst().getOpenWebListener().openWebUrl(ExcitingVideoFragment.this.mActivity, ExcitingVideoFragment.this.mVideoAd.getOpenUrl(), ExcitingVideoFragment.this.mVideoAd.getWebUrl(), ExcitingVideoFragment.this.mVideoAd);
                        InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "click", ExcitingVideoFragment.this.mVideoAd.getId(), "card_button");
                    }
                } else if (ExcitingVideoFragment.this.mVideoAd.isDownload() && InnerVideoAd.inst().getDownload() != null) {
                    InnerVideoAd.inst().getDownload().download(ExcitingVideoFragment.this.mActivity, ExcitingVideoFragment.this.mVideoAd.getDownloadUrl(), ExcitingVideoFragment.this.mVideoAd);
                }
            }
        });
        this.mClickBtn.setBackgroundResource(2130838663);
        this.mClickBtn.setTextSize(1, 14.0f);
        this.mClickBtn.setMinHeight(0);
        this.mClickBtn.setPadding(0, 0, 0, 0);
        this.mClickBtn.setTextColor(Color.parseColor("#ffffff"));
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) UIUtils.dip2Px(this.mActivity, 72.0f), (int) UIUtils.dip2Px(this.mActivity, 28.0f));
        layoutParams6.addRule(15, -1);
        layoutParams6.addRule(11, -1);
        layoutParams6.rightMargin = (int) UIUtils.dip2Px(this.mActivity, 12.0f);
        this.mClickBtn.setLayoutParams(layoutParams6);
        this.mBottomLayout.addView(this.mClickBtn);
        LinearLayout linearLayout = new LinearLayout(this.mActivity);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        if (this.mVideoAd == null || TextUtils.isEmpty(this.mVideoAd.getAvatarUrl()) || this.mImageLoadFactory == null) {
            layoutParams7.addRule(9, -1);
        } else {
            layoutParams7.addRule(1, C0906R.id.aas);
        }
        layoutParams7.addRule(0, C0906R.id.aat);
        layoutParams7.rightMargin = (int) UIUtils.dip2Px(this.mActivity, 12.0f);
        layoutParams7.leftMargin = (int) UIUtils.dip2Px(this.mActivity, 16.0f);
        layoutParams7.addRule(15, -1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams7);
        this.mTitleView = new TextView(this.mActivity);
        this.mTitleView.setTextSize(1, 16.0f);
        this.mTitleView.setTextColor(Color.parseColor("#222222"));
        this.mTitleView.setSingleLine();
        this.mTitleView.setEllipsize(TextUtils.TruncateAt.END);
        this.mTitleView.getPaint().setFakeBoldText(true);
        this.mTitleView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(this.mTitleView);
        this.mDescView = new TextView(this.mActivity);
        this.mDescView.setTextSize(1, 12.0f);
        this.mDescView.setTextColor(Color.parseColor("#505050"));
        this.mDescView.setMaxLines(2);
        this.mDescView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.topMargin = (int) UIUtils.dip2Px(this.mActivity, 0.0f);
        this.mDescView.setLayoutParams(layoutParams8);
        linearLayout.addView(this.mDescView);
        this.mBottomLayout.addView(linearLayout);
        this.mBottomLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!ExcitingVideoFragment.this.mVideoAd.getClickTrackUrl().isEmpty()) {
                    OkNetwork.inst().sendTrackUrl(ExcitingVideoFragment.this.mVideoAd.getClickTrackUrl(), false);
                }
                if (InnerVideoAd.inst().getOpenWebListener() == null || (TextUtils.isEmpty(ExcitingVideoFragment.this.mVideoAd.getOpenUrl()) && TextUtils.isEmpty(ExcitingVideoFragment.this.mVideoAd.getWebUrl()))) {
                    if (InnerVideoAd.inst().getDownload() != null && ExcitingVideoFragment.this.mVideoAd.isDownload()) {
                        InnerVideoAd.inst().getDownload().download(ExcitingVideoFragment.this.mActivity, ExcitingVideoFragment.this.mVideoAd.getDownloadUrl(), ExcitingVideoFragment.this.mVideoAd);
                    }
                    return;
                }
                InnerVideoAd.inst().getOpenWebListener().openWebUrl(ExcitingVideoFragment.this.mActivity, ExcitingVideoFragment.this.mVideoAd.getOpenUrl(), ExcitingVideoFragment.this.mVideoAd.getWebUrl(), ExcitingVideoFragment.this.mVideoAd);
                InnerVideoAd.inst().onAdEvent((Context) ExcitingVideoFragment.this.mActivity, "landing_ad", "click", ExcitingVideoFragment.this.mVideoAd.getId(), "card_other");
            }
        });
    }

    public void setFragmentCloseListener(IFragmentCloseListener iFragmentCloseListener) {
        this.mFragmentClose = iFragmentCloseListener;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mVideoAd = InnerVideoAd.inst().getVideoAd();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(this);
        this.mVideoListener = InnerVideoAd.inst().getVideoListener();
        bindData();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mActivity = getActivity();
        this.mImageLoadFactory = InnerVideoAd.inst().getImageFactory();
        this.mRootView = new RelativeLayout(this.mActivity);
        this.mRootView.setBackgroundColor(Color.parseColor("#000000"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.mRootView.setLayoutParams(layoutParams);
        this.mVideoView = new BaseVideoView(this.mActivity);
        this.mVideoController = new VideoController(this.mVideoView);
        this.mVideoController.setVideoStatusListener(this.mVideoStatusListener);
        this.mVideoController.setMute(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(13, -1);
        this.mRootView.addView(this.mVideoView, layoutParams2);
        initView();
        this.mBackgroundView = new View(this.mActivity);
        this.mBackgroundView.setBackgroundColor(Color.parseColor("#4d000000"));
        this.mBackgroundView.setVisibility(8);
        this.mRootView.addView(this.mBackgroundView, layoutParams);
        return this.mRootView;
    }
}
