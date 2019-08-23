package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LocalLiveWallPaperActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53730a;

    /* renamed from: b  reason: collision with root package name */
    private LocalLiveWallPaperActivity f53731b;

    /* renamed from: c  reason: collision with root package name */
    private View f53732c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f53730a, false, 56252, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53730a, false, 56252, new Class[0], Void.TYPE);
            return;
        }
        LocalLiveWallPaperActivity localLiveWallPaperActivity = this.f53731b;
        if (localLiveWallPaperActivity != null) {
            this.f53731b = null;
            localLiveWallPaperActivity.mTitle = null;
            localLiveWallPaperActivity.mWallPapersRecyclerView = null;
            localLiveWallPaperActivity.mLayoutEmpty = null;
            this.f53732c.setOnClickListener(null);
            this.f53732c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public LocalLiveWallPaperActivity_ViewBinding(final LocalLiveWallPaperActivity localLiveWallPaperActivity, View view) {
        this.f53731b = localLiveWallPaperActivity;
        localLiveWallPaperActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        localLiveWallPaperActivity.mWallPapersRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.ccc, "field 'mWallPapersRecyclerView'", RecyclerView.class);
        localLiveWallPaperActivity.mLayoutEmpty = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.b8j, "field 'mLayoutEmpty'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'exit'");
        this.f53732c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53733a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f53733a, false, 56253, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f53733a, false, 56253, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                localLiveWallPaperActivity.exit(view2);
            }
        });
    }
}
