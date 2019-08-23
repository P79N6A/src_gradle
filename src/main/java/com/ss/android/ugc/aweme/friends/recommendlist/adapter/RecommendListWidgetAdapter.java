package com.ss.android.ugc.aweme.friends.recommendlist.adapter;

import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.ext.list.differ.e;
import com.bytedance.widget.ext.list.ItemWidget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.arch.MultiTypeWidgetListAdapter;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendFriendsTitleWidget;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendFriendsTitleWidgetHolder;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderViewHolder;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendListItemWidget;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendListWidgetViewHolder;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendVerticalHeaderViewHolder;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendVerticalHeaderWidget;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J \u0010\u000b\u001a\u0012\u0012\u0002\b\u0003\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010\u000e\u001a\u00020\bH\u0014J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ\b\u0010\u0012\u001a\u00020\bH\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u0019H\u0014J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/RecommendListWidgetAdapter;", "Lcom/ss/android/ugc/aweme/base/arch/MultiTypeWidgetListAdapter;", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Lcom/bytedance/widget/WidgetManager;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "HEAD_COUNT", "", "mHeaderView", "Landroid/view/View;", "createItemWidget", "Lcom/bytedance/widget/ext/list/ItemWidget;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "viewType", "getBasicItemViewType", "position", "getHeaderView", "getHeaderViewCount", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "registerFactories", "registry", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryRegistry;", "setHeaderView", "headerView", "Companion", "RecommendUserDiffer", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendListWidgetAdapter extends MultiTypeWidgetListAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f48972f = null;
    public static final int h = 1;
    public static final int i = 2;
    public static final a j = new a((byte) 0);
    public View g;
    private int k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/RecommendListWidgetAdapter$RecommendUserDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class RecommendUserDiffer extends DiffUtil.ItemCallback<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48973a;

        public final boolean areContentsTheSame(@NotNull Object obj, @NotNull Object obj2) {
            Object obj3 = obj;
            Object obj4 = obj2;
            if (PatchProxy.isSupport(new Object[]{obj3, obj4}, this, f48973a, false, 46733, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, this, f48973a, false, 46733, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(obj3, "p0");
            Intrinsics.checkParameterIsNotNull(obj4, "p1");
            if ((obj3 instanceof l) && (obj4 instanceof l)) {
                return Intrinsics.areEqual((Object) ((l) obj3).f75398b, (Object) ((l) obj4).f75398b);
            }
            if ((obj3 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h) && (obj4 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h)) {
                com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h hVar = (com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h) obj3;
                com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h hVar2 = (com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h) obj4;
                if (hVar.f49065b == hVar2.f49065b && hVar.f49067d == hVar2.f49067d && hVar.f49069f == hVar2.f49069f) {
                    return true;
                }
                return false;
            } else if (!(obj3 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) || !(obj4 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) || ((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) obj3).f49053b != ((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) obj4).f49053b) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean areItemsTheSame(@NotNull Object obj, @NotNull Object obj2) {
            Object obj3 = obj;
            Object obj4 = obj2;
            if (PatchProxy.isSupport(new Object[]{obj3, obj4}, this, f48973a, false, 46732, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, this, f48973a, false, 46732, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(obj3, "p0");
            Intrinsics.checkParameterIsNotNull(obj4, "p1");
            if ((obj3 instanceof l) && (obj4 instanceof l)) {
                return Intrinsics.areEqual((Object) ((l) obj3).f75398b.getUid(), (Object) ((l) obj4).f75398b.getUid());
            }
            if (!(obj3 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h) || !(obj4 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h)) {
                if (!(obj3 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) || !(obj4 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) || ((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) obj3).f49053b != ((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) obj4).f49053b) {
                    return false;
                }
                return true;
            } else if (((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h) obj3).f49065b == ((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h) obj4).f49065b) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/RecommendListWidgetAdapter$Companion;", "", "()V", "NEW_RECOMMEND_USER", "", "getNEW_RECOMMEND_USER", "()I", "RECENT_USER", "getRECENT_USER", "RECOMMEND_USER", "getRECOMMEND_USER", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public static int a() {
            return RecommendListWidgetAdapter.h;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<ViewGroup, ItemWidgetViewHolder<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendListWidgetAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecommendListWidgetAdapter recommendListWidgetAdapter) {
            super(1);
            this.this$0 = recommendListWidgetAdapter;
        }

        @NotNull
        public final ItemWidgetViewHolder<User> invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46734, new Class[]{ViewGroup.class}, ItemWidgetViewHolder.class)) {
                return (ItemWidgetViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46734, new Class[]{ViewGroup.class}, ItemWidgetViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            View view = this.this$0.g;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            return new ItemWidgetViewHolder<>(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendVerticalHeaderViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<ViewGroup, RecommendVerticalHeaderViewHolder> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        @NotNull
        public final RecommendVerticalHeaderViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46735, new Class[]{ViewGroup.class}, RecommendVerticalHeaderViewHolder.class)) {
                return (RecommendVerticalHeaderViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46735, new Class[]{ViewGroup.class}, RecommendVerticalHeaderViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return new RecommendVerticalHeaderViewHolder(viewGroup2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendHorizontalHeaderViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<ViewGroup, RecommendHorizontalHeaderViewHolder> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(1);
        }

        @NotNull
        public final RecommendHorizontalHeaderViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46736, new Class[]{ViewGroup.class}, RecommendHorizontalHeaderViewHolder.class)) {
                return (RecommendHorizontalHeaderViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46736, new Class[]{ViewGroup.class}, RecommendHorizontalHeaderViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return new RecommendHorizontalHeaderViewHolder(viewGroup2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendListWidgetViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<ViewGroup, RecommendListWidgetViewHolder> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(1);
        }

        @NotNull
        public final RecommendListWidgetViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46737, new Class[]{ViewGroup.class}, RecommendListWidgetViewHolder.class)) {
                return (RecommendListWidgetViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46737, new Class[]{ViewGroup.class}, RecommendListWidgetViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return new RecommendListWidgetViewHolder(viewGroup2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendFriendsTitleWidgetHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function1<ViewGroup, RecommendFriendsTitleWidgetHolder> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(1);
        }

        @NotNull
        public final RecommendFriendsTitleWidgetHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46738, new Class[]{ViewGroup.class}, RecommendFriendsTitleWidgetHolder.class)) {
                return (RecommendFriendsTitleWidgetHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46738, new Class[]{ViewGroup.class}, RecommendFriendsTitleWidgetHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return new RecommendFriendsTitleWidgetHolder(viewGroup2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendFriendsTitleWidgetHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<ViewGroup, RecommendFriendsTitleWidgetHolder> {
        public static final g INSTANCE = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
            super(1);
        }

        @NotNull
        public final RecommendFriendsTitleWidgetHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46739, new Class[]{ViewGroup.class}, RecommendFriendsTitleWidgetHolder.class)) {
                return (RecommendFriendsTitleWidgetHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46739, new Class[]{ViewGroup.class}, RecommendFriendsTitleWidgetHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return new RecommendFriendsTitleWidgetHolder(viewGroup2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendFriendsTitleWidgetHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<ViewGroup, RecommendFriendsTitleWidgetHolder> {
        public static final h INSTANCE = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
            super(1);
        }

        @NotNull
        public final RecommendFriendsTitleWidgetHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46740, new Class[]{ViewGroup.class}, RecommendFriendsTitleWidgetHolder.class)) {
                return (RecommendFriendsTitleWidgetHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 46740, new Class[]{ViewGroup.class}, RecommendFriendsTitleWidgetHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return new RecommendFriendsTitleWidgetHolder(viewGroup2);
        }
    }

    public final int d() {
        if (this.g == null) {
            return 0;
        }
        return 1;
    }

    public final void a(@NotNull com.bytedance.viewholder.typesafe.b<ItemWidgetViewHolder<?>> bVar) {
        com.bytedance.viewholder.typesafe.b<ItemWidgetViewHolder<?>> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f48972f, false, 46728, new Class[]{com.bytedance.viewholder.typesafe.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f48972f, false, 46728, new Class[]{com.bytedance.viewholder.typesafe.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "registry");
        bVar2.a(0, new b(this));
        bVar2.a(6, c.INSTANCE);
        bVar2.a(7, d.INSTANCE);
        bVar2.a(1, e.INSTANCE);
        bVar2.a(2, f.INSTANCE);
        bVar2.a(3, g.INSTANCE);
        bVar2.a(4, h.INSTANCE);
    }

    public final int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48972f, false, 46731, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48972f, false, 46731, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i2 < d()) {
            return 0;
        } else {
            Object a2 = a(i2);
            if (a2 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) {
                return ((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) a2).f49053b;
            }
            if (a2 instanceof com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h) {
                return ((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h) a2).f49065b;
            }
            return 1;
        }
    }

    @NotNull
    public final ItemWidget<?, ? extends ItemWidgetViewHolder<?>> b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48972f, false, 46727, new Class[]{Integer.TYPE}, ItemWidget.class)) {
            return (ItemWidget) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48972f, false, 46727, new Class[]{Integer.TYPE}, ItemWidget.class);
        }
        switch (i2) {
            case 2:
                return new RecommendFriendsTitleWidget<>();
            case 3:
                return new RecommendFriendsTitleWidget<>();
            case 4:
                return new RecommendFriendsTitleWidget<>();
            case 6:
                return new RecommendVerticalHeaderWidget<>();
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                return new RecommendHorizontalHeaderWidget<>();
            default:
                return new RecommendListItemWidget<>();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RecommendListWidgetAdapter(@NotNull com.bytedance.widget.a aVar, @Nullable e.b bVar) {
        super(aVar, (DiffUtil.ItemCallback) new RecommendUserDiffer(), bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "widgetManager");
        this.k = 1;
    }

    public final void onBindBasicViewHolder(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48972f, false, 46729, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48972f, false, 46729, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i2) != 0) {
            super.onBindBasicViewHolder(viewHolder, i2);
        }
    }

    public /* synthetic */ RecommendListWidgetAdapter(com.bytedance.widget.a aVar, e.b bVar, int i2) {
        this(aVar, null);
    }
}
