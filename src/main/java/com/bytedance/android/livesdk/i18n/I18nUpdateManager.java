package com.bytedance.android.livesdk.i18n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;

public final class I18nUpdateManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15569a;
    private static long[] j = {3000, 6000, 9000, 60000, 60000, 60000, 600000};
    private static I18nApi k;

    /* renamed from: b  reason: collision with root package name */
    public String f15570b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f15571c;

    /* renamed from: d  reason: collision with root package name */
    public a f15572d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15573e;

    /* renamed from: f  reason: collision with root package name */
    public int f15574f;
    public long g;
    public long h;
    public Disposable i = null;
    private Handler.Callback l = new Handler.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15575a;

        public final boolean handleMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f15575a, false, 10176, new Class[]{Message.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f15575a, false, 10176, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
            } else if (message.what != 0) {
                return false;
            } else {
                I18nUpdateManager.this.a(I18nUpdateManager.this.h);
                return true;
            }
        }
    };

    public interface I18nApi {
        @GET("/webcast/setting/i18n/package/")
        Observable<d<a>> update(@Query(a = "locale") String str, @Query(a = "cur_version") long j);
    }

    interface a {
        void a(String str, long j, Map<String, String> map);
    }

    public final void a(Throwable th) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{th}, this, f15569a, false, 10174, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f15569a, false, 10174, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        this.f15574f++;
        Handler handler = this.f15571c;
        int i2 = this.f15574f;
        int length = j.length;
        if (i2 >= length || i2 < 0) {
            j2 = j[length - 1];
        } else {
            j2 = j[i2];
        }
        handler.sendEmptyMessageDelayed(0, j2);
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f15569a, false, 10173, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f15569a, false, 10173, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!this.f15573e && !this.f15571c.hasMessages(0)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime <= this.g || elapsedRealtime - this.g >= 60000) {
                this.h = j2;
                this.f15573e = true;
                this.i = k.update(this.f15570b, j2).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new Consumer<d<a>>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15577a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        d dVar = (d) obj;
                        if (PatchProxy.isSupport(new Object[]{dVar}, this, f15577a, false, 10177, new Class[]{d.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dVar}, this, f15577a, false, 10177, new Class[]{d.class}, Void.TYPE);
                            return;
                        }
                        I18nUpdateManager.this.f15573e = false;
                        if (dVar == null || dVar.f7870a != 0 || dVar.f7871b == null) {
                            I18nUpdateManager.this.a(new Throwable("response == null || response.statusCode != 0 || response.data == null"));
                            return;
                        }
                        I18nUpdateManager.this.f15574f = 0;
                        I18nUpdateManager.this.g = SystemClock.elapsedRealtime();
                        a aVar = (a) dVar.f7871b;
                        if (I18nUpdateManager.this.f15572d != null) {
                            I18nUpdateManager.this.f15572d.a(I18nUpdateManager.this.f15570b, aVar.f15582a, aVar.f15583b);
                        }
                    }
                }, new Consumer<Throwable>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15579a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        Throwable th = (Throwable) obj;
                        if (PatchProxy.isSupport(new Object[]{th}, this, f15579a, false, 10178, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f15579a, false, 10178, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        I18nUpdateManager.this.f15573e = false;
                        I18nUpdateManager.this.a(th);
                    }
                }, new Action() {
                    public final void run() throws Exception {
                        I18nUpdateManager.this.f15573e = false;
                    }
                });
            }
        }
    }

    public I18nUpdateManager(String str, a aVar) {
        this.f15570b = str;
        this.f15572d = aVar;
        this.f15571c = new Handler(Looper.getMainLooper(), this.l);
        if (k == null) {
            k = (I18nApi) j.q().d().a(I18nApi.class);
        }
    }
}
