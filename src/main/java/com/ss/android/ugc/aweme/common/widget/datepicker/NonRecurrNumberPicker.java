package com.ss.android.ugc.aweme.common.widget.datepicker;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker;

public class NonRecurrNumberPicker extends NumberPicker {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40540a;

    /* renamed from: b  reason: collision with root package name */
    int f40541b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40540a, false, 33895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40540a, false, 33895, new Class[0], Void.TYPE);
            return;
        }
        this.f40541b = this.k.length / 2;
        for (int i = 0; i < this.k.length; i++) {
            this.k[i] = new NumberPicker.a((this.A - 3) + i, this.l + (this.K * i));
        }
    }

    public NonRecurrNumberPicker(Context context) {
        super(context);
    }

    public final void a(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40540a, false, 33896, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40540a, false, 33896, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.A == 0 && this.k[this.f40541b].f40550b + i > this.f40547e / 2) {
            i2 = (this.f40547e / 2) - this.k[this.f40541b].f40550b;
        } else if (this.A != this.z.length - 1 || this.k[this.f40541b].f40550b + i >= this.f40547e / 2) {
            i2 = i;
        } else {
            i2 = (this.f40547e / 2) - this.k[this.f40541b].f40550b;
        }
        for (int i3 = 0; i3 < this.k.length; i3++) {
            this.k[i3].f40550b += i2;
            if (this.k[i3].f40550b >= this.m + this.K) {
                this.k[i3].f40550b -= (this.O + 2) * this.K;
                this.k[i3].f40549a -= this.O + 2;
            }
            if (this.k[i3].f40550b <= this.l - this.K) {
                this.k[i3].f40550b += (this.O + 2) * this.K;
                this.k[i3].f40549a += this.O + 2;
            }
            if (Math.abs(this.k[i3].f40550b - (this.f40547e / 2)) < this.K / 4) {
                int i4 = this.s;
                if (this.k[i3].f40549a >= 0 && this.k[i3].f40549a < this.z.length) {
                    this.f40541b = i3;
                    this.A = this.k[i3].f40549a;
                    this.s = this.z[this.A];
                }
                if (i4 != this.s) {
                    if (this.M != null) {
                        this.M.a(this, i4, this.s);
                    }
                    if (this.P != null && this.Q) {
                        this.P.a();
                    }
                }
            }
        }
    }

    public NonRecurrNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonRecurrNumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
