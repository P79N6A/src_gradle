package com.ss.android.ugc.aweme.live.authentication.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.live.authentication.LiveBroadcastAuthenticateActivity;
import com.ss.android.ugc.aweme.live.authentication.adapter.AuthenticationAdapter;
import com.ss.android.ugc.aweme.live.authentication.model.b;
import com.ss.android.ugc.aweme.live.model.LiveVerifyChecklist;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class LiveAuthenticationFragment extends AmeBaseFragment implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53315a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f53316b;

    /* renamed from: c  reason: collision with root package name */
    private Button f53317c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f53318d;

    /* renamed from: e  reason: collision with root package name */
    private AuthenticationAdapter f53319e;

    /* renamed from: f  reason: collision with root package name */
    private List<Boolean> f53320f = new ArrayList();

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53315a, false, 55624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53315a, false, 55624, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    public final void a(LiveVerifyChecklist liveVerifyChecklist) {
        if (PatchProxy.isSupport(new Object[]{liveVerifyChecklist}, this, f53315a, false, 55626, new Class[]{LiveVerifyChecklist.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{liveVerifyChecklist}, this, f53315a, false, 55626, new Class[]{LiveVerifyChecklist.class}, Void.TYPE);
        } else if (liveVerifyChecklist != null) {
            this.f53320f.clear();
            this.f53320f.add(Boolean.valueOf(b.a(liveVerifyChecklist.realname_verify)));
            this.f53320f.add(Boolean.valueOf(liveVerifyChecklist.is_phone_binded));
            this.f53319e.setData(this.f53320f);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f53315a, false, 55625, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f53315a, false, 55625, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.gn) {
            getActivity().onBackPressed();
            return;
        }
        if (view.getId() == C0906R.id.gq) {
            ((LiveBroadcastAuthenticateActivity) getActivity()).a();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f53315a, false, 55623, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f53315a, false, 55623, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f53316b = (ImageView) view.findViewById(C0906R.id.gn);
        this.f53317c = (Button) view.findViewById(C0906R.id.gq);
        this.f53318d = (RecyclerView) view.findViewById(C0906R.id.gs);
        this.f53316b.setOnClickListener(this);
        this.f53317c.setOnClickListener(this);
        this.f53319e = new AuthenticationAdapter();
        this.f53318d.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.f53318d.setAdapter(this.f53319e);
        this.f53318d.addItemDecoration(new RecyclerView.ItemDecoration() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53321a;

            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Rect rect2 = rect;
                View view2 = view;
                RecyclerView recyclerView2 = recyclerView;
                if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f53321a, false, 55627, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                    Object[] objArr = {rect2, view2, recyclerView2, state};
                    Object[] objArr2 = objArr;
                    PatchProxy.accessDispatch(objArr2, this, f53321a, false, 55627, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                    return;
                }
                if (recyclerView2.getChildPosition(view2) > 0) {
                    rect2.top = (int) UIUtils.dip2Px(LiveAuthenticationFragment.this.getContext(), 12.0f);
                }
            }
        });
        a(b.a().f53325b);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f53315a, false, 55622, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.n4, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f53315a, false, 55622, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
