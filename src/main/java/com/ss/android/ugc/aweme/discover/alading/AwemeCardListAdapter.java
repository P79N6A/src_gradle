package com.ss.android.ugc.aweme.discover.alading;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.mob.h;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.u.aa;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/AwemeCardListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/discover/alading/AwemeCardViewHolder;", "items", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "context", "Landroid/content/Context;", "(Lcom/ss/android/ugc/aweme/discover/model/SearchUser;Landroid/content/Context;)V", "awemeCardList", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAwemeCardList", "()Ljava/util/List;", "getContext", "()Landroid/content/Context;", "getItems", "()Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AwemeCardListAdapter extends RecyclerView.Adapter<AwemeCardViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42007a;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public static String f42008e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f42009f = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final List<Aweme> f42010b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final SearchUser f42011c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Context f42012d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/AwemeCardListAdapter$Companion;", "", "()V", "clickAwemeId", "", "getClickAwemeId", "()Ljava/lang/String;", "setClickAwemeId", "(Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeCardListAdapter f42014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f42015c;

        b(AwemeCardListAdapter awemeCardListAdapter, Aweme aweme) {
            this.f42014b = awemeCardListAdapter;
            this.f42015c = aweme;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42013a, false, 35969, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42013a, false, 35969, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Context context = this.f42014b.f42012d;
            if (context != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (!NetworkUtils.isNetworkAvailable(this.f42014b.f42012d)) {
                    com.bytedance.ies.dmt.ui.d.a.b(this.f42014b.f42012d, (int) C0906R.string.bgf).a();
                    return;
                }
                com.ss.android.ugc.aweme.profile.presenter.b bVar = new com.ss.android.ugc.aweme.profile.presenter.b();
                bVar.setItems(this.f42014b.f42010b);
                com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeManager.inst()");
                a2.f44610c = bVar;
                AwemeCardListAdapter.f42008e = this.f42015c.getAid();
                Bundle bundle = new Bundle();
                bundle.putString("id", this.f42015c.getAid());
                bundle.putString("video_from", "from_no_request");
                DetailActivity.a((Activity) fragmentActivity, bundle, view);
                com.ss.android.ugc.aweme.feed.b.b.a(this.f42015c);
                h.a aVar = h.f42664a;
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                s a3 = aVar.a(view);
                d dVar = new d();
                dVar.a("enter_from", "general_search").a("group_id", this.f42015c.getAid()).a("author_id", this.f42015c.getAuthorUid()).a("search_keyword", a3.a()).a("enter_method", "aladdin_card").a("log_pb", a3.b());
                r.a("feed_enter", aa.a(dVar.f34114b));
                com.ss.android.ugc.aweme.discover.mob.a.a(PushConstants.CONTENT, this.f42015c.getAuthorUid(), view);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f42007a, false, 35968, new Class[0], Integer.TYPE)) {
            return this.f42010b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42007a, false, 35968, new Class[0], Integer.TYPE)).intValue();
    }

    public AwemeCardListAdapter(@NotNull SearchUser searchUser, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(searchUser, "items");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f42011c = searchUser;
        this.f42012d = context;
        List<Aweme> list = this.f42011c.awemeCards;
        Intrinsics.checkExpressionValueIsNotNull(list, "items.awemeCards");
        this.f42010b = list;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AwemeCardViewHolder awemeCardViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42007a, false, 35966, new Class[]{ViewGroup.class, Integer.TYPE}, AwemeCardViewHolder.class)) {
            awemeCardViewHolder = (AwemeCardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42007a, false, 35966, new Class[]{ViewGroup.class, Integer.TYPE}, AwemeCardViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "p0");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zx, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            awemeCardViewHolder = new AwemeCardViewHolder(inflate);
        }
        return awemeCardViewHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AwemeCardViewHolder awemeCardViewHolder = (AwemeCardViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{awemeCardViewHolder, Integer.valueOf(i)}, this, f42007a, false, 35967, new Class[]{AwemeCardViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeCardViewHolder, Integer.valueOf(i)}, this, f42007a, false, 35967, new Class[]{AwemeCardViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(awemeCardViewHolder, "p0");
        Aweme aweme = this.f42010b.get(i);
        awemeCardViewHolder.f42018c.setText(aweme.getDesc());
        awemeCardViewHolder.f42019d.setText(com.ss.android.ugc.aweme.i18n.b.a((long) aweme.getStatistics().getDiggCount()));
        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.f42012d.getResources(), 2130839044);
        a2.setBounds(0, (int) UIUtils.dip2Px(this.f42012d, 0.5f), (int) UIUtils.dip2Px(this.f42012d, 15.0f), (int) UIUtils.dip2Px(this.f42012d, 15.5f));
        awemeCardViewHolder.f42019d.setCompoundDrawables(a2, null, null, null);
        Video video = aweme.getVideo();
        Intrinsics.checkExpressionValueIsNotNull(video, "item.video");
        RemoteImageView remoteImageView = awemeCardViewHolder.f42017b;
        if (video == null) {
            Intrinsics.throwNpe();
        }
        c.b(remoteImageView, video.getCover());
        awemeCardViewHolder.f42016a.setOnClickListener(new b(this, aweme));
    }
}
