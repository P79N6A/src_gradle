package com.ss.android.ugc.aweme.discover.alading;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/SearchAwemeCardViewHolder;", "Lcom/ss/android/ugc/aweme/discover/alading/SearchAbsAladingCard;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "itemView", "Landroid/view/View;", "cardlist", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/model/SearchUser;)V", "getCardlist", "()Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "setCardlist", "(Lcom/ss/android/ugc/aweme/discover/model/SearchUser;)V", "onScrollToEnd", "", "onVideoEvent", "event", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchAwemeCardViewHolder extends SearchAbsAladingCard<Aweme> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3031b;

    /* renamed from: d  reason: collision with root package name */
    public static final a f3032d = new a((byte) 0);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public SearchUser f3033c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/SearchAwemeCardViewHolder$Companion;", "", "()V", "createViewHolder", "Lcom/ss/android/ugc/aweme/discover/alading/SearchAwemeCardViewHolder;", "viewGroup", "Landroid/view/ViewGroup;", "cardlist", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42059a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3031b, false, 36017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3031b, false, 36017, new Class[0], Void.TYPE);
            return;
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        UserProfileActivity.a(view.getContext(), this.f3033c.user, "general_search", "", "main_head");
    }

    @Subscribe
    public final void onVideoEvent(@NotNull ar arVar) {
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3031b, false, 36018, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3031b, false, 36018, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(arVar, "event");
        if (ViewCompat.isAttachedToWindow(this.itemView) && arVar.f45292b == 21) {
            Object obj = arVar.f45293c;
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                if (aweme != null && !TextUtils.equals(AwemeCardListAdapter.f42008e, aweme.getAid())) {
                    List<Aweme> list = this.f3033c.awemeCards;
                    Intrinsics.checkExpressionValueIsNotNull(list, "cardlist.awemeCards");
                    Iterator<Aweme> it2 = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Aweme next = it2.next();
                        Intrinsics.checkExpressionValueIsNotNull(next, AdvanceSetting.NETWORK_TYPE);
                        if (TextUtils.equals(next.getAid(), aweme.getAid())) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1) {
                        RecyclerView.LayoutManager layoutManager = this.f3030a.getLayoutManager();
                        if (layoutManager != null) {
                            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                        }
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchAwemeCardViewHolder(@org.jetbrains.annotations.NotNull android.view.View r5, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.discover.model.SearchUser r6) {
        /*
            r4 = this;
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "cardlist"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r6.awemeCards
            java.lang.String r1 = "cardlist.awemeCards"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r4.<init>(r5, r0)
            r4.f3033c = r6
            android.support.v7.widget.RecyclerView r6 = r4.f3030a
            com.ss.android.ugc.aweme.discover.alading.AwemeCardListAdapter r0 = new com.ss.android.ugc.aweme.discover.alading.AwemeCardListAdapter
            com.ss.android.ugc.aweme.discover.model.SearchUser r1 = r4.f3033c
            android.content.Context r2 = r5.getContext()
            java.lang.String r3 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r0.<init>(r1, r2)
            android.support.v7.widget.RecyclerView$Adapter r0 = (android.support.v7.widget.RecyclerView.Adapter) r0
            r6.setAdapter(r0)
            com.ss.android.ugc.aweme.discover.model.SearchUser r6 = r4.f3033c
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r6 = r6.awemeCards
            int r6 = r6.size()
            r0 = 16
            r1 = 2131170294(0x7f0713f6, float:1.7954942E38)
            r2 = 0
            r3 = 10
            if (r6 != r3) goto L_0x004b
            android.view.View r6 = r5.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 170(0xaa, float:2.38E-43)
            r6.setPadding(r0, r1, r2, r2)
            goto L_0x0056
        L_0x004b:
            android.view.View r6 = r5.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 180(0xb4, float:2.52E-43)
            r6.setPadding(r0, r1, r2, r2)
        L_0x0056:
            com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardViewHolder$1 r6 = new com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardViewHolder$1
            r6.<init>(r4)
            android.view.View$OnAttachStateChangeListener r6 = (android.view.View.OnAttachStateChangeListener) r6
            r5.addOnAttachStateChangeListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardViewHolder.<init>(android.view.View, com.ss.android.ugc.aweme.discover.model.SearchUser):void");
    }

    @JvmStatic
    @NotNull
    public static final SearchAwemeCardViewHolder a(@NotNull ViewGroup viewGroup, @NotNull SearchUser searchUser) {
        Object accessDispatch;
        ViewGroup viewGroup2 = viewGroup;
        SearchUser searchUser2 = searchUser;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, searchUser2}, null, f3031b, true, 36020, new Class[]{ViewGroup.class, SearchUser.class}, SearchAwemeCardViewHolder.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{viewGroup2, searchUser2}, null, f3031b, true, 36020, new Class[]{ViewGroup.class, SearchUser.class}, SearchAwemeCardViewHolder.class);
        } else {
            a aVar = f3032d;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, searchUser2}, aVar, a.f42059a, false, 36023, new Class[]{ViewGroup.class, SearchUser.class}, SearchAwemeCardViewHolder.class)) {
                Object[] objArr = {viewGroup2, searchUser2};
                Object[] objArr2 = objArr;
                a aVar2 = aVar;
                ChangeQuickRedirect changeQuickRedirect = a.f42059a;
                accessDispatch = PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect, false, 36023, new Class[]{ViewGroup.class, SearchUser.class}, SearchAwemeCardViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
                Intrinsics.checkParameterIsNotNull(searchUser2, "cardlist");
                return new SearchAwemeCardViewHolder(viewGroup2, searchUser2);
            }
        }
        return (SearchAwemeCardViewHolder) accessDispatch;
    }
}
