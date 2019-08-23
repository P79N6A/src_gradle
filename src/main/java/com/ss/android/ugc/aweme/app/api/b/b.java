package com.ss.android.ugc.aweme.app.api.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.app.api.h;
import io.reactivex.functions.Function;

public class b<P extends Message, J> implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33797a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    final J f33798b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    final P f33799c;
    @SerializedName("rid")

    /* renamed from: d  reason: collision with root package name */
    String f33800d;

    public String getRequestId() {
        return this.f33800d;
    }

    public void setRequestId(String str) {
        this.f33800d = str;
    }

    static <T extends Message> b a(T t) {
        T t2 = t;
        if (!PatchProxy.isSupport(new Object[]{t2}, null, f33797a, true, 23191, new Class[]{Message.class}, b.class)) {
            return new b(null, t2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{t2}, null, f33797a, true, 23191, new Class[]{Message.class}, b.class);
    }

    static b a(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, null, f33797a, true, 23190, new Class[]{Object.class}, b.class)) {
            return new b(obj2, null);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{obj2}, null, f33797a, true, 23190, new Class[]{Object.class}, b.class);
    }

    @NonNull
    public final J a(@NonNull Function<P, J> function) throws Exception {
        if (PatchProxy.isSupport(new Object[]{function}, this, f33797a, false, 23192, new Class[]{Function.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{function}, this, f33797a, false, 23192, new Class[]{Function.class}, Object.class);
        }
        J j = this.f33798b;
        if (j == null) {
            j = function.apply(this.f33799c);
        }
        if (j instanceof h) {
            ((h) j).setRequestId(this.f33800d);
        }
        return j;
    }

    private b(@Nullable J j, @Nullable P p) {
        if (j == null && p == null) {
            throw new IllegalArgumentException("wrong args");
        }
        this.f33798b = j;
        this.f33799c = p;
    }
}
