package com.bytedance.android.livesdk.chatroom.interact.contract;

import android.arch.lifecycle.Lifecycle;
import com.bytedance.android.live.core.rxutils.autodispose.ae;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.rxutils.autodispose.m;
import com.bytedance.android.live.core.rxutils.f;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class InteractDialogFragmentBaseContract {

    public static abstract class View<T extends a> extends BaseFragment {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10826a;

        /* renamed from: b  reason: collision with root package name */
        public b.C0088b f10827b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10828c = getClass().getSimpleName();
        public T h;
        protected final LinkCrossRoomDataHolder i = LinkCrossRoomDataHolder.a();

        public abstract String c();

        public abstract float d();

        public android.view.View e() {
            return null;
        }

        public android.view.View f() {
            return null;
        }

        public final <S> m<S> g() {
            if (!PatchProxy.isSupport(new Object[0], this, f10826a, false, 4484, new Class[0], m.class)) {
                return e.a(this.f10827b.d());
            }
            return (m) PatchProxy.accessDispatch(new Object[0], this, f10826a, false, 4484, new Class[0], m.class);
        }

        public final <R> m<R> h() {
            if (!PatchProxy.isSupport(new Object[0], this, f10826a, false, 4485, new Class[0], m.class)) {
                return e.a((ae) com.bytedance.android.live.core.rxutils.autodispose.a.a(this.f10827b.d(), Lifecycle.Event.ON_DESTROY), (f<T>) i.a());
            }
            return (m) PatchProxy.accessDispatch(new Object[0], this, f10826a, false, 4485, new Class[0], m.class);
        }
    }

    public static abstract class a<V extends View> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10829a;

        /* renamed from: b  reason: collision with root package name */
        final String f10830b = getClass().getSimpleName();

        /* renamed from: c  reason: collision with root package name */
        protected V f10831c;

        /* renamed from: d  reason: collision with root package name */
        protected final LinkCrossRoomDataHolder f10832d = LinkCrossRoomDataHolder.a();

        public final <S> m<S> a() {
            if (!PatchProxy.isSupport(new Object[0], this, f10829a, false, 4482, new Class[0], m.class)) {
                return this.f10831c.g();
            }
            return (m) PatchProxy.accessDispatch(new Object[0], this, f10829a, false, 4482, new Class[0], m.class);
        }

        public final <R> m<R> b() {
            if (!PatchProxy.isSupport(new Object[0], this, f10829a, false, 4483, new Class[0], m.class)) {
                return this.f10831c.h();
            }
            return (m) PatchProxy.accessDispatch(new Object[0], this, f10829a, false, 4483, new Class[0], m.class);
        }

        public a(V v) {
            this.f10831c = v;
        }

        public final void a(Throwable th) {
            if (PatchProxy.isSupport(new Object[]{th}, this, f10829a, false, 4481, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f10829a, false, 4481, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.live.core.c.a.a(6, this.f10830b, th.getStackTrace());
        }
    }
}
