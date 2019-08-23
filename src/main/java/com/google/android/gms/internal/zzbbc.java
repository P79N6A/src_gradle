package com.google.android.gms.internal;

import android.app.Dialog;
import android.os.Looper;
import com.ss.android.ugc.aweme.g.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class zzbbc extends zzbdk {
    private /* synthetic */ Dialog zzaBT;
    private /* synthetic */ zzbbb zzaBU;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
            if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                dialog.dismiss();
                return;
            }
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    zzbbc(zzbbb zzbbb, Dialog dialog) {
        this.zzaBU = zzbbb;
        this.zzaBT = dialog;
    }

    public final void zzpA() {
        this.zzaBU.zzaBS.zzpx();
        if (this.zzaBT.isShowing()) {
            _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(this.zzaBT);
        }
    }
}
