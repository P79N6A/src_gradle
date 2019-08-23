package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.utils.am;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50912a;
    private static am<b> j = new am<b>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50914a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f50914a, false, 51229, new Class[0], b.class)) {
                return new b((byte) 0);
            }
            return (b) PatchProxy.accessDispatch(new Object[0], this, f50914a, false, 51229, new Class[0], b.class);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public n f50913b;

    private b() {
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f50912a, true, 51222, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f50912a, true, 51222, new Class[0], b.class);
        }
        return (b) j.b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50912a, false, 51228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50912a, false, 51228, new Class[0], Void.TYPE);
            return;
        }
        o.c(this.f50913b);
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final ab a(n nVar, BaseContent baseContent) {
        if (PatchProxy.isSupport(new Object[]{nVar, baseContent}, this, f50912a, false, 51225, new Class[]{n.class, BaseContent.class}, ab.class)) {
            return (ab) PatchProxy.accessDispatch(new Object[]{nVar, baseContent}, this, f50912a, false, 51225, new Class[]{n.class, BaseContent.class}, ab.class);
        } else if (baseContent instanceof AudioContent) {
            return new n(this.i, this.h, (AudioContent) baseContent, nVar);
        } else {
            return null;
        }
    }
}
