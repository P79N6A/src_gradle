package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker;
import java.util.Calendar;

public class YearPickerDialog extends BottomSheetDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46364a;

    /* renamed from: b  reason: collision with root package name */
    public NumberPicker f46365b;

    /* renamed from: c  reason: collision with root package name */
    public a f46366c;

    public interface a {
        void a(int i, int i2);
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f46364a, false, 43374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46364a, false, 43374, new Class[0], Void.TYPE);
            return;
        }
        if (this.f46366c != null) {
            this.f46366c.a(0, this.f46365b.getCurrentNumber());
        }
        super.dismiss();
    }

    public YearPickerDialog(@NonNull Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f46364a, false, 43373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46364a, false, 43373, new Class[0], Void.TYPE);
            return;
        }
        setContentView((int) C0906R.layout.kx);
        this.f46365b = (NumberPicker) findViewById(C0906R.id.dya);
        this.f46365b.c(Calendar.getInstance().get(1));
        this.f46365b.a((NumberPicker.b) new NumberPicker.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46367a;

            public final void a(NumberPicker numberPicker, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{numberPicker, Integer.valueOf(i), Integer.valueOf(i2)}, this, f46367a, false, 43376, new Class[]{NumberPicker.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{numberPicker, Integer.valueOf(i), Integer.valueOf(i2)}, this, f46367a, false, 43376, new Class[]{NumberPicker.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                }
            }
        });
    }
}
