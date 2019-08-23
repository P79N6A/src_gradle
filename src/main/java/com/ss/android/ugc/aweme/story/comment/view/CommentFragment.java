package com.ss.android.ugc.aweme.story.comment.view;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.story.api.model.i;
import com.ss.android.ugc.aweme.story.base.c.a.b;
import com.ss.android.ugc.aweme.story.comment.model.ViewerListModel;
import com.ss.android.ugc.aweme.story.comment.model.a;
import com.ss.android.ugc.aweme.story.comment.model.d;
import com.ss.android.ugc.aweme.story.comment.view.adapter.ViewerListAdapter;
import com.ss.android.ugc.aweme.story.comment.widget.LineWithPick;
import com.ss.android.ugc.aweme.story.comment.widget.NestedScrollingRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;

public class CommentFragment extends AmeBaseFragment implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4111a;
    private int A;
    private boolean B;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f4112b;

    /* renamed from: c  reason: collision with root package name */
    public ViewerListAdapter f4113c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f4114d;

    /* renamed from: e  reason: collision with root package name */
    public DmtEditText f4115e;

    /* renamed from: f  reason: collision with root package name */
    public DmtStatusView f4116f;
    public DmtStatusView g;
    public LineWithPick h;
    public View i;
    public ViewerListModel j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public int q;
    private Bundle r;
    private NestedScrollingRecyclerView s;
    private LinearLayout t;
    private LinearLayout u;
    private LinearLayout v;
    private LinearLayout w;
    private boolean x;
    private boolean y;
    private boolean z;

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f4111a, false, 82960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4111a, false, 82960, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        c.a().c(this);
    }

    public void onDestroy() {
        ViewerListModel viewerListModel;
        if (PatchProxy.isSupport(new Object[0], this, f4111a, false, 82953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4111a, false, 82953, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (PatchProxy.isSupport(new Object[]{this}, null, ViewerListModel.f72200d, true, 82894, new Class[]{Fragment.class}, ViewerListModel.class)) {
            viewerListModel = (ViewerListModel) PatchProxy.accessDispatch(new Object[]{this}, null, ViewerListModel.f72200d, true, 82894, new Class[]{Fragment.class}, ViewerListModel.class);
        } else {
            viewerListModel = (ViewerListModel) ViewModelProviders.of((Fragment) this).get(ViewerListModel.class);
        }
        if (PatchProxy.isSupport(new Object[0], viewerListModel, ViewerListModel.f72200d, false, 82897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], viewerListModel, ViewerListModel.f72200d, false, 82897, new Class[0], Void.TYPE);
            return;
        }
        viewerListModel.f72202f.dispose();
    }

    public static CommentFragment a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, f4111a, true, 82943, new Class[]{Bundle.class}, CommentFragment.class)) {
            return (CommentFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f4111a, true, 82943, new Class[]{Bundle.class}, CommentFragment.class);
        }
        CommentFragment commentFragment = new CommentFragment();
        commentFragment.setArguments(bundle2);
        return commentFragment;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f4111a, false, 82942, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f4111a, false, 82942, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.r = getArguments();
    }

    public final List<com.ss.android.ugc.aweme.story.comment.model.c> a(List<com.ss.android.ugc.aweme.story.comment.model.c> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f4111a, false, 82957, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f4111a, false, 82957, new Class[]{List.class}, List.class);
        }
        this.y = false;
        this.x = false;
        if (!CollectionUtils.isEmpty(list)) {
            Iterator<com.ss.android.ugc.aweme.story.comment.model.c> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.ss.android.ugc.aweme.story.comment.model.c next = it2.next();
                if (next.getIsFriend() && !this.x) {
                    next.setFirstFriend(Boolean.TRUE);
                    this.x = true;
                }
                if (!next.getIsFriend() && !this.y) {
                    next.setFirstPartyFriend(Boolean.TRUE);
                    this.y = true;
                    next.setFirstPartyFriendWithoutFriend(!this.x);
                    break;
                }
            }
        }
        return list;
    }

    public final Map<String, i> a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f4111a, false, 82952, new Class[]{d.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{dVar}, this, f4111a, false, 82952, new Class[]{d.class}, Map.class);
        }
        i iVar = new i();
        iVar.f71862b = (int) dVar.getTotalCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 3; i2++) {
            if (this.f4113c.getData().size() > i2 && this.f4113c.getData().get(i2) != null) {
                arrayList.add(((com.ss.android.ugc.aweme.story.comment.model.c) this.f4113c.getData().get(i2)).getUser());
            }
        }
        iVar.f71861a = arrayList;
        HashMap hashMap = new HashMap();
        hashMap.put(this.k, iVar);
        return hashMap;
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f4111a, false, 82946, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f4111a, false, 82946, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.bik) {
            this.z = false;
            if (PatchProxy.isSupport(new Object[0], this, f4111a, false, 82949, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4111a, false, 82949, new Class[0], Void.TYPE);
            } else if (!(this.w == null || this.t == null || this.u == null || this.v == null)) {
                if (this.z) {
                    this.v.setVisibility(0);
                    this.w.setVisibility(8);
                    this.t.setAlpha(1.0f);
                    this.u.setAlpha(0.5f);
                    return;
                }
                this.w.setVisibility(0);
                this.v.setVisibility(8);
                this.u.setAlpha(1.0f);
                this.t.setAlpha(0.5f);
            }
        }
    }

    @Subscribe
    public void onUserBlock(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f4111a, false, 82959, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f4111a, false, 82959, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!(this.f4113c == null || aVar2.f72209c == this)) {
            ViewerListAdapter viewerListAdapter = this.f4113c;
            String str = aVar2.f72207a;
            boolean z2 = aVar2.f72208b;
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z2 ? (byte) 1 : 0)}, viewerListAdapter, ViewerListAdapter.f72260a, false, 82993, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                ViewerListAdapter viewerListAdapter2 = viewerListAdapter;
                PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z2)}, viewerListAdapter2, ViewerListAdapter.f72260a, false, 82993, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            List<com.ss.android.ugc.aweme.story.comment.model.c> data = viewerListAdapter.getData();
            if (data != null) {
                for (com.ss.android.ugc.aweme.story.comment.model.c cVar : data) {
                    if (cVar.getUser() != null && TextUtils.equals(cVar.getUser().getUid(), str)) {
                        StoryBlockInfo storyBlockInfo = cVar.getUser().getStoryBlockInfo();
                        if (storyBlockInfo == null) {
                            storyBlockInfo = new StoryBlockInfo();
                        }
                        storyBlockInfo.setBlock(z2);
                        cVar.getUser().setStoryBlockInfo(storyBlockInfo);
                        viewerListAdapter.notifyItemChanged(data.indexOf(cVar));
                        return;
                    }
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup, bundle}, this, f4111a, false, 82944, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup, bundle}, this, f4111a, false, 82944, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.a1u, null);
        if (PatchProxy.isSupport(new Object[0], this, f4111a, false, 82945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4111a, false, 82945, new Class[0], Void.TYPE);
        } else {
            this.f4112b = DataCenter.a(ViewModelProviders.of(getActivity()), (LifecycleOwner) this);
        }
        c.a().a((Object) this);
        this.h = (LineWithPick) inflate.findViewById(C0906R.id.a5t);
        this.i = inflate.findViewById(C0906R.id.a5r);
        this.g = (DmtStatusView) inflate.findViewById(C0906R.id.dut);
        DmtStatusView dmtStatusView = this.g;
        DmtStatusView.a c2 = DmtStatusView.a.a((Context) getActivity()).a((int) C0906R.string.vx).c(0);
        c cVar = new c(this);
        c2.b(new c.a(c2.f20473a).b((int) C0906R.string.w1).c(C0906R.string.w0).f20493a);
        c2.f20476d.setOnClickListener(cVar);
        dmtStatusView.setBuilder(c2);
        this.s = (NestedScrollingRecyclerView) inflate.findViewById(C0906R.id.ciu);
        this.u = (LinearLayout) inflate.findViewById(C0906R.id.bik);
        this.u.setOnClickListener(this);
        this.f4114d = (TextView) inflate.findViewById(C0906R.id.dlj);
        this.w = (LinearLayout) inflate.findViewById(C0906R.id.bij);
        if (PatchProxy.isSupport(new Object[0], this, f4111a, false, 82958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4111a, false, 82958, new Class[0], Void.TYPE);
        } else {
            this.z = this.r.getBoolean("commentOrViewer", true);
            this.A = this.r.getInt("pager_num");
            this.B = this.r.getBoolean("isHost", false);
            this.k = this.r.getString("storyId");
            this.o = this.r.getString("groupId");
            this.p = this.r.getString("log_pb");
            this.q = this.r.getInt("relationType");
        }
        if (!this.B && !this.z) {
            this.z = true;
        }
        if (this.B) {
            if (PatchProxy.isSupport(new Object[0], this, f4111a, false, 82951, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4111a, false, 82951, new Class[0], Void.TYPE);
            } else {
                this.u.setVisibility(0);
                final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
                this.s.setLayoutManager(linearLayoutManager);
                this.f4113c = new ViewerListAdapter(this);
                this.s.setAdapter(this.f4113c);
                this.f4113c.setShowFooter(false);
                this.s.addOnScrollListener(new RecyclerView.OnScrollListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72228a;

                    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        RecyclerView recyclerView2 = recyclerView;
                        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72228a, false, 82967, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72228a, false, 82967, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        super.onScrolled(recyclerView, i, i2);
                        if (!recyclerView.canScrollVertically(1) && CommentFragment.this.f4113c.f72261b) {
                            CommentFragment.this.j.f72201e = CommentFragment.this.k;
                            CommentFragment.this.j.b();
                        }
                        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
                            CommentFragment.this.h.setVisibility(0);
                            CommentFragment.this.i.setVisibility(4);
                            return;
                        }
                        CommentFragment.this.h.setVisibility(4);
                        CommentFragment.this.i.setVisibility(0);
                    }
                });
                this.j = (ViewerListModel) ViewModelProviders.of((Fragment) this).get(ViewerListModel.class);
                this.j.c().observe(this, new Observer<d>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72224a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        ArrayList arrayList;
                        d dVar = (d) obj;
                        if (PatchProxy.isSupport(new Object[]{dVar}, this, f72224a, false, 82968, new Class[]{d.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dVar}, this, f72224a, false, 82968, new Class[]{d.class}, Void.TYPE);
                            return;
                        }
                        if (dVar != null) {
                            boolean isHasMore = dVar.isHasMore();
                            CommentFragment.this.f4113c.f72261b = isHasMore;
                            CommentFragment.this.f4114d.setText(Long.toString(dVar.getTotalCount()));
                            com.ss.android.ugc.aweme.story.base.c.a.a aVar = (com.ss.android.ugc.aweme.story.base.c.a.a) CommentFragment.this.j.f72128c.getValue();
                            if (aVar == com.ss.android.ugc.aweme.story.base.c.a.a.t) {
                                CommentFragment.this.f4113c.setShowFooter(true);
                                if (!isHasMore) {
                                    CommentFragment.this.f4113c.showLoadMoreEmpty();
                                } else {
                                    CommentFragment.this.f4113c.resetLoadMoreState();
                                }
                                CommentFragment.this.f4113c.setData(CommentFragment.this.a(dVar.getStoryViewerList()));
                                CommentFragment.this.g.b();
                            } else if (aVar == com.ss.android.ugc.aweme.story.base.c.a.a.w) {
                                if (CollectionUtils.isEmpty(dVar.getStoryViewerList())) {
                                    isHasMore = false;
                                }
                                if (!isHasMore) {
                                    CommentFragment.this.f4113c.showLoadMoreEmpty();
                                } else {
                                    CommentFragment.this.f4113c.resetLoadMoreState();
                                }
                                if (CollectionUtils.isEmpty(CommentFragment.this.f4113c.getData())) {
                                    arrayList = new ArrayList();
                                } else {
                                    arrayList = new ArrayList(CommentFragment.this.f4113c.getData());
                                }
                                arrayList.addAll(dVar.getStoryViewerList());
                                CommentFragment.this.f4113c.setDataAfterLoadMore(CommentFragment.this.a((List<com.ss.android.ugc.aweme.story.comment.model.c>) arrayList));
                            } else {
                                CommentFragment.this.f4113c.setShowFooter(true);
                                if (!isHasMore) {
                                    CommentFragment.this.f4113c.showLoadMoreEmpty();
                                } else {
                                    CommentFragment.this.f4113c.resetLoadMoreState();
                                }
                                CommentFragment.this.f4113c.setData(CommentFragment.this.a(dVar.getStoryViewerList()));
                                CommentFragment.this.g.b();
                            }
                            if (!CollectionUtils.isEmpty(dVar.getStoryViewerList())) {
                                CommentFragment.this.f4112b.a("viewer_count", (Object) CommentFragment.this.a(dVar));
                            }
                        }
                    }
                });
                this.j.f72128c.observe(this, new Observer<com.ss.android.ugc.aweme.story.base.c.a.a>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72226a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        com.ss.android.ugc.aweme.story.base.c.a.a aVar = (com.ss.android.ugc.aweme.story.base.c.a.a) obj;
                        if (PatchProxy.isSupport(new Object[]{aVar}, this, f72226a, false, 82969, new Class[]{com.ss.android.ugc.aweme.story.base.c.a.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aVar}, this, f72226a, false, 82969, new Class[]{com.ss.android.ugc.aweme.story.base.c.a.a.class}, Void.TYPE);
                            return;
                        }
                        if (aVar != null) {
                            b bVar = aVar.f71934b;
                            if (bVar == b.VIEWER_LOADING_MORE) {
                                CommentFragment.this.f4113c.showLoadMoreLoading();
                            } else if (bVar == b.VIEWER_LOADING_MORE_EMPTY) {
                                if (CommentFragment.this.f4113c.mShowFooter) {
                                    CommentFragment.this.f4113c.setShowFooter(false);
                                    CommentFragment.this.f4113c.notifyDataSetChanged();
                                    return;
                                }
                                CommentFragment.this.g.e();
                            } else if (bVar == b.VIEWER_LOADING_MORE_FAILED) {
                                CommentFragment.this.f4113c.showLoadMoreError();
                            } else if (bVar == b.VIEWER_LOADING_MORE_SUCCESS) {
                                if (!CommentFragment.this.f4113c.f72261b) {
                                    CommentFragment.this.f4113c.setShowFooter(true);
                                }
                            } else if (bVar == b.VIEWER_REFRESHING) {
                                CommentFragment.this.g.d();
                            } else if (bVar == b.VIEWER_REFRESHING_EMPTY) {
                                CommentFragment.this.g.e();
                            } else if (bVar == b.VIEWER_REFRESHING_FAILED) {
                                CommentFragment.this.g.a(false);
                            } else if (bVar == b.VIEWER_REFRESHING_SUCCESS) {
                                CommentFragment.this.g.setVisibility(8);
                                CommentFragment.this.f4113c.setShowFooter(true);
                            }
                        }
                    }
                });
                this.j.f72201e = this.k;
                this.j.a();
            }
        }
        return inflate;
    }
}
