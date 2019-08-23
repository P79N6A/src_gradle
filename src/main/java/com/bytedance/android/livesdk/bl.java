package com.bytedance.android.livesdk;

import android.net.Uri;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.model.h;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bl implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9261a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9262b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9263c;

    bl(StartLiveFragmentD startLiveFragmentD, boolean z) {
        this.f9262b = startLiveFragmentD;
        this.f9263c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9261a, false, 2860, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9261a, false, 2860, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentD startLiveFragmentD = this.f9262b;
        boolean z = this.f9263c;
        d dVar = (d) obj;
        if (dVar != null && dVar.f7871b != null) {
            h hVar = (h) dVar.f7871b;
            if (hVar.f11123e != null && hVar.f11123e.f11124a) {
                String str = (String) LiveConfigSettingKeys.LIVE_NOTICE_URL.a();
                if (str != null && !str.isEmpty()) {
                    Uri parse = Uri.parse(str);
                    if (parse != null) {
                        String queryParameter = parse.getQueryParameter("width");
                        String queryParameter2 = parse.getQueryParameter("height");
                        if (queryParameter != null && queryParameter2 != null) {
                            try {
                                int parseInt = Integer.parseInt(queryParameter);
                                int parseInt2 = Integer.parseInt(queryParameter2);
                                Uri.Builder builder = new Uri.Builder();
                                builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).appendQueryParameter("type", z ? "live" : "upload").build();
                                String builder2 = builder.toString();
                                if (startLiveFragmentD.B != null) {
                                    startLiveFragmentD.B.dismissAllowingStateLoss();
                                    startLiveFragmentD.B = null;
                                }
                                startLiveFragmentD.B = j.q().f().a(c.a(builder2).a(parseInt).b(parseInt2).e(17));
                                if (startLiveFragmentD.B != null) {
                                    BaseDialogFragment.a((FragmentActivity) startLiveFragmentD.getContext(), (DialogFragment) startLiveFragmentD.B);
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            }
        }
    }
}
