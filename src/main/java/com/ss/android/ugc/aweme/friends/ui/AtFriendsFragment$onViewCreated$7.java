package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/friends/ui/AtFriendsFragment$onViewCreated$7", "Lcom/ss/android/ugc/aweme/framework/fresco/FrescoRecycleViewScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AtFriendsFragment$onViewCreated$7 extends FrescoRecycleViewScrollListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f49164b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AtFriendsFragment f49165c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ View f49166d;

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f49164b, false, 47051, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f49164b, false, 47051, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        ((IndexView) this.f49165c.c(C0906R.id.au1)).setRecycleViewPos(AtFriendsFragment.a(this.f49165c).findFirstVisibleItemPosition());
        b.a((Activity) this.f49165c.getActivity(), (View) (DmtEditText) this.f49165c.c(C0906R.id.ckg));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AtFriendsFragment$onViewCreated$7(AtFriendsFragment atFriendsFragment, View view, Context context) {
        super(context);
        this.f49165c = atFriendsFragment;
        this.f49166d = view;
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f49164b, false, 47052, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f49164b, false, 47052, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (((float) i2) > UIUtils.dip2Px(this.f49165c.getContext(), 10.0f)) {
            b.a((Activity) this.f49165c.getActivity(), (View) (DmtEditText) this.f49165c.c(C0906R.id.ckg));
        }
    }
}
