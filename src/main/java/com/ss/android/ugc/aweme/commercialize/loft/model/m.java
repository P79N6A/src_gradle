package com.ss.android.ugc.aweme.commercialize.loft.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0002\u0010\u000bR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/SingletonHolder;", "T", "A", "", "creator", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "instance", "Ljava/lang/Object;", "of", "arg", "(Ljava/lang/Object;)Ljava/lang/Object;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class m<T, A> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39280a;

    /* renamed from: b  reason: collision with root package name */
    private Function1<? super A, ? extends T> f39281b;

    /* renamed from: c  reason: collision with root package name */
    private volatile T f39282c;

    public m(@NotNull Function1<? super A, ? extends T> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "creator");
        this.f39281b = function1;
    }

    public final T a(A a2) {
        T t;
        if (PatchProxy.isSupport(new Object[]{a2}, this, f39280a, false, 31351, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{a2}, this, f39280a, false, 31351, new Class[]{Object.class}, Object.class);
        }
        T t2 = this.f39282c;
        if (t2 != null) {
            return t2;
        }
        synchronized (this) {
            t = this.f39282c;
            if (t == null) {
                Function1<? super A, ? extends T> function1 = this.f39281b;
                if (function1 == null) {
                    Intrinsics.throwNpe();
                }
                t = function1.invoke(a2);
                this.f39282c = t;
                this.f39281b = null;
            }
        }
        return t;
    }
}
