package com.bytedance.android.livesdk.effect;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterListItemDecoration;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class LiveFilterFragment extends BaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13700a;

    /* renamed from: b  reason: collision with root package name */
    LiveFilterAdapter.a f13701b;

    /* renamed from: c  reason: collision with root package name */
    List<FilterModel> f13702c;
    boolean h;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13700a, false, 8154, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13700a, false, 8154, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ahu, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f13700a, false, 8155, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f13700a, false, 8155, new Class[]{View.class}, Void.TYPE);
        } else {
            final RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0906R.id.ca8);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            if (this.h) {
                recyclerView.addItemDecoration(new LiveFilterListItemDecoration());
            }
            recyclerView.setAdapter(new LiveFilterAdapter(getContext(), this.f13702c, new e(this), this.h));
            recyclerView.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13703a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f13703a, false, 8157, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f13703a, false, 8157, new Class[0], Void.TYPE);
                        return;
                    }
                    recyclerView.scrollToPosition(((Integer) b.E.a()).intValue());
                }
            });
        }
        return inflate;
    }
}
