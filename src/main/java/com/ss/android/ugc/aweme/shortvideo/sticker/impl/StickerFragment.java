package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurVideoRecordModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.w.b.a;
import org.json.JSONObject;

public class StickerFragment extends Fragment {
    public static ChangeQuickRedirect g;

    /* renamed from: a  reason: collision with root package name */
    private fh f69642a;
    protected int h;
    protected RecyclerView.RecycledViewPool i;
    protected EffectStickerManager j;
    protected String k;
    protected RecyclerView l;
    protected GridLayoutManager m;
    protected a.C0799a n;
    protected DmtStatusView o;

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, g, false, 79208, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, g, false, 79208, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 79210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 79210, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 79209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 79209, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, g, false, 79211, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, g, false, 79211, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    private int a() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 79204, new Class[0], Integer.TYPE)) {
            return ((CurVideoRecordModel) ViewModelProviders.of(getActivity()).get(CurVideoRecordModel.class)).f70250a;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, g, false, 79204, new Class[0], Integer.TYPE)).intValue();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 79207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 79207, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.l.clearOnScrollListeners();
    }

    public final JSONObject e() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 79205, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, g, false, 79205, new Class[0], JSONObject.class);
        }
        t tVar = new t();
        if (this.j.a().equals("livestreaming")) {
            str = "live_set";
        } else {
            str = "shoot_page";
        }
        t a2 = tVar.a("position", str);
        if (a() == 1) {
            a2.a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else if (a() == 2) {
            a2.a("is_photo", PushConstants.PUSH_TYPE_NOTIFY);
        }
        return a2.a();
    }

    public final d f() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 79206, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, g, false, 79206, new Class[0], d.class);
        } else if (this.f69642a == null) {
            return null;
        } else {
            return d.a().a("enter_method", "click_main_panel").a("creation_id", this.f69642a.q).a("shoot_way", this.f69642a.r).a("draft_id", this.f69642a.v);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 79203, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 79203, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.m = new WrapGridLayoutManager(getContext(), 5, 1, false);
        this.l.setLayoutManager(this.m);
        this.l.setRecycledViewPool(this.i);
        this.l.setItemViewCacheSize(5);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, g, false, 79202, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, g, false, 79202, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.w3, viewGroup2, false);
        this.l = (RecyclerView) inflate.findViewById(C0906R.id.cvl);
        return inflate;
    }

    public final void a(EffectStickerManager effectStickerManager, String str, RecyclerView.RecycledViewPool recycledViewPool, int i2, @Nullable fh fhVar) {
        this.h = i2;
        this.k = str;
        this.i = recycledViewPool;
        this.j = effectStickerManager;
        this.f69642a = fhVar;
    }
}
