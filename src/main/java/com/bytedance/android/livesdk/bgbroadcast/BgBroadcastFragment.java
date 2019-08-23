package com.bytedance.android.livesdk.bgbroadcast;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.SlideFinishUtil;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.an;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.bgbroadcast.game.f;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.end.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.chatroom.event.ai;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.presenter.bu;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.IllegalReviewDialog;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.eo;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.h;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.live.d;
import com.bytedance.android.livesdk.message.model.ax;
import com.bytedance.android.livesdk.sticker.p;
import com.bytedance.android.livesdk.utils.ab;
import com.bytedance.android.livesdk.utils.u;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.model.a.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import org.aspectj.lang.a;

public class BgBroadcastFragment extends BaseFragment implements Observer<KVData>, n, d.a, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9140a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.a f9141b = null;

    /* renamed from: c  reason: collision with root package name */
    public Room f9142c;
    public DataCenter h;
    public AbsInteractionFragment i;
    public eo j;
    public d k;
    public b l;
    private boolean m;
    private boolean n;
    private com.bytedance.android.live.gift.d o = new com.bytedance.android.live.gift.d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9143a;

        public final void a(List<b> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f9143a, false, 3260, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f9143a, false, 3260, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (BgBroadcastFragment.this.f9142c != null && com.bytedance.android.live.uikit.a.a.a()) {
                p.a(BgBroadcastFragment.this.f9142c.getId());
            }
        }
    };
    private ServiceConnection p = new ServiceConnection() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9145a;

        public final void onServiceDisconnected(ComponentName componentName) {
            BgBroadcastFragment.this.f9141b = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (PatchProxy.isSupport(new Object[]{componentName, iBinder}, this, f9145a, false, 3261, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{componentName, iBinder}, this, f9145a, false, 3261, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE);
            } else if (BgBroadcastFragment.this.h != null) {
                BgBroadcastFragment.this.f9141b = (com.bytedance.android.livesdkapi.a) iBinder;
                if (BgBroadcastFragment.this.f9141b.isLiveFinished()) {
                    com.bytedance.android.live.core.c.a.a("BgBroadcastFragment", "room close onServiceConnected isLiveFinished");
                    BgBroadcastFragment.this.e();
                    return;
                }
                BgBroadcastFragment.this.f9141b.setLiveStatusListener(new k(this));
                if (BgBroadcastFragment.this.l != null && BgBroadcastFragment.this.l.g()) {
                    if (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.a()).intValue() == 0 && (BgBroadcastFragment.this.l instanceof f)) {
                        BgBroadcastFragment.this.f9141b.startStream(BgBroadcastFragment.this.l.h());
                    } else if (BgBroadcastFragment.this.l instanceof com.bytedance.android.livesdk.bgbroadcast.a.b) {
                        BgBroadcastFragment.this.f9141b.startStream(BgBroadcastFragment.this.l.h());
                    }
                }
                if (BgBroadcastFragment.this.f9142c != null) {
                    IMessageManager a2 = ab.a(BgBroadcastFragment.this.f9142c.getId(), false, BgBroadcastFragment.this.getContext());
                    if (BgBroadcastFragment.this.h != null) {
                        BgBroadcastFragment.this.h.lambda$put$1$DataCenter("data_message_manager", a2);
                    }
                }
                BgBroadcastFragment.this.d();
            }
        }
    };
    private com.bytedance.android.live.gift.d q = new com.bytedance.android.live.gift.d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9147a;

        public final void a(List<b> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f9147a, false, 3263, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f9147a, false, 3263, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (BgBroadcastFragment.this.f9142c != null && com.bytedance.android.live.uikit.a.a.a()) {
                p.a(BgBroadcastFragment.this.f9142c.getId());
            }
        }
    };
    private IllegalReviewDialog r;
    private boolean s;
    private int t;

    public final void a(boolean z, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f9140a, false, 3229, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, this, f9140a, false, 3229, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
        } else if (b_()) {
            p();
            this.j.a(z, str2);
        }
    }

    public final void a(boolean z, CharSequence charSequence, String str) {
        CharSequence charSequence2 = charSequence;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), charSequence2, str2}, this, f9140a, false, 3230, new Class[]{Boolean.TYPE, CharSequence.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), charSequence2, str2}, this, f9140a, false, 3230, new Class[]{Boolean.TYPE, CharSequence.class, String.class}, Void.TYPE);
        } else if (b_()) {
            p();
            this.j.a(z, charSequence2, str2);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9140a, false, 3231, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9140a, false, 3231, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (b_() && this.j != null) {
            p();
            if (z) {
                this.j.setCancelable(false);
                this.j.show();
                this.j.a((View.OnClickListener) new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f9149a;

                    /* renamed from: c  reason: collision with root package name */
                    private static final /* synthetic */ a.C0900a f9150c;

                    static {
                        if (PatchProxy.isSupport(new Object[0], null, f9149a, true, 3265, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], null, f9149a, true, 3265, new Class[0], Void.TYPE);
                            return;
                        }
                        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("BgBroadcastFragment.java", AnonymousClass4.class);
                        f9150c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.bgbroadcast.BgBroadcastFragment$4", "android.view.View", NotifyType.VIBRATE, "", "void"), 505);
                    }

                    public void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f9149a, false, 3264, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f9149a, false, 3264, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f9150c, this, this, view));
                        if (BgBroadcastFragment.this.k != null) {
                            BgBroadcastFragment.this.k.a();
                            BgBroadcastFragment.this.j.dismiss();
                        }
                    }
                });
                this.j.f12180b = new eo.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f9152a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f9152a, false, 3266, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f9152a, false, 3266, new Class[0], Void.TYPE);
                            return;
                        }
                        com.bytedance.android.live.uikit.d.a.a(BgBroadcastFragment.this.getContext(), ac.a((int) C0906R.string.d9e), 1);
                    }
                };
                this.j.f12181c = new eo.c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f9154a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f9154a, false, 3267, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f9154a, false, 3267, new Class[0], Void.TYPE);
                            return;
                        }
                        com.bytedance.android.live.uikit.d.a.a(BgBroadcastFragment.this.getContext(), ac.a((int) C0906R.string.d9e), 1);
                    }
                };
                return;
            }
            this.j.dismiss();
        }
    }

    public final void a(boolean z, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = charSequence2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), charSequence3, charSequence4}, this, f9140a, false, 3234, new Class[]{Boolean.TYPE, CharSequence.class, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), charSequence3, charSequence4}, this, f9140a, false, 3234, new Class[]{Boolean.TYPE, CharSequence.class, CharSequence.class}, Void.TYPE);
        } else if (b_() && this.i != null) {
            boolean z2 = z;
            this.i.a(z, charSequence3, charSequence4);
        }
    }

    public final boolean b_() {
        if (!this.m) {
            return true;
        }
        return false;
    }

    @Nullable
    public final /* synthetic */ Activity n() {
        return super.getActivity();
    }

    public final boolean f() {
        if (this.i == null || this.i.B == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        if (b_() && this.l != null) {
            this.l.e();
        }
    }

    public final bu j() {
        if (this.i == null || this.i.B == null) {
            return null;
        }
        return this.i.B.f12803d;
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3226, new Class[0], Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = eo.a((Context) getActivity(), 1);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3232, new Class[0], Void.TYPE);
        } else if (b_()) {
            q();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3235, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3235, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.dbw, 5000);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3236, new Class[0], Void.TYPE);
            return;
        }
        a(8);
        s();
        com.bytedance.android.live.core.c.a.a("BgBroadcastFragment", "room close forceEndLive");
        e();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3242, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3242, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9141b != null) {
            this.f9141b.startAudio();
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3243, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9141b != null) {
            this.f9141b.stopAudio();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3244, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9141b != null) {
            this.f9141b.startBgActivity();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3219, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.l.c();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3218, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.l.b();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3223, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3223, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3233, new Class[0], Void.TYPE);
            return;
        }
        if (this.r == null) {
            this.r = IllegalReviewDialog.a(getContext(), this.k);
            this.k.g = this.r;
        }
        if (getActivity() != null) {
            this.r.show(getActivity().getSupportFragmentManager(), "IllegalReviewDialog");
        }
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3239, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3239, new Class[0], Void.TYPE);
        } else if (this.i != null) {
            this.i.j();
            getActivity().getSupportFragmentManager().beginTransaction().remove(this.i).commitNowAllowingStateLoss();
            this.i = null;
            an.a().b();
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3248, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3248, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.f9141b != null) {
                this.f9141b.stopService();
            }
            if (this.n) {
                getActivity().stopService(a(getContext()));
                this.n = false;
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3225, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (h.a("control_view") != null) {
                h.a("control_view").dismiss();
            }
        } catch (Throwable unused) {
        }
        try {
            if (h.a("msg_view") != null) {
                h.a("msg_view").dismiss();
            }
        } catch (Throwable unused2) {
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3222, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (!((Boolean) com.bytedance.android.livesdk.w.b.U.a()).booleanValue()) {
            getActivity().bindService(a(getContext()), this.p, 1);
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3237, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3237, new Class[0], Boolean.TYPE)).booleanValue();
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment next : fragments) {
                if ((next instanceof com.bytedance.android.livesdkapi.depend.a.a) && ((com.bytedance.android.livesdkapi.depend.a.a) next).i_()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        Bundle bundle;
        AbsInteractionFragment absInteractionFragment;
        com.bytedance.android.livesdkapi.depend.model.live.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3238, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3238, new Class[0], Void.TYPE);
        } else if (b_() && this.h != null) {
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            if (supportFragmentManager.findFragmentByTag("AbsInteractionFragment") == null) {
                if (getArguments() != null) {
                    bundle = getArguments().getBundle(PushConstants.EXTRA);
                } else {
                    bundle = null;
                }
                if (getActivity().getRequestedOrientation() == 0) {
                    absInteractionFragment = new LandscapeInteractionFragment();
                } else {
                    absInteractionFragment = new PortraitInteractionFragment();
                }
                this.i = absInteractionFragment;
                this.i.setArguments(bundle);
                this.h.lambda$put$1$DataCenter("data_room", this.f9142c);
                this.i.a(this.h, true, (AbsInteractionFragment.b) new AbsInteractionFragment.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f9156a;

                    public final void a(ax axVar) {
                        if (PatchProxy.isSupport(new Object[]{axVar}, this, f9156a, false, 3268, new Class[]{ax.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{axVar}, this, f9156a, false, 3268, new Class[]{ax.class}, Void.TYPE);
                            return;
                        }
                        if (BgBroadcastFragment.this.k != null) {
                            BgBroadcastFragment.this.k.a(axVar);
                        }
                    }
                }, (EnterRoomExtra) null);
                if (this.h != null) {
                    this.h.lambda$put$1$DataCenter("cmd_video_orientation_changed", new ai(this.s, this.t));
                }
                AbsInteractionFragment absInteractionFragment2 = this.i;
                if (this.f9142c.isScreenshot) {
                    aVar = com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD;
                } else {
                    aVar = com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY;
                }
                absInteractionFragment2.t = aVar;
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.add((Fragment) this.i, "AbsInteractionFragment");
                beginTransaction.commitNowAllowingStateLoss();
                this.i.a((Runnable) new d(this));
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3240, new Class[0], Void.TYPE);
            return;
        }
        getActivity().setRequestedOrientation(1);
        if (this.l != null) {
            this.l.i();
        }
        try {
            if (h.a("control_view") != null) {
                h.a("control_view").dismiss();
            }
        } catch (Throwable unused) {
        }
        try {
            if (h.a("msg_view") != null) {
                h.a("msg_view").dismiss();
            }
        } catch (Throwable unused2) {
        }
        if (b_()) {
            FrameLayout frameLayout = (FrameLayout) getView().findViewById(C0906R.id.a_5);
            if (frameLayout.getChildCount() <= 0) {
                r();
                frameLayout.setVisibility(0);
                com.bytedance.android.live.core.c.a.a("BgBroadcastFragment", "room close new LiveBroadcastEndFragment");
                LiveBroadcastEndFragment liveBroadcastEndFragment = new LiveBroadcastEndFragment();
                liveBroadcastEndFragment.a(getActivity(), this.f9142c, e.f9184b, "");
                FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                if (this.i != null && this.i.isAdded()) {
                    beginTransaction.remove(this.i);
                }
                this.i = null;
                beginTransaction.add(C0906R.id.a_5, liveBroadcastEndFragment, "live_end").commitAllowingStateLoss();
                if (this.l != null) {
                    this.l.f();
                }
                s();
                b();
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f9140a, false, 3221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9140a, false, 3221, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9142c != null) {
            ab.a(this.f9142c.getId());
            LinkCrossRoomDataHolder.a(this.f9142c.getId());
        }
        r();
        if (this.k != null) {
            this.k.d();
            this.k = null;
        }
        if (this.j != null && this.j.isShowing()) {
            this.j.dismiss();
        }
        this.j = null;
        if (this.l != null) {
            this.l.d();
            this.l = null;
        }
        if (this.h != null) {
            this.h.removeObserver(this);
        }
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).clearGiftIconBitmapCache();
        super.onDestroy();
        this.m = true;
    }

    private static Intent a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f9140a, true, 3249, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2}, null, f9140a, true, 3249, new Class[]{Context.class}, Intent.class);
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context2, TTLiveSDKContext.getHostService().c().f()));
        return intent;
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f9140a, false, 3245, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f9140a, false, 3245, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f9141b != null) {
            this.f9141b.startStream(false);
        }
        if (com.bytedance.android.live.uikit.a.a.d()) {
            ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getTotalHealthInfo().compose(i.a()).subscribe(new h(this), i.b());
        }
    }

    public void onEvent(s sVar) {
        if (PatchProxy.isSupport(new Object[]{sVar}, this, f9140a, false, 3224, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, f9140a, false, 3224, new Class[]{s.class}, Void.TYPE);
            return;
        }
        switch (sVar.f10195a) {
            case 5:
                s();
                getActivity().finish();
                return;
            case 6:
            case 8:
                b(false);
                return;
            case e.l /*?: ONE_ARG  (7 int)*/:
                a(1);
                com.bytedance.android.live.core.c.a.a("BgBroadcastFragment", "room close LiveEvent.ACTION_SHOW_LIVE_END_DIALOG");
                e();
                return;
            default:
                if (this.l != null) {
                    this.l.onEvent(sVar);
                }
                return;
        }
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9140a, false, 3247, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9140a, false, 3247, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f9142c.isThirdParty) {
            j.q().d().f().sendStatus(this.f9142c.getId(), 4, this.f9142c.getStreamId(), i2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(i.f9244b, j.f9246b);
        }
        if (this.f9141b != null) {
            this.f9141b.stopStream(i2);
        }
        this.k.e();
    }

    public final void b(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f9140a, false, 3228, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f9140a, false, 3228, new Class[]{CharSequence.class}, Void.TYPE);
        } else if (b_()) {
            p();
            this.j.b(charSequence2);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f9140a, false, 3251, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f9140a, false, 3251, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1559753544) {
                if (hashCode == 562756910 && key.equals("cmd_show_illegal_dialog")) {
                    c2 = 1;
                }
            } else if (key.equals("text_msg_widget_ready")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    if (!(!(this.l instanceof f) || this.i == null || this.i.B == null)) {
                        f fVar = (f) this.l;
                        bu buVar = this.i.B.f12803d;
                        if (PatchProxy.isSupport(new Object[]{buVar}, fVar, f.f9206f, false, 3313, new Class[]{bu.class}, Void.TYPE)) {
                            f fVar2 = fVar;
                            PatchProxy.accessDispatch(new Object[]{buVar}, fVar2, f.f9206f, false, 3313, new Class[]{bu.class}, Void.TYPE);
                            break;
                        } else {
                            if (fVar.f9173c.f() && fVar.j != null) {
                                fVar.j.setPresenter(buVar);
                            }
                            return;
                        }
                    }
                case 1:
                    q();
                    this.k.f15829f = false;
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        n nVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f9140a, false, 3214, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f9140a, false, 3214, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        if (!com.bytedance.android.livesdkapi.a.a.f18614b || com.bytedance.android.livesdkapi.a.a.f18616d) {
            Room room = null;
            if (TTLiveSDKContext.getLiveService() != null) {
                nVar = TTLiveSDKContext.getLiveService().d();
            } else {
                nVar = null;
            }
            if (nVar != null) {
                room = nVar.a();
            }
            this.f9142c = room;
            if (!Room.isValid(this.f9142c) || !this.f9142c.isPullUrlValid()) {
                if (getActivity() != null) {
                    getActivity().finish();
                }
                return;
            }
            this.h = DataCenter.create(ViewModelProviders.of((Fragment) this), this);
            this.h.observeForever("text_msg_widget_ready", this);
            this.h.observe("cmd_show_illegal_dialog", this);
            SlideFinishUtil.a(getActivity());
            com.bytedance.android.livesdk.u.a.a().a(s.class).compose(i.a(this)).subscribe((Consumer<? super T>) new c<Object>(this));
            return;
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r11) {
        /*
            r10 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f9140a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 3241(0xca9, float:4.542E-42)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r11)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f9140a
            r3 = 0
            r4 = 3241(0xca9, float:4.542E-42)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r10.h
            r1 = 0
            if (r0 == 0) goto L_0x0046
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r10.h
            java.lang.String r2 = "data_member_count"
            java.lang.Object r0 = r0.get(r2)
            goto L_0x0047
        L_0x0046:
            r0 = r1
        L_0x0047:
            if (r0 == 0) goto L_0x0054
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x0054
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 > 0) goto L_0x005f
            r2 = 2131563540(0x7f0d1414, float:1.875254E38)
            java.lang.String r2 = com.bytedance.android.live.core.utils.ac.a((int) r2)
            goto L_0x0072
        L_0x005f:
            android.content.res.Resources r2 = r10.getResources()
            r3 = 2131886099(0x7f120013, float:1.9406767E38)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r8] = r5
            java.lang.String r2 = r2.getQuantityString(r3, r0, r4)
        L_0x0072:
            boolean r3 = com.bytedance.android.live.uikit.a.a.c()
            if (r3 == 0) goto L_0x0080
            r0 = 2131563539(0x7f0d1413, float:1.8752538E38)
            java.lang.String r2 = com.bytedance.android.live.core.utils.ac.a((int) r0)
            goto L_0x00aa
        L_0x0080:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00aa
            if (r0 <= 0) goto L_0x00aa
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r2.indexOf(r0)
            r4 = -1
            if (r3 == r4) goto L_0x00aa
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r2)
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r5 = -56832(0xffffffffffff2200, float:NaN)
            r4.<init>(r5)
            int r0 = r0.length()
            int r0 = r0 + r3
            r5 = 34
            r1.setSpan(r4, r3, r0, r5)
        L_0x00aa:
            r3 = 0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r10.f9142c
            if (r0 == 0) goto L_0x00b6
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r10.f9142c
            long r3 = r0.getId()
        L_0x00b6:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r5 = "room_id"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r5, r3)
            com.bytedance.android.livesdk.j.a r3 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r4 = "anchor_close_live_popup"
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.bytedance.android.livesdk.j.c.j r6 = new com.bytedance.android.livesdk.j.c.j
            r6.<init>()
            java.lang.String r9 = "live_take"
            com.bytedance.android.livesdk.j.c.j r6 = r6.b(r9)
            java.lang.String r9 = "click"
            com.bytedance.android.livesdk.j.c.j r6 = r6.f(r9)
            java.lang.String r9 = "live_take_detail"
            com.bytedance.android.livesdk.j.c.j r6 = r6.a(r9)
            r5[r8] = r6
            r3.a(r4, r0, r5)
            com.bytedance.android.livesdk.widget.m$a r3 = new com.bytedance.android.livesdk.widget.m$a
            android.content.Context r4 = r10.getContext()
            r3.<init>(r4)
            r4 = 2131564348(0x7f0d173c, float:1.8754179E38)
            com.bytedance.android.livesdk.widget.m$a r3 = r3.d((int) r4)
            if (r1 != 0) goto L_0x00fb
            r1 = r2
        L_0x00fb:
            com.bytedance.android.livesdk.widget.m$a r1 = r3.c((java.lang.CharSequence) r1)
            r2 = 2131564161(0x7f0d1681, float:1.87538E38)
            com.bytedance.android.livesdk.bgbroadcast.f r3 = new com.bytedance.android.livesdk.bgbroadcast.f
            r3.<init>(r10, r0, r11)
            com.bytedance.android.livesdk.widget.m$a r1 = r1.b((int) r8, (int) r2, (android.content.DialogInterface.OnClickListener) r3)
            r2 = 2131563151(0x7f0d128f, float:1.875175E38)
            com.bytedance.android.livesdk.bgbroadcast.g r3 = new com.bytedance.android.livesdk.bgbroadcast.g
            r3.<init>(r0)
            com.bytedance.android.livesdk.widget.m$a r0 = r1.b((int) r7, (int) r2, (android.content.DialogInterface.OnClickListener) r3)
            r0.b((boolean) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.bgbroadcast.BgBroadcastFragment.b(boolean):void");
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f9140a, false, 3216, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f9140a, false, 3216, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        SlideFinishUtil.a(getActivity());
        super.onActivityCreated(bundle);
        if (g.a(getActivity()) && getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(48);
        }
        if (!Room.isValid(this.f9142c) || !this.f9142c.isPullUrlValid() || com.bytedance.android.livesdkapi.h.e() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        LinkCrossRoomDataHolder.a(this.f9142c.getId(), ViewModelProviders.of((Fragment) this), this);
        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("AbsInteractionFragment");
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitNowAllowingStateLoss();
        }
        long id = this.f9142c.getId();
        getContext();
        this.k = new d(id);
        this.k.a(this);
        if (this.f9142c.isScreenshot) {
            this.l = new f(this.f9142c, this);
        } else {
            this.l = new com.bytedance.android.livesdk.bgbroadcast.a.b(this.f9142c, this);
        }
        this.l.a();
        if (!((Boolean) com.bytedance.android.livesdk.w.b.U.a()).booleanValue()) {
            if (Build.VERSION.SDK_INT >= 26) {
                getActivity().startForegroundService(a(getContext()));
            } else {
                getActivity().startService(a(getContext()));
            }
            this.n = true;
        } else {
            com.bytedance.android.live.core.c.a.a("BgBroadcastFragment", "room close LIVE_GAME_QUIT_CLICKED is true");
            e();
        }
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).syncGiftList(this.q, this.f9142c.getId(), 2, true);
        if (this.f9142c.isScreenshot && Build.VERSION.SDK_INT >= 21 && ((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.a()).intValue() == 1) {
            com.bytedance.android.livesdk.g.a().b();
            startActivityForResult(((MediaProjectionManager) getActivity().getSystemService("media_projection")).createScreenCaptureIntent(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }

    public final void a(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f9140a, false, 3227, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f9140a, false, 3227, new Class[]{CharSequence.class}, Void.TYPE);
        } else if (b_()) {
            p();
            this.j.a(charSequence2);
        }
    }

    static final /* synthetic */ void a(HashMap hashMap, DialogInterface dialogInterface) {
        com.bytedance.android.livesdk.j.a.a().a("anchor_close_live_cancel", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_detail"));
        dialogInterface.dismiss();
        com.bytedance.android.livesdk.w.b.U.a(Boolean.FALSE);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f9140a, false, 3217, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f9140a, false, 3217, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (!Room.isValid(this.f9142c) || !this.f9142c.isPullUrlValid()) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        float screenWidth = (float) (UIUtils.getScreenWidth(getContext()) / UIUtils.getScreenHeight(getContext()));
        com.bytedance.android.livesdk.chatroom.f.b.a((HSImageView) getView().findViewById(C0906R.id.j9), this.f9142c.getOwner().getAvatarThumb(), (Postprocessor) new u(5, screenWidth, null));
        com.bytedance.android.livesdk.chatroom.f.b.a((HSImageView) getView().findViewById(C0906R.id.drs), this.f9142c.getOwner().getAvatarThumb(), (Postprocessor) new u(5, screenWidth, null));
        if (com.bytedance.android.live.uikit.a.a.a()) {
            p.a(this.f9142c.getId());
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9140a, false, 3250, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9140a, false, 3250, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 > i3) {
            this.s = true;
            this.t = ((ac.c() * i3) / i2) + ((int) UIUtils.dip2Px(getContext(), 96.0f));
        } else {
            this.s = false;
        }
        if (this.i != null) {
            this.h.lambda$put$1$DataCenter("cmd_video_orientation_changed", new ai(this.s, this.t));
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f9140a, false, 3215, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.aeq, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f9140a, false, 3215, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f9140a, false, 3220, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f9140a, false, 3220, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i2 != 1000) {
            int i4 = i3;
        } else if (i3 == -1 && this.f9141b != null) {
            this.f9141b.setData(intent2, this.l.h());
            this.f9141b.startStream(this.l.h());
            this.h.lambda$put$1$DataCenter("data_message_manager", ab.a(this.f9142c.getId(), false, getContext()));
            d();
        }
        super.onActivityResult(i2, i3, intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(HashMap hashMap, boolean z, DialogInterface dialogInterface) {
        com.bytedance.android.livesdk.j.a.a().a("anchor_close_live_confirm", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_detail"));
        dialogInterface.dismiss();
        com.bytedance.android.livesdk.w.b.U.a(Boolean.TRUE);
        a(1);
        e();
        if (z) {
            this.f9141b.startBgActivity();
        }
    }
}
