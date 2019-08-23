package com.bytedance.ies.dmt.ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.C0906R;

public class TextTitleBar extends a implements View.OnClickListener {
    private ImageView mBackBtn;
    private DmtTextView mEndText;
    private View mLine;
    @ColorInt
    private int mLineColor;
    private a mOnTitleBarClickListener;
    private DmtTextView mStartText;
    private boolean mUseBackIcon;

    public ImageView getBackBtn() {
        return this.mBackBtn;
    }

    public DmtTextView getEndText() {
        return this.mEndText;
    }

    public DmtTextView getStartText() {
        return this.mStartText;
    }

    public boolean isUseBackIcon() {
        return this.mUseBackIcon;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mTitleView.setMaxWidth((int) Math.max((float) (((UIUtils.getScreenWidth(getContext()) / 2) - Math.max(this.mStartText.getMeasuredWidth(), this.mEndText.getMeasuredWidth())) * 2), UIUtils.dip2Px(getContext(), 112.0f)));
    }

    public void setOnTitleBarClickListener(a aVar) {
        this.mOnTitleBarClickListener = aVar;
    }

    public TextTitleBar(@NonNull Context context) {
        this(context, null);
    }

    public void setDividerLineBackground(@ColorInt int i) {
        this.mLine.setBackgroundColor(i);
    }

    public void setEndText(@StringRes int i) {
        this.mEndText.setText(i);
    }

    public void setEndTextColor(@ColorInt int i) {
        this.mEndText.setTextColor(i);
    }

    public void setEndTextSize(float f2) {
        this.mEndText.setTextSize(f2);
    }

    public void setLineBackground(@ColorInt int i) {
        this.mLine.setBackgroundColor(i);
    }

    public void setStartText(@StringRes int i) {
        this.mStartText.setText(i);
    }

    public void setStartTextColor(@ColorInt int i) {
        this.mStartText.setTextColor(i);
    }

    public void setStartTextSize(float f2) {
        this.mStartText.setTextSize(f2);
    }

    public void setEndText(CharSequence charSequence) {
        this.mEndText.setText(charSequence);
    }

    public void setStartText(CharSequence charSequence) {
        this.mStartText.setText(charSequence);
    }

    public void showDividerLine(boolean z) {
        int i;
        View view = this.mLine;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void showLine(boolean z) {
        int i;
        View view = this.mLine;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void onColorModeChange(int i) {
        int i2;
        ImageView imageView = this.mBackBtn;
        if (b.a(i)) {
            i2 = 2130841646;
        } else {
            i2 = 2130841647;
        }
        imageView.setImageResource(i2);
    }

    public void onClick(View view) {
        if (this.mOnTitleBarClickListener != null) {
            if (view.getId() == C0906R.id.ix || view.getId() == C0906R.id.d0z) {
                this.mOnTitleBarClickListener.a(view);
            } else if (view.getId() == C0906R.id.d1m) {
                this.mOnTitleBarClickListener.b(view);
            }
        }
    }

    public void setUseBackIcon(boolean z) {
        int i;
        if (this.mUseBackIcon != z) {
            this.mUseBackIcon = z;
            ImageView imageView = this.mBackBtn;
            int i2 = 8;
            if (this.mUseBackIcon) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            DmtTextView dmtTextView = this.mStartText;
            if (!this.mUseBackIcon) {
                i2 = 0;
            }
            dmtTextView.setVisibility(i2);
        }
    }

    private void init(Context context) {
        inflate(context, C0906R.layout.as4, this);
        this.mStartText = (DmtTextView) findViewById(C0906R.id.d0z);
        this.mTitleView = (DmtTextView) findViewById(C0906R.id.title);
        this.mEndText = (DmtTextView) findViewById(C0906R.id.d1m);
        this.mBackBtn = (ImageView) findViewById(C0906R.id.ix);
        this.mLine = findViewById(C0906R.id.bbl);
        this.mBackBtn.setOnClickListener(this);
        this.mStartText.setOnClickListener(this);
        this.mEndText.setOnClickListener(this);
        com.bytedance.ies.dmt.ui.widget.b bVar = new com.bytedance.ies.dmt.ui.widget.b(0.5f, 1.0f);
        this.mBackBtn.setOnTouchListener(bVar);
        this.mStartText.setOnTouchListener(bVar);
        this.mEndText.setOnTouchListener(bVar);
    }

    private void setViewVisible(DmtTextView dmtTextView, int i) {
        dmtTextView.setVisibility(i);
    }

    public TextTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void initAttrs(Context context, @NonNull AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextTitleBar);
        String string = obtainStyledAttributes.getString(10);
        float dimension = obtainStyledAttributes.getDimension(12, UIUtils.dip2Px(context, 17.0f));
        int color = obtainStyledAttributes.getColor(11, -15329245);
        this.mTitleView.setText(string);
        this.mTitleView.setTextSize(0, dimension);
        this.mTitleView.setTextColor(color);
        this.mUseBackIcon = obtainStyledAttributes.getBoolean(13, false);
        if (this.mUseBackIcon) {
            this.mBackBtn.setVisibility(0);
            this.mStartText.setVisibility(8);
        } else {
            String string2 = obtainStyledAttributes.getString(7);
            float dimension2 = obtainStyledAttributes.getDimension(9, UIUtils.dip2Px(context, 15.0f));
            int color2 = obtainStyledAttributes.getColor(8, -15329245);
            this.mBackBtn.setVisibility(8);
            this.mStartText.setVisibility(0);
            this.mStartText.setText(string2);
            this.mStartText.setTextSize(0, dimension2);
            this.mStartText.setTextColor(color2);
        }
        String string3 = obtainStyledAttributes.getString(1);
        float dimension3 = obtainStyledAttributes.getDimension(3, UIUtils.dip2Px(context, 15.0f));
        int color3 = obtainStyledAttributes.getColor(2, -15329245);
        int i2 = obtainStyledAttributes.getInt(4, 0);
        this.mEndText.setText(string3);
        this.mEndText.setTextSize(0, dimension3);
        this.mEndText.setTextColor(color3);
        setViewVisible(this.mEndText, i2);
        if (obtainStyledAttributes.getInt(0, 1) == 1) {
            this.mEndText.setTypeface(Typeface.defaultFromStyle(1));
            this.mEndText.setTextColor(getResources().getColor(C0906R.color.ak0));
        } else {
            this.mEndText.setTypeface(Typeface.defaultFromStyle(0));
            this.mEndText.setTextColor(getResources().getColor(C0906R.color.amq));
        }
        this.mLine.setVisibility(obtainStyledAttributes.getInt(6, 0));
        Resources resources = getResources();
        if (b.c()) {
            i = C0906R.color.ama;
        } else {
            i = C0906R.color.am_;
        }
        this.mLineColor = obtainStyledAttributes.getColor(5, resources.getColor(i));
        this.mLine.setBackgroundColor(this.mLineColor);
        obtainStyledAttributes.recycle();
    }

    public TextTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
        if (attributeSet != null) {
            initAttrs(context, attributeSet);
        }
        setColorMode(b.a().f20312a);
    }
}
