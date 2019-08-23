package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/InMemOnce;", "", "()V", "invoked", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enter", "", "invoke", "", "f", "Lkotlin/Function0;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39664a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f39665b = new AtomicBoolean(false);

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f39664a, false, 32520, new Class[0], Boolean.TYPE)) {
            return this.f39665b.compareAndSet(false, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39664a, false, 32520, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
