package com.ss.android.ugc.aweme.video.hashtag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.Comparator;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76098a;

    /* renamed from: b  reason: collision with root package name */
    public int f76099b;

    /* renamed from: c  reason: collision with root package name */
    public int f76100c;

    /* renamed from: d  reason: collision with root package name */
    public String f76101d;

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.a$a  reason: collision with other inner class name */
    public static class C0794a implements Comparator<a> {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            if (aVar.f76099b == aVar2.f76099b) {
                return 0;
            }
            if (aVar.f76099b < aVar2.f76099b) {
                return -1;
            }
            return 1;
        }
    }

    public a() {
    }

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, f76098a, false, 89091, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76098a, false, 89091, new Class[0], Integer.TYPE)).intValue();
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f76099b), Integer.valueOf(this.f76100c), this.f76101d});
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f76098a, false, 89089, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76098a, false, 89089, new Class[0], String.class);
        }
        return "(" + this.f76101d + ": " + this.f76099b + ", " + this.f76100c + ")";
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f76098a, false, 89090, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f76098a, false, 89090, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f76099b == aVar.f76099b && this.f76100c == aVar.f76100c && (this.f76101d == aVar.f76101d || (this.f76101d != null && this.f76101d.equals(aVar.f76101d)))) {
                return true;
            }
            return false;
        }
    }

    public a(String str, int i, int i2) {
        this.f76101d = str;
        this.f76099b = i;
        this.f76100c = i2;
    }
}
