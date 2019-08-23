package com.bytedance.android.livesdk.livecommerce.dialog;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECBottomDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16187a;

    /* renamed from: b  reason: collision with root package name */
    public a f16188b;

    public interface a {
        boolean j();
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f16187a, false, 10669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16187a, false, 10669, new Class[0], Void.TYPE);
            return;
        }
        if (this.f16188b == null || !this.f16188b.j()) {
            if (PatchProxy.isSupport(new Object[0], this, f16187a, false, 10670, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16187a, false, 10670, new Class[0], Void.TYPE);
                return;
            }
            super.cancel();
        }
    }

    public ECBottomDialog(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f16187a, false, 10671, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.onTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f16187a, false, 10671, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public ECBottomDialog(Context context, int i) {
        super(context, C0906R.style.fq);
    }
}
