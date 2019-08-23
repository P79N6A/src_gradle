package com.ss.android.ugc.aweme.poi.ui.comment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.poi.a.f;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.o;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;

public class PoiCommentDetailFragment extends AbsPoiCommentFragment {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f60552d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayoutManager f60553e;

    /* renamed from: f  reason: collision with root package name */
    private o f60554f;
    private PoiAwemeFeedAdapter g;
    @BindView(2131498525)
    protected RecyclerView mRecyclerView;

    public final String a() {
        return "poi_single_comment";
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f60552d, false, 66253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60552d, false, 66253, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    @OnClick({2131493213})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60552d, false, 66252, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60552d, false, 66252, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.ix) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f60552d, false, 66249, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f60552d, false, 66249, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (PatchProxy.isSupport(new Object[]{arguments}, this, f60552d, false, 66247, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arguments}, this, f60552d, false, 66247, new Class[]{Bundle.class}, Void.TYPE);
        } else if (arguments != null) {
            this.f60554f = (o) arguments.getSerializable("EXTRA_COMMENT_ITEM");
            this.f60546c = (c) arguments.getSerializable("EXTRA_POI_BUNDLE");
        }
        this.f60553e = new WrapLinearLayoutManager(getContext());
        this.f60553e.setOrientation(1);
        this.mRecyclerView.setLayoutManager(this.f60553e);
        if (PatchProxy.isSupport(new Object[0], this, f60552d, false, 66250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60552d, false, 66250, new Class[0], Void.TYPE);
        } else {
            this.g = new PoiAwemeFeedAdapter(this.mRecyclerView, null, null);
            this.g.B = 0;
            this.g.h = this.f60546c;
            this.g.z = this;
            this.g.r = new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60555a;

                public final Object a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f60555a, false, 66257, new Class[0], Object.class)) {
                        return null;
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f60555a, false, 66257, new Class[0], Object.class);
                }

                public final String e() {
                    return "key_container_poi";
                }

                public final boolean b() {
                    if (!PatchProxy.isSupport(new Object[0], this, f60555a, false, 66254, new Class[0], Boolean.TYPE)) {
                        return PoiCommentDetailFragment.this.isViewValid();
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60555a, false, 66254, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final boolean c() {
                    if (!PatchProxy.isSupport(new Object[0], this, f60555a, false, 66255, new Class[0], Boolean.TYPE)) {
                        return PoiCommentDetailFragment.this.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED);
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60555a, false, 66255, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final Context d() {
                    if (!PatchProxy.isSupport(new Object[0], this, f60555a, false, 66256, new Class[0], Context.class)) {
                        return PoiCommentDetailFragment.this.getActivity();
                    }
                    return (Context) PatchProxy.accessDispatch(new Object[0], this, f60555a, false, 66256, new Class[0], Context.class);
                }
            };
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f60554f);
            if (!StringUtils.isEmpty(this.f60554f.url)) {
                arrayList.add(new f(this.f60554f.url));
            }
            this.g.setData(arrayList);
            this.mRecyclerView.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60557a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f60557a, false, 66258, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f60557a, false, 66258, new Class[0], Void.TYPE);
                        return;
                    }
                    AnonymousClass1 r1 = new LinearSmoothScroller(PoiCommentDetailFragment.this.mRecyclerView.getContext()) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60559a;

                        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
                            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60559a, false, 66259, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                                return super.calculateDtToFit(i, i2, i3, i4, -1);
                            }
                            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60559a, false, 66259, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                        }
                    };
                    r1.setTargetPosition(0);
                    PoiCommentDetailFragment.this.f60553e.startSmoothScroll(r1);
                }
            });
        }
        this.mRecyclerView.setAdapter(this.g);
        if (PatchProxy.isSupport(new Object[0], this, f60552d, false, 66251, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60552d, false, 66251, new Class[0], Void.TYPE);
            return;
        }
        h.b(this.f60546c, "show", d.a().a("enter_from", "poi_page").a("previous_page", "poi_page").a("poi_id", this.f60554f.getPoiId()).a("content_type", "comment"));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f60552d, false, 66248, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ph, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f60552d, false, 66248, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
