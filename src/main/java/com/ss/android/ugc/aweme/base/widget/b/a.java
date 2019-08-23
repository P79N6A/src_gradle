package com.ss.android.ugc.aweme.base.widget.b;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.e;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.t;

public class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35119a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35120b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f35121c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35122d;

    public static a a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, null, f35119a, true, 25617, new Class[]{View.OnClickListener.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{onClickListener2}, null, f35119a, true, 25617, new Class[]{View.OnClickListener.class}, a.class);
        }
        if (PatchProxy.isSupport(new Object[]{onClickListener2, (byte) 1}, null, f35119a, true, 25618, new Class[]{View.OnClickListener.class, Boolean.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{onClickListener2, (byte) 1}, null, f35119a, true, 25618, new Class[]{View.OnClickListener.class, Boolean.TYPE}, a.class);
        } else if (onClickListener2 == null) {
            return null;
        } else {
            return new a(onClickListener2, e.f35018a);
        }
    }

    public final void onClick(View view) {
        int i;
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f35119a, false, 25616, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f35119a, false, 25616, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!this.f35122d) {
            this.f35121c.onClick(view2);
        } else if (!this.f35120b) {
            this.f35120b = true;
            AnonymousClass1 r0 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35123a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f35123a, false, 25619, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f35123a, false, 25619, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.f35121c.onClick(view2);
                    a.this.f35120b = false;
                }
            };
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.integer.i)}, null, o.f35041a, true, 25261, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.integer.i)}, null, o.f35041a, true, 25261, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
            } else {
                i = o.a().getInteger(C0906R.integer.i);
            }
            long j = (long) i;
            if (PatchProxy.isSupport(new Object[]{r0, new Long(j)}, null, t.f35051a, true, 25296, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r0, new Long(j)}, null, t.f35051a, true, 25296, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE);
            } else {
                Object[] objArr = {r0, new Long(j)};
                if (PatchProxy.isSupport(objArr, null, t.f35051a, true, 25293, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{r0, new Long(j)}, null, t.f35051a, true, 25293, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE);
                } else {
                    t.a().postDelayed(r0, j);
                }
            }
        }
    }

    private a(View.OnClickListener onClickListener, boolean z) {
        this.f35121c = onClickListener;
        this.f35122d = z;
    }
}
