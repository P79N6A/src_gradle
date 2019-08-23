package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.IdRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public abstract class AbsAdCardAction extends AbsHalfWebPageAction {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2952a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2953b;

    /* renamed from: c  reason: collision with root package name */
    public int f2954c;
    @IdRes

    /* renamed from: d  reason: collision with root package name */
    protected int f2955d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f40012a;

        /* renamed from: b  reason: collision with root package name */
        public int f40013b;

        /* renamed from: c  reason: collision with root package name */
        public int f40014c;

        public a(int i, int i2, int i3) {
            this.f40012a = i;
            this.f40013b = i2;
            this.f40014c = i3;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int f40015a;

        public b(int i) {
            this.f40015a = i;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f40016a;

        /* renamed from: b  reason: collision with root package name */
        public int f40017b;

        public c(int i, int i2) {
            this.f40016a = i;
            this.f40017b = i2;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f40018a;

        public d(int i) {
            this.f40018a = i;
        }
    }

    public final boolean c() {
        if (this.f2954c == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f2952a, false, 33012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2952a, false, 33012, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        bg.c(this);
        if (this.i instanceof j) {
            ((j) this.i).b(this.f2955d);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2952a, false, 33013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2952a, false, 33013, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        bg.d(this);
    }

    @Subscribe
    public void onEvent(d dVar) {
        this.f2954c = dVar.f40018a;
    }

    public AbsAdCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
    }
}
