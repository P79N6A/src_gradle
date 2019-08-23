package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40520a;

    /* renamed from: b  reason: collision with root package name */
    List<View> f40521b;

    /* renamed from: c  reason: collision with root package name */
    private int f40522c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40523a;

        /* renamed from: b  reason: collision with root package name */
        Context f40524b;

        /* renamed from: c  reason: collision with root package name */
        View f40525c;

        /* renamed from: d  reason: collision with root package name */
        View f40526d;

        /* renamed from: e  reason: collision with root package name */
        View f40527e;

        /* renamed from: f  reason: collision with root package name */
        int f40528f;

        public a(Context context) {
            if (context != null) {
                this.f40524b = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        /* access modifiers changed from: package-private */
        public TextView a(@StringRes int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40523a, false, 33653, new Class[]{Integer.TYPE}, TextView.class)) {
                return (TextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40523a, false, 33653, new Class[]{Integer.TYPE}, TextView.class);
            }
            TextView textView = (TextView) LayoutInflater.from(this.f40524b).inflate(C0906R.layout.a_q, null);
            textView.setText(i);
            if (this.f40528f != 0) {
                textView.setTextColor(this.f40528f);
            }
            return textView;
        }

        public final a a(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40523a, false, 33641, new Class[]{View.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{view}, this, f40523a, false, 33641, new Class[]{View.class}, a.class);
            }
            this.f40525c = view;
            this.f40525c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }
    }

    public final void setStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40520a, false, 33640, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40520a, false, 33640, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f40522c != i) {
            if (this.f40522c >= 0) {
                this.f40521b.get(this.f40522c).setVisibility(4);
            }
            if (i >= 0) {
                View view = this.f40521b.get(i);
                if (view != null) {
                    view.setVisibility(0);
                }
            }
            this.f40522c = i;
        }
    }

    public final void setBuilder(a aVar) {
        a aVar2;
        LoadLayout loadLayout;
        TextView textView;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f40520a, false, 33634, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f40520a, false, 33634, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar == null) {
            Context context = getContext();
            if (PatchProxy.isSupport(new Object[]{context}, null, a.f40523a, true, 33654, new Class[]{Context.class}, a.class)) {
                aVar2 = (a) PatchProxy.accessDispatch(new Object[]{context}, null, a.f40523a, true, 33654, new Class[]{Context.class}, a.class);
            } else {
                a aVar3 = new a(context);
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.b6y)}, aVar3, a.f40523a, false, 33646, new Class[]{Integer.TYPE}, a.class)) {
                    a aVar4 = aVar3;
                    aVar3 = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.b6y)}, aVar4, a.f40523a, false, 33646, new Class[]{Integer.TYPE}, a.class);
                } else if (aVar3.f40526d == null || !(aVar3.f40526d instanceof TextView)) {
                    if (PatchProxy.isSupport(new Object[0], aVar3, a.f40523a, false, 33652, new Class[0], TextView.class)) {
                        textView = (TextView) PatchProxy.accessDispatch(new Object[0], aVar3, a.f40523a, false, 33652, new Class[0], TextView.class);
                    } else {
                        textView = (TextView) LayoutInflater.from(aVar3.f40524b).inflate(C0906R.layout.aqm, null);
                        textView.setGravity(1);
                        textView.setPadding(0, (int) UIUtils.dip2Px(aVar3.f40524b, 100.0f), 0, 0);
                        if (aVar3.f40528f != 0) {
                            textView.setTextColor(aVar3.f40528f);
                        }
                    }
                    textView.setText(C0906R.string.b6y);
                    if (PatchProxy.isSupport(new Object[]{textView}, aVar3, a.f40523a, false, 33645, new Class[]{View.class}, a.class)) {
                        a aVar5 = aVar3;
                        aVar3 = (a) PatchProxy.accessDispatch(new Object[]{textView}, aVar5, a.f40523a, false, 33645, new Class[]{View.class}, a.class);
                    } else {
                        aVar3.f40526d = textView;
                        aVar3.f40526d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    }
                } else {
                    ((TextView) aVar3.f40526d).setText(C0906R.string.b6y);
                }
                int dip2Px = (int) UIUtils.dip2Px(context, 15.0f);
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(dip2Px), (byte) 1}, aVar3, a.f40523a, false, 33644, new Class[]{Integer.TYPE, Boolean.TYPE}, a.class)) {
                    a aVar6 = aVar3;
                    aVar2 = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(dip2Px), (byte) 1}, aVar6, a.f40523a, false, 33644, new Class[]{Integer.TYPE, Boolean.TYPE}, a.class);
                } else {
                    if (aVar3.f40525c == null || !(aVar3.f40525c instanceof LoadLayout)) {
                        loadLayout = (LoadLayout) LayoutInflater.from(aVar3.f40524b).inflate(C0906R.layout.a_r, null);
                    } else {
                        loadLayout = (LoadLayout) aVar3.f40525c;
                    }
                    TextView textView2 = (TextView) loadLayout.findViewById(C0906R.id.bji);
                    if (aVar3.f40528f != 0) {
                        textView2.setTextColor(aVar3.f40528f);
                    }
                    if (dip2Px >= 0) {
                        loadLayout.setLoadingViewSize(dip2Px);
                    }
                    textView2.setTextSize(13.0f);
                    aVar2 = aVar3.a((View) loadLayout);
                }
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.b70)}, aVar2, a.f40523a, false, 33642, new Class[]{Integer.TYPE}, a.class)) {
                    a aVar7 = aVar2;
                    aVar2 = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.b70)}, aVar7, a.f40523a, false, 33642, new Class[]{Integer.TYPE}, a.class);
                } else if (aVar2.f40525c instanceof LoadLayout) {
                    ((LoadLayout) aVar2.f40525c).setLoadingText((int) C0906R.string.b70);
                } else if (aVar2.f40525c instanceof TextView) {
                    ((TextView) aVar2.f40525c).setText(C0906R.string.b70);
                } else {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.b70), -1}, aVar2, a.f40523a, false, 33643, new Class[]{Integer.TYPE, Integer.TYPE}, a.class)) {
                        a aVar8 = aVar2;
                        a aVar9 = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.b70), -1}, aVar8, a.f40523a, false, 33643, new Class[]{Integer.TYPE, Integer.TYPE}, a.class);
                    } else {
                        aVar2.a((View) aVar2.a((int) C0906R.string.b70));
                    }
                }
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.b6z), null}, aVar2, a.f40523a, false, 33651, new Class[]{Integer.TYPE, View.OnClickListener.class}, a.class)) {
                    a aVar10 = aVar2;
                    aVar2 = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.b6z), null}, aVar10, a.f40523a, false, 33651, new Class[]{Integer.TYPE, View.OnClickListener.class}, a.class);
                } else if (aVar2.f40527e == null || !(aVar2.f40527e instanceof TextView)) {
                    TextView a2 = aVar2.a((int) C0906R.string.b6z);
                    a2.setOnClickListener(null);
                    aVar2.f40527e = a2;
                } else {
                    TextView textView3 = (TextView) aVar2.f40527e;
                    textView3.setText(C0906R.string.b6z);
                    textView3.setOnClickListener(null);
                }
            }
        } else {
            aVar2 = aVar;
        }
        this.f40521b.clear();
        this.f40521b.add(aVar2.f40525c);
        this.f40521b.add(aVar2.f40526d);
        this.f40521b.add(aVar2.f40527e);
        removeAllViews();
        for (int i = 0; i < this.f40521b.size(); i++) {
            View view = this.f40521b.get(i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }
}
