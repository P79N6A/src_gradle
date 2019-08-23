package com.bytedance.android.livesdk.feed.live;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.c;
import com.bytedance.android.livesdkapi.g.d;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.List;

public class HorFollowLiveFeedViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14238a;

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f14239d = ((RecyclerView) this.itemView.findViewById(C0906R.id.d78));

    /* renamed from: e  reason: collision with root package name */
    public List<FeedItem> f14240e;

    /* renamed from: f  reason: collision with root package name */
    public Context f14241f;
    private BannerSwipeRefreshLayout.a g;

    class DividerViewHolder extends BaseViewHolder<FeedItem> {
        public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        }
    }

    class HorizontalAdapter extends RecyclerView.Adapter<BaseViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14242a;

        public int getItemCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f14242a, false, 8745, new Class[0], Integer.TYPE)) {
                return HorFollowLiveFeedViewHolder.this.f14240e.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14242a, false, 8745, new Class[0], Integer.TYPE)).intValue();
        }

        private HorizontalAdapter() {
        }

        public /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            long j;
            String str;
            String str2;
            BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{baseViewHolder}, this, f14242a, false, 8746, new Class[]{BaseViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseViewHolder}, this, f14242a, false, 8746, new Class[]{BaseViewHolder.class}, Void.TYPE);
                return;
            }
            super.onViewAttachedToWindow(baseViewHolder);
            int position = baseViewHolder.getPosition();
            if (position >= 0 && position < HorFollowLiveFeedViewHolder.this.f14240e.size() && HorFollowLiveFeedViewHolder.this.f14240e.get(position) != null && (HorFollowLiveFeedViewHolder.this.f14240e.get(position).item instanceof Room)) {
                Room room = (Room) HorFollowLiveFeedViewHolder.this.f14240e.get(position).item;
                if (room.getOwner() == null) {
                    j = 0;
                } else {
                    j = room.getOwner().getId();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("log_pb", room.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(j));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("show_type", "stay");
                if (room.isLiveTypeAudio()) {
                    str = "voice_live";
                } else {
                    str = "video_live";
                }
                hashMap.put("live_type", str);
                if (room.isThirdParty) {
                    str2 = "thirdparty";
                } else {
                    str2 = "general";
                }
                hashMap.put("streaming_type", str2);
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "follow_live");
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", "live");
                hashMap.put("action_type", "click");
                b.a().a("live_show", hashMap);
            }
        }

        /* synthetic */ HorizontalAdapter(HorFollowLiveFeedViewHolder horFollowLiveFeedViewHolder, byte b2) {
            this();
        }

        public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f14242a, false, 8744, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f14242a, false, 8744, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i >= 0 && i < HorFollowLiveFeedViewHolder.this.f14240e.size() && HorFollowLiveFeedViewHolder.this.f14240e.get(i) != null) {
                baseViewHolder.a(HorFollowLiveFeedViewHolder.this.f14240e.get(i), i);
            }
        }

        public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = viewGroup;
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f14242a, false, 8743, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class)) {
                return new ItemViewHolder(C0906R.layout.ahr, viewGroup2);
            }
            return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f14242a, false, 8743, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class);
        }
    }

    class ItemViewHolder extends BaseViewHolder<FeedItem> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14244a;

        /* renamed from: e  reason: collision with root package name */
        private HSImageView f14246e = ((HSImageView) this.itemView.findViewById(C0906R.id.d76));

        /* renamed from: f  reason: collision with root package name */
        private TextView f14247f = ((TextView) this.itemView.findViewById(C0906R.id.d79));
        private View g;
        private c h;
        private View.OnAttachStateChangeListener i = new View.OnAttachStateChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14248a;

            public final void onViewAttachedToWindow(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14248a, false, 8753, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14248a, false, 8753, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ItemViewHolder.this.f();
            }

            public final void onViewDetachedFromWindow(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14248a, false, 8754, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14248a, false, 8754, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ItemViewHolder.this.e();
            }
        };

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f14244a, false, 8748, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14244a, false, 8748, new Class[0], Void.TYPE);
                return;
            }
            super.c();
            f();
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f14244a, false, 8749, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14244a, false, 8749, new Class[0], Void.TYPE);
                return;
            }
            super.d();
            e();
        }

        public final void e() {
            if (PatchProxy.isSupport(new Object[0], this, f14244a, false, 8750, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14244a, false, 8750, new Class[0], Void.TYPE);
                return;
            }
            if (this.h != null) {
                this.h.b();
            }
        }

        public final void f() {
            if (PatchProxy.isSupport(new Object[0], this, f14244a, false, 8751, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14244a, false, 8751, new Class[0], Void.TYPE);
                return;
            }
            if (this.h != null) {
                this.h.a();
            }
        }

        public final /* synthetic */ void a(Object obj, int i2) {
            FeedItem feedItem = (FeedItem) obj;
            if (PatchProxy.isSupport(new Object[]{feedItem, Integer.valueOf(i2)}, this, f14244a, false, 8747, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{feedItem, Integer.valueOf(i2)}, this, f14244a, false, 8747, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (feedItem != null && (feedItem.item instanceof Room)) {
                User owner = ((Room) feedItem.item).getOwner();
                if (owner != null) {
                    ImageModel avatarThumb = owner.getAvatarThumb();
                    if (avatarThumb != null && !Lists.isEmpty(avatarThumb.getUrls())) {
                        this.f14246e.setImageURI(avatarThumb.getUrls().get(0));
                    }
                    this.f14247f.setText(owner.getNickName());
                }
                this.f14246e.setVisibility(8);
                this.f14246e.setVisibility(0);
                this.h = com.bytedance.android.livesdk.feed.b.b.c().c().e();
                if (this.h != null) {
                    this.h.a(this.f14246e, this.g, true);
                    this.h.a(0);
                    this.h.a();
                    this.f14246e.addOnAttachStateChangeListener(this.i);
                }
                this.itemView.setOnClickListener(new m(this, feedItem));
            }
        }

        ItemViewHolder(int i2, ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ahr, viewGroup, false));
            d a2 = h.f().c().a(viewGroup.getContext());
            if (a2 instanceof View) {
                this.g = (View) a2;
                this.g.setLayoutParams(this.itemView.findViewById(C0906R.id.d77).getLayoutParams());
                int dip2Px = (int) UIUtils.dip2Px(viewGroup.getContext(), 3.0f);
                this.g.setPadding(dip2Px, dip2Px, dip2Px, dip2Px);
                ((FrameLayout) this.itemView.findViewById(C0906R.id.d6t)).addView(this.g, 0);
                this.itemView.findViewById(C0906R.id.aqs).setVisibility(0);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public HorFollowLiveFeedViewHolder(View view, BannerSwipeRefreshLayout.a aVar) {
        super(view);
        this.f14241f = view.getContext();
        this.g = aVar;
        this.f14239d.setLayoutManager(new SSLinearLayoutManager(this.f14241f, 0, false));
        this.f14239d.setOnTouchListener(new l(this));
        this.g.a(this.f14239d);
    }

    public final /* synthetic */ void a(Object obj, int i) {
        FeedItem feedItem = (FeedItem) obj;
        if (PatchProxy.isSupport(new Object[]{feedItem, Integer.valueOf(i)}, this, f14238a, false, 8740, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem, Integer.valueOf(i)}, this, f14238a, false, 8740, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (feedItem instanceof com.bytedance.android.livesdk.feed.d.d) {
            this.f14240e = ((com.bytedance.android.livesdk.feed.d.d) feedItem).f14078a;
            this.f14239d.setAdapter(new HorizontalAdapter(this, (byte) 0));
        }
    }
}
