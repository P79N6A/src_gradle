package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class ao extends DmtStatusView {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f46501c;

    /* renamed from: d  reason: collision with root package name */
    private List<View> f46502d = new ArrayList(3);

    /* renamed from: e  reason: collision with root package name */
    private List<a> f46503e = new ArrayList(3);

    /* renamed from: f  reason: collision with root package name */
    private int f46504f = -1;
    private int g = -1;
    private Integer h = null;

    public interface a {
        View a(View view);
    }

    public final boolean g() {
        if (this.f46504f == 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.f46504f == 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f46504f == -1) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.f46504f == 2) {
            return true;
        }
        return false;
    }

    public final DmtStatusView.a a() {
        if (PatchProxy.isSupport(new Object[0], this, f46501c, false, 42860, new Class[0], DmtStatusView.a.class)) {
            return (DmtStatusView.a) PatchProxy.accessDispatch(new Object[0], this, f46501c, false, 42860, new Class[0], DmtStatusView.a.class);
        } else if (!com.ss.android.ugc.aweme.g.a.a()) {
            return null;
        } else {
            throw new RuntimeException("Stub !");
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46501c, false, 42861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46501c, false, 42861, new Class[0], Void.TYPE);
        } else if (this.f46504f != -1) {
            View view = this.f46502d.get(this.f46504f);
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
            this.f46504f = -1;
        }
    }

    public ao(@NonNull Context context) {
        super(context);
    }

    public final void setBuilder(DmtStatusView.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f46501c, false, 42858, new Class[]{DmtStatusView.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f46501c, false, 42858, new Class[]{DmtStatusView.a.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.g.a.a()) {
            throw new RuntimeException("Stub !");
        }
    }

    public final void setStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42862, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42862, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f46504f != i) {
            if (this.f46504f >= 0) {
                View view = this.f46502d.get(this.f46504f);
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            if (i >= 0) {
                setVisibility(0);
                View b2 = b(i);
                if (b2 != null) {
                    b2.setVisibility(0);
                }
            } else {
                setVisibility(8);
            }
            this.f46504f = i;
        }
    }

    public final void setUseScreenHeight(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42863, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42863, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f46502d.get(0);
        if (view instanceof DmtLoadingLayout) {
            ((DmtLoadingLayout) view).setUseScreenHeight(i);
        }
        View view2 = this.f46502d.get(1);
        if (view2 instanceof DmtDefaultView) {
            ((DmtDefaultView) view2).setUseScreenHeight(i);
        }
        View view3 = this.f46502d.get(2);
        if (view3 instanceof DmtDefaultView) {
            ((DmtDefaultView) view3).setUseScreenHeight(i);
        }
        this.h = Integer.valueOf(i);
    }

    public final View b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42864, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42864, new Class[]{Integer.TYPE}, View.class);
        }
        View view = this.f46502d.get(i);
        if (view == null && this.f46503e.get(i) != null) {
            this.f46503e.set(i, null);
            view = this.f46503e.get(i).a(this);
            if (view != null) {
                this.f46502d.set(i, view);
                if (this.h != null) {
                    if (i == 0 && (view instanceof DmtLoadingLayout)) {
                        ((DmtLoadingLayout) view).setUseScreenHeight(this.h.intValue());
                    } else if (i == 1 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).setUseScreenHeight(this.h.intValue());
                    } else if (i == 2 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).setUseScreenHeight(this.h.intValue());
                    }
                }
                if (this.g > 0) {
                    if (i == 0 && (view instanceof DmtLoadingLayout)) {
                        ((DmtLoadingLayout) view).onColorModeChange(this.g);
                    } else if (i == 1 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).onColorModeChange(this.g);
                    } else if (i == 2 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).onColorModeChange(this.g);
                    }
                }
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                view.setVisibility(8);
                addView(view);
            }
        }
        return view;
    }

    public final void onColorModeChange(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42859, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42859, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42865, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46501c, false, 42865, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i >= 0 && this.g != i) {
            this.g = i;
            View view = this.f46502d.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).onColorModeChange(this.g);
            }
            View view2 = this.f46502d.get(1);
            if (view2 instanceof DmtDefaultView) {
                ((DmtDefaultView) view2).onColorModeChange(this.g);
            }
            View view3 = this.f46502d.get(2);
            if (view3 instanceof DmtDefaultView) {
                ((DmtDefaultView) view3).onColorModeChange(this.g);
            }
        }
    }

    public final void a(a aVar, a aVar2, a aVar3) {
        a aVar4 = aVar;
        a aVar5 = aVar2;
        a aVar6 = aVar3;
        if (PatchProxy.isSupport(new Object[]{aVar4, aVar5, aVar6}, this, f46501c, false, 42857, new Class[]{a.class, a.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar4, aVar5, aVar6}, this, f46501c, false, 42857, new Class[]{a.class, a.class, a.class}, Void.TYPE);
            return;
        }
        this.f46502d.add(0, null);
        this.f46502d.add(1, null);
        this.f46502d.add(2, null);
        this.f46503e.add(0, aVar4);
        this.f46503e.add(1, aVar5);
        this.f46503e.add(2, aVar6);
        if (this.g < 0) {
            this.g = b.a().f20312a;
        }
    }
}
