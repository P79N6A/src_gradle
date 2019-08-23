package com.ss.android.ugc.aweme.common.adapter;

import android.graphics.drawable.Animatable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.setting.f;

public abstract class AnimatedViewHolder<T> extends RecyclerView.ViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f2976f;
    public T g;
    public AnimatedImageView h;
    protected boolean i;
    boolean j = true;

    public abstract void a();

    public final boolean d() {
        return this.i;
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f2976f, false, 33357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2976f, false, 33357, new Class[0], Void.TYPE);
            return;
        }
        this.h.b();
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2976f, false, 33358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2976f, false, 33358, new Class[0], Void.TYPE);
            return;
        }
        this.h.c();
    }

    public boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f2976f, false, 33356, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2976f, false, 33356, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a.a() && c.a()) {
            return false;
        } else {
            if ((!NetworkUtils.isNetworkAvailable(this.itemView.getContext()) || com.ss.android.ugc.aweme.framework.d.a.a(this.itemView.getContext())) && f.a(this.itemView.getContext())) {
                return true;
            }
            return false;
        }
    }

    public void h() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f2976f, false, 33359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2976f, false, 33359, new Class[0], Void.TYPE);
        } else if (this.h != null && this.h.getController() != null && this.h.getController().getAnimatable() != null) {
            Animatable animatable = this.h.getController().getAnimatable();
            if (animatable instanceof com.facebook.a.a.a) {
                ((com.facebook.a.a.a) animatable).dropCaches();
            }
        }
    }

    public final void c(boolean z) {
        this.j = z;
    }

    public AnimatedViewHolder(View view) {
        super(view);
    }

    public static boolean a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, null, f2976f, true, 33362, new Class[]{UrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, null, f2976f, true, 33362, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        } else {
            for (String isEmpty : urlModel.getUrlList()) {
                if (!TextUtils.isEmpty(isEmpty)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2976f, false, 33355, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2976f, false, 33355, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h.setUserVisibleHint(z);
    }

    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2976f, false, 33354, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2976f, false, 33354, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h.setAttached(z);
    }

    public void a(T t, int i2) {
        if (PatchProxy.isSupport(new Object[]{t, Integer.valueOf(i2)}, this, f2976f, false, 33353, new Class[]{Object.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t, Integer.valueOf(i2)}, this, f2976f, false, 33353, new Class[]{Object.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.setUserVisibleHint(false);
    }
}
