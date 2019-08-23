package com.ss.android.ugc.aweme.base.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34764a;

    /* renamed from: b  reason: collision with root package name */
    public C0448a f34765b;

    /* renamed from: c  reason: collision with root package name */
    public Object f34766c;

    /* renamed from: com.ss.android.ugc.aweme.base.model.a$a  reason: collision with other inner class name */
    public enum C0448a {
        RES_ID,
        URL,
        URL_MODEL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static a a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f34764a, true, 24660, new Class[]{Integer.TYPE}, a.class)) {
            return new a(C0448a.RES_ID, Integer.valueOf(i));
        }
        return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f34764a, true, 24660, new Class[]{Integer.TYPE}, a.class);
    }

    public a(C0448a aVar, Object obj) {
        this.f34765b = aVar;
        this.f34766c = obj;
    }
}
