package com.bytedance.ies.uikit.toast;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.ugc.aweme.C0906R;

public class CustomToast {
    private View mContentView;
    private Context mContext;
    private long mDuration = 2500;
    private int mGravity = 49;
    private AnimatorSet mHideAnimatorSet;
    private int mIcon;
    private ImageView mImageView;
    private boolean mIsShowing;
    private WindowManager.LayoutParams mLayoutParams;
    private int[] mMargin;
    private boolean mOnPause;
    private AnimatorSet mShowAnimatorSet;
    private String mText;
    private TextView mTextView;
    private ViewGroup mViewGroup;
    private WindowManager mWindowManager;

    public void onPause() {
        this.mOnPause = true;
    }

    public void onResume() {
        this.mOnPause = false;
    }

    public View getContentView() {
        return this.mContentView;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public String getToastMessage() {
        return this.mText;
    }

    public boolean isShowing() {
        if (this.mContentView == null || !this.mContentView.isShown()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isToastRelease() {
        if (this.mContext == null || this.mOnPause) {
            return true;
        }
        return false;
    }

    public void onDestroyed() {
        dismiss();
        this.mContentView.clearAnimation();
        this.mContext = null;
        CustomToastHandler.getInstance().remove(this);
    }

    public void dismiss() {
        if (this.mIsShowing) {
            if (!(this.mViewGroup == null || this.mViewGroup.getParent() == null)) {
                this.mWindowManager.removeView(this.mViewGroup);
                this.mViewGroup.removeView(this.mContentView);
            }
            this.mIsShowing = false;
        }
    }

    public AnimatorSet getHideAnimatorSet() {
        if (this.mHideAnimatorSet == null) {
            this.mHideAnimatorSet = new AnimatorSet();
            this.mHideAnimatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.mContentView, "translationY", new float[]{0.0f, (float) (-this.mContentView.getMeasuredHeight())})});
            this.mHideAnimatorSet.setDuration(320);
        }
        return this.mHideAnimatorSet;
    }

    public AnimatorSet getShowAnimatorSet() {
        if (this.mShowAnimatorSet == null) {
            this.mShowAnimatorSet = new AnimatorSet();
            this.mShowAnimatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.mContentView, "translationY", new float[]{(float) (-this.mContentView.getMeasuredHeight()), 0.0f})});
            this.mShowAnimatorSet.setDuration(320);
        }
        return this.mShowAnimatorSet;
    }

    /* access modifiers changed from: package-private */
    public void show() {
        if (!isToastRelease()) {
            if (!StringUtils.isEmpty(this.mText)) {
                this.mTextView.setText(this.mText);
            }
            this.mIsShowing = true;
            if (this.mContentView.getParent() == null) {
                this.mViewGroup.addView(this.mContentView);
            } else {
                ((ViewGroup) this.mContentView.getParent()).removeView(this.mContentView);
                this.mViewGroup.addView(this.mContentView);
            }
            if (this.mLayoutParams == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 262280, -2);
                layoutParams.flags = 262280;
                layoutParams.gravity = this.mGravity;
                if (layoutParams.gravity == 48) {
                    layoutParams.y = this.mMargin[0];
                }
                this.mLayoutParams = layoutParams;
            }
            this.mWindowManager = (WindowManager) this.mContext.getSystemService("window");
            if (this.mViewGroup.getParent() != null) {
                this.mWindowManager.removeView(this.mViewGroup);
            }
            try {
                this.mWindowManager.addView(this.mViewGroup, this.mLayoutParams);
            } catch (Exception unused) {
            }
        }
    }

    public CustomToast setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public CustomToast setGravity(int i) {
        this.mGravity = i;
        return this;
    }

    public CustomToast setMarginBottom(int i) {
        this.mMargin[1] = i;
        return this;
    }

    public CustomToast setMarginLeft(int i) {
        this.mMargin[3] = i;
        return this;
    }

    public CustomToast setMarginRight(int i) {
        this.mMargin[2] = i;
        return this;
    }

    public CustomToast setMarginTop(int i) {
        this.mMargin[0] = i;
        return this;
    }

    public void showToast(String str) {
        initView(str, -1);
        CustomToastHandler.getInstance().add(this);
    }

    public CustomToast(Context context) {
        init(context, null, -1);
    }

    private View inflateContentView(int i) {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (i == -1) {
            View inflate = from.inflate(C0906R.layout.hw, this.mViewGroup, false);
            this.mContentView = inflate;
            return inflate;
        }
        try {
            View inflate2 = from.inflate(i, this.mViewGroup, false);
            this.mContentView = inflate2;
            return inflate2;
        } catch (InflateException unused) {
            View inflate3 = from.inflate(C0906R.layout.hw, this.mViewGroup, false);
            this.mContentView = inflate3;
            return inflate3;
        }
    }

    public void setShowAndHideAnimatorSet(AnimatorSet animatorSet, AnimatorSet animatorSet2) {
        this.mShowAnimatorSet = animatorSet;
        this.mHideAnimatorSet = animatorSet2;
    }

    public CustomToast(Context context, int i) {
        init(context, null, i);
    }

    public void showToast(String str, int i) {
        initView(str, i);
        CustomToastHandler.getInstance().add(this);
    }

    public CustomToast(Context context, View view) {
        init(context, view, -1);
    }

    private void initView(String str, int i) {
        if (!isToastRelease()) {
            this.mText = str;
            if (i == -1) {
                this.mImageView.setVisibility(8);
            }
            this.mContentView.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        }
    }

    private void init(Context context, View view, int i) {
        this.mContext = context;
        this.mMargin = new int[4];
        if (!isToastRelease()) {
            this.mViewGroup = new FrameLayout(this.mContext);
            if (view != null) {
                this.mContentView = view;
            } else {
                this.mContentView = inflateContentView(i);
            }
            this.mTextView = (TextView) this.mContentView.findViewById(C0906R.id.text);
            this.mImageView = (ImageView) this.mContentView.findViewById(C0906R.id.aq8);
        }
    }

    public CustomToast setMargin(int i, int i2, int i3, int i4) {
        this.mMargin[0] = i;
        this.mMargin[1] = i2;
        this.mMargin[2] = i3;
        this.mMargin[3] = i4;
        return this;
    }
}
