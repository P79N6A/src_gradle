package com.bytedance.crash.e;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.crash.i.a;
import com.bytedance.crash.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private String f19419c;

    public b(String str) {
        this.f19419c = str;
    }

    @NonNull
    public static b a(@NonNull StackTraceElement stackTraceElement, @NonNull String str, @Nullable String str2, @NonNull String str3, boolean z, String str4) {
        b bVar = new b("core_exception_monitor");
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        bVar.a("event_type", (Object) "exception");
        bVar.a("log_type", (Object) "core_exception_monitor");
        bVar.a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.a("class_ref", (Object) className);
        bVar.a(PushConstants.MZ_PUSH_MESSAGE_METHOD, (Object) methodName);
        bVar.a("line_num", (Object) Integer.valueOf(lineNumber));
        bVar.a("stack", (Object) str);
        bVar.a("exception_type", (Object) 1);
        bVar.a("ensure_type", (Object) str4);
        bVar.a("is_core", (Object) Integer.valueOf(z ? 1 : 0));
        bVar.a("message", (Object) str2);
        bVar.a("process_name", (Object) a.d(j.d()));
        bVar.a("crash_thread_name", (Object) str3);
        a.a(j.d(), bVar.f19417a);
        return bVar;
    }
}
