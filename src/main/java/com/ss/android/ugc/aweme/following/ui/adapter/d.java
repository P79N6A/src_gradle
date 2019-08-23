package com.ss.android.ugc.aweme.following.ui.adapter;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.Map;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48133a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowingAdapter.ViewHolder f48134b;

    /* renamed from: c  reason: collision with root package name */
    private final View f48135c;

    /* renamed from: d  reason: collision with root package name */
    private final User f48136d;

    /* renamed from: e  reason: collision with root package name */
    private final Resources f48137e;

    d(FollowingAdapter.ViewHolder viewHolder, View view, User user, Resources resources) {
        this.f48134b = viewHolder;
        this.f48135c = view;
        this.f48136d = user;
        this.f48137e = resources;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48133a, false, 45118, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48133a, false, 45118, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        FollowingAdapter.ViewHolder viewHolder = this.f48134b;
        View view = this.f48135c;
        User user = this.f48136d;
        Resources resources = this.f48137e;
        if (i == 0) {
            r.a("click_remove_fans", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "fans").f34114b);
            a.C0185a a2 = new a.C0185a(view.getContext()).a((int) C0906R.string.bz3);
            if (com.ss.android.g.a.a()) {
                str = String.format(view.getResources().getString(C0906R.string.bz2), new Object[]{ex.b(user)});
            } else {
                str = view.getResources().getString(C0906R.string.bz2);
            }
            Dialog b2 = a2.b(str).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.bz1, (DialogInterface.OnClickListener) new e(viewHolder, user)).a().b();
            if (b2.findViewById(C0906R.id.dhn) instanceof TextView) {
                ((TextView) b2.findViewById(C0906R.id.dhn)).setTextColor(resources.getColor(C0906R.color.ho));
            }
        }
    }
}
