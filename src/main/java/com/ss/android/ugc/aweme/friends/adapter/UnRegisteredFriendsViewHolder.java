package com.ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.following.ui.view.FollowAndInviteUserBtn;
import com.ss.android.ugc.aweme.friends.a.a;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.profile.model.User;

public class UnRegisteredFriendsViewHolder<T extends User> extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48778a;

    /* renamed from: b  reason: collision with root package name */
    final View f48779b;

    /* renamed from: c  reason: collision with root package name */
    Context f48780c;

    /* renamed from: d  reason: collision with root package name */
    public T f48781d;

    /* renamed from: e  reason: collision with root package name */
    int f48782e;

    /* renamed from: f  reason: collision with root package name */
    a f48783f;
    AvatarImageWithVerify g;
    TextView h;
    public FollowAndInviteUserBtn i;
    ViewGroup j;

    public static Friend a(T t) {
        if (t instanceof Friend) {
            return (Friend) t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48778a, false, 46367, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48778a, false, 46367, new Class[]{Integer.TYPE}, String.class);
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

    public UnRegisteredFriendsViewHolder(View view, a aVar) {
        super(view);
        this.f48780c = view.getContext();
        this.g = (AvatarImageWithVerify) view.findViewById(C0906R.id.ayr);
        this.h = (TextView) view.findViewById(C0906R.id.dnq);
        this.i = (FollowAndInviteUserBtn) view.findViewById(C0906R.id.dmz);
        this.f48779b = view.findViewById(C0906R.id.do8);
        this.j = (ViewGroup) view.findViewById(C0906R.id.ait);
        this.f48783f = aVar;
        this.i.setOnClickListener(new r(this));
        this.f48779b.setOnClickListener(new s(this));
        ((GenericDraweeHierarchy) this.g.getAvatarImageView().getHierarchy()).setPlaceholderImage(2130839027);
    }
}
