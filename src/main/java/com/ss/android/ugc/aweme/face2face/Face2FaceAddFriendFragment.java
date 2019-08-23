package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.face2face.net.b;
import com.ss.android.ugc.aweme.face2face.net.f;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceNetStateViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceNoticeViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceTypeViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceUserListViewModel;
import com.ss.android.ugc.aweme.face2face.widget.Face2FaceAvatarWidget;
import com.ss.android.ugc.aweme.face2face.widget.Face2FaceFriendsWidget;
import com.ss.android.ugc.aweme.face2face.widget.Face2FaceNoticeWidget;
import com.ss.android.ugc.aweme.face2face.widget.Face2FaceTitleWidget;
import java.util.Iterator;
import java.util.List;

public class Face2FaceAddFriendFragment extends Fragment implements Face2FaceAvatarWidget.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43889a;

    /* renamed from: b  reason: collision with root package name */
    Face2FaceTitleWidget f43890b;

    /* renamed from: c  reason: collision with root package name */
    Face2FaceFriendsWidget f43891c;

    /* renamed from: d  reason: collision with root package name */
    Face2FaceAvatarWidget f43892d;

    /* renamed from: e  reason: collision with root package name */
    LiveData<List<f>> f43893e;

    /* renamed from: f  reason: collision with root package name */
    private Face2FaceNoticeWidget f43894f;
    private Handler g;

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43889a, false, 39085, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43889a, false, 39085, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f43889a, false, 39087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43889a, false, 39087, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f43889a, false, 39086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43889a, false, 39086, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43889a, false, 39088, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43889a, false, 39088, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43889a, false, 39083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43889a, false, 39083, new Class[0], Void.TYPE);
            return;
        }
        this.f43891c.a(true);
        this.g.post(new j(this));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f43889a, false, 39084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43889a, false, 39084, new Class[0], Void.TYPE);
            return;
        }
        this.g.post(new k(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list) {
        Face2FaceNoticeWidget face2FaceNoticeWidget = this.f43894f;
        if (PatchProxy.isSupport(new Object[]{list}, face2FaceNoticeWidget, Face2FaceNoticeWidget.f3104a, false, 39319, new Class[]{List.class}, Void.TYPE)) {
            Face2FaceNoticeWidget face2FaceNoticeWidget2 = face2FaceNoticeWidget;
            PatchProxy.accessDispatch(new Object[]{list}, face2FaceNoticeWidget2, Face2FaceNoticeWidget.f3104a, false, 39319, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list)) {
            face2FaceNoticeWidget.f3106c.addAll(list);
            if (PatchProxy.isSupport(new Object[0], face2FaceNoticeWidget, Face2FaceNoticeWidget.f3104a, false, 39320, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], face2FaceNoticeWidget, Face2FaceNoticeWidget.f3104a, false, 39320, new Class[0], Void.TYPE);
            } else if (face2FaceNoticeWidget.f3105b != null && face2FaceNoticeWidget.f3105b.subType == 14) {
                Iterator<b> it2 = face2FaceNoticeWidget.f3106c.iterator();
                while (it2.hasNext()) {
                    b next = it2.next();
                    if (next.subType == 14 && TextUtils.equals(next.getFroInviteUser().uId, face2FaceNoticeWidget.f3105b.getFroInviteUser().uId)) {
                        it2.remove();
                    }
                }
            }
        }
        face2FaceNoticeWidget.b();
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43889a, false, 39082, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43889a, false, 39082, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (getView() != null && getActivity() != null) {
            NormalTitleBar normalTitleBar = (NormalTitleBar) ViewCompat.requireViewById(getView(), C0906R.id.bac);
            this.g = new SafeHandler(this);
            this.f43891c = new Face2FaceFriendsWidget(getActivity(), (RecyclerView) ViewCompat.requireViewById(getView(), C0906R.id.bcy));
            this.f43894f = new Face2FaceNoticeWidget(getActivity());
            this.f43890b = new Face2FaceTitleWidget(getActivity(), normalTitleBar);
            this.f43892d = new Face2FaceAvatarWidget(getActivity(), this, ViewCompat.requireViewById(getView(), C0906R.id.b7y), normalTitleBar);
            ((Face2FaceNoticeViewModel) ViewModelProviders.of(getActivity()).get(Face2FaceNoticeViewModel.class)).f44115b.observe(this, new g(this));
            ((Face2FaceTypeViewModel) ViewModelProviders.of(getActivity()).get(Face2FaceTypeViewModel.class)).f44117b.observe(this, new h(this));
            ((Face2FaceNetStateViewModel) ViewModelProviders.of(getActivity()).get(Face2FaceNetStateViewModel.class)).f44112b.observe(this, new i(this));
            this.f43893e = ((Face2FaceUserListViewModel) ViewModelProviders.of(getActivity()).get(Face2FaceUserListViewModel.class)).f44119b;
            this.f43893e.observe(this, this.f43892d);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43889a, false, 39081, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.no, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43889a, false, 39081, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
