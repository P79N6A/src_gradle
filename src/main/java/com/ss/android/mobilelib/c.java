package com.ss.android.mobilelib;

import android.content.Context;
import android.widget.EditText;
import com.bytedance.common.utility.UIUtils;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f30083a;

    /* renamed from: b  reason: collision with root package name */
    private List<b> f30084b = new LinkedList();

    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<EditText> f30085a;

        /* renamed from: b  reason: collision with root package name */
        private int f30086b;

        public final boolean a() {
            if (this.f30085a.get() == null || ((EditText) this.f30085a.get()).getText().toString().length() <= 0) {
                return false;
            }
            return true;
        }

        public final void a(Context context) {
            UIUtils.displayToast(context, this.f30086b, 17);
        }

        public a(EditText editText, int i) {
            this.f30085a = new WeakReference<>(editText);
            this.f30086b = i;
        }
    }

    public interface b {
        void a(Context context);

        boolean a();
    }

    public final boolean a() {
        if (this.f30083a.get() == null) {
            return false;
        }
        for (b next : this.f30084b) {
            if (!next.a()) {
                next.a((Context) this.f30083a.get());
                return false;
            }
        }
        return true;
    }

    public static c a(Context context) {
        return new c(context);
    }

    private c(Context context) {
        this.f30083a = new WeakReference<>(context);
    }

    public final c a(EditText editText, int i) {
        this.f30084b.add(new a(editText, i));
        return this;
    }
}
