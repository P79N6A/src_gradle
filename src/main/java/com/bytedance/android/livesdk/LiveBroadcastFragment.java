package com.bytedance.android.livesdk;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LiveDialogFragment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.SlideFinishUtil;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.dutygift.DutyGiftControlWidget;
import com.bytedance.android.livesdk.chatroom.end.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.chatroom.event.o;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.event.t;
import com.bytedance.android.livesdk.chatroom.interact.z;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.IllegalReviewDialog;
import com.bytedance.android.livesdk.chatroom.ui.PortraitInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.el;
import com.bytedance.android.livesdk.chatroom.ui.eo;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbsCaptureWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.AudioWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2;
import com.bytedance.android.livesdk.chatroom.viewmodule.ak;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.LiveBeautyDialogFragment;
import com.bytedance.android.livesdk.effect.LiveBeautyFragment;
import com.bytedance.android.livesdk.effect.LiveFilterDialogFragment;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.bytedance.android.livesdk.effect.j;
import com.bytedance.android.livesdk.effect.k;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.gift.m;
import com.bytedance.android.livesdk.j.b.g;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdk.live.PhoneStateReceiver;
import com.bytedance.android.livesdk.live.d;
import com.bytedance.android.livesdk.message.model.ax;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.sticker.p;
import com.bytedance.android.livesdk.utils.ab;
import com.bytedance.android.livesdk.utils.u;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.ugc.live.a.i;
import com.ss.ugc.live.c.a.e;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGLContext;
import org.aspectj.lang.a;

public class LiveBroadcastFragment extends BaseFragment implements Observer<KVData>, f, PhoneStateReceiver.a, com.bytedance.android.livesdk.live.a.c.a, d.a, WeakHandler.IHandler, i, com.ss.ugc.live.c.a.d {
    private static final int[][] N = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8747a;
    private f A;
    private boolean B;
    private WeakHandler C = new WeakHandler(this);
    private Handler D = new Handler(Looper.getMainLooper());
    private Queue<KVData> E = new LinkedList();
    private boolean F = false;
    private IllegalReviewDialog G;
    private boolean H;
    private com.ss.ugc.live.c.a.c.b I;
    private com.ss.ugc.live.c.a.a J;
    private PhoneStateReceiver K;
    private com.bytedance.android.livesdk.live.a.c.b L;
    private com.bytedance.android.live.gift.d M = new com.bytedance.android.live.gift.d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8750a;

        public final void a(List<com.bytedance.android.livesdk.gift.model.b> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f8750a, false, 2606, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f8750a, false, 2606, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (LiveBroadcastFragment.this.f8749c != null && !LiveBroadcastFragment.this.f8749c.isLiveTypeAudio()) {
                p.a(LiveBroadcastFragment.this.f8749c.getId());
            }
        }
    };
    private boolean O;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a.c f8748b;

    /* renamed from: c  reason: collision with root package name */
    public Room f8749c;
    PortraitInteractionFragment h;
    public DataCenter i;
    FrameLayout j;
    FrameLayout k;
    HSImageView l;
    public eo m;
    public com.bytedance.android.livesdk.live.d n;
    public LiveDialogFragment o;
    public LiveFilterDialogFragment p;
    LiveBroadcastEndFragment q;
    String r;
    CharSequence s;
    CharSequence t;
    CharSequence u;
    public AbsCaptureWidget v;
    DutyGiftControlWidget w;
    CompositeDisposable x = new CompositeDisposable();
    CompositeDisposable y = new CompositeDisposable();
    public LiveFilterAdapter.a z = new LiveFilterAdapter.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8764a;

        public final void a(int i) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8764a, false, 2613, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8764a, false, 2613, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (LiveBroadcastFragment.this.v instanceof ak) {
                com.bytedance.android.livesdk.effect.f e2 = ((ak) LiveBroadcastFragment.this.v).e();
                int a2 = e2.a();
                float a3 = com.bytedance.android.livesdk.effect.f.a(j.a().f13785b, i);
                if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.a()).booleanValue()) {
                    com.bytedance.android.livesdk.effect.a f2 = ((ak) LiveBroadcastFragment.this.v).f();
                    if (f2.f13710e > (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * a3) / 100.0f) {
                        f2.d(a3 / 100.0f);
                    }
                } else if (!Lists.isEmpty(j.a().f13785b) && i >= 0 && i < j.a().f13785b.size()) {
                    com.bytedance.android.livesdk.sticker.b.a b2 = com.bytedance.android.livesdk.v.j.q().p().a().b(h.a("beautyTag", j.a().f13785b.get(i)));
                    if (!(b2 == null || b2.h == null)) {
                        com.bytedance.android.livesdk.sticker.a.c o = com.bytedance.android.livesdk.v.j.q().o();
                        o.a(com.bytedance.android.livesdk.sticker.c.a.f17264e, b2);
                        Float c2 = o.c(b2.h.f17256b);
                        if (c2 == null) {
                            c2 = Float.valueOf(k.a(b2, b2.h.f17255a));
                        }
                        int i2 = (int) a3;
                        if (c2.floatValue() > k.a(b2, i2)) {
                            o.a(b2.h.f17256b, k.a(b2, i2));
                        }
                    }
                }
                if (a2 != i) {
                    e2.a(i);
                    ak akVar = (ak) LiveBroadcastFragment.this.v;
                    if (i < a2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    akVar.a(z);
                }
            }
            String str = "";
            List<FilterModel> list = j.a().f13785b;
            if (i < list.size()) {
                str = list.get(i).getFilterId();
            }
            LiveBroadcastFragment.this.i.lambda$put$1$DataCenter("cmd_toolbar_click_filter", str);
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", "click");
            hashMap.put("filter_id", str);
            com.bytedance.android.livesdk.j.a.a().a("live_take_filter_select", LiveBroadcastFragment.this.a(hashMap), new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").f("click").b("live_take"), new com.bytedance.android.livesdk.j.c.k());
            com.bytedance.android.livesdk.effect.f.a(LiveBroadcastFragment.this.f8749c.getId());
            com.bytedance.android.livesdk.u.a.a().a((Object) new t(3));
        }
    };

    public interface a {
        void a(boolean z);
    }

    public interface b {
        void a(String str, boolean z);
    }

    class c {

        /* renamed from: a  reason: collision with root package name */
        int f8773a;

        private c() {
        }

        /* synthetic */ c(LiveBroadcastFragment liveBroadcastFragment, byte b2) {
            this();
        }
    }

    class d implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8775a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f8776c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f8775a, false, 2620, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f8775a, false, 2620, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f8775a, false, 2622, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f8775a, false, 2622, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f8775a, false, 2621, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f8775a, false, 2621, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f8775a, true, 2619, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f8775a, true, 2619, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveBroadcastFragment.java", d.class);
            f8776c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.LiveBroadcastFragment$ToolbarBeautyBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 1576);
        }

        private d() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8775a, false, 2618, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8775a, false, 2618, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f8776c, this, this, view));
            com.bytedance.android.livesdk.j.a.a().a("live_take_beauty_click", LiveBroadcastFragment.this.a(new HashMap<>()), new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").f("click").b("live_take"), new com.bytedance.android.livesdk.j.c.k());
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.a()).booleanValue()) {
                com.bytedance.android.livesdk.v.j.q().p().a(LiveBroadcastFragment.this.getActivity(), Boolean.FALSE);
                return;
            }
            if (LiveBroadcastFragment.this.o == null) {
                LiveBroadcastFragment.this.o = LiveBeautyDialogFragment.a((LiveBeautyFragment.a) LiveBroadcastFragment.this.v, LiveBroadcastFragment.this.z, false, 1);
            }
            if (LiveBroadcastFragment.this.o.getDialog() == null || !LiveBroadcastFragment.this.o.getDialog().isShowing()) {
                LiveBroadcastFragment.this.o.show(LiveBroadcastFragment.this.getActivity().getSupportFragmentManager(), "beautyDialogTag");
            }
        }

        /* synthetic */ d(LiveBroadcastFragment liveBroadcastFragment, byte b2) {
            this();
        }
    }

    class e implements Observer<KVData>, d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8778a;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f8779d;

        /* renamed from: b  reason: collision with root package name */
        View f8780b;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f8778a, false, 2628, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f8778a, false, 2628, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f8778a, true, 2627, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f8778a, true, 2627, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveBroadcastFragment.java", e.class);
            f8779d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.LiveBroadcastFragment$ToolbarFilterBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 1542);
        }

        private e() {
        }

        public /* synthetic */ void onChanged(@Nullable Object obj) {
            KVData kVData = (KVData) obj;
            if (PatchProxy.isSupport(new Object[]{kVData}, this, f8778a, false, 2626, new Class[]{KVData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kVData}, this, f8778a, false, 2626, new Class[]{KVData.class}, Void.TYPE);
                return;
            }
            if (kVData != null) {
                String key = kVData.getKey();
                char c2 = 65535;
                if (key.hashCode() == 982604344 && key.equals("cmd_toolbar_click_filter")) {
                    c2 = 0;
                }
                if (c2 == 0 && !j.a().d()) {
                    this.f8780b.setVisibility(8);
                }
            }
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8778a, false, 2625, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8778a, false, 2625, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f8779d, this, this, view));
            com.bytedance.android.livesdk.j.a.a().a("live_take_filter_click", LiveBroadcastFragment.this.a(new HashMap<>()), new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").f("click").b("live_take"), new com.bytedance.android.livesdk.j.c.k());
            if (LiveBroadcastFragment.this.p == null || LiveBroadcastFragment.this.p.getDialog() == null || !LiveBroadcastFragment.this.p.getDialog().isShowing()) {
                LiveBroadcastFragment.this.p = LiveFilterDialogFragment.a(LiveBroadcastFragment.this.z, j.a().f13785b, false);
                LiveBroadcastFragment.this.p.show(LiveBroadcastFragment.this.getActivity().getSupportFragmentManager(), "filterDialogTag");
            }
        }

        /* synthetic */ e(LiveBroadcastFragment liveBroadcastFragment, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f8778a, false, 2623, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f8778a, false, 2623, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f8780b = view.findViewById(C0906R.id.cck);
            if (j.a().d()) {
                this.f8780b.setVisibility(0);
            }
            dataCenter.observe("cmd_toolbar_click_filter", this);
        }

        public final void b(@NonNull View view, @NonNull DataCenter dataCenter) {
            DataCenter dataCenter2 = dataCenter;
            if (PatchProxy.isSupport(new Object[]{view, dataCenter2}, this, f8778a, false, 2624, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter2}, this, f8778a, false, 2624, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            dataCenter2.removeObserver(this);
        }
    }

    public final void a(int i2) {
        int i3 = 1;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8747a, false, 2563, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8747a, false, 2563, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String str = "";
        int i4 = BaseLoginOrRegisterActivity.o;
        switch (i2) {
            case 1:
                str = "stream push failed";
                i3 = 6;
                break;
            case 2:
                str = "enter background timeout";
                i4 = 104;
                break;
            case 3:
                com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.d_f);
                str = "broadcast error";
                break;
            default:
                i4 = 0;
                break;
        }
        if (i2 > 0) {
            com.bytedance.android.live.uikit.d.a.a(getContext(), getString(C0906R.string.d_d));
            com.bytedance.android.livesdk.live.a.a(false, i4, str);
            com.bytedance.android.live.core.c.a.a("LiveBroadcastFragment", "room close onStreamEnd code:" + i2);
            c();
            this.I.a(i3);
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8747a, false, 2564, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8747a, false, 2564, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (b_() && this.h != null) {
            this.h.b(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(HashMap hashMap, DialogInterface dialogInterface) {
        HashMap hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{hashMap2}, this, f8747a, false, 2569, new Class[]{HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap2}, this, f8747a, false, 2569, new Class[]{HashMap.class}, Void.TYPE);
        } else {
            com.bytedance.android.livesdk.j.a.a().a("anchor_close_live_cancel", hashMap2, new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").f("click").b("live_take"), new com.bytedance.android.livesdk.j.c.k());
            com.bytedance.android.livesdk.j.f.a(getContext()).a("anchor_close_live_popup", "cancel", this.f8749c.getId(), 0);
        }
        dialogInterface.dismiss();
    }

    public final void a(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f8747a, false, 2576, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f8747a, false, 2576, new Class[]{CharSequence.class}, Void.TYPE);
        } else if (b_()) {
            l();
            this.m.a(charSequence2);
        }
    }

    public final void a(boolean z2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), str2}, this, f8747a, false, 2578, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), str2}, this, f8747a, false, 2578, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
        } else if (b_()) {
            l();
            this.m.a(z2, str2);
        }
    }

    public final void a(boolean z2, CharSequence charSequence, String str) {
        CharSequence charSequence2 = charSequence;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), charSequence2, str2}, this, f8747a, false, 2579, new Class[]{Boolean.TYPE, CharSequence.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), charSequence2, str2}, this, f8747a, false, 2579, new Class[]{Boolean.TYPE, CharSequence.class, String.class}, Void.TYPE);
        } else if (b_()) {
            l();
            this.m.a(z2, charSequence2, str2);
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f8747a, false, 2580, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f8747a, false, 2580, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (b_() && this.m != null) {
            l();
            if (z2) {
                this.m.setCancelable(false);
                this.m.show();
                this.m.a((View.OnClickListener) new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8766a;

                    /* renamed from: c  reason: collision with root package name */
                    private static final /* synthetic */ a.C0900a f8767c;

                    static {
                        if (PatchProxy.isSupport(new Object[0], null, f8766a, true, 2615, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], null, f8766a, true, 2615, new Class[0], Void.TYPE);
                            return;
                        }
                        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveBroadcastFragment.java", AnonymousClass7.class);
                        f8767c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.LiveBroadcastFragment$7", "android.view.View", NotifyType.VIBRATE, "", "void"), 1309);
                    }

                    public void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f8766a, false, 2614, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f8766a, false, 2614, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f8767c, this, this, view));
                        if (LiveBroadcastFragment.this.n != null) {
                            LiveBroadcastFragment.this.n.a();
                            LiveBroadcastFragment.this.m.dismiss();
                        }
                    }
                });
                this.m.f12180b = new eo.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8769a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f8769a, false, 2616, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f8769a, false, 2616, new Class[0], Void.TYPE);
                            return;
                        }
                        com.bytedance.android.live.uikit.d.a.a(LiveBroadcastFragment.this.getContext(), ac.a((int) C0906R.string.d9e), 1);
                    }
                };
                this.m.f12181c = new eo.c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8771a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f8771a, false, 2617, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f8771a, false, 2617, new Class[0], Void.TYPE);
                            return;
                        }
                        com.bytedance.android.live.uikit.d.a.a(LiveBroadcastFragment.this.getContext(), ac.a((int) C0906R.string.d9e), 1);
                    }
                };
                return;
            }
            this.m.dismiss();
        }
    }

    public final void a(boolean z2, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = charSequence2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), charSequence3, charSequence4}, this, f8747a, false, 2583, new Class[]{Boolean.TYPE, CharSequence.class, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), charSequence3, charSequence4}, this, f8747a, false, 2583, new Class[]{Boolean.TYPE, CharSequence.class, CharSequence.class}, Void.TYPE);
        } else if (b_() && this.h != null) {
            boolean z3 = z2;
            this.h.a(z2, charSequence3, charSequence4);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f8747a, false, 2590, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f8747a, false, 2590, new Class[]{String.class}, Void.TYPE);
        } else if (TelephonyManager.EXTRA_STATE_IDLE.equals(str)) {
            this.J.b();
        } else {
            if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(str)) {
                this.J.c();
            }
        }
    }

    public final void a(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2, Bundle bundle) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{eGLContext, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), new Long(j3), bundle}, this, f8747a, false, 2592, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eGLContext, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), new Long(j3), bundle}, this, f8747a, false, 2592, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE);
            return;
        }
        if (!this.O) {
            this.O = true;
            this.l.post(new j(this));
        }
        this.J.a(i2, i4, i5, j2, bundle);
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2556, new Class[0], Void.TYPE);
        } else if (this.f8192e && !this.H && !this.F) {
            k();
        }
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2575, new Class[0], Void.TYPE);
            return;
        }
        if (this.m == null) {
            this.m = eo.a((Context) getActivity(), 1);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2559, new Class[0], Void.TYPE);
            return;
        }
        this.D.removeCallbacksAndMessages(null);
        this.J.a();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2562, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.dbs);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2581, new Class[0], Void.TYPE);
        } else if (b_()) {
            m();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2584, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.dbw);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2585, new Class[0], Void.TYPE);
            return;
        }
        b(8);
        com.bytedance.android.live.core.c.a.a("LiveBroadcastFragment", "room close forceEndLive");
        c();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2544, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.f8748b.a(this.K);
        this.J.c();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2545, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.y.clear();
        if (!this.H && this.I != null) {
            com.ss.ugc.live.c.a.c.b bVar = this.I;
            if (bVar.f78723a) {
                bVar.a(3, 0);
            }
        }
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2582, new Class[0], Void.TYPE);
            return;
        }
        if (this.G == null) {
            this.G = IllegalReviewDialog.a(getContext(), this.n);
            this.n.g = this.G;
        }
        if (getActivity() != null) {
            this.G.show(getActivity().getSupportFragmentManager(), "IllegalReviewDialog");
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2561, new Class[0], Void.TYPE);
            return;
        }
        if (b_() && this.h != null) {
            this.h.b(0.0f);
        }
        if (!this.H) {
            com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.d_e);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2542, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.y.clear();
        a(m.class);
        a(s.class);
        a(com.bytedance.android.livesdkapi.depend.b.c.class);
        this.f8748b.a(this.K, new IntentFilter("android.intent.action.PHONE_STATE"));
        if (this.H) {
            this.C.removeCallbacksAndMessages(null);
            return;
        }
        this.J.b();
        com.ss.ugc.live.c.a.c.b bVar = this.I;
        if (bVar.f78723a) {
            bVar.a(2, 0);
        }
        while (!this.E.isEmpty()) {
            onChanged(this.E.poll());
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2557, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2557, new Class[0], Void.TYPE);
            return;
        }
        this.D.removeCallbacksAndMessages(null);
        if (!this.H) {
            if (TextUtils.isEmpty(this.f8749c.getStreamUrl().m)) {
                this.f8749c.getStreamUrl().m = this.f8749c.getStreamUrl().a();
            }
            if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_URL_LIST.a()).booleanValue()) {
                this.J.a(this.f8749c.getStreamUrl().f18709d);
            } else {
                this.J.a(this.f8749c.getStreamUrl().m);
            }
            if (com.bytedance.android.live.uikit.a.a.d()) {
                com.bytedance.android.livesdk.chatroom.bl.h.a().a((Handler) this.C);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2553, new Class[0], Void.TYPE);
        } else if (this.h != null) {
            if (this.v != null) {
                this.v.c();
            }
            this.h.j();
            getActivity().getSupportFragmentManager().beginTransaction().remove(this.h).commitNowAllowingStateLoss();
            this.h = null;
            an.a().b();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2554, new Class[0], Void.TYPE);
            return;
        }
        this.H = true;
        if (b_()) {
            if (this.p != null) {
                this.p.dismiss();
            }
            if (this.o != null) {
                this.o.dismiss();
            }
            if (this.w != null) {
                DutyGiftControlWidget dutyGiftControlWidget = this.w;
                if (PatchProxy.isSupport(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4148, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4148, new Class[0], Void.TYPE);
                } else {
                    if (dutyGiftControlWidget.i != null && dutyGiftControlWidget.i.isShowing()) {
                        dutyGiftControlWidget.i.dismiss();
                    }
                    DutyGiftControlWidget.a aVar = dutyGiftControlWidget.f9959b;
                    if (PatchProxy.isSupport(new Object[0], aVar, DutyGiftControlWidget.a.f9971a, false, 4173, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar, DutyGiftControlWidget.a.f9971a, false, 4173, new Class[0], Void.TYPE);
                    } else if (aVar.f9973b != null && aVar.f9973b.isShowing()) {
                        aVar.f9973b.dismiss();
                    }
                }
            }
            com.bytedance.android.livesdkapi.d.f n2 = TTLiveSDKContext.getHostService().n();
            if (n2 != null) {
                n2.a(true);
            }
            this.C.post(new i(this));
        }
    }

    public final void d() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2560, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            PortraitInteractionFragment portraitInteractionFragment = this.h;
            if (PatchProxy.isSupport(new Object[0], portraitInteractionFragment, PortraitInteractionFragment.S, false, 6319, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], portraitInteractionFragment, PortraitInteractionFragment.S, false, 6319, new Class[0], Void.TYPE);
            } else if (portraitInteractionFragment.f11426c) {
                if (PatchProxy.isSupport(new Object[0], portraitInteractionFragment, PortraitInteractionFragment.S, false, 6312, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], portraitInteractionFragment, PortraitInteractionFragment.S, false, 6312, new Class[0], Void.TYPE);
                    return;
                }
                if (!portraitInteractionFragment.t.isUsingCamera || TTLiveSDKContext.getHostService().b().b().a(com.bytedance.android.livesdk.w.e.HAS_SHOW_FILTER_GUIDE)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 || portraitInteractionFragment.getView() == null) {
                    portraitInteractionFragment.T.setVisibility(8);
                } else {
                    View findViewById = portraitInteractionFragment.getView().findViewById(C0906R.id.dtu);
                    View findViewById2 = portraitInteractionFragment.getView().findViewById(C0906R.id.dtv);
                    TTLiveSDKContext.getHostService().b().b().a((d.a) com.bytedance.android.livesdk.w.e.HAS_SHOW_FILTER_GUIDE, true);
                    portraitInteractionFragment.T.setVisibility(0);
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    portraitInteractionFragment.U.setText(portraitInteractionFragment.getString(C0906R.string.djz));
                    portraitInteractionFragment.T.setClickable(true);
                    portraitInteractionFragment.T.setOnClickListener(new el(portraitInteractionFragment, findViewById, findViewById2));
                }
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2546, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2546, new Class[0], Void.TYPE);
            return;
        }
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).clearGiftIconBitmapCache();
        this.i.removeObserver(this);
        b();
        this.i.removeObserver(this);
        if (this.L != null) {
            this.L.a();
        }
        if (this.n != null) {
            this.n.d();
            this.n = null;
        }
        if (this.m != null) {
            this.m.dismiss();
            this.m = null;
        }
        if (this.J != null) {
            this.J.d();
        }
        if (this.i != null) {
            this.i.removeObserver(this);
        }
        if (this.x != null) {
            this.x.clear();
        }
        if (this.f8749c != null) {
            ab.a(this.f8749c.getId());
            LinkCrossRoomDataHolder.a(this.f8749c.getId());
        }
        this.C.removeCallbacksAndMessages(null);
        TTLiveSDKContext.getLiveService().d().a((Room) null);
        com.bytedance.android.livesdkapi.d.f n2 = TTLiveSDKContext.getHostService().n();
        if (n2 != null) {
            n2.b(true);
        }
        com.bytedance.android.livesdk.app.dataholder.d.a().b();
        if (this.f8749c != null) {
            this.f8749c.getId();
        }
        com.bytedance.android.livesdk.v.j.q().a().c();
        try {
            ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).clearAssets("effects");
        } catch (IllegalStateException unused) {
        }
        super.onDestroy();
        com.bytedance.android.livesdk.live.a.a(false);
    }

    @SuppressLint({"RtlHardcoded"})
    private void a(o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, f8747a, false, 2589, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, f8747a, false, 2589, new Class[]{o.class}, Void.TYPE);
        } else if (oVar.f10187a == 0) {
            this.j.post(new o(this));
        } else if (oVar.f10187a == 1) {
            this.j.post(new p(this));
        } else if (oVar.f10187a != 2) {
            if (oVar.f10187a == 3) {
                this.j.post(new r(this));
            }
        } else if (oVar.f10188b instanceof SurfaceView) {
            this.j.post(new q(this, (SurfaceView) oVar.f10188b));
        }
    }

    private void b(boolean z2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f8747a, false, 2574, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f8747a, false, 2574, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!this.H) {
            b(1);
        }
        StringBuilder sb = new StringBuilder("room close onLiveEnd endByBanned:");
        if (z2) {
            str = "true";
        } else {
            str = "false";
        }
        sb.append(str);
        com.bytedance.android.live.core.c.a.a("LiveBroadcastFragment", sb.toString());
        c();
        if (z2) {
            com.bytedance.android.livesdk.live.a.a(false, 103, "room banned");
        } else {
            com.bytedance.android.livesdk.live.a.a(true, 0, null);
        }
    }

    public final void c(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8747a, false, 2587, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8747a, false, 2587, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 == 30001 || i3 == 50002 || i3 == 30003) {
            com.bytedance.android.live.core.c.a.a("LiveBroadcastFragment", "room close onStatusResult errorCode:" + i3);
            b(false);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8747a, false, 2539, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8747a, false, 2539, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        SlideFinishUtil.a(getActivity());
        super.onActivityCreated(bundle);
        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("AbsInteractionFragment");
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitNowAllowingStateLoss();
        }
    }

    public void onEvent(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f8747a, false, 2588, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f8747a, false, 2588, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (this.f8749c != null && !this.f8749c.isLiveTypeAudio()) {
            long j2 = mVar.f15093a;
            for (com.bytedance.android.livesdk.gift.model.b bVar : ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getStickerGifts()) {
                if (bVar.r == j2) {
                    p.a(this.f8749c.getId());
                    return;
                }
            }
        }
    }

    private void a(q qVar) {
        if (PatchProxy.isSupport(new Object[]{qVar}, this, f8747a, false, 2586, new Class[]{q.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar}, this, f8747a, false, 2586, new Class[]{q.class}, Void.TYPE);
        } else if (qVar.f10192a == 7) {
            this.F = true;
            this.I.a();
            this.J.a();
        } else if (qVar.f10192a == 8) {
            this.F = false;
            j();
        } else if (qVar.f10192a == 10) {
            this.k.removeAllViews();
            SurfaceView surfaceView = (SurfaceView) qVar.f10193b;
            surfaceView.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
            this.k.addView(surfaceView);
        } else {
            if (qVar.f10192a == 11) {
                this.k.removeAllViews();
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8747a, false, 2537, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8747a, false, 2537, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.live.a.a(true);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        if (com.bytedance.android.livesdkapi.a.a.f18615c) {
            getActivity().finish();
            return;
        }
        this.i = DataCenter.create(ViewModelProviders.of((Fragment) this), this);
        if (TTLiveSDKContext.getHostService().e() != null) {
            TTLiveSDKContext.getHostService().e();
            TTLiveSDKContext.getHostService().e().b(com.bytedance.android.livesdkapi.j.a.LiveResource.getPackageName());
        }
        g.a().b();
        com.bytedance.android.livesdk.v.j.q().a().b();
        this.x.clear();
        Class<com.bytedance.android.livesdk.effect.a.a> cls = com.bytedance.android.livesdk.effect.a.a.class;
        if (PatchProxy.isSupport(new Object[]{cls}, this, f8747a, false, 2536, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f8747a, false, 2536, new Class[]{Class.class}, Void.TYPE);
        } else {
            this.x.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8752a;

                public final void accept(T t) throws Exception {
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{t2}, this, f8752a, false, 2607, new Class[]{Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{t2}, this, f8752a, false, 2607, new Class[]{Object.class}, Void.TYPE);
                        return;
                    }
                    if (t2 instanceof com.bytedance.android.livesdk.effect.a.a) {
                        LiveBroadcastFragment.this.onEvent((com.bytedance.android.livesdk.effect.a.a) t2);
                    }
                }
            }));
        }
        this.i.observeForever("cmd_interact_state_change", this).observeForever("cmd_pk_state_change", this).observeForever("cmd_show_illegal_dialog", this);
    }

    public void onEvent(com.bytedance.android.livesdk.effect.a.a aVar) {
        float f2;
        com.bytedance.android.livesdk.effect.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f8747a, false, 2571, new Class[]{com.bytedance.android.livesdk.effect.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f8747a, false, 2571, new Class[]{com.bytedance.android.livesdk.effect.a.a.class}, Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.a()) {
            com.bytedance.android.livesdk.effect.a f3 = ((ak) this.v).f();
            if (f3 != null) {
                int i2 = aVar2.f13712a;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, f3, com.bytedance.android.livesdk.effect.a.f13706a, false, 8112, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    com.bytedance.android.livesdk.effect.a aVar3 = f3;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, aVar3, com.bytedance.android.livesdk.effect.a.f13706a, false, 8112, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (com.bytedance.android.live.uikit.a.a.a()) {
                    float f4 = 0.0f;
                    if (f3.f13707b == 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = 0.05f;
                    }
                    f3.f13711f = f2;
                    if (i2 == 0) {
                        f4 = 1.0f;
                    }
                    f3.f13710e = f4;
                }
                f3.i(f3.f13710e);
                f3.h(f3.f13711f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r0.equals("cmd_pk_state_change") != false) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(@android.support.annotation.Nullable com.bytedance.ies.sdk.widgets.KVData r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f8747a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 2547(0x9f3, float:3.569E-42)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f8747a
            r3 = 0
            r4 = 2547(0x9f3, float:3.569E-42)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            boolean r0 = r9.b_()
            if (r0 == 0) goto L_0x00a7
            if (r10 == 0) goto L_0x00a7
            java.lang.String r0 = r10.getKey()
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r0 = r10.getData()
            if (r0 != 0) goto L_0x0045
            goto L_0x00a7
        L_0x0045:
            boolean r0 = r9.f8192e
            if (r0 != 0) goto L_0x004f
            java.util.Queue<com.bytedance.ies.sdk.widgets.KVData> r0 = r9.E
            r0.offer(r10)
            return
        L_0x004f:
            java.lang.String r0 = r10.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -1540323875(0xffffffffa43085dd, float:-3.8277303E-17)
            if (r2 == r3) goto L_0x007c
            r3 = -1180299966(0xffffffffb9a60d42, float:-3.1671865E-4)
            if (r2 == r3) goto L_0x0072
            r3 = 562756910(0x218afd2e, float:9.41826E-19)
            if (r2 == r3) goto L_0x0068
            goto L_0x0085
        L_0x0068:
            java.lang.String r2 = "cmd_show_illegal_dialog"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0085
            r7 = 2
            goto L_0x0086
        L_0x0072:
            java.lang.String r2 = "cmd_interact_state_change"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0085
            r7 = 0
            goto L_0x0086
        L_0x007c:
            java.lang.String r2 = "cmd_pk_state_change"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r7 = -1
        L_0x0086:
            switch(r7) {
                case 0: goto L_0x009c;
                case 1: goto L_0x0092;
                case 2: goto L_0x008a;
                default: goto L_0x0089;
            }
        L_0x0089:
            goto L_0x00a6
        L_0x008a:
            r9.m()
            com.bytedance.android.livesdk.live.d r0 = r9.n
            r0.f15829f = r8
            goto L_0x00a6
        L_0x0092:
            java.lang.Object r0 = r10.getData()
            com.bytedance.android.livesdk.chatroom.event.o r0 = (com.bytedance.android.livesdk.chatroom.event.o) r0
            r9.a((com.bytedance.android.livesdk.chatroom.event.o) r0)
            return
        L_0x009c:
            java.lang.Object r0 = r10.getData()
            com.bytedance.android.livesdk.chatroom.event.q r0 = (com.bytedance.android.livesdk.chatroom.event.q) r0
            r9.a((com.bytedance.android.livesdk.chatroom.event.q) r0)
            return
        L_0x00a6:
            return
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveBroadcastFragment.onChanged(com.bytedance.ies.sdk.widgets.KVData):void");
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8747a, false, 2565, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8747a, false, 2565, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.h();
        }
        this.I.a(i2);
        this.C.removeCallbacksAndMessages(null);
        this.n.e();
        a();
        this.H = true;
    }

    public void handleMsg(Message message) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{message}, this, f8747a, false, 2555, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f8747a, false, 2555, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        int i2 = message.what;
        if (3 == i2) {
            Object obj = message.obj;
            if (PatchProxy.isSupport(new Object[]{obj}, this, f8747a, false, 2566, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj}, this, f8747a, false, 2566, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            c cVar = new c(this, (byte) 0);
            if (obj instanceof com.bytedance.android.live.a.a.b.a) {
                cVar.f8773a = ((com.bytedance.android.live.a.a.b.a) obj).getErrorCode();
            }
            if (cVar.f8773a == 30001 || cVar.f8773a == 50002 || cVar.f8773a == 30003) {
                com.bytedance.android.live.core.c.a.a("LiveBroadcastFragment", "room close handleUpdateRoomStatusResult errorCode:" + cVar.f8773a);
                b(false);
            }
        } else if (message.obj instanceof Exception) {
            if (13 == i2) {
                this.B = false;
                j();
            }
        } else {
            if (13 == i2) {
                this.B = false;
                StreamUrl streamUrl = this.f8749c.getStreamUrl();
                streamUrl.l = ((String) message.obj) + this.A.f18728c;
                j();
            }
            if (35 == i2) {
                final com.bytedance.android.livesdkapi.depend.model.live.h hVar = (com.bytedance.android.livesdkapi.depend.model.live.h) message.obj;
                if (PatchProxy.isSupport(new Object[]{hVar}, this, f8747a, false, 2558, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar}, this, f8747a, false, 2558, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.h.class}, Void.TYPE);
                } else if (hVar != null) {
                    double d2 = hVar.f18739b;
                    long j2 = hVar.f18741d;
                    if (((Double) com.bytedance.android.livesdk.w.b.aR.a()).doubleValue() < 9.0d || d2 >= 9.0d) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (com.bytedance.android.livesdkapi.depend.model.live.h.f18738a == hVar.f18740c && ((Long) com.bytedance.android.livesdk.w.b.aS.a()).longValue() != j2) {
                        z2 = true;
                    }
                    if (z2) {
                        new com.bytedance.android.live.uikit.toast.a(getContext()).a(48).a(5000).b(true).a(false).a(C0906R.layout.ahq, new com.bytedance.android.live.uikit.toast.d() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f8758a;

                            public final void a(View view) {
                                View view2 = view;
                                if (PatchProxy.isSupport(new Object[]{view2}, this, f8758a, false, 2610, new Class[]{View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view2}, this, f8758a, false, 2610, new Class[]{View.class}, Void.TYPE);
                                    return;
                                }
                                view2.setOnClickListener(new View.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f8761a;

                                    /* renamed from: c  reason: collision with root package name */
                                    private static final /* synthetic */ a.C0900a f8762c;

                                    static {
                                        if (PatchProxy.isSupport(new Object[0], null, f8761a, true, 2612, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], null, f8761a, true, 2612, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveBroadcastFragment.java", AnonymousClass1.class);
                                        f8762c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.LiveBroadcastFragment$5$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 891);
                                    }

                                    public void onClick(View view) {
                                        if (PatchProxy.isSupport(new Object[]{view}, this, f8761a, false, 2611, new Class[]{View.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{view}, this, f8761a, false, 2611, new Class[]{View.class}, Void.TYPE);
                                            return;
                                        }
                                        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f8762c, this, this, view));
                                        if (!TextUtils.isEmpty(hVar.f18742e)) {
                                            com.bytedance.android.livesdk.v.j.q().f().a(LiveBroadcastFragment.this.getContext(), com.bytedance.android.livesdk.browser.c.c.b(hVar.f18742e).a(true));
                                        }
                                    }
                                });
                            }
                        });
                    }
                    com.bytedance.android.livesdk.w.b.aR.a(Double.valueOf(d2));
                    com.bytedance.android.livesdk.w.b.aS.a(Long.valueOf(j2));
                }
            }
        }
    }

    public void onEvent(com.bytedance.android.livesdkapi.depend.b.c cVar) {
        com.bytedance.android.livesdkapi.depend.b.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f8747a, false, 2572, new Class[]{com.bytedance.android.livesdkapi.depend.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f8747a, false, 2572, new Class[]{com.bytedance.android.livesdkapi.depend.b.c.class}, Void.TYPE);
        } else if (cVar2.f18620a == 1) {
            com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.d8l);
        } else {
            if (cVar2.f18620a == 0) {
                com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.d8r);
            }
        }
    }

    private <T> void a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f8747a, false, 2541, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f8747a, false, 2541, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        this.y.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8754a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f8754a, false, 2608, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f8754a, false, 2608, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof m) {
                    LiveBroadcastFragment.this.onEvent((m) t);
                } else if (t instanceof s) {
                    LiveBroadcastFragment.this.onEvent((s) t);
                } else {
                    if (t instanceof com.bytedance.android.livesdkapi.depend.b.c) {
                        LiveBroadcastFragment.this.onEvent((com.bytedance.android.livesdkapi.depend.b.c) t);
                    }
                }
            }
        }));
    }

    public final void b(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f8747a, false, 2577, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f8747a, false, 2577, new Class[]{CharSequence.class}, Void.TYPE);
        } else if (b_()) {
            l();
            this.m.b(charSequence2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(com.bytedance.android.livesdk.chatroom.event.s r13) {
        /*
            r12 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f8747a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.s> r1 = com.bytedance.android.livesdk.chatroom.event.s.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 2567(0xa07, float:3.597E-42)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f8747a
            r3 = 0
            r4 = 2567(0xa07, float:3.597E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.s> r1 = com.bytedance.android.livesdk.chatroom.event.s.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            int r0 = r13.f10195a
            r1 = 3
            if (r0 == r1) goto L_0x020e
            r1 = 11
            r10 = 1
            if (r0 == r1) goto L_0x01d7
            r1 = 17
            if (r0 == r1) goto L_0x01cf
            switch(r0) {
                case 5: goto L_0x01cf;
                case 6: goto L_0x0087;
                case 7: goto L_0x0044;
                case 8: goto L_0x0087;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x01f8
        L_0x0044:
            com.bytedance.android.livesdk.message.model.c r0 = r13.f10197c
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.message.model.j
            if (r1 == 0) goto L_0x0083
            com.bytedance.android.livesdk.message.model.j r0 = (com.bytedance.android.livesdk.message.model.j) r0
            int r1 = r0.f16637b
            r2 = 4
            if (r1 != r2) goto L_0x0083
            com.bytedance.android.livesdk.message.model.j$a r1 = r0.f16639d
            if (r1 == 0) goto L_0x007f
            com.bytedance.android.livesdk.message.model.j$a r1 = r0.f16639d
            java.lang.String r1 = r1.f16640a
            r12.r = r1
            com.bytedance.android.livesdk.message.model.j$a r1 = r0.f16639d
            com.bytedance.android.livesdkapi.h.e r1 = r1.f16642c
            java.lang.String r2 = ""
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r1, (java.lang.String) r2)
            r12.s = r1
            com.bytedance.android.livesdk.message.model.j$a r1 = r0.f16639d
            com.bytedance.android.livesdkapi.h.e r1 = r1.f16643d
            java.lang.String r2 = ""
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r1, (java.lang.String) r2)
            r12.t = r1
            com.bytedance.android.livesdk.message.model.j$a r0 = r0.f16639d
            com.bytedance.android.livesdkapi.h.e r0 = r0.f16644e
            java.lang.String r1 = ""
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r0, (java.lang.String) r1)
            r12.u = r0
        L_0x007f:
            r12.b((boolean) r8)
            return
        L_0x0083:
            r12.b((boolean) r9)
            return
        L_0x0087:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f8747a
            r3 = 0
            r4 = 2568(0xa08, float:3.599E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a9
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f8747a
            r3 = 0
            r4 = 2568(0xa08, float:3.599E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00a9:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r12.i
            r1 = 0
            if (r0 == 0) goto L_0x00b7
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r12.i
            java.lang.String r2 = "data_member_count"
            java.lang.Object r0 = r0.get(r2)
            goto L_0x00b8
        L_0x00b7:
            r0 = r1
        L_0x00b8:
            if (r0 == 0) goto L_0x00c5
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x00c5
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            if (r0 > 0) goto L_0x00d0
            r2 = 2131563540(0x7f0d1414, float:1.875254E38)
            java.lang.String r2 = r12.getString(r2)
            goto L_0x00e3
        L_0x00d0:
            android.content.res.Resources r2 = r12.getResources()
            r3 = 2131886099(0x7f120013, float:1.9406767E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r9] = r5
            java.lang.String r2 = r2.getQuantityString(r3, r0, r4)
        L_0x00e3:
            boolean r3 = com.bytedance.android.live.uikit.a.a.a()
            if (r3 == 0) goto L_0x0107
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r12.i
            java.lang.String r4 = "data_dou_plus_promote_message"
            java.lang.Object r3 = r3.get((java.lang.String) r4, r1)
            com.bytedance.android.livesdk.message.model.t r3 = (com.bytedance.android.livesdk.message.model.t) r3
            if (r3 == 0) goto L_0x00fd
            long r3 = r3.f16683b
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x00fd
            r3 = 1
            goto L_0x00fe
        L_0x00fd:
            r3 = 0
        L_0x00fe:
            if (r3 == 0) goto L_0x0107
            r2 = 2131563355(0x7f0d135b, float:1.8752165E38)
            java.lang.String r2 = r12.getString(r2)
        L_0x0107:
            boolean r3 = com.bytedance.android.live.uikit.a.a.c()
            if (r3 == 0) goto L_0x0115
            r0 = 2131563539(0x7f0d1413, float:1.8752538E38)
            java.lang.String r2 = com.bytedance.android.live.core.utils.ac.a((int) r0)
            goto L_0x013f
        L_0x0115:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x013f
            if (r0 <= 0) goto L_0x013f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r2.indexOf(r0)
            r4 = -1
            if (r3 == r4) goto L_0x013f
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r2)
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r5 = -56832(0xffffffffffff2200, float:NaN)
            r4.<init>(r5)
            int r0 = r0.length()
            int r0 = r0 + r3
            r5 = 34
            r1.setSpan(r4, r3, r0, r5)
        L_0x013f:
            r3 = 0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r12.f8749c
            if (r0 == 0) goto L_0x014b
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r12.f8749c
            long r3 = r0.getId()
        L_0x014b:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r5 = "room_id"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r5, r3)
            com.bytedance.android.livesdk.j.a r3 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r4 = "anchor_close_live_popup"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.bytedance.android.livesdk.j.c.j r6 = new com.bytedance.android.livesdk.j.c.j
            r6.<init>()
            java.lang.String r7 = "live_take_detail"
            com.bytedance.android.livesdk.j.c.j r6 = r6.a(r7)
            java.lang.String r7 = "click"
            com.bytedance.android.livesdk.j.c.j r6 = r6.f(r7)
            java.lang.String r7 = "live_take"
            com.bytedance.android.livesdk.j.c.j r6 = r6.b(r7)
            r5[r9] = r6
            com.bytedance.android.livesdk.j.c.k r6 = new com.bytedance.android.livesdk.j.c.k
            r6.<init>()
            r5[r8] = r6
            r3.a(r4, r0, r5)
            com.bytedance.android.livesdk.widget.n r3 = com.bytedance.android.livesdk.widget.n.a()
            android.content.Context r4 = r12.getContext()
            com.bytedance.android.livesdk.widget.n$a r3 = r3.a(r4)
            r4 = 2131564348(0x7f0d173c, float:1.8754179E38)
            com.bytedance.android.livesdk.widget.n$a r3 = r3.d(r4)
            if (r1 != 0) goto L_0x019b
            r1 = r2
        L_0x019b:
            com.bytedance.android.livesdk.widget.n$a r1 = r3.c((java.lang.CharSequence) r1)
            boolean r2 = com.bytedance.android.live.uikit.a.a.b()
            if (r2 == 0) goto L_0x01a9
            r2 = 2131564318(0x7f0d171e, float:1.8754118E38)
            goto L_0x01ac
        L_0x01a9:
            r2 = 2131564161(0x7f0d1681, float:1.87538E38)
        L_0x01ac:
            com.bytedance.android.livesdk.l r3 = new com.bytedance.android.livesdk.l
            r3.<init>(r12, r0)
            com.bytedance.android.livesdk.widget.n$a r1 = r1.b(r9, r2, r3)
            boolean r2 = com.bytedance.android.live.uikit.a.a.b()
            if (r2 == 0) goto L_0x01bf
            r2 = 2131564316(0x7f0d171c, float:1.8754114E38)
            goto L_0x01c2
        L_0x01bf:
            r2 = 2131563151(0x7f0d128f, float:1.875175E38)
        L_0x01c2:
            com.bytedance.android.livesdk.m r3 = new com.bytedance.android.livesdk.m
            r3.<init>(r12, r0)
            com.bytedance.android.livesdk.widget.n$a r0 = r1.b(r8, r2, r3)
            r0.c()
            goto L_0x01f8
        L_0x01cf:
            android.support.v4.app.FragmentActivity r0 = r12.getActivity()
            r0.finish()
            return
        L_0x01d7:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f8747a
            r3 = 0
            r4 = 2573(0xa0d, float:3.606E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f9
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f8747a
            r3 = 0
            r4 = 2573(0xa0d, float:3.606E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x01f8:
            return
        L_0x01f9:
            r12.b((int) r8)
            android.content.Context r0 = r12.getContext()
            r1 = 2131564084(0x7f0d1634, float:1.8753643E38)
            com.bytedance.android.live.uikit.d.a.a((android.content.Context) r0, (int) r1, (long) r10)
            android.support.v4.app.FragmentActivity r0 = r12.getActivity()
            r0.finish()
            return
        L_0x020e:
            boolean r0 = r12.B
            if (r0 == 0) goto L_0x0213
            return
        L_0x0213:
            com.bytedance.android.live.core.widget.HSImageView r0 = r12.l
            r1 = 8
            r0.setVisibility(r1)
            r12.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveBroadcastFragment.onEvent(com.bytedance.android.livesdk.chatroom.event.s):void");
    }

    public final HashMap<String, String> a(HashMap<String, String> hashMap) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f8747a, false, 2593, new Class[]{HashMap.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{hashMap}, this, f8747a, false, 2593, new Class[]{HashMap.class}, HashMap.class);
        }
        if (this.f8749c != null) {
            j2 = this.f8749c.getId();
        } else {
            j2 = 0;
        }
        hashMap.put("room_id", String.valueOf(j2));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(HashMap hashMap, DialogInterface dialogInterface) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f8747a, false, 2570, new Class[]{HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap}, this, f8747a, false, 2570, new Class[]{HashMap.class}, Void.TYPE);
        } else {
            com.bytedance.android.livesdk.j.a.a().a("anchor_close_live_confirm", hashMap, new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").f("click").b("live_take"), new com.bytedance.android.livesdk.j.c.k());
            if (((Boolean) com.bytedance.android.livesdk.app.dataholder.d.a().f9041c).booleanValue()) {
                this.l.postDelayed(new n(this), 1000);
            } else {
                b(1);
                c();
                com.bytedance.android.livesdk.live.a.a(true, 0, null);
            }
            HashMap hashMap2 = new HashMap();
            if (Boolean.TRUE.equals(this.i.get("data_has_sticker_effective"))) {
                str = "use";
            } else {
                str = "unused";
            }
            hashMap2.put("use_status", str);
            com.bytedance.android.livesdk.j.a.a().a("pm_live_sticker_use", a(hashMap2), new com.bytedance.android.livesdk.j.c.j().a("anchor_live_ending").f("other").b("live_take"), new com.bytedance.android.livesdk.j.c.k());
            HashMap hashMap3 = new HashMap();
            if (Boolean.TRUE.equals(this.i.get("data_has_filter_effective"))) {
                str2 = "use";
            } else {
                str2 = "unused";
            }
            hashMap3.put("use_status", str2);
            com.bytedance.android.livesdk.j.a.a().a("pm_live_filter_use", a(hashMap3), new com.bytedance.android.livesdk.j.c.j().a("anchor_live_ending").f("other").b("live_take"), new com.bytedance.android.livesdk.j.c.k());
        }
        dialogInterface.dismiss();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        com.bytedance.android.livesdkapi.depend.model.live.a aVar;
        int i2;
        int[] iArr;
        boolean z2;
        String str;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        com.bytedance.android.live.base.model.c.a aVar2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f8747a, false, 2540, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f8747a, false, 2540, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        WidgetManager dataCenter = WidgetManager.of((Fragment) this, getView()).setDataCenter(this.i);
        this.l = (HSImageView) getView().findViewById(C0906R.id.bd2);
        this.k = (FrameLayout) getView().findViewById(C0906R.id.f0);
        this.j = (FrameLayout) getView().findViewById(C0906R.id.c5q);
        this.f8749c = TTLiveSDKContext.getLiveService().d().a();
        this.i.lambda$put$1$DataCenter("data_room", this.f8749c);
        if (getArguments() != null) {
            Bundle bundle3 = getArguments().getBundle(PushConstants.EXTRA);
            if (bundle3 == null) {
                aVar2 = null;
            } else {
                aVar2 = (com.bytedance.android.live.base.model.c.a) bundle3.getSerializable("data_dou_plus_promote_entry");
            }
            com.bytedance.android.livesdk.utils.j.a(aVar2, this.f8749c, this.i);
        }
        if (!Room.isValid(this.f8749c) || this.f8749c.getStreamUrl() == null) {
            getActivity().finish();
            return;
        }
        g a2 = com.bytedance.android.livesdk.j.a.a().a(Room.class);
        if (a2 instanceof n) {
            ((n) a2).a(this.f8749c);
        }
        LinkCrossRoomDataHolder.a(this.f8749c.getId(), ViewModelProviders.of((Fragment) this), this);
        this.A = this.f8749c.getStreamUrlExtraSafely();
        if (this.f8749c.isLiveTypeAudio()) {
            HSImageView hSImageView = (HSImageView) getView().findViewById(C0906R.id.c_2);
            View findViewById = getView().findViewById(C0906R.id.c_3);
            hSImageView.setVisibility(0);
            findViewById.setVisibility(0);
            com.bytedance.android.livesdk.chatroom.f.b.a(hSImageView, this.f8749c.getOwner().getAvatarLarge(), (Postprocessor) new u(5, ((float) UIUtils.getScreenWidth(getContext())) / ((float) UIUtils.getScreenHeight(getContext())), null));
        }
        long id = this.f8749c.getId();
        getContext();
        this.n = new com.bytedance.android.livesdk.live.d(id);
        this.n.a(this);
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2548, new Class[0], Void.TYPE);
        } else {
            this.L = new com.bytedance.android.livesdk.live.a.c.b(this.f8749c);
            this.L.f15790b = this;
            this.I = new com.ss.ugc.live.c.a.c.b(this.L);
            this.I.a();
            boolean isLiveTypeAudio = this.f8749c.isLiveTypeAudio();
            if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2550, new Class[0], int[].class)) {
                i2 = 3;
                iArr = (int[]) PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2550, new Class[0], int[].class);
            } else {
                i2 = 3;
                int intValue = ((Integer) LiveSettingKeys.STREAM_DEFINITION_LEVEL.a()).intValue();
                iArr = (intValue <= 0 || intValue > N.length) ? new int[]{this.A.c(), this.A.d(), this.A.e(), this.A.i} : N[intValue - 1];
            }
            int intValue2 = ((Integer) LiveSettingKeys.STREAM_HARDWARE_ENCODE.a()).intValue();
            if (intValue2 <= 0) {
                z2 = this.A.j;
            } else if (intValue2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int b2 = this.A.b();
            int a3 = this.A.a();
            if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.a()).length == 2) {
                b2 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.a())[0].intValue();
                a3 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.a())[1].intValue();
            }
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[i2];
            if (((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.a()).intValue() >= 0) {
                i9 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.a()).intValue();
            }
            if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.a()).length == i2) {
                i7 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.a())[0].intValue();
                i6 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.a())[1].intValue();
                i8 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.a())[2].intValue();
            }
            int intValue3 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_BITRATE_ADAPT.a()).intValue();
            if (intValue3 < 0) {
                intValue3 = this.A.k;
            }
            boolean z5 = this.A.s;
            if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ROI.a()).booleanValue()) {
                z5 = true;
            }
            e.a h2 = new e.a(getContext()).a(isLiveTypeAudio ? 1 : 0).f(b2).g(a3).c(i6).b(i7).d(i8).h(i9);
            if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_SDK_PARAMS.a()).booleanValue()) {
                str = this.f8749c.getStreamUrl().k;
            } else {
                str = "";
            }
            e.a a4 = h2.b(str).e(this.A.f()).a(z2).a(ac.a((int) C0906R.string.dkc)).a((com.ss.ugc.live.c.a.a.a) new com.bytedance.android.livesdk.live.a.a.a());
            a4.r = new com.bytedance.android.livesdk.live.a.a.b();
            e.a a5 = a4.a((com.ss.ugc.live.c.a.b.a) new com.bytedance.android.livesdk.live.a.b.a());
            a5.s = intValue3;
            if (this.A.p) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            a5.w = i3;
            a5.u = this.A.q;
            a5.v = this.A.r;
            a5.x = z5;
            a5.y = ((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_BACKGROUND_STOP_MIC.a()).booleanValue();
            if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.a()).intValue() == 1) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            e.a i10 = a5.i(i4);
            Room room = this.f8749c;
            DataCenter dataCenter2 = this.i;
            if (PatchProxy.isSupport(new Object[]{room, dataCenter2}, null, com.bytedance.android.livesdk.utils.j.f17613a, true, 13640, new Class[]{Room.class, DataCenter.class}, Boolean.TYPE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{room, dataCenter2}, null, com.bytedance.android.livesdk.utils.j.f17613a, true, 13640, new Class[]{Room.class, DataCenter.class}, Boolean.TYPE)).booleanValue();
            } else if ((room == null || !room.isDouPlusPromotion) && (dataCenter2 == null || !((com.bytedance.android.live.base.model.c.a) dataCenter2.get("data_dou_plus_promote_entry", com.bytedance.android.live.base.model.c.a.defaultOne())).hasDouPlusEntry)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                i10.m = 300000;
            }
            if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2549, new Class[0], Boolean.TYPE)) {
                z4 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2549, new Class[0], Boolean.TYPE)).booleanValue();
            } else if ((this.f8749c == null || !this.f8749c.isLiveTypeAudio()) && ((Integer) LiveConfigSettingKeys.LIVE_USE_LIVE_CORE.a()).intValue() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                this.J = new com.ss.ugc.live.c.a.b(i10.a());
            } else {
                if (((Integer) com.bytedance.android.livesdk.w.b.g.b()).intValue() == 0) {
                    i5 = 2;
                } else {
                    i5 = 1;
                }
                e.a j2 = i10.j(i5);
                j2.D = s.INST.getModelFilePath();
                j2.E = s.INST.getResourceFinder(getContext());
                int g = this.A.g();
                int h3 = this.A.h();
                j2.F = g;
                j2.G = h3;
                this.J = new com.ss.ugc.live.c.a.c(i10.a());
            }
            this.J.a((com.ss.ugc.live.c.a.d) this);
        }
        if (this.f8749c.isLiveTypeAudio()) {
            this.l.setBackgroundResource(2130840792);
            this.v = new AudioWidget(this);
        } else {
            com.bytedance.android.livesdk.chatroom.f.b.a(this.l, this.f8749c.getOwner().getAvatarThumb(), (Postprocessor) new u(5, (float) (ac.c() / ac.b()), null));
            this.v = new VideoWidget2(this, this.A, this.J);
        }
        dataCenter.load(C0906R.id.c5q, this.v);
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2551, new Class[0], Void.TYPE);
        } else {
            int i11 = this.f8749c.getStreamUrl().f18707b;
            String str2 = this.A.f18727b;
            if (2 == i11 && !StringUtils.isEmpty(str2)) {
                com.bytedance.android.livesdk.chatroom.bl.h a6 = com.bytedance.android.livesdk.chatroom.bl.h.a();
                WeakHandler weakHandler = this.C;
                if (PatchProxy.isSupport(new Object[]{weakHandler, str2}, a6, com.bytedance.android.livesdk.chatroom.bl.h.f9797a, false, 3998, new Class[]{Handler.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{weakHandler, str2}, a6, com.bytedance.android.livesdk.chatroom.bl.h.f9797a, false, 3998, new Class[]{Handler.class, String.class}, Void.TYPE);
                } else {
                    com.bytedance.ies.d.a.b.a().a(weakHandler, new Callable(str2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f9811a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f9812b;

                        public final Object call() throws Exception {
                            if (PatchProxy.isSupport(new Object[0], this, f9811a, false, 4042, new Class[0], Object.class)) {
                                return PatchProxy.accessDispatch(new Object[0], this, f9811a, false, 4042, new Class[0], Object.class);
                            }
                            String str = this.f9812b;
                            if (!PatchProxy.isSupport(new Object[]{str}, null, g.f9796a, true, 3980, new Class[]{String.class}, String.class)) {
                                return NetworkUtils.executeGet(0, str, false, false, null, null, false);
                            }
                            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, g.f9796a, true, 3980, new Class[]{String.class}, String.class);
                        }

                        {
                            this.f9812b = r2;
                        }
                    }, 13);
                }
                this.B = true;
            }
        }
        this.i.lambda$put$1$DataCenter("data_message_manager", ab.a(this.f8749c.getId(), true, getContext()));
        if (PatchProxy.isSupport(new Object[0], this, f8747a, false, 2552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8747a, false, 2552, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("AbsInteractionFragment");
            if (findFragmentByTag != null) {
                supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
            if (getArguments() != null) {
                bundle2 = getArguments().getBundle(PushConstants.EXTRA);
            } else {
                bundle2 = null;
            }
            this.h = new PortraitInteractionFragment();
            this.h.setArguments(bundle2);
            this.i.lambda$put$1$DataCenter("data_room", this.f8749c);
            this.h.a(this.i, true, (AbsInteractionFragment.b) new AbsInteractionFragment.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8756a;

                public final void a(ax axVar) {
                    if (PatchProxy.isSupport(new Object[]{axVar}, this, f8756a, false, 2609, new Class[]{ax.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{axVar}, this, f8756a, false, 2609, new Class[]{ax.class}, Void.TYPE);
                        return;
                    }
                    if (LiveBroadcastFragment.this.n != null) {
                        LiveBroadcastFragment.this.n.a(axVar);
                    }
                }
            }, (EnterRoomExtra) null);
            if (!this.f8749c.isLiveTypeAudio()) {
                this.h.W = (z) this.v;
                ((ak) this.v).a((b) this.h);
                ((ak) this.v).a((a) this.h);
                this.h.a((Runnable) new h(this));
            }
            PortraitInteractionFragment portraitInteractionFragment = this.h;
            if (this.f8749c.isLiveTypeAudio()) {
                aVar = com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO;
            } else {
                aVar = com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO;
            }
            portraitInteractionFragment.t = aVar;
            this.h.show(getActivity().getSupportFragmentManager(), "AbsInteractionFragment");
        }
        if (this.f8749c != null && !this.f8749c.isLiveTypeAudio()) {
            p.a(this.f8749c.getId());
        }
        this.K = new PhoneStateReceiver(this);
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).syncGiftList(this.M, this.f8749c.getId(), 2, true);
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d b3 = com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.b();
        b3.a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.FILTER, (d.a) new e(this, (byte) 0));
        b3.a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.BEAUTY, (d.a) new d(this, (byte) 0));
        if (this.v instanceof VideoWidget2) {
            this.w = new DutyGiftControlWidget((VideoWidget2) this.v);
            dataCenter.load(C0906R.id.ajq, this.w);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f8747a, false, 2543, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f8747a, false, 2543, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (this.h != null) {
            int i4 = i2;
            int i5 = i3;
            this.h.onActivityResult(i2, i3, intent2);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8747a, false, 2538, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8747a, false, 2538, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.aia, viewGroup2, false);
        if (com.bytedance.android.live.uikit.a.a.a()) {
            inflate.setBackgroundColor(Color.parseColor("#161823"));
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            inflate.setBackgroundResource(2130840894);
        } else {
            inflate.setBackgroundColor(Color.parseColor("#303342"));
        }
        return inflate;
    }
}
