package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.a<AwemeAdStatus> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45454a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f45455b = c.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public String f45456c;

    /* renamed from: d  reason: collision with root package name */
    public int f45457d;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        int i;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45454a, false, 42011, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45454a, false, 42011, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            this.f45456c = objArr[0];
            if (objArr.length >= 2) {
                i = objArr[1].intValue();
            } else {
                i = 0;
            }
            this.f45457d = i;
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45458a;

                public final Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, f45458a, false, 42012, new Class[0], Object.class)) {
                        return AwemeApi.a(a.this.f45456c, a.this.f45457d);
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f45458a, false, 42012, new Class[0], Object.class);
                }
            }, 0);
            return true;
        }
    }
}
