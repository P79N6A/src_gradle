package com.ss.android.ugc.aweme.friends.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.adapter.QueryFriendApi;
import com.ss.android.ugc.aweme.friends.adapter.c;
import com.ss.android.ugc.aweme.friends.adapter.n;
import com.ss.android.ugc.aweme.friends.ui.FriendListFragment;
import com.ss.android.ugc.aweme.net.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ah;
import com.ss.android.ugc.bogut.library.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b extends a<FriendListFragment> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48847a;

    /* renamed from: b  reason: collision with root package name */
    public int f48848b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48849c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f48850d = true;

    /* renamed from: e  reason: collision with root package name */
    public List<c> f48851e;

    /* renamed from: f  reason: collision with root package name */
    e<com.ss.android.ugc.aweme.story.shootvideo.friends.a.a> f48852f = new e<com.ss.android.ugc.aweme.story.shootvideo.friends.a.a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48853a;

        public final void a(Exception exc) {
            Exception exc2 = exc;
            if (PatchProxy.isSupport(new Object[]{exc2}, this, f48853a, false, 46683, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc2}, this, f48853a, false, 46683, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(d.a(), (Throwable) exc2);
            if (b.this.view != null) {
                if (((FriendListFragment) b.this.view).f()) {
                    FriendListFragment friendListFragment = (FriendListFragment) b.this.view;
                    if (PatchProxy.isSupport(new Object[0], friendListFragment, FriendListFragment.f49279b, false, 47303, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], friendListFragment, FriendListFragment.f49279b, false, 47303, new Class[0], Void.TYPE);
                    } else if (friendListFragment.isViewValid()) {
                        friendListFragment.mStatusView.f();
                    }
                    ((FriendListFragment) b.this.view).b();
                    return;
                }
                FriendListFragment friendListFragment2 = (FriendListFragment) b.this.view;
                if (PatchProxy.isSupport(new Object[0], friendListFragment2, FriendListFragment.f49279b, false, 47301, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], friendListFragment2, FriendListFragment.f49279b, false, 47301, new Class[0], Void.TYPE);
                } else if (friendListFragment2.isViewValid()) {
                    friendListFragment2.f49280c.showLoadMoreError();
                }
            }
        }

        public final /* synthetic */ void a(String str, Object obj) {
            List list;
            com.ss.android.ugc.aweme.story.shootvideo.friends.a.a aVar = (com.ss.android.ugc.aweme.story.shootvideo.friends.a.a) obj;
            if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f48853a, false, 46682, new Class[]{String.class, com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f48853a, false, 46682, new Class[]{String.class, com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class}, Void.TYPE);
                return;
            }
            if (b.this.view != null) {
                if (!(aVar == null || aVar.a() == null)) {
                    for (User requestId : aVar.a()) {
                        requestId.setRequestId(aVar.f73522c);
                    }
                }
                if (aVar != null) {
                    FriendListFragment friendListFragment = (FriendListFragment) b.this.view;
                    List a2 = aVar.a();
                    int i = b.this.f48848b;
                    int i2 = aVar.f73525f;
                    if (PatchProxy.isSupport(new Object[]{a2, Integer.valueOf(i), Integer.valueOf(i2)}, friendListFragment, FriendListFragment.f49279b, false, 47306, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        FriendListFragment friendListFragment2 = friendListFragment;
                        PatchProxy.accessDispatch(new Object[]{a2, Integer.valueOf(i), Integer.valueOf(i2)}, friendListFragment2, FriendListFragment.f49279b, false, 47306, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < a2.size(); i3++) {
                            new c().setUser((User) a2.get(i3));
                        }
                        if (i == 0) {
                            friendListFragment.f49280c.setData(arrayList);
                        } else {
                            friendListFragment.f49280c.addData(arrayList);
                        }
                    }
                    b.this.f48848b = aVar.f73523d;
                    b.this.f48849c = aVar.f73524e;
                    List<c> a3 = b.this.a(aVar.a());
                    if (b.this.f48850d) {
                        Collections.sort(a3);
                        ((FriendListFragment) b.this.view).a(a3, b.this.f48849c);
                        b.this.f48851e = a3;
                        b.this.f48850d = false;
                    } else {
                        b bVar = b.this;
                        if (PatchProxy.isSupport(new Object[0], bVar, b.f48847a, false, 46679, new Class[0], List.class)) {
                            list = (List) PatchProxy.accessDispatch(new Object[0], bVar, b.f48847a, false, 46679, new Class[0], List.class);
                        } else if (bVar.f48851e != null) {
                            list = bVar.f48851e;
                        } else {
                            list = new ArrayList();
                        }
                        list.addAll(a3);
                        ((FriendListFragment) b.this.view).b(list, b.this.f48849c);
                    }
                }
                if (b.this.view != null) {
                    if (((FriendListFragment) b.this.view).f()) {
                        ((FriendListFragment) b.this.view).y_();
                        ((FriendListFragment) b.this.view).b();
                        return;
                    }
                    FriendListFragment friendListFragment3 = (FriendListFragment) b.this.view;
                    if (PatchProxy.isSupport(new Object[0], friendListFragment3, FriendListFragment.f49279b, false, 47304, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], friendListFragment3, FriendListFragment.f49279b, false, 47304, new Class[0], Void.TYPE);
                    } else if (friendListFragment3.isViewValid()) {
                        friendListFragment3.mStatusView.setVisibility(4);
                    }
                    ((FriendListFragment) b.this.view).b();
                }
                if (!b.this.f48849c) {
                    FriendListFragment friendListFragment4 = (FriendListFragment) b.this.view;
                    if (PatchProxy.isSupport(new Object[0], friendListFragment4, FriendListFragment.f49279b, false, 47300, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], friendListFragment4, FriendListFragment.f49279b, false, 47300, new Class[0], Void.TYPE);
                    } else if (friendListFragment4.isViewValid()) {
                        friendListFragment4.f49280c.showLoadMoreEmpty();
                    }
                }
            }
        }
    };
    private int g;
    private QueryFriendApi h;
    private com.ss.android.ugc.aweme.friends.adapter.b i;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48847a, false, 46678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48847a, false, 46678, new Class[0], Void.TYPE);
            return;
        }
        this.f48848b = 0;
        a(this.f48848b);
    }

    public b() {
        QueryFriendApi queryFriendApi;
        if (PatchProxy.isSupport(new Object[0], null, n.f48813a, true, 46322, new Class[0], QueryFriendApi.class)) {
            queryFriendApi = (QueryFriendApi) PatchProxy.accessDispatch(new Object[0], null, n.f48813a, true, 46322, new Class[0], QueryFriendApi.class);
        } else {
            queryFriendApi = (QueryFriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(QueryFriendApi.class);
        }
        this.h = queryFriendApi;
        this.i = com.ss.android.ugc.aweme.friends.adapter.b.a();
    }

    public final List<c> a(List<User> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f48847a, false, 46675, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f48847a, false, 46675, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = new c();
            cVar.setUser(list.get(i2));
            String a2 = this.i.a(list.get(i2));
            String a3 = this.i.a(a2);
            cVar.setFinalName(a2);
            cVar.setFinalNamePinyin(a3);
            cVar.setSortLetters(ah.d(a3));
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final /* synthetic */ void onAttachView(Object obj) {
        FriendListFragment friendListFragment = (FriendListFragment) obj;
        if (PatchProxy.isSupport(new Object[]{friendListFragment}, this, f48847a, false, 46676, new Class[]{FriendListFragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{friendListFragment}, this, f48847a, false, 46676, new Class[]{FriendListFragment.class}, Void.TYPE);
            return;
        }
        super.onAttachView(friendListFragment);
        if (!(friendListFragment == null || friendListFragment.getActivity() == null || friendListFragment.getActivity().getIntent() == null)) {
            this.g = friendListFragment.getActivity().getIntent().getIntExtra("bundle_recommend_count", 0);
        }
        a();
    }

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48847a, false, 46677, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48847a, false, 46677, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.view == null || i2 == 0)) {
            FriendListFragment friendListFragment = (FriendListFragment) this.view;
            if (PatchProxy.isSupport(new Object[0], friendListFragment, FriendListFragment.f49279b, false, 47299, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], friendListFragment, FriendListFragment.f49279b, false, 47299, new Class[0], Void.TYPE);
            } else if (friendListFragment.isViewValid()) {
                friendListFragment.f49280c.showLoadMoreLoading();
            }
        }
        this.h.friendList(100, Integer.valueOf(i2)).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this), i.f1052b);
    }
}
