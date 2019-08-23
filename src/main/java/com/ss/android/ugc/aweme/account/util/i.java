package com.ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33091a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33092a;

        /* renamed from: b  reason: collision with root package name */
        public Bundle f33093b;

        /* renamed from: c  reason: collision with root package name */
        private Class<? extends Fragment> f33094c;

        public final Fragment a() {
            if (PatchProxy.isSupport(new Object[0], this, f33092a, false, 21322, new Class[0], Fragment.class)) {
                return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f33092a, false, 21322, new Class[0], Fragment.class);
            }
            try {
                Fragment fragment = (Fragment) this.f33094c.newInstance();
                if (!this.f33093b.isEmpty()) {
                    fragment.setArguments(this.f33093b);
                }
                return fragment;
            } catch (Exception unused) {
                return null;
            }
        }

        private a(Class<? extends Fragment> cls, Bundle bundle) {
            Bundle bundle2;
            this.f33094c = cls;
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = (Bundle) bundle.clone();
            }
            this.f33093b = bundle2;
        }

        public final a a(String str, Serializable serializable) {
            if (PatchProxy.isSupport(new Object[]{str, serializable}, this, f33092a, false, 21321, new Class[]{String.class, Serializable.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, serializable}, this, f33092a, false, 21321, new Class[]{String.class, Serializable.class}, a.class);
            }
            this.f33093b.putSerializable(str, serializable);
            return this;
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f33092a, false, 21319, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f33092a, false, 21319, new Class[]{String.class, String.class}, a.class);
            }
            this.f33093b.putString(str, str2);
            return this;
        }

        public final a a(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, (byte) 1}, this, f33092a, false, 21320, new Class[]{String.class, Boolean.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, (byte) 1}, this, f33092a, false, 21320, new Class[]{String.class, Boolean.TYPE}, a.class);
            }
            this.f33093b.putBoolean(str, true);
            return this;
        }

        public /* synthetic */ a(Class cls, Bundle bundle, byte b2) {
            this(cls, bundle);
        }
    }

    public static a a(Class<? extends Fragment> cls, Bundle bundle) {
        Class<? extends Fragment> cls2 = cls;
        Bundle bundle2 = bundle;
        if (!PatchProxy.isSupport(new Object[]{cls2, bundle2}, null, f33091a, true, 21316, new Class[]{Class.class, Bundle.class}, a.class)) {
            return new a(cls2, bundle2, (byte) 0);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{cls2, bundle2}, null, f33091a, true, 21316, new Class[]{Class.class, Bundle.class}, a.class);
    }
}
