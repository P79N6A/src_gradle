package com.ss.android.ugc.aweme.face2face.widget;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.face2face.Face2FaceFriendDialogFragment;
import com.ss.android.ugc.aweme.face2face.net.f;
import com.ss.android.ugc.aweme.face2face.ui.Face2FaceFriendsAdapter;
import com.ss.android.ugc.aweme.face2face.ui.Face2FaceFriendsItemAnimator;
import com.ss.android.ugc.aweme.face2face.ui.Face2FaceFriendsItemDecoration;
import com.ss.android.ugc.aweme.face2face.ui.Face2FaceUserDiffCallback;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceTypeViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Face2FaceFriendsWidget implements LifecycleObserver, Observer<List<f>>, Face2FaceFriendsAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44134a;

    /* renamed from: b  reason: collision with root package name */
    private int f44135b = 65281;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f44136c;

    /* renamed from: d  reason: collision with root package name */
    private FragmentActivity f44137d;

    /* renamed from: e  reason: collision with root package name */
    private Face2FaceFriendsAdapter f44138e;

    public final void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44134a, false, 39315, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44134a, false, 39315, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f44136c;
        if (!z) {
            i = 4;
        }
        recyclerView.setVisibility(i);
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        List list;
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f44134a, false, 39316, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f44134a, false, 39316, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{list2}, this, f44134a, false, 39314, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f44134a, false, 39314, new Class[]{List.class}, Void.TYPE);
        } else {
            Face2FaceFriendsAdapter face2FaceFriendsAdapter = this.f44138e;
            if (list2 == null) {
                list = new ArrayList();
            } else {
                list = list2;
            }
            if (PatchProxy.isSupport(new Object[]{list}, face2FaceFriendsAdapter, Face2FaceFriendsAdapter.f44032a, false, 39239, new Class[]{List.class}, Void.TYPE)) {
                Face2FaceFriendsAdapter face2FaceFriendsAdapter2 = face2FaceFriendsAdapter;
                PatchProxy.accessDispatch(new Object[]{list}, face2FaceFriendsAdapter2, Face2FaceFriendsAdapter.f44032a, false, 39239, new Class[]{List.class}, Void.TYPE);
            } else {
                List<T> a2 = az.a((Iterable<? extends E>) list);
                if (!CollectionUtils.isEmpty(a2)) {
                    a2 = az.a(a2);
                    a2.add(0, face2FaceFriendsAdapter.f44033b);
                    a2.add(face2FaceFriendsAdapter.f44034c);
                }
                DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new Face2FaceUserDiffCallback(face2FaceFriendsAdapter.f44035d, a2));
                face2FaceFriendsAdapter.f44035d = a2;
                calculateDiff.dispatchUpdatesTo((RecyclerView.Adapter) face2FaceFriendsAdapter);
            }
        }
        if (Lists.isEmpty(list2)) {
            a(false);
        } else {
            a(true);
        }
    }

    public Face2FaceFriendsWidget(@NonNull FragmentActivity fragmentActivity, @NonNull RecyclerView recyclerView) {
        this.f44137d = fragmentActivity;
        this.f44136c = recyclerView;
        fragmentActivity.getLifecycle().addObserver(this);
        if (PatchProxy.isSupport(new Object[0], this, f44134a, false, 39313, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44134a, false, 39313, new Class[0], Void.TYPE);
            return;
        }
        MediatorLiveData<Integer> mediatorLiveData = ((Face2FaceTypeViewModel) ViewModelProviders.of(this.f44137d).get(Face2FaceTypeViewModel.class)).f44117b;
        if (mediatorLiveData.getValue() != null) {
            this.f44135b = ((Integer) mediatorLiveData.getValue()).intValue();
        }
        this.f44136c.setLayoutManager(new WrapLinearLayoutManager(this.f44136c.getContext()));
        this.f44136c.addItemDecoration(new Face2FaceFriendsItemDecoration((int) UIUtils.dip2Px(this.f44136c.getContext(), 12.0f)));
        this.f44136c.setItemAnimator(new Face2FaceFriendsItemAnimator());
        this.f44138e = new Face2FaceFriendsAdapter(this.f44135b);
        this.f44138e.f44036e = this;
        this.f44136c.setAdapter(this.f44138e);
    }

    public final void a(View view, f fVar, int i) {
        Face2FaceFriendDialogFragment face2FaceFriendDialogFragment;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{view, fVar2, Integer.valueOf(i)}, this, f44134a, false, 39317, new Class[]{View.class, f.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, fVar2, Integer.valueOf(i)}, this, f44134a, false, 39317, new Class[]{View.class, f.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f44135b == 65281) {
            if (PatchProxy.isSupport(new Object[]{fVar2}, null, Face2FaceFriendDialogFragment.f43895a, true, 39094, new Class[]{f.class}, Face2FaceFriendDialogFragment.class)) {
                face2FaceFriendDialogFragment = (Face2FaceFriendDialogFragment) PatchProxy.accessDispatch(new Object[]{fVar2}, null, Face2FaceFriendDialogFragment.f43895a, true, 39094, new Class[]{f.class}, Face2FaceFriendDialogFragment.class);
            } else {
                Bundle bundle = new Bundle();
                bundle.putSerializable("face_to_face_user", fVar2);
                Face2FaceFriendDialogFragment face2FaceFriendDialogFragment2 = new Face2FaceFriendDialogFragment();
                face2FaceFriendDialogFragment2.setArguments(bundle);
                face2FaceFriendDialogFragment = face2FaceFriendDialogFragment2;
            }
            face2FaceFriendDialogFragment.show(this.f44137d.getSupportFragmentManager(), "Face2FaceFriendDialogFragment");
        }
        r.a("head_click", (Map) d.a().a("to_user_id", fVar.getUser().getUid()).a("event_type", "spring_festival").a("enter_from", "face_to_face").f34114b);
    }
}
