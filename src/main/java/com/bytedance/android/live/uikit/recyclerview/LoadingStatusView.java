package com.bytedance.android.live.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class LoadingStatusView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8583a;

    /* renamed from: b  reason: collision with root package name */
    List<View> f8584b;

    /* renamed from: c  reason: collision with root package name */
    int f8585c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8586d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8587a;

        /* renamed from: b  reason: collision with root package name */
        Context f8588b;

        /* renamed from: c  reason: collision with root package name */
        View f8589c;

        /* renamed from: d  reason: collision with root package name */
        View f8590d;

        /* renamed from: e  reason: collision with root package name */
        View f8591e;

        private CircularProgressView a() {
            if (!PatchProxy.isSupport(new Object[0], this, f8587a, false, 2140, new Class[0], CircularProgressView.class)) {
                return (CircularProgressView) LayoutInflater.from(this.f8588b).inflate(C0906R.layout.a_n, null);
            }
            return (CircularProgressView) PatchProxy.accessDispatch(new Object[0], this, f8587a, false, 2140, new Class[0], CircularProgressView.class);
        }

        public final a a(View view) {
            this.f8589c = view;
            return this;
        }

        public final a b(View view) {
            this.f8590d = view;
            return this;
        }

        public final a c(View view) {
            this.f8591e = view;
            return this;
        }

        public a(Context context) {
            if (context != null) {
                this.f8588b = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        public static a a(Context context) {
            Context context2 = context;
            if (!PatchProxy.isSupport(new Object[]{context2}, null, f8587a, true, 2141, new Class[]{Context.class}, a.class)) {
                return new a(context2).b((int) C0906R.string.b6y).c((int) C0906R.string.b70).a(C0906R.string.b6z, null);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f8587a, true, 2141, new Class[]{Context.class}, a.class);
        }

        private a c(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.b70)}, this, f8587a, false, 2135, new Class[]{Integer.TYPE}, a.class)) {
                return a(d(C0906R.string.b70));
            }
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.b70)}, this, f8587a, false, 2135, new Class[]{Integer.TYPE}, a.class);
        }

        private View d(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8587a, false, 2139, new Class[]{Integer.TYPE}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8587a, false, 2139, new Class[]{Integer.TYPE}, View.class);
            }
            TextView textView = (TextView) LayoutInflater.from(this.f8588b).inflate(C0906R.layout.a_e, null);
            textView.setText(i);
            return textView;
        }

        public final a b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8587a, false, 2137, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8587a, false, 2137, new Class[]{Integer.TYPE}, a.class);
            }
            TextView textView = (TextView) LayoutInflater.from(this.f8588b).inflate(C0906R.layout.a_o, null);
            textView.setText(i);
            return b((View) textView);
        }

        public final a a(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8587a, false, 2136, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8587a, false, 2136, new Class[]{Integer.TYPE}, a.class);
            }
            CircularProgressView a2 = a();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.height = i2;
            layoutParams.width = i2;
            layoutParams.gravity = 17;
            a2.setLayoutParams(layoutParams);
            return a((View) a2);
        }

        public final a a(int i, View.OnClickListener onClickListener) {
            View.OnClickListener onClickListener2 = onClickListener;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), onClickListener2}, this, f8587a, false, 2138, new Class[]{Integer.TYPE, View.OnClickListener.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), onClickListener2}, this, f8587a, false, 2138, new Class[]{Integer.TYPE, View.OnClickListener.class}, a.class);
            }
            View d2 = d(i);
            d2.setOnClickListener(onClickListener2);
            return c(d2);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8583a, false, 2130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8583a, false, 2130, new Class[0], Void.TYPE);
        } else if (this.f8585c != -1) {
            this.f8584b.get(this.f8585c).setVisibility(4);
            this.f8585c = -1;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f8583a, false, 2131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8583a, false, 2131, new Class[0], Void.TYPE);
            return;
        }
        setStatus(0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f8583a, false, 2132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8583a, false, 2132, new Class[0], Void.TYPE);
            return;
        }
        setStatus(1);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f8583a, false, 2133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8583a, false, 2133, new Class[0], Void.TYPE);
            return;
        }
        setStatus(2);
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    private void setStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8583a, false, 2134, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8583a, false, 2134, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f8585c != i) {
            if (this.f8585c >= 0) {
                this.f8584b.get(this.f8585c).setVisibility(4);
            }
            if (this.f8584b.get(i) != null) {
                this.f8584b.get(i).setVisibility(0);
                this.f8585c = i;
            }
        }
    }

    public void setBuilder(a aVar) {
        a aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f8583a, false, 2129, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f8583a, false, 2129, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar == null) {
            aVar2 = a.a(getContext());
        } else {
            aVar2 = aVar;
        }
        this.f8584b.clear();
        this.f8584b.add(aVar2.f8589c);
        this.f8584b.add(aVar2.f8590d);
        this.f8584b.add(aVar2.f8591e);
        removeAllViews();
        for (int i = 0; i < this.f8584b.size(); i++) {
            View view = this.f8584b.get(i);
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
        this.f8586d = LoadingStatusView.class.getSimpleName();
        this.f8584b = new ArrayList(3);
        this.f8585c = -1;
        setBuilder(null);
    }
}
