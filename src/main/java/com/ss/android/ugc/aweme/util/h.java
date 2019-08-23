package com.ss.android.ugc.aweme.util;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.conan.IConanService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/util/DefaultConanService;", "Lcom/ss/android/ugc/aweme/conan/IConanService;", "()V", "init", "", "application", "Landroid/app/Application;", "isDebug", "", "start", "stop", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h implements IConanService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75435a;

    public final void init(@NotNull Application application, boolean z) {
        Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f75435a, false, 87804, new Class[]{Application.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2, Byte.valueOf(z)}, this, f75435a, false, 87804, new Class[]{Application.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(application2, "application");
    }

    public final void start() {
    }

    public final void stop() {
    }
}
