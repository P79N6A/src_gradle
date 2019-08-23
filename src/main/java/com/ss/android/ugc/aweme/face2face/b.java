package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.net.Face2FaceApi;
import com.ss.android.ugc.aweme.face2face.net.c;
import com.ss.android.ugc.aweme.face2face.net.d;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceViewModel;
import com.ss.android.ugc.aweme.w.b.a;

public final /* synthetic */ class b implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43923a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendActivity f43924b;

    b(Face2FaceAddFriendActivity face2FaceAddFriendActivity) {
        this.f43924b = face2FaceAddFriendActivity;
    }

    public final void a(c cVar) {
        LiveData liveData;
        q qVar;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f43923a, false, 39075, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f43923a, false, 39075, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Face2FaceAddFriendActivity face2FaceAddFriendActivity = this.f43924b;
        Face2FaceViewModel face2FaceViewModel = (Face2FaceViewModel) ViewModelProviders.of((FragmentActivity) face2FaceAddFriendActivity).get(Face2FaceViewModel.class);
        double d2 = face2FaceAddFriendActivity.f3098b.longitude;
        double d3 = face2FaceAddFriendActivity.f3098b.latitude;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, face2FaceViewModel, Face2FaceViewModel.f44120a, false, 39289, new Class[]{Double.TYPE, Double.TYPE}, LiveData.class)) {
            Face2FaceViewModel face2FaceViewModel2 = face2FaceViewModel;
            liveData = (LiveData) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, face2FaceViewModel2, Face2FaceViewModel.f44120a, false, 39289, new Class[]{Double.TYPE, Double.TYPE}, LiveData.class);
        } else {
            if (face2FaceViewModel.f44121b == null) {
                face2FaceViewModel.f44121b = new MutableLiveData<>();
            }
            if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, face2FaceViewModel, Face2FaceViewModel.f44120a, false, 39290, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE)) {
                Face2FaceViewModel face2FaceViewModel3 = face2FaceViewModel;
                PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, face2FaceViewModel3, Face2FaceViewModel.f44120a, false, 39290, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE);
            } else {
                Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
                if (PatchProxy.isSupport(objArr, null, Face2FaceApi.f43950a, true, 39129, new Class[]{Double.TYPE, Double.TYPE}, q.class)) {
                    qVar = (q) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, Face2FaceApi.f43950a, true, 39129, new Class[]{Double.TYPE, Double.TYPE}, q.class);
                } else {
                    qVar = ((Face2FaceApi.RealApi) Face2FaceApi.f43951b.create(Face2FaceApi.RealApi.class)).uploadLocation(d2, d3);
                }
                l.a(qVar, new k<d>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44122a;

                    public final void onFailure(Throwable th) {
                        Throwable th2 = th;
                        if (PatchProxy.isSupport(new Object[]{th2}, this, f44122a, false, 39292, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th2}, this, f44122a, false, 39292, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        Face2FaceViewModel.this.f44121b.setValue(a.a(a.C0799a.ERROR, th2));
                    }

                    public final /* synthetic */ void onSuccess(Object obj) {
                        d dVar = (d) obj;
                        if (PatchProxy.isSupport(new Object[]{dVar}, this, f44122a, false, 39291, new Class[]{d.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dVar}, this, f44122a, false, 39291, new Class[]{d.class}, Void.TYPE);
                            return;
                        }
                        Face2FaceViewModel.this.f44121b.setValue(a.a(a.C0799a.SUCCESS, dVar));
                    }
                }, com.ss.android.ugc.aweme.base.k.f34752b);
            }
            liveData = face2FaceViewModel.f44121b;
        }
        liveData.observe(face2FaceAddFriendActivity, face2FaceAddFriendActivity);
    }
}
