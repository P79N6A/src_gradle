package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.e;
import com.bytedance.ies.dmt.ui.widget.c;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class DmtStatusView extends FrameLayout implements e, f {

    /* renamed from: a  reason: collision with root package name */
    List<View> f20469a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20470b;

    /* renamed from: c  reason: collision with root package name */
    private int f20471c;

    /* renamed from: d  reason: collision with root package name */
    private int f20472d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f20473a;

        /* renamed from: b  reason: collision with root package name */
        View f20474b;

        /* renamed from: c  reason: collision with root package name */
        public View f20475c;

        /* renamed from: d  reason: collision with root package name */
        public View f20476d;

        /* renamed from: e  reason: collision with root package name */
        View f20477e;

        /* renamed from: f  reason: collision with root package name */
        View f20478f;
        int g = -1;

        public final a a(c cVar) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f20473a);
            dmtDefaultView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            dmtDefaultView.setStatus(cVar);
            this.f20475c = dmtDefaultView;
            return this;
        }

        public final a a() {
            DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(this.f20473a);
            dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            a((View) dmtLoadingLayout);
            return this;
        }

        public final a c(int i) {
            this.g = i;
            return this;
        }

        public static a a(Context context) {
            return new a(context).a();
        }

        public final a b(View view) {
            this.f20475c = view;
            this.f20475c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public final a c(View view) {
            this.f20476d = view;
            this.f20476d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public a(Context context) {
            if (context != null) {
                this.f20473a = context;
                return;
            }
            throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
        }

        public final a b(int i) {
            return b(new c.a(this.f20473a).c(i).f20493a);
        }

        public final a a(int i) {
            return a(new c.a(this.f20473a).c(i).f20493a);
        }

        public final a b(c cVar) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f20473a);
            dmtDefaultView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            dmtDefaultView.setStatus(cVar);
            this.f20476d = dmtDefaultView;
            return this;
        }

        public final a a(View view) {
            this.f20474b = view;
            this.f20474b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public final a a(int i, int i2) {
            return a(new c.a(this.f20473a).b(i).c(i2).f20493a);
        }

        public final a a(int i, View.OnClickListener onClickListener) {
            b(i);
            this.f20476d.setOnClickListener(onClickListener);
            return this;
        }

        public final a a(int i, int i2, int i3, @NonNull View.OnClickListener onClickListener) {
            return b(new c.a(this.f20473a).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(a.BORDER, C0906R.string.dms, onClickListener).f20493a);
        }

        public final a a(int i, int i2, int i3, int i4, View.OnClickListener onClickListener) {
            return b(new c.a(this.f20473a).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(a.BORDER, C0906R.string.dms, onClickListener).f20493a);
        }
    }

    public final void k() {
        this.f20470b = true;
    }

    public final void d() {
        setVisibility(0);
        setStatus(0);
    }

    public boolean g() {
        if (this.f20471c == 0) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f20471c == 1) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.f20471c == -1) {
            return true;
        }
        return false;
    }

    public final void e() {
        setVisibility(0);
        setStatus(1);
    }

    public final void f() {
        setVisibility(0);
        setStatus(2);
    }

    public boolean i() {
        if (this.f20471c == 2) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.f20471c == 3) {
            return true;
        }
        return false;
    }

    public void b() {
        if (this.f20471c != -1) {
            View view = this.f20469a.get(this.f20471c);
            if (view != null) {
                view.setVisibility(4);
            }
            setVisibility(4);
            this.f20471c = -1;
        }
    }

    public a a() {
        a aVar = new a(getContext());
        aVar.f20474b = this.f20469a.get(0);
        aVar.f20475c = this.f20469a.get(1);
        aVar.f20476d = this.f20469a.get(2);
        aVar.f20477e = this.f20469a.get(3);
        aVar.f20478f = this.f20469a.get(4);
        return aVar;
    }

    public void onColorModeChange(int i) {
        b(i);
    }

    public DmtStatusView(@NonNull Context context) {
        this(context, null);
    }

    public final void b(boolean z) {
        this.f20470b = z;
        b();
    }

    public final View a(int i) {
        if (i < 0 || i >= this.f20469a.size()) {
            return null;
        }
        return this.f20469a.get(i);
    }

    public final void a(boolean z) {
        if (z) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bgf).a();
        }
        if (this.f20470b) {
            b();
        } else {
            f();
        }
    }

    public final boolean c(boolean z) {
        if (!NetworkUtils.isNetworkAvailable(getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bgf).a();
            if (!this.f20470b) {
                f();
            }
            return false;
        }
        if (!this.f20470b) {
            d();
        }
        return true;
    }

    public void setStatus(int i) {
        if (this.f20471c != i) {
            if (this.f20471c >= 0) {
                View view = this.f20469a.get(this.f20471c);
                if (view != null) {
                    view.setVisibility(4);
                }
            }
            if (i >= 0) {
                setVisibility(0);
                View view2 = this.f20469a.get(i);
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            } else {
                setVisibility(4);
            }
            this.f20471c = i;
        }
    }

    private void b(int i) {
        if (i >= 0 && this.f20472d != i) {
            this.f20472d = i;
            View view = this.f20469a.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).onColorModeChange(this.f20472d);
            }
            View view2 = this.f20469a.get(1);
            if (view2 instanceof e) {
                ((e) view2).onColorModeChange(this.f20472d);
            }
            View view3 = this.f20469a.get(2);
            if (view3 instanceof DmtDefaultView) {
                ((DmtDefaultView) view3).onColorModeChange(this.f20472d);
            }
            View view4 = this.f20469a.get(3);
            if (view4 instanceof DmtDefaultView) {
                ((DmtDefaultView) view4).onColorModeChange(this.f20472d);
            }
            View view5 = this.f20469a.get(4);
            if (view5 instanceof DmtDefaultView) {
                ((DmtDefaultView) view5).onColorModeChange(this.f20472d);
            }
        }
    }

    public void setBuilder(a aVar) {
        if (aVar == null) {
            aVar = a.a(getContext());
        }
        this.f20469a.clear();
        this.f20469a.add(aVar.f20474b);
        this.f20469a.add(aVar.f20475c);
        this.f20469a.add(aVar.f20476d);
        this.f20469a.add(aVar.f20477e);
        this.f20469a.add(aVar.f20478f);
        if (aVar.g < 0) {
            aVar.g = b.a().f20312a;
        }
        b(aVar.g);
        removeAllViews();
        for (int i = 0; i < this.f20469a.size(); i++) {
            View view = this.f20469a.get(i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    public void setUseScreenHeight(int i) {
        View view = this.f20469a.get(0);
        if (view instanceof f) {
            ((f) view).setUseScreenHeight(i);
        }
        View view2 = this.f20469a.get(1);
        if (view2 instanceof f) {
            ((f) view2).setUseScreenHeight(i);
        }
        View view3 = this.f20469a.get(2);
        if (view3 instanceof f) {
            ((f) view3).setUseScreenHeight(i);
        }
        View view4 = this.f20469a.get(3);
        if (view4 instanceof f) {
            ((f) view4).setUseScreenHeight(i);
        }
        View view5 = this.f20469a.get(4);
        if (view5 instanceof f) {
            ((f) view5).setUseScreenHeight(i);
        }
    }

    public DmtStatusView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtStatusView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20469a = new ArrayList(5);
        this.f20471c = -1;
        this.f20472d = -1;
        this.f20470b = false;
    }
}
