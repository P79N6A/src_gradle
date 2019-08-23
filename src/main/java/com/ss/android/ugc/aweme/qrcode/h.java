package com.ss.android.ugc.aweme.qrcode;

import android.text.TextUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.c;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63485a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63486b;

    /* renamed from: c  reason: collision with root package name */
    private final int f63487c;

    h(String str, int i) {
        this.f63486b = str;
        this.f63487c = i;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f63485a, false, 70398, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f63485a, false, 70398, new Class[0], Object.class);
        }
        String str = this.f63486b;
        int i = this.f63487c;
        String a2 = c.a(GlobalContext.getContext(), str);
        String a3 = g.a();
        if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a2)) {
            FileUtils.copyFile(a2, a3, g.b(i));
        }
        return null;
    }
}
