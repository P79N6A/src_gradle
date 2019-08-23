package com.ss.android.ugc.aweme.discover.delegate.a;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.ss.android.ugc.aweme.discover.adapter.SearchUserViewHolder;
import com.ss.android.ugc.aweme.discover.delegate.a.h;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.following.ui.adapter.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J4\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchUserSuggestDelegate;", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestDelegate$SubSuggestDelegate;", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowUserListener;", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "(Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;)V", "mActivity", "Landroid/app/Activity;", "enterUserProfile", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "order", "", "onBindViewHolder", "items", "", "", "position", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onFollow", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j extends h.a implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42267a;

    /* renamed from: f  reason: collision with root package name */
    private Activity f42268f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(@NotNull SearchSquareAdapter<?> searchSquareAdapter) {
        super(searchSquareAdapter);
        Intrinsics.checkParameterIsNotNull(searchSquareAdapter, "adapter");
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f42267a, false, 36267, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f42267a, false, 36267, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f42268f = v.c((View) viewGroup);
        SearchUserViewHolder a2 = SearchUserViewHolder.a(viewGroup, this);
        Intrinsics.checkExpressionValueIsNotNull(a2, "SearchUserViewHolder.create(parent, this)");
        return a2;
    }

    public final boolean a(@NotNull User user) {
        String str;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f42267a, false, 36269, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user2}, this, f42267a, false, 36269, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        if (user.getFollowStatus() == 0) {
            new s("follow").b("search_for_you_list").h(user.getUid()).e();
        } else {
            new s("follow_cancel").b("search_for_you_list").h(user.getUid()).e();
        }
        if (user.getFollowStatus() == 0) {
            str = "search_follow";
        } else {
            str = "search_follow_cancel";
        }
        String str2 = str;
        com.ss.android.ugc.aweme.discover.mob.j jVar = com.ss.android.ugc.aweme.discover.mob.j.f42669b;
        String uid = user.getUid();
        Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
        jVar.a(str2, uid, "search_for_you_list", true, "");
        return true;
    }

    public final void a(@NotNull User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f42267a, false, 36270, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f42267a, false, 36270, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        if (this.f42268f != null) {
            r.a("enter_personal_detail", (Map) d.a().a("enter_from", "search_for_you_list").a("to_user_id", user.getUid()).a("log_pb", ai.a().a(user.getRequestId())).a("order", a((Object) user)).f34114b);
            UserProfileActivity.b(this.f42268f, user, "search_for_you_list");
        }
    }

    public final void a(@NotNull List<? extends Object> list, int i, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull List<Object> list2) {
        List<? extends Object> list3 = list;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<Object> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list4}, this, f42267a, false, 36268, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list4}, this, f42267a, false, 36268, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list4, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            ((SearchUserViewHolder) viewHolder2).a((SuggestUser) obj);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestUser");
    }
}
