package com.bytedance.android.livesdk.v;

import android.support.annotation.NonNull;
import com.bytedance.android.live.core.utils.j;
import com.bytedance.android.livesdk.browser.e.d;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.wallet.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17680a;

    public static final class a implements h.b<g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17681a;

        @NonNull
        public final h.b.a<g> a(h.b.a<g> aVar) {
            h.b.a<g> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17681a, false, 13258, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new k((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17681a, false, 13258, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private k() {
    }

    public final com.bytedance.android.livesdk.browser.g.a b() {
        if (!PatchProxy.isSupport(new Object[0], this, f17680a, false, 13251, new Class[0], com.bytedance.android.livesdk.browser.g.a.class)) {
            return (com.bytedance.android.livesdk.browser.g.a) a(com.bytedance.android.livesdk.browser.g.a.class);
        }
        return (com.bytedance.android.livesdk.browser.g.a) PatchProxy.accessDispatch(new Object[0], this, f17680a, false, 13251, new Class[0], com.bytedance.android.livesdk.browser.g.a.class);
    }

    public final j c() {
        if (!PatchProxy.isSupport(new Object[0], this, f17680a, false, 13252, new Class[0], j.class)) {
            return (j) a(j.class);
        }
        return (j) PatchProxy.accessDispatch(new Object[0], this, f17680a, false, 13252, new Class[0], j.class);
    }

    public final ab d() {
        if (!PatchProxy.isSupport(new Object[0], this, f17680a, false, 13253, new Class[0], ab.class)) {
            return (ab) a(ab.class);
        }
        return (ab) PatchProxy.accessDispatch(new Object[0], this, f17680a, false, 13253, new Class[0], ab.class);
    }

    public final d e() {
        if (!PatchProxy.isSupport(new Object[0], this, f17680a, false, 13254, new Class[0], d.class)) {
            return (d) a(d.class);
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, f17680a, false, 13254, new Class[0], d.class);
    }

    public final com.bytedance.android.livesdk.t.a f() {
        if (!PatchProxy.isSupport(new Object[0], this, f17680a, false, 13255, new Class[0], com.bytedance.android.livesdk.t.a.class)) {
            return (com.bytedance.android.livesdk.t.a) a(com.bytedance.android.livesdk.t.a.class);
        }
        return (com.bytedance.android.livesdk.t.a) PatchProxy.accessDispatch(new Object[0], this, f17680a, false, 13255, new Class[0], com.bytedance.android.livesdk.t.a.class);
    }

    public final com.bytedance.android.livesdk.chatroom.interact.a g() {
        if (!PatchProxy.isSupport(new Object[0], this, f17680a, false, 13256, new Class[0], com.bytedance.android.livesdk.chatroom.interact.a.class)) {
            return (com.bytedance.android.livesdk.chatroom.interact.a) a(com.bytedance.android.livesdk.chatroom.interact.a.class);
        }
        return (com.bytedance.android.livesdk.chatroom.interact.a) PatchProxy.accessDispatch(new Object[0], this, f17680a, false, 13256, new Class[0], com.bytedance.android.livesdk.chatroom.interact.a.class);
    }

    public final com.bytedance.android.livesdk.browser.b.a a() {
        if (!PatchProxy.isSupport(new Object[0], this, f17680a, false, 13250, new Class[0], com.bytedance.android.livesdk.browser.b.a.class)) {
            return (com.bytedance.android.livesdk.browser.b.a) a(com.bytedance.android.livesdk.browser.b.a.class);
        }
        return (com.bytedance.android.livesdk.browser.b.a) PatchProxy.accessDispatch(new Object[0], this, f17680a, false, 13250, new Class[0], com.bytedance.android.livesdk.browser.b.a.class);
    }

    /* synthetic */ k(byte b2) {
        this();
    }

    private <T> T a(Class<T> cls) {
        if (!PatchProxy.isSupport(new Object[]{cls}, this, f17680a, false, 13257, new Class[]{Class.class}, Object.class)) {
            return h.a(cls);
        }
        return PatchProxy.accessDispatch(new Object[]{cls}, this, f17680a, false, 13257, new Class[]{Class.class}, Object.class);
    }
}
