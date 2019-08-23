package com.bytedance.android.livesdk.gift.effect.video.a;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.bytedance.android.livesdkapi.depend.d.a.a;
import com.bytedance.android.livesdkapi.depend.d.a.b;
import com.bytedance.android.livesdkapi.host.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14992a;

    /* renamed from: b  reason: collision with root package name */
    public static c f14993b;

    /* renamed from: e  reason: collision with root package name */
    private static SparseArray<a> f14994e = new SparseArray<>(2);

    /* renamed from: f  reason: collision with root package name */
    private static int f14995f;

    /* renamed from: c  reason: collision with root package name */
    private final i f14996c;

    /* renamed from: d  reason: collision with root package name */
    private Context f14997d;

    public final a a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14992a, false, 9659, new Class[]{Integer.TYPE}, a.class)) {
            return f14994e.get(i);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14992a, false, 9659, new Class[]{Integer.TYPE}, a.class);
    }

    public final void b(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14992a, false, 9660, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14992a, false, 9660, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = f14994e.get(i2);
        if (aVar != null) {
            aVar.c();
            f14994e.remove(i2);
        }
    }

    public c(@NonNull Context context, i iVar) {
        this.f14997d = context.getApplicationContext();
        this.f14996c = iVar;
    }

    public final a a(int i, LifecycleOwner lifecycleOwner) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), lifecycleOwner}, this, f14992a, false, 9658, new Class[]{Integer.TYPE, LifecycleOwner.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), lifecycleOwner}, this, f14992a, false, 9658, new Class[]{Integer.TYPE, LifecycleOwner.class}, a.class);
        } else if (i == f14995f && a(f14995f) != null) {
            return a(f14995f);
        } else {
            f14995f = i;
            b bVar = new b(this.f14997d, this.f14996c);
            bVar.a(lifecycleOwner);
            f14994e.put(i, bVar);
            return bVar;
        }
    }
}
