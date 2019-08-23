package com.ss.android.ugc.aweme.video.hashtag;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.port.in.a;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76107a;

    /* renamed from: b  reason: collision with root package name */
    private final HashTagListAdapter f76108b;

    /* renamed from: c  reason: collision with root package name */
    private final b f76109c;

    /* renamed from: d  reason: collision with root package name */
    private final int f76110d;

    c(HashTagListAdapter hashTagListAdapter, b bVar, int i) {
        this.f76108b = hashTagListAdapter;
        this.f76109c = bVar;
        this.f76110d = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f76107a, false, 89096, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76107a, false, 89096, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        HashTagListAdapter hashTagListAdapter = this.f76108b;
        b bVar = this.f76109c;
        int i = this.f76110d;
        if (bVar != null) {
            if (hashTagListAdapter.f76089c != null) {
                if (!TextUtils.isEmpty(hashTagListAdapter.f76091e) || hashTagListAdapter.f76092f != null) {
                    r.a("add_tag", new t().a("search_keyword", hashTagListAdapter.f76091e).a("tag_id", bVar.f76102a.getCid()).a("log_pb", a.f61120c.toJson((Object) hashTagListAdapter.f76092f)).a());
                }
                hashTagListAdapter.f76089c.a(bVar.f76102a);
            }
            if (bVar.f76106e != null) {
                bVar.f76106e.b(hashTagListAdapter.f76088b, i);
            }
        }
    }
}
