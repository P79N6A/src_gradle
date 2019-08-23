package com.bytedance.android.livesdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ac<E> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17565a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f17566b = new Object[(this.f17567c + 1)];

    /* renamed from: c  reason: collision with root package name */
    public int f17567c;

    /* renamed from: d  reason: collision with root package name */
    public int f17568d;

    /* renamed from: e  reason: collision with root package name */
    public a f17569e;

    public interface a<E> {
        boolean a(E e2, E e3);
    }

    public final void b() {
        for (int i = 0; i < this.f17568d; i++) {
            this.f17566b[i] = null;
        }
        this.f17568d = 0;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17565a, false, 13714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17565a, false, 13714, new Class[0], Void.TYPE);
            return;
        }
        int i = 2;
        int i2 = 1;
        while (i <= this.f17568d) {
            int i3 = i + 1;
            if (i3 <= this.f17568d && this.f17569e.a(this.f17566b[i3], this.f17566b[i])) {
                i = i3;
            }
            if (!this.f17569e.a(this.f17566b[i], this.f17566b[i2])) {
                break;
            }
            a(i2, i);
            i2 = i;
            i *= 2;
        }
    }

    public final boolean a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17565a, false, 13717, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f17565a, false, 13717, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        int i = 0;
        while (i < this.f17568d) {
            i++;
            if (this.f17566b[i].equals(obj)) {
                Object[] objArr = this.f17566b;
                int i2 = this.f17568d;
                this.f17568d = i2 - 1;
                objArr[i] = objArr[i2];
                a();
                return true;
            }
        }
        return false;
    }

    public ac(int i, a aVar) {
        this.f17567c = i;
        this.f17569e = aVar;
    }

    public final void a(int i, int i2) {
        Object obj = this.f17566b[i];
        Object[] objArr = this.f17566b;
        objArr[i] = objArr[i2];
        this.f17566b[i2] = obj;
    }
}
