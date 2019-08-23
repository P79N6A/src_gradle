package com.ss.android.ugc.aweme.common.widget.datepicker;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker;
import java.util.Calendar;
import java.util.Date;

public class DatePicker extends LinearLayout implements NumberPicker.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40534a;

    /* renamed from: b  reason: collision with root package name */
    private NumberPicker f40535b;

    /* renamed from: c  reason: collision with root package name */
    private NumberPicker f40536c;

    /* renamed from: d  reason: collision with root package name */
    private NumberPicker f40537d;

    /* renamed from: e  reason: collision with root package name */
    private Calendar f40538e;

    /* renamed from: f  reason: collision with root package name */
    private Calendar f40539f;
    private a g;
    private LayoutInflater h;

    public interface a {
    }

    public int getDayOfMonth() {
        if (!PatchProxy.isSupport(new Object[0], this, f40534a, false, 33883, new Class[0], Integer.TYPE)) {
            return this.f40538e.get(5);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40534a, false, 33883, new Class[0], Integer.TYPE)).intValue();
    }

    public int getMonth() {
        if (!PatchProxy.isSupport(new Object[0], this, f40534a, false, 33882, new Class[0], Integer.TYPE)) {
            return this.f40538e.get(2) + 1;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40534a, false, 33882, new Class[0], Integer.TYPE)).intValue();
    }

    public int getYear() {
        if (!PatchProxy.isSupport(new Object[0], this, f40534a, false, 33881, new Class[0], Integer.TYPE)) {
            return this.f40538e.get(1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40534a, false, 33881, new Class[0], Integer.TYPE)).intValue();
    }

    public DatePicker(Context context) {
        this(context, null);
    }

    public void setSoundEffectsEnabled(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40534a, false, 33885, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40534a, false, 33885, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSoundEffectsEnabled(z);
        this.f40535b.setSoundEffectsEnabled(z);
        this.f40536c.setSoundEffectsEnabled(z);
        this.f40537d.setSoundEffectsEnabled(z);
    }

    public void setStartYear(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40534a, false, 33878, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40534a, false, 33878, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f40535b.b(i);
    }

    public void setUpperBoundDate(Calendar calendar) {
        if (PatchProxy.isSupport(new Object[]{calendar}, this, f40534a, false, 33893, new Class[]{Calendar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{calendar}, this, f40534a, false, 33893, new Class[]{Calendar.class}, Void.TYPE);
            return;
        }
        this.f40539f = calendar;
        if (calendar != null) {
            this.f40535b.c(this.f40539f.get(1));
            if (this.f40538e.get(1) == this.f40539f.get(1)) {
                this.f40536c.c(this.f40539f.get(2) + 1);
                if (this.f40538e.get(2) == this.f40539f.get(2)) {
                    this.f40537d.c(this.f40539f.get(5));
                }
            }
        }
    }

    public final DatePicker a(Date date) {
        if (PatchProxy.isSupport(new Object[]{date}, this, f40534a, false, 33877, new Class[]{Date.class}, DatePicker.class)) {
            return (DatePicker) PatchProxy.accessDispatch(new Object[]{date}, this, f40534a, false, 33877, new Class[]{Date.class}, DatePicker.class);
        }
        if (this.f40538e == null) {
            this.f40538e = Calendar.getInstance();
        }
        this.f40538e.setTime(date);
        this.f40535b.d(this.f40538e.get(1));
        if (this.f40538e.get(1) == Calendar.getInstance().get(1)) {
            this.f40536c.c(this.f40538e.get(2) + 1);
        } else {
            this.f40536c.c(this.f40538e.getActualMaximum(2) + 1);
        }
        this.f40536c.d(this.f40538e.get(2) + 1);
        this.f40537d.c(this.f40538e.getActualMaximum(5));
        this.f40537d.d(this.f40538e.get(5));
        return this;
    }

    public void setEnabled(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40534a, false, 33894, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40534a, false, 33894, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setEnabled(z);
        this.f40535b.setEnabled(z);
        this.f40536c.setEnabled(z);
        this.f40537d.setEnabled(z);
        int color = ContextCompat.getColor(getContext(), C0906R.color.i0);
        int color2 = ContextCompat.getColor(getContext(), C0906R.color.hl);
        if (!z) {
            color = Color.argb((int) (((float) Color.alpha(color)) * 0.34f), Color.red(color), Color.green(color), Color.blue(color));
            color2 = Color.argb((int) (((float) Color.alpha(color2)) * 0.34f), Color.red(color2), Color.green(color2), Color.blue(color2));
        }
        int i = color;
        int i2 = color2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40534a, false, 33889, new Class[]{Integer.TYPE}, DatePicker.class)) {
            DatePicker datePicker = (DatePicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40534a, false, 33889, new Class[]{Integer.TYPE}, DatePicker.class);
        } else {
            this.f40535b.f(i);
            this.f40536c.f(i);
            this.f40537d.f(i);
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40534a, false, 33890, new Class[]{Integer.TYPE}, DatePicker.class)) {
            DatePicker datePicker2 = (DatePicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40534a, false, 33890, new Class[]{Integer.TYPE}, DatePicker.class);
        } else {
            this.f40535b.g(i);
            this.f40536c.g(i);
            this.f40537d.g(i);
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40534a, false, 33891, new Class[]{Integer.TYPE}, DatePicker.class)) {
            DatePicker datePicker3 = (DatePicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40534a, false, 33891, new Class[]{Integer.TYPE}, DatePicker.class);
        } else {
            this.f40535b.h(i2);
            this.f40536c.h(i2);
            this.f40537d.h(i2);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = (LayoutInflater) context.getSystemService("layout_inflater");
        if (PatchProxy.isSupport(new Object[0], this, f40534a, false, 33876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40534a, false, 33876, new Class[0], Void.TYPE);
            return;
        }
        this.h.inflate(C0906R.layout.hz, this, true);
        this.f40535b = (NumberPicker) findViewById(C0906R.id.dya);
        this.f40536c = (NumberPicker) findViewById(C0906R.id.bng);
        this.f40537d = (NumberPicker) findViewById(C0906R.id.a2n);
        this.f40535b.a((NumberPicker.b) this);
        this.f40536c.a((NumberPicker.b) this);
        this.f40537d.a((NumberPicker.b) this);
        if (!getResources().getConfiguration().locale.getCountry().equals("CN") && !getResources().getConfiguration().locale.getCountry().equals("TW")) {
            this.f40536c.a(getResources().getStringArray(C0906R.array.q));
        }
        this.f40538e = Calendar.getInstance();
        a(this.f40538e.getTime());
    }

    public final void a(NumberPicker numberPicker, int i, int i2) {
        int i3;
        NumberPicker numberPicker2 = numberPicker;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{numberPicker2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f40534a, false, 33879, new Class[]{NumberPicker.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{numberPicker2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f40534a, false, 33879, new Class[]{NumberPicker.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (numberPicker2 == this.f40535b) {
            int i5 = this.f40538e.get(5);
            int i6 = this.f40538e.get(2);
            if (this.f40539f == null || i4 != this.f40539f.get(1)) {
                this.f40536c.c(this.f40538e.getActualMaximum(2) + 1);
            } else {
                if (i6 > this.f40539f.get(2)) {
                    i6 = this.f40539f.get(2);
                }
                this.f40536c.c(this.f40539f.get(2) + 1);
            }
            this.f40538e.set(i4, i6, 1);
            int actualMaximum = this.f40538e.getActualMaximum(5);
            if (this.f40539f != null && i4 == this.f40539f.get(1) && i6 == this.f40539f.get(2)) {
                i3 = this.f40539f.get(5);
            } else {
                i3 = actualMaximum;
            }
            if (i5 > i3) {
                i5 = i3;
            }
            this.f40538e.set(5, i5);
            this.f40537d.c(i3);
        } else if (numberPicker2 == this.f40536c) {
            int i7 = this.f40538e.get(5);
            int i8 = i4 - 1;
            this.f40538e.set(this.f40538e.get(1), i8, 1);
            int actualMaximum2 = this.f40538e.getActualMaximum(5);
            if (this.f40539f != null && this.f40538e.get(1) == this.f40539f.get(1) && i8 == this.f40539f.get(2)) {
                actualMaximum2 = this.f40539f.get(5);
            }
            if (i7 > actualMaximum2) {
                i7 = actualMaximum2;
            }
            this.f40538e.set(5, i7);
            this.f40537d.c(actualMaximum2);
        } else if (numberPicker2 == this.f40537d) {
            this.f40538e.set(5, i4);
        }
        if (PatchProxy.isSupport(new Object[0], this, f40534a, false, 33880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40534a, false, 33880, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            getYear();
            getMonth();
            getDayOfMonth();
        }
    }
}
