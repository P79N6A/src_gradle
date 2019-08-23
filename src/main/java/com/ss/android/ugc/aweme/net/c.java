package com.ss.android.ugc.aweme.net;

import android.content.Context;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56919a = null;
    public static final String i = "c";
    static final CommonApi j = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CommonApi.class));

    /* renamed from: b  reason: collision with root package name */
    public e<T> f56920b;

    /* renamed from: c  reason: collision with root package name */
    public String f56921c;

    /* renamed from: d  reason: collision with root package name */
    p f56922d;

    /* renamed from: e  reason: collision with root package name */
    List<e> f56923e;

    /* renamed from: f  reason: collision with root package name */
    Class<T> f56924f;
    String g;
    public boolean h;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56919a, false, 60666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56919a, false, 60666, new Class[0], Void.TYPE);
            return;
        }
        a(i.a().getContext());
    }

    public final void a(e eVar) {
        this.f56920b = eVar;
    }

    private void a(Context context) {
        final Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f56919a, false, 60668, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f56919a, false, 60668, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56925a;

            public final void run() {
                Object obj;
                if (PatchProxy.isSupport(new Object[0], this, f56925a, false, 60670, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56925a, false, 60670, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    p pVar = c.this.f56922d;
                    String str = c.this.f56921c;
                    List<e> list = c.this.f56923e;
                    String str2 = c.this.g;
                    Class<T> cls = c.this.f56924f;
                    if (PatchProxy.isSupport(new Object[]{pVar, str, list, str2, cls}, null, c.f56919a, true, 60669, new Class[]{p.class, String.class, List.class, String.class, Class.class}, Object.class)) {
                        Object[] objArr = {pVar, str, list, str2, cls};
                        Object[] objArr2 = objArr;
                        obj = PatchProxy.accessDispatch(objArr2, null, c.f56919a, true, 60669, new Class[]{p.class, String.class, List.class, String.class, Class.class}, Object.class);
                    } else {
                        HashMap hashMap = new HashMap();
                        if (!CollectionUtils.isEmpty(list)) {
                            for (e next : list) {
                                hashMap.put(next.a(), next.b());
                            }
                        }
                        if (pVar == p.POST) {
                            NetUtil.putCommonParams(hashMap, true);
                            String str3 = (String) c.j.doPost(str, hashMap).execute().body();
                            if (String.class.equals(cls)) {
                                obj = com.ss.android.ugc.aweme.app.api.a.a(str3, a.d.a(), str2, str);
                            } else {
                                obj = com.ss.android.ugc.aweme.app.api.a.a(str3, new a.b(cls), str2, str);
                            }
                        } else if (pVar == p.GET) {
                            String str4 = (String) c.j.doGet(str, (Map<String, String>) hashMap).execute().body();
                            if (String.class.equals(cls)) {
                                obj = com.ss.android.ugc.aweme.app.api.a.a(str4, a.d.a(), str2, str);
                            } else {
                                obj = com.ss.android.ugc.aweme.app.api.a.a(str4, new a.b(cls), str2, str);
                            }
                        } else {
                            throw new IllegalStateException("Unsupport http type !");
                        }
                    }
                    if (c.this.f56920b != null) {
                        com.ss.android.b.a.a.a.b(new d(this, obj));
                    }
                } catch (Exception e2) {
                    if (c.this.f56920b != null) {
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f56928a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f56928a, false, 60672, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f56928a, false, 60672, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (c.this.h) {
                                    com.ss.android.ugc.aweme.app.api.a.a.a(context2, (Throwable) e2);
                                }
                                c.this.f56920b.a(e2);
                            }
                        });
                    } else {
                        com.ss.android.ugc.aweme.app.api.a.a.a(context2, (Throwable) e2);
                    }
                }
            }
        });
    }

    public c(String str, p pVar, Class<T> cls) {
        this(str, pVar, "", cls);
    }

    private c(String str, p pVar, String str2, Class<T> cls) {
        this(str, pVar, null, str2, cls);
    }

    public c(String str, p pVar, List<e> list, Class<T> cls) {
        this(str, pVar, list, null, cls);
    }

    private c(String str, p pVar, List<e> list, String str2, Class<T> cls) {
        this.h = true;
        this.f56921c = str;
        this.f56922d = pVar;
        this.f56923e = list;
        this.f56924f = cls;
        this.g = str2;
    }
}
