package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.commercialize.views.SearchAdView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchUserAdapter;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchMixUserCell extends ap<SearchMixUserData> implements LifecycleObserver {
    public static ChangeQuickRedirect i;
    public SearchResultParam j;
    RecyclerView k;
    private final ViewGroup l;
    private final LinearLayout m;
    private final a n;
    private SearchUserAdapter o;
    private SearchAdView p;
    private ViewStub q;
    private SearchMixUserData r;

    class a implements com.ss.android.ugc.aweme.following.ui.adapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43018a;

        private a() {
        }

        public final boolean a(User user) {
            String str;
            String str2;
            String str3;
            String str4;
            if (PatchProxy.isSupport(new Object[]{user}, this, f43018a, false, 38013, new Class[]{User.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f43018a, false, 38013, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
            }
            boolean a2 = SearchMixUserCell.this.a(user);
            MobClick obtain = MobClick.obtain();
            if (user.getFollowStatus() == 0) {
                str = "follow";
            } else {
                str = "follow_cancel";
            }
            r.onEvent(obtain.setEventName(str).setLabelName("general_search").setValue(user.getUid()));
            if (a2) {
                str2 = "aladdin_card";
            } else {
                str2 = "follow_button";
            }
            String str5 = str2;
            if (user.getFollowStatus() == 0) {
                str3 = "follow";
            } else {
                str3 = "follow_cancel";
            }
            new s(str3).b("general_search").c(str5).g("follow_button").f("general_search").h(user.getUid()).k(user.getRequestId()).e();
            j jVar = j.f42669b;
            if (user.getFollowStatus() == 0) {
                str4 = "search_follow";
            } else {
                str4 = "search_follow_cancel";
            }
            jVar.a(str4, user.getUid(), "general_search", false, str5);
            if (SearchMixUserCell.this.a(user)) {
                com.ss.android.ugc.aweme.discover.mob.a.a("follow", user.getUid(), SearchMixUserCell.this.f3076c);
            }
            return true;
        }

        /* synthetic */ a(SearchMixUserCell searchMixUserCell, byte b2) {
            this();
        }

        public final void a(User user, int i) {
            String keyword;
            String a2;
            if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f43018a, false, 38014, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f43018a, false, 38014, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (SearchMixUserCell.this.j == null) {
                keyword = "";
            } else {
                keyword = SearchMixUserCell.this.j.getKeyword();
            }
            String str = keyword;
            String requestId = user.getRequestId();
            String uid = user.getUid();
            if (SearchMixUserCell.this.a(user)) {
                a2 = "aladdin_card";
            } else {
                a2 = k.a(str);
            }
            k.b(i, str, 3, requestId, uid, a2);
            UserProfileActivity.a(SearchMixUserCell.this.f3075b, user, "general_search", "", "main_head");
            if (SearchMixUserCell.this.a(user)) {
                com.ss.android.ugc.aweme.discover.mob.a.a("user_information", user.getUid(), SearchMixUserCell.this.f3076c);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 38005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 38005, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
    }

    public final boolean a(User user) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{user}, this, i, false, 38010, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, i, false, 38010, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.r.users != null) {
            Iterator<SearchUser> it2 = this.r.users.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SearchUser next = it2.next();
                if (next.isAladdin() && next.user.getUid().contains(user.getUid())) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    private void a(List<SearchUser> list) {
        List<SearchUser> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, i, false, 38007, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, i, false, 38007, new Class[]{List.class}, Void.TYPE);
        } else if (list == null || list.size() <= 1) {
            this.l.setVisibility(8);
        } else {
            if (list.size() > 6) {
                list2 = list.subList(1, 7);
            } else {
                list2 = list.subList(1, list.size());
            }
            this.m.removeAllViews();
            for (SearchUser searchUser : list2) {
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f3075b).inflate(C0906R.layout.a8_, this.m, false);
                c.b((AvatarImageView) viewGroup.findViewById(C0906R.id.id), searchUser.user.getAvatarThumb());
                this.m.addView(viewGroup);
            }
            LayoutInflater.from(this.f3075b).inflate(C0906R.layout.a8a, this.m, true);
            this.l.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43015a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f43015a, false, 38011, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f43015a, false, 38011, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    SearchMixUserCell.this.h.a();
                }
            });
        }
    }

    public SearchMixUserCell(View view, Context context, ap.a aVar) {
        super(view, context, aVar);
        this.f3077d.setText(C0906R.string.dps);
        if (!com.ss.android.g.a.a()) {
            this.f3078e.setText(C0906R.string.eg);
        }
        this.l = (ViewGroup) view.findViewById(C0906R.id.clp);
        this.m = (LinearLayout) view.findViewById(C0906R.id.clo);
        this.q = (ViewStub) view.findViewById(C0906R.id.ckh);
        this.n = new a(this, (byte) 0);
        this.k = new RecyclerView(this.f3075b);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.f3075b);
        wrapLinearLayoutManager.setOrientation(1);
        this.k.setLayoutManager(wrapLinearLayoutManager);
        this.k.getItemAnimator().setChangeDuration(0);
        this.g.addView(this.k);
    }

    public final void a(SearchMixUserData searchMixUserData, SearchResultParam searchResultParam, boolean z) {
        SearchMixUserData searchMixUserData2 = searchMixUserData;
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchMixUserData2, searchResultParam2, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 38006, new Class[]{SearchMixUserData.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMixUserData2, searchResultParam2, Byte.valueOf(z)}, this, i, false, 38006, new Class[]{SearchMixUserData.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k.removeAllViews();
        this.r = searchMixUserData2;
        if (!CollectionUtils.isEmpty(this.r.users)) {
            this.j = searchResultParam2;
            this.o = new SearchUserAdapter(new com.ss.android.ugc.aweme.discover.adapter.s(true), searchResultParam.getKeyword(), this.n);
            this.k.setAdapter(this.o);
            this.o.setShowFooter(false);
            if (searchMixUserData2.hasTopUser) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(searchMixUserData2.users.get(0));
                this.o.setData(arrayList);
                this.f3079f.setVisibility(8);
                a(searchMixUserData2.users);
            } else {
                this.o.setData(searchMixUserData2.users);
                this.l.setVisibility(8);
                a(z);
            }
            if (searchMixUserData2.ad == null || !searchMixUserData2.hasTopUser) {
                if (this.p != null) {
                    this.p.setVisibility(8);
                }
                return;
            }
            if (this.p == null) {
                this.p = (SearchAdView) this.q.inflate();
            } else {
                this.p.setVisibility(0);
            }
            this.p.setup(searchMixUserData2.ad);
        }
    }
}
