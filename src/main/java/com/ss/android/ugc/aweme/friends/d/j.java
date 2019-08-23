package com.ss.android.ugc.aweme.friends.d;

import a.g;
import a.i;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.friends.api.RecommendApi;
import com.ss.android.ugc.aweme.friends.api.b;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.net.e;
import com.ss.android.ugc.aweme.newfollow.ui.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.dr;
import com.ss.android.ugc.bogut.library.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class j extends a<k> implements com.ss.android.ugc.aweme.newfollow.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48862a;

    /* renamed from: b  reason: collision with root package name */
    public int f48863b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48864c = true;

    /* renamed from: d  reason: collision with root package name */
    public RecommendList f48865d;

    /* renamed from: e  reason: collision with root package name */
    public int f48866e;

    /* renamed from: f  reason: collision with root package name */
    public String f48867f;
    public String g;
    public RecommendList h;
    public e<List<RecommendList>> i = new e<List<RecommendList>>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48868a;

        public final void a(Exception exc) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f48868a, false, 46701, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f48868a, false, 46701, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(d.a(), (Throwable) exc);
            if (j.this.view != null) {
                if (((k) j.this.view).S_()) {
                    ((k) j.this.view).g();
                    ((k) j.this.view).T_();
                    return;
                }
                ((k) j.this.view).h();
            }
        }

        public final /* synthetic */ void a(String str, Object obj) {
            List<User> list;
            List list2 = (List) obj;
            if (PatchProxy.isSupport(new Object[]{str, list2}, this, f48868a, false, 46700, new Class[]{String.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, list2}, this, f48868a, false, 46700, new Class[]{String.class, List.class}, Void.TYPE);
                return;
            }
            if (j.this.view != null) {
                if (list2.size() != 2) {
                    ((k) j.this.view).g();
                }
                RecommendList recommendList = (RecommendList) list2.get(0);
                RecommendList recommendList2 = (RecommendList) list2.get(1);
                if (!(recommendList == null || recommendList.getUserList() == null)) {
                    for (User requestId : recommendList.getUserList()) {
                        requestId.setRequestId(recommendList.rid);
                    }
                }
                if (!(recommendList2 == null || recommendList2.getUserList() == null)) {
                    List<User> userList = recommendList2.getUserList();
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    for (int i = 1; i < userList.size(); i++) {
                        User user = userList.get(0);
                        if (!(user == null || user.getUid() == null || userList.get(i) == null || !user.getUid().equals(userList.get(i).getUid()))) {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                    for (Integer intValue : arrayList) {
                        userList.remove(intValue.intValue());
                    }
                    recommendList2.userList = userList;
                    for (User requestId2 : recommendList2.getUserList()) {
                        requestId2.setRequestId(recommendList2.rid);
                    }
                }
                com.ss.android.ugc.aweme.newfollow.util.k.a().c();
                j.this.f48865d = recommendList2;
                j.this.h = recommendList;
                if (recommendList2 != null) {
                    ai.a().a(recommendList2.rid, recommendList2.logPb);
                    k kVar = (k) j.this.view;
                    List<User> userList2 = recommendList2.getUserList();
                    if (recommendList == null) {
                        list = Collections.emptyList();
                    } else {
                        list = recommendList.getUserList();
                    }
                    kVar.a(userList2, list, j.this.f48863b, recommendList2.newUserCount);
                    j.this.f48863b = recommendList2.cursor;
                    j.this.f48864c = recommendList2.hasMore;
                }
                if (j.this.view != null) {
                    if (((k) j.this.view).S_()) {
                        ((k) j.this.view).y_();
                        ((k) j.this.view).T_();
                        return;
                    }
                    ((k) j.this.view).e();
                    ((k) j.this.view).T_();
                }
                if (!j.this.f48864c) {
                    ((k) j.this.view).f();
                }
            }
        }
    };
    private RecommendApi j = b.a();
    private int k = 3;

    public final RecommendList b() {
        return this.f48865d;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48862a, false, 46697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48862a, false, 46697, new Class[0], Void.TYPE);
            return;
        }
        this.f48863b = 0;
        a(this.f48863b, this.f48866e);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f48862a, false, 46698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48862a, false, 46698, new Class[0], Void.TYPE);
        } else if (this.f48864c) {
            a(this.f48863b, this.f48866e);
        }
    }

    public final void a(int i2) {
        this.k = 2;
    }

    public final /* synthetic */ void a(k kVar) {
        super.attachView(kVar);
    }

    public final /* synthetic */ void onAttachView(Object obj) {
        k kVar = (k) obj;
        if (PatchProxy.isSupport(new Object[]{kVar}, this, f48862a, false, 46695, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar}, this, f48862a, false, 46695, new Class[]{k.class}, Void.TYPE);
            return;
        }
        super.onAttachView(kVar);
        if (!(kVar == null || kVar.getActivity() == null || kVar.getActivity().getIntent() == null)) {
            this.f48866e = kVar.getActivity().getIntent().getIntExtra("bundle_recommend_count", 0);
            this.f48867f = kVar.getActivity().getIntent().getStringExtra("bundle_puid");
            this.g = kVar.getActivity().getIntent().getStringExtra("bundle_sec_puid");
        }
    }

    private void a(int i2, int i3) {
        boolean z;
        i iVar;
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48862a, false, 46696, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48862a, false, 46696, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.view == null || i2 == 0)) {
            ((k) this.view).i();
        }
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(this.f48867f)) {
            iVar = this.j.recommendList(30, Integer.valueOf(i2), null, 3, Integer.valueOf(i3), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a()), com.ss.android.ugc.aweme.newfollow.util.k.a().b(), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b()), null);
        } else {
            RecommendApi recommendApi = this.j;
            Integer valueOf = Integer.valueOf(i2);
            Integer valueOf2 = Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a());
            String b2 = com.ss.android.ugc.aweme.newfollow.util.k.a().b();
            String str2 = this.f48867f;
            Integer valueOf3 = Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b());
            if (this.g == null) {
                str = dr.a().a(this.f48867f);
            } else {
                str = this.g;
            }
            iVar = recommendApi.recommendList(30, valueOf, null, 3, 1, valueOf2, b2, str2, valueOf3, null, str);
        }
        if (!z || !AbTestManager.a().C()) {
            iVar.a((g<TResult, TContinuationResult>) new g<RecommendList, Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48872a;

                public final Object then(i<RecommendList> iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f48872a, false, 46703, new Class[]{i.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f48872a, false, 46703, new Class[]{i.class}, Object.class);
                    } else if (j.this.i == null) {
                        return null;
                    } else {
                        if (iVar.d()) {
                            j.this.i.a(iVar.f());
                        } else {
                            j.this.i.a(null, Arrays.asList(new RecommendList[]{null, (RecommendList) iVar.e()}));
                        }
                        return null;
                    }
                }
            }, i.f1052b);
            return;
        }
        i.a((Collection<? extends i<TResult>>) Arrays.asList(new i[]{this.j.recommendList(20, 0, null, 8, Integer.valueOf(i3), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a()), com.ss.android.ugc.aweme.newfollow.util.k.a().b(), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b()), null), iVar})).a((g<TResult, TContinuationResult>) new g<List<RecommendList>, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48870a;

            public final Object then(i<List<RecommendList>> iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f48870a, false, 46702, new Class[]{i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar}, this, f48870a, false, 46702, new Class[]{i.class}, Object.class);
                } else if (j.this.i == null) {
                    return null;
                } else {
                    if (iVar.d()) {
                        j.this.i.a(iVar.f());
                    } else {
                        j.this.i.a(null, iVar.e());
                    }
                    return null;
                }
            }
        }, i.f1052b);
    }
}
