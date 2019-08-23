package com.bytedance.android.livesdk.feed.live;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.livesdk.feed.l.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14274a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseLiveViewHolder f14275b;

    i(BaseLiveViewHolder baseLiveViewHolder) {
        this.f14275b = baseLiveViewHolder;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14274a, false, 8727, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14274a, false, 8727, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Throwable th = (Throwable) obj;
        Context context = this.f14275b.itemView.getContext();
        if (PatchProxy.isSupport(new Object[]{context, th}, null, b.f14219a, true, 8970, new Class[]{Context.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, th}, null, b.f14219a, true, 8970, new Class[]{Context.class, Throwable.class}, Void.TYPE);
            return;
        }
        if (th instanceof a) {
            a aVar = (a) th;
            String alert = aVar.getAlert();
            String prompt = aVar.getPrompt();
            if (!TextUtils.isEmpty(alert)) {
                String string = context.getResources().getString(C0906R.string.crx);
                if (PatchProxy.isSupport(new Object[]{context, alert, string}, null, b.f14219a, true, 8973, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, alert, string}, null, b.f14219a, true, 8973, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
                } else if (context != null) {
                    b.a aVar2 = new b.a(context);
                    aVar2.a((CharSequence) context.getResources().getString(C0906R.string.cu2));
                    aVar2.b((CharSequence) alert);
                    aVar2.a((CharSequence) string, (DialogInterface.OnClickListener) null);
                    aVar2.a().show();
                }
            } else if (!TextUtils.isEmpty(prompt)) {
                com.bytedance.android.live.uikit.d.a.a(context, prompt);
            }
            return;
        }
        com.bytedance.android.live.uikit.d.a.a(context, (int) C0906R.string.ctq);
    }
}
