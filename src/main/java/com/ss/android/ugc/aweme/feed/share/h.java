package com.ss.android.ugc.aweme.feed.share;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class h implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46054a;

    public final String a() {
        return "com.ss.android.article.news";
    }

    public final String b() {
        return "今日头条";
    }

    public final String a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f46054a, false, 42105, new Class[]{Context.class}, String.class)) {
            return context2.getString(C0906R.string.coa);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, f46054a, false, 42105, new Class[]{Context.class}, String.class);
    }
}
