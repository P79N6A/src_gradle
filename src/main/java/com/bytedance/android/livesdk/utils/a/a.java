package com.bytedance.android.livesdk.utils.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17540a;

    /* renamed from: b  reason: collision with root package name */
    static volatile a f17541b;

    /* renamed from: c  reason: collision with root package name */
    e f17542c;

    /* renamed from: d  reason: collision with root package name */
    private Disposable f17543d;

    public static long a() {
        if (PatchProxy.isSupport(new Object[0], null, f17540a, true, 13793, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f17540a, true, 13793, new Class[0], Long.TYPE)).longValue();
        }
        if (f17541b == null || f17541b.f17542c == null || !f17541b.f17542c.f17553b) {
            return ah.a();
        }
        return f17541b.f17542c.b();
    }

    private a(Context context) {
        String str = (String) LiveConfigSettingKeys.LIVE_NTP_SERVER_URL.a();
        if (!TextUtils.isEmpty(str)) {
            this.f17542c = e.a(context, str, 500);
            this.f17543d = b.a(60, TimeUnit.MINUTES).take(2147483647L).subscribeOn(Schedulers.computation()).map(b.f17545b).observeOn(AndroidSchedulers.mainThread()).subscribe(c.f17547b, d.f17549b);
        }
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f17540a, true, 13791, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f17540a, true, 13791, new Class[]{Context.class}, Void.TYPE);
        } else if (f17541b == null) {
            synchronized (a.class) {
                if (f17541b == null) {
                    f17541b = new a(context2);
                }
            }
        }
    }
}
