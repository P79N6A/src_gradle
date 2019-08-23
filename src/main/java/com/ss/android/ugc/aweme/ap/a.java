package com.ss.android.ugc.aweme.ap;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33638a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final C0431a f33639b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final T f33640c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Exception f33641d;

    /* renamed from: com.ss.android.ugc.aweme.ap.a$a  reason: collision with other inner class name */
    public enum C0431a {
        SUCCESS,
        ERROR,
        LOADING;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static <T> a<T> a(Exception exc) {
        Exception exc2 = exc;
        if (!PatchProxy.isSupport(new Object[]{exc2}, null, f33638a, true, 89365, new Class[]{Exception.class}, a.class)) {
            return new a<>(C0431a.ERROR, null, exc2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{exc2}, null, f33638a, true, 89365, new Class[]{Exception.class}, a.class);
    }

    public static <T> a<T> a(@NonNull T t) {
        T t2 = t;
        if (!PatchProxy.isSupport(new Object[]{t2}, null, f33638a, true, 89364, new Class[]{Object.class}, a.class)) {
            return new a<>(C0431a.SUCCESS, t2, null);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{t2}, null, f33638a, true, 89364, new Class[]{Object.class}, a.class);
    }

    private a(@NonNull C0431a aVar, @Nullable T t, @Nullable Exception exc) {
        this.f33639b = aVar;
        this.f33640c = t;
        this.f33641d = exc;
    }
}
