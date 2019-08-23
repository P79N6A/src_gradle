package com.ss.android.ugc.aweme.filter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\u000f\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/Type;", "", "type", "", "constructor-impl", "(I)I", "getType", "()I", "equals", "", "other", "hashCode", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class bb {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47557a;

    /* renamed from: c  reason: collision with root package name */
    public static final int f47558c = a(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f47559d = a(0);

    /* renamed from: e  reason: collision with root package name */
    public static final a f47560e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final int f47561b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/Type$Companion;", "", "()V", "INSERT", "Lcom/ss/android/ugc/aweme/filter/Type;", "getINSERT", "()I", "I", "REMOVE", "getREMOVE", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static int a(int i) {
        return i;
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f47557a, false, 44439, new Class[0], Integer.TYPE)) {
            return this.f47561b;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47557a, false, 44439, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f47557a, false, 44436, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47557a, false, 44436, new Class[0], String.class);
        }
        int i = this.f47561b;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f47557a, true, 44437, new Class[]{Integer.TYPE}, String.class)) {
            return String.valueOf(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f47557a, true, 44437, new Class[]{Integer.TYPE}, String.class);
    }

    public final boolean equals(Object obj) {
        boolean z;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f47557a, false, 44440, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f47557a, false, 44440, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        int i = this.f47561b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj2}, null, f47557a, true, 44438, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj2}, null, f47557a, true, 44438, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (obj2 instanceof bb) {
            if (i == ((bb) obj2).f47561b) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
