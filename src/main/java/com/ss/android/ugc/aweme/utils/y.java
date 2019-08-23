package com.ss.android.ugc.aweme.utils;

import a.g;
import a.i;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import java.util.concurrent.Callable;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75971a;

    /* renamed from: b  reason: collision with root package name */
    static final boolean f75972b = a.a();

    public static void a(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, null, f75971a, true, 88032, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, null, f75971a, true, 88032, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{runnable2, "BoltsUtils"}, null, f75971a, true, 88031, new Class[]{Runnable.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2, "BoltsUtils"}, null, f75971a, true, 88031, new Class[]{Runnable.class, String.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new ab<TResult>(runnable2, "BoltsUtils"), i.f1052b).a((g<TResult, TContinuationResult>) new ac<TResult,TContinuationResult>("BoltsUtils"));
    }

    public static boolean a(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f75971a, true, 88028, new Class[]{i.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iVar}, null, f75971a, true, 88028, new Class[]{i.class}, Boolean.TYPE)).booleanValue();
        } else if (iVar == null || iVar.d() || iVar.c() || iVar.e() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(Runnable runnable, @Nullable String str) {
        Runnable runnable2 = runnable;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{runnable2, str2}, null, f75971a, true, 88030, new Class[]{Runnable.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2, str2}, null, f75971a, true, 88030, new Class[]{Runnable.class, String.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new z<TResult>(runnable2, str2)).a((g<TResult, TContinuationResult>) new aa<TResult,TContinuationResult>(str2));
    }
}
