package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44995a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f44996b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public Gson f44997c = new Gson();

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.u.c.a f44998d = ((com.ss.android.ugc.aweme.u.c.a) c.a(k.a(), com.ss.android.ugc.aweme.u.c.a.class));

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f44999e = new ConcurrentHashMap();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final ai f45000a = new ai();
    }

    public static ai a() {
        return a.f45000a;
    }

    public final String a(LogPbBean logPbBean) {
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{logPbBean2}, this, f44995a, false, 40210, new Class[]{LogPbBean.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{logPbBean2}, this, f44995a, false, 40210, new Class[]{LogPbBean.class}, String.class);
        } else if (logPbBean2 == null) {
            return "";
        } else {
            return this.f44997c.toJson((Object) logPbBean2);
        }
    }

    public final String b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44995a, false, 40206, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f44995a, false, 40206, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            if (this.f44996b.containsKey(str)) {
                return this.f44996b.get(str);
            }
            return "";
        }
    }

    public final String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44995a, false, 40204, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f44995a, false, 40204, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            if (this.f44999e.containsKey(str)) {
                return this.f44999e.get(str);
            }
            return "";
        }
    }

    public final void a(String str, LogPbBean logPbBean) {
        if (PatchProxy.isSupport(new Object[]{str, logPbBean}, this, f44995a, false, 40203, new Class[]{String.class, LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, logPbBean}, this, f44995a, false, 40203, new Class[]{String.class, LogPbBean.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            this.f44999e.put(str, this.f44997c.toJson((Object) logPbBean));
        }
    }
}
