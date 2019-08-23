package com.ss.android.ugc.aweme.face2face;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.google.common.util.concurrent.q;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.face2face.net.Face2FaceApi;
import com.ss.android.ugc.aweme.face2face.net.b;
import com.ss.android.ugc.aweme.face2face.net.c;
import com.ss.android.ugc.aweme.face2face.net.d;
import com.ss.android.ugc.aweme.face2face.net.e;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceCommonNetViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceFinishViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceInviteStatusViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceNetStateViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceNoticeViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceTypeViewModel;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceUserListViewModel;
import com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.w.b.a;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class Face2FaceAddFriendActivity extends AmeSSActivity implements Observer<a<d>>, f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3097a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.poi.a f3098b;

    /* renamed from: c  reason: collision with root package name */
    private c f3099c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f3100d;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3097a, false, 39073, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3097a, false, 39073, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FaceAddFriendActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39070, new Class[0], Void.TYPE);
            return;
        }
        af.a((Context) this).b((f) this);
        af.a((Context) this).e();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39063, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        bg.d(this);
        af.a((Context) this).c(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39061, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FaceAddFriendActivity", "onResume", true);
        super.onResume();
        b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FaceAddFriendActivity", "onResume", false);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39059, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39059, new Class[0], Void.TYPE);
        } else if (this.f3098b != null) {
            this.f3099c = new c();
            this.f3099c.a(1).a().a((c.b) new b(this));
        }
    }

    public final void W_() {
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39058, new Class[0], Void.TYPE);
            return;
        }
        af.a((Context) this).c(this);
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39065, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.a f2 = af.a((Context) this).f();
        if (f2 != null) {
            if (this.f3098b == null) {
                this.f3098b = f2;
            } else if (!(this.f3098b.longitude == f2.longitude && this.f3098b.latitude == f2.latitude)) {
                this.f3098b = f2;
                if (this.f3099c == null) {
                    b();
                }
            }
        }
    }

    public void onStop() {
        q qVar;
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39062, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39062, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39060, new Class[0], Void.TYPE);
        } else if (this.f3099c != null) {
            c cVar = this.f3099c;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f43952a, false, 39145, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f43952a, false, 39145, new Class[0], Void.TYPE);
            } else if (cVar.f43953b == null || cVar.f43954c == null) {
                throw new RuntimeException("please call createTask method create polling task!");
            } else {
                cVar.f43953b.removeCallbacks(cVar.f43954c);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39066, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3098b != null) {
            Face2FaceCommonNetViewModel face2FaceCommonNetViewModel = (Face2FaceCommonNetViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceCommonNetViewModel.class);
            double d2 = this.f3098b.longitude;
            double d3 = this.f3098b.latitude;
            if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, Face2FaceApi.f43950a, true, 39134, new Class[]{Double.TYPE, Double.TYPE}, q.class)) {
                qVar = (q) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, Face2FaceApi.f43950a, true, 39134, new Class[]{Double.TYPE, Double.TYPE}, q.class);
            } else {
                qVar = ((Face2FaceApi.RealApi) Face2FaceApi.f43951b.create(Face2FaceApi.RealApi.class)).exitLocation(d2, d3);
            }
            face2FaceCommonNetViewModel.a(qVar).observe(this, new c(this));
        }
    }

    @Subscribe
    public void onNetStateChangeEvent(com.ss.android.ugc.aweme.qrcode.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3097a, false, 39071, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3097a, false, 39071, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE);
            return;
        }
        Face2FaceNetStateViewModel face2FaceNetStateViewModel = (Face2FaceNetStateViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceNetStateViewModel.class);
        if (PatchProxy.isSupport(new Object[0], face2FaceNetStateViewModel, Face2FaceNetStateViewModel.f44111a, false, 39281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], face2FaceNetStateViewModel, Face2FaceNetStateViewModel.f44111a, false, 39281, new Class[0], Void.TYPE);
            return;
        }
        face2FaceNetStateViewModel.f44112b.setValue(Boolean.valueOf(m.a().c()));
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        boolean z;
        Face2FaceInviteStatusViewModel face2FaceInviteStatusViewModel;
        boolean z2;
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3097a, false, 39064, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3097a, false, 39064, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3097a, false, 39072, new Class[]{a.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f3097a, false, 39072, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar == null || !(aVar.f76552e instanceof com.bytedance.frameworks.baselib.network.http.cronet.a.a)) {
            ((Face2FaceNetStateViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceNetStateViewModel.class)).a(true);
            z = false;
        } else {
            ((Face2FaceNetStateViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceNetStateViewModel.class)).a(false);
            z = true;
        }
        if (!z && e.a(this, aVar)) {
            if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39067, new Class[0], Face2FaceInviteStatusViewModel.class)) {
                face2FaceInviteStatusViewModel = (Face2FaceInviteStatusViewModel) PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39067, new Class[0], Face2FaceInviteStatusViewModel.class);
            } else {
                face2FaceInviteStatusViewModel = (Face2FaceInviteStatusViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceInviteStatusViewModel.class);
            }
            if (face2FaceInviteStatusViewModel.f44110a <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            face2FaceInviteStatusViewModel.f44110a--;
            if (face2FaceInviteStatusViewModel.f44110a < 0) {
                face2FaceInviteStatusViewModel.f44110a = 0;
            }
            if (z2) {
                ((Face2FaceUserListViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceUserListViewModel.class)).a(((d) aVar.f76549b).f43966b);
            }
            Face2FaceNoticeViewModel face2FaceNoticeViewModel = (Face2FaceNoticeViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceNoticeViewModel.class);
            List<b> list = ((d) aVar.f76549b).f43967c;
            if (PatchProxy.isSupport(new Object[]{list}, face2FaceNoticeViewModel, Face2FaceNoticeViewModel.f44114a, false, 39283, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, face2FaceNoticeViewModel, Face2FaceNoticeViewModel.f44114a, false, 39283, new Class[]{List.class}, Void.TYPE);
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                face2FaceNoticeViewModel.f44115b.setValue(list);
            } else {
                face2FaceNoticeViewModel.f44115b.postValue(list);
            }
            if (((d) aVar.f76549b).f43965a) {
                c();
            }
        }
        this.f3099c.b();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        Face2FaceAddFriendFragment face2FaceAddFriendFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3097a, false, 39057, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3097a, false, 39057, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FaceAddFriendActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ba);
        this.f3100d = new SafeHandler(this);
        bg.c(this);
        Face2FaceTypeViewModel face2FaceTypeViewModel = (Face2FaceTypeViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceTypeViewModel.class);
        int intExtra = getIntent().getIntExtra("face_two_face_type", 65281);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intExtra)}, face2FaceTypeViewModel, Face2FaceTypeViewModel.f44116a, false, 39284, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Face2FaceTypeViewModel face2FaceTypeViewModel2 = face2FaceTypeViewModel;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intExtra)}, face2FaceTypeViewModel2, Face2FaceTypeViewModel.f44116a, false, 39284, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            face2FaceTypeViewModel.f44117b.setValue(Integer.valueOf(intExtra));
        }
        ((Face2FaceFinishViewModel) ViewModelProviders.of((FragmentActivity) this).get(Face2FaceFinishViewModel.class)).f44108b.observe(this, new a(this));
        ((StatusStoreViewModel) ViewModelProviders.of((FragmentActivity) this).get(StatusStoreViewModel.class)).b("enter_from", getIntent().getStringExtra("face_to_face_enter_from"));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (((Face2FaceAddFriendFragment) supportFragmentManager.findFragmentById(C0906R.id.abp)) == null) {
            if (PatchProxy.isSupport(new Object[0], null, Face2FaceAddFriendFragment.f43889a, true, 39080, new Class[0], Face2FaceAddFriendFragment.class)) {
                face2FaceAddFriendFragment = (Face2FaceAddFriendFragment) PatchProxy.accessDispatch(new Object[0], null, Face2FaceAddFriendFragment.f43889a, true, 39080, new Class[0], Face2FaceAddFriendFragment.class);
            } else {
                face2FaceAddFriendFragment = new Face2FaceAddFriendFragment();
            }
            supportFragmentManager.beginTransaction().add((int) C0906R.id.abp, (Fragment) face2FaceAddFriendFragment).commit();
        }
        ImmersionBar.with((Activity) this).transparentNavigationBar().statusBarColor((int) C0906R.color.bq);
        this.f3098b = af.a((Context) this).f();
        if (PatchProxy.isSupport(new Object[0], this, f3097a, false, 39069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3097a, false, 39069, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.face2face.b.a aVar = (com.ss.android.ugc.aweme.face2face.b.a) com.ss.android.ugc.aweme.base.sharedpref.c.a(com.ss.android.ugc.aweme.base.utils.d.a(), com.ss.android.ugc.aweme.face2face.b.a.class);
            if (PatchProxy.isSupport(new Object[]{this}, null, l.f43945a, true, 39100, new Class[]{Context.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{this}, null, l.f43945a, true, 39100, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                z = ((LocationManager) getSystemService("location")).isProviderEnabled("gps");
            }
            if (z || aVar.a()) {
                c();
            } else {
                this.f3100d.post(new d(this, aVar));
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FaceAddFriendActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.face2face.b.a aVar, DialogInterface dialogInterface) {
        c();
        aVar.a(true);
        dialogInterface.dismiss();
    }

    public static void a(@NonNull Context context, int i, @NonNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, 65281, str2}, null, f3097a, true, 39056, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, 65281, str2}, null, f3097a, true, 39056, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, Face2FaceAddFriendActivity.class);
        intent.putExtra("face_two_face_type", 65281);
        intent.putExtra("face_to_face_enter_from", str2);
        context2.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f3097a, false, 39068, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f3097a, false, 39068, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 65281) {
            c();
        }
    }
}
