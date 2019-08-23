package com.ss.android.ugc.aweme.friends.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.friends.d.i;
import com.ss.android.ugc.aweme.friends.model.UnRegisteredUser;

public class DouyinInviteMoreAdapter extends RecyclerHeaderViewAdapter<UnRegisteredUser> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f48713f;
    private final int g = 0;
    private final i h;

    public interface a {
        void a(UnRegisteredUser unRegisteredUser, boolean z);
    }

    public DouyinInviteMoreAdapter(int i, i iVar) {
        this.h = iVar;
        setLoadEmptyTextResId(C0906R.string.a3f);
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48713f, false, 46272, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new InviteMoreViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.w2, viewGroup2, false), this.h);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48713f, false, 46272, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48713f, false, 46271, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48713f, false, 46271, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        UnRegisteredUser unRegisteredUser = (UnRegisteredUser) this.mItems.get(i);
        InviteMoreViewHolder inviteMoreViewHolder = (InviteMoreViewHolder) viewHolder;
        int i2 = this.g;
        i iVar = this.h;
        if (PatchProxy.isSupport(new Object[]{unRegisteredUser}, iVar, i.f48860a, false, 46690, new Class[]{UnRegisteredUser.class}, Boolean.TYPE)) {
            i iVar2 = iVar;
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{unRegisteredUser}, iVar2, i.f48860a, false, 46690, new Class[]{UnRegisteredUser.class}, Boolean.TYPE)).booleanValue();
        } else {
            z = iVar.f48861b.contains(unRegisteredUser);
        }
        if (PatchProxy.isSupport(new Object[]{unRegisteredUser, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, inviteMoreViewHolder, InviteMoreViewHolder.f48738a, false, 46319, new Class[]{UnRegisteredUser.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            InviteMoreViewHolder inviteMoreViewHolder2 = inviteMoreViewHolder;
            PatchProxy.accessDispatch(new Object[]{unRegisteredUser, Integer.valueOf(i2), Byte.valueOf(z)}, inviteMoreViewHolder2, InviteMoreViewHolder.f48738a, false, 46319, new Class[]{UnRegisteredUser.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (unRegisteredUser != null) {
            inviteMoreViewHolder.f48743f = unRegisteredUser;
            inviteMoreViewHolder.g = i2;
            inviteMoreViewHolder.f48739b.setText(unRegisteredUser.remarkName);
            if (unRegisteredUser.inviteStatus > 0) {
                UIUtils.setViewVisibility(inviteMoreViewHolder.f48742e, 0);
                UIUtils.setViewVisibility(inviteMoreViewHolder.f48740c, 8);
            } else {
                UIUtils.setViewVisibility(inviteMoreViewHolder.f48742e, 8);
                UIUtils.setViewVisibility(inviteMoreViewHolder.f48740c, 0);
            }
            inviteMoreViewHolder.f48740c.setChecked(z);
        }
    }
}
