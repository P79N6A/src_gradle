package com.ss.android.ugc.aweme.sticker.prop.b;

import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.sticker.model.e;
import com.ss.android.ugc.aweme.sticker.prop.fragment.i;

public final class a extends b<com.ss.android.ugc.aweme.common.a<e>, i> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71676a;

    /* renamed from: b  reason: collision with root package name */
    public s<g> f71677b;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71676a, false, 82073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71676a, false, 82073, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((i) this.f2979f).a((e) this.f2978e.getData());
        }
    }

    public a(s<g> sVar) {
        this.f71677b = sVar;
        a(new com.ss.android.ugc.aweme.common.a<e>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71678a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f71678a, false, 82077, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f71678a, false, 82077, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    a aVar = a.this;
                    WeakHandler weakHandler = this.mHandler;
                    String str = objArr[0];
                    int intValue = objArr[1].intValue();
                    if (PatchProxy.isSupport(new Object[]{weakHandler, str, Integer.valueOf(intValue)}, aVar, a.f71676a, false, 82071, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{weakHandler, str, Integer.valueOf(intValue)}, aVar2, a.f71676a, false, 82071, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        m.f2752c.a(weakHandler, new b(str), 0);
                    }
                    return true;
                }
            }
        });
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f71676a, false, 82072, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f71676a, false, 82072, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((i) this.f2979f).a(exc);
        }
    }
}
