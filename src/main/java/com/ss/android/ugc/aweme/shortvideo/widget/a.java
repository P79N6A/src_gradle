package com.ss.android.ugc.aweme.shortvideo.widget;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.b;
import com.ss.android.ugc.aweme.shortvideo.cut.model.g;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71405a;

    /* renamed from: b  reason: collision with root package name */
    n f71406b;

    public final void a(@NotNull String str) {
    }

    public final void b() {
    }

    public a(n nVar) {
        this.f71406b = nVar;
    }

    @SuppressLint({"CheckResult"})
    public final void a(int i, @NotNull String str, int i2, int i3, @NotNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f71405a, false, 81274, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f71405a, false, 81274, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, b.class}, Void.TYPE);
            return;
        }
        this.f71406b.a().filter(new b(i)).subscribe((Consumer<? super T>) new c<Object>(this, bVar2));
    }
}
