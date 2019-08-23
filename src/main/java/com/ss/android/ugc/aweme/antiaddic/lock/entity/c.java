package com.ss.android.ugc.aweme.antiaddic.lock.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33453a;

    /* renamed from: b  reason: collision with root package name */
    public String f33454b;

    /* renamed from: c  reason: collision with root package name */
    public long f33455c;

    /* renamed from: d  reason: collision with root package name */
    public String f33456d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f33457e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f33458f;

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f33453a, false, 21849, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33453a, false, 21849, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f33454b != null) {
            i = this.f33454b.hashCode();
        }
        return i;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f33453a, false, 21850, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f33453a, false, 21850, new Class[0], String.class);
        }
        return "TimeLockUserSettingOld{userId='" + this.f33454b + '\'' + ", lastSetTime=" + this.f33455c + ", password='" + this.f33456d + '\'' + ", isTimeLockOn=" + this.f33457e + ", isContentFilterOn=" + this.f33458f + '}';
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f33453a, false, 21848, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f33453a, false, 21848, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f33454b != null) {
                return this.f33454b.equals(cVar.f33454b);
            }
            if (cVar.f33454b == null) {
                return true;
            }
            return false;
        }
    }
}
