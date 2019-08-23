package com.bytedance.android.live.core.setting;

import android.view.View;
import com.bytedance.android.live.core.rxutils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.util.ExceptionHelper;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8156a;

    /* renamed from: b  reason: collision with root package name */
    private final ABTestDialog f8157b;

    a(ABTestDialog aBTestDialog) {
        this.f8157b = aBTestDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f8156a, false, 883, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f8156a, false, 883, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ABTestDialog aBTestDialog = this.f8157b;
        m.a(aBTestDialog.f8127c, "");
        Consumer<Integer> consumer = aBTestDialog.f8129e;
        Integer valueOf = Integer.valueOf(aBTestDialog.f8128d);
        if (PatchProxy.isSupport(new Object[]{consumer, valueOf}, null, i.f8106a, true, 643, new Class[]{Consumer.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{consumer, valueOf}, null, i.f8106a, true, 643, new Class[]{Consumer.class, Object.class}, Void.TYPE);
        } else {
            try {
                consumer.accept(valueOf);
            } catch (Throwable th) {
                throw ExceptionHelper.wrapOrThrow(th);
            }
        }
        aBTestDialog.dismiss();
    }
}
