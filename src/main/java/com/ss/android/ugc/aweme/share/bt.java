package com.ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.i18n.b;
import java.util.HashMap;

public class bt {

    /* renamed from: a  reason: collision with root package name */
    public int f64823a;

    /* renamed from: b  reason: collision with root package name */
    public String f64824b;

    /* renamed from: c  reason: collision with root package name */
    public String f64825c;

    /* renamed from: d  reason: collision with root package name */
    public String f64826d;

    /* renamed from: e  reason: collision with root package name */
    public String f64827e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<String, String> f64828f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64829a;

        /* renamed from: b  reason: collision with root package name */
        public bt f64830b = new bt((byte) 0);

        public a() {
            this.f64830b.f64828f = new HashMap<>();
        }

        private a b(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f64829a, false, 73238, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f64829a, false, 73238, new Class[]{String.class, String.class}, a.class);
            }
            this.f64830b.f64828f.put(str, str2);
            return this;
        }

        public final a c(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f64829a, false, 73235, new Class[]{String.class, Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f64829a, false, 73235, new Class[]{String.class, Long.TYPE}, a.class);
            }
            bt btVar = this.f64830b;
            btVar.f64825c = "#" + str;
            this.f64830b.f64826d = k.g().getResources().getString(C0906R.string.rp, new Object[]{b.b(j)});
            return this;
        }

        public final a d(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f64829a, false, 73236, new Class[]{String.class, Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f64829a, false, 73236, new Class[]{String.class, Long.TYPE}, a.class);
            }
            this.f64830b.f64825c = str2;
            this.f64830b.f64826d = k.g().getResources().getString(C0906R.string.b3x, new Object[]{b.b(j)});
            return this;
        }

        public final a a(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f64829a, false, 73233, new Class[]{String.class, Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f64829a, false, 73233, new Class[]{String.class, Long.TYPE}, a.class);
            }
            this.f64830b.f64825c = str2;
            this.f64830b.f64826d = k.g().getResources().getString(C0906R.string.jv, new Object[]{b.b(j)});
            return this;
        }

        public final a b(String str, long j) {
            String str2;
            String str3 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str3, new Long(j2)}, this, f64829a, false, 73234, new Class[]{String.class, Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str3, new Long(j2)}, this, f64829a, false, 73234, new Class[]{String.class, Long.TYPE}, a.class);
            }
            if (TextUtils.isEmpty(str) || !str.startsWith("@")) {
                str2 = str3;
            } else {
                str2 = str.substring(1);
            }
            this.f64830b.f64825c = str2;
            this.f64830b.f64826d = k.g().getResources().getString(C0906R.string.bfa, new Object[]{b.b(j)});
            return this;
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f64829a, false, 73237, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f64829a, false, 73237, new Class[]{String.class, String.class}, a.class);
            }
            bt btVar = this.f64830b;
            btVar.f64825c = "@" + str;
            this.f64830b.f64826d = k.g().getResources().getString(C0906R.string.jr, new Object[]{str2});
            return this;
        }

        public final a a(int i, String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, f64829a, false, 73232, new Class[]{Integer.TYPE, String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, f64829a, false, 73232, new Class[]{Integer.TYPE, String.class, String.class}, a.class);
            }
            this.f64830b.f64823a = i;
            this.f64830b.f64824b = str3;
            this.f64830b.f64827e = str4;
            b(this.f64830b.a(), this.f64830b.f64824b);
            return this;
        }
    }

    private bt() {
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        int i = this.f64823a;
        if (i == 5) {
            return "room_id";
        }
        if (i == 7) {
            return "poi_id";
        }
        if (i == 17) {
            return "prop_id";
        }
        if (i != 23) {
            switch (i) {
                case 2:
                    break;
                case 3:
                    return "music_id";
                default:
                    return "";
            }
        }
        return "tag_id";
    }

    /* synthetic */ bt(byte b2) {
        this();
    }
}
