package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class e extends Dialog {
    public static ChangeQuickRedirect h;
    protected boolean i;

    public abstract int a();

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 14354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 14354, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.i = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 14355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 14355, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.i = false;
    }

    public e(@NonNull Context context) {
        super(context, C0906R.style.vm);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, h, false, 14353, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, h, false, 14353, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(a(), null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
    }
}
