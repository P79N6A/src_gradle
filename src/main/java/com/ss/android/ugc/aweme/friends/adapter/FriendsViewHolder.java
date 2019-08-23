package com.ss.android.ugc.aweme.friends.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.view.FollowAndInviteUserBtn;
import com.ss.android.ugc.aweme.friends.a.a;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public class FriendsViewHolder<T extends User> extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48732a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f48733b;

    /* renamed from: c  reason: collision with root package name */
    Context f48734c;

    /* renamed from: d  reason: collision with root package name */
    public T f48735d;

    /* renamed from: e  reason: collision with root package name */
    int f48736e;

    /* renamed from: f  reason: collision with root package name */
    a f48737f;
    AvatarImageWithVerify g;
    TextView h;
    TextView i;
    public FollowAndInviteUserBtn j;
    ViewGroup k;
    TextView l;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48732a, false, 46312, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48732a, false, 46312, new Class[0], Void.TYPE);
        } else if (this.f48735d != null) {
            this.j.a(this.f48735d.getFollowStatus(), this.f48735d.getFollowerStatus());
        }
    }

    public static Friend a(T t) {
        if (t instanceof Friend) {
            return (Friend) t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48732a, false, 46309, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48732a, false, 46309, new Class[]{Integer.TYPE}, String.class);
        }
        switch (i2) {
            case 0:
                if (com.ss.android.g.a.a()) {
                    return "contact_friend";
                }
                return "phone_number";
            case 1:
                return "weibo";
            case 2:
                return "twitter";
            case 3:
                return "facebook";
            case 4:
                return "vk";
            default:
                return "";
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48732a, false, 46311, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48732a, false, 46311, new Class[]{String.class}, Void.TYPE);
        } else if (this.f48735d != null && !TextUtils.isEmpty(this.f48735d.getUid())) {
            r.a(this.f48734c, str, a(this.f48736e), this.f48735d.getUid(), 0);
            r.a("enter_personal_detail", (Map) d.a().a("enter_from", a(this.f48736e)).a("enter_method", str).a("to_user_id", this.f48735d.getUid()).a("author_id", "").a("group_id", "").a("request_id", "").f34114b);
            h.a().a((Activity) this.f48734c, j.a("aweme://user/profile/" + this.f48735d.getUid()).a("sec_user_id", this.f48735d.getSecUid()).a("from_discover", a(this.f48736e)).a());
        }
    }

    public FriendsViewHolder(View view, a aVar, boolean z) {
        super(view);
        this.f48733b = z;
        this.f48734c = view.getContext();
        this.g = (AvatarImageWithVerify) view.findViewById(C0906R.id.ayr);
        this.h = (TextView) view.findViewById(C0906R.id.dnq);
        this.i = (TextView) view.findViewById(C0906R.id.dn1);
        this.j = (FollowAndInviteUserBtn) view.findViewById(C0906R.id.dmz);
        this.k = (ViewGroup) view.findViewById(C0906R.id.ait);
        this.f48737f = aVar;
        this.j.setOnClickListener(new h(this));
        this.g.setOnClickListener(new i(this));
        this.h.setOnClickListener(new j(this));
        this.k.setOnClickListener(new k(this));
        if (com.ss.android.g.a.a()) {
            ((GenericDraweeHierarchy) this.g.getAvatarImageView().getHierarchy()).setPlaceholderImage(2130838679);
            this.l = (TextView) view.findViewById(C0906R.id.au4);
            return;
        }
        ((GenericDraweeHierarchy) this.g.getAvatarImageView().getHierarchy()).setPlaceholderImage(2130839027);
    }
}
