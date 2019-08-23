package com.ss.android.ugc.aweme.commerce.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38322a;

    /* renamed from: b  reason: collision with root package name */
    private final CheckShoppingAssistantApi f38323b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38324c;

    d(CheckShoppingAssistantApi checkShoppingAssistantApi, String str) {
        this.f38323b = checkShoppingAssistantApi;
        this.f38324c = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f38322a, false, 30127, new Class[0], Object.class)) {
            return (a) this.f38323b.check(this.f38324c).get();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f38322a, false, 30127, new Class[0], Object.class);
    }
}
