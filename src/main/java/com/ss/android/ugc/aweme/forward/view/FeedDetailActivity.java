package com.ss.android.ugc.aweme.forward.view;

import android.os.Bundle;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.utils.dq;

public class FeedDetailActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48439a;

    /* renamed from: b  reason: collision with root package name */
    public String f48440b;

    /* renamed from: c  reason: collision with root package name */
    public String f48441c;

    /* renamed from: d  reason: collision with root package name */
    public String f48442d;

    public final int a() {
        return C0906R.layout.bd;
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f48439a, true, 45782, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f48439a, true, 45782, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a.b().a() instanceof FeedDetailActivity;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f48439a, false, 45781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48439a, false, 45781, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f48439a, false, 45779, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48439a, false, 45779, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!e.a().b()) {
            com.ss.android.ugc.aweme.newfollow.g.a.b(this.f48440b, "detail");
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f48439a, false, 45780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48439a, false, 45780, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!dq.a()) {
            com.ss.android.ugc.aweme.newfollow.g.a.b();
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f48439a, false, 45778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48439a, false, 45778, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f48439a, false, 45777, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f48439a, false, 45777, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }
}
