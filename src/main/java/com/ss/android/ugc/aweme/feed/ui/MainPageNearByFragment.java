package com.ss.android.ugc.aweme.feed.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.feed.ac;

public class MainPageNearByFragment extends FeedFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46228a;

    /* renamed from: b  reason: collision with root package name */
    Fragment f46229b;

    public final boolean d(boolean z) {
        return false;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f46228a, false, 42902, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46228a, false, 42902, new Class[0], Void.TYPE);
            return;
        }
        this.m = System.currentTimeMillis();
    }

    public final void L_() {
        if (PatchProxy.isSupport(new Object[0], this, f46228a, false, 42903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46228a, false, 42903, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.m;
            if (currentTimeMillis > 0) {
                if ("nearby".equals(this.n)) {
                    this.n = "homepage_fresh";
                }
                a.a(new as(this, currentTimeMillis));
            }
            this.m = -1;
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46228a, false, 42901, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46228a, false, 42901, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.f46229b != null) {
            this.f46229b.setUserVisibleHint(z);
            if (this.f46229b instanceof NearByFragment) {
                if (z) {
                    ((NearByFragment) this.f46229b).a(false);
                    return;
                }
                ((NearByFragment) this.f46229b).c(false);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f46228a, false, 42899, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f46228a, false, 42899, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.om, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f46228a, false, 42900, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f46228a, false, 42900, new Class[]{View.class}, Void.TYPE);
        } else {
            inflate.findViewById(C0906R.id.cv3).setLayoutParams(new LinearLayout.LayoutParams(-1, p.c()));
            this.n = "homepage_fresh";
            FragmentManager fragmentManager = getFragmentManager();
            this.f46229b = ac.a(7, "nearby");
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.replace(C0906R.id.ag2, this.f46229b);
            beginTransaction.commitAllowingStateLoss();
            setUserVisibleHint(true);
        }
        return inflate;
    }
}
