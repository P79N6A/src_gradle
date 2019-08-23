package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ui.ag;
import com.ss.android.ugc.aweme.live.feedpage.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/FollowLiveSkyLightAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "Lcom/ss/android/ugc/aweme/live/feedpage/RoomItem;", "()V", "enterLiveCallBack", "Lkotlin/Function0;", "", "getEnterLiveCallBack", "()Lkotlin/jvm/functions/Function0;", "setEnterLiveCallBack", "(Lkotlin/jvm/functions/Function0;)V", "isFirstScene", "", "()Z", "setFirstScene", "(Z)V", "getLayout", "", "onBindBasicViewHolder", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowLiveSkyLightAdapter extends BaseAdapter<g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44727a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public Function0<Unit> f44728b = a.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f44729c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Unit> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public FollowLiveSkyLightAdapter() {
        setShowFooter(false);
    }

    public final void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f44727a, false, 40524, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f44727a, false, 40524, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder2 instanceof FollowLiveSkyLightViewHolder) {
            FollowLiveSkyLightViewHolder followLiveSkyLightViewHolder = (FollowLiveSkyLightViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40529, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40529, new Class[0], Void.TYPE);
                return;
            }
            followLiveSkyLightViewHolder.g.f();
        }
    }

    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f44727a, false, 40523, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f44727a, false, 40523, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof FollowLiveSkyLightViewHolder) {
            FollowLiveSkyLightViewHolder followLiveSkyLightViewHolder = (FollowLiveSkyLightViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40528, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40528, new Class[0], Void.TYPE);
            } else {
                followLiveSkyLightViewHolder.g.e();
            }
            if (PatchProxy.isSupport(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40530, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40530, new Class[0], Void.TYPE);
            } else {
                g gVar = followLiveSkyLightViewHolder.f44735f;
                if (gVar != null) {
                    String str = gVar.f53404a;
                    Room room = gVar.f53405b;
                    if (room != null) {
                        com.ss.android.ugc.aweme.feed.j.a aVar = com.ss.android.ugc.aweme.feed.j.a.f45560b;
                        User owner = room.getOwner();
                        Intrinsics.checkExpressionValueIsNotNull(owner, "room.owner");
                        long id = owner.getId();
                        long id2 = room.getId();
                        if (PatchProxy.isSupport(new Object[]{new Long(id), new Long(id2), str}, aVar, com.ss.android.ugc.aweme.feed.j.a.f45559a, false, 43577, new Class[]{Long.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.feed.j.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{new Long(id), new Long(id2), str}, aVar2, com.ss.android.ugc.aweme.feed.j.a.f45559a, false, 43577, new Class[]{Long.TYPE, Long.TYPE, String.class}, Void.TYPE);
                        } else {
                            r.a("livesdk_live_show", (Map) d.a().a("enter_from_merge", "homepage_follow").a("enter_method", "live_cover").a("action_type", "click").a("author_id", id).a("room_id", id2).a("request_id", str).f34114b);
                        }
                    }
                }
            }
            if (ag.h.b()) {
                boolean z = this.f44729c;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40532, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    FollowLiveSkyLightViewHolder followLiveSkyLightViewHolder2 = followLiveSkyLightViewHolder;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, followLiveSkyLightViewHolder2, FollowLiveSkyLightViewHolder.f44730a, false, 40532, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                } else if (z) {
                    View view = followLiveSkyLightViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    view.setAlpha(0.0f);
                    return;
                } else {
                    View view2 = followLiveSkyLightViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    view2.setAlpha(1.0f);
                }
            }
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@Nullable ViewGroup viewGroup, int i) {
        int i2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44727a, false, 40522, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44727a, false, 40522, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (viewGroup2 == null) {
            Intrinsics.throwNpe();
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (PatchProxy.isSupport(new Object[0], this, f44727a, false, 40525, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44727a, false, 40525, new Class[0], Integer.TYPE)).intValue();
        } else if (ag.h.b()) {
            i2 = C0906R.layout.ur;
        } else {
            i2 = C0906R.layout.uq;
        }
        View inflate = from.inflate(i2, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new FollowLiveSkyLightViewHolder(inflate, this.f44728b);
    }

    public final void onBindBasicViewHolder(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f44727a, false, 40521, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f44727a, false, 40521, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof FollowLiveSkyLightViewHolder) {
            FollowLiveSkyLightViewHolder followLiveSkyLightViewHolder = (FollowLiveSkyLightViewHolder) viewHolder2;
            Object obj = this.mItems.get(i);
            Intrinsics.checkExpressionValueIsNotNull(obj, "mItems[position]");
            g gVar = (g) obj;
            boolean z = this.f44729c;
            if (PatchProxy.isSupport(new Object[]{gVar, Byte.valueOf(z ? (byte) 1 : 0)}, followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40526, new Class[]{g.class, Boolean.TYPE}, Void.TYPE)) {
                FollowLiveSkyLightViewHolder followLiveSkyLightViewHolder2 = followLiveSkyLightViewHolder;
                PatchProxy.accessDispatch(new Object[]{gVar, Byte.valueOf(z)}, followLiveSkyLightViewHolder2, FollowLiveSkyLightViewHolder.f44730a, false, 40526, new Class[]{g.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(gVar, "roomItem");
            View view = followLiveSkyLightViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.setScaleX(1.0f);
            View view2 = followLiveSkyLightViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            view2.setScaleY(1.0f);
            followLiveSkyLightViewHolder.f44735f = gVar;
            g gVar2 = followLiveSkyLightViewHolder.f44735f;
            if (gVar2 != null) {
                Room room = gVar2.f53405b;
                if (room != null) {
                    UrlModel urlModel = new UrlModel();
                    User owner = room.getOwner();
                    Intrinsics.checkExpressionValueIsNotNull(owner, "it.owner");
                    ImageModel avatarThumb = owner.getAvatarThumb();
                    Intrinsics.checkExpressionValueIsNotNull(avatarThumb, "it.owner.avatarThumb");
                    urlModel.setUrlList(avatarThumb.getUrls());
                    c.b(followLiveSkyLightViewHolder.f44731b, urlModel);
                    TextView textView = followLiveSkyLightViewHolder.f44732c;
                    User owner2 = room.getOwner();
                    Intrinsics.checkExpressionValueIsNotNull(owner2, "it.owner");
                    textView.setText(owner2.getNickName());
                }
            }
            followLiveSkyLightViewHolder.f44734e.setVisibility(0);
            followLiveSkyLightViewHolder.g.a(null, followLiveSkyLightViewHolder.getClass(), null);
        }
    }
}
