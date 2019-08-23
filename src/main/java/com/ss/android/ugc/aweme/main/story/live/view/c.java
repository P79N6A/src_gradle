package com.ss.android.ugc.aweme.main.story.live.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.live.b;

public final class c extends AbsLiveStoryItemView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54993a;

    /* renamed from: e  reason: collision with root package name */
    private String f54994e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f54995f;

    public final void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54993a, false, 58304, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54993a, false, 58304, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.f54995f) {
            str = "toplist_homepage_follow";
        } else {
            str = this.f54989d;
        }
        b.b(str);
        Bundle bundle = new Bundle();
        bundle.putString("request_id", this.f54988c);
        bundle.putString("style", "head");
        bundle.putString("position", "live_merge");
        bundle.putString("toplist_page", str);
        bundle.putInt("tab_type", 0);
        com.ss.android.ugc.aweme.story.live.c.a().a(getContext(), bundle);
    }

    public c(Context context, boolean z) {
        super(context, z);
        String str;
        if (z) {
            str = "homepage_follow";
        } else {
            str = "homepage_hot";
        }
        this.f54994e = str;
        this.f54995f = z;
    }

    public final View a(Context context, boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f54993a, false, 58303, new Class[]{Context.class, Boolean.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f54993a, false, 58303, new Class[]{Context.class, Boolean.TYPE}, View.class);
        }
        LayoutInflater from = LayoutInflater.from(context);
        if (z) {
            i = C0906R.layout.w6;
        } else {
            i = C0906R.layout.w7;
        }
        return from.inflate(i, this, true);
    }
}
