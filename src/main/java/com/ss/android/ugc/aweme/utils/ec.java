package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import java.lang.reflect.Method;

public class ec {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75808a;

    /* renamed from: f  reason: collision with root package name */
    private static ec f75809f;

    /* renamed from: b  reason: collision with root package name */
    private Context f75810b = GlobalContext.getContext();

    /* renamed from: c  reason: collision with root package name */
    private Object f75811c;

    /* renamed from: d  reason: collision with root package name */
    private Method f75812d;

    /* renamed from: e  reason: collision with root package name */
    private Method f75813e;

    private ec() {
        if (this.f75810b != null) {
            this.f75811c = this.f75810b.getSystemService("storage");
            try {
                this.f75812d = this.f75811c.getClass().getMethod("getVolumeList", new Class[0]);
                this.f75813e = this.f75811c.getClass().getMethod("getVolumeState", new Class[]{String.class});
            } catch (Exception unused) {
            }
        }
    }

    public static ec a() {
        if (PatchProxy.isSupport(new Object[0], null, f75808a, true, 88579, new Class[0], ec.class)) {
            return (ec) PatchProxy.accessDispatch(new Object[0], null, f75808a, true, 88579, new Class[0], ec.class);
        }
        if (f75809f == null) {
            synchronized (ec.class) {
                if (f75809f == null) {
                    f75809f = new ec();
                }
            }
        }
        return f75809f;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f75808a, false, 88580, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75808a, false, 88580, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f75811c == null || this.f75812d == null || this.f75813e == null) {
            return false;
        } else {
            try {
                Object[] objArr = (Object[]) this.f75812d.invoke(this.f75811c, new Object[0]);
                if (objArr != null) {
                    if (objArr.length != 0) {
                        Method method = objArr[0].getClass().getMethod("getPath", new Class[0]);
                        Method method2 = objArr[0].getClass().getMethod("isEmulated", new Class[0]);
                        if (method != null) {
                            if (method2 != null) {
                                for (Object obj : objArr) {
                                    if (((Boolean) method2.invoke(obj, new Object[0])).booleanValue()) {
                                        if (this.f75813e.invoke(this.f75811c, new Object[]{(String) method.invoke(obj, new Object[0])}).equals("mounted")) {
                                            return true;
                                        }
                                    }
                                }
                                return false;
                            }
                        }
                        return false;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
    }
}
