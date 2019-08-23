package com.ss.android.ugc.aweme.commercialize.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.ss.android.ugc.aweme.story.model.StoryResponse;
import java.util.Map;

public final class d extends AbsLiveStoryItemView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38657a;

    public d(Context context) {
        super(context, false);
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38657a, false, 30989, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38657a, false, 30989, new Class[]{View.class}, Void.TYPE);
            return;
        }
        StoryResponse.a aVar = b.f38654b;
        if (aVar != null) {
            Context context = getContext();
            if ((TextUtils.isEmpty(aVar.f73228c) || !g.a(context, aVar.f73228c, false)) && !TextUtils.isEmpty(aVar.f73229d)) {
                g.a(context, aVar.f73229d, aVar.f73230e);
            }
            r.a("click_skylight_entrance", (Map) null);
        }
    }

    public final View a(Context context, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f38657a, false, 30988, new Class[]{Context.class, Boolean.TYPE}, View.class)) {
            return LayoutInflater.from(context).inflate(C0906R.layout.t4, this, true);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f38657a, false, 30988, new Class[]{Context.class, Boolean.TYPE}, View.class);
    }
}
