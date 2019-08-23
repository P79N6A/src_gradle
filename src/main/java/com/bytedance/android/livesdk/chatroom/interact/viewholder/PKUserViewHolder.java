package com.bytedance.android.livesdk.chatroom.interact.viewholder;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.d.a;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.chatroom.interact.adapter.PKUserAdapter;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PKUserViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11004a;

    /* renamed from: b  reason: collision with root package name */
    final PKUserAdapter.a f11005b;

    /* renamed from: c  reason: collision with root package name */
    final int f11006c;

    /* renamed from: d  reason: collision with root package name */
    private final VHeadView f11007d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f11008e;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f11009f;
    private final Button g;
    private final View h;

    public PKUserViewHolder(View view, PKUserAdapter.a aVar, int i) {
        super(view);
        this.f11007d = (VHeadView) view.findViewById(C0906R.id.ane);
        this.f11008e = (TextView) view.findViewById(C0906R.id.dfb);
        this.f11009f = (TextView) view.findViewById(C0906R.id.dbs);
        this.g = (Button) view.findViewById(C0906R.id.ni);
        this.h = view.findViewById(C0906R.id.a5u);
        this.f11005b = aVar;
        this.f11006c = i;
    }

    public final void a(PKUserViewHolder pKUserViewHolder, int i, Room room, boolean z) {
        PKUserViewHolder pKUserViewHolder2 = pKUserViewHolder;
        Room room2 = room;
        if (PatchProxy.isSupport(new Object[]{pKUserViewHolder2, Integer.valueOf(i), room2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f11004a, false, 5021, new Class[]{PKUserViewHolder.class, Integer.TYPE, Room.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pKUserViewHolder2, Integer.valueOf(i), room2, Byte.valueOf(z)}, this, f11004a, false, 5021, new Class[]{PKUserViewHolder.class, Integer.TYPE, Room.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        User owner = room.getOwner();
        if (owner != null) {
            b.b(pKUserViewHolder2.f11007d, owner.getAvatarThumb(), pKUserViewHolder2.f11007d.getWidth(), pKUserViewHolder2.f11007d.getHeight(), 2130841141);
            pKUserViewHolder2.f11008e.setText(owner.getNickName());
            int i2 = 8;
            if (owner.getUserHonor() == null || owner.getUserHonor().f() == 0) {
                pKUserViewHolder2.f11009f.setVisibility(8);
            } else {
                pKUserViewHolder2.f11009f.setVisibility(0);
                pKUserViewHolder2.f11009f.setText(pKUserViewHolder2.f11009f.getContext().getResources().getString(C0906R.string.czb, new Object[]{a.a(owner.getFanTicketCount())}));
            }
            if (room.isWithLinkMic() || !(owner.getLinkMicStats() == 1 || (owner.getLinkMicStats() == 2 && owner.getFollowInfo() != null && owner.getFollowInfo().f7764d == 2))) {
                pKUserViewHolder2.g.setBackgroundResource(2130840812);
                pKUserViewHolder2.g.setTextColor(Color.parseColor("#b0b0b0"));
            } else {
                pKUserViewHolder2.g.setBackgroundResource(2130840839);
                pKUserViewHolder2.g.setTextColor(Color.parseColor("#ffffff"));
            }
            pKUserViewHolder2.g.setOnClickListener(new a(this, room2));
            View view = pKUserViewHolder2.h;
            if (z) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }
}
