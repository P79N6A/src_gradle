package com.bytedance.android.livesdkapi.k.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18828a;

    /* renamed from: b  reason: collision with root package name */
    public char[] f18829b;

    /* renamed from: c  reason: collision with root package name */
    public int f18830c;

    public final String toString() {
        if (!PatchProxy.isSupport(new Object[0], this, f18828a, false, 15139, new Class[0], String.class)) {
            return new String(this.f18829b, 0, this.f18830c);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f18828a, false, 15139, new Class[0], String.class);
    }

    public b(int i) {
        if (i >= 0) {
            this.f18829b = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18828a, false, 15124, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18828a, false, 15124, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        char[] cArr = new char[Math.max(this.f18829b.length << 1, i)];
        System.arraycopy(this.f18829b, 0, cArr, 0, this.f18830c);
        this.f18829b = cArr;
    }

    public final void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f18828a, false, 15126, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f18828a, false, 15126, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str == null) {
            str2 = "null";
        } else {
            str2 = str;
        }
        int length = str2.length();
        int i = this.f18830c + length;
        if (i > this.f18829b.length) {
            a(i);
        }
        str2.getChars(0, length, this.f18829b, this.f18830c);
        this.f18830c = i;
    }
}
