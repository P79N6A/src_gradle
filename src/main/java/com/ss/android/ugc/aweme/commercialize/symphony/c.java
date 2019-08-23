package com.ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.ad.symphony.a.d;
import com.bytedance.ad.symphony.ad.nativead.INativeAd;
import com.bytedance.ad.symphony.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.symphony.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.feed.model.AggregationSdk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.g;
import java.util.HashMap;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39552a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f39553b;

    /* renamed from: c  reason: collision with root package name */
    private d f39554c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, INativeAd> f39555d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<String, a> f39556e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private boolean f39557f = false;

    private c() {
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f39552a, true, 32090, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f39552a, true, 32090, new Class[0], c.class);
        }
        if (f39553b == null) {
            synchronized (c.class) {
                if (f39553b == null) {
                    f39553b = new c();
                }
            }
        }
        return f39553b;
    }

    private boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f39552a, false, 32092, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39552a, false, 32092, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return g.b().bd().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }

    private d a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f39552a, false, 32095, new Class[]{Context.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{context}, this, f39552a, false, 32095, new Class[]{Context.class}, d.class);
        }
        if (this.f39554c == null) {
            this.f39554c = b.a().f7572c;
        }
        return this.f39554c;
    }

    private boolean b(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f39552a, false, 32110, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f39552a, false, 32110, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme.isAd() && aweme.getAuthor() != null) {
            return true;
        } else {
            return false;
        }
    }

    public final INativeAd a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f39552a, false, 32102, new Class[]{Aweme.class}, INativeAd.class)) {
            return (INativeAd) PatchProxy.accessDispatch(new Object[]{aweme}, this, f39552a, false, 32102, new Class[]{Aweme.class}, INativeAd.class);
        } else if (aweme == null) {
            return null;
        } else {
            return this.f39555d.get(aweme.getAid());
        }
    }

    public final boolean c(Context context, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{context, aweme}, this, f39552a, false, 32104, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aweme}, this, f39552a, false, 32104, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (a(context, aweme) == 4) {
            return true;
        } else {
            return false;
        }
    }

    public int a(Context context, Aweme aweme) {
        a aVar;
        INativeAd iNativeAd;
        if (PatchProxy.isSupport(new Object[]{context, aweme}, this, f39552a, false, 32101, new Class[]{Context.class, Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, aweme}, this, f39552a, false, 32101, new Class[]{Context.class, Aweme.class}, Integer.TYPE)).intValue();
        } else if (aweme == null) {
            return 4;
        } else {
            if (aweme.isLive()) {
                return 0;
            }
            String aid = aweme.getAid();
            if (TextUtils.isEmpty(aid)) {
                return 4;
            }
            if (!aweme.isAd()) {
                return 0;
            }
            if (!com.ss.android.g.a.a()) {
                return 1;
            }
            if (am.a(aweme, 3)) {
                if (am.a(aweme, true)) {
                    return 3;
                }
                return 4;
            } else if (!b()) {
                if (b(aweme)) {
                    return 1;
                }
                return 4;
            } else if (com.ss.android.ugc.aweme.commercialize.utils.c.Q(aweme)) {
                return 1;
            } else {
                AggregationSdk aggregationSdk = aweme.getAwemeRawAd().getAggregationSdk();
                if (aggregationSdk == null) {
                    return 4;
                }
                if (this.f39556e.containsKey(aid)) {
                    aVar = this.f39556e.get(aid);
                } else {
                    aVar = a.a(aggregationSdk.getCommonData());
                    if (aVar == null) {
                        return 4;
                    }
                    this.f39556e.put(aid, aVar);
                }
                if (this.f39555d.containsKey(aid)) {
                    iNativeAd = this.f39555d.get(aid);
                } else if (context == null) {
                    return 4;
                } else {
                    INativeAd iNativeAd2 = (INativeAd) a(context).a(aVar.f39545c, aVar.f39546d);
                    if (iNativeAd2 == null) {
                        return 4;
                    }
                    this.f39555d.put(aid, iNativeAd2);
                    iNativeAd = iNativeAd2;
                }
                if (!(iNativeAd instanceof com.bytedance.ad.symphony.ad.nativead.c)) {
                    return 2;
                }
                if (b(aweme)) {
                    return 1;
                }
                return 4;
            }
        }
    }

    public final boolean b(Context context, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{context, aweme}, this, f39552a, false, 32103, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aweme}, this, f39552a, false, 32103, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (a(context, aweme) == 2) {
            return true;
        } else {
            return false;
        }
    }
}
