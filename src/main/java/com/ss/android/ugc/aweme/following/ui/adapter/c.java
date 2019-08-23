package com.ss.android.ugc.aweme.following.ui.adapter;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.ui.a;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48128a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowingAdapter.ViewHolder f48129b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f48130c;

    /* renamed from: d  reason: collision with root package name */
    private final User f48131d;

    /* renamed from: e  reason: collision with root package name */
    private final Resources f48132e;

    c(FollowingAdapter.ViewHolder viewHolder, CharSequence[] charSequenceArr, User user, Resources resources) {
        this.f48129b = viewHolder;
        this.f48130c = charSequenceArr;
        this.f48131d = user;
        this.f48132e = resources;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48128a, false, 45117, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48128a, false, 45117, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FollowingAdapter.ViewHolder viewHolder = this.f48129b;
        CharSequence[] charSequenceArr = this.f48130c;
        User user = this.f48131d;
        Resources resources = this.f48132e;
        a aVar = new a(view.getContext());
        aVar.a(charSequenceArr, (DialogInterface.OnClickListener) new d(viewHolder, view, user, resources));
        aVar.b();
    }
}
