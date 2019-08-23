package com.bytedance.ies.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class LoadingStatusView extends FrameLayout {
    private final String TAG;
    private int mStatus;
    List<View> mStatusViews;

    public static class Builder {
        Context mContext;
        View mEmptyView;
        View mErrorView;
        View mLoadingView;

        private CircularProgressView createProgressView() {
            return (CircularProgressView) LayoutInflater.from(this.mContext).inflate(C0906R.layout.a_p, null);
        }

        public Builder setEmptyView(View view) {
            this.mEmptyView = view;
            return this;
        }

        public Builder setErrorView(View view) {
            this.mErrorView = view;
            return this;
        }

        public Builder setLoadingView(View view) {
            this.mLoadingView = view;
            return this;
        }

        public Builder(Context context) {
            if (context != null) {
                this.mContext = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        public Builder setLoadingText(int i) {
            return setLoadingView(createDefaultView(i));
        }

        public static Builder createDefaultBuilder(Context context) {
            return new Builder(context).setEmptyText(C0906R.string.b6y).setLoadingText(C0906R.string.b70).setErrorText(C0906R.string.b6z, null);
        }

        private View createDefaultView(int i) {
            TextView textView = (TextView) LayoutInflater.from(this.mContext).inflate(C0906R.layout.a_q, null);
            textView.setText(i);
            return textView;
        }

        public Builder setEmptyText(int i) {
            TextView textView = (TextView) LayoutInflater.from(this.mContext).inflate(C0906R.layout.aqm, null);
            textView.setText(i);
            return setEmptyView(textView);
        }

        public Builder setUseProgressBar(int i) {
            CircularProgressView createProgressView = createProgressView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.height = i;
            layoutParams.width = i;
            layoutParams.gravity = 17;
            createProgressView.setLayoutParams(layoutParams);
            return setLoadingView(createProgressView);
        }

        public Builder setErrorText(int i, View.OnClickListener onClickListener) {
            View createDefaultView = createDefaultView(i);
            createDefaultView.setOnClickListener(onClickListener);
            return setErrorView(createDefaultView);
        }
    }

    public void showEmpty() {
        setStatus(1);
    }

    public void showError() {
        setStatus(2);
    }

    public void showLoading() {
        setStatus(0);
    }

    public boolean isReset() {
        if (this.mStatus == -1) {
            return true;
        }
        return false;
    }

    public void reset() {
        if (this.mStatus != -1) {
            this.mStatusViews.get(this.mStatus).setVisibility(4);
            this.mStatus = -1;
        }
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    private void setStatus(int i) {
        if (this.mStatus != i) {
            if (this.mStatus >= 0) {
                this.mStatusViews.get(this.mStatus).setVisibility(4);
            }
            if (this.mStatusViews.get(i) != null) {
                this.mStatusViews.get(i).setVisibility(0);
                this.mStatus = i;
            }
        }
    }

    public void setBuilder(Builder builder) {
        if (builder == null) {
            builder = Builder.createDefaultBuilder(getContext());
        }
        this.mStatusViews.clear();
        this.mStatusViews.add(builder.mLoadingView);
        this.mStatusViews.add(builder.mEmptyView);
        this.mStatusViews.add(builder.mErrorView);
        removeAllViews();
        for (int i = 0; i < this.mStatusViews.size(); i++) {
            View view = this.mStatusViews.get(i);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                addView(view);
            }
        }
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = LoadingStatusView.class.getSimpleName();
        this.mStatusViews = new ArrayList(3);
        this.mStatus = -1;
        setBuilder(null);
    }
}
