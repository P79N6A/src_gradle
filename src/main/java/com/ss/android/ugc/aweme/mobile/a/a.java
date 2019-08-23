package com.ss.android.ugc.aweme.mobile.a;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56076a;

    /* renamed from: com.ss.android.ugc.aweme.mobile.a.a$a  reason: collision with other inner class name */
    public static class C0645a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56077a;

        /* renamed from: b  reason: collision with root package name */
        private Class<? extends Fragment> f56078b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f56079c;

        public final Fragment a() {
            if (PatchProxy.isSupport(new Object[0], this, f56077a, false, 59720, new Class[0], Fragment.class)) {
                return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f56077a, false, 59720, new Class[0], Fragment.class);
            }
            try {
                Fragment fragment = (Fragment) this.f56078b.newInstance();
                if (!this.f56079c.isEmpty()) {
                    fragment.setArguments(this.f56079c);
                }
                return fragment;
            } catch (Exception unused) {
                return null;
            }
        }

        private C0645a(Class<? extends Fragment> cls) {
            this.f56078b = cls;
            this.f56079c = new Bundle();
        }

        /* synthetic */ C0645a(Class cls, byte b2) {
            this(cls);
        }

        public final C0645a a(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f56077a, false, 59715, new Class[]{String.class, Integer.TYPE}, C0645a.class)) {
                return (C0645a) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f56077a, false, 59715, new Class[]{String.class, Integer.TYPE}, C0645a.class);
            }
            this.f56079c.putInt(str, i);
            return this;
        }

        public final C0645a a(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f56077a, false, 59718, new Class[]{String.class, Boolean.TYPE}, C0645a.class)) {
                return (C0645a) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f56077a, false, 59718, new Class[]{String.class, Boolean.TYPE}, C0645a.class);
            }
            this.f56079c.putBoolean(str, z);
            return this;
        }
    }

    public static C0645a a(Class<? extends Fragment> cls) {
        Class<? extends Fragment> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, f56076a, true, 59714, new Class[]{Class.class}, C0645a.class)) {
            return new C0645a(cls2, (byte) 0);
        }
        return (C0645a) PatchProxy.accessDispatch(new Object[]{cls2}, null, f56076a, true, 59714, new Class[]{Class.class}, C0645a.class);
    }
}
