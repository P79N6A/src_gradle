package com.ss.android.ugc.aweme.main.story.live.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.live.c;

public final class b extends AbsLiveStoryItemView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54990a;

    /* renamed from: e  reason: collision with root package name */
    private String f54991e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f54992f;

    public final void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54990a, false, 58302, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54990a, false, 58302, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.f54992f) {
            str = "toplist_homepage_follow";
        } else {
            str = this.f54989d;
        }
        com.ss.android.ugc.aweme.story.live.b.b(str);
        Bundle bundle = new Bundle();
        bundle.putString("request_id", this.f54988c);
        bundle.putString("style", "head");
        bundle.putString("position", "live_merge");
        bundle.putString("toplist_page", str);
        bundle.putInt("tab_type", 0);
        c.a().a(getContext(), bundle);
    }

    public b(Context context, boolean z) {
        super(context, z);
        String str;
        if (z) {
            str = "homepage_follow";
        } else {
            str = "homepage_hot";
        }
        this.f54991e = str;
        this.f54992f = z;
    }

    public final View a(Context context, boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f54990a, false, 58301, new Class[]{Context.class, Boolean.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f54990a, false, 58301, new Class[]{Context.class, Boolean.TYPE}, View.class);
        }
        LayoutInflater from = LayoutInflater.from(context);
        if (z) {
            i = C0906R.layout.w5;
        } else {
            i = C0906R.layout.w4;
        }
        return from.inflate(i, this, true);
    }
}
