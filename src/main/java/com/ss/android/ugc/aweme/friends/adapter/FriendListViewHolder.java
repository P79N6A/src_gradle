package com.ss.android.ugc.aweme.friends.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.FriendListFragment;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import java.util.Map;

public class FriendListViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48718a;

    /* renamed from: b  reason: collision with root package name */
    c f48719b;

    /* renamed from: c  reason: collision with root package name */
    DmtTextView f48720c;

    /* renamed from: d  reason: collision with root package name */
    protected b f48721d;

    /* renamed from: e  reason: collision with root package name */
    protected h f48722e;

    /* renamed from: f  reason: collision with root package name */
    private StoryCircleView f48723f;
    private AnimationImageView g;
    private AvatarImageWithVerify h;
    private DmtTextView i;
    private DmtTextView j;
    private ImageView k;
    private RemoteImageView l;
    private FriendListFragment m;
    private LinearLayout n;

    public FriendListViewHolder(View view) {
        super(view);
        this.f48723f = (StoryCircleView) view.findViewById(C0906R.id.ayt);
        this.g = (AnimationImageView) view.findViewById(C0906R.id.i8);
        this.h = (AvatarImageWithVerify) view.findViewById(C0906R.id.hk);
        this.i = (DmtTextView) view.findViewById(C0906R.id.df7);
        this.f48720c = (DmtTextView) view.findViewById(C0906R.id.ddg);
        this.j = (DmtTextView) view.findViewById(C0906R.id.dj2);
        this.k = (ImageView) view.findViewById(C0906R.id.b3u);
        this.l = (RemoteImageView) view.findViewById(C0906R.id.b51);
        this.n = (LinearLayout) view.findViewById(C0906R.id.z1);
        if (!a.a()) {
            this.f48722e = (h) ServiceManager.get().getService(h.class);
            this.f48721d = this.f48722e.a(this.h, this.f48723f, this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(c cVar, View view) {
        if (this.f48721d == null || !this.f48721d.b()) {
            r.a("enter_personal_detail", (Map) new d().a("enter_from", "friends_list").a("to_user_id", this.f48719b.getUser().getUid()).f34114b);
            UserProfileActivity.a(view.getContext(), cVar.getUser());
            com.ss.android.ugc.aweme.im.b.a().cleanUpdateTagCount(cVar.getUser().getUid());
            this.f48720c.setVisibility(8);
        }
    }

    public final void a(c cVar, FriendListFragment friendListFragment, boolean z) {
        c cVar2 = cVar;
        FriendListFragment friendListFragment2 = friendListFragment;
        if (PatchProxy.isSupport(new Object[]{cVar2, friendListFragment2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f48718a, false, 46282, new Class[]{c.class, FriendListFragment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, friendListFragment2, Byte.valueOf(z)}, this, f48718a, false, 46282, new Class[]{c.class, FriendListFragment.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.m = friendListFragment2;
        this.f48719b = cVar2;
        this.h.setData(cVar.getUser());
        if (this.f48721d != null) {
            this.f48721d.a(cVar.getUser(), false, cVar.getUser().getUid());
        }
        this.h.setOnClickListener(new d(this, cVar2));
        if (!TextUtils.isEmpty(cVar.getUser().getRemarkName())) {
            this.i.setText(cVar.getUser().getRemarkName());
        } else {
            this.i.setText(cVar.getUser().getNickname());
        }
        this.n.setOnClickListener(new e(this, cVar2));
        c.a(this.n);
        int updateTagCount = com.ss.android.ugc.aweme.im.b.a().getUpdateTagCount(cVar.getUser().getUid());
        if (updateTagCount > 0) {
            this.f48720c.setText(String.format(o.b(C0906R.string.aia), new Object[]{Integer.valueOf(updateTagCount)}));
            this.f48720c.setVisibility(0);
        } else {
            this.f48720c.setVisibility(8);
        }
        if (z) {
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            s.a(cVar2.mUser, cVar2.mUser.getFollowStatus(), (TextView) this.i, (View) this.k, "fans", false);
        } else {
            this.k.setVisibility(8);
            com.ss.android.ugc.aweme.im.b.a().wrapperSendMessageSyncXIcon(this.l, 4);
        }
        c.a(this.k);
        c.a(this.l);
        this.l.setOnClickListener(new f(this, friendListFragment2, cVar2));
        if (TextUtils.isEmpty(cVar.getUser().getSignature())) {
            this.j.setVisibility(8);
            return;
        }
        this.j.setText(cVar.getUser().getSignature());
        this.j.setVisibility(0);
    }
}
