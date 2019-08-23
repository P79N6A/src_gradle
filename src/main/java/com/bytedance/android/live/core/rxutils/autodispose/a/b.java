package com.bytedance.android.live.core.rxutils.autodispose.a;

import android.os.Build;
import android.support.annotation.RestrictTo;
import android.view.View;
import com.bytedance.android.live.core.rxutils.autodispose.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.android.MainThreadDisposable;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b implements CompletableSource {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8010a;

    /* renamed from: b  reason: collision with root package name */
    private final View f8011b;

    static final class a extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8012a;

        /* renamed from: b  reason: collision with root package name */
        private final View f8013b;

        /* renamed from: c  reason: collision with root package name */
        private final CompletableObserver f8014c;

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onDispose() {
            if (PatchProxy.isSupport(new Object[0], this, f8012a, false, 820, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8012a, false, 820, new Class[0], Void.TYPE);
                return;
            }
            this.f8013b.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8012a, false, 819, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8012a, false, 819, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (!isDisposed()) {
                this.f8014c.onComplete();
            }
        }

        a(View view, CompletableObserver completableObserver) {
            this.f8013b = view;
            this.f8014c = completableObserver;
        }
    }

    b(View view) {
        this.f8011b = view;
    }

    public final void subscribe(CompletableObserver completableObserver) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{completableObserver}, this, f8010a, false, 818, new Class[]{CompletableObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{completableObserver}, this, f8010a, false, 818, new Class[]{CompletableObserver.class}, Void.TYPE);
            return;
        }
        a aVar = new a(this.f8011b, completableObserver);
        completableObserver.onSubscribe(aVar);
        if (!com.bytedance.android.live.core.rxutils.autodispose.a.a.a.a()) {
            completableObserver.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
            return;
        }
        if ((Build.VERSION.SDK_INT < 19 || !this.f8011b.isAttachedToWindow()) && this.f8011b.getWindowToken() == null) {
            z = false;
        }
        if (!z) {
            completableObserver.onError(new ac("View is not attached!"));
            return;
        }
        this.f8011b.addOnAttachStateChangeListener(aVar);
        if (aVar.isDisposed()) {
            this.f8011b.removeOnAttachStateChangeListener(aVar);
        }
    }
}
