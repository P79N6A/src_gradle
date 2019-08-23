package com.ss.android.ugc.aweme.discover.presenter;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.a.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchUserAdapter;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.SearchOriginalFragment;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.s;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004:\u0001+B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0014\u0010\u0016\u001a\u00020\u00112\n\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J \u0010\u001f\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0007H\u0014J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0016J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchUserFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchOriginalFragment;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/profile/presenter/IFollowView;", "()V", "labelName", "", "getLabelName", "()Ljava/lang/String;", "mFollowPresenter", "Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;", "getMFollowPresenter", "()Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;", "setMFollowPresenter", "(Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;)V", "initAdapter", "", "initPresenter", "isRegisterEventBus", "", "onDestroyView", "onFollowFail", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFollowStatus", "status", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "onFollowSuccess", "followStatus", "onLoadMoreResult", "list", "", "hasMore", "onProfileFollowEvent", "event", "Lcom/ss/android/ugc/aweme/challenge/event/ProfileFollowEvent;", "setKeyword", "keyword", "shouldShowSearchAdH5", "inI18n", "syncFollowStatus", "FollowItemListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchUserFragment extends SearchOriginalFragment<SearchUser> implements c<SearchUser>, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3043a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public i f3044b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f3045c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchUserFragment$FollowItemListener;", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowUserListener;", "(Lcom/ss/android/ugc/aweme/discover/presenter/SearchUserFragment;)V", "enterUserProfile", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "order", "", "onFollow", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class a implements com.ss.android.ugc.aweme.following.ui.adapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42695a;

        public a() {
        }

        public final boolean a(@NotNull User user) {
            String str;
            String str2;
            String str3;
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{user2}, this, f42695a, false, 37322, new Class[]{User.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{user2}, this, f42695a, false, 37322, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
            JSONObject jSONObject = new JSONObject();
            try {
                if (SearchUserFragment.this.k == 1) {
                    str3 = "search_history";
                } else {
                    str3 = "search_recommend";
                }
                jSONObject.put("enter_from", str3);
            } catch (Exception unused) {
            }
            if (user.getFollowStatus() != 0) {
                r.onEvent(MobClick.obtain().setEventName("follow_cancel").setLabelName("discovery").setValue(user.getUid()).setJsonObject(jSONObject));
            } else {
                try {
                    jSONObject.put("follow_from", "search_result");
                } catch (JSONException unused2) {
                }
                r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("discovery").setValue(user.getUid()).setJsonObject(jSONObject));
            }
            if (user.getFollowStatus() == 0) {
                str = "follow";
            } else {
                str = "follow_cancel";
            }
            new s(str).b("search_result").c("follow_button").h(user.getUid()).f("search_result").g("follow_button").k(user.getRequestId()).e();
            j jVar = j.f42669b;
            if (user.getFollowStatus() == 0) {
                str2 = "search_follow";
            } else {
                str2 = "search_follow_cancel";
            }
            String str4 = str2;
            String uid = user.getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
            jVar.a(str4, uid, "search_user", true, "");
            return true;
        }

        public final void a(@NotNull User user, int i) {
            if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f42695a, false, 37323, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f42695a, false, 37323, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
            k.b(i, SearchUserFragment.this.h, 0, user.getRequestId(), user.getUid(), k.a(SearchUserFragment.this.h));
            UserProfileActivity.a((Context) SearchUserFragment.this.getActivity(), user, "search_result", "", "main_head");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/discover/presenter/SearchUserFragment$onFollowFail$1", "Lcom/ss/android/ugc/aweme/captcha/OnVerifyListener;", "onVerifyCanceled", "", "onVerifySuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.aweme.captcha.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchUserFragment f42698b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Exception f42699c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f42697a, false, 37324, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42697a, false, 37324, new Class[0], Void.TYPE);
                return;
            }
            i iVar = this.f42698b.f3044b;
            if (iVar == null) {
                Intrinsics.throwNpe();
            }
            iVar.a();
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f42697a, false, 37325, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42697a, false, 37325, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(this.f42698b.getContext(), this.f42699c, C0906R.string.afx);
        }

        b(SearchUserFragment searchUserFragment, Exception exc) {
            this.f42698b = searchUserFragment;
            this.f42699c = exc;
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f3043a, false, 37320, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f3043a, false, 37320, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f3045c == null) {
            this.f3045c = new HashMap();
        }
        View view = (View) this.f3045c.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.f3045c.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public final boolean a(boolean z) {
        return z;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3043a, false, 37321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3043a, false, 37321, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3045c != null) {
            this.f3045c.clear();
        }
    }

    @NotNull
    public final String i() {
        return AllStoryActivity.f73306b;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public SearchUserFragment() {
        this.j = aw.f43136d;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3043a, false, 37313, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3043a, false, 37313, new Class[0], Void.TYPE);
            return;
        }
        a((BaseAdapter<D>) new SearchUserAdapter<D>(new com.ss.android.ugc.aweme.discover.adapter.s(false), this.h, new a()));
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3043a, false, 37316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3043a, false, 37316, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f3044b != null) {
            i iVar = this.f3044b;
            if (iVar == null) {
                Intrinsics.throwNpe();
            }
            iVar.k();
        }
        g();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3043a, false, 37310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3043a, false, 37310, new Class[0], Void.TYPE);
            return;
        }
        a((k<?>) new x<Object>());
        o oVar = this;
        E().a(oVar);
        this.f3044b = new i();
        i iVar = this.f3044b;
        if (iVar == null) {
            Intrinsics.throwNpe();
        }
        iVar.a(oVar);
    }

    @Subscribe
    public final void onFollowStatus(@NotNull FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3043a, false, 37312, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3043a, false, 37312, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(followStatus2, "status");
        a(followStatus);
    }

    private final void a(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f3043a, false, 37317, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f3043a, false, 37317, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (isViewValid() && v() != null) {
        }
    }

    public final void onFollowFail(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f3043a, false, 37315, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f3043a, false, 37315, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        if (isViewValid()) {
            if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
                com.ss.android.ugc.aweme.captcha.c.b.a(getChildFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc2, new b(this, exc2));
                return;
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), exc2, C0906R.string.afx);
        }
    }

    public final void onFollowSuccess(@NotNull FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3043a, false, 37314, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3043a, false, 37314, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(followStatus2, "followStatus");
        if (isViewValid()) {
            a(followStatus);
        }
    }

    @Subscribe
    public final void onProfileFollowEvent(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3043a, false, 37319, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3043a, false, 37319, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "event");
        if (dVar2.f35319b instanceof User) {
            Object obj = dVar2.f35319b;
            if (obj != null) {
                FollowStatus followStatus = new FollowStatus();
                followStatus.userId = ((User) obj).getUid();
                followStatus.followStatus = dVar2.f35318a;
                a(followStatus);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
        }
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3043a, false, 37318, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3043a, false, 37318, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        if (v() != null) {
            BaseAdapter v = v();
            if (v != null) {
                ((SearchUserAdapter) v).h = str2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchUserAdapter");
            }
        }
    }

    public final void b(@Nullable List<? extends SearchUser> list, boolean z) {
        SearchUserFragment searchUserFragment;
        List<? extends SearchUser> list2 = list;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3043a, false, 37311, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f3043a, false, 37311, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            if (E() != null) {
                k<?> E = E();
                if (E == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchUserPresenter");
                } else if (((x) E).c()) {
                    z2 = true;
                }
            }
            searchUserFragment = this;
        } else {
            searchUserFragment = this;
            z2 = z;
        }
        super.b(list2, z2);
    }
}
