package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.w;
import com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.message.model.af;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.w.e;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.d.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.a;

public class LandscapeInteractionFragment extends AbsInteractionFragment implements View.OnTouchListener {
    public static ChangeQuickRedirect S;
    private static final int[] U = {C0906R.id.ti, C0906R.id.dpr, C0906R.id.c87, C0906R.id.bd7, C0906R.id.d5r, C0906R.id.mp, C0906R.id.ccm, C0906R.id.buc, C0906R.id.a28, C0906R.id.bmr, C0906R.id.vc, C0906R.id.bdm, C0906R.id.ac1, C0906R.id.dy_, C0906R.id.dy8};
    int T = 0;
    private List<Integer> V = new ArrayList();
    private View[] W;
    private List<Integer> X = new ArrayList();
    private List<View> Y;
    private List<Integer> Z;
    private Observable<Long> aa;
    private Disposable ab;
    private long ac = 0;
    private LinearLayout ad;
    private View ae;
    private boolean af = false;
    private g ag;
    private long ah;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11534a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11535c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11534a, false, 5828, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11534a, false, 5828, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f11534a, false, 5830, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f11534a, false, 5830, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11534a, false, 5829, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11534a, false, 5829, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11534a, true, 5827, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11534a, true, 5827, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LandscapeInteractionFragment.java", a.class);
            f11535c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LandscapeInteractionFragment$ToolbarScreenOrientationBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 467);
        }

        private a() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11534a, false, 5826, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11534a, false, 5826, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f11535c, this, this, view));
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdkapi.f.a(1));
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(LandscapeInteractionFragment.this.f11425b.getId()));
            hashMap.put("type", "landscape_to_portrait");
            com.bytedance.android.livesdk.j.a.a().a("screen_rotate", hashMap, new j().b("live").f("click").a("live_detail"));
        }

        /* synthetic */ a(LandscapeInteractionFragment landscapeInteractionFragment, byte b2) {
            this();
        }
    }

    class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11537a;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11538f;

        /* renamed from: c  reason: collision with root package name */
        private View f11540c;

        /* renamed from: d  reason: collision with root package name */
        private Dialog f11541d;

        /* renamed from: e  reason: collision with root package name */
        private Disposable f11542e;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f11537a, false, 5836, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f11537a, false, 5836, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11537a, true, 5835, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11537a, true, 5835, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LandscapeInteractionFragment.java", b.class);
            f11538f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LandscapeInteractionFragment$ToolbarVideoQualityBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 432);
        }

        private b() {
        }

        public void onEvent(w wVar) {
            if (PatchProxy.isSupport(new Object[]{wVar}, this, f11537a, false, 5834, new Class[]{w.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{wVar}, this, f11537a, false, 5834, new Class[]{w.class}, Void.TYPE);
                return;
            }
            if (this.f11540c instanceof TextView) {
                ((TextView) this.f11540c).setText(wVar.f10203a);
            }
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11537a, false, 5832, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11537a, false, 5832, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f11538f, this, this, view));
            if (this.f11541d == null && LandscapeInteractionFragment.this.getContext() != null) {
                this.f11541d = new ey(LandscapeInteractionFragment.this.getContext(), LandscapeInteractionFragment.this.f11425b);
            }
            if (!this.f11541d.isShowing()) {
                this.f11541d.show();
            }
            com.bytedance.android.livesdk.j.a.a().a("definition_setting_button", Room.class, new j().b("live").f("click").a("live_detail"));
        }

        /* synthetic */ b(LandscapeInteractionFragment landscapeInteractionFragment, byte b2) {
            this();
        }

        public final void b(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11537a, false, 5833, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11537a, false, 5833, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            if (this.f11541d != null) {
                Dialog dialog = this.f11541d;
                if (PatchProxy.isSupport(new Object[]{dialog}, null, bm.f11940a, true, 5838, new Class[]{Dialog.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialog}, null, bm.f11940a, true, 5838, new Class[]{Dialog.class}, Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    dialog.dismiss();
                } else {
                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                }
            }
            this.f11541d = null;
            if (this.f11542e != null && !this.f11542e.isDisposed()) {
                this.f11542e.dispose();
            }
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11537a, false, 5831, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11537a, false, 5831, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f11540c = view;
            if (TTLiveSDKContext.getHostService().b().b().c(e.LIVE_QUALITY_ROOM_ID) != LandscapeInteractionFragment.this.f11425b.getId()) {
                TTLiveSDKContext.getHostService().b().b().a((d.a) e.LIVE_QUALITY_ROOM_ID, 0);
                TTLiveSDKContext.getHostService().b().b().a((d.a) e.LIVE_QUALITY, "");
            }
            if (!(this.f11540c instanceof TextView) || LandscapeInteractionFragment.this.f11425b.getStreamUrl().c().size() <= 1) {
                this.f11540c.setVisibility(8);
                return;
            }
            if (this.f11542e != null && !this.f11542e.isDisposed()) {
                this.f11542e.dispose();
            }
            this.f11542e = com.bytedance.android.livesdk.u.a.a().a(w.class).subscribe((Consumer<? super T>) new Consumer<w>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11543a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    w wVar = (w) obj;
                    if (PatchProxy.isSupport(new Object[]{wVar}, this, f11543a, false, 5837, new Class[]{w.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{wVar}, this, f11543a, false, 5837, new Class[]{w.class}, Void.TYPE);
                        return;
                    }
                    b.this.onEvent(wVar);
                }
            });
            TextView textView = (TextView) this.f11540c;
            String str = LandscapeInteractionFragment.this.f11425b.getStreamUrl().n;
            if (TTLiveSDKContext.getHostService().b().b().c(e.LIVE_QUALITY_ROOM_ID) == LandscapeInteractionFragment.this.f11425b.getId()) {
                str = TTLiveSDKContext.getHostService().b().b().d(e.LIVE_QUALITY);
            }
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 5813, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.af = true;
        m();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 5810, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.ah = System.currentTimeMillis();
        if (this.af) {
            m();
        }
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 5819, new Class[0], Void.TYPE);
        } else if (this.T != 8) {
            if (this.aa == null) {
                this.aa = Observable.timer(3000, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
            if (this.ab != null && !this.ab.isDisposed()) {
                this.ab.dispose();
            }
            this.ab = this.aa.subscribe(new bk(this), bl.f11939b);
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5817, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, S, false, 5817, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getContext() == null || getContext().getResources().getConfiguration().orientation != 1) {
            return false;
        } else {
            return true;
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 5812, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 5820, new Class[0], Void.TYPE);
            return;
        }
        if (this.ab != null && !this.ab.isDisposed()) {
            this.ab.dispose();
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 5811, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        HashMap hashMap = new HashMap();
        hashMap.put("time", String.valueOf(System.currentTimeMillis() - this.ah));
        com.bytedance.android.livesdk.j.a.a().a("transverse_screen_duration", hashMap, new j().b("live").f("other").a("live_detail"), Room.class);
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, S, false, 5808, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, S, false, 5808, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.addFlags(1024);
        }
        return onCreateDialog;
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, S, false, 5806, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, S, false, 5806, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 5814, new Class[0], Void.TYPE);
            return;
        }
        af afVar = new af();
        afVar.f16444a = (int) getResources().getDimension(C0906R.dimen.pb);
        if (this.x != null) {
            this.x.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(afVar.f16444a));
        }
        af afVar2 = new af();
        afVar2.f16444a = (int) getResources().getDimension(C0906R.dimen.pa);
        if (this.x != null) {
            this.x.lambda$put$1$DataCenter("cmd_enter_widget_layout_change", afVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, S, false, 5818, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, S, false, 5818, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.T = i;
        if (i == 0) {
            m();
        }
        if (this.W == null) {
            this.W = new View[this.V.size()];
            for (int i3 = 0; i3 < this.W.length; i3++) {
                this.W[i3] = this.ae.findViewById(this.V.get(i3).intValue());
            }
        }
        if (i == 8) {
            for (int i4 = 0; i4 < this.V.size(); i4++) {
                if (this.W[i4] != null) {
                    this.X.set(i4, Integer.valueOf(this.W[i4].getVisibility()));
                    this.W[i4].setVisibility(8);
                }
            }
            if (this.ad == null) {
                this.ad = (LinearLayout) this.ae.findViewById(C0906R.id.aa);
            }
            if (this.ad != null) {
                this.Z = new ArrayList();
                this.Y = new ArrayList();
                while (i2 < this.ad.getChildCount()) {
                    View childAt = this.ad.getChildAt(i2);
                    if (!(childAt.getTag() == f.RECHARGE_GUIDE || childAt.getTag() == f.FAST_GIFT || childAt.getTag() == f.GIFT)) {
                        this.Y.add(childAt);
                        this.Z.add(Integer.valueOf(childAt.getVisibility()));
                        childAt.setVisibility(8);
                    }
                    i2++;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.V.size(); i5++) {
                if (this.W[i5] != null) {
                    this.W[i5].setVisibility(this.X.get(i5).intValue());
                    if (i == 0 && this.W[i5].getId() == C0906R.id.ti) {
                        UIUtils.setViewVisibility(this.W[i5], i);
                    }
                }
            }
            if (this.Y != null) {
                int size = this.Y.size();
                while (i2 < size) {
                    this.Y.get(i2).setVisibility(this.Z.get(i2).intValue());
                    i2++;
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, S, false, 5809, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, S, false, 5809, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            view.findViewById(C0906R.id.ao0).setOnTouchListener(this);
            view.findViewById(C0906R.id.d5k).setOnTouchListener(this);
            view.findViewById(C0906R.id.bmr).setVisibility(8);
        }
        if (com.bytedance.android.live.uikit.a.a.f() && getActivity() != null) {
            Window window = getActivity().getWindow();
            if (PatchProxy.isSupport(new Object[]{window}, null, com.bytedance.android.live.core.utils.b.a.f8244a, true, 1440, new Class[]{Window.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{window}, null, com.bytedance.android.live.core.utils.b.a.f8244a, true, 1440, new Class[]{Window.class}, Void.TYPE);
            } else if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null && Build.VERSION.SDK_INT >= 19) {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 512);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, S, false, 5822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 5822, new Class[0], Void.TYPE);
        } else {
            for (int valueOf : U) {
                this.V.add(Integer.valueOf(valueOf));
                this.X.add(8);
            }
        }
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d a2 = com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a();
        if (!com.bytedance.android.live.uikit.a.a.a()) {
            a2.a(f.SWITCH_VIDEO_QUALITY, (d.a) new b(this, (byte) 0));
        }
        a2.a(f.SWITCH_SCREEN_ORIENTATION, (d.a) new a(this, (byte) 0));
        if (com.bytedance.android.live.core.utils.g.a(getContext())) {
            this.ae.setPadding(UIUtils.getStatusBarHeight(getContext()), -3, -3, -3);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, S, false, 5821, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, S, false, 5821, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (view.getId() == C0906R.id.ao0) {
            if (this.af) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (SystemClock.elapsedRealtime() - this.ac > 300) {
                            z = true;
                        }
                        this.ac = SystemClock.elapsedRealtime();
                        return z;
                    case 1:
                        if (this.T != 0) {
                            b(0);
                            break;
                        } else {
                            b(8);
                            break;
                        }
                }
            } else {
                return false;
            }
        } else if (view.getId() == C0906R.id.d5k) {
            m();
            return false;
        }
        return false;
    }

    public final void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, S, false, 5815, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, S, false, 5815, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.A.load(C0906R.id.ag, new ActionMessageWidget()).load(C0906R.id.bu9, new OBSBarrageWidget());
        if (com.bytedance.android.live.uikit.a.a.f()) {
            c cVar = (c) com.bytedance.android.livesdk.v.j.q().k().a(c.class);
            if (cVar != null) {
                this.A.load((int) C0906R.id.dy_, cVar.h());
                UIUtils.setViewVisibility(view.findViewById(C0906R.id.dy8), 0);
                this.A.load((int) C0906R.id.dy8, cVar.b());
            }
        }
        DataCenter dataCenter = this.x;
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, S, false, 5816, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, S, false, 5816, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        if (!(this.f11425b == null || this.f11425b.getOwner() == null)) {
            com.bytedance.android.livesdkapi.d.f n = TTLiveSDKContext.getHostService().n();
            if (n != null) {
                this.ag = new g() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11532a;

                    public final void a(String str, String str2, boolean z) {
                        if (PatchProxy.isSupport(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f11532a, false, 5825, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(z)}, this, f11532a, false, 5825, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        if (com.bytedance.android.livesdk.utils.j.b(LandscapeInteractionFragment.this.x)) {
                            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "click_product", com.bytedance.android.livesdk.utils.j.c(LandscapeInteractionFragment.this.x));
                        }
                    }
                };
                n.a(this, String.valueOf(this.f11425b.getOwner().getId()), String.valueOf(this.f11425b.getId()), new com.bytedance.android.livesdk.commerce.a(dataCenter, this.f11425b.hasCommerceGoods, this.f11425b, this.ag));
            }
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, S, false, 5807, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, S, false, 5807, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.ae = LayoutInflater.from(getContext()).inflate(C0906R.layout.ai8, viewGroup, false);
        return this.ae;
    }
}
