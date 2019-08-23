package com.bytedance.android.livesdk.s;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.android.livesdkapi.depend.d.d;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class j implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17149a;

    /* renamed from: b  reason: collision with root package name */
    final List<d> f17150b;

    /* renamed from: c  reason: collision with root package name */
    private Room f17151c;

    /* renamed from: d  reason: collision with root package name */
    private final c<Integer> f17152d;

    public static final class a implements h.b<n> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17153a;

        @NonNull
        public final h.b.a<n> a(h.b.a<n> aVar) {
            h.b.a<n> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17153a, false, 12915, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new j((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17153a, false, 12915, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    @Nullable
    public final Room a() {
        return this.f17151c;
    }

    private j() {
        this.f17150b = new ArrayList();
        this.f17152d = new k(this);
        TTLiveSDKContext.getLiveService().c().a(this.f17152d);
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f17149a, false, 12909, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17149a, false, 12909, new Class[0], Boolean.TYPE)).booleanValue();
        }
        int a2 = TTLiveSDKContext.getLiveService().c().a();
        if (a2 == 2 || a2 == 1) {
            return true;
        }
        return false;
    }

    /* synthetic */ j(byte b2) {
        this();
    }

    public final void a(@Nullable Room room) {
        this.f17151c = room;
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f17149a, false, 12912, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f17149a, false, 12912, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getLiveService().b(context2);
    }

    public final void b(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f17149a, false, 12911, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f17149a, false, 12911, new Class[]{d.class}, Void.TYPE);
            return;
        }
        this.f17150b.remove(dVar2);
    }

    public final void a(com.bytedance.android.livesdkapi.depend.d.a aVar) {
        com.bytedance.android.livesdkapi.depend.d.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f17149a, false, 12913, new Class[]{com.bytedance.android.livesdkapi.depend.d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17149a, false, 12913, new Class[]{com.bytedance.android.livesdkapi.depend.d.a.class}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getLiveService().a(aVar2.typeName);
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f17149a, false, 12910, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f17149a, false, 12910, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (!this.f17150b.contains(dVar)) {
            this.f17150b.add(dVar);
        }
    }
}
