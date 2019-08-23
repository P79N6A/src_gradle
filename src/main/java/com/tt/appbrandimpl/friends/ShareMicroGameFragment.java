package com.tt.appbrandimpl.friends;

import a.g;
import a.i;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.miniapp_api.a;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.presenter.y;
import com.ss.android.ugc.aweme.utils.permission.e;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ShareMicroGameFragment extends AmeBaseFragment implements LoadMoreRecyclerViewAdapter.a, o {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context context;
    private GameShareFriendsAdapter friendsAdapter;
    private ImageView ivClose;
    private y recommendCommonUserPresenter;
    private RecyclerView recyclerView;
    private Map<String, Boolean> shareMaps = a.a().f55978c;
    private IShareService.ShareStruct shareStruct;
    private DmtStatusView statusView;

    public void onRecommendFailed(Exception exc) {
    }

    private void getIMFollowUsers() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91922, new Class[0], Void.TYPE);
            return;
        }
        i.a(ShareMicroGameFragment$$Lambda$1.$instance).a((g<TResult, TContinuationResult>) new ShareMicroGameFragment$$Lambda$2<TResult,TContinuationResult>(this), i.f1052b);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91925, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91925, new Class[0], Void.TYPE);
            return;
        }
        this.friendsAdapter.showLoadMoreLoading();
        getRecommendFriends(1);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91927, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.shareMaps != null) {
            this.shareMaps.clear();
        }
    }

    private void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91920, new Class[0], Void.TYPE);
            return;
        }
        this.friendsAdapter = new GameShareFriendsAdapter(this.shareStruct);
        this.context = getActivity();
        this.friendsAdapter.setLoadMoreListener(this);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.context);
        wrapLinearLayoutManager.setOrientation(1);
        this.recyclerView.setLayoutManager(wrapLinearLayoutManager);
        this.recyclerView.setAdapter(this.friendsAdapter);
        this.recommendCommonUserPresenter = new y(new RecommendCommonUserModel(), this);
        getIMFollowUsers();
        getRecommendFriends(0);
        this.statusView.setBuilder(DmtStatusView.a.a(this.context).b(new c.a(this.context).b((int) C0906R.string.dmm).c(C0906R.string.dml).f20493a).a(createEmptyStatus(getString(C0906R.string.dmu))).c(0));
        this.ivClose.setOnClickListener(new ShareMicroGameFragment$$Lambda$0(this));
        if (NetworkUtils.isNetworkAvailable(this.context)) {
            this.statusView.d();
        } else {
            this.statusView.f();
        }
        r.a("enter_mp_share_page", (Map) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$init$0$ShareMicroGameFragment(View view) {
        getActivity().finish();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ List lambda$getIMFollowUsers$2$ShareMicroGameFragment(i iVar) throws Exception {
        List<IMUser> list = (List) iVar.e();
        for (IMUser uid : list) {
            this.shareMaps.put(uid.getUid(), Boolean.FALSE);
        }
        this.friendsAdapter.setFollowData(list);
        return list;
    }

    private c createEmptyStatus(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 91923, new Class[]{String.class}, c.class)) {
            return new c.a(this.context).b((int) C0906R.string.b5r).b(str2).f20493a;
        }
        return (c) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 91923, new Class[]{String.class}, c.class);
    }

    private void getRecommendFriends(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91921, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91921, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String curUserId = d.a().getCurUserId();
        if (i2 == 0) {
            this.recommendCommonUserPresenter.a(30, curUserId, 2, e.a(), "", e.b());
            return;
        }
        if (i2 == 1) {
            this.recommendCommonUserPresenter.a(30, curUserId, 2, e.a(), e.b());
        }
    }

    private List<User> removeDuplicate(List<User> list) {
        List<User> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 91928, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 91928, new Class[]{List.class}, List.class);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User next : list) {
            if (hashSet.add(next.getUid())) {
                arrayList.add(next);
                this.shareMaps.put(next.getUid(), Boolean.FALSE);
            }
        }
        list.clear();
        list2.addAll(arrayList);
        return list2;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 91917, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 91917, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.shareStruct = (IShareService.ShareStruct) getArguments().getSerializable("share_struct");
        }
    }

    public void onLoadMoreRecommendSuccess(RecommendList recommendList) {
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, changeQuickRedirect, false, 91926, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, changeQuickRedirect, false, 91926, new Class[]{RecommendList.class}, Void.TYPE);
        } else if (recommendList != null && !CollectionUtils.isEmpty(recommendList.getUserList())) {
            this.friendsAdapter.resetLoadMoreState();
            this.friendsAdapter.setRecommendData(removeDuplicate(recommendList.getUserList()));
            if (!recommendList.hasMore) {
                this.friendsAdapter.showLoadMoreEmpty();
            }
        }
    }

    public void onRefreshRecommendSuccess(RecommendList recommendList) {
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, changeQuickRedirect, false, 91924, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, changeQuickRedirect, false, 91924, new Class[]{RecommendList.class}, Void.TYPE);
            return;
        }
        if (CollectionUtils.isEmpty(recommendList.getUserList())) {
            this.statusView.e();
        } else {
            this.friendsAdapter.setRecommendData(recommendList.getUserList());
            if (!recommendList.hasMore) {
                this.friendsAdapter.showLoadMoreEmpty();
                this.statusView.b();
            }
        }
        this.friendsAdapter.resetLoadMoreState();
        this.statusView.b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, changeQuickRedirect, false, 91919, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, changeQuickRedirect, false, 91919, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        init();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, changeQuickRedirect, false, 91918, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, changeQuickRedirect, false, 91918, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.q_, viewGroup2, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(C0906R.id.cc4);
        this.statusView = (DmtStatusView) inflate.findViewById(C0906R.id.cvd);
        this.ivClose = (ImageView) inflate.findViewById(C0906R.id.ts);
        return inflate;
    }
}
