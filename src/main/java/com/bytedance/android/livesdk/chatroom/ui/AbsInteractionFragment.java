package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.base.model.user.k;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.an;
import com.bytedance.android.livesdk.banner.a;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.BannerRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.dutygift.DutyGiftInfo;
import com.bytedance.android.livesdk.chatroom.dutygift.f;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.chatroom.event.ae;
import com.bytedance.android.livesdk.chatroom.event.ag;
import com.bytedance.android.livesdk.chatroom.event.ah;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.event.u;
import com.bytedance.android.livesdk.chatroom.event.v;
import com.bytedance.android.livesdk.chatroom.event.x;
import com.bytedance.android.livesdk.chatroom.interact.ab;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.presenter.bj;
import com.bytedance.android.livesdk.chatroom.presenter.bv;
import com.bytedance.android.livesdk.chatroom.ui.ej;
import com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastInfoWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentPromotionWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FirstRechargeWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.GameQuizWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LuckyBoxWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.OfficialPromotionStatusWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PkPromotionWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PreloadWebViewWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.StickerTipWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.UserPermissionCheckWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.VolumeWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.DutyGiftToolbarWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.z;
import com.bytedance.android.livesdk.chatroom.widget.CountDownView;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.common.ViewModuleManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.fansclub.FansClubAnimationWidget;
import com.bytedance.android.livesdk.fansclub.LiveFansClubEntryWidget;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdk.message.model.af;
import com.bytedance.android.livesdk.message.model.ax;
import com.bytedance.android.livesdk.message.model.ay;
import com.bytedance.android.livesdk.rank.BackToPreRoomWidget;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.RechargeDialog;
import com.bytedance.android.livesdk.wallet.ad;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.bytedance.android.livesdk.wallet.g;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.a;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbsInteractionFragment extends DialogFragment implements Observer<KVData>, com.bytedance.android.live.gift.a.c, d.a, f.a, com.bytedance.android.livesdk.chatroom.view.a, com.bytedance.android.livesdk.chatroom.view.b, DecorationWrapperWidget.a, com.bytedance.android.livesdkapi.depend.a.a, WeakHandler.IHandler, com.bytedance.ies.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11424a;
    private static final /* synthetic */ a.C0900a bq;
    protected RecyclableWidgetManager A;
    public TextMessageWidget B;
    DecorationWrapperWidget C;
    public CommentWidget D;
    LiveRoomUserInfoWidget E;
    public BarrageWidget F;
    public com.bytedance.android.livesdk.user.e G;
    public FrameLayout H;
    public LinearLayout I;
    public com.bytedance.android.livesdk.chatroom.widget.g J;
    public int K;
    public boolean L = false;
    long M = 0;
    public ab N;
    com.bytedance.android.live.gift.a.b O = new com.bytedance.android.live.gift.a.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11456a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f11456a, false, 5601, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11456a, false, 5601, new Class[0], Void.TYPE);
                return;
            }
            ai.a((int) C0906R.string.dje);
            AbsInteractionFragment.this.x.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new ag(0, "live_detail"));
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f11456a, false, 5604, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11456a, false, 5604, new Class[0], Void.TYPE);
                return;
            }
            ai.a((int) C0906R.string.d2r);
        }

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f11456a, false, 5602, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f11456a, false, 5602, new Class[]{String.class}, Void.TYPE);
                return;
            }
            ai.a(str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.bytedance.android.livesdk.gift.model.i r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f11456a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.bytedance.android.livesdk.gift.model.i> r1 = com.bytedance.android.livesdk.gift.model.i.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 5603(0x15e3, float:7.851E-42)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0030
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f11456a
                r3 = 0
                r4 = 5603(0x15e3, float:7.851E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.bytedance.android.livesdk.gift.model.i> r1 = com.bytedance.android.livesdk.gift.model.i.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0030:
                com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r0 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                r0.a()
                com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = com.bytedance.android.livesdk.utils.ab.a()
                if (r0 == 0) goto L_0x005a
                com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = com.bytedance.android.livesdk.utils.ab.a()
                java.lang.Class<com.bytedance.android.live.gift.IGiftService> r1 = com.bytedance.android.live.gift.IGiftService.class
                com.bytedance.android.live.base.b r1 = com.bytedance.android.live.utility.b.a(r1)
                com.bytedance.android.live.gift.IGiftService r1 = (com.bytedance.android.live.gift.IGiftService) r1
                com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r2 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.f11425b
                long r2 = r2.getId()
                com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r4 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                com.bytedance.android.live.base.model.user.User r4 = r4.s
                com.bytedance.android.livesdk.message.model.ab r1 = r1.getGiftMessage(r2, r10, r4)
                r0.insertMessage(r1)
            L_0x005a:
                com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r0 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                com.bytedance.ies.sdk.widgets.DataCenter r0 = r0.x
                java.lang.String r1 = "log_enter_live_source"
                r0.get(r1)
                com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r0 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                com.bytedance.ies.sdk.widgets.DataCenter r0 = r0.x
                java.lang.String r1 = "log_action_type"
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                com.bytedance.android.livesdk.j.a r1 = com.bytedance.android.livesdk.j.a.a()
                java.lang.Class<com.bytedance.android.livesdk.j.c.j> r2 = com.bytedance.android.livesdk.j.c.j.class
                com.bytedance.android.livesdk.j.b.g r1 = r1.a((java.lang.Class) r2)
                java.lang.String r2 = ""
                java.lang.String r3 = ""
                java.util.Map r4 = r1.a()
                java.lang.String r5 = "source"
                boolean r4 = r4.containsKey(r5)
                if (r4 == 0) goto L_0x0095
                java.util.Map r3 = r1.a()
                java.lang.String r4 = "source"
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
            L_0x0095:
                java.util.Map r4 = r1.a()
                java.lang.String r5 = "enter_from"
                boolean r4 = r4.containsKey(r5)
                if (r4 == 0) goto L_0x00ae
                java.util.Map r1 = r1.a()
                java.lang.String r2 = "enter_from"
                java.lang.Object r1 = r1.get(r2)
                r2 = r1
                java.lang.String r2 = (java.lang.String) r2
            L_0x00ae:
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.String r4 = "event_type"
                java.lang.String r5 = "core"
                r1.put(r4, r5)
                java.lang.String r4 = "event_belong"
                java.lang.String r5 = "live_interact"
                r1.put(r4, r5)
                java.lang.String r4 = "event_page"
                java.lang.String r5 = "live_detail"
                r1.put(r4, r5)
                java.lang.String r4 = "room_id"
                com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r5 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r5.f11425b
                long r5 = r5.getId()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r1.put(r4, r5)
                java.lang.String r4 = "enter_from"
                r1.put(r4, r2)
                java.lang.String r2 = "anchor_id"
                com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r4 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r4.f11425b
                com.bytedance.android.live.base.model.user.User r4 = r4.getOwner()
                long r4 = r4.getId()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r1.put(r2, r4)
                java.lang.String r2 = "gift_id"
                long r4 = r10.f15133e
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r1.put(r2, r4)
                java.lang.String r2 = "live_type"
                java.lang.String r4 = "video_live"
                r1.put(r2, r4)
                java.lang.String r2 = "gift_type"
                java.lang.String r4 = "convenient_gift"
                r1.put(r2, r4)
                java.lang.String r2 = "source"
                r1.put(r2, r3)
                java.lang.String r2 = "request_page"
                java.lang.String r3 = "shortcut"
                r1.put(r2, r3)
                java.lang.String r2 = "event_type"
                java.lang.String r3 = "other"
                r1.put(r2, r3)
                java.lang.String r2 = "event_module"
                java.lang.String r3 = "bottom_tab"
                r1.put(r2, r3)
                java.lang.String r2 = "money"
                java.lang.String r3 = "1"
                r1.put(r2, r3)
                java.lang.String r2 = "gift_cnt"
                java.lang.String r3 = "1"
                r1.put(r2, r3)
                java.lang.String r2 = "action_type"
                r1.put(r2, r0)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                long r2 = r10.f15133e
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
                r0.put(r2, r3)
                java.lang.String r2 = "gift_info"
                java.lang.String r0 = com.bytedance.android.livesdk.gift.e.a.a(r0)
                r1.put(r2, r0)
                java.lang.String r0 = "is_first_consume"
                com.bytedance.android.livesdk.v.e r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
                com.bytedance.android.livesdk.user.e r2 = r2.k()
                com.bytedance.android.live.base.model.user.i r2 = r2.a()
                int r2 = com.bytedance.android.livesdk.wallet.b.b.a((com.bytedance.android.live.base.model.user.i) r2)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.put(r0, r2)
                java.lang.String r0 = "growth_deepevent"
                java.lang.String r2 = "1"
                r1.put(r0, r2)
                com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()
                java.lang.String r2 = "send_gift"
                java.lang.Object[] r3 = new java.lang.Object[r8]
                r0.a(r2, r1, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.AnonymousClass17.a(com.bytedance.android.livesdk.gift.model.i):void");
        }
    };
    public int P;
    public int Q;
    public boolean R = false;
    private a S = a.NORMAL;
    private a T = this.S;
    private String U;
    private EnterRoomExtra V;
    private CountDownView W;
    private Chronometer X;
    private TextView Y;
    private Dialog Z;
    private VolumeWidget aA;
    private DailyRankWidget aB;
    private PromotionStatusWidget aC;
    private RadioWidget aD;
    private CommentPromotionWidget aE;
    private RoomPushWidget aF;
    private TopRankWidget aG;
    private BottomRightBannerWidget aH;
    private PkPromotionWidget aI;
    private StickerTipWidget aJ;
    private RechargeWidget aK;
    private LiveShareWidget aL;
    private BroadcastInfoWidget aM;
    private FirstRechargeWidget aN;
    private CommonToastWidget aO;
    private FollowGuideWidget aP;
    private UserPermissionCheckWidget aQ;
    private EndWidget aR;
    private PokemonWidget aS;
    private View aT;
    private int aU;
    private boolean aV;
    private TextView aW;
    private TextView aX;
    private LottieAnimationView aY;
    private com.bytedance.android.livesdk.chatroom.dutygift.f aZ;
    private FrameLayout aa;
    private RelativeLayout.LayoutParams ab;
    private View ac;
    private View ad;
    private RelativeLayout.LayoutParams ae;
    private RelativeLayout.LayoutParams af;
    private DialogFragment ag;
    private boolean ah;
    private GestureDetectLayout ai;
    private FrameLayout aj;
    private View ak;
    private com.bytedance.android.livesdk.chatroom.presenter.e al;
    private bj am;
    private bv an;
    private com.bytedance.android.livesdk.k.a ao;
    private com.bytedance.android.livesdk.banner.a ap;
    private LiveProfileDialogV2 aq;
    private LiveProfileSettingDialog ar;
    private en as;
    private com.bytedance.android.livesdk.wallet.g at;
    private Widget au;
    private EnterAnimWidget av;
    private GameQuizWidget aw;
    private LiveRoomNotifyWidget ax;
    private LiveToolbarWidget ay;
    private DutyGiftToolbarWidget az;

    /* renamed from: b  reason: collision with root package name */
    public Room f11425b;
    private DialogInterface.OnKeyListener ba = new DialogInterface.OnKeyListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11430a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f11432c;

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            int i2 = i;
            KeyEvent keyEvent2 = keyEvent;
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent2}, this, f11430a, false, 5576, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent2}, this, f11430a, false, 5576, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (com.bytedance.android.live.uikit.a.a.a() && (i2 == 25 || i2 == 24)) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.g.a(0, i2, keyEvent2));
                return true;
            } else if (keyEvent.getAction() == 0) {
                this.f11432c = true;
                return false;
            } else if (4 != i2 || !this.f11432c) {
                return false;
            } else {
                AbsInteractionFragment.this.i_();
                this.f11432c = false;
                return true;
            }
        }
    };
    private SingleObserver<i> bb = new SingleObserver<i>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11434a;

        public final void onError(Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f11434a, false, 5590, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f11434a, false, 5590, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            AbsInteractionFragment.this.a(th2);
        }

        public final void onSubscribe(Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f11434a, false, 5588, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f11434a, false, 5588, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            AbsInteractionFragment.this.p.add(disposable2);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(User user) throws Exception {
            if (AbsInteractionFragment.this.f11426c && user != null) {
                AbsInteractionFragment.this.s = user;
                AbsInteractionFragment.this.x.lambda$put$1$DataCenter("data_user_in_room", AbsInteractionFragment.this.s);
                com.bytedance.android.livesdk.w.b.Q.a(Boolean.valueOf(AbsInteractionFragment.this.s.getRoomAutoGiftThanks()));
                k userAttr = AbsInteractionFragment.this.s.getUserAttr();
                if (!(userAttr == null || AbsInteractionFragment.this.D == null)) {
                    AbsInteractionFragment.this.D.b(userAttr.f7773b);
                }
            }
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            final i iVar = (i) obj;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f11434a, false, 5589, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f11434a, false, 5589, new Class[]{i.class}, Void.TYPE);
                return;
            }
            AbsInteractionFragment.this.a(Observable.just(iVar).map(v.f12304b).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new w(this), x.f12308b));
            if (com.bytedance.android.live.uikit.a.a.a()) {
                AbsInteractionFragment.this.a(((WalletApi) j.q().d().a(WalletApi.class)).isFirstCharge().compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new Consumer<com.bytedance.android.live.core.network.response.d<com.bytedance.android.livesdk.wallet.a.c>>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11436a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
                        if (PatchProxy.isSupport(new Object[]{dVar}, this, f11436a, false, 5594, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dVar}, this, f11436a, false, 5594, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
                        } else if (AbsInteractionFragment.this.f11426c && iVar != null && dVar.f7871b != null) {
                            ((User) iVar).setNeverRecharge(((com.bytedance.android.livesdk.wallet.a.c) dVar.f7871b).f17871a);
                        }
                    }
                }, com.bytedance.android.live.core.rxutils.i.b()));
            }
        }
    };
    private Dialog bc = null;
    private RechargeDialog bd;
    private com.bytedance.android.live.gift.a.a be;
    private boolean bf = true;
    private int bg;
    private int bh;
    private int bi;
    private int bj;
    private boolean bk = false;
    private View.OnClickListener bl = new a(this);
    private Runnable bm;
    private Runnable bn = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11458a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f11458a, false, 5605, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11458a, false, 5605, new Class[0], Void.TYPE);
            } else if (AbsInteractionFragment.this.f11426c && TTLiveSDKContext.getHostService().k().c() && !AbsInteractionFragment.this.f11427d) {
                if (!AbsInteractionFragment.this.f11425b.getOwner().isFollowing()) {
                    AbsInteractionFragment.this.b(true);
                    AbsInteractionFragment.this.g = true;
                    JSONObject jSONObject = new JSONObject();
                    String str = "";
                    try {
                        com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class);
                        if (a2.a().containsKey("enter_from")) {
                            str = (String) a2.a().get("enter_from");
                        }
                        jSONObject.put("request_id", AbsInteractionFragment.this.f11425b.getRequestId());
                        jSONObject.put("log_pb", AbsInteractionFragment.this.f11425b.getLog_pb());
                        jSONObject.put("enter_from", str);
                    } catch (Exception unused) {
                    }
                    com.bytedance.android.livesdk.j.f.a((Context) AbsInteractionFragment.this.getActivity()).a("live_follow_popup", "show", AbsInteractionFragment.this.f11425b.getOwner().getId(), (long) ((Integer) com.bytedance.android.livesdk.config.a.C.a()).intValue(), jSONObject);
                }
                AbsInteractionFragment.this.a(120000);
            }
        }
    };
    private View.OnTouchListener bo = new View.OnTouchListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11466a;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            LottieAnimationView lottieAnimationView;
            float f2;
            Animator animator;
            boolean z;
            boolean z2;
            MotionEvent motionEvent2 = motionEvent;
            boolean z3 = true;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f11466a, false, 5582, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f11466a, false, 5582, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (com.bytedance.android.live.uikit.a.a.f()) {
                switch (motionEvent.getAction()) {
                    case 0:
                        AbsInteractionFragment.this.P = (int) motionEvent.getRawX();
                        AbsInteractionFragment.this.Q = (int) motionEvent.getRawY();
                        break;
                    case 1:
                        if (!AbsInteractionFragment.this.R && AbsInteractionFragment.this.J != null) {
                            com.bytedance.android.livesdk.chatroom.widget.g gVar = AbsInteractionFragment.this.J;
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(x), Float.valueOf(y)}, gVar, com.bytedance.android.livesdk.chatroom.widget.g.f13485a, false, 7833, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                                com.bytedance.android.livesdk.chatroom.widget.g gVar2 = gVar;
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(x), Float.valueOf(y)}, gVar2, com.bytedance.android.livesdk.chatroom.widget.g.f13485a, false, 7833, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                            } else {
                                if (PatchProxy.isSupport(new Object[0], gVar, com.bytedance.android.livesdk.chatroom.widget.g.f13485a, false, 7832, new Class[0], LottieAnimationView.class)) {
                                    lottieAnimationView = (LottieAnimationView) PatchProxy.accessDispatch(new Object[0], gVar, com.bytedance.android.livesdk.chatroom.widget.g.f13485a, false, 7832, new Class[0], LottieAnimationView.class);
                                } else {
                                    lottieAnimationView = new LottieAnimationView(gVar.f13486b.getContext());
                                    lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    lottieAnimationView.setAnimation("digganimation/data.json");
                                    lottieAnimationView.setImageAssetsFolder("digganimation/images");
                                    gVar.f13486b.addView(lottieAnimationView, new ViewGroup.LayoutParams((int) UIUtils.dip2Px(gVar.f13486b.getContext(), 180.0f), (int) UIUtils.dip2Px(gVar.f13486b.getContext(), 180.0f)));
                                }
                                ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(((int) x) - ((int) UIUtils.dip2Px(lottieAnimationView.getContext(), 90.0f)), ((int) y) - ((int) UIUtils.dip2Px(lottieAnimationView.getContext(), 90.0f)), 0, 0);
                                }
                                lottieAnimationView.setLayoutParams(layoutParams);
                                if (((int) (Math.random() * 10.0d)) % 2 == 1) {
                                    f2 = 30.0f;
                                } else {
                                    f2 = -30.0f;
                                }
                                lottieAnimationView.setRotation(f2);
                                UIUtils.setViewVisibility(lottieAnimationView, 0);
                                if (PatchProxy.isSupport(new Object[]{lottieAnimationView}, gVar, com.bytedance.android.livesdk.chatroom.widget.g.f13485a, false, 7834, new Class[]{LottieAnimationView.class}, Animator.class)) {
                                    com.bytedance.android.livesdk.chatroom.widget.g gVar3 = gVar;
                                    animator = (Animator) PatchProxy.accessDispatch(new Object[]{lottieAnimationView}, gVar3, com.bytedance.android.livesdk.chatroom.widget.g.f13485a, false, 7834, new Class[]{LottieAnimationView.class}, Animator.class);
                                } else {
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lottieAnimationView, "alpha", new float[]{1.0f, 0.0f});
                                    ofFloat.setInterpolator(PathInterpolatorCompat.create(0.48f, 0.04f, 0.52f, 0.96f));
                                    ofFloat.addListener(new AnimatorListenerAdapter(lottieAnimationView) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f13487a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ LottieAnimationView f13488b;

                                        public final void onAnimationEnd(Animator animator) {
                                            if (PatchProxy.isSupport(new Object[]{animator}, this, f13487a, false, 7835, new Class[]{Animator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{animator}, this, f13487a, false, 7835, new Class[]{Animator.class}, Void.TYPE);
                                                return;
                                            }
                                            UIUtils.setViewVisibility(this.f13488b, 8);
                                            g.this.f13486b.removeView(this.f13488b);
                                        }

                                        {
                                            this.f13488b = r2;
                                        }
                                    });
                                    ofFloat.setDuration(2000);
                                    animator = ofFloat;
                                }
                                lottieAnimationView.playAnimation();
                                if (animator != null) {
                                    animator.start();
                                }
                            }
                            AbsInteractionFragment absInteractionFragment = AbsInteractionFragment.this;
                            if (PatchProxy.isSupport(new Object[0], absInteractionFragment, AbsInteractionFragment.f11424a, false, 5533, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], absInteractionFragment, AbsInteractionFragment.f11424a, false, 5533, new Class[0], Void.TYPE);
                            } else if (!(absInteractionFragment.f11425b == null || absInteractionFragment.f11425b.getOwner() == null)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("group_source", "22");
                                hashMap.put("anchor_id", absInteractionFragment.f11425b.getOwner().getId());
                                hashMap.put("room_id", absInteractionFragment.f11425b.getId());
                                com.bytedance.android.livesdk.j.a.a().a("light_screen", hashMap, Room.class);
                            }
                        }
                        AbsInteractionFragment.this.R = false;
                        break;
                    case 2:
                        int rawX = ((int) motionEvent.getRawX()) - AbsInteractionFragment.this.P;
                        int rawY = ((int) motionEvent.getRawY()) - AbsInteractionFragment.this.Q;
                        if (Math.abs(rawX) > AbsInteractionFragment.this.K || Math.abs(rawY) > AbsInteractionFragment.this.K) {
                            z = true;
                        } else {
                            z = false;
                        }
                        AbsInteractionFragment absInteractionFragment2 = AbsInteractionFragment.this;
                        if (AbsInteractionFragment.this.R || z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        absInteractionFragment2.R = z2;
                        if (AbsInteractionFragment.this.R) {
                            AbsInteractionFragment.this.P = (int) motionEvent.getRawX();
                            AbsInteractionFragment.this.Q = (int) motionEvent.getRawY();
                            break;
                        }
                        break;
                }
            }
            AbsInteractionFragment absInteractionFragment3 = AbsInteractionFragment.this;
            if (motionEvent.getAction() == 0) {
                z3 = false;
            }
            if (!absInteractionFragment3.c(z3)) {
                AbsInteractionFragment.this.r.onTouchEvent(motionEvent2);
            }
            return false;
        }
    };
    private b bp;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11426c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11427d;

    /* renamed from: e  reason: collision with root package name */
    boolean f11428e;

    /* renamed from: f  reason: collision with root package name */
    boolean f11429f;
    public boolean g;
    protected boolean h;
    protected int i;
    View j;
    protected View k;
    protected View l;
    protected FrameLayout m;
    View n;
    protected View o;
    public final CompositeDisposable p = new CompositeDisposable();
    protected WeakHandler q = new WeakHandler(this);
    public GestureDetector r;
    public User s;
    public com.bytedance.android.livesdkapi.depend.model.live.a t;
    boolean u = false;
    public List<com.bytedance.android.livesdk.d.a> v = new ArrayList();
    public com.bytedance.android.livesdk.chatroom.detail.g w;
    protected DataCenter x;
    public ViewModuleManager y;
    public BaseDialogFragment z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$10  reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11433a = new int[com.bytedance.android.livesdkapi.depend.f.a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.android.livesdkapi.depend.f.a[] r0 = com.bytedance.android.livesdkapi.depend.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11433a = r0
                int[] r0 = f11433a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.MEMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11433a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.ROOM_NOTIFY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11433a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.COMMON_TOAST     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11433a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.FOLLOW_GUIDE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f11433a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.REMIND     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f11433a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.GUIDE_MESSAGE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f11433a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.DOU_PLUS_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.AnonymousClass10.<clinit>():void");
        }
    }

    enum a {
        NORMAL,
        RADIO,
        RADIO_INTERACT,
        PK;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static abstract class b {
        public void a(int i) {
        }

        public void a(ax axVar) {
        }
    }

    final class c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11477a;

        private c() {
        }

        public final boolean onDown(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f11477a, false, 5609, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f11477a, false, 5609, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            AbsInteractionFragment absInteractionFragment = AbsInteractionFragment.this;
            if (PatchProxy.isSupport(new Object[0], absInteractionFragment, AbsInteractionFragment.f11424a, false, 5535, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], absInteractionFragment, AbsInteractionFragment.f11424a, false, 5535, new Class[0], Void.TYPE);
            } else {
                ((InputMethodManager) absInteractionFragment.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(absInteractionFragment.j.getWindowToken(), 0);
            }
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f11477a, false, 5611, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f11477a, false, 5611, new Class[]{MotionEvent.class}, Void.TYPE);
                return;
            }
            super.onLongPress(motionEvent);
            if (AbsInteractionFragment.this.f11425b != null) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new s(26, AbsInteractionFragment.this.f11425b));
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f11477a, false, 5610, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f11477a, false, 5610, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!AbsInteractionFragment.this.f11427d && !((Boolean) com.bytedance.android.livesdk.app.dataholder.d.a().f9041c).booleanValue() && AbsInteractionFragment.this.F != null && AbsInteractionFragment.this.F.a(false)) {
                return true;
            } else {
                return false;
            }
        }

        /* synthetic */ c(AbsInteractionFragment absInteractionFragment, byte b2) {
            this();
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f11477a, false, 5608, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f11477a, false, 5608, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if ((AbsInteractionFragment.this.t.isStreamingBackground && AbsInteractionFragment.this.f11427d) || motionEvent == null || motionEvent2 == null) {
                return false;
            } else {
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) <= 200.0f || Math.abs(f2) <= 100.0f) {
                    return false;
                }
                if (AbsInteractionFragment.this.f11427d) {
                    AbsInteractionFragment.this.a(x);
                } else {
                    AbsInteractionFragment absInteractionFragment = AbsInteractionFragment.this;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(x)}, absInteractionFragment, AbsInteractionFragment.f11424a, false, 5534, new Class[]{Float.TYPE}, Void.TYPE)) {
                        AbsInteractionFragment absInteractionFragment2 = absInteractionFragment;
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(x)}, absInteractionFragment2, AbsInteractionFragment.f11424a, false, 5534, new Class[]{Float.TYPE}, Void.TYPE);
                    } else if (!(absInteractionFragment instanceof LandscapeInteractionFragment)) {
                        boolean a2 = com.bytedance.android.live.uikit.d.c.a(absInteractionFragment.getContext());
                        if ((!a2 || x >= 0.0f) && (a2 || x <= 0.0f)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        int width = absInteractionFragment.j.getWidth();
                        if (a2) {
                            width = -width;
                        }
                        if (z) {
                            com.bytedance.android.livesdk.j.f.a((Context) absInteractionFragment.getActivity()).a("live_drawing_left_right", "right", absInteractionFragment.f11425b.getId(), 0);
                            absInteractionFragment.j.animate().x((float) width).setListener(new AnimatorListenerAdapter() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f11468a;

                                public final void onAnimationEnd(Animator animator) {
                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f11468a, false, 5583, new Class[]{Animator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f11468a, false, 5583, new Class[]{Animator.class}, Void.TYPE);
                                        return;
                                    }
                                    com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.b(true));
                                }
                            }).start();
                            absInteractionFragment.f(true);
                        } else {
                            com.bytedance.android.livesdk.j.f.a((Context) absInteractionFragment.getActivity()).a("live_drawing_left_right", "left", absInteractionFragment.f11425b.getId(), 0);
                            absInteractionFragment.j.animate().x(0.0f).setListener(new AnimatorListenerAdapter() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f11470a;

                                public final void onAnimationStart(Animator animator) {
                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f11470a, false, 5584, new Class[]{Animator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f11470a, false, 5584, new Class[]{Animator.class}, Void.TYPE);
                                        return;
                                    }
                                    com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.b(false));
                                }
                            }).start();
                            absInteractionFragment.f(false);
                        }
                    }
                }
                return true;
            }
        }
    }

    public interface d {
        void a(long j, long j2);
    }

    class e implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11479a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11480c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11479a, false, 5614, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11479a, false, 5614, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f11479a, false, 5616, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f11479a, false, 5616, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11479a, false, 5615, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11479a, false, 5615, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11479a, true, 5613, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11479a, true, 5613, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("AbsInteractionFragment.java", e.class);
            f11480c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$ToolbarEmotionBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 3457);
        }

        private e() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11479a, false, 5612, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11479a, false, 5612, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f11480c, this, this, view));
            AbsInteractionFragment.this.F.a(false);
            if (!(AbsInteractionFragment.this.f11425b == null || AbsInteractionFragment.this.f11425b.getOwner() == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("to_user_id", AbsInteractionFragment.this.f11425b.getOwner().getId());
                hashMap.put("orientation", AbsInteractionFragment.this.f11425b.getOrientation());
                hashMap.put("group_source", "22");
                hashMap.put("room_id", AbsInteractionFragment.this.f11425b.getId());
                com.bytedance.android.livesdk.j.a.a().a("click_emoticons", hashMap, Room.class);
            }
        }

        /* synthetic */ e(AbsInteractionFragment absInteractionFragment, byte b2) {
            this();
        }
    }

    class f implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11482a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11483c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11482a, false, 5619, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11482a, false, 5619, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f11482a, false, 5621, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f11482a, false, 5621, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11482a, false, 5620, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11482a, false, 5620, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11482a, true, 5618, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11482a, true, 5618, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("AbsInteractionFragment.java", f.class);
            f11483c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$ToolbarLotteryBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 3450);
        }

        private f() {
        }

        public void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f11482a, false, 5617, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f11482a, false, 5617, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f11483c, this, this, view2));
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.i.b());
        }

        /* synthetic */ f(AbsInteractionFragment absInteractionFragment, byte b2) {
            this();
        }
    }

    class g implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11485a;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11486d;

        /* renamed from: b  reason: collision with root package name */
        com.bytedance.android.livesdk.popup.d f11487b;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f11485a, false, 5629, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f11485a, false, 5629, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11485a, false, 5628, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11485a, false, 5628, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11485a, true, 5627, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11485a, true, 5627, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("AbsInteractionFragment.java", g.class);
            f11486d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$ToolbarShareBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 3291);
        }

        private g() {
        }

        public void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f11485a, false, 5623, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11485a, false, 5623, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f11486d, this, this, view));
            String str2 = (String) AbsInteractionFragment.this.x.get("log_action_type");
            HashMap hashMap = new HashMap();
            hashMap.put("position", "detail_bottom_bar");
            com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class);
            if (a2 != null) {
                hashMap.putAll(a2.a());
            }
            if (AbsInteractionFragment.this.getActivity() != null) {
                b.a a3 = com.bytedance.android.livesdkapi.depend.h.b.a(AbsInteractionFragment.this.f11425b);
                a3.a(AbsInteractionFragment.this.G.b());
                if (com.bytedance.android.live.uikit.a.a.j()) {
                    a3.w = AbsInteractionFragment.this.f11425b.getId();
                    a3.x = AbsInteractionFragment.this.f11425b.getOwnerUserId();
                }
                com.bytedance.android.livesdk.share.b g = TTLiveSDKContext.getHostService().g();
                FragmentActivity activity = AbsInteractionFragment.this.getActivity();
                if (AbsInteractionFragment.this.f11427d) {
                    str = AbsInteractionFragment.this.f11425b.getAnchorShareText();
                } else {
                    str = AbsInteractionFragment.this.f11425b.getUserShareText();
                }
                g.a((Activity) activity, a3.a(str).a(AbsInteractionFragment.this.f11427d).a((Map<String, String>) hashMap).a(com.bytedance.android.livesdk.utils.j.a(AbsInteractionFragment.this.x)).e(str2).a(), (com.bytedance.android.livesdkapi.depend.h.a) new com.bytedance.android.livesdkapi.depend.h.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11489a;

                    public final void a(Throwable th) {
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:39:0x016d  */
                    /* JADX WARNING: Removed duplicated region for block: B:40:0x016f  */
                    /* JADX WARNING: Removed duplicated region for block: B:41:0x0171  */
                    /* JADX WARNING: Removed duplicated region for block: B:42:0x0173  */
                    /* JADX WARNING: Removed duplicated region for block: B:43:0x0175  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(java.lang.String r22, java.lang.String r23) {
                        /*
                            r21 = this;
                            r7 = r21
                            r8 = r22
                            r9 = r23
                            r10 = 2
                            java.lang.Object[] r0 = new java.lang.Object[r10]
                            r11 = 0
                            r0[r11] = r8
                            r12 = 1
                            r0[r12] = r9
                            com.meituan.robust.ChangeQuickRedirect r2 = f11489a
                            java.lang.Class[] r5 = new java.lang.Class[r10]
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r5[r11] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r5[r12] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r3 = 0
                            r4 = 5637(0x1605, float:7.899E-42)
                            r1 = r21
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                            if (r0 == 0) goto L_0x0045
                            java.lang.Object[] r0 = new java.lang.Object[r10]
                            r0[r11] = r8
                            r0[r12] = r9
                            com.meituan.robust.ChangeQuickRedirect r2 = f11489a
                            r3 = 0
                            r4 = 5637(0x1605, float:7.899E-42)
                            java.lang.Class[] r5 = new java.lang.Class[r10]
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r5[r11] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r5[r12] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r1 = r21
                            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                            return
                        L_0x0045:
                            boolean r0 = com.bytedance.android.live.uikit.a.a.f()
                            if (r0 != 0) goto L_0x01ba
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$g r0 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.this
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$g r1 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.this
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r1 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r1.f11425b
                            long r1 = r1.getId()
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$g r3 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.this
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r3 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f11425b
                            java.lang.String r3 = r3.getLabels()
                            r4 = 4
                            java.lang.Object[] r13 = new java.lang.Object[r4]
                            java.lang.Long r5 = new java.lang.Long
                            r5.<init>(r1)
                            r13[r11] = r5
                            r13[r12] = r9
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
                            r13[r10] = r5
                            r5 = 3
                            r13[r5] = r3
                            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.f11485a
                            r16 = 0
                            r17 = 5624(0x15f8, float:7.881E-42)
                            java.lang.Class[] r6 = new java.lang.Class[r4]
                            java.lang.Class r14 = java.lang.Long.TYPE
                            r6[r11] = r14
                            java.lang.Class<java.lang.String> r14 = java.lang.String.class
                            r6[r12] = r14
                            java.lang.Class r14 = java.lang.Integer.TYPE
                            r6[r10] = r14
                            java.lang.Class<java.lang.String> r14 = java.lang.String.class
                            r6[r5] = r14
                            java.lang.Class r19 = java.lang.Void.TYPE
                            r14 = r0
                            r18 = r6
                            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                            if (r6 == 0) goto L_0x00ce
                            java.lang.Object[] r13 = new java.lang.Object[r4]
                            java.lang.Long r6 = new java.lang.Long
                            r6.<init>(r1)
                            r13[r11] = r6
                            r13[r12] = r9
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                            r13[r10] = r1
                            r13[r5] = r3
                            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.f11485a
                            r16 = 0
                            r17 = 5624(0x15f8, float:7.881E-42)
                            java.lang.Class[] r1 = new java.lang.Class[r4]
                            java.lang.Class r2 = java.lang.Long.TYPE
                            r1[r11] = r2
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r1[r12] = r2
                            java.lang.Class r2 = java.lang.Integer.TYPE
                            r1[r10] = r2
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r1[r5] = r2
                            java.lang.Class r19 = java.lang.Void.TYPE
                            r14 = r0
                            r18 = r1
                            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                            goto L_0x01ba
                        L_0x00ce:
                            com.bytedance.android.livesdk.utils.o r6 = new com.bytedance.android.livesdk.utils.o
                            r6.<init>()
                            java.lang.String r15 = "target_id"
                            java.lang.Object[] r13 = new java.lang.Object[r12]
                            r13[r11] = r9
                            com.meituan.robust.ChangeQuickRedirect r16 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.f11485a
                            r17 = 0
                            r18 = 5625(0x15f9, float:7.882E-42)
                            java.lang.Class[] r14 = new java.lang.Class[r12]
                            java.lang.Class<java.lang.String> r19 = java.lang.String.class
                            r14[r11] = r19
                            java.lang.Class r19 = java.lang.Integer.TYPE
                            r20 = r14
                            r14 = r0
                            r4 = r15
                            r15 = r16
                            r16 = r17
                            r17 = r18
                            r18 = r20
                            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                            r14 = -1
                            if (r13 == 0) goto L_0x011a
                            java.lang.Object[] r13 = new java.lang.Object[r12]
                            r13[r11] = r9
                            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.f11485a
                            r16 = 0
                            r17 = 5625(0x15f9, float:7.882E-42)
                            java.lang.Class[] r5 = new java.lang.Class[r12]
                            java.lang.Class<java.lang.String> r14 = java.lang.String.class
                            r5[r11] = r14
                            java.lang.Class r19 = java.lang.Integer.TYPE
                            r14 = r0
                            r18 = r5
                            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                            java.lang.Integer r5 = (java.lang.Integer) r5
                            int r5 = r5.intValue()
                            goto L_0x0176
                        L_0x011a:
                            int r13 = r23.hashCode()
                            r15 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
                            if (r13 == r15) goto L_0x015f
                            r15 = 3616(0xe20, float:5.067E-42)
                            if (r13 == r15) goto L_0x0155
                            r15 = 108102557(0x671839d, float:4.5423756E-35)
                            if (r13 == r15) goto L_0x014b
                            r15 = 113011944(0x6bc6ce8, float:7.0877763E-35)
                            if (r13 == r15) goto L_0x0141
                            r15 = 1355475581(0x50caea7d, float:2.72349204E10)
                            if (r13 == r15) goto L_0x0137
                            goto L_0x0169
                        L_0x0137:
                            java.lang.String r13 = "weixin_moment"
                            boolean r13 = r9.equals(r13)
                            if (r13 == 0) goto L_0x0169
                            r13 = 3
                            goto L_0x016a
                        L_0x0141:
                            java.lang.String r13 = "weibo"
                            boolean r13 = r9.equals(r13)
                            if (r13 == 0) goto L_0x0169
                            r13 = 4
                            goto L_0x016a
                        L_0x014b:
                            java.lang.String r13 = "qzone"
                            boolean r13 = r9.equals(r13)
                            if (r13 == 0) goto L_0x0169
                            r13 = 1
                            goto L_0x016a
                        L_0x0155:
                            java.lang.String r13 = "qq"
                            boolean r13 = r9.equals(r13)
                            if (r13 == 0) goto L_0x0169
                            r13 = 0
                            goto L_0x016a
                        L_0x015f:
                            java.lang.String r13 = "weixin"
                            boolean r13 = r9.equals(r13)
                            if (r13 == 0) goto L_0x0169
                            r13 = 2
                            goto L_0x016a
                        L_0x0169:
                            r13 = -1
                        L_0x016a:
                            switch(r13) {
                                case 0: goto L_0x0175;
                                case 1: goto L_0x0173;
                                case 2: goto L_0x0176;
                                case 3: goto L_0x0171;
                                case 4: goto L_0x016f;
                                default: goto L_0x016d;
                            }
                        L_0x016d:
                            r5 = -1
                            goto L_0x0176
                        L_0x016f:
                            r5 = 5
                            goto L_0x0176
                        L_0x0171:
                            r5 = 4
                            goto L_0x0176
                        L_0x0173:
                            r5 = 2
                            goto L_0x0176
                        L_0x0175:
                            r5 = 1
                        L_0x0176:
                            java.lang.String r5 = java.lang.String.valueOf(r5)
                            com.bytedance.android.livesdk.utils.o r4 = r6.a(r4, r5)
                            java.lang.String r5 = "share_type"
                            java.lang.String r6 = "1"
                            com.bytedance.android.livesdk.utils.o r4 = r4.a(r5, r6)
                            java.lang.String r5 = "common_label_list"
                            java.lang.String r3 = java.lang.String.valueOf(r3)
                            com.bytedance.android.livesdk.utils.o r3 = r4.a(r5, r3)
                            java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f17622b
                            com.bytedance.android.livesdk.v.f r4 = com.bytedance.android.livesdk.v.j.q()
                            com.bytedance.android.livesdk.y r4 = r4.d()
                            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi> r5 = com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi.class
                            java.lang.Object r4 = r4.a(r5)
                            com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi r4 = (com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi) r4
                            io.reactivex.Observable r1 = r4.sendShare(r1, r3)
                            com.bytedance.android.live.core.rxutils.g r2 = com.bytedance.android.live.core.rxutils.i.a()
                            io.reactivex.Observable r1 = r1.compose(r2)
                            com.bytedance.android.livesdk.chatroom.ui.aa r2 = new com.bytedance.android.livesdk.chatroom.ui.aa
                            r2.<init>(r0)
                            io.reactivex.functions.Consumer r0 = com.bytedance.android.live.core.rxutils.i.b()
                            r1.subscribe(r2, r0)
                        L_0x01ba:
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$g r0 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.this
                            java.lang.Object[] r13 = new java.lang.Object[r10]
                            r13[r11] = r8
                            r13[r12] = r9
                            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.f11485a
                            r16 = 0
                            r17 = 5626(0x15fa, float:7.884E-42)
                            java.lang.Class[] r1 = new java.lang.Class[r10]
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r1[r11] = r2
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r1[r12] = r2
                            java.lang.Class r19 = java.lang.Void.TYPE
                            r14 = r0
                            r18 = r1
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                            if (r1 == 0) goto L_0x01fc
                            java.lang.Object[] r13 = new java.lang.Object[r10]
                            r13[r11] = r8
                            r13[r12] = r9
                            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.f11485a
                            r16 = 0
                            r17 = 5626(0x15fa, float:7.884E-42)
                            java.lang.Class[] r1 = new java.lang.Class[r10]
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r1[r11] = r2
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r1[r12] = r2
                            java.lang.Class r19 = java.lang.Void.TYPE
                            r14 = r0
                            r18 = r1
                            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                            goto L_0x0262
                        L_0x01fc:
                            java.util.HashMap r1 = new java.util.HashMap
                            r1.<init>()
                            java.lang.String r2 = "share_platform"
                            r1.put(r2, r8)
                            java.lang.String r2 = "is_pyramid_sale"
                            java.lang.String r3 = "0"
                            r1.put(r2, r3)
                            java.lang.String r2 = "type"
                            r1.put(r2, r9)
                            java.lang.String r2 = "share_type"
                            r1.put(r2, r9)
                            java.lang.String r2 = "log_pb"
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r3 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f11425b
                            java.lang.String r3 = r3.getLog_pb()
                            r1.put(r2, r3)
                            boolean r2 = com.bytedance.android.live.uikit.a.a.f()
                            if (r2 == 0) goto L_0x024c
                            java.lang.String r2 = "share_platform"
                            r1.put(r2, r8)
                            java.lang.String r2 = "share_type"
                            r1.put(r2, r9)
                            java.lang.String r2 = "orientation"
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r0 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f11425b
                            int r0 = r0.getOrientation()
                            java.lang.String r0 = java.lang.String.valueOf(r0)
                            r1.put(r2, r0)
                            java.lang.String r0 = "share_position"
                            java.lang.String r2 = "detail_bottom_bar"
                            r1.put(r0, r2)
                        L_0x024c:
                            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()
                            java.lang.String r2 = "share"
                            java.lang.Object[] r3 = new java.lang.Object[r10]
                            com.bytedance.android.livesdk.j.c.j r4 = new com.bytedance.android.livesdk.j.c.j
                            r4.<init>()
                            r3[r11] = r4
                            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                            r3[r12] = r4
                            r0.a(r2, r1, r3)
                        L_0x0262:
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$g r0 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.this
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r0 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                            com.bytedance.ies.sdk.widgets.DataCenter r0 = r0.x
                            boolean r0 = com.bytedance.android.livesdk.utils.j.b(r0)
                            if (r0 == 0) goto L_0x0287
                            java.lang.Class<com.bytedance.android.livesdkapi.c.a> r0 = com.bytedance.android.livesdkapi.c.a.class
                            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.b.a(r0)
                            com.bytedance.android.livesdkapi.c.a r0 = (com.bytedance.android.livesdkapi.c.a) r0
                            java.lang.String r1 = "live_ad"
                            java.lang.String r2 = "live_share"
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$g r3 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.this
                            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r3 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.this
                            com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.x
                            java.util.Map r3 = com.bytedance.android.livesdk.utils.j.c(r3)
                            r0.a((boolean) r12, (java.lang.String) r1, (java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)
                        L_0x0287:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.g.AnonymousClass1.a(java.lang.String, java.lang.String):void");
                    }
                });
            }
        }

        /* synthetic */ g(AbsInteractionFragment absInteractionFragment, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f11485a, false, 5622, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f11485a, false, 5622, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            if (com.bytedance.android.livesdkapi.a.a.f18614b && !com.bytedance.android.live.uikit.a.a.j() && ((Boolean) com.bytedance.android.livesdk.w.b.V.a()).booleanValue()) {
                AbsInteractionFragment.this.p.add(Observable.timer((long) ((Integer) LiveSettingKeys.LIVE_SHARE_GET_DIAMONDS_TIME.a()).intValue(), TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new y(this, view), z.f12313b));
            }
        }
    }

    public void a(float f2) {
    }

    public abstract void a(View view, Bundle bundle);

    public abstract boolean b();

    @Nullable
    public View c() {
        return null;
    }

    public void onEvent(s sVar) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r26) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            com.bytedance.ies.sdk.widgets.KVData r8 = (com.bytedance.ies.sdk.widgets.KVData) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 5463(0x1557, float:7.655E-42)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5463(0x1557, float:7.655E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            boolean r0 = r7.f11426c
            if (r0 == 0) goto L_0x07ed
            if (r8 == 0) goto L_0x07ed
            java.lang.String r0 = r8.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x07ed
            java.lang.Object r0 = r8.getData()
            if (r0 != 0) goto L_0x0050
            goto L_0x07ed
        L_0x0050:
            java.lang.String r0 = r8.getKey()
            int r1 = r0.hashCode()
            r11 = 12
            r12 = 8
            r13 = 11
            r14 = 9
            r15 = 6
            r2 = -1
            r16 = 2
            r6 = 5
            r17 = 4
            r5 = 3
            switch(r1) {
                case -1989081898: goto L_0x0110;
                case -1836833765: goto L_0x0106;
                case -1540323875: goto L_0x00fc;
                case -1130046128: goto L_0x00f2;
                case -993227351: goto L_0x00e7;
                case -797556114: goto L_0x00dc;
                case -424351287: goto L_0x00d1;
                case -271145422: goto L_0x00c7;
                case -81738768: goto L_0x00bc;
                case 506917167: goto L_0x00b1;
                case 1008814090: goto L_0x00a5;
                case 1631824572: goto L_0x009a;
                case 1722450802: goto L_0x008f;
                case 1896837901: goto L_0x0084;
                case 1939188655: goto L_0x0079;
                case 2002249609: goto L_0x006d;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x011b
        L_0x006d:
            java.lang.String r1 = "cmd_sticker_is_selected"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 11
            goto L_0x011c
        L_0x0079:
            java.lang.String r1 = "data_screen_record_is_open"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 0
            goto L_0x011c
        L_0x0084:
            java.lang.String r1 = "cmd_live_radio"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 4
            goto L_0x011c
        L_0x008f:
            java.lang.String r1 = "cmd_show_user_profile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 1
            goto L_0x011c
        L_0x009a:
            java.lang.String r1 = "cmd_video_orientation_changed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 7
            goto L_0x011c
        L_0x00a5:
            java.lang.String r1 = "cmd_refresh_user_in_room"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 9
            goto L_0x011c
        L_0x00b1:
            java.lang.String r1 = "data_login_event"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 10
            goto L_0x011c
        L_0x00bc:
            java.lang.String r1 = "cmd_adjust_video_interact_stream_bottom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 13
            goto L_0x011c
        L_0x00c7:
            java.lang.String r1 = "cmd_interact_audio"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 2
            goto L_0x011c
        L_0x00d1:
            java.lang.String r1 = "cmd_show_fans_club_setting"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 12
            goto L_0x011c
        L_0x00dc:
            java.lang.String r1 = "cmd_close_h5_dialog"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 14
            goto L_0x011c
        L_0x00e7:
            java.lang.String r1 = "cmd_duty_gift_changed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 15
            goto L_0x011c
        L_0x00f2:
            java.lang.String r1 = "cmd_interact_player_view_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 3
            goto L_0x011c
        L_0x00fc:
            java.lang.String r1 = "cmd_pk_state_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 5
            goto L_0x011c
        L_0x0106:
            java.lang.String r1 = "cmd_widget_loaded"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 6
            goto L_0x011c
        L_0x0110:
            java.lang.String r1 = "cmd_enter_widget_layout_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            r0 = 8
            goto L_0x011c
        L_0x011b:
            r0 = -1
        L_0x011c:
            r18 = 1125515264(0x43160000, float:150.0)
            r19 = 1090519040(0x41000000, float:8.0)
            switch(r0) {
                case 0: goto L_0x07c0;
                case 1: goto L_0x0718;
                case 2: goto L_0x06e7;
                case 3: goto L_0x063a;
                case 4: goto L_0x05db;
                case 5: goto L_0x03a4;
                case 6: goto L_0x03a0;
                case 7: goto L_0x0373;
                case 8: goto L_0x0369;
                case 9: goto L_0x0357;
                case 10: goto L_0x0349;
                case 11: goto L_0x0297;
                case 12: goto L_0x01ad;
                case 13: goto L_0x013e;
                case 14: goto L_0x0134;
                case 15: goto L_0x0125;
                default: goto L_0x0123;
            }
        L_0x0123:
            goto L_0x07ec
        L_0x0125:
            java.lang.Object r0 = r8.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7.h(r0)
            goto L_0x07ec
        L_0x0134:
            android.support.v4.app.DialogFragment r0 = r7.ag
            if (r0 == 0) goto L_0x07ec
            android.support.v4.app.DialogFragment r0 = r7.ag
            r0.dismissAllowingStateLoss()
            return
        L_0x013e:
            java.lang.Object r0 = r8.getData()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5519(0x158f, float:7.734E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0181
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5519(0x158f, float:7.734E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07ec
        L_0x0181:
            android.view.View r0 = r7.ak
            if (r0 == 0) goto L_0x01ac
            android.view.View r0 = r7.ak
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.topMargin = r8
            int r1 = com.bytedance.android.live.core.utils.ac.c()
            boolean r2 = com.bytedance.android.live.core.utils.a.b.b()
            if (r2 == 0) goto L_0x01a0
            int r2 = com.bytedance.android.live.core.utils.a.b.a()
            if (r2 != 0) goto L_0x01a0
            r1 = 0
        L_0x01a0:
            r0.width = r1
            int r1 = r0.gravity
            r1 = r1 | r9
            r0.gravity = r1
            android.view.View r1 = r7.ak
            r1.setLayoutParams(r0)
        L_0x01ac:
            return
        L_0x01ad:
            java.lang.Object r0 = r8.getData()
            r8 = r0
            com.bytedance.android.livesdk.chatroom.event.h r8 = (com.bytedance.android.livesdk.chatroom.event.h) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5464(0x1558, float:7.657E-42)
            java.lang.Class[] r11 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.h> r1 = com.bytedance.android.livesdk.chatroom.event.h.class
            r11[r10] = r1
            java.lang.Class r12 = java.lang.Void.TYPE
            r1 = r25
            r13 = 3
            r5 = r11
            r11 = 5
            r6 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01e9
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5464(0x1558, float:7.657E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.h> r1 = com.bytedance.android.livesdk.chatroom.event.h.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07ec
        L_0x01e9:
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog r0 = r7.ar
            if (r0 != 0) goto L_0x0281
            com.bytedance.android.live.base.model.user.User r0 = r7.s
            boolean r1 = r25.b()
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r7.x
            java.util.List<com.bytedance.android.live.base.model.b> r3 = r8.f10176b
            com.bytedance.android.live.base.model.user.FansClubData r4 = r8.f10175a
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r5[r10] = r0
            java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
            r5[r9] = r6
            r5[r16] = r2
            r5[r13] = r3
            r5[r17] = r4
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog.f11672a
            r21 = 1
            r22 = 6186(0x182a, float:8.668E-42)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r8 = com.bytedance.android.live.base.model.user.User.class
            r6[r10] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r6[r9] = r8
            java.lang.Class<com.bytedance.ies.sdk.widgets.DataCenter> r8 = com.bytedance.ies.sdk.widgets.DataCenter.class
            r6[r16] = r8
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r6[r13] = r8
            java.lang.Class<com.bytedance.android.live.base.model.user.FansClubData> r8 = com.bytedance.android.live.base.model.user.FansClubData.class
            r6[r17] = r8
            java.lang.Class<com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog> r24 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog.class
            r18 = r5
            r23 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r5 == 0) goto L_0x026e
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r5[r10] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            r5[r9] = r0
            r5[r16] = r2
            r5[r13] = r3
            r5[r17] = r4
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog.f11672a
            r21 = 1
            r22 = 6186(0x182a, float:8.668E-42)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r1 = com.bytedance.android.live.base.model.user.User.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r9] = r1
            java.lang.Class<com.bytedance.ies.sdk.widgets.DataCenter> r1 = com.bytedance.ies.sdk.widgets.DataCenter.class
            r0[r16] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r13] = r1
            java.lang.Class<com.bytedance.android.live.base.model.user.FansClubData> r1 = com.bytedance.android.live.base.model.user.FansClubData.class
            r0[r17] = r1
            java.lang.Class<com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog> r24 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog.class
            r18 = r5
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog r0 = (com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog) r0
            goto L_0x027e
        L_0x026e:
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog r5 = new com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog
            r5.<init>()
            r5.f11675d = r0
            r5.j = r1
            r5.f11677f = r3
            r5.g = r4
            r5.f11676e = r2
            r0 = r5
        L_0x027e:
            r7.ar = r0
            goto L_0x028b
        L_0x0281:
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog r0 = r7.ar
            java.util.List<com.bytedance.android.live.base.model.b> r1 = r8.f10176b
            com.bytedance.android.live.base.model.user.FansClubData r2 = r8.f10175a
            r0.f11677f = r1
            r0.g = r2
        L_0x028b:
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog r0 = r7.ar
            android.support.v4.app.FragmentManager r1 = r25.getChildFragmentManager()
            java.lang.String r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog.f11673b
            r0.show((android.support.v4.app.FragmentManager) r1, (java.lang.String) r2)
            return
        L_0x0297:
            java.lang.Object r0 = r8.getData()
            r8 = r0
            com.bytedance.android.livesdk.sticker.f r8 = (com.bytedance.android.livesdk.sticker.f) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5465(0x1559, float:7.658E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.sticker.f> r1 = com.bytedance.android.livesdk.sticker.f.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02cf
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5465(0x1559, float:7.658E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.sticker.f> r1 = com.bytedance.android.livesdk.sticker.f.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07ec
        L_0x02cf:
            boolean r0 = r7.f11426c
            if (r0 == 0) goto L_0x0348
            com.bytedance.common.utility.collection.WeakHandler r0 = r7.q
            r1 = 100
            r0.removeMessages(r1)
            com.bytedance.android.livesdk.sticker.b.a r0 = r8.f17279a
            if (r0 == 0) goto L_0x07ec
            java.lang.String r0 = ""
            com.bytedance.android.livesdk.sticker.b.a r2 = r8.f17279a
            java.lang.String r2 = r2.a()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x02ee
            goto L_0x07ec
        L_0x02ee:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "sticker_id"
            com.bytedance.android.livesdk.sticker.b.a r3 = r8.f17279a
            long r3 = r3.f17252d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            com.bytedance.android.livesdk.j.a r2 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r3 = "live_take_sticker_select"
            java.util.HashMap r0 = r7.a((java.util.HashMap<java.lang.String, java.lang.String>) r0)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            com.bytedance.android.livesdk.j.c.j r5 = new com.bytedance.android.livesdk.j.c.j
            r5.<init>()
            java.lang.String r6 = "live_take"
            com.bytedance.android.livesdk.j.c.j r5 = r5.b(r6)
            java.lang.String r6 = "click"
            com.bytedance.android.livesdk.j.c.j r5 = r5.f(r6)
            java.lang.String r6 = "live_take_detail"
            com.bytedance.android.livesdk.j.c.j r5 = r5.a(r6)
            r4[r10] = r5
            r2.a(r3, r0, r4)
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            com.bytedance.android.livesdk.sticker.b.a r2 = r8.f17279a
            r0.obj = r2
            r0.what = r1
            com.bytedance.common.utility.collection.WeakHandler r1 = r7.q
            com.bytedance.android.live.core.setting.l<java.lang.Long> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_FACE_STICKER_EFFECTIVELY_USE_TIME
            java.lang.Object r2 = r2.a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.sendMessageDelayed(r0, r2)
        L_0x0348:
            return
        L_0x0349:
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.v r0 = (com.bytedance.android.livesdk.chatroom.event.v) r0
            boolean r0 = r0.f10201a
            if (r0 == 0) goto L_0x07ec
            r25.p()
            return
        L_0x0357:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x07ec
            r25.p()
            return
        L_0x0369:
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.message.model.af r0 = (com.bytedance.android.livesdk.message.model.af) r0
            r7.a((com.bytedance.android.livesdk.message.model.af) r0)
            return
        L_0x0373:
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.ai r0 = (com.bytedance.android.livesdk.chatroom.event.ai) r0
            boolean r1 = r0.f10149a
            int r2 = r0.f10150b
            r7.a((boolean) r1, (int) r2)
            boolean r0 = r0.f10149a
            if (r0 == 0) goto L_0x07ec
            android.support.v4.app.FragmentActivity r0 = r25.getActivity()
            if (r0 == 0) goto L_0x07ec
            android.support.v4.app.FragmentActivity r0 = r25.getActivity()
            int r0 = r0.getRequestedOrientation()
            if (r0 != r9) goto L_0x07ec
            int r0 = com.bytedance.android.live.core.utils.ac.a((float) r19)
            int r1 = com.bytedance.android.live.core.utils.ac.a((float) r18)
            r7.a((boolean) r9, (int) r0, (int) r1, (boolean) r10)
            return
        L_0x03a0:
            r25.d()
            return
        L_0x03a4:
            java.lang.Object r0 = r8.getData()
            r11 = r0
            com.bytedance.android.livesdk.chatroom.event.o r11 = (com.bytedance.android.livesdk.chatroom.event.o) r11
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5520(0x1590, float:7.735E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.o> r1 = com.bytedance.android.livesdk.chatroom.event.o.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03dc
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5520(0x1590, float:7.735E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.o> r1 = com.bytedance.android.livesdk.chatroom.event.o.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0453
        L_0x03dc:
            android.view.View r0 = r25.getView()
            if (r0 == 0) goto L_0x0453
            boolean r0 = r7.f11426c
            if (r0 == 0) goto L_0x0453
            android.content.Context r0 = r25.getContext()
            if (r0 != 0) goto L_0x03ed
            goto L_0x0453
        L_0x03ed:
            android.view.View r0 = r25.getView()
            r1 = 2131168424(0x7f070ca8, float:1.795115E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            int r2 = r11.f10187a
            if (r2 != 0) goto L_0x042d
            java.lang.Object r2 = r11.f10188b
            boolean r2 = r2 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x043e
            java.lang.Object r2 = r11.f10188b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.content.Context r3 = r25.getContext()
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r4)
            int r3 = (int) r3
            int r2 = r2 + r3
            android.content.Context r3 = r25.getContext()
            int r3 = com.bytedance.common.utility.UIUtils.getScreenHeight(r3)
            int r3 = r3 - r2
            int r2 = r1.bottomMargin
            int r3 = r3 - r2
            r1.height = r3
            goto L_0x043e
        L_0x042d:
            int r2 = r11.f10187a
            if (r2 != r9) goto L_0x043e
            android.content.Context r2 = r25.getContext()
            r3 = 1126760448(0x43290000, float:169.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            int r2 = (int) r2
            r1.height = r2
        L_0x043e:
            r7.a((android.widget.RelativeLayout.LayoutParams) r1)
            r0.setLayoutParams(r1)
            int r0 = r1.height
            int r2 = r1.bottomMargin
            r7.c(r0, r2)
            int r0 = r1.height
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            r7.b((int) r0)
        L_0x0453:
            java.lang.Object r0 = r8.getData()
            r11 = r0
            com.bytedance.android.livesdk.chatroom.event.o r11 = (com.bytedance.android.livesdk.chatroom.event.o) r11
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5518(0x158e, float:7.732E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.o> r1 = com.bytedance.android.livesdk.chatroom.event.o.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x048b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5518(0x158e, float:7.732E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.o> r1 = com.bytedance.android.livesdk.chatroom.event.o.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0510
        L_0x048b:
            boolean r0 = r7.f11426c
            if (r0 == 0) goto L_0x0510
            int r0 = r11.f10187a
            if (r0 != 0) goto L_0x04d0
            r25.g()
            boolean r0 = r7.f11427d
            if (r0 != 0) goto L_0x0510
            boolean r0 = com.bytedance.android.live.uikit.a.a.a()
            if (r0 == 0) goto L_0x04ac
            android.view.View r0 = r7.ak
            java.lang.String r1 = "#161823"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            goto L_0x04ca
        L_0x04ac:
            boolean r0 = com.bytedance.android.live.uikit.a.a.f()
            if (r0 == 0) goto L_0x04bf
            android.view.View r0 = r7.ak
            if (r0 == 0) goto L_0x04ca
            android.view.View r0 = r7.ak
            r1 = 2130840894(0x7f020d3e, float:1.728684E38)
            r0.setBackgroundResource(r1)
            goto L_0x04ca
        L_0x04bf:
            android.view.View r0 = r7.ak
            java.lang.String r1 = "#303342"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
        L_0x04ca:
            android.view.View r0 = r7.ak
            com.bytedance.common.utility.UIUtils.setViewVisibility(r0, r10)
            goto L_0x0510
        L_0x04d0:
            int r0 = r11.f10187a
            if (r0 != r9) goto L_0x0510
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5531(0x159b, float:7.75E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04f8
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5531(0x159b, float:7.75E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0507
        L_0x04f8:
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r0 = r7.S
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.NORMAL
            if (r0 == r1) goto L_0x0507
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r0 = r7.T
            r7.S = r0
            android.view.View r0 = r7.ac
            r0.setVisibility(r10)
        L_0x0507:
            boolean r0 = r7.f11427d
            if (r0 != 0) goto L_0x0510
            android.view.View r0 = r7.ak
            com.bytedance.common.utility.UIUtils.setViewVisibility(r0, r12)
        L_0x0510:
            java.lang.Object r0 = r8.getData()
            r8 = r0
            com.bytedance.android.livesdk.chatroom.event.o r8 = (com.bytedance.android.livesdk.chatroom.event.o) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5470(0x155e, float:7.665E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.o> r1 = com.bytedance.android.livesdk.chatroom.event.o.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0548
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5470(0x155e, float:7.665E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.o> r1 = com.bytedance.android.livesdk.chatroom.event.o.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07ec
        L_0x0548:
            boolean r0 = r8.f10189c
            if (r0 == 0) goto L_0x05c2
            int r0 = r8.f10187a
            if (r0 != 0) goto L_0x05b9
            android.widget.RelativeLayout$LayoutParams r0 = r7.ae
            if (r0 != 0) goto L_0x05da
            android.view.View r0 = r7.ad
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r7.ae = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            android.widget.RelativeLayout$LayoutParams r1 = r7.ae
            int r1 = r1.width
            android.widget.RelativeLayout$LayoutParams r2 = r7.ae
            int r2 = r2.height
            r0.<init>(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x059e
            android.content.Context r1 = r25.getContext()
            boolean r1 = com.bytedance.android.live.uikit.d.c.a(r1)
            if (r1 == 0) goto L_0x059e
            r0.addRule(r14)
            r0.addRule(r15)
            boolean r1 = r7.f11427d
            if (r1 == 0) goto L_0x058e
            r1 = 1117782016(0x42a00000, float:80.0)
            int r1 = com.bytedance.android.live.core.utils.ac.a((float) r1)
            r0.topMargin = r1
            goto L_0x0596
        L_0x058e:
            r1 = 1109393408(0x42200000, float:40.0)
            int r1 = com.bytedance.android.live.core.utils.ac.a((float) r1)
            r0.topMargin = r1
        L_0x0596:
            int r1 = com.bytedance.android.live.core.utils.ac.a((float) r19)
            r0.setMarginEnd(r1)
            goto L_0x05b2
        L_0x059e:
            r0.addRule(r13)
            r0.addRule(r15)
            r1 = 1117782016(0x42a00000, float:80.0)
            int r1 = com.bytedance.android.live.core.utils.ac.a((float) r1)
            r0.topMargin = r1
            int r1 = com.bytedance.android.live.core.utils.ac.a((float) r19)
            r0.rightMargin = r1
        L_0x05b2:
            android.view.View r1 = r7.ad
            r1.setLayoutParams(r0)
            goto L_0x07ec
        L_0x05b9:
            int r0 = r8.f10187a
            if (r0 != r9) goto L_0x05da
            r7.a((boolean) r10, (int) r10, (int) r10, (boolean) r9)
            goto L_0x07ec
        L_0x05c2:
            int r0 = r8.f10187a
            if (r0 != 0) goto L_0x05d3
            int r0 = com.bytedance.android.live.core.utils.ac.a((float) r19)
            int r1 = com.bytedance.android.live.core.utils.ac.a((float) r18)
            r7.a((boolean) r9, (int) r0, (int) r1, (boolean) r9)
            goto L_0x07ec
        L_0x05d3:
            int r0 = r8.f10187a
            if (r0 != r9) goto L_0x05da
            r7.a((boolean) r10, (int) r10, (int) r10, (boolean) r9)
        L_0x05da:
            return
        L_0x05db:
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.r r0 = (com.bytedance.android.livesdk.chatroom.event.r) r0
            boolean r1 = r0.f10194a
            r7.a((boolean) r1, (boolean) r10)
            boolean r0 = r0.f10194a
            if (r0 == 0) goto L_0x07ec
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5471(0x155f, float:7.667E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x060f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5471(0x155f, float:7.667E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07ec
        L_0x060f:
            android.view.View r0 = r7.ad
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            int r2 = r0.width
            int r0 = r0.height
            r1.<init>(r2, r0)
            r1.addRule(r11)
            r1.addRule(r13)
            r0 = 1124859904(0x430c0000, float:140.0)
            int r0 = com.bytedance.android.live.core.utils.ac.a((float) r0)
            r1.bottomMargin = r0
            int r0 = com.bytedance.android.live.core.utils.ac.a((float) r19)
            r1.rightMargin = r0
            android.view.View r0 = r7.ad
            r0.setLayoutParams(r1)
            return
        L_0x063a:
            r13 = 3
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.chatroom.interact.w r0 = (com.bytedance.android.livesdk.chatroom.interact.w) r0
            boolean r1 = r0.f11013a
            r1 = r1 ^ r9
            r7.bf = r1
            boolean r1 = r0.f11013a
            if (r1 == 0) goto L_0x064d
            int r1 = r7.bh
            goto L_0x064f
        L_0x064d:
            int r1 = r7.bg
        L_0x064f:
            r7.b(r2, r1)
            boolean r1 = r0.f11013a
            r1 = r1 ^ r9
            r7.d((boolean) r1)
            boolean r0 = r0.f11013a
            r8 = r0 ^ 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5524(0x1594, float:7.741E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0695
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5524(0x1594, float:7.741E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07ec
        L_0x0695:
            if (r8 != 0) goto L_0x06df
            android.widget.FrameLayout r0 = r7.m
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L_0x06df
            android.widget.FrameLayout r0 = r7.m
            android.view.View r0 = r0.getChildAt(r10)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x06df
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -2
            r2 = -2
            r0.<init>(r1, r2)
            r1 = 2131165690(0x7f0701fa, float:1.7945604E38)
            r0.addRule(r13, r1)
            r1 = 2131427923(0x7f0b0253, float:1.8477476E38)
            int r1 = com.bytedance.android.live.core.utils.ac.d(r1)
            r0.topMargin = r1
            r0.addRule(r14)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x06cf
            r1 = 20
            r0.addRule(r1)
        L_0x06cf:
            r1 = 2131427963(0x7f0b027b, float:1.8477557E38)
            int r1 = com.bytedance.android.live.core.utils.ac.d(r1)
            r0.leftMargin = r1
            android.widget.FrameLayout r1 = r7.aa
            r1.setLayoutParams(r0)
            goto L_0x07ec
        L_0x06df:
            android.widget.FrameLayout r0 = r7.aa
            android.widget.RelativeLayout$LayoutParams r1 = r7.ab
            r0.setLayoutParams(r1)
            return
        L_0x06e7:
            java.lang.Object r0 = r8.getData()
            com.bytedance.android.livesdk.chatroom.event.r r0 = (com.bytedance.android.livesdk.chatroom.event.r) r0
            boolean r1 = r0.f10194a
            r7.a((boolean) r1, (boolean) r9)
            boolean r1 = r0.f10194a
            if (r1 == 0) goto L_0x06f9
            int r1 = r7.bj
            goto L_0x06fb
        L_0x06f9:
            int r1 = r7.bi
        L_0x06fb:
            r7.b(r1, r2)
            boolean r0 = r0.f10194a
            if (r0 == 0) goto L_0x0714
            r0 = 2131427941(0x7f0b0265, float:1.8477512E38)
            int r0 = com.bytedance.android.live.core.utils.ac.d(r0)
            r1 = 2131427940(0x7f0b0264, float:1.847751E38)
            int r1 = com.bytedance.android.live.core.utils.ac.d(r1)
            r7.a((boolean) r9, (int) r0, (int) r1, (boolean) r10)
            return
        L_0x0714:
            r7.a((boolean) r10, (int) r10, (int) r10, (boolean) r9)
            return
        L_0x0718:
            java.lang.Object r0 = r8.getData()
            r8 = r0
            com.bytedance.android.livesdk.chatroom.event.UserProfileEvent r8 = (com.bytedance.android.livesdk.chatroom.event.UserProfileEvent) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5507(0x1583, float:7.717E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.UserProfileEvent> r1 = com.bytedance.android.livesdk.chatroom.event.UserProfileEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0750
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5507(0x1583, float:7.717E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.UserProfileEvent> r1 = com.bytedance.android.livesdk.chatroom.event.UserProfileEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07ec
        L_0x0750:
            boolean r0 = r7.f11426c
            if (r0 == 0) goto L_0x07ec
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = r7.aq
            if (r0 == 0) goto L_0x0762
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = r7.aq
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0762
            goto L_0x07ec
        L_0x0762:
            com.bytedance.android.live.base.model.user.User r0 = r8.user
            if (r0 == 0) goto L_0x0781
            android.support.v4.app.FragmentActivity r9 = r25.getActivity()
            boolean r10 = r25.b()
            com.bytedance.android.live.base.model.user.User r0 = r8.user
            long r11 = r0.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r13 = r7.f11425b
            com.bytedance.android.live.base.model.user.User r14 = r7.s
            java.lang.String r15 = r8.mSource
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.a(r9, r10, r11, r13, r14, r15)
            r7.aq = r0
            goto L_0x0798
        L_0x0781:
            android.support.v4.app.FragmentActivity r0 = r25.getActivity()
            boolean r9 = r25.b()
            long r10 = r8.userId
            com.bytedance.android.livesdkapi.depend.model.live.Room r12 = r7.f11425b
            com.bytedance.android.live.base.model.user.User r13 = r7.s
            java.lang.String r14 = r8.mSource
            r8 = r0
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.a(r8, r9, r10, r12, r13, r14)
            r7.aq = r0
        L_0x0798:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.x
            java.lang.String r1 = "Log_interact_lable"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r1 = r7.aq
            r1.a((java.lang.String) r0)
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = r7.aq
            java.lang.String r1 = r7.U
            r0.b((java.lang.String) r1)
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = r7.aq
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r7.x
            r0.A = r1
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = r7.aq
            android.support.v4.app.FragmentManager r1 = r25.getFragmentManager()
            java.lang.String r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.f11658b
            r0.show((android.support.v4.app.FragmentManager) r1, (java.lang.String) r2)
            return
        L_0x07c0:
            java.lang.Object r0 = r8.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r1 = r7.f11426c
            if (r1 == 0) goto L_0x07ec
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r7.x
            java.lang.String r2 = "data_keyboard_status"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r0 != 0) goto L_0x07e1
            if (r1 != 0) goto L_0x07e1
            goto L_0x07e2
        L_0x07e1:
            r9 = 0
        L_0x07e2:
            android.view.View r0 = r7.k
            if (r9 == 0) goto L_0x07e7
            goto L_0x07e8
        L_0x07e7:
            r10 = 4
        L_0x07e8:
            r0.setVisibility(r10)
            return
        L_0x07ec:
            return
        L_0x07ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.onChanged(java.lang.Object):void");
    }

    public final void a(DataCenter dataCenter, boolean z2, b bVar, @Nullable EnterRoomExtra enterRoomExtra) {
        DataCenter dataCenter2 = dataCenter;
        b bVar2 = bVar;
        EnterRoomExtra enterRoomExtra2 = enterRoomExtra;
        if (PatchProxy.isSupport(new Object[]{dataCenter2, Byte.valueOf(z2 ? (byte) 1 : 0), bVar2, enterRoomExtra2}, this, f11424a, false, 5444, new Class[]{DataCenter.class, Boolean.TYPE, b.class, EnterRoomExtra.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter2, Byte.valueOf(z2), bVar2, enterRoomExtra2}, this, f11424a, false, 5444, new Class[]{DataCenter.class, Boolean.TYPE, b.class, EnterRoomExtra.class}, Void.TYPE);
            return;
        }
        this.x = dataCenter2;
        this.f11425b = (Room) dataCenter2.get("data_room");
        this.V = enterRoomExtra2;
        m();
        if (this.U == null) {
            this.U = "";
        }
        this.f11427d = z2;
        this.bp = bVar2;
    }

    public void a(boolean z2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f11424a, false, 5445, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2)}, this, f11424a, false, 5445, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h = z2;
        this.i = i2;
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5446, new Class[0], Void.TYPE);
            return;
        }
        if (this.aT != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.aT.getLayoutParams();
            if (this.i > 0) {
                marginLayoutParams.topMargin = this.i - ac.a(36.0f);
            } else {
                marginLayoutParams.topMargin = ac.b() / 2;
            }
            this.aT.setLayoutParams(marginLayoutParams);
        }
    }

    @SuppressLint({"CheckResult"})
    private <T> void a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f11424a, false, 5449, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2}, this, f11424a, false, 5449, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        ((com.bytedance.android.live.core.rxutils.autodispose.ab) com.bytedance.android.livesdk.u.a.a().a(cls2).observeOn(AndroidSchedulers.mainThread()).as(com.bytedance.android.live.core.rxutils.autodispose.e.a((Fragment) this))).a((Consumer<? super T>) new b<Object>(this));
    }

    public void onActivityCreated(Bundle bundle) {
        ViewModuleManager viewModuleManager;
        String str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f11424a, false, 5451, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f11424a, false, 5451, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f11424a, false, 5452, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f11424a, false, 5452, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            View view = getView();
            if (view != null) {
                if (com.bytedance.android.livesdk.utils.ab.a() != null) {
                    com.bytedance.android.livesdk.utils.ab.a().startMessage();
                }
                this.K = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 3;
                this.x.observe("cmd_show_user_profile", this).observeForever("data_user_in_room", this).observeForever("data_screen_record_is_open", this).observeForever("data_is_followed", this).observe("cmd_interact_audio", this).observe("cmd_live_radio", this).observeForever("cmd_widget_loaded", this).observe("cmd_video_orientation_changed", this, true).observeForever("cmd_pk_state_change", this).observe("cmd_normal_gift_widget_layout_change", this, true).observe("cmd_enter_widget_layout_change", this, true).observeForever("cmd_refresh_user_in_room", this).observe("cmd_sticker_is_selected", this).observeForever("data_login_event", this).observe("cmd_interact_player_view_change", this).observe("cmd_show_fans_club_setting", this).observe("cmd_adjust_video_interact_stream_bottom", this).observeForever("cmd_duty_gift_changed", this).observe("cmd_close_h5_dialog", this);
                int i2 = 2;
                if (PatchProxy.isSupport(new Object[]{view, bundle2}, this, f11424a, false, 5454, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, bundle2}, this, f11424a, false, 5454, new Class[]{View.class, Bundle.class}, Void.TYPE);
                } else {
                    String str2 = "";
                    com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.b.k.class);
                    if (a2 != null) {
                        Map a3 = a2.a();
                        if (a3 != null && a3.containsKey("source")) {
                            str2 = (String) a3.get("source");
                        }
                    }
                    if (PatchProxy.isSupport(new Object[]{this, view, bundle2}, null, ViewModuleManager.f13632a, true, 8081, new Class[]{Fragment.class, View.class, Bundle.class}, ViewModuleManager.class)) {
                        viewModuleManager = (ViewModuleManager) PatchProxy.accessDispatch(new Object[]{this, view, bundle2}, null, ViewModuleManager.f13632a, true, 8081, new Class[]{Fragment.class, View.class, Bundle.class}, ViewModuleManager.class);
                    } else {
                        FragmentManager childFragmentManager = getChildFragmentManager();
                        Context context = getContext();
                        if (PatchProxy.isSupport(new Object[]{childFragmentManager, context, view, bundle2}, null, ViewModuleManager.f13632a, true, 8082, new Class[]{FragmentManager.class, Context.class, View.class, Bundle.class}, ViewModuleManager.class)) {
                            viewModuleManager = (ViewModuleManager) PatchProxy.accessDispatch(new Object[]{childFragmentManager, context, view, bundle2}, null, ViewModuleManager.f13632a, true, 8082, new Class[]{FragmentManager.class, Context.class, View.class, Bundle.class}, ViewModuleManager.class);
                        } else {
                            ViewModuleManager viewModuleManager2 = new ViewModuleManager();
                            viewModuleManager2.f13634c = context;
                            viewModuleManager2.f13635d = view;
                            viewModuleManager2.f13636e = bundle2;
                            childFragmentManager.beginTransaction().add((Fragment) viewModuleManager2, ViewModuleManager.f13633b).commitNowAllowingStateLoss();
                            viewModuleManager = viewModuleManager2;
                        }
                    }
                    this.y = viewModuleManager;
                    this.A = RecyclableWidgetManager.of((Fragment) this, view);
                    this.A.setWidgetProvider(an.a());
                    this.A.setDataCenter(this.x);
                    this.ap = new com.bytedance.android.livesdk.banner.a(this);
                    com.bytedance.android.livesdk.banner.a aVar = this.ap;
                    long id = this.f11425b.getId();
                    boolean z2 = this.f11427d;
                    if (PatchProxy.isSupport(new Object[]{new Long(id), Byte.valueOf(z2 ? (byte) 1 : 0)}, aVar, com.bytedance.android.livesdk.banner.a.f9098a, false, 3186, new Class[]{Long.TYPE, Boolean.TYPE}, Observable.class)) {
                        Observable observable = (Observable) PatchProxy.accessDispatch(new Object[]{new Long(id), Byte.valueOf(z2)}, aVar, com.bytedance.android.livesdk.banner.a.f9098a, false, 3186, new Class[]{Long.TYPE, Boolean.TYPE}, Observable.class);
                    } else if (id == aVar.f9100b) {
                        aVar.a(Long.valueOf(id));
                    } else {
                        aVar.f9100b = id;
                        BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) j.q().d().a(BannerRetrofitApi.class);
                        if (!z2) {
                            i2 = 1;
                        }
                        ((com.bytedance.android.live.core.rxutils.autodispose.ab) bannerRetrofitApi.queryLiveRoomBanner(id, i2).compose(com.bytedance.android.live.core.rxutils.i.a()).as(com.bytedance.android.live.core.rxutils.autodispose.e.a(aVar.f9102d))).a(new a.c(aVar, id), a.d.f9110b);
                        aVar.a(Long.valueOf(id));
                    }
                    this.x.lambda$put$1$DataCenter("data_room", this.f11425b).lambda$put$1$DataCenter("data_room_id", Long.valueOf(this.f11425b.getId())).lambda$put$1$DataCenter("data_is_anchor", Boolean.valueOf(this.f11427d)).lambda$put$1$DataCenter("data_is_portrait", Boolean.valueOf(b())).lambda$put$1$DataCenter("data_live_mode", this.t).lambda$put$1$DataCenter("data_user_center", this.G).lambda$put$1$DataCenter("data_in_room_banner_manager", this.ap).lambda$put$1$DataCenter("data_enter_source", str2);
                    if (!s()) {
                        this.C = new DecorationWrapperWidget();
                        this.C.g = this;
                    }
                    this.aK = new RechargeWidget();
                    if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                        this.aN = new FirstRechargeWidget();
                    }
                    int intValue = ((Integer) this.x.get("data_xt_broadcast_type", -1)).intValue();
                    this.aO = new CommonToastWidget();
                    if ((this.f11425b.isThirdParty || this.f11425b.isScreenshot) && ((Boolean) LiveSettingKeys.LIVE_SHOW_GAME_QUIZ.a()).booleanValue()) {
                        this.aw = new GameQuizWidget();
                    }
                    String c2 = TTLiveSDKContext.getHostService().a().c();
                    this.aR = new EndWidget();
                    this.ay = (LiveToolbarWidget) this.A.load((int) C0906R.id.d4g, LiveToolbarWidget.class, false);
                    this.au = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getVideoGiftWidget();
                    this.A.load(C0906R.id.drr, this.au, false);
                    this.az = (DutyGiftToolbarWidget) this.A.load((int) C0906R.id.d4i, DutyGiftToolbarWidget.class, false);
                    this.B = (TextMessageWidget) this.A.load((int) C0906R.id.bmr, TextMessageWidget.class);
                    if (!com.bytedance.android.live.uikit.a.a.f() || intValue != 3) {
                        this.aH = (BottomRightBannerWidget) this.A.load((int) C0906R.id.mp, BottomRightBannerWidget.class);
                        this.A.load((int) C0906R.id.d5r, TopRightBannerWidget.class);
                    }
                    this.ax = (LiveRoomNotifyWidget) this.A.load((int) C0906R.id.aky, LiveRoomNotifyWidget.class);
                    this.aF = (RoomPushWidget) this.A.load((int) C0906R.id.cht, RoomPushWidget.class);
                    if (com.bytedance.android.live.uikit.a.a.d()) {
                        this.aG = (TopRankWidget) this.A.load((int) C0906R.id.d5o, TopRankWidget.class);
                    }
                    this.aJ = (StickerTipWidget) this.A.load((int) C0906R.id.aja, StickerTipWidget.class);
                    this.F = new BarrageWidget();
                    this.A.load(C0906R.id.jp, this.F);
                    if (!com.bytedance.android.live.uikit.a.a.b()) {
                        this.av = (EnterAnimWidget) this.A.load((int) C0906R.id.a_e, EnterAnimWidget.class, true, new Object[]{Integer.valueOf(this.aU)});
                    }
                    if (com.bytedance.android.livesdkapi.a.a.f18614b && !com.bytedance.android.live.uikit.a.a.j()) {
                        z zVar = (z) j.q().k().a(z.class);
                        this.A.load((int) C0906R.id.ccm, zVar == null ? null : zVar.a());
                    } else if (!com.bytedance.android.live.uikit.a.a.f() && !com.bytedance.android.live.uikit.a.a.j()) {
                        this.A.load((int) C0906R.id.ccm, LuckyBoxWidget.class);
                    }
                    if (this.f11425b.getRoomAuthStatus() == null || this.f11425b.getRoomAuthStatus().isEnableChat()) {
                        this.D = (CommentWidget) this.A.load((int) C0906R.id.vc, CommentWidget.class);
                    }
                    if (com.bytedance.android.live.uikit.a.a.a()) {
                        this.aA = (VolumeWidget) this.A.load((int) C0906R.id.dvd, VolumeWidget.class);
                        if (((Integer) LiveSettingKeys.LIVE_FANS_CLUB_ENTRY_PLAN.a()).intValue() == 1) {
                            this.A.load((int) C0906R.id.ac1, LiveFansClubEntryWidget.class);
                        } else if (view != null) {
                            UIUtils.updateLayoutMargin(view.findViewById(C0906R.id.a28), (int) UIUtils.dip2Px(view.getContext(), 0.0f), -3, -3, -3);
                        }
                    } else if (com.bytedance.android.live.uikit.a.a.f()) {
                        com.bytedance.android.livesdk.n.c cVar = (com.bytedance.android.livesdk.n.c) j.q().k().a(com.bytedance.android.livesdk.n.c.class);
                        if (!(cVar == null || intValue == 3)) {
                            this.A.load((int) C0906R.id.dy9, cVar.f());
                            this.A.load((int) C0906R.id.aby, FansClubAnimationWidget.class, false);
                            this.A.load((int) C0906R.id.ac1, LiveFansClubEntryWidget.class, false);
                        }
                    }
                    this.E = (LiveRoomUserInfoWidget) this.A.load((int) C0906R.id.dpr, LiveRoomUserInfoWidget.class);
                    if (!(com.bytedance.android.live.uikit.a.a.j() || com.bytedance.android.live.uikit.a.a.b() || (com.bytedance.android.live.uikit.a.a.f() && intValue == 3)) || (com.bytedance.android.livesdkapi.a.a.f18614b && !com.bytedance.android.live.uikit.a.a.j())) {
                        this.aB = (DailyRankWidget) this.A.load((int) C0906R.id.a28, DailyRankWidget.class);
                    }
                    if (!com.bytedance.android.livesdkapi.a.a.f18614b && !com.bytedance.android.livesdkapi.a.a.f18617e && !com.bytedance.android.live.uikit.a.a.f()) {
                        this.aC = (PromotionStatusWidget) this.A.load((int) C0906R.id.c87, PromotionStatusWidget.class);
                        this.A.load((int) C0906R.id.buc, OfficialPromotionStatusWidget.class);
                    }
                    if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO && !com.bytedance.android.livesdkapi.a.a.f18614b && com.bytedance.android.live.uikit.a.a.d()) {
                        this.aI = (PkPromotionWidget) this.A.load((int) C0906R.id.byd, PkPromotionWidget.class);
                    }
                    if ((com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) && b() && ((Boolean) LiveSettingKeys.ENABLE_LOAD_POKEMON.a()).booleanValue() && view != null && view.findViewById(C0906R.id.c48) != null) {
                        view.findViewById(C0906R.id.c48).setVisibility(0);
                        this.aS = (PokemonWidget) this.A.load((int) C0906R.id.c48, PokemonWidget.class);
                    }
                    if (this.f11427d || com.bytedance.android.livesdkapi.a.a.f18614b) {
                        if (com.bytedance.android.livesdkapi.a.a.f18614b && !com.bytedance.android.livesdkapi.a.a.f18618f) {
                            this.aM = (BroadcastInfoWidget) this.A.load((int) C0906R.id.bd4, BroadcastInfoWidget.class, false);
                        }
                    } else if (this.f11425b.getRoomAuthStatus() == null || this.f11425b.getRoomAuthStatus().isEnableChat()) {
                        this.aE = (CommentPromotionWidget) this.A.load((int) C0906R.id.vi, CommentPromotionWidget.class);
                    }
                    if (s() && !com.bytedance.android.live.uikit.a.a.a()) {
                        this.aD = (RadioWidget) this.A.load((int) C0906R.id.c__, RadioWidget.class);
                    }
                    if (c2 == null) {
                        str = null;
                    } else {
                        str = c2.toLowerCase();
                    }
                    if (TextUtils.equals(str, "local_test") && !StringUtils.isEmpty(this.f11425b.getPrivateInfo())) {
                        this.A.load((int) C0906R.id.c6i, PrivateDebugInfoWidget.class);
                    }
                    if (((Boolean) LiveConfigSettingKeys.WEB_VIEW_PRELOAD_ENABLED.a()).booleanValue()) {
                        this.A.load((int) C0906R.id.c56, PreloadWebViewWidget.class);
                    }
                    if (com.bytedance.android.live.uikit.a.a.f()) {
                        this.A.load((int) C0906R.id.j7, BackToPreRoomWidget.class);
                    }
                    this.aQ = (UserPermissionCheckWidget) this.A.load(UserPermissionCheckWidget.class);
                    this.aL = new LiveShareWidget();
                    this.A.load(this.aK).load(this.aN).load(C0906R.id.bdm, this.C).load(this.aO).load(this.aL);
                    if (com.bytedance.android.live.uikit.a.a.d()) {
                        this.A.load(this.aw);
                    }
                    a(view, bundle2);
                    this.A.load(C0906R.id.a_9, this.aR);
                    this.N = this.aD;
                    h(false);
                }
                if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5455, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5455, new Class[0], Void.TYPE);
                } else if (s() && !this.f11425b.isWithLinkMic()) {
                    af afVar = new af();
                    afVar.f16444a = (int) (getContext().getResources().getDimension(C0906R.dimen.qa) + getContext().getResources().getDimension(C0906R.dimen.pr));
                    this.x.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(afVar.f16444a));
                    af afVar2 = new af();
                    afVar2.f16444a = (int) (getContext().getResources().getDimension(C0906R.dimen.qa) + getContext().getResources().getDimension(C0906R.dimen.pr));
                    a(afVar2);
                    a((int) getContext().getResources().getDimension(C0906R.dimen.ps), (int) getContext().getResources().getDimension(C0906R.dimen.pr));
                } else if (s() && this.f11425b.isWithLinkMic()) {
                    af afVar3 = new af();
                    afVar3.f16444a = (int) (getContext().getResources().getDimension(C0906R.dimen.qa) + getContext().getResources().getDimension(C0906R.dimen.pq));
                    this.x.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(afVar3.f16444a));
                    af afVar4 = new af();
                    afVar4.f16444a = (int) (getContext().getResources().getDimension(C0906R.dimen.qa) + getContext().getResources().getDimension(C0906R.dimen.pq));
                    a(afVar4);
                    a(-1, (int) getContext().getResources().getDimension(C0906R.dimen.pq));
                }
                if (getDialog() != null) {
                    Window window = getDialog().getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                        window.setSoftInputMode(50);
                    }
                    getDialog().setOnKeyListener(this.ba);
                }
                if (com.bytedance.android.livesdk.chatroom.b.a.a()) {
                    ((ViewStub) view.findViewById(C0906R.id.a2t)).inflate();
                }
                if (this.bm != null) {
                    view.post(this.bm);
                    this.bm = null;
                }
                e();
                if (!com.bytedance.android.live.uikit.a.a.a() || b()) {
                    com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.c().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.SHARE, (d.a) new g(this, (byte) 0));
                }
                if (com.bytedance.android.live.uikit.a.a.f()) {
                    if (this.f11427d) {
                        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.c().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.BROADCAST_SHARE, (d.a) new g(this, (byte) 0));
                        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.c().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.LOTTERY, (d.a) new f(this, (byte) 0));
                    } else {
                        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.c().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.EMOTION, (d.a) new e(this, (byte) 0));
                    }
                }
                if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5547, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5547, new Class[0], Void.TYPE);
                } else {
                    this.I.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f11474a;

                        /* renamed from: c  reason: collision with root package name */
                        private static final /* synthetic */ a.C0900a f11475c;

                        static {
                            if (PatchProxy.isSupport(new Object[0], null, f11474a, true, 5587, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, f11474a, true, 5587, new Class[0], Void.TYPE);
                                return;
                            }
                            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("AbsInteractionFragment.java", AnonymousClass9.class);
                            f11475c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$17", "android.view.View", NotifyType.VIBRATE, "", "void"), 3538);
                        }

                        public void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f11474a, false, 5586, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f11474a, false, 5586, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f11475c, this, this, view));
                            AbsInteractionFragment.this.I.setVisibility(8);
                            AbsInteractionFragment.this.d(true);
                            AbsInteractionFragment.this.x.lambda$put$1$DataCenter("cmd_show_illegal_dialog", new Object());
                        }
                    });
                    this.aY.setImageAssetsFolder("images/");
                    this.aY.setAnimation("illegal_live_shadow_loading.json");
                    this.aY.loop(true);
                }
            }
        }
        if (this.f11427d && !this.t.isStreamingBackground) {
            this.W.setVisibility(0);
            this.W.setCountDownListener(new m(this));
            CountDownView countDownView = this.W;
            if (PatchProxy.isSupport(new Object[0], countDownView, CountDownView.f13358a, false, 7806, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], countDownView, CountDownView.f13358a, false, 7806, new Class[0], Void.TYPE);
            } else {
                CountDownView.AnonymousClass1 r11 = new CountDownTimer((long) countDownView.f13362e, 1000) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f13363a;

                    public final void onFinish() {
                        if (PatchProxy.isSupport(new Object[0], this, f13363a, false, 7808, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f13363a, false, 7808, new Class[0], Void.TYPE);
                            return;
                        }
                        CountDownView.this.post(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f13367a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f13367a, false, 7810, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f13367a, false, 7810, new Class[0], Void.TYPE);
                                    return;
                                }
                                ViewGroup viewGroup = (ViewGroup) CountDownView.this.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(CountDownView.this);
                                }
                            }
                        });
                        if (CountDownView.this.f13361d != null) {
                            CountDownView.this.f13361d.a();
                        }
                    }

                    public final void onTick(long j) {
                        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f13363a, false, 7807, new Class[]{Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f13363a, false, 7807, new Class[]{Long.TYPE}, Void.TYPE);
                            return;
                        }
                        long j2 = j / 1000;
                        CountDownView.this.f13360c.setText(String.valueOf(j2));
                        if (j2 < 2) {
                            CountDownView.this.f13359b.setAnimationListener(new Animation.AnimationListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f13365a;

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    if (PatchProxy.isSupport(new Object[]{animation}, this, f13365a, false, 7809, new Class[]{Animation.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animation}, this, f13365a, false, 7809, new Class[]{Animation.class}, Void.TYPE);
                                        return;
                                    }
                                    CountDownView.this.setVisibility(8);
                                }
                            });
                        }
                        CountDownView.this.f13359b.reset();
                        CountDownView.this.f13360c.startAnimation(CountDownView.this.f13359b);
                    }
                };
                r11.start();
            }
        }
        f(false);
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11424a, false, 5453, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11424a, false, 5453, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.ai = (GestureDetectLayout) view;
        this.j = view.findViewById(C0906R.id.avb);
        this.ak = view.findViewById(C0906R.id.k6);
        this.X = (Chronometer) view.findViewById(C0906R.id.bd7);
        this.W = (CountDownView) view.findViewById(C0906R.id.a0f);
        this.k = view.findViewById(C0906R.id.ti);
        if (com.bytedance.android.live.uikit.a.a.d()) {
            this.k.setContentDescription(ac.a((int) C0906R.string.czr));
        }
        this.Y = (TextView) view.findViewById(C0906R.id.ben);
        this.k.setOnClickListener(this.bl);
        this.n = view.findViewById(C0906R.id.avd);
        this.aj = (FrameLayout) view.findViewById(C0906R.id.bwf);
        this.aa = (FrameLayout) view.findViewById(C0906R.id.buc);
        this.ab = (RelativeLayout.LayoutParams) this.aa.getLayoutParams();
        this.m = (FrameLayout) view.findViewById(C0906R.id.mp);
        this.af = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
        this.ac = view.findViewById(C0906R.id.d5r);
        this.ad = view.findViewById(C0906R.id.ccm);
        this.aT = view.findViewById(C0906R.id.bf3);
        this.H = (FrameLayout) view.findViewById(C0906R.id.cvf);
        this.aY = (LottieAnimationView) view.findViewById(C0906R.id.ar1);
        this.I = (LinearLayout) view.findViewById(C0906R.id.cs7);
        this.aW = (TextView) view.findViewById(C0906R.id.cs8);
        this.aX = (TextView) view.findViewById(C0906R.id.cs6);
        if (this.f11425b != null && this.f11425b.getMosaicStatus() == 1) {
            this.Y.setVisibility(0);
        }
        this.l = view.findViewById(C0906R.id.coz);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j2, long j3, String str, Runnable runnable, DialogInterface dialogInterface) {
        TTLiveSDKContext.getHostService().k().a(((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.a) com.bytedance.android.livesdk.user.f.a().a(j2)).a(this.f11425b.getRequestId())).b("live_detail")).c("live")).b(j3)).d(str)).c()).subscribe((io.reactivex.Observer<? super T>) new com.bytedance.android.livesdk.user.g<com.bytedance.android.livesdkapi.depend.model.b.a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11452a;

            public final void onSubscribe(Disposable disposable) {
                Disposable disposable2 = disposable;
                if (PatchProxy.isSupport(new Object[]{disposable2}, this, f11452a, false, 5599, new Class[]{Disposable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{disposable2}, this, f11452a, false, 5599, new Class[]{Disposable.class}, Void.TYPE);
                    return;
                }
                super.onSubscribe(disposable);
                AbsInteractionFragment.this.p.add(disposable2);
            }
        });
        if (com.bytedance.android.livesdk.utils.j.b(this.x)) {
            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "follow", com.bytedance.android.livesdk.utils.j.c(this.x));
        }
        dialogInterface.dismiss();
        runnable.run();
        this.w.g();
        f();
    }

    public final boolean a(com.bytedance.android.live.gift.a.b bVar, long j2, String str, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{bVar, new Long(j4), str, new Long(j5)}, this, f11424a, false, 5461, new Class[]{com.bytedance.android.live.gift.a.b.class, Long.TYPE, String.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, new Long(j4), str, new Long(j5)}, this, f11424a, false, 5461, new Class[]{com.bytedance.android.live.gift.a.b.class, Long.TYPE, String.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (getParentFragment() != null) {
                if (getParentFragment().getActivity() != null) {
                    if (((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(j4) == null) {
                        return false;
                    }
                    if (this.bc == null) {
                        this.bc = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getGiftGuideDialog(getParentFragment().getActivity(), this.f11425b, TTLiveSDKContext.getHostService().k().a(), bVar, j2, str, j3, this.U, this.x);
                    }
                    if (this.bc != null && !this.bc.isShowing()) {
                        this.bc.show();
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5462, new Class[0], Void.TYPE);
            return;
        }
        if (this.bc != null && this.bc.isShowing()) {
            af.a(this.bc);
            this.bc = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        r11.T = r11.S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r13 == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        r12 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.RADIO_INTERACT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        r12 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.RADIO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        r11.S = r12;
        r12 = (android.widget.RelativeLayout.LayoutParams) r11.m.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (r13 == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        r13 = com.bytedance.android.live.core.utils.ac.d(com.ss.android.ugc.aweme.C0906R.dimen.mj);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        r13 = com.bytedance.android.live.core.utils.ac.d(com.ss.android.ugc.aweme.C0906R.dimen.qf);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        r12.bottomMargin = r13;
        r12.rightMargin = com.bytedance.android.live.core.utils.ac.d(com.ss.android.ugc.aweme.C0906R.dimen.mk);
        r11.m.setLayoutParams(r12);
        r();
        r11.ac.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r12, boolean r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r12)
            r3[r1] = r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r13)
            r3[r0] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f11424a
            r6 = 0
            r7 = 5468(0x155c, float:7.662E-42)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r1] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r0] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r11
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004d
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)
            r4[r1] = r12
            java.lang.Byte r12 = java.lang.Byte.valueOf(r13)
            r4[r0] = r12
            com.meituan.robust.ChangeQuickRedirect r6 = f11424a
            r7 = 0
            r8 = 5468(0x155c, float:7.662E-42)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r12 = java.lang.Boolean.TYPE
            r9[r1] = r12
            java.lang.Class r12 = java.lang.Boolean.TYPE
            r9[r0] = r12
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x004d:
            if (r12 == 0) goto L_0x009f
            if (r13 == 0) goto L_0x0057
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r2 = r11.S
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r3 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.RADIO_INTERACT
            if (r2 == r3) goto L_0x009f
        L_0x0057:
            if (r13 != 0) goto L_0x005f
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r2 = r11.S
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r3 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.RADIO
            if (r2 == r3) goto L_0x009f
        L_0x005f:
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r12 = r11.S
            r11.T = r12
            if (r13 == 0) goto L_0x0068
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r12 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.RADIO_INTERACT
            goto L_0x006a
        L_0x0068:
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r12 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.RADIO
        L_0x006a:
            r11.S = r12
            android.widget.FrameLayout r12 = r11.m
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            if (r13 == 0) goto L_0x007e
            r13 = 2131427818(0x7f0b01ea, float:1.8477263E38)
            int r13 = com.bytedance.android.live.core.utils.ac.d(r13)
            goto L_0x0085
        L_0x007e:
            r13 = 2131427962(0x7f0b027a, float:1.8477555E38)
            int r13 = com.bytedance.android.live.core.utils.ac.d(r13)
        L_0x0085:
            r12.bottomMargin = r13
            r13 = 2131427819(0x7f0b01eb, float:1.8477265E38)
            int r13 = com.bytedance.android.live.core.utils.ac.d(r13)
            r12.rightMargin = r13
            android.widget.FrameLayout r13 = r11.m
            r13.setLayoutParams(r12)
            r11.r()
            android.view.View r12 = r11.ac
            r13 = 4
            r12.setVisibility(r13)
            return
        L_0x009f:
            if (r12 != 0) goto L_0x00cf
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r12 = r11.S
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r13 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.NORMAL
            if (r12 == r13) goto L_0x00cf
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r12 = r11.T
            r11.S = r12
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r12 = r11.S
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r13 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.NORMAL
            if (r12 != r13) goto L_0x00c1
            android.widget.FrameLayout r12 = r11.m
            android.widget.RelativeLayout$LayoutParams r13 = r11.af
            r12.setLayoutParams(r13)
            r11.r()
            android.view.View r12 = r11.ac
            r12.setVisibility(r1)
            return
        L_0x00c1:
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r12 = r11.S
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r13 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.RADIO
            if (r12 != r13) goto L_0x00cf
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$a r12 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a.NORMAL
            r11.S = r12
            r12 = 1
            r13 = 0
            goto L_0x0002
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a(boolean, boolean):void");
    }

    private void a(boolean z2, int i2, int i3, boolean z3) {
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f11424a, false, 5469, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z3)}, this, f11424a, false, 5469, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!z2) {
            if (this.ae != null) {
                this.ad.setLayoutParams(this.ae);
                this.ae = null;
            }
        } else if (this.ae == null) {
            this.ae = (RelativeLayout.LayoutParams) this.ad.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.ae.width, this.ae.height);
            if (Build.VERSION.SDK_INT < 17 || !com.bytedance.android.live.uikit.d.c.a(getContext())) {
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = i5;
                layoutParams.rightMargin = i4;
            } else {
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = i5;
                if (z3) {
                    layoutParams.addRule(21);
                    layoutParams.setMarginEnd(i4);
                } else {
                    layoutParams.rightMargin = i4;
                }
            }
            this.ad.setLayoutParams(layoutParams);
        }
    }

    public final void a(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f11424a, false, 5474, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f11424a, false, 5474, new Class[]{Runnable.class}, Void.TYPE);
        } else if (this.y != null) {
            this.bm = null;
            runnable.run();
        } else {
            this.bm = runnable;
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f11424a, false, 5478, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f11424a, false, 5478, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new ae(false, 2));
        if (this.q.hasMessages(200)) {
            this.q.removeMessages(200);
        }
        this.q.sendEmptyMessageDelayed(200, j2);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f11424a, false, 5484, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f11424a, false, 5484, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (th instanceof com.bytedance.android.live.a.a.b.a) {
            int errorCode = ((com.bytedance.android.live.a.a.b.a) th).getErrorCode();
            if (30003 == errorCode) {
                a(7);
            } else if (50001 == errorCode) {
                if (this.D != null) {
                    this.D.b(true);
                }
            } else if (50002 == errorCode) {
                a(10);
            } else if (30005 == errorCode) {
                if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5537, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5537, new Class[0], Void.TYPE);
                } else {
                    if (this.f11426c) {
                        new m.a(getActivity(), 0).d((int) C0906R.string.ddr).c((int) C0906R.string.d0i).b(0, (int) C0906R.string.d47, f.f12258b).a((DialogInterface.OnDismissListener) new g(this)).c();
                    }
                }
            } else if (30006 == errorCode && !this.f11427d) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new s(20));
            }
        }
    }

    public void onEvent(x xVar) {
        x xVar2 = xVar;
        if (PatchProxy.isSupport(new Object[]{xVar2}, this, f11424a, false, 5487, new Class[]{x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xVar2}, this, f11424a, false, 5487, new Class[]{x.class}, Void.TYPE);
            return;
        }
        if (xVar2 != null && xVar2.f10206a != null) {
            a(xVar2.f10206a);
        }
    }

    public final void a(ShareReportResult shareReportResult) {
        if (PatchProxy.isSupport(new Object[]{shareReportResult}, this, f11424a, false, 5488, new Class[]{ShareReportResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareReportResult}, this, f11424a, false, 5488, new Class[]{ShareReportResult.class}, Void.TYPE);
            return;
        }
        if (!(shareReportResult == null || shareReportResult.getDeltaIntimacy() <= 0 || this.f11425b == null)) {
            ((IMessageManager) this.x.get("data_message_manager")).insertMessage(com.bytedance.android.livesdk.chatroom.bl.c.a(this.f11425b.getId(), shareReportResult.getDisplayText(), this.s), true);
        }
    }

    public final void a(Disposable disposable) {
        Disposable disposable2 = disposable;
        if (PatchProxy.isSupport(new Object[]{disposable2}, this, f11424a, false, 5489, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable2}, this, f11424a, false, 5489, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        this.p.add(disposable2);
    }

    public final void a(com.bytedance.android.livesdk.message.model.j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f11424a, false, 5492, new Class[]{com.bytedance.android.livesdk.message.model.j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f11424a, false, 5492, new Class[]{com.bytedance.android.livesdk.message.model.j.class}, Void.TYPE);
        } else if (this.f11426c) {
            int i2 = jVar.f16637b;
            if (3 == i2) {
                a(7);
            } else if (4 == i2) {
                s sVar = new s(7);
                sVar.f10197c = jVar;
                a(sVar);
                if (!StringUtils.isEmpty(jVar.f16638c)) {
                    ai.a(jVar.f16638c, 1);
                }
            } else if (1 != i2) {
                if (2 == i2) {
                    this.aV = false;
                    if (this.bp != null) {
                        this.bp.a(2);
                    }
                    if (this.f11425b.getMosaicStatus() == 0) {
                        this.Y.setVisibility(8);
                        if (!this.f11427d) {
                            com.bytedance.android.live.uikit.d.a.a((Context) getActivity(), (int) C0906R.string.dbr);
                            com.bytedance.android.livesdk.u.a.a().a((Object) new s(31));
                        }
                    }
                }
            } else if (!this.f11427d && !this.f11425b.isThirdParty && !this.f11425b.isScreenshot) {
                this.aV = true;
                if (this.bp != null) {
                    this.bp.a(3);
                }
                if (this.Y.getVisibility() == 8) {
                    if (!this.f11427d) {
                        com.bytedance.android.livesdk.u.a.a().a((Object) new s(30));
                    }
                    this.Y.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0218, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.message.model.c r16) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.c> r1 = com.bytedance.android.livesdk.message.model.c.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 5493(0x1575, float:7.697E-42)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5493(0x1575, float:7.697E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.c> r1 = com.bytedance.android.livesdk.message.model.c.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            boolean r0 = r7.f11426c
            if (r0 == 0) goto L_0x02f9
            if (r8 != 0) goto L_0x003b
            goto L_0x02f9
        L_0x003b:
            com.bytedance.android.livesdkapi.depend.f.a r0 = r16.getMessageType()
            int[] r1 = com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.AnonymousClass10.f11433a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x023d;
                case 2: goto L_0x0237;
                case 3: goto L_0x0237;
                case 4: goto L_0x0219;
                case 5: goto L_0x006e;
                case 6: goto L_0x0055;
                case 7: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x02f8
        L_0x004c:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.x
            java.lang.String r1 = "data_dou_plus_promote_message"
            r0.lambda$put$1$DataCenter(r1, r8)
            goto L_0x02f8
        L_0x0055:
            r0 = r8
            com.bytedance.android.livesdk.message.model.ad r0 = (com.bytedance.android.livesdk.message.model.ad) r0
            long r0 = r0.f16438b
            r2 = 2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0068
            com.bytedance.common.utility.collection.WeakHandler r0 = r7.q
            java.lang.Runnable r1 = r7.bn
            r0.post(r1)
            return
        L_0x0068:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.add(r8)
            return
        L_0x006e:
            com.bytedance.android.livesdk.message.model.ax r8 = (com.bytedance.android.livesdk.message.model.ax) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5500(0x157c, float:7.707E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.ax> r1 = com.bytedance.android.livesdk.message.model.ax.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f11424a
            r3 = 0
            r4 = 5500(0x157c, float:7.707E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.ax> r1 = com.bytedance.android.livesdk.message.model.ax.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02f8
        L_0x009f:
            boolean r0 = r7.f11426c
            if (r0 == 0) goto L_0x02f8
            if (r8 != 0) goto L_0x00a7
            goto L_0x02f8
        L_0x00a7:
            int r0 = r8.f16521c
            switch(r0) {
                case 1: goto L_0x02f8;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00bf;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.e.x.f10027b
            boolean r1 = r8.supportDisplayText()
            if (r1 == 0) goto L_0x0111
            com.bytedance.android.livesdkapi.h.b r0 = r8.baseMessage
            com.bytedance.android.livesdkapi.h.e r0 = r0.j
            java.lang.String r1 = ""
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r0, (java.lang.String) r1)
            goto L_0x0111
        L_0x00bf:
            boolean r0 = r7.aV
            r1 = 8
            if (r0 != 0) goto L_0x00ca
            android.widget.TextView r0 = r7.Y
            r0.setVisibility(r1)
        L_0x00ca:
            com.airbnb.lottie.LottieAnimationView r0 = r7.aY
            r0.setVisibility(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r7.aY
            r0.cancelAnimation()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f11425b
            r0.setMosaicStatus(r10)
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$b r0 = r7.bp
            if (r0 == 0) goto L_0x0218
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$b r0 = r7.bp
            r0.a((com.bytedance.android.livesdk.message.model.ax) r8)
            goto L_0x02f8
        L_0x00e4:
            boolean r0 = r7.f11427d
            if (r0 != 0) goto L_0x00ee
            android.widget.TextView r0 = r7.Y
            r0.setVisibility(r10)
            goto L_0x00f8
        L_0x00ee:
            com.airbnb.lottie.LottieAnimationView r0 = r7.aY
            r0.setVisibility(r10)
            com.airbnb.lottie.LottieAnimationView r0 = r7.aY
            r0.playAnimation()
        L_0x00f8:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f11425b
            r0.setMosaicStatus(r9)
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$b r0 = r7.bp
            if (r0 == 0) goto L_0x0106
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$b r0 = r7.bp
            r0.a((com.bytedance.android.livesdk.message.model.ax) r8)
        L_0x0106:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.x
            java.lang.String r1 = "cmd_force_close_linkin"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.lambda$put$1$DataCenter(r1, r2)
            goto L_0x02f8
        L_0x0111:
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.e.x.f10027b
            if (r0 != r1) goto L_0x0124
            java.lang.String r1 = r8.f16520b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0124
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r1 = r8.f16520b
            r0.<init>(r1)
        L_0x0124:
            com.bytedance.android.livesdkapi.h.e r1 = r8.f16523e
            java.lang.String r2 = ""
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r1, (java.lang.String) r2)
            com.bytedance.android.livesdkapi.h.e r2 = r8.f16524f
            java.lang.String r3 = ""
            android.text.Spannable r2 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r2, (java.lang.String) r3)
            com.bytedance.android.livesdkapi.h.e r3 = r8.g
            java.lang.String r4 = ""
            android.text.Spannable r3 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r3, (java.lang.String) r4)
            com.bytedance.android.livesdkapi.h.e r4 = r8.h
            java.lang.String r5 = ""
            android.text.Spannable r4 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r4, (java.lang.String) r5)
            boolean r5 = com.bytedance.android.live.uikit.a.a.d()
            r6 = 2131563489(0x7f0d13e1, float:1.8752436E38)
            if (r5 == 0) goto L_0x01db
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x016e
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x015a
            goto L_0x016e
        L_0x015a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "\n"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x016e:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0218
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x017e
            java.lang.String r1 = com.bytedance.android.live.core.utils.ac.a((int) r6)
        L_0x017e:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x018e
            java.lang.String r2 = r8.i
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x018e
            r2 = 1
            goto L_0x018f
        L_0x018e:
            r2 = 0
        L_0x018f:
            com.bytedance.android.livesdk.chatroom.ui.eo$a r3 = new com.bytedance.android.livesdk.chatroom.ui.eo$a
            android.content.Context r5 = r15.getContext()
            r3.<init>(r5, r9)
            com.bytedance.android.livesdk.chatroom.ui.eo$a r1 = r3.a((java.lang.CharSequence) r1)
            com.bytedance.android.livesdk.chatroom.ui.eo$a r0 = r1.b((java.lang.CharSequence) r0)
            com.bytedance.android.livesdk.chatroom.ui.eo$a r0 = r0.a((boolean) r10)
            r1 = 2131563511(0x7f0d13f7, float:1.8752481E38)
            java.lang.String r1 = com.bytedance.android.live.core.utils.ac.a((int) r1)
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$2 r3 = new com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment$2
            r3.<init>()
            com.bytedance.android.livesdk.chatroom.ui.eo$d r5 = r0.f12205b
            r5.g = r1
            com.bytedance.android.livesdk.chatroom.ui.eo$d r1 = r0.f12205b
            r1.h = r3
            com.bytedance.android.livesdk.chatroom.ui.eo r0 = r0.a()
            if (r2 == 0) goto L_0x01c3
            java.lang.String r1 = r8.i
            r0.a(r9, r4, r1)
        L_0x01c3:
            r0.show()
            android.support.v4.app.FragmentActivity r0 = r15.getActivity()
            com.bytedance.android.livesdk.j.f r8 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r0)
            java.lang.String r9 = "live_anchor_popup"
            java.lang.String r10 = "show"
            r11 = 0
            r13 = 0
            r8.a(r9, r10, r11, r13)
            goto L_0x02f8
        L_0x01db:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0218
            com.bytedance.android.livesdk.widget.m$a r1 = new com.bytedance.android.livesdk.widget.m$a
            android.support.v4.app.FragmentActivity r2 = r15.getActivity()
            r1.<init>(r2, r10)
            com.bytedance.android.livesdk.widget.m$a r1 = r1.a((boolean) r10)
            com.bytedance.android.livesdk.widget.m$a r1 = r1.d((int) r6)
            com.bytedance.android.livesdk.widget.m$a r0 = r1.c((java.lang.CharSequence) r0)
            r1 = 2131563677(0x7f0d149d, float:1.8752818E38)
            com.bytedance.android.livesdk.chatroom.ui.e r2 = new com.bytedance.android.livesdk.chatroom.ui.e
            r2.<init>(r15)
            com.bytedance.android.livesdk.widget.m$a r0 = r0.b((int) r10, (int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r0.c()
            android.support.v4.app.FragmentActivity r0 = r15.getActivity()
            com.bytedance.android.livesdk.j.f r8 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r0)
            java.lang.String r9 = "live_anchor_popup"
            java.lang.String r10 = "show"
            r11 = 0
            r13 = 0
            r8.a(r9, r10, r11, r13)
        L_0x0218:
            return
        L_0x0219:
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget r0 = r7.aP
            if (r0 != 0) goto L_0x022f
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget r0 = new com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget
            boolean r1 = r15.b()
            r0.<init>(r1)
            r7.aP = r0
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r0 = r7.A
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget r1 = r7.aP
            r0.load(r1)
        L_0x022f:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r7.f11425b
            r0.lambda$addFollowGuideMessage$1$PlatformMessageHelper(r1, r8)
            return
        L_0x0237:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.add(r8)
            return
        L_0x023d:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f11425b
            long r0 = r0.getId()
            boolean r0 = r8.isCurrentRoom(r0)
            if (r0 == 0) goto L_0x02f8
            r0 = r8
            com.bytedance.android.livesdk.message.model.as r0 = (com.bytedance.android.livesdk.message.model.as) r0
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r7.x
            java.lang.String r2 = "data_member_message"
            r1.lambda$put$1$DataCenter(r2, r0)
            com.bytedance.android.live.base.model.user.User r1 = r0.f16486c
            if (r1 == 0) goto L_0x02f8
            long r1 = r1.getId()
            com.bytedance.android.livesdk.v.e r3 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r3 = r3.k()
            long r3 = r3.b()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x02f8
            r1 = 3
            long r3 = r0.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x02eb
            r1 = 9
            long r3 = r0.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0280
            goto L_0x02eb
        L_0x0280:
            r1 = 4
            long r3 = r0.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x02de
            r1 = 10
            long r3 = r0.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0295
            goto L_0x02de
        L_0x0295:
            r1 = 5
            long r3 = r0.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x02a3
            r15.a((boolean) r9)
            return
        L_0x02a3:
            r1 = 6
            long r3 = r0.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x02b1
            r15.a((boolean) r10)
            return
        L_0x02b1:
            r1 = 7
            long r3 = r0.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x02c1
            r0 = 11
            r15.a((int) r0)
            return
        L_0x02c1:
            r1 = 11
            long r3 = r0.a()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x02f8
            boolean r0 = r7.f11427d
            if (r0 != 0) goto L_0x02f8
            com.bytedance.android.livesdk.u.a r0 = com.bytedance.android.livesdk.u.a.a()
            com.bytedance.android.livesdk.chatroom.event.s r1 = new com.bytedance.android.livesdk.chatroom.event.s
            r2 = 20
            r1.<init>(r2)
            r0.a((java.lang.Object) r1)
            return
        L_0x02de:
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r0 = r7.D
            if (r0 == 0) goto L_0x02e7
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r0 = r7.D
            r0.b((boolean) r10)
        L_0x02e7:
            r15.g(r10)
            return
        L_0x02eb:
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r0 = r7.D
            if (r0 == 0) goto L_0x02f4
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r0 = r7.D
            r0.b((boolean) r9)
        L_0x02f4:
            r15.g(r9)
            return
        L_0x02f8:
            return
        L_0x02f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a(com.bytedance.android.livesdk.message.model.c):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: com.bytedance.android.live.core.utils.fresco.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x05b0  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0635  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0641  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x067b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdkapi.h.a r28) {
        /*
            r27 = this;
            r8 = r27
            r0 = r28
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f11424a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdkapi.h.a> r2 = com.bytedance.android.livesdkapi.h.a.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 5494(0x1576, float:7.699E-42)
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f11424a
            r4 = 0
            r5 = 5494(0x1576, float:7.699E-42)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdkapi.h.a> r0 = com.bytedance.android.livesdkapi.h.a.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            if (r0 != 0) goto L_0x003e
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
            return
        L_0x003e:
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.message.model.l
            r4 = 4
            r5 = 8
            r6 = 3
            r7 = 2
            if (r1 == 0) goto L_0x040b
            com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget r1 = r8.aG
            if (r1 == 0) goto L_0x040b
            boolean r1 = com.bytedance.android.live.uikit.a.a.d()
            if (r1 == 0) goto L_0x040b
            com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget r1 = r8.aG
            com.bytedance.android.livesdk.message.model.l r0 = (com.bytedance.android.livesdk.message.model.l) r0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget.f12812a
            r14 = 0
            r15 = 7512(0x1d58, float:1.0527E-41)
            java.lang.Class[] r12 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.l> r16 = com.bytedance.android.livesdk.message.model.l.class
            r12[r10] = r16
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r12
            r12 = r1
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x0088
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget.f12812a
            r14 = 0
            r15 = 7512(0x1d58, float:1.0527E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.l> r2 = com.bytedance.android.livesdk.message.model.l.class
            r0[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0adf
        L_0x0088:
            boolean r11 = r1.isViewValid()
            if (r11 == 0) goto L_0x0404
            if (r0 == 0) goto L_0x0404
            int r11 = r0.f16653f
            if (r11 == r7) goto L_0x009e
            int r11 = r0.f16653f
            if (r11 == r6) goto L_0x009e
            int r11 = r0.f16653f
            if (r11 == r4) goto L_0x009e
            goto L_0x0404
        L_0x009e:
            int r11 = r0.f16653f
            if (r7 != r11) goto L_0x00a9
            r1.u = r10
            r1.a(r0)
            goto L_0x0adf
        L_0x00a9:
            int r11 = r0.f16653f
            if (r6 != r11) goto L_0x0253
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget.f12812a
            r14 = 0
            r15 = 7510(0x1d56, float:1.0524E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.l> r12 = com.bytedance.android.livesdk.message.model.l.class
            r4[r10] = r12
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x00e0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget.f12812a
            r14 = 0
            r15 = 7510(0x1d56, float:1.0524E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.l> r2 = com.bytedance.android.livesdk.message.model.l.class
            r0[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0403
        L_0x00e0:
            android.view.View r4 = r1.contentView
            if (r4 == 0) goto L_0x0403
            boolean r4 = r1.isViewValid()
            if (r4 != 0) goto L_0x00ec
            goto L_0x0403
        L_0x00ec:
            android.view.View r4 = r1.f12813b
            r4.setVisibility(r5)
            android.view.View r4 = r1.j
            r4.setVisibility(r5)
            android.widget.TextView r4 = r1.f12817f
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.s
            com.bytedance.android.live.base.model.user.User r5 = r5.getOwner()
            java.lang.String r5 = r5.getNickName()
            r4.setText(r5)
            android.widget.ImageView r4 = r1.h
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.s
            com.bytedance.android.live.base.model.user.User r5 = r5.getOwner()
            com.bytedance.android.live.base.model.ImageModel r5 = r5.getAvatarThumb()
            r11 = 2130841141(0x7f020e35, float:1.728734E38)
            com.bytedance.android.livesdk.chatroom.f.b.a((android.widget.ImageView) r4, (com.bytedance.android.live.base.model.ImageModel) r5, (int) r11)
            boolean r4 = r0.supportDisplayText()
            if (r4 == 0) goto L_0x012d
            com.bytedance.android.livesdkapi.h.b r4 = r0.baseMessage
            com.bytedance.android.livesdkapi.h.e r4 = r4.j
            java.lang.String r5 = r0.f16649b
            android.text.Spannable r4 = com.bytedance.android.livesdk.chatroom.e.y.a((com.bytedance.android.livesdkapi.h.e) r4, (java.lang.String) r5)
            android.widget.TextView r5 = r1.g
            r5.setText(r4)
            goto L_0x0134
        L_0x012d:
            android.widget.TextView r4 = r1.g
            java.lang.String r5 = r0.f16649b
            r4.setText(r5)
        L_0x0134:
            android.view.View r4 = r1.f12816e
            java.lang.String r5 = "scaleX"
            float[] r11 = new float[r6]
            r11 = {0, 1067869798, 1065353216} // fill-array
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r11)
            android.view.View r5 = r1.f12816e
            java.lang.String r11 = "scaleY"
            float[] r12 = new float[r6]
            r12 = {0, 1067869798, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r11, r12)
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            r1.n = r11
            android.animation.AnimatorSet r11 = r1.n
            android.animation.Animator[] r12 = new android.animation.Animator[r7]
            r12[r10] = r4
            r12[r9] = r5
            r11.playTogether(r12)
            android.animation.AnimatorSet r4 = r1.n
            r11 = 1200(0x4b0, double:5.93E-321)
            android.animation.AnimatorSet r4 = r4.setDuration(r11)
            android.view.animation.BounceInterpolator r5 = new android.view.animation.BounceInterpolator
            r5.<init>()
            r4.setInterpolator(r5)
            android.animation.AnimatorSet r4 = r1.n
            com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$3 r5 = new com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$3
            r5.<init>()
            r4.addListener(r5)
            android.view.animation.BounceInterpolator r4 = new android.view.animation.BounceInterpolator
            r4.<init>()
            android.view.View r5 = r1.i
            java.lang.String r13 = "scaleX"
            float[] r14 = new float[r6]
            r14 = {0, 1067869798, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r13, r14)
            r5.setInterpolator(r4)
            android.view.View r13 = r1.i
            java.lang.String r14 = "scaleY"
            float[] r15 = new float[r6]
            r15 = {0, 1067869798, 1065353216} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r13, r14, r15)
            r13.setInterpolator(r4)
            android.view.View r4 = r1.f12815d
            java.lang.String r14 = "alpha"
            float[] r15 = new float[r7]
            r15 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r14, r15)
            android.view.animation.LinearInterpolator r14 = new android.view.animation.LinearInterpolator
            r14.<init>()
            r4.setInterpolator(r14)
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            r1.o = r14
            android.animation.AnimatorSet r14 = r1.o
            android.animation.Animator[] r15 = new android.animation.Animator[r6]
            r15[r10] = r5
            r15[r9] = r13
            r15[r7] = r4
            r14.playTogether(r15)
            android.animation.AnimatorSet r4 = r1.o
            android.animation.AnimatorSet r4 = r4.setDuration(r11)
            r4.setStartDelay(r11)
            com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$4 r4 = new com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$4
            r4.<init>()
            r5.addListener(r4)
            int r4 = r0.f16652e
            if (r4 <= 0) goto L_0x01e3
            int r0 = r0.f16652e
            int r0 = r0 * 1000
            long r2 = (long) r0
            goto L_0x01e5
        L_0x01e3:
            r2 = 0
        L_0x01e5:
            android.view.View r0 = r1.i
            java.lang.String r4 = "alpha"
            float[] r5 = new float[r7]
            r5 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r4, r5)
            android.view.View r4 = r1.f12816e
            java.lang.String r5 = "alpha"
            float[] r11 = new float[r7]
            r11 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r11)
            android.view.View r5 = r1.f12815d
            java.lang.String r11 = "alpha"
            float[] r12 = new float[r7]
            r12 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r11, r12)
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            r1.p = r11
            android.animation.AnimatorSet r11 = r1.p
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r10] = r0
            r6[r9] = r4
            r6[r7] = r5
            r11.playTogether(r6)
            android.animation.AnimatorSet r0 = r1.p
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
            r4.<init>()
            r0.setInterpolator(r4)
            android.animation.AnimatorSet r0 = r1.p
            r4 = 860(0x35c, double:4.25E-321)
            android.animation.AnimatorSet r0 = r0.setDuration(r4)
            r4 = 4140(0x102c, double:2.0454E-320)
            long r2 = r2 + r4
            r0.setStartDelay(r2)
            android.animation.AnimatorSet r0 = r1.p
            com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$5 r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$5
            r2.<init>()
            r0.addListener(r2)
            android.animation.AnimatorSet r0 = r1.n
            r0.start()
            android.animation.AnimatorSet r0 = r1.o
            r0.start()
            android.animation.AnimatorSet r0 = r1.p
            r0.start()
            goto L_0x0adf
        L_0x0253:
            int r6 = r0.f16653f
            if (r4 != r6) goto L_0x0403
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget.f12812a
            r14 = 0
            r15 = 7511(0x1d57, float:1.0525E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.l> r6 = com.bytedance.android.livesdk.message.model.l.class
            r4[r10] = r6
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x028a
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget.f12812a
            r14 = 0
            r15 = 7511(0x1d57, float:1.0525E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.l> r2 = com.bytedance.android.livesdk.message.model.l.class
            r0[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0adf
        L_0x028a:
            if (r0 == 0) goto L_0x0adf
            com.bytedance.android.livesdk.message.model.m r4 = r0.g
            if (r4 == 0) goto L_0x0adf
            com.bytedance.android.livesdk.message.model.m r4 = r0.g
            java.util.List<com.bytedance.android.livesdk.message.model.n> r4 = r4.f16654a
            if (r4 == 0) goto L_0x0adf
            com.bytedance.android.livesdk.message.model.m r4 = r0.g
            java.util.List<com.bytedance.android.livesdk.message.model.n> r4 = r4.f16654a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0adf
            com.bytedance.android.livesdk.message.model.m r4 = r0.g
            java.util.List<com.bytedance.android.livesdk.message.model.n> r4 = r4.f16654a
            java.lang.Object r4 = r4.get(r10)
            if (r4 == 0) goto L_0x0adf
            com.bytedance.android.livesdk.message.model.m r4 = r0.g
            java.util.List<com.bytedance.android.livesdk.message.model.n> r4 = r4.f16654a
            java.lang.Object r4 = r4.get(r10)
            com.bytedance.android.livesdk.message.model.n r4 = (com.bytedance.android.livesdk.message.model.n) r4
            java.lang.String r4 = r4.f16655a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x02be
            goto L_0x0adf
        L_0x02be:
            android.view.View r4 = r1.f12813b
            r4.setVisibility(r5)
            android.view.View r4 = r1.f12815d
            r4.setVisibility(r5)
            android.view.View r4 = r1.f12816e
            r4.setVisibility(r5)
            android.view.View r4 = r1.i
            r4.setVisibility(r5)
            com.bytedance.android.livesdk.message.model.m r0 = r0.g
            java.util.List<com.bytedance.android.livesdk.message.model.n> r0 = r0.f16654a
            java.lang.Object r0 = r0.get(r10)
            com.bytedance.android.livesdk.message.model.n r0 = (com.bytedance.android.livesdk.message.model.n) r0
            int r4 = r1.t
            if (r4 != 0) goto L_0x02ec
            android.view.View r4 = r1.contentView
            if (r4 == 0) goto L_0x02ec
            android.view.View r4 = r1.contentView
            int r4 = r4.getWidth()
            r1.t = r4
        L_0x02ec:
            if (r0 == 0) goto L_0x02fd
            com.bytedance.android.livesdk.chatroom.model.aa r4 = r0.f16660f
            if (r4 == 0) goto L_0x02fd
            android.widget.TextView r4 = r1.l
            com.bytedance.android.livesdk.chatroom.model.aa r5 = r0.f16660f
            java.lang.CharSequence r5 = r5.a()
            r4.setText(r5)
        L_0x02fd:
            android.view.View r4 = r1.j
            com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$6 r5 = new com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$6
            r5.<init>(r0)
            r4.setOnClickListener(r5)
            android.widget.ImageView r4 = r1.k
            com.bytedance.android.live.base.model.user.User r5 = r0.f16657c
            com.bytedance.android.live.base.model.ImageModel r5 = r5.getAvatarThumb()
            com.bytedance.android.livesdk.chatroom.f.b.b(r4, r5)
            android.view.View r4 = r1.j
            r4.setVisibility(r10)
            android.content.Context r4 = r1.context
            boolean r4 = com.bytedance.android.live.uikit.d.c.a(r4)
            r5 = 0
            if (r4 == 0) goto L_0x0333
            android.view.View r4 = r1.j
            java.lang.String r6 = "translationX"
            float[] r11 = new float[r7]
            int r12 = r1.t
            int r12 = -r12
            float r12 = (float) r12
            r11[r10] = r12
            r11[r9] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r6, r11)
            goto L_0x0344
        L_0x0333:
            android.view.View r4 = r1.j
            java.lang.String r6 = "translationX"
            float[] r11 = new float[r7]
            int r12 = r1.t
            float r12 = (float) r12
            r11[r10] = r12
            r11[r9] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r6, r11)
        L_0x0344:
            r1.q = r4
            android.animation.Animator r4 = r1.q
            r11 = 1000(0x3e8, double:4.94E-321)
            r4.setDuration(r11)
            android.animation.Animator r4 = r1.q
            com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$7 r6 = new com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$7
            r6.<init>()
            r4.addListener(r6)
            android.content.Context r4 = r1.context
            boolean r4 = com.bytedance.android.live.uikit.d.c.a(r4)
            if (r4 == 0) goto L_0x0371
            android.view.View r4 = r1.j
            java.lang.String r6 = "translationX"
            float[] r7 = new float[r7]
            r7[r10] = r5
            int r5 = r1.t
            float r5 = (float) r5
            r7[r9] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r6, r7)
            goto L_0x0383
        L_0x0371:
            android.view.View r4 = r1.j
            java.lang.String r6 = "translationX"
            float[] r7 = new float[r7]
            r7[r10] = r5
            int r5 = r1.t
            int r5 = -r5
            float r5 = (float) r5
            r7[r9] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r6, r7)
        L_0x0383:
            r1.r = r4
            android.animation.Animator r4 = r1.r
            r5 = 1000(0x3e8, double:4.94E-321)
            r4.setDuration(r5)
            android.animation.Animator r4 = r1.r
            com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$8 r5 = new com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget$8
            r5.<init>()
            r4.addListener(r5)
            android.animation.Animator r4 = r1.q
            r4.start()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.bytedance.android.live.base.model.user.User r5 = r0.f16657c
            if (r5 == 0) goto L_0x03b3
            java.lang.String r5 = "anchor_id"
            com.bytedance.android.live.base.model.user.User r6 = r0.f16657c
            long r6 = r6.getId()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4.put(r5, r6)
        L_0x03b3:
            java.lang.String r5 = "room_id"
            long r6 = r0.f16656b
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "event_belong"
            java.lang.String r6 = "live_view"
            r4.put(r5, r6)
            java.lang.String r5 = "event_page"
            java.lang.String r6 = "live_detail"
            r4.put(r5, r6)
            java.lang.String r5 = "event_module"
            java.lang.String r6 = "top"
            r4.put(r5, r6)
            java.lang.String r5 = "action_type"
            java.lang.String r6 = "click"
            r4.put(r5, r6)
            java.lang.String r5 = "top_message_type"
            java.lang.String r6 = "regional_rank_top"
            r4.put(r5, r6)
            com.bytedance.android.livesdk.j.a r5 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r6 = "live_show"
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r5.a(r6, r4, r7)
            java.lang.String r12 = "show_roomnotifymessage"
            com.bytedance.android.live.base.model.user.User r4 = r0.f16657c
            if (r4 != 0) goto L_0x03f5
            r13 = 0
            goto L_0x03fc
        L_0x03f5:
            com.bytedance.android.live.base.model.user.User r2 = r0.f16657c
            long r2 = r2.getId()
            r13 = r2
        L_0x03fc:
            long r2 = r0.f16656b
            r11 = r1
            r15 = r2
            r11.a(r12, r13, r15)
        L_0x0403:
            return
        L_0x0404:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
            goto L_0x0adf
        L_0x040b:
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.message.model.bc
            if (r1 == 0) goto L_0x04d2
            boolean r1 = com.bytedance.android.live.uikit.a.a.a()
            if (r1 == 0) goto L_0x042a
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r1 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.ENABLE_ROCKET_ANIMATION_NOTIFICATION
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0424
            goto L_0x042a
        L_0x0424:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
            return
        L_0x042a:
            com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget r2 = r8.ax
            com.bytedance.android.livesdk.message.model.bc r0 = (com.bytedance.android.livesdk.message.model.bc) r0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget.f12641a
            r14 = 0
            r15 = 7218(0x1c32, float:1.0115E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.bc> r3 = com.bytedance.android.livesdk.message.model.bc.class
            r1[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r2
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x045e
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget.f12641a
            r4 = 0
            r5 = 7218(0x1c32, float:1.0115E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.bc> r0 = com.bytedance.android.livesdk.message.model.bc.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0adf
        L_0x045e:
            boolean r1 = r2.isViewValid()
            if (r1 == 0) goto L_0x04cb
            if (r0 != 0) goto L_0x0467
            goto L_0x04cb
        L_0x0467:
            boolean r1 = com.bytedance.android.live.uikit.a.a.f()
            if (r1 == 0) goto L_0x0480
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r2.f12646f
            if (r1 == 0) goto L_0x0480
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r2.f12646f
            int r1 = r1.getOrientation()
            if (r1 != r7) goto L_0x0480
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
            goto L_0x0adf
        L_0x0480:
            android.view.View r1 = r2.f12643c
            r1.setVisibility(r10)
            android.view.View r1 = r2.f12643c
            int r3 = r2.h
            float r3 = (float) r3
            r1.setTranslationX(r3)
            android.widget.TextView r1 = r2.f12645e
            r1.setScrollX(r10)
            com.bytedance.android.livesdk.message.model.bd r1 = r0.f16548f
            if (r1 == 0) goto L_0x04c6
            com.bytedance.android.livesdk.message.model.bd r1 = r0.f16548f
            com.bytedance.android.live.base.model.ImageModel r1 = r1.f16549a
            if (r1 == 0) goto L_0x04c6
            com.bytedance.android.livesdk.message.model.bd r1 = r0.f16548f
            com.bytedance.android.live.base.model.ImageModel r1 = r1.f16549a
            java.util.List r1 = r1.getUrls()
            boolean r1 = com.bytedance.common.utility.Lists.isEmpty(r1)
            if (r1 == 0) goto L_0x04ab
            goto L_0x04c6
        L_0x04ab:
            com.bytedance.android.live.uikit.rtl.AutoRTLImageView r1 = r2.f12644d
            r1.setBackgroundResource(r10)
            com.bytedance.android.live.uikit.rtl.AutoRTLImageView r1 = r2.f12644d
            java.lang.String r3 = "2131165562"
            com.bytedance.android.live.core.utils.fresco.h.a(r1, r3, r0)
            com.bytedance.android.live.uikit.rtl.AutoRTLImageView r1 = r2.f12644d
            com.bytedance.android.livesdk.message.model.bd r0 = r0.f16548f
            com.bytedance.android.live.base.model.ImageModel r0 = r0.f16549a
            com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget$3 r3 = new com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget$3
            r3.<init>()
            com.bytedance.android.livesdk.chatroom.f.b.a((android.widget.ImageView) r1, (com.bytedance.android.live.base.model.ImageModel) r0, (com.bytedance.android.live.core.utils.q.a) r3)
            return
        L_0x04c6:
            r2.a((com.bytedance.android.livesdk.message.model.bc) r0)
            goto L_0x0adf
        L_0x04cb:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
            goto L_0x0adf
        L_0x04d2:
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.message.model.h
            r11 = 0
            r12 = 6
            if (r1 == 0) goto L_0x06da
            com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget r1 = r8.aO
            r2 = r0
            com.bytedance.android.livesdk.message.model.h r2 = (com.bytedance.android.livesdk.message.model.h) r2
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget.f12418a
            r16 = 0
            r17 = 6654(0x19fe, float:9.324E-42)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.h> r3 = com.bytedance.android.livesdk.message.model.h.class
            r0[r10] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0512
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget.f12418a
            r16 = 0
            r17 = 6654(0x19fe, float:9.324E-42)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.h> r2 = com.bytedance.android.livesdk.message.model.h.class
            r0[r10] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0adf
        L_0x0512:
            com.bytedance.android.livesdkapi.h.b r0 = r2.baseMessage
            com.bytedance.android.livesdkapi.h.e r3 = r0.j
            if (r3 != 0) goto L_0x051f
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
            goto L_0x0adf
        L_0x051f:
            java.lang.String r0 = r2.f16630e
            if (r0 != 0) goto L_0x0527
            java.lang.String r0 = "#ff9d5c"
            r2.f16630e = r0
        L_0x0527:
            java.lang.String r0 = r2.f16631f
            if (r0 != 0) goto L_0x052f
            java.lang.String r0 = "#ff5c67"
            r2.f16631f = r0
        L_0x052f:
            java.lang.String r0 = r2.g
            if (r0 != 0) goto L_0x0537
            java.lang.String r0 = "#ffffff"
            r2.g = r0
        L_0x0537:
            android.content.Context r0 = r1.context
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r4 = 2131691336(0x7f0f0748, float:1.901174E38)
            android.view.View r0 = r0.inflate(r4, r11)
            r4 = r0
            com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout r4 = (com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout) r4
            com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout$a r0 = r1.f12419b
            r4.setOnDetachListener(r0)
            r0 = 2131166114(0x7f0703a2, float:1.7946464E38)
            android.view.View r0 = r4.findViewById(r0)
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 2131170691(0x7f071583, float:1.7955747E38)
            android.view.View r0 = r4.findViewById(r0)
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2131167772(0x7f070a1c, float:1.7949827E38)
            android.view.View r0 = r4.findViewById(r0)
            r13 = r0
            com.bytedance.android.live.core.widget.HSImageView r13 = (com.bytedance.android.live.core.widget.HSImageView) r13
            java.lang.String r0 = "#ff9d5c"
            int r14 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = "#ff5c67"
            int r15 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = r2.f16630e     // Catch:{ Exception -> 0x058e }
            java.lang.String r0 = r1.a(r0)     // Catch:{ Exception -> 0x058e }
            java.lang.String r5 = r2.f16631f     // Catch:{ Exception -> 0x058e }
            java.lang.String r5 = r1.a(r5)     // Catch:{ Exception -> 0x058e }
            int r16 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x058e }
            int r0 = android.graphics.Color.parseColor(r5)     // Catch:{ Exception -> 0x058c }
            r15 = r0
            goto L_0x059a
        L_0x058c:
            r0 = move-exception
            goto L_0x0591
        L_0x058e:
            r0 = move-exception
            r16 = r14
        L_0x0591:
            java.lang.String r5 = "CommonToastWidget"
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.bytedance.android.live.core.c.a.a((int) r12, (java.lang.String) r5, (java.lang.StackTraceElement[]) r0)
        L_0x059a:
            int[] r0 = new int[r7]
            r0[r10] = r16
            r0[r9] = r15
            android.content.Context r5 = r1.context
            boolean r5 = com.bytedance.android.live.uikit.d.c.a(r5)
            if (r5 == 0) goto L_0x05b0
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            r5.<init>(r12, r0)
            goto L_0x05b7
        L_0x05b0:
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r5.<init>(r12, r0)
        L_0x05b7:
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = com.bytedance.android.live.core.utils.ac.a((float) r0)
            float r0 = (float) r0
            r5.setCornerRadius(r0)
            r6.setBackgroundDrawable(r5)
            com.bytedance.android.live.base.model.ImageModel r0 = r2.i
            if (r0 == 0) goto L_0x05f6
            r13.setVisibility(r10)
            int r0 = r2.j
            if (r0 <= 0) goto L_0x05f0
            int r0 = r2.k
            if (r0 <= 0) goto L_0x05f0
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            int r5 = r2.j
            r0.width = r5
            int r5 = r2.k
            r0.height = r5
            r13.requestLayout()
            com.bytedance.android.live.base.model.ImageModel r0 = r2.i
            int r5 = r13.getWidth()
            int r6 = r13.getHeight()
            com.bytedance.android.livesdk.chatroom.f.b.a(r13, r0, r5, r6)
            goto L_0x05fb
        L_0x05f0:
            com.bytedance.android.live.base.model.ImageModel r0 = r2.i
            com.bytedance.android.livesdk.chatroom.f.b.a((android.widget.ImageView) r13, (com.bytedance.android.live.base.model.ImageModel) r0)
            goto L_0x05fb
        L_0x05f6:
            r5 = 8
            r13.setVisibility(r5)
        L_0x05fb:
            java.lang.String r0 = r3.f18783b
            java.lang.String r5 = r3.f18782a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x061b
            com.bytedance.android.livesdk.i18n.b r5 = com.bytedance.android.livesdk.i18n.b.a()
            java.lang.String r6 = r3.f18782a
            java.lang.String r5 = r5.a(r6)
            if (r5 == 0) goto L_0x061b
            com.bytedance.android.livesdk.i18n.b r0 = com.bytedance.android.livesdk.i18n.b.a()
            java.lang.String r5 = r3.f18782a
            java.lang.String r0 = r0.a(r5)
        L_0x061b:
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.e.y.a((java.lang.String) r0, (com.bytedance.android.livesdkapi.h.e) r3)
            r11.setText(r0)
            int r0 = r2.h
            if (r0 == 0) goto L_0x0635
            if (r0 == r7) goto L_0x062c
            r0 = 17
            r3 = 0
            goto L_0x063d
        L_0x062c:
            r0 = 80
            r3 = 1115684864(0x42800000, float:64.0)
            int r3 = com.bytedance.android.live.core.utils.ac.a((float) r3)
            goto L_0x063d
        L_0x0635:
            r0 = 48
            r3 = 1116733440(0x42900000, float:72.0)
            int r3 = com.bytedance.android.live.core.utils.ac.a((float) r3)
        L_0x063d:
            boolean r5 = r2.l
            if (r5 == 0) goto L_0x067b
            com.bytedance.android.livesdk.widget.m$a r0 = new com.bytedance.android.livesdk.widget.m$a
            android.content.Context r3 = r1.context
            r0.<init>(r3)
            com.bytedance.android.livesdk.widget.m$c r3 = r0.f18515b
            r3.f18524f = r4
            com.bytedance.android.livesdk.widget.m r0 = r0.c()
            int r3 = r2.f16629d
            if (r3 <= 0) goto L_0x0adf
            int r2 = r2.f16629d
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Single r2 = io.reactivex.Single.timer(r2, r4)
            io.reactivex.Scheduler r3 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Single r2 = r2.observeOn(r3)
            com.bytedance.android.live.core.rxutils.autodispose.m r1 = r1.autoDispose()
            java.lang.Object r1 = r2.as(r1)
            com.bytedance.android.live.core.rxutils.autodispose.af r1 = (com.bytedance.android.live.core.rxutils.autodispose.af) r1
            com.bytedance.android.livesdk.chatroom.viewmodule.p r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.p
            r2.<init>(r0)
            io.reactivex.functions.Consumer r0 = com.bytedance.android.livesdk.chatroom.viewmodule.q.f13289b
            r1.a(r2, r0)
            goto L_0x0adf
        L_0x067b:
            android.widget.Toast r5 = new android.widget.Toast
            android.content.Context r1 = r1.context
            android.content.Context r1 = r1.getApplicationContext()
            r5.<init>(r1)
            r5.setView(r4)
            r5.setGravity(r0, r10, r3)
            int r0 = r2.f16629d
            if (r0 <= 0) goto L_0x0693
            int r0 = r2.f16629d
            goto L_0x0694
        L_0x0693:
            r0 = 0
        L_0x0694:
            r5.setDuration(r0)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r5
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.r.f13290a
            r14 = 1
            r15 = 6659(0x1a03, float:9.331E-42)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.widget.Toast> r1 = android.widget.Toast.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x06ca
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r5
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.r.f13290a
            r14 = 1
            r15 = 6659(0x1a03, float:9.331E-42)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.widget.Toast> r1 = android.widget.Toast.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0adf
        L_0x06ca:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L_0x06d6
            r0 = r5
            android.widget.Toast r0 = (android.widget.Toast) r0
            com.ss.android.ugc.aweme.utils.eq.a(r0)
        L_0x06d6:
            r5.show()
            return
        L_0x06da:
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.message.model.x
            if (r1 == 0) goto L_0x0a74
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget r1 = r8.aP
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r8.f11425b
            com.bytedance.android.livesdk.message.model.x r0 = (com.bytedance.android.livesdk.message.model.x) r0
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r10] = r5
            r13[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget.f12503a
            r16 = 0
            r17 = 6796(0x1a8c, float:9.523E-42)
            java.lang.Class[] r14 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r18 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r14[r10] = r18
            java.lang.Class<com.bytedance.android.livesdk.message.model.x> r18 = com.bytedance.android.livesdk.message.model.x.class
            r14[r9] = r18
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r14
            r14 = r1
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r13 == 0) goto L_0x0725
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r10] = r5
            r13[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget.f12503a
            r16 = 0
            r17 = 6796(0x1a8c, float:9.523E-42)
            java.lang.Class[] r0 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r2 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r0[r10] = r2
            java.lang.Class<com.bytedance.android.livesdk.message.model.x> r2 = com.bytedance.android.livesdk.message.model.x.class
            r0[r9] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0adf
        L_0x0725:
            if (r5 == 0) goto L_0x0adf
            boolean r13 = r1.isViewValid()
            if (r13 != 0) goto L_0x072f
            goto L_0x0adf
        L_0x072f:
            r1.f12504b = r5
            java.lang.String r13 = r0.f16704c
            com.bytedance.android.live.base.model.user.User r14 = r5.getOwner()
            com.bytedance.android.live.base.model.user.g r14 = r14.getFollowInfo()
            long r14 = r14.f7764d
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x0a6e
            r16 = 1
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x0a6e
            r16 = 2
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0751
            goto L_0x0a6e
        L_0x0751:
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r10] = r5
            r13[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget.f12503a
            r16 = 0
            r17 = 6799(0x1a8f, float:9.527E-42)
            java.lang.Class[] r14 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r18 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r14[r10] = r18
            java.lang.Class<com.bytedance.android.livesdk.message.model.x> r18 = com.bytedance.android.livesdk.message.model.x.class
            r14[r9] = r18
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r14
            r14 = r1
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r13 == 0) goto L_0x0792
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r10] = r5
            r13[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget.f12503a
            r16 = 0
            r17 = 6799(0x1a8f, float:9.527E-42)
            java.lang.Class[] r4 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r5 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r4[r10] = r5
            java.lang.Class<com.bytedance.android.livesdk.message.model.x> r5 = com.bytedance.android.livesdk.message.model.x.class
            r4[r9] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x09e1
        L_0x0792:
            com.bytedance.android.live.core.widget.HSImageView r13 = r1.h
            com.bytedance.android.live.base.model.ImageModel r14 = r0.f16705d
            if (r14 != 0) goto L_0x07a1
            com.bytedance.android.live.base.model.user.User r14 = r5.getOwner()
            com.bytedance.android.live.base.model.ImageModel r14 = r14.getAvatarThumb()
            goto L_0x07a3
        L_0x07a1:
            com.bytedance.android.live.base.model.ImageModel r14 = r0.f16705d
        L_0x07a3:
            android.content.Context r15 = r1.context
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = com.bytedance.android.livesdk.utils.ak.a(r15, r2)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r10] = r13
            r3[r9] = r14
            r15 = 2130841429(0x7f020f55, float:1.7287925E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r3[r7] = r16
            r15 = -1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r3[r6] = r16
            java.lang.Float r16 = java.lang.Float.valueOf(r2)
            r3[r4] = r16
            r16 = 5
            r3[r16] = r11
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = com.bytedance.android.livesdk.chatroom.f.b.f10213a
            r23 = 1
            r24 = 6482(0x1952, float:9.083E-42)
            java.lang.Class[] r11 = new java.lang.Class[r12]
            java.lang.Class<android.widget.ImageView> r17 = android.widget.ImageView.class
            r11[r10] = r17
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r17 = com.bytedance.android.live.base.model.ImageModel.class
            r11[r9] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r11[r7] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r11[r6] = r17
            java.lang.Class r17 = java.lang.Float.TYPE
            r11[r4] = r17
            java.lang.Class<com.bytedance.android.live.core.utils.q$a> r17 = com.bytedance.android.live.core.utils.q.a.class
            r11[r16] = r17
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r3
            r25 = r11
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
            if (r3 == 0) goto L_0x0844
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r10] = r13
            r3[r9] = r14
            r11 = 2130841429(0x7f020f55, float:1.7287925E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3[r7] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r3[r6] = r11
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3[r4] = r2
            r2 = 0
            r3[r16] = r2
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = com.bytedance.android.livesdk.chatroom.f.b.f10213a
            r23 = 1
            r24 = 6482(0x1952, float:9.083E-42)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<android.widget.ImageView> r11 = android.widget.ImageView.class
            r2[r10] = r11
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r11 = com.bytedance.android.live.base.model.ImageModel.class
            r2[r9] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r2[r7] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r2[r6] = r11
            java.lang.Class r6 = java.lang.Float.TYPE
            r2[r4] = r6
            java.lang.Class<com.bytedance.android.live.core.utils.q$a> r4 = com.bytedance.android.live.core.utils.q.a.class
            r2[r16] = r4
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r3
            r25 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x09b1
        L_0x0844:
            r3 = 8
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r13
            r11[r9] = r14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r11[r7] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r11[r6] = r3
            r3 = 2130841429(0x7f020f55, float:1.7287925E38)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)
            r11[r4] = r17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r11[r16] = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            r11[r12] = r3
            r3 = 7
            r17 = 0
            r11[r3] = r17
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = com.bytedance.android.live.core.utils.q.f8317a
            r23 = 1
            r24 = 1151(0x47f, float:1.613E-42)
            r15 = 8
            java.lang.Class[] r3 = new java.lang.Class[r15]
            java.lang.Class<android.widget.ImageView> r15 = android.widget.ImageView.class
            r3[r10] = r15
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r15 = com.bytedance.android.live.base.model.ImageModel.class
            r3[r9] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r3[r7] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r3[r6] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r3[r4] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r3[r16] = r15
            java.lang.Class r15 = java.lang.Float.TYPE
            r3[r12] = r15
            java.lang.Class<com.bytedance.android.live.core.utils.q$a> r15 = com.bytedance.android.live.core.utils.q.a.class
            r17 = 7
            r3[r17] = r15
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r11
            r25 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
            if (r3 == 0) goto L_0x0912
            r3 = 8
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r13
            r11[r9] = r14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r11[r7] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r11[r6] = r3
            r3 = 2130841429(0x7f020f55, float:1.7287925E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11[r4] = r3
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11[r16] = r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r11[r12] = r2
            r2 = 0
            r3 = 7
            r11[r3] = r2
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = com.bytedance.android.live.core.utils.q.f8317a
            r23 = 1
            r24 = 1151(0x47f, float:1.613E-42)
            r2 = 8
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<android.widget.ImageView> r2 = android.widget.ImageView.class
            r3[r10] = r2
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r2 = com.bytedance.android.live.base.model.ImageModel.class
            r3[r9] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3[r7] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3[r6] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3[r4] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3[r16] = r2
            java.lang.Class r2 = java.lang.Float.TYPE
            r3[r12] = r2
            java.lang.Class<com.bytedance.android.live.core.utils.q$a> r2 = com.bytedance.android.live.core.utils.q.a.class
            r4 = 7
            r3[r4] = r2
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r11
            r25 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x09b1
        L_0x0912:
            android.content.Context r3 = r13.getContext()
            boolean r3 = com.bytedance.android.live.core.utils.q.a((android.content.Context) r3)
            if (r3 == 0) goto L_0x09b1
            android.content.Context r3 = r13.getContext()
            com.bytedance.android.live.core.utils.fresco.a r3 = com.bytedance.android.live.core.utils.fresco.a.a((android.content.Context) r3)
            com.bytedance.android.live.core.utils.fresco.a r3 = r3.a((com.bytedance.android.live.base.model.ImageModel) r14)
            com.bytedance.android.live.core.utils.fresco.a r3 = r3.a()
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r6 = -1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r4[r10] = r11
            java.lang.Float r6 = java.lang.Float.valueOf(r2)
            r4[r9] = r6
            com.meituan.robust.ChangeQuickRedirect r22 = com.bytedance.android.live.core.utils.fresco.a.f8257a
            r23 = 0
            r24 = 1344(0x540, float:1.883E-42)
            java.lang.Class[] r6 = new java.lang.Class[r7]
            java.lang.Class r11 = java.lang.Integer.TYPE
            r6[r10] = r11
            java.lang.Class r11 = java.lang.Float.TYPE
            r6[r9] = r11
            java.lang.Class<com.bytedance.android.live.core.utils.fresco.a> r26 = com.bytedance.android.live.core.utils.fresco.a.class
            r20 = r4
            r21 = r3
            r25 = r6
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
            if (r4 == 0) goto L_0x0988
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r6 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r10] = r6
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r4[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r22 = com.bytedance.android.live.core.utils.fresco.a.f8257a
            r23 = 0
            r24 = 1344(0x540, float:1.883E-42)
            java.lang.Class[] r2 = new java.lang.Class[r7]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r2[r10] = r6
            java.lang.Class r6 = java.lang.Float.TYPE
            r2[r9] = r6
            java.lang.Class<com.bytedance.android.live.core.utils.fresco.a> r26 = com.bytedance.android.live.core.utils.fresco.a.class
            r20 = r4
            r21 = r3
            r25 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            r3 = r2
            com.bytedance.android.live.core.utils.fresco.a r3 = (com.bytedance.android.live.core.utils.fresco.a) r3
            goto L_0x0999
        L_0x0988:
            com.facebook.drawee.generic.RoundingParams r4 = r3.f8259c
            if (r4 != 0) goto L_0x0993
            com.facebook.drawee.generic.RoundingParams r4 = new com.facebook.drawee.generic.RoundingParams
            r4.<init>()
            r3.f8259c = r4
        L_0x0993:
            com.facebook.drawee.generic.RoundingParams r4 = r3.f8259c
            r6 = -1
            r4.setBorder(r6, r2)
        L_0x0999:
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            com.bytedance.android.live.core.utils.fresco.a r2 = r3.a((android.widget.ImageView.ScaleType) r2)
            r3 = 2130841429(0x7f020f55, float:1.7287925E38)
            r2.a((int) r3)
            com.bytedance.android.live.core.utils.k$a r3 = new com.bytedance.android.live.core.utils.k$a
            r4 = 0
            r3.<init>(r4, r4)
            r2.a((com.facebook.drawee.controller.ControllerListener) r3)
            r2.a((android.widget.ImageView) r13)
        L_0x09b1:
            android.widget.TextView r2 = r1.f12507e
            com.bytedance.android.live.base.model.user.i r3 = r5.author()
            java.lang.String r3 = r3.getNickName()
            r2.setText(r3)
            java.lang.String r2 = r0.f16707f
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x09ce
            android.widget.TextView r2 = r1.f12508f
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x09da
        L_0x09ce:
            android.widget.TextView r2 = r1.f12508f
            java.lang.String r3 = r0.f16707f
            r2.setText(r3)
            android.widget.TextView r2 = r1.f12508f
            r2.setVisibility(r10)
        L_0x09da:
            android.widget.TextView r2 = r1.g
            java.lang.String r3 = r0.f16704c
            r2.setText(r3)
        L_0x09e1:
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget$a r2 = r1.f12505c
            r2.show()
            long r2 = r0.f16703b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x09fa
            android.view.View r2 = r1.f12506d
            com.bytedance.android.livesdk.chatroom.viewmodule.aa r3 = new com.bytedance.android.livesdk.chatroom.viewmodule.aa
            r3.<init>(r1)
            long r4 = r0.f16703b
            r2.postDelayed(r3, r4)
        L_0x09fa:
            java.lang.Object[] r13 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget.f12503a
            r16 = 0
            r17 = 6801(0x1a91, float:9.53E-42)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0a23
            java.lang.Object[] r13 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget.f12503a
            r16 = 0
            r17 = 6801(0x1a91, float:9.53E-42)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0adf
        L_0x0a23:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f12504b
            long r3 = r3.getId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f12504b
            com.bytedance.android.live.base.model.user.i r3 = r3.author()
            long r3 = r3.getId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "request_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f12504b
            java.lang.String r3 = r3.getRequestId()
            r0.put(r2, r3)
            java.lang.String[] r2 = new java.lang.String[r7]
            java.lang.String r3 = "enter_from_merge"
            r2[r10] = r3
            java.lang.String r3 = "enter_method"
            r2[r9] = r3
            r1.a(r0, r2)
            com.bytedance.android.livesdk.j.a r1 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r2 = "livesdk_follow_card_show"
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r1.a(r2, r0, r3)
            return
        L_0x0a6e:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
            goto L_0x0adf
        L_0x0a74:
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.message.model.ad
            if (r1 == 0) goto L_0x0ada
            com.bytedance.android.livesdk.message.model.ad r0 = (com.bytedance.android.livesdk.message.model.ad) r0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f11424a
            r4 = 0
            r5 = 5499(0x157b, float:7.706E-42)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.ad> r2 = com.bytedance.android.livesdk.message.model.ad.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0aaa
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f11424a
            r4 = 0
            r5 = 5499(0x157b, float:7.706E-42)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.ad> r0 = com.bytedance.android.livesdk.message.model.ad.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0adf
        L_0x0aaa:
            long r1 = r0.f16438b
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0acb
            long r1 = r0.f16438b
            r3 = 3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0abb
            goto L_0x0acb
        L_0x0abb:
            long r0 = r0.f16438b
            r2 = 2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0ad9
            com.bytedance.common.utility.collection.WeakHandler r0 = r8.q
            java.lang.Runnable r1 = r8.bn
            r0.post(r1)
            goto L_0x0ad9
        L_0x0acb:
            com.bytedance.android.live.gift.a.a r1 = r8.be
            boolean r0 = r1.a(r0)
            if (r0 != 0) goto L_0x0ad9
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
            goto L_0x0adf
        L_0x0ad9:
            return
        L_0x0ada:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE
            r0.onMessageFinish()
        L_0x0adf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.a(com.bytedance.android.livesdkapi.h.a):void");
    }

    public void onEvent(com.bytedance.android.livesdk.g.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f11424a, false, 5497, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f11424a, false, 5497, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE);
            return;
        }
        int i2 = cVar.f14632b;
        User user = (User) this.x.get("data_user_in_room");
        if (user != null) {
            user.setPayScores(user.getPayScores() + ((long) i2));
            user.setNeverRecharge(false);
        }
        this.x.lambda$put$1$DataCenter("data_user_in_room", user);
    }

    public void onEvent(u uVar) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{uVar}, this, f11424a, false, 5498, new Class[]{u.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uVar}, this, f11424a, false, 5498, new Class[]{u.class}, Void.TYPE);
        } else if (getView() != null) {
            if (uVar.f10200b) {
                this.n.setVisibility(0);
                this.n.setOnClickListener(new u(this));
                View view = this.j;
                if (b()) {
                    f2 = (float) (-uVar.f10199a);
                } else {
                    f2 = (float) (-(uVar.f10199a + ac.a(48.0f)));
                }
                view.setTranslationY(f2);
                this.q.post(new c(this));
                return;
            }
            this.n.setVisibility(8);
            this.j.setTranslationY(0.0f);
            this.q.post(new d(this));
        }
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5501, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11424a, false, 5501, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().k().a(z2 ? 1 : 0);
        if (this.s == null) {
            p();
            return;
        }
        if (this.s.getUserAttr() == null) {
            this.s.setUserAttr(new k());
        }
        this.s.getUserAttr().f7774c = z2;
        if (z2 && com.bytedance.android.live.uikit.a.a.f()) {
            o();
        }
    }

    public void onEvent(com.bytedance.android.livesdk.kickout.a.b bVar) {
        com.bytedance.android.livesdk.kickout.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f11424a, false, 5509, new Class[]{com.bytedance.android.livesdk.kickout.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f11424a, false, 5509, new Class[]{com.bytedance.android.livesdk.kickout.a.b.class}, Void.TYPE);
        } else if (bVar2.f15743a && bVar2.f15744b > 0 && this.E != null && bVar2.f15744b >= 0) {
            LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.E;
            long j2 = bVar2.f15744b;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, liveRoomUserInfoWidget, LiveRoomUserInfoWidget.f13402a, false, 7969, new Class[]{Long.TYPE}, Void.TYPE)) {
                LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = liveRoomUserInfoWidget;
                PatchProxy.accessDispatch(new Object[]{new Long(j2)}, liveRoomUserInfoWidget2, LiveRoomUserInfoWidget.f13402a, false, 7969, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            if (liveRoomUserInfoWidget.n != null) {
                liveRoomUserInfoWidget.n.a(j2);
            }
        }
    }

    public void onEvent(com.bytedance.android.livesdkapi.depend.b.c cVar) {
        com.bytedance.android.livesdkapi.depend.b.c cVar2 = cVar;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f11424a, false, 5510, new Class[]{com.bytedance.android.livesdkapi.depend.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f11424a, false, 5510, new Class[]{com.bytedance.android.livesdkapi.depend.b.c.class}, Void.TYPE);
        } else if (!this.f11426c) {
            boolean z3 = 1 == cVar2.f18620a;
            if (cVar2.f18620a != 0) {
                z2 = false;
            }
            if (z3) {
                q();
                return;
            }
            if (z2) {
                com.bytedance.android.live.uikit.d.a.a((Context) getActivity(), (int) C0906R.string.d8r);
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11424a, false, 5513, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11424a, false, 5513, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(new s(i2));
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.event.e eVar) {
        long id;
        com.bytedance.android.livesdk.chatroom.event.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f11424a, false, 5516, new Class[]{com.bytedance.android.livesdk.chatroom.event.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f11424a, false, 5516, new Class[]{com.bytedance.android.livesdk.chatroom.event.e.class}, Void.TYPE);
        } else if (this.f11426c) {
            ay ayVar = eVar2.f10167a;
            if (ayVar != null && ayVar.f16526b != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trace_id", ayVar.f16526b.f16529c);
                    i a2 = TTLiveSDKContext.getHostService().k().a();
                    com.bytedance.android.livesdk.j.f a3 = com.bytedance.android.livesdk.j.f.a((Context) getActivity());
                    if (a2 == null) {
                        id = 0;
                    } else {
                        id = a2.getId();
                    }
                    a3.a("click_specialroompush", "", id, this.f11425b.getId(), jSONObject);
                } catch (JSONException unused) {
                }
                if (this.aF != null) {
                    this.aF.a(ayVar.f16526b.f16532f, ayVar.f16526b.f16531e);
                }
            }
        }
    }

    public void onEvent(com.bytedance.android.livesdkapi.f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11424a, false, 5517, new Class[]{com.bytedance.android.livesdkapi.f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11424a, false, 5517, new Class[]{com.bytedance.android.livesdkapi.f.a.class}, Void.TYPE);
            return;
        }
        if (this.f11426c && aVar.f18759b == 3 && !b()) {
            this.x.lambda$put$1$DataCenter("cmd_clear_gift_message", new com.bytedance.android.livesdk.chatroom.model.g());
        }
    }

    public final boolean a(Runnable runnable, boolean z2) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5532, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{runnable2, Byte.valueOf(z2)}, this, f11424a, false, 5532, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        for (com.bytedance.android.livesdk.d.a a2 : this.v) {
            if (a2.a(runnable2, z2)) {
                return true;
            }
        }
        return false;
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.event.z zVar) {
        if (PatchProxy.isSupport(new Object[]{zVar}, this, f11424a, false, 5542, new Class[]{com.bytedance.android.livesdk.chatroom.event.z.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{zVar}, this, f11424a, false, 5542, new Class[]{com.bytedance.android.livesdk.chatroom.event.z.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(zVar.f10211a)) {
            int e2 = (int) ac.e((int) (((float) ac.c()) * 0.8f));
            this.z = ((com.bytedance.android.live.b.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.b.a.class)).webViewManager().a(com.bytedance.android.livesdk.browser.c.c.a(zVar.f10211a).a(e2).b((e2 * 4) / 3).d(5).e(17).a(true));
            if (getFragmentManager() != null) {
                this.z.show(getFragmentManager(), "PackagePurchase");
            }
        }
    }

    public final void a(boolean z2, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = charSequence2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), charSequence3, charSequence4}, this, f11424a, false, 5548, new Class[]{Boolean.TYPE, CharSequence.class, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), charSequence3, charSequence4}, this, f11424a, false, 5548, new Class[]{Boolean.TYPE, CharSequence.class, CharSequence.class}, Void.TYPE);
            return;
        }
        if (z2) {
            this.I.setVisibility(0);
            this.aW.setText(charSequence3);
            this.aX.setText(charSequence4);
            if (this.aH.h) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
                layoutParams2.addRule(11);
                layoutParams2.rightMargin = ac.d(C0906R.dimen.qh);
                layoutParams2.addRule(2, this.I.getId());
                layoutParams2.bottomMargin = ac.a(8.0f);
                this.m.setLayoutParams(layoutParams2);
            }
        } else {
            d(true);
            this.I.setVisibility(8);
        }
    }

    private void a(LiveWidget liveWidget, int i2) {
        LiveWidget liveWidget2 = liveWidget;
        if (PatchProxy.isSupport(new Object[]{liveWidget2, Integer.valueOf(i2)}, this, f11424a, false, 5552, new Class[]{LiveWidget.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{liveWidget2, Integer.valueOf(i2)}, this, f11424a, false, 5552, new Class[]{LiveWidget.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(liveWidget2 == null || liveWidget2.contentView == null)) {
            liveWidget2.contentView.setVisibility(i2);
        }
    }

    private boolean s() {
        if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        this.x.lambda$put$1$DataCenter("data_keyboard_status", Boolean.FALSE);
        this.k.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        this.x.lambda$put$1$DataCenter("data_keyboard_status", Boolean.TRUE);
        this.k.setVisibility(8);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5530, new Class[0], Void.TYPE);
        } else if (getContext() != null && this.S != a.PK) {
            this.T = this.S;
            this.S = a.PK;
            this.ac.setVisibility(4);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5536, new Class[0], Void.TYPE);
            return;
        }
        if (this.ao != null) {
            this.ao.f15724b = true;
            this.ao.b();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5538, new Class[0], Void.TYPE);
        } else if (this.f11426c && this.A != null) {
            this.x.lambda$put$1$DataCenter("cmd_stop_special_gift", Boolean.TRUE);
        }
    }

    public final boolean i_() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5495, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5495, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (c(true)) {
            return true;
        } else {
            a(8);
            return true;
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5482, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.ao != null) {
            this.ao.b();
        }
        this.f11429f = true;
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5483, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11424a, true, 5554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11424a, true, 5554, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("AbsInteractionFragment.java", AbsInteractionFragment.class);
        bq = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onCreate", "com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment", "android.os.Bundle", "savedInstanceState", "", "void"), 602);
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5447, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5447, new Class[0], Void.TYPE);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle != null) {
                this.M = bundle.getLong("live.intent.extra.ENTER_LIVE_TIME", 0);
            }
            this.U = arguments.getString("live.intent.extra.ENTER_LIVE_SOURCE", "");
        }
    }

    private boolean n() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5460, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5460, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.bytedance.android.live.uikit.a.a.c()) {
            return false;
        } else {
            Bundle arguments = getArguments();
            com.bytedance.android.livesdk.live.model.b bVar = (com.bytedance.android.livesdk.live.model.b) LiveSettingKeys.LIVE_SWITCH_TO_SQUARE_TAB.a();
            if (!(arguments == null || bVar == null)) {
                String string = arguments.getString("enter_live_from_page");
                if ((bVar.a() && TextUtils.equals(string, "enter_from_main_tab_follow")) || (bVar.b() && (TextUtils.equals(string, "enter_from_video_new_live") || TextUtils.equals(string, "enter_from_user_live_info")))) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5502, new Class[0], Void.TYPE);
            return;
        }
        new AlertDialog.Builder(getContext()).setMessage((CharSequence) getContext().getString(C0906R.string.dj6)).setPositiveButton((int) C0906R.string.d47, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11462a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11462a, false, 5578, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11462a, false, 5578, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5511, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5511, new Class[0], Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.d() && (!TTLiveSDKContext.getHostService().b().a().a()) && (this.Z == null || !this.Z.isShowing())) {
            new ej(getActivity(), new ej.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11464a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f11464a, false, 5580, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11464a, false, 5580, new Class[0], Void.TYPE);
                        return;
                    }
                    TTLiveSDKContext.getHostService().b().a().a(true);
                }

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f11464a, false, 5581, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11464a, false, 5581, new Class[0], Void.TYPE);
                        return;
                    }
                    AbsInteractionFragment.this.a(8);
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f11464a, false, 5579, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11464a, false, 5579, new Class[0], Void.TYPE);
                        return;
                    }
                    TTLiveSDKContext.getHostService().a();
                    TTLiveSDKContext.getHostService().i().a(AbsInteractionFragment.this.getContext(), (String) null.first);
                }
            }).show();
        }
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5526, new Class[0], Void.TYPE);
        } else if (getView() != null && this.f11426c && getContext() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams.width = ac.d(C0906R.dimen.qk);
            layoutParams.height = ac.d(C0906R.dimen.qj);
            this.m.setLayoutParams(layoutParams);
            if (this.bf) {
                FrameLayout frameLayout = (FrameLayout) getView().findViewById(C0906R.id.bmr);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                a(layoutParams2);
                frameLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5457, new Class[0], Void.TYPE);
            return;
        }
        this.v.add(new o(this));
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5458, new Class[0], Void.TYPE);
            return;
        }
        if (n()) {
            Bundle arguments = getArguments();
            com.bytedance.android.livesdk.live.model.b bVar = (com.bytedance.android.livesdk.live.model.b) LiveSettingKeys.LIVE_SWITCH_TO_SQUARE_TAB.a();
            if (bVar.f15862e == 2) {
                this.v.add(0, new p(this, arguments, bVar));
            }
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5539, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null) {
            this.D.d();
        }
        if (this.ag != null) {
            this.ag.dismissAllowingStateLoss();
        }
        if (getActivity() != null) {
            Fragment findFragmentByTag = getActivity().getSupportFragmentManager().findFragmentByTag(WebDialogFragment.class.getCanonicalName());
            if (findFragmentByTag instanceof DialogFragment) {
                ((DialogFragment) findFragmentByTag).dismissAllowingStateLoss();
            }
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5490, new Class[0], Void.TYPE);
            return;
        }
        if (com.bytedance.android.livesdk.utils.ab.a() != null) {
            com.bytedance.android.livesdk.utils.ab.a().stopMessage(true);
        }
        com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE.stop();
        this.p.clear();
        this.x.removeObserver(this);
        this.f11426c = false;
        if (this.be != null) {
            this.be.d();
        }
        this.q.removeMessages(100);
        super.onDestroyView();
        this.bm = null;
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5504, new Class[0], Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("target_uid", String.valueOf(TTLiveSDKContext.getHostService().k().b()));
        hashMap.put("sec_target_uid", TTLiveSDKContext.getHostService().k().a().getSecUid());
        hashMap.put("packed_level", PushConstants.PUSH_TYPE_UPLOAD_LOG);
        hashMap.put("request_from", "admin");
        hashMap.put("current_room_id", String.valueOf(this.f11425b.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f11425b.getOwner().getId()));
        hashMap.put("sec_anchor_id", TTLiveSDKContext.getHostService().k().a(this.f11425b.getOwner().getId()));
        TTLiveSDKContext.getHostService().k().a(hashMap).subscribe(this.bb);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5459, new Class[0], Void.TYPE);
        } else if (n()) {
            Bundle arguments = getArguments();
            com.bytedance.android.livesdk.live.model.b bVar = (com.bytedance.android.livesdk.live.model.b) LiveSettingKeys.LIVE_SWITCH_TO_SQUARE_TAB.a();
            if (bVar.f15862e == 1) {
                int elapsedRealtime = (int) ((SystemClock.elapsedRealtime() - this.M) / 1000);
                if (arguments.getInt("current_room_position", 0) >= bVar.f15859b || (this.M > 0 && elapsedRealtime >= bVar.f15858a)) {
                    String str = bVar.f15863f;
                    if (TextUtils.isEmpty(str)) {
                        str = ac.a((int) C0906R.string.dca);
                    }
                    TTLiveSDKContext.getHostService().i().a(com.bytedance.android.livesdk.live.model.b.a(bVar.f15860c), bVar.f15861d);
                    Observable.just(str).delay(1000, TimeUnit.MILLISECONDS).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new Consumer<String>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f11454a;

                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            String str = (String) obj;
                            if (PatchProxy.isSupport(new Object[]{str}, this, f11454a, false, 5600, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str}, this, f11454a, false, 5600, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            if (!AbsInteractionFragment.this.L) {
                                AbsInteractionFragment.this.L = true;
                                com.bytedance.android.live.uikit.d.a.a(ac.e(), str);
                                com.bytedance.android.livesdk.j.a.a().a("livesdk_toast_show", Room.class);
                            }
                        }
                    }, com.bytedance.android.live.core.rxutils.i.b());
                }
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5491, new Class[0], Void.TYPE);
            return;
        }
        this.u = false;
        if (this.X != null) {
            this.X.stop();
        }
        h();
        this.bp = null;
        if (this.am != null) {
            bj bjVar = this.am;
            if (PatchProxy.isSupport(new Object[0], bjVar, bj.f11292a, false, 5283, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bjVar, bj.f11292a, false, 5283, new Class[0], Void.TYPE);
            } else {
                if (com.bytedance.android.livesdk.utils.ab.a() != null) {
                    com.bytedance.android.livesdk.utils.ab.a().removeMessageListener(bjVar);
                }
                bjVar.f11293b = null;
            }
        }
        if (this.aq != null && this.aq.isShowing()) {
            this.aq.dismiss();
        }
        if (this.ar != null && this.ar.isShowing()) {
            this.ar.dismiss();
        }
        b(false);
        if (this.al != null) {
            com.bytedance.android.livesdk.chatroom.presenter.e eVar = this.al;
            if (PatchProxy.isSupport(new Object[0], eVar, com.bytedance.android.livesdk.chatroom.presenter.e.f11345a, false, 5152, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar, com.bytedance.android.livesdk.chatroom.presenter.e.f11345a, false, 5152, new Class[0], Void.TYPE);
            } else {
                eVar.f11348d.removeMessageListener(eVar);
                eVar.f11346b = null;
            }
        }
        if (this.an != null) {
            this.an.d();
        }
        this.q.removeCallbacksAndMessages(null);
        if (this.bd != null && this.bd.isShowing()) {
            this.bd.dismiss();
        }
        if (this.aZ != null) {
            this.aZ.d();
        }
        super.onDestroy();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5480, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5480, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.ao != null) {
            this.ao.a();
        }
        if (this.f11428e) {
            a(3);
            this.f11428e = false;
        }
        this.f11429f = false;
        if (com.bytedance.android.live.uikit.a.a.d() && NetworkUtils.isMobile(getActivity()) && !this.f11427d) {
            q();
        }
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5481, new Class[0], Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.h() && this.f11427d && getDialog() != null) {
            Window window = getDialog().getWindow();
            if (!(window == null || Build.VERSION.SDK_INT < 21 || window.getStatusBarColor() == -16777216)) {
                window.setStatusBarColor(-16777216);
            }
        }
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5456, new Class[0], Void.TYPE);
            return;
        }
        if (this.bm != null) {
            this.k.post(this.bm);
            this.bm = null;
        }
        e();
        IMessageManager a2 = com.bytedance.android.livesdk.utils.ab.a();
        if (a2 != null) {
            a2.startMessage();
        }
        if (this.f11425b.getOwner() != null && !this.ah) {
            this.ah = true;
        }
        long j2 = 0;
        if (this.f11427d) {
            if (this.f11425b.getId() != ((Long) com.bytedance.android.livesdk.w.b.u.a()).longValue() || ((Long) com.bytedance.android.livesdk.w.b.v.a()).longValue() <= 0) {
                j2 = SystemClock.elapsedRealtime();
                com.bytedance.android.livesdk.w.b.u.a(Long.valueOf(this.f11425b.getId()));
                com.bytedance.android.livesdk.w.b.v.a(Long.valueOf(j2));
            } else {
                j2 = ((Long) com.bytedance.android.livesdk.w.b.v.a()).longValue();
            }
        }
        if (!this.f11427d || com.bytedance.android.live.uikit.a.a.a()) {
            this.X.stop();
            c(8);
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            UIUtils.setViewVisibility(this.X, 8);
        } else if (com.bytedance.android.livesdkapi.a.a.f18614b) {
            View view = getView();
            if (view != null) {
                View findViewById = view.findViewById(C0906R.id.bd4);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
            }
        } else {
            this.X.setBase(j2);
            c(0);
            this.X.start();
        }
        this.r = new GestureDetector(getContext(), new c(this, (byte) 0));
        this.ai.a(this.bo);
        this.al = new com.bytedance.android.livesdk.chatroom.presenter.e(this.x);
        com.bytedance.android.livesdk.chatroom.presenter.e eVar = this.al;
        if (PatchProxy.isSupport(new Object[]{this}, eVar, com.bytedance.android.livesdk.chatroom.presenter.e.f11345a, false, 5150, new Class[]{com.bytedance.android.livesdk.chatroom.view.a.class}, Void.TYPE)) {
            com.bytedance.android.livesdk.chatroom.presenter.e eVar2 = eVar;
            PatchProxy.accessDispatch(new Object[]{this}, eVar2, com.bytedance.android.livesdk.chatroom.presenter.e.f11345a, false, 5150, new Class[]{com.bytedance.android.livesdk.chatroom.view.a.class}, Void.TYPE);
        } else {
            eVar.f11346b = this;
            eVar.f11348d = (IMessageManager) eVar.f11347c.get("data_message_manager");
            eVar.f11348d.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.CONTROL.getIntType(), eVar);
        }
        this.am = new bj();
        bj bjVar = this.am;
        if (PatchProxy.isSupport(new Object[]{this}, bjVar, bj.f11292a, false, 5281, new Class[]{com.bytedance.android.livesdk.chatroom.view.b.class}, Void.TYPE)) {
            bj bjVar2 = bjVar;
            PatchProxy.accessDispatch(new Object[]{this}, bjVar2, bj.f11292a, false, 5281, new Class[]{com.bytedance.android.livesdk.chatroom.view.b.class}, Void.TYPE);
        } else {
            bjVar.f11293b = this;
            IMessageManager a3 = com.bytedance.android.livesdk.utils.ab.a();
            if (a3 != null) {
                a3.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.MEMBER.getIntType(), bjVar);
                if (!com.bytedance.android.livesdkapi.a.a.f18615c) {
                    a3.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ROOM_NOTIFY.getIntType(), bjVar);
                }
                a3.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.REMIND.getIntType(), bjVar);
                a3.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.COMMON_TOAST.getIntType(), bjVar);
                a3.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.FOLLOW_GUIDE.getIntType(), bjVar);
                a3.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.GUIDE_MESSAGE.getIntType(), bjVar);
                if (com.bytedance.android.live.uikit.a.a.a()) {
                    a3.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DOU_PLUS_MESSAGE.getIntType(), bjVar);
                }
            }
        }
        this.an = new bv(this.x);
        this.an.a(this);
        this.be = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getGiftGuidePresenter(this.x);
        this.be.a(this);
        com.bytedance.android.livesdk.chatroom.bl.d.INSTANCE.start(this);
        if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5473, new Class[0], Void.TYPE);
        } else if (!(this.f11425b == null || this.f11425b.getOwner() == null || this.ah)) {
            this.ah = true;
        }
        if (TTLiveSDKContext.getHostService().k().c()) {
            p();
        }
        if (((Boolean) LiveSettingKeys.VIGO_FLAME_DIAMOND_GUIDE_SWITCH.a()).booleanValue() && this.f11427d && com.bytedance.android.livesdkapi.a.a.f18616d) {
            if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5476, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5476, new Class[0], Void.TYPE);
            } else {
                View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aol, null);
                ((TextView) inflate.findViewById(C0906R.id.da3)).setText(C0906R.string.d8y);
                ((TextView) inflate.findViewById(C0906R.id.da1)).setText(C0906R.string.d8z);
                Toast toast = new Toast(getContext());
                toast.setView(inflate);
                toast.setDuration(1);
                toast.setGravity(49, 0, ac.a(72.0f));
                if (PatchProxy.isSupport(new Object[]{toast}, null, af.f11817a, true, 5639, new Class[]{Toast.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{toast}, null, af.f11817a, true, 5639, new Class[]{Toast.class}, Void.TYPE);
                } else {
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(toast);
                    }
                    toast.show();
                }
            }
        }
        if (com.bytedance.android.live.uikit.a.a.d()) {
            if (PatchProxy.isSupport(new Object[0], this, f11424a, false, 5477, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11424a, false, 5477, new Class[0], Void.TYPE);
            } else if (!this.f11427d && !com.bytedance.android.livesdkapi.a.a.f18614b) {
                this.p.add(((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).checkAnchorMemorial(this.f11425b.getOwner().getId()).subscribeOn(Schedulers.io()).flatMap(q.f12294b).flatMap(new r(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(s.f12298b, t.f12300b));
            }
        }
        if (this.f11425b != null && this.f11425b.getStatus() == 3 && !this.f11427d) {
            com.bytedance.android.livesdk.message.model.j a4 = com.bytedance.android.livesdk.chatroom.bl.c.a(this.f11425b.getId(), false);
            if (com.bytedance.android.livesdk.utils.ab.a() != null) {
                com.bytedance.android.livesdk.utils.ab.a().insertMessage(a4, true);
            }
        }
        if (this.f11425b != null && !this.f11427d && com.bytedance.android.live.uikit.a.a.d() && ((Integer) LiveConfigSettingKeys.DUTY_GIFT_REQUEST_STOP.a()).intValue() == 0) {
            this.aZ = new com.bytedance.android.livesdk.chatroom.dutygift.f(this.f11425b, this.x);
            this.aZ.a((f.a) this);
        }
        a(((long) ((Integer) com.bytedance.android.livesdk.config.a.C.a()).intValue()) * 1000);
    }

    private void a(s sVar) {
        s sVar2 = sVar;
        if (PatchProxy.isSupport(new Object[]{sVar2}, this, f11424a, false, 5514, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar2}, this, f11424a, false, 5514, new Class[]{s.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) sVar2);
    }

    public void onEvent(v vVar) {
        v vVar2 = vVar;
        if (PatchProxy.isSupport(new Object[]{vVar2}, this, f11424a, false, 5506, new Class[]{v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVar2}, this, f11424a, false, 5506, new Class[]{v.class}, Void.TYPE);
            return;
        }
        this.x.lambda$put$1$DataCenter("data_login_event", vVar2);
    }

    private HashMap<String, String> a(HashMap<String, String> hashMap) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f11424a, false, 5467, new Class[]{HashMap.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{hashMap}, this, f11424a, false, 5467, new Class[]{HashMap.class}, HashMap.class);
        }
        if (this.f11425b != null) {
            j2 = this.f11425b.getId();
        } else {
            j2 = 0;
        }
        hashMap.put("room_id", String.valueOf(j2));
        return hashMap;
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11424a, false, 5529, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11424a, false, 5529, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x.lambda$put$1$DataCenter("cmd_update_sticker_position", new ah(i2));
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11424a, false, 5545, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11424a, false, 5545, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != 0) {
            this.X.setVisibility(i2);
        } else if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.f()) {
            this.X.setVisibility(8);
        } else {
            this.X.setVisibility(0);
        }
    }

    private void g(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5503, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11424a, false, 5503, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.s == null) {
            p();
        } else {
            if (this.s.getUserAttr() == null) {
                this.s.setUserAttr(new k());
            }
            this.s.getUserAttr().f7773b = z2;
        }
    }

    private void h(boolean z2) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5551, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11424a, false, 5551, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        LiveToolbarWidget liveToolbarWidget = this.ay;
        int i4 = 8;
        if (z2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        a((LiveWidget) liveToolbarWidget, i2);
        CommentWidget commentWidget = this.D;
        if (z2) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        a((LiveWidget) commentWidget, i3);
        DutyGiftToolbarWidget dutyGiftToolbarWidget = this.az;
        if (z2) {
            i4 = 0;
        }
        a((LiveWidget) dutyGiftToolbarWidget, i4);
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5553, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11424a, false, 5553, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.e() && !this.f11427d) {
            getActivity();
        }
    }

    public void onEvent(ae aeVar) {
        if (PatchProxy.isSupport(new Object[]{aeVar}, this, f11424a, false, 5508, new Class[]{ae.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aeVar}, this, f11424a, false, 5508, new Class[]{ae.class}, Void.TYPE);
        } else if (this.w != null && (aeVar.f10138b == 2 || SystemClock.elapsedRealtime() - this.w.o <= ((long) ((Integer) com.bytedance.android.livesdk.config.a.C.a()).intValue()) * 1000)) {
            this.u = aeVar.f10137a;
        }
    }

    public final void d(DutyGiftInfo dutyGiftInfo) {
        if (PatchProxy.isSupport(new Object[]{dutyGiftInfo}, this, f11424a, false, 5550, new Class[]{DutyGiftInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dutyGiftInfo}, this, f11424a, false, 5550, new Class[]{DutyGiftInfo.class}, Void.TYPE);
            return;
        }
        if (dutyGiftInfo != null) {
            if (dutyGiftInfo.isStarted()) {
                com.bytedance.android.livesdk.gift.model.b findGiftById = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(dutyGiftInfo.getGiftId());
                if (findGiftById != null) {
                    com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.i(findGiftById, 1, true));
                }
            } else if (dutyGiftInfo.isFinished()) {
                com.bytedance.android.livesdk.gift.model.b fastGift = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getFastGift();
                if (fastGift != null) {
                    com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.i(fastGift, 1));
                }
            }
        }
    }

    public final void e(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5543, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11424a, false, 5543, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            i2 = 4;
        }
        d(C0906R.id.d64, i2);
        d(C0906R.id.c6i, i2);
        d(C0906R.id.c87, i2);
        d(C0906R.id.a28, i2);
        d(C0906R.id.byd, i2);
        d(C0906R.id.ac1, i2);
        d(C0906R.id.aow, i2);
        c(i2);
        this.k.setVisibility(i2);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            d(C0906R.id.n9, i2);
            d(C0906R.id.dy_, i2);
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f11424a, false, 5515, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f11424a, false, 5515, new Class[]{Message.class}, Void.TYPE);
        } else if (this.f11426c) {
            if (message.obj instanceof com.bytedance.android.live.a.a.b.a) {
                a((Throwable) (Exception) message.obj);
            } else if (message.obj instanceof Exception) {
                Object obj = message.obj;
            } else if (message.what == 100) {
                com.bytedance.android.livesdk.sticker.b.a aVar = (com.bytedance.android.livesdk.sticker.b.a) message.obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f11424a, false, 5466, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f11424a, false, 5466, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("sticker_id", String.valueOf(aVar.f17252d));
                    com.bytedance.android.livesdk.j.a.a().a("live_take_sticker_effective_use", a(hashMap), new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_detail"));
                }
                this.x.lambda$put$1$DataCenter("data_has_sticker_effective", Boolean.TRUE);
            } else {
                if (message.what == 200) {
                    com.bytedance.android.livesdk.u.a.a().a((Object) new ae(true, 2));
                }
            }
        }
    }

    public void onEvent(com.bytedance.android.livesdk.browser.jsbridge.a.c cVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        com.bytedance.android.livesdk.browser.jsbridge.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f11424a, false, 5485, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f11424a, false, 5485, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.c.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(cVar2.f9424a)) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            int i6 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
            int i7 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
            if (b()) {
                if (cVar2.f9425b > 0) {
                    i5 = cVar2.f9425b;
                } else {
                    i5 = i7 / 2;
                }
                i2 = i5;
                i3 = i6;
            } else {
                i3 = i7;
                i2 = i3;
            }
            String str = cVar2.f9424a;
            if (b()) {
                i4 = 80;
            } else {
                i4 = 8388613;
            }
            aa aaVar = new aa(str, "", i4, i3, i2, 0);
            onEvent(aaVar);
        }
    }

    private void a(RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f11424a, false, 5527, new Class[]{RelativeLayout.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f11424a, false, 5527, new Class[]{RelativeLayout.LayoutParams.class}, Void.TYPE);
            return;
        }
        if (this.bf && b()) {
            layoutParams2.width = -1;
            layoutParams2.rightMargin = ac.d(C0906R.dimen.q_);
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f11424a, false, 5541, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f11424a, false, 5541, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.aM != null) {
            this.aM.a(f2);
        }
    }

    public final void c(DutyGiftInfo dutyGiftInfo) {
        if (PatchProxy.isSupport(new Object[]{dutyGiftInfo}, this, f11424a, false, 5549, new Class[]{DutyGiftInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dutyGiftInfo}, this, f11424a, false, 5549, new Class[]{DutyGiftInfo.class}, Void.TYPE);
            return;
        }
        if (dutyGiftInfo != null && (dutyGiftInfo.isStarted() || dutyGiftInfo.isPlaying())) {
            com.bytedance.android.livesdk.gift.model.b findGiftById = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(dutyGiftInfo.getGiftId());
            if (findGiftById != null) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.i(findGiftById, 1, true));
            }
        }
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5525, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11424a, false, 5525, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
        if (z2) {
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = ac.d(C0906R.dimen.qf);
            layoutParams2.addRule(11);
            layoutParams2.rightMargin = ac.d(C0906R.dimen.qh);
        } else {
            layoutParams2.addRule(10);
            layoutParams2.topMargin = ac.d(C0906R.dimen.qi);
            layoutParams2.addRule(9);
            layoutParams2.leftMargin = ac.d(C0906R.dimen.qg);
        }
        this.m.setLayoutParams(layoutParams2);
    }

    public void onCreate(@Nullable Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11424a, false, 5448, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11424a, false, 5448, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        org.aspectj.lang.a a2 = org.aspectj.a.a.b.a(bq, this, this, bundle);
        try {
            super.onCreate(null);
            setStyle(1, C0906R.style.vt);
            setCancelable(false);
            a(com.bytedance.android.livesdk.chatroom.event.e.class);
            a(com.bytedance.android.livesdkapi.f.a.class);
            a(s.class);
            a(u.class);
            a(v.class);
            a(com.bytedance.android.livesdkapi.depend.b.c.class);
            a(com.bytedance.android.livesdk.chatroom.event.z.class);
            a(com.bytedance.android.livesdk.browser.jsbridge.a.d.class);
            a(aa.class);
            a(com.bytedance.android.livesdk.g.c.class);
            a(ae.class);
            a(com.bytedance.android.livesdk.kickout.a.b.class);
            a(UserProfileEvent.class);
            a(com.bytedance.android.livesdk.browser.jsbridge.a.c.class);
            a(x.class);
            com.bytedance.android.livesdk.app.dataholder.e.a().a((Integer) 0);
            if (this.t == null) {
                this.t = com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO;
            }
            if (TTLiveSDKContext.getHostService() != null) {
                this.G = TTLiveSDKContext.getHostService().k();
            }
            m();
            this.bg = getContext().getResources().getDimensionPixelSize(C0906R.dimen.p3);
            this.bh = getContext().getResources().getDimensionPixelSize(C0906R.dimen.p4);
            this.bi = (int) getContext().getResources().getDimension(C0906R.dimen.pr);
            this.bj = (int) getContext().getResources().getDimension(C0906R.dimen.pq);
            if (this.x != null) {
                this.x.lambda$put$1$DataCenter("log_enter_live_source", this.U);
                if (com.ss.android.ugc.aweme.q.c.a(getActivity(), "feed_live_span", 0).getInt("span_count", 0) > 1) {
                    str = "live_small_picture";
                } else {
                    str = "live_big_picture";
                }
                this.x.lambda$put$1$DataCenter("log_live_feed_layout", str);
                this.x.lambda$put$1$DataCenter("log_streaming_type", this.t.logStreamingType);
            }
            com.bytedance.android.livesdk.utils.a.a.a(getContext());
        } finally {
            com.bytedance.android.livesdk.a.a.a().b(a2);
        }
    }

    public void onEvent(com.bytedance.android.livesdk.browser.jsbridge.a.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f11424a, false, 5546, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f11424a, false, 5546, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.d.class}, Void.TYPE);
        } else if (this.at == null || !this.at.isShowing()) {
            this.at = new com.bytedance.android.livesdk.wallet.g(getActivity(), "live_detail");
            HashMap hashMap = new HashMap();
            hashMap.put("request_id", this.f11425b.getRequestId());
            hashMap.put("room_id", String.valueOf(this.f11425b.getId()));
            this.at.k = hashMap;
            JSONObject jSONObject = dVar.f9427b;
            try {
                jSONObject.put("anchor_id", this.f11425b.getOwner().getId());
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("AbsInteractionFragment", (Throwable) e2);
            }
            ad a2 = new com.bytedance.android.livesdk.wallet.ac(jSONObject).a();
            if (a2 != null) {
                this.at.a(a2);
                this.at.j = new g.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11472a;

                    public final void a(Dialog dialog, ad adVar) {
                        if (PatchProxy.isSupport(new Object[]{dialog, adVar}, this, f11472a, false, 5585, new Class[]{Dialog.class, ad.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialog, adVar}, this, f11472a, false, 5585, new Class[]{Dialog.class, ad.class}, Void.TYPE);
                            return;
                        }
                        if (adVar != null) {
                            switch (adVar.b()) {
                                case 10001:
                                    ai.a((int) C0906R.string.dgd);
                                    if (AbsInteractionFragment.this.z != null) {
                                        AbsInteractionFragment.this.z.dismissAllowingStateLoss();
                                    }
                                    if (AbsInteractionFragment.this.x != null) {
                                        AbsInteractionFragment.this.x.lambda$put$1$DataCenter("cmd_purchase_success", "");
                                        return;
                                    }
                                    break;
                                case 10002:
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("status", "success");
                                        jSONObject.put("code", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                    } catch (Exception e2) {
                                        com.bytedance.android.live.core.c.a.a("AbsInteractionFragment", (Throwable) e2);
                                    }
                                    j.q().f().a("H5_payStatus", jSONObject);
                                    break;
                            }
                        }
                    }
                };
                if (this.at.a(dVar.f9426a)) {
                    this.at.show();
                }
            }
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5479, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11424a, false, 5479, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z2) {
            if (this.as != null && this.as.isShowing()) {
                this.as.dismiss();
            }
            this.as = null;
        } else if (this.as == null || !this.as.isShowing()) {
            if (this.as == null) {
                this.as = new en(getActivity(), b(), this.f11425b, this.U);
            }
            this.as.f12176f = this.x;
            this.as.show();
            com.bytedance.android.livesdk.j.a.a().a("follow_popup_show", com.bytedance.android.livesdk.j.c.j.class, Room.class);
        }
    }

    public final boolean c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11424a, false, 5496, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11424a, false, 5496, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        com.bytedance.android.livesdk.sticker.c cVar = (com.bytedance.android.livesdk.sticker.c) j.q().k().a(com.bytedance.android.livesdk.sticker.c.class);
        if (cVar == null || !cVar.b()) {
            return false;
        }
        if (z2) {
            cVar.a();
        }
        return true;
    }

    public void onEvent(UserProfileEvent userProfileEvent) {
        long j2;
        boolean z2;
        boolean z3;
        String str;
        UserProfileEvent userProfileEvent2 = userProfileEvent;
        if (PatchProxy.isSupport(new Object[]{userProfileEvent2}, this, f11424a, false, 5505, new Class[]{UserProfileEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userProfileEvent2}, this, f11424a, false, 5505, new Class[]{UserProfileEvent.class}, Void.TYPE);
        } else if ((this.aq == null || !this.aq.isShowing()) && getActivity() != null) {
            if (userProfileEvent2.user != null) {
                j2 = userProfileEvent2.user.getId();
                this.aq = LiveProfileDialogV2.a(getActivity(), b(), userProfileEvent2.user.getId(), this.f11425b, this.s, userProfileEvent2.mSource);
            } else {
                j2 = userProfileEvent2.userId;
                this.aq = LiveProfileDialogV2.a(getActivity(), b(), userProfileEvent2.userId, this.f11425b, this.s, userProfileEvent2.mSource);
            }
            this.aq.a(userProfileEvent2.interactLogLabel);
            this.aq.b(this.U);
            this.aq.A = this.x;
            this.aq.show(getFragmentManager(), LiveProfileDialogV2.f11658b);
            if (Room.isValid(this.f11425b)) {
                User user = (User) this.x.get("data_user_in_room");
                long id = this.f11425b.getOwner().getId();
                if (user == null || user.getId() == 0 || user.getId() != id) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (j2 == 0 || j2 != id) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z2) {
                    if (z3) {
                        str = "anchor_c_anchor";
                    } else {
                        str = "anchor_c_audience";
                    }
                } else if (z3) {
                    str = "audience_c_anchor";
                } else {
                    str = "audience_c_audience";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("click_type", str);
                hashMap.put("request_page", str);
                hashMap.put("to_user_id", String.valueOf(j2));
                if (!TextUtils.isEmpty(userProfileEvent2.mEventModule)) {
                    hashMap.put("event_module", userProfileEvent2.mEventModule);
                }
                if (!TextUtils.isEmpty(userProfileEvent2.mClickUserPosition)) {
                    hashMap.put("click_user_position", userProfileEvent2.mClickUserPosition);
                }
                com.bytedance.android.livesdk.j.a.a().a("livesdk_live_click_user", hashMap, Room.class, new com.bytedance.android.livesdk.j.c.j().a("live_detail").b("live_interact"), new com.bytedance.android.livesdk.j.c.k());
            }
        }
    }

    private void a(af afVar) {
        if (PatchProxy.isSupport(new Object[]{afVar}, this, f11424a, false, 5528, new Class[]{af.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{afVar}, this, f11424a, false, 5528, new Class[]{af.class}, Void.TYPE);
        } else if (getView() != null && this.f11426c && getContext() != null) {
            if (getActivity().getRequestedOrientation() == 1) {
                ViewGroup viewGroup = (ViewGroup) getView().findViewById(C0906R.id.a_e);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.bottomMargin = afVar.f16444a;
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
            this.aU = afVar.f16444a;
            View findViewById = ((ViewGroup) getView().findViewById(C0906R.id.a_e)).findViewById(C0906R.id.a_a);
            if (findViewById != null && (findViewById instanceof EnterAnimationView)) {
                ((EnterAnimationView) findViewById).setChildMarginBottom(afVar.f16444a);
            }
        }
    }

    public void onEvent(aa aaVar) {
        String str;
        String str2;
        aa aaVar2 = aaVar;
        if (PatchProxy.isSupport(new Object[]{aaVar2}, this, f11424a, false, 5486, new Class[]{aa.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aaVar2}, this, f11424a, false, 5486, new Class[]{aa.class}, Void.TYPE);
        } else if (aaVar2 != null && !TextUtils.isEmpty(aaVar2.f10127a)) {
            int i2 = aaVar2.f10130d;
            if (i2 <= 0) {
                if (b()) {
                    i2 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
                } else {
                    i2 = 240;
                }
            }
            int i3 = aaVar2.f10131e;
            if (i3 <= 0) {
                if (b()) {
                    i3 = 400;
                } else {
                    i3 = 320;
                }
            }
            String str3 = "";
            String str4 = "";
            String str5 = "";
            String str6 = "";
            String str7 = "";
            com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class);
            if (a2 != null && (a2 instanceof com.bytedance.android.livesdk.j.b.k)) {
                com.bytedance.android.livesdk.j.b.k kVar = (com.bytedance.android.livesdk.j.b.k) a2;
                if (kVar.a().containsKey("enter_from")) {
                    str3 = (String) kVar.a().get("enter_from");
                }
                if (kVar.a().containsKey("source")) {
                    str4 = (String) kVar.a().get("source");
                }
            }
            com.bytedance.android.livesdk.j.b.g a3 = com.bytedance.android.livesdk.j.a.a().a(Room.class);
            if (a3 != null && (a3 instanceof n)) {
                n nVar = (n) a3;
                if (nVar.a().containsKey("anchor_id")) {
                    str5 = (String) nVar.a().get("anchor_id");
                }
                if (nVar.a().containsKey("log_pb")) {
                    str6 = (String) nVar.a().get("log_pb");
                }
                if (nVar.a().containsKey("request_id")) {
                    str7 = (String) nVar.a().get("request_id");
                }
            }
            if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.live.core.b.a.f7826a, true, 190, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.live.core.b.a.f7826a, true, 190, new Class[0], String.class);
            } else {
                str = com.bytedance.android.live.core.b.a.a(ac.e()).getLanguage();
            }
            com.ss.android.common.util.i iVar = new com.ss.android.common.util.i(aaVar2.f10127a);
            iVar.a("language", str);
            iVar.a("enter_from", str3);
            iVar.a("source_v3", str4);
            iVar.a("anchor_id", str5);
            iVar.a("log_pb", str6);
            iVar.a("request_id", str7);
            if (this.f11427d) {
                str2 = "live_take_detail";
            } else {
                str2 = "live_detail";
            }
            iVar.a("event_page", str2);
            iVar.a("event_belong", "live_interact");
            com.bytedance.android.livesdk.browser.c.b f2 = j.q().f();
            b.C0073b e2 = com.bytedance.android.livesdk.browser.c.c.a(iVar.a()).a(i2).b(i3).d(aaVar2.f10132f).c(aaVar2.g).e(aaVar2.f10129c);
            e2.k = aaVar2.i;
            this.ag = f2.a(e2.a(aaVar2.f10128b).a(aaVar2.h));
            BaseDialogFragment.a(getActivity(), this.ag);
        }
    }

    private void d(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11424a, false, 5544, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11424a, false, 5544, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            View findViewById = this.j.findViewById(i2);
            if (findViewById != null) {
                findViewById.setVisibility(i3);
            }
        }
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f11424a, false, 5450, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f11424a, false, 5450, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f11426c = true;
        if (!com.bytedance.android.live.uikit.a.a.f()) {
            view2.setFitsSystemWindows(true);
        }
        a(view);
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11424a, false, 5521, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11424a, false, 5521, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (getView() != null && this.f11426c && getContext() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(C0906R.id.bmr);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i3;
            a(layoutParams);
            viewGroup.setLayoutParams(layoutParams);
            c(layoutParams.height, layoutParams.bottomMargin);
            b(layoutParams.height + layoutParams.bottomMargin);
        }
    }

    private void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11424a, false, 5522, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11424a, false, 5522, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (getView() != null && this.f11426c && getContext() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(C0906R.id.bmr);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            if (i2 >= 0) {
                layoutParams.height = i2;
            }
            if (i3 >= 0) {
                layoutParams.rightMargin = i3;
            }
            a(layoutParams);
            viewGroup.setLayoutParams(layoutParams);
            c(layoutParams.height, layoutParams.bottomMargin);
            b(layoutParams.height + layoutParams.bottomMargin);
        }
    }

    private void c(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11424a, false, 5523, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11424a, false, 5523, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        af afVar = new af();
        int i4 = i2 + i3;
        afVar.f16444a = ((int) getContext().getResources().getDimension(C0906R.dimen.nz)) + i4;
        this.x.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(afVar.f16444a));
        af afVar2 = new af();
        afVar2.f16444a = i4;
        a(afVar2);
    }

    static final /* synthetic */ void a(Runnable runnable, Map map, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        runnable.run();
        map.put("button_type", "cancel");
        com.bytedance.android.livesdk.j.a.a().a("livesdk_popup_click", map, Room.class);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f11424a, false, 5472, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f11424a, false, 5472, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (this.aD != null) {
            int i4 = i2;
            int i5 = i3;
            this.aD.onActivityResult(i2, i3, intent2);
        }
    }

    static final /* synthetic */ void a(com.bytedance.android.livesdk.live.model.b bVar, Runnable runnable, Map map, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        TTLiveSDKContext.getHostService().i().a(com.bytedance.android.livesdk.live.model.b.a(bVar.f15860c), bVar.f15861d);
        runnable.run();
        map.put("button_type", "live");
        com.bytedance.android.livesdk.j.a.a().a("livesdk_popup_click", map, Room.class);
    }
}
