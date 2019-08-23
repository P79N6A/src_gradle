package com.ss.android.ugc.aweme.property;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.g;

public final class b extends com.bytedance.ies.dmt.ui.widget.setting.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63264a;

    /* renamed from: b  reason: collision with root package name */
    DmtEditText f63265b;

    /* renamed from: c  reason: collision with root package name */
    a.C0682a f63266c;

    /* renamed from: d  reason: collision with root package name */
    d f63267d;

    static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63270a;

        /* renamed from: b  reason: collision with root package name */
        a.C0682a f63271b;

        public a(a.C0682a aVar) {
            this.f63271b = aVar;
        }

        public final void a(String str) throws IllegalArgumentException {
            if (PatchProxy.isSupport(new Object[]{str}, this, f63270a, false, 70197, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f63270a, false, 70197, new Class[]{String.class}, Void.TYPE);
                return;
            }
            float floatValue = Float.valueOf(str).floatValue();
            if (this.f63271b.valueRange() == null || this.f63271b.valueRange().a(Float.valueOf(floatValue))) {
                com.ss.android.ugc.aweme.port.in.a.M.a(this.f63271b, floatValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.b$b  reason: collision with other inner class name */
    static class C0683b implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63272a;

        /* renamed from: b  reason: collision with root package name */
        a.C0682a f63273b;

        public C0683b(a.C0682a aVar) {
            this.f63273b = aVar;
        }

        public final void a(String str) throws NumberFormatException, IllegalArgumentException {
            if (PatchProxy.isSupport(new Object[]{str}, this, f63272a, false, 70198, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f63272a, false, 70198, new Class[]{String.class}, Void.TYPE);
                return;
            }
            int intValue = Integer.valueOf(str).intValue();
            if (this.f63273b.valueRange() == null || this.f63273b.valueRange().a(Integer.valueOf(intValue))) {
                com.ss.android.ugc.aweme.port.in.a.M.a(this.f63273b, intValue);
            }
        }
    }

    static class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63274a;

        /* renamed from: b  reason: collision with root package name */
        a.C0682a f63275b;

        public c(a.C0682a aVar) {
            this.f63275b = aVar;
        }

        public final void a(String str) throws IllegalArgumentException {
            if (PatchProxy.isSupport(new Object[]{str}, this, f63274a, false, 70199, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f63274a, false, 70199, new Class[]{String.class}, Void.TYPE);
                return;
            }
            long longValue = Long.valueOf(str).longValue();
            if (this.f63275b.valueRange() == null || this.f63275b.valueRange().a(Long.valueOf(longValue))) {
                com.ss.android.ugc.aweme.port.in.a.M.a(this.f63275b, longValue);
            }
        }
    }

    interface d {
        void a(String str) throws NumberFormatException, IllegalArgumentException;
    }

    public final int getRightLayoutId() {
        return C0906R.layout.f5;
    }

    public b(Context context) {
        super(context);
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f63264a, false, 70194, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f63264a, false, 70194, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.a(context);
        this.f63265b = (DmtEditText) this.h.getChildAt(0);
    }

    public final void setAVABProperty(@NonNull a.C0682a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63264a, false, 70195, new Class[]{a.C0682a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f63264a, false, 70195, new Class[]{a.C0682a.class}, Void.TYPE);
        } else if (aVar == null) {
            throw new NullPointerException();
        } else if (aVar.type() == g.b.Float || aVar.type() == g.b.Integer || aVar.type() == g.b.Long) {
            this.f63266c = aVar;
            if (aVar.type() == g.b.Float) {
                this.f63265b.setText(String.valueOf(com.ss.android.ugc.aweme.port.in.a.M.d(aVar)));
                this.f63267d = new a(aVar);
            }
            if (aVar.type() == g.b.Integer) {
                this.f63265b.setText(String.valueOf(com.ss.android.ugc.aweme.port.in.a.M.b(aVar)));
                this.f63267d = new C0683b(aVar);
            }
            if (aVar.type() == g.b.Long) {
                this.f63265b.setText(String.valueOf(com.ss.android.ugc.aweme.port.in.a.M.c(aVar)));
                this.f63267d = new c(aVar);
            }
            setStartText(aVar.key());
            this.f63265b.addTextChangedListener(new TextWatcher() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63268a;

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    if (PatchProxy.isSupport(new Object[]{editable}, this, f63268a, false, 70196, new Class[]{Editable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{editable}, this, f63268a, false, 70196, new Class[]{Editable.class}, Void.TYPE);
                        return;
                    }
                    if (editable.toString().endsWith("\n")) {
                        try {
                            editable.delete(editable.length() - 1, editable.length());
                            b.this.f63267d.a(editable.toString());
                        } catch (NumberFormatException unused) {
                            com.bytedance.ies.dmt.ui.d.a.b(b.this.getContext(), "参数格式错误").a();
                        } catch (IllegalArgumentException unused2) {
                            com.bytedance.ies.dmt.ui.d.a.b(b.this.getContext(), "参数区间错误").a();
                        }
                    }
                }
            });
        } else {
            throw new IllegalArgumentException();
        }
    }
}
