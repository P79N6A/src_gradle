package com.unicom.xiaowo.login.c;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    ExecutorService f81426a = b.a(2);

    /* renamed from: b  reason: collision with root package name */
    l f81427b = new l();

    public final void a(String str, String str2, HashMap hashMap, e eVar) {
        ExecutorService executorService = this.f81426a;
        c cVar = new c(this, str, str2, hashMap, eVar);
        executorService.submit(cVar);
    }
}
