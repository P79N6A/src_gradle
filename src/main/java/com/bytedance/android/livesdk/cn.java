package com.bytedance.android.livesdk;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.livesdk.chatroom.model.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cn implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13576a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13577b;

    cn(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13577b = startLiveFragmentDefault;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13576a, false, 2963, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13576a, false, 2963, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f13577b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null)) {
            switch (((a) dVar.f7871b).f11015a) {
                case 0:
                    startLiveFragmentDefault.o.setText(startLiveFragmentDefault.getString(C0906R.string.d12));
                    startLiveFragmentDefault.o.setAlpha(1.0f);
                    k.a(startLiveFragmentDefault.n, ((a) dVar.f7871b).f11016b);
                    return;
                case 1:
                    startLiveFragmentDefault.o.setText(startLiveFragmentDefault.getString(C0906R.string.d11));
                    startLiveFragmentDefault.o.setAlpha(1.0f);
                    k.a(startLiveFragmentDefault.n, ((a) dVar.f7871b).f11016b);
                    return;
                default:
                    startLiveFragmentDefault.o.setText(startLiveFragmentDefault.getString(C0906R.string.d10));
                    startLiveFragmentDefault.o.setAlpha(0.64f);
                    break;
            }
        }
    }
}
