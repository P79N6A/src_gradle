package com.ss.android.ugc.aweme.poi.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;

public class AbsPoiAwemeFeedFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60397a;

    /* renamed from: b  reason: collision with root package name */
    private AbsPoiAwemeFeedFragment f60398b;

    /* renamed from: c  reason: collision with root package name */
    private View f60399c;

    /* renamed from: d  reason: collision with root package name */
    private View f60400d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60397a, false, 65911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60397a, false, 65911, new Class[0], Void.TYPE);
            return;
        }
        AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment = this.f60398b;
        if (absPoiAwemeFeedFragment != null) {
            this.f60398b = null;
            absPoiAwemeFeedFragment.mStatusView = null;
            absPoiAwemeFeedFragment.mStartRecodeLayout = null;
            absPoiAwemeFeedFragment.mStartRecordOutRing = null;
            absPoiAwemeFeedFragment.mRecyclerView = null;
            this.f60399c.setOnClickListener(null);
            this.f60399c = null;
            this.f60400d.setOnClickListener(null);
            this.f60400d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AbsPoiAwemeFeedFragment_ViewBinding(final AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment, View view) {
        this.f60398b = absPoiAwemeFeedFragment;
        absPoiAwemeFeedFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cuy, "field 'mStatusView'", DmtStatusView.class);
        absPoiAwemeFeedFragment.mStartRecodeLayout = view.findViewById(C0906R.id.cup);
        absPoiAwemeFeedFragment.mStartRecordOutRing = view.findViewById(C0906R.id.cus);
        absPoiAwemeFeedFragment.mRecyclerView = (NestedScrollingRecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mRecyclerView'", NestedScrollingRecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'onClick'");
        this.f60399c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60401a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60401a, false, 65912, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60401a, false, 65912, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absPoiAwemeFeedFragment.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.cp9, "method 'onClick'");
        this.f60400d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60404a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60404a, false, 65913, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60404a, false, 65913, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absPoiAwemeFeedFragment.onClick(view2);
            }
        });
    }
}
