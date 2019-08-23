package com.ss.android.ugc.aweme.feed.h;

import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import java.util.concurrent.Callable;

public final class aa extends a<Pair<String, Integer>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45460a;

    /* renamed from: b  reason: collision with root package name */
    public int f45461b;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 3 && objArr.length != 4)) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45460a, false, 42084, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45460a, false, 42084, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45462a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f45462a, false, 42085, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f45462a, false, 42085, new Class[0], Object.class);
                    } else if (objArr.length > 3) {
                        aa.this.f45461b = ((Integer) objArr[2]).intValue();
                        String str = (String) objArr[0];
                        String str2 = (String) objArr[1];
                        int intValue = ((Integer) objArr[2]).intValue();
                        int a2 = com.ss.android.ugc.aweme.app.constants.a.a((String) objArr[3]);
                        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(intValue), Integer.valueOf(a2)}, null, FeedApi.f45052a, true, 40879, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, Pair.class)) {
                            return (Pair) PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(intValue), Integer.valueOf(a2)}, null, FeedApi.f45052a, true, 40879, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, Pair.class);
                        }
                        FeedApi.f45054c.diggItem(str, str2, intValue, a2).get();
                        return Pair.create(str, Integer.valueOf(intValue));
                    } else {
                        aa.this.f45461b = ((Integer) objArr[1]).intValue();
                        String str3 = (String) objArr[0];
                        int intValue2 = ((Integer) objArr[1]).intValue();
                        int a3 = com.ss.android.ugc.aweme.app.constants.a.a((String) objArr[2]);
                        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(intValue2), Integer.valueOf(a3)}, null, FeedApi.f45052a, true, 40878, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Pair.class)) {
                            return (Pair) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(intValue2), Integer.valueOf(a3)}, null, FeedApi.f45052a, true, 40878, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Pair.class);
                        }
                        FeedApi.f45054c.diggItem(str3, intValue2, a3).get();
                        return Pair.create(str3, Integer.valueOf(intValue2));
                    }
                }
            }, 0);
            return true;
        }
    }
}
