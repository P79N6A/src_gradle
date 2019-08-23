package com.ss.android.ugc.aweme.story.shootvideo.edit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.fc;

public class StoryEditLayout extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73430a;

    /* renamed from: b  reason: collision with root package name */
    boolean f73431b;

    /* renamed from: c  reason: collision with root package name */
    public DmtTextView f73432c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f73433d;

    /* renamed from: e  reason: collision with root package name */
    private View f73434e;

    /* renamed from: f  reason: collision with root package name */
    private Context f73435f;
    private View g;
    private boolean h;
    private a i;

    public interface a {
        void a(int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73430a, false, 85289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73430a, false, 85289, new Class[0], Void.TYPE);
        } else if (!this.h) {
            this.h = true;
            com.ss.android.ugc.aweme.story.shootvideo.a.a(this);
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f73430a, false, 85290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73430a, false, 85290, new Class[0], Void.TYPE);
        } else if (this.h) {
            this.h = false;
            com.ss.android.ugc.aweme.story.shootvideo.a.b(this);
        }
    }

    public void setEditMenuListener(a aVar) {
        this.i = aVar;
    }

    public StoryEditLayout(@NonNull Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73430a, false, 85291, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73430a, false, 85291, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            View view = this.g;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public void onClick(View view) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f73430a, false, 85293, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73430a, false, 85293, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.dkf) {
            i2 = 1;
        } else if (view.getId() == C0906R.id.dbr) {
            i2 = 4;
        } else if (view.getId() == C0906R.id.dju) {
            i2 = 2;
        } else if (view.getId() == C0906R.id.dg0) {
            i2 = 3;
        } else if (view.getId() == C0906R.id.iu) {
            i2 = 5;
        } else if (view.getId() == C0906R.id.df5) {
            this.f73433d = !this.f73433d;
            if (this.f73433d) {
                this.f73432c.setText("静音");
                Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838828);
                a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
                this.f73432c.setCompoundDrawables(null, a2, null, null);
            } else {
                this.f73432c.setText("声音");
                Drawable a3 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838829);
                a3.setBounds(0, 0, a3.getIntrinsicWidth(), a3.getIntrinsicHeight());
                this.f73432c.setCompoundDrawables(null, a3, null, null);
            }
            i2 = 6;
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            if (this.i != null && !this.f73431b) {
                this.i.a(i2);
            }
            this.f73431b = true;
            postDelayed(new s(this), 300);
        }
    }

    public StoryEditLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.h = true;
        this.f73435f = context;
        if (PatchProxy.isSupport(new Object[0], this, f73430a, false, 85288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73430a, false, 85288, new Class[0], Void.TYPE);
            return;
        }
        this.f73434e = LayoutInflater.from(this.f73435f).inflate(C0906R.layout.a_1, null);
        this.f73434e.findViewById(C0906R.id.dkf).setOnClickListener(this);
        this.f73434e.findViewById(C0906R.id.dg0).setOnClickListener(this);
        this.f73434e.findViewById(C0906R.id.dbr).setOnClickListener(this);
        this.f73434e.findViewById(C0906R.id.iu).setOnClickListener(this);
        this.f73432c = (DmtTextView) this.f73434e.findViewById(C0906R.id.df5);
        this.f73432c.setOnClickListener(this);
        this.g = this.f73434e.findViewById(C0906R.id.dju);
        this.g.setOnClickListener(this);
        addView(this.f73434e);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f73434e.getLayoutParams();
        if (fc.a()) {
            i2 = (int) UIUtils.dip2Px(getContext(), 40.0f);
        } else {
            i2 = fc.c(getContext());
        }
        layoutParams.topMargin = i2;
        this.f73434e.setLayoutParams(layoutParams);
    }
}
