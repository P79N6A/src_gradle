package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
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
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.HashSet;

public class InfoStickerFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f69688d;

    /* renamed from: a  reason: collision with root package name */
    private HashSet<String> f69689a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private EffectChannelResponse f69690b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f69691c = false;

    /* renamed from: e  reason: collision with root package name */
    protected InfoStickerAdapterV2 f69692e;

    /* renamed from: f  reason: collision with root package name */
    protected RecyclerView f69693f;
    protected DmtStatusView g;
    protected String h;
    protected GridLayoutManager i;
    protected a.C0799a j;
    public boolean k;

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69688d, false, 79281, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69688d, false, 79281, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79283, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79282, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69688d, false, 79284, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69688d, false, 79284, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79275, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InfoStickerModule.a(activity).a("infostickerv2").observe(activity, new j(this));
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79274, new Class[0], Void.TYPE);
            return;
        }
        e();
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79277, new Class[0], Void.TYPE);
        } else if (this.f69690b == null) {
            this.g.e();
        } else {
            this.g.b();
            this.f69692e.a(this.f69690b);
        }
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79276, new Class[0], Void.TYPE);
        } else if (this.j == a.C0799a.LOADING) {
            this.g.d();
        } else if (this.j == a.C0799a.ERROR) {
            this.g.f();
        } else {
            if (this.j == a.C0799a.SUCCESS) {
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79278, new Class[0], Void.TYPE);
        } else if (this.f69690b != null) {
            int min = Math.min(this.i.findLastVisibleItemPosition() - this.i.findFirstVisibleItemPosition(), this.f69690b.allCategoryEffects.size());
            if (min > 0 && getActivity() != null) {
                InfoStickerModule.a(getActivity()).a(this.f69690b.allCategoryEffects.subList(0, min), false);
            }
        }
        f();
    }

    public void a() {
        g gVar;
        InfoStickerAdapterV2 infoStickerAdapterV2;
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79273, new Class[0], Void.TYPE);
            return;
        }
        this.i = new WrapGridLayoutManager(getContext(), 3, 1, false);
        this.f69693f.setItemViewCacheSize(3);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof g) {
            gVar = (g) requireActivity;
        } else {
            gVar = g.f69825a;
        }
        this.f69693f.setLayoutManager(this.i);
        if (this.f69693f.getAdapter() == null) {
            String str = this.h;
            if (PatchProxy.isSupport(new Object[]{str}, this, f69688d, false, 79280, new Class[]{String.class}, InfoStickerAdapterV2.class)) {
                infoStickerAdapterV2 = (InfoStickerAdapterV2) PatchProxy.accessDispatch(new Object[]{str}, this, f69688d, false, 79280, new Class[]{String.class}, InfoStickerAdapterV2.class);
            } else {
                infoStickerAdapterV2 = new InfoStickerAdapterV2(getActivity(), str);
            }
            this.f69692e = infoStickerAdapterV2;
            this.f69692e.j = gVar;
            this.f69693f.setAdapter(this.f69692e);
        } else {
            this.f69692e = (InfoStickerAdapterV2) this.f69693f.getAdapter();
            this.f69692e.j = gVar;
        }
        e();
        this.f69692e.setShowFooter(false);
        this.f69692e.f69673c = this.k;
        this.f69693f.post(new i(this));
        this.f69693f.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69694a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f69694a, false, 79288, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f69694a, false, 79288, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    InfoStickerFragment.this.f();
                }
            }
        });
    }

    public final void f() {
        ah ahVar;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f69688d, false, 79279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69688d, false, 79279, new Class[0], Void.TYPE);
        } else if (this.i != null && getActivity() != null) {
            int findFirstVisibleItemPosition = this.i.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.i.findLastVisibleItemPosition();
            cb cbVar = InfoStickerModule.a(getActivity()).f69785d;
            if (cbVar != null) {
                for (int i2 = findFirstVisibleItemPosition + 1; i2 < findLastVisibleItemPosition + 1; i2++) {
                    InfoStickerAdapterV2 infoStickerAdapterV2 = this.f69692e;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, infoStickerAdapterV2, InfoStickerAdapterV2.f69678d, false, 79252, new Class[]{Integer.TYPE}, ah.class)) {
                        InfoStickerAdapterV2 infoStickerAdapterV22 = infoStickerAdapterV2;
                        ahVar = (ah) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, infoStickerAdapterV22, InfoStickerAdapterV2.f69678d, false, 79252, new Class[]{Integer.TYPE}, ah.class);
                    } else {
                        ahVar = infoStickerAdapterV2.h.get(i2);
                    }
                    if (ahVar != null && !this.f69689a.contains(ahVar.f69295b.effect_id)) {
                        String str2 = ahVar.f69295b.effect_id;
                        com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                        d a2 = d.a().a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR).a("prop_id", str2).a("enter_method", "click_main_panel").a("creation_id", cbVar.creationId).a("shoot_way", cbVar.mShootWay).a("draft_id", cbVar.draftId);
                        if (this.k) {
                            str = "edit_post_page";
                        } else {
                            str = "video_edit_page";
                        }
                        aVar.a("prop_show", a2.a("enter_from", str).f34114b);
                        this.f69689a.add(str2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(a aVar) {
        if (aVar != null) {
            this.j = aVar.f76550c;
            this.f69690b = (EffectChannelResponse) aVar.f76549b;
            c();
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69688d, false, 79272, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69688d, false, 79272, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        a();
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f69688d, false, 79271, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f69688d, false, 79271, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.w3, viewGroup2, false);
        this.f69693f = (RecyclerView) inflate.findViewById(C0906R.id.cvl);
        this.g = (DmtStatusView) inflate.findViewById(C0906R.id.aui);
        this.g.setBuilder(DmtStatusView.a.a(getContext()).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new h(this)).a((int) C0906R.string.b5r, (int) C0906R.string.dmu).c(1));
        this.g.setVisibility(0);
        return inflate;
    }
}
