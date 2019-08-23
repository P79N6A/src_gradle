package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CommentEditTextWrapper extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72838a;

    /* renamed from: b  reason: collision with root package name */
    View.OnClickListener f72839b;

    /* renamed from: c  reason: collision with root package name */
    private EditText f72840c;

    /* renamed from: d  reason: collision with root package name */
    private DmtTextView f72841d;

    public String getString() {
        if (!PatchProxy.isSupport(new Object[0], this, f72838a, false, 84150, new Class[0], String.class)) {
            return this.f72840c.getText().toString();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f72838a, false, 84150, new Class[0], String.class);
    }

    public void setPublishClickListener(View.OnClickListener onClickListener) {
        this.f72839b = onClickListener;
    }

    public CommentEditTextWrapper(@NonNull Context context) {
        this(context, null);
    }

    public void setCommentEnable(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72838a, false, 84153, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72838a, false, 84153, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f72841d != null) {
            DmtTextView dmtTextView = this.f72841d;
            if (!z) {
                i = 8;
            }
            dmtTextView.setVisibility(i);
        }
    }

    public CommentEditTextWrapper(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72838a, false, 84148, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72838a, false, 84148, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
    }

    public CommentEditTextWrapper(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72838a, false, 84149, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72838a, false, 84149, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (PatchProxy.isSupport(new Object[0], this, f72838a, false, 84151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72838a, false, 84151, new Class[0], Void.TYPE);
        } else if (this.f72840c == null) {
            this.f72840c = (EditText) getChildAt(0);
            if (this.f72840c != null) {
                this.f72840c.addTextChangedListener(new TextWatcher() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72842a;

                    public final void afterTextChanged(Editable editable) {
                    }

                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72842a, false, 84155, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72842a, false, 84155, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        CommentEditTextWrapper.this.setCommentEnable(!TextUtils.isEmpty(charSequence));
                    }
                });
                this.f72840c.setPadding(this.f72840c.getPaddingLeft(), this.f72840c.getPaddingTop(), (int) UIUtils.dip2Px(getContext(), 50.0f), this.f72840c.getPaddingBottom());
            } else {
                throw new IllegalArgumentException("must have an EditText!");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f72838a, false, 84152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72838a, false, 84152, new Class[0], Void.TYPE);
            return;
        }
        if (this.f72841d == null) {
            this.f72841d = new DmtTextView(getContext());
            this.f72841d.setText(getResources().getString(C0906R.string.cfr));
            this.f72841d.setTextSize(17.0f);
            this.f72841d.setTypeface(Typeface.defaultFromStyle(1));
            this.f72841d.setTextColor(-1);
            this.f72841d.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 85;
            layoutParams.rightMargin = (int) UIUtils.dip2Px(getContext(), 16.0f);
            layoutParams.bottomMargin = (int) UIUtils.dip2Px(getContext(), 9.0f);
            addView(this.f72841d, layoutParams);
            this.f72841d.setOnClickListener(new a(this));
        }
    }
}
