package com.ss.android.ugc.aweme.im.sdk.utils;

import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.a.c;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import java.util.concurrent.ExecutionException;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52478a;

    public static RuntimeException a(ExecutionException executionException) throws Exception {
        if (PatchProxy.isSupport(new Object[]{executionException}, null, f52478a, true, 53679, new Class[]{ExecutionException.class}, RuntimeException.class)) {
            return (RuntimeException) PatchProxy.accessDispatch(new Object[]{executionException}, null, f52478a, true, 53679, new Class[]{ExecutionException.class}, RuntimeException.class);
        }
        Throwable cause = executionException.getCause();
        if (cause instanceof a) {
            return (a) cause;
        }
        if (cause instanceof JsonParseException) {
            return new c(cause);
        }
        throw ((Exception) cause);
    }
}
