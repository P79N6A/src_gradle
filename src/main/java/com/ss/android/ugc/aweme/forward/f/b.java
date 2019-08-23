package com.ss.android.ugc.aweme.forward.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.o;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48307a;

    /* renamed from: b  reason: collision with root package name */
    public String f48308b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f48309c;

    /* renamed from: d  reason: collision with root package name */
    public o f48310d;

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f48307a, false, 45532, new Class[0], Integer.TYPE)) {
            return this.f48308b.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48307a, false, 45532, new Class[0], Integer.TYPE)).intValue();
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f48307a, false, 45533, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48307a, false, 45533, new Class[0], String.class);
        }
        return "ForwardShareInfo{mShareId='" + this.f48308b + '\'' + ", mAweme=" + this.f48309c + ", mPlayerManager=" + this.f48310d + '}';
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f48307a, false, 45531, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f48307a, false, 45531, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj || ((obj instanceof b) && this.f48308b.equals(((b) obj).f48308b))) {
            return true;
        } else {
            return false;
        }
    }

    public static String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f48307a, true, 45530, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f48307a, true, 45530, new Class[]{String.class, String.class}, String.class);
        }
        return str3 + "_" + str4;
    }

    public b(String str, Aweme aweme, o oVar) {
        this.f48308b = str;
        this.f48309c = aweme;
        this.f48310d = oVar;
    }
}
