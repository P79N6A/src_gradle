package com.bytedance.android.livesdk.i18n;

import android.arch.persistence.room.Room;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.i18n.db.I18nDatabase;
import com.bytedance.android.livesdk.i18n.db.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15594a;

    /* renamed from: c  reason: collision with root package name */
    static e f15595c;

    /* renamed from: d  reason: collision with root package name */
    static com.bytedance.android.livesdk.i18n.db.b f15596d;

    /* renamed from: b  reason: collision with root package name */
    String f15597b;

    /* renamed from: e  reason: collision with root package name */
    public a f15598e;

    /* renamed from: f  reason: collision with root package name */
    boolean f15599f;
    boolean g;
    public Disposable h;
    public Disposable i;
    private long j;
    private Map<String, String> k;

    interface a {
        void a(String str, b bVar);

        void a(String str, Exception exc);
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        String f15600a;

        /* renamed from: b  reason: collision with root package name */
        long f15601b;

        /* renamed from: c  reason: collision with root package name */
        Map<String, String> f15602c;

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15594a, false, 10163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15594a, false, 10163, new Class[0], Void.TYPE);
            return;
        }
        if (this.j >= 0) {
            a(this.j, this.k);
            this.j = -1;
            this.k = null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f15594a, false, 10164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15594a, false, 10164, new Class[0], Void.TYPE);
        } else if (!this.f15599f) {
            this.f15599f = true;
            this.h = Flowable.fromCallable(new d(this)).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new e(this), new f(this));
        }
    }

    public c(String str, a aVar) {
        this.f15597b = str;
        this.f15598e = aVar;
        if (f15595c == null) {
            I18nDatabase i18nDatabase = (I18nDatabase) Room.databaseBuilder(ac.e().getApplicationContext(), I18nDatabase.class, "i18n_live").build();
            f15595c = i18nDatabase.a();
            f15596d = i18nDatabase.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, Map<String, String> map) {
        long j3 = j2;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), map2}, this, f15594a, false, 10165, new Class[]{Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), map2}, this, f15594a, false, 10165, new Class[]{Long.TYPE, Map.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(this.f15597b) || map2 == null || map.isEmpty()) {
            TextUtils.isEmpty(this.f15597b);
        } else if (this.g) {
            this.j = j3;
            this.k = map2;
        } else {
            this.g = true;
            this.i = Flowable.fromCallable(new g(this, map2, j3)).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new h(this), new i(this));
        }
    }
}
