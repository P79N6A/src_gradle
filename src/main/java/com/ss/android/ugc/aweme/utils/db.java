package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;

public final class db {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75729a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f75730b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final db f75731a = new db((byte) 0);
    }

    public static db a() {
        return a.f75731a;
    }

    private db() {
        this.f75730b = new ConcurrentHashMap<>();
    }

    /* synthetic */ db(byte b2) {
        this();
    }

    public final boolean a(da daVar) {
        if (PatchProxy.isSupport(new Object[]{daVar}, this, f75729a, false, 88482, new Class[]{da.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{daVar}, this, f75729a, false, 88482, new Class[]{da.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f75730b.get(daVar.getName()) != null && this.f75730b.get(daVar.getName()).booleanValue()) {
            return false;
        } else {
            this.f75730b.put(daVar.getName(), Boolean.TRUE);
            return true;
        }
    }
}
