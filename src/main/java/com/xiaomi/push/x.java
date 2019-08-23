package com.xiaomi.push;

import android.content.Context;
import java.io.File;

public final class x extends w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f82611a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.f82611a = runnable;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        if (this.f82611a != null) {
            this.f82611a.run();
        }
    }
}
