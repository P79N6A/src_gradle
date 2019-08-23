package com.bytedance.android.livesdk.s;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.sticker.c;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdkapi.host.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17156a;

    public static final class a implements h.b<c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17157a;

        @NonNull
        public final h.b.a<c> a(h.b.a<c> aVar) {
            h.b.a<c> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17157a, false, 12919, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new l()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17157a, false, 12919, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17156a, false, 12917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17156a, false, 12917, new Class[0], Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().c().a();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f17156a, false, 12918, new Class[0], Boolean.TYPE)) {
            return TTLiveSDKContext.getHostService().c().b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17156a, false, 12918, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(@NonNull AppCompatActivity appCompatActivity, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull q qVar) {
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, fragmentManager, str, frameLayout, qVar}, this, f17156a, false, 12916, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, FrameLayout.class, q.class}, Void.TYPE)) {
            Object[] objArr = {appCompatActivity, fragmentManager, str, frameLayout, qVar};
            PatchProxy.accessDispatch(objArr, this, f17156a, false, 12916, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, FrameLayout.class, q.class}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().c().a(appCompatActivity, fragmentManager, str, frameLayout, qVar);
    }
}
