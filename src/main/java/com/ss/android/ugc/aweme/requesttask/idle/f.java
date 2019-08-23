package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feedback.k;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/idle/FetchFeedbackRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "()V", "request", "", "context", "Landroid/content/Context;", "coldBoodt", "", "type", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63627a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/requesttask/idle/FetchFeedbackRequest$request$1", "Lio/reactivex/Observer;", "", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Observer<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f63629b;

        public final void onComplete() {
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f63628a, false, 70812, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f63628a, false, 70812, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f63628a, false, 70810, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f63628a, false, 70810, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        a(k kVar) {
            this.f63629b = kVar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            long longValue = ((Number) obj).longValue();
            if (PatchProxy.isSupport(new Object[]{new Long(longValue)}, this, f63628a, false, 70811, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(longValue)}, this, f63628a, false, 70811, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            this.f63629b.a();
        }
    }

    @NotNull
    public final e a() {
        return e.IDLE;
    }

    public final void a(@NotNull Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63627a, false, 70809, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, this, f63627a, false, 70809, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        k a2 = k.a(com.ss.android.ugc.aweme.app.k.a());
        AbTestManager a3 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
        if (a3.ce()) {
            Observable.interval(3, TimeUnit.MINUTES).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new a<Object>(a2));
        } else {
            a2.a();
        }
    }
}
