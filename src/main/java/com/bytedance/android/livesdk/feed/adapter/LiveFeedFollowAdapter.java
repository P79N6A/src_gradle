package com.bytedance.android.livesdk.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.List;

public class LiveFeedFollowAdapter extends RecyclerView.Adapter<FollowViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13939a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Room> f13940b;

    /* renamed from: c  reason: collision with root package name */
    private final View.OnClickListener f13941c;

    /* renamed from: d  reason: collision with root package name */
    private int f13942d;

    /* renamed from: e  reason: collision with root package name */
    private int f13943e;

    static class FollowViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f13944a;

        /* renamed from: b  reason: collision with root package name */
        View f13945b;

        /* renamed from: c  reason: collision with root package name */
        View f13946c;

        /* renamed from: d  reason: collision with root package name */
        HSImageView f13947d;

        /* renamed from: e  reason: collision with root package name */
        TextView f13948e;

        FollowViewHolder(View view) {
            super(view);
            this.f13944a = view.findViewById(C0906R.id.bb2);
            this.f13945b = view.findViewById(C0906R.id.ces);
            this.f13946c = view.findViewById(C0906R.id.hq);
            this.f13947d = (HSImageView) view.findViewById(C0906R.id.hk);
            this.f13948e = (TextView) view.findViewById(C0906R.id.bpn);
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f13939a, false, 8512, new Class[0], Integer.TYPE)) {
            return this.f13940b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f13939a, false, 8512, new Class[0], Integer.TYPE)).intValue();
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f13939a, false, 8510, new Class[]{ViewGroup.class, Integer.TYPE}, FollowViewHolder.class)) {
            return new FollowViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.amz, viewGroup2, false));
        }
        return (FollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f13939a, false, 8510, new Class[]{ViewGroup.class, Integer.TYPE}, FollowViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        String str;
        long j;
        String str2;
        FollowViewHolder followViewHolder = (FollowViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{followViewHolder, Integer.valueOf(i)}, this, f13939a, false, 8511, new Class[]{FollowViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followViewHolder, Integer.valueOf(i)}, this, f13939a, false, 8511, new Class[]{FollowViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Room room = this.f13940b.get(i);
        if (room.getOwner() != null) {
            User owner = room.getOwner();
            k.a(followViewHolder.f13947d, owner.getAvatarThumb(), followViewHolder.f13947d.getMeasuredWidth(), followViewHolder.f13947d.getMeasuredHeight());
            followViewHolder.f13948e.setText(owner.getNickName());
        }
        followViewHolder.itemView.setTag(C0906R.id.d73, room);
        followViewHolder.itemView.setOnClickListener(this.f13941c);
        if (this.f13942d <= 0) {
            this.f13942d = (int) UIUtils.dip2Px(followViewHolder.itemView.getContext(), 12.0f);
            this.f13943e = (int) UIUtils.dip2Px(followViewHolder.itemView.getContext(), 8.0f);
        }
        ViewGroup.LayoutParams layoutParams = followViewHolder.f13944a.getLayoutParams();
        if (i == 0) {
            i2 = this.f13942d;
        } else {
            i2 = this.f13943e;
        }
        layoutParams.width = i2;
        followViewHolder.f13944a.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = followViewHolder.f13945b.getLayoutParams();
        if (i == this.f13940b.size() - 1) {
            i3 = this.f13942d;
        } else {
            i3 = this.f13943e;
        }
        layoutParams2.width = i3;
        followViewHolder.f13945b.setLayoutParams(layoutParams2);
        HashMap hashMap = new HashMap();
        if (room.isThirdParty) {
            str = "thirdparty";
        } else {
            str = "general";
        }
        hashMap.put("streaming_type", str);
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_type", "core");
        hashMap.put("event_page", "live");
        hashMap.put("event_module", "top_follow_shortcut");
        hashMap.put("log_pb", room.getLog_pb());
        if (room.getOwner() == null) {
            j = 0;
        } else {
            j = room.getOwner().getId();
        }
        hashMap.put("anchor_id", String.valueOf(j));
        hashMap.put("request_id", room.getRequestId());
        hashMap.put("room_id", String.valueOf(room.getId()));
        hashMap.put("action_type", "click");
        if (room.isLiveTypeAudio()) {
            str2 = "voice_live";
        } else {
            str2 = "video_live";
        }
        hashMap.put("live_type", str2);
        b.a().a("live_show", hashMap);
    }
}
