package com.bytedance.android.livesdk.sticker.ui;

import android.view.View;
import com.bytedance.android.livesdk.sticker.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17372a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveGestureMagicAdapter f17373b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17374c;

    a(LiveGestureMagicAdapter liveGestureMagicAdapter, int i) {
        this.f17373b = liveGestureMagicAdapter;
        this.f17374c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17372a, false, 13441, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17372a, false, 13441, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveGestureMagicAdapter liveGestureMagicAdapter = this.f17373b;
        int i = this.f17374c;
        if (liveGestureMagicAdapter.g) {
            com.bytedance.android.livesdk.sticker.b.a aVar = liveGestureMagicAdapter.f17318e.get(i);
            if (liveGestureMagicAdapter.f17317d == null || !liveGestureMagicAdapter.f17317d.a(aVar)) {
                if (!liveGestureMagicAdapter.f17315b.a(aVar)) {
                    liveGestureMagicAdapter.f17319f = aVar;
                    liveGestureMagicAdapter.f17315b.a(com.bytedance.android.livesdk.sticker.c.a.f17261b, aVar, (a.C0122a) liveGestureMagicAdapter);
                } else {
                    if (!(liveGestureMagicAdapter.f17317d == null || liveGestureMagicAdapter.f17317d.f17252d == aVar.f17252d || liveGestureMagicAdapter.f17316c == null)) {
                        liveGestureMagicAdapter.f17316c.a(Boolean.FALSE, liveGestureMagicAdapter.f17317d);
                    }
                    com.bytedance.android.livesdk.sticker.b.a aVar2 = liveGestureMagicAdapter.f17317d;
                    liveGestureMagicAdapter.f17317d = aVar;
                    if (aVar2 != null && liveGestureMagicAdapter.f17318e.contains(aVar2)) {
                        int indexOf = liveGestureMagicAdapter.f17318e.indexOf(aVar2);
                        if (indexOf >= 0) {
                            liveGestureMagicAdapter.notifyItemChanged(indexOf);
                        }
                    }
                    if (liveGestureMagicAdapter.f17316c != null) {
                        liveGestureMagicAdapter.f17316c.a(Boolean.TRUE, liveGestureMagicAdapter.f17317d);
                    }
                }
                liveGestureMagicAdapter.a(aVar);
                liveGestureMagicAdapter.notifyItemChanged(i);
            }
        }
    }
}
