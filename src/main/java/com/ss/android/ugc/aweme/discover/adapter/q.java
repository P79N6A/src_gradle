package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout;
import com.ss.android.ugc.bytex.a.a.a;

public final class q extends AbstractLoadingLayout {
    public static ChangeQuickRedirect g;
    private int h;

    public q(@NonNull Context context) {
        this(context, null);
    }

    private q(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, g, false, 35686, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, g, false, 35686, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) UIUtils.dip2Px(getContext(), (float) this.h), 1073741824));
    }

    public final void a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, g, false, 35691, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, g, false, 35691, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i, i2);
        if (this.f40313b != null) {
            View view = this.f40313b;
            if (i2 == 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        View view2 = this.f40314c;
        int i6 = 8;
        if (i2 == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.f40316e;
        if (i2 == 2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.f40315d;
        if (i2 == 3) {
            i6 = 0;
        }
        view4.setVisibility(i6);
        if (i2 == 0) {
            this.h = 0;
        } else {
            this.h = 45;
        }
        requestLayout();
    }

    private q(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.h = 45;
        a(0, 0);
    }

    public final void addView(View view, int i, int i2) {
        View view2 = view;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, g, false, 35687, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, g, false, 35687, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.addView(view, i, i2);
        if (this.f40313b == view2) {
            View view3 = this.f40313b;
            if (this.f40317f != 0) {
                i3 = 4;
            }
            view3.setVisibility(i3);
        }
    }

    public final View a(Context context, AttributeSet attributeSet, int i) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2, Integer.valueOf(i)}, this, g, false, 35688, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, attributeSet2, Integer.valueOf(i)}, this, g, false, 35688, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, attributeSet2, i2);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setTextColor(ContextCompat.getColor(context2, C0906R.color.zx));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(C0906R.string.b70);
        ProgressBar progressBar = new ProgressBar(context2, attributeSet2, i2);
        progressBar.setId(C0906R.id.bjf);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateDrawable(a.a(context.getResources(), 2130840241));
        int dip2Px = (int) UIUtils.dip2Px(context2, 15.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dip2Px, dip2Px);
        layoutParams.setMargins(0, 0, (int) UIUtils.dip2Px(context2, 5.0f), 0);
        progressBar.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        linearLayout.setGravity(16);
        linearLayout.addView(progressBar);
        linearLayout.addView(appCompatTextView);
        return linearLayout;
    }

    public final View b(Context context, AttributeSet attributeSet, int i) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2, Integer.valueOf(i)}, this, g, false, 35689, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, attributeSet2, Integer.valueOf(i)}, this, g, false, 35689, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, attributeSet2, i);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(ContextCompat.getColor(context2, C0906R.color.a0g));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(C0906R.string.b6y);
        appCompatTextView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41965a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41965a, false, 35692, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41965a, false, 35692, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                q qVar = q.this;
                if (PatchProxy.isSupport(new Object[0], qVar, AbstractLoadingLayout.f40312a, false, 33561, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], qVar, AbstractLoadingLayout.f40312a, false, 33561, new Class[0], Void.TYPE);
                }
            }
        });
        return appCompatTextView;
    }

    public final View c(Context context, AttributeSet attributeSet, int i) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2, Integer.valueOf(i)}, this, g, false, 35690, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, attributeSet2, Integer.valueOf(i)}, this, g, false, 35690, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, View.class);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, attributeSet2, i);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(ContextCompat.getColor(context2, C0906R.color.a0g));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(C0906R.string.b6z);
        appCompatTextView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41967a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41967a, false, 35693, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41967a, false, 35693, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                q qVar = q.this;
                if (PatchProxy.isSupport(new Object[0], qVar, AbstractLoadingLayout.f40312a, false, 33560, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], qVar, AbstractLoadingLayout.f40312a, false, 33560, new Class[0], Void.TYPE);
                }
            }
        });
        return appCompatTextView;
    }
}
