package com.ss.android.ugc.aweme.friends.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.friends.adapter.DouyinInviteMoreAdapter;
import com.ss.android.ugc.aweme.friends.model.UnRegisteredUser;

public class InviteMoreViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48738a;

    /* renamed from: b  reason: collision with root package name */
    final TextView f48739b;

    /* renamed from: c  reason: collision with root package name */
    final CheckBox f48740c;

    /* renamed from: d  reason: collision with root package name */
    final DouyinInviteMoreAdapter.a f48741d;

    /* renamed from: e  reason: collision with root package name */
    final View f48742e;

    /* renamed from: f  reason: collision with root package name */
    UnRegisteredUser f48743f;
    int g;
    private final Context h;
    private final AvatarImageWithVerify i;

    @SuppressLint({"AnonymousInnerClass"})
    public InviteMoreViewHolder(@NonNull View view, DouyinInviteMoreAdapter.a aVar) {
        super(view);
        this.f48741d = aVar;
        this.h = view.getContext();
        this.i = (AvatarImageWithVerify) view.findViewById(C0906R.id.ayr);
        this.f48739b = (TextView) view.findViewById(C0906R.id.dnq);
        this.f48740c = (CheckBox) view.findViewById(C0906R.id.cng);
        this.f48742e = view.findViewById(C0906R.id.avh);
        ((GenericDraweeHierarchy) this.i.getAvatarImageView().getHierarchy()).setPlaceholderImage(2130839027);
        this.f48740c.setOnCheckedChangeListener(new l(this));
        view.setOnClickListener(new m(this));
    }
}
