package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.rxutils.autodispose.aa;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer;
import com.bytedance.android.livesdk.chatroom.detail.b;
import com.bytedance.android.livesdk.chatroom.detail.e;
import com.bytedance.android.livesdk.chatroom.detail.f;
import com.bytedance.android.livesdk.chatroom.detail.g;
import com.bytedance.android.livesdk.chatroom.detail.j;
import com.bytedance.android.livesdk.chatroom.end.LiveAudienceEndFragment;
import com.bytedance.android.livesdk.chatroom.event.ai;
import com.bytedance.android.livesdk.chatroom.event.l;
import com.bytedance.android.livesdk.chatroom.event.o;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.event.w;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget;
import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkInRoomAudioWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.bg;
import com.bytedance.android.livesdk.chatroom.viewmodule.bh;
import com.bytedance.android.livesdk.chatroom.viewmodule.bi;
import com.bytedance.android.livesdk.chatroom.viewmodule.bj;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.j.b.k;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.j.d;
import com.bytedance.android.livesdk.message.model.ax;
import com.bytedance.android.livesdk.utils.ab;
import com.bytedance.android.livesdk.utils.u;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.d.i;
import com.bytedance.android.livesdkapi.depend.d.q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.view.b;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.imagepipeline.request.Postprocessor;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.a;
import org.json.JSONObject;

public class LivePlayFragment extends BaseFragment implements Observer<KVData>, com.bytedance.android.livesdkapi.depend.a.a, i {
    private static final Boolean K = Boolean.FALSE;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11597a;
    private static final /* synthetic */ a.C0900a ak;
    public AbsInteractionFragment A;
    public m B;
    public LiveAudienceEndFragment C;
    public String D;
    public String E;
    public boolean F;
    public HashMap<String, String> G;
    public long H;
    public com.bytedance.android.livesdk.player.i I;
    public boolean J = true;
    private List<String> L;
    private String M;
    private String N;
    private f.a O;
    private com.bytedance.android.livesdkapi.depend.model.live.a P;
    private boolean Q;
    private com.bytedance.android.livesdk.chatroom.detail.f R;
    private j S;
    private boolean T;
    private boolean U;
    private HSImageView V;
    private View W;
    private CircularProgressView X;
    private LottieAnimationView Y;
    private HSImageView Z;
    private View aa;
    private ViewStub ab;
    private boolean ac;
    private long ad;
    private String ae;
    private final Handler af = new Handler(Looper.getMainLooper()) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11600a;

        public final void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f11600a, false, 6059, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f11600a, false, 6059, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            super.handleMessage(message);
            if (message2.what == 28) {
                LivePlayFragment.this.a((Room) message2.obj);
            }
        }
    };
    private View ag;
    private boolean ah = false;
    private CompositeDisposable ai = new CompositeDisposable();
    private i.a aj;

    /* renamed from: b  reason: collision with root package name */
    public long f11598b;

    /* renamed from: c  reason: collision with root package name */
    long f11599c;
    boolean h;
    boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public int n = 1;
    public DataCenter o;
    public int p;
    public q q = q.IDLE;
    public g r;
    public e s;
    public RoomPlayer t;
    public com.bytedance.android.livesdk.chatroom.detail.i u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public TextureView z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11622a = new int[a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a[] r0 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11622a = r0
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.PLAYER_ERROR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.ENTER_FAILED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.FETCH_FAILED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.EMPTY_URL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.ENTER_LIVE_END     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.ROOM_FETCH_FINISHED     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.ROOM_PLAY_FINISHED     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.PING_KICK_OUT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.USER_CLOSE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.USER_KICK_OUT     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.WATCHER_KIT_OUT     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f11622a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a r1 = com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.a.JUMP_TO_OTHER     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.AnonymousClass5.<clinit>():void");
        }
    }

    enum a {
        ENTER_FAILED,
        FETCH_FAILED,
        ROOM_FETCH_FINISHED,
        EMPTY_URL,
        ROOM_PLAY_FINISHED,
        PING_KICK_OUT,
        USER_CLOSE,
        USER_KICK_OUT,
        WATCHER_KIT_OUT,
        JUMP_TO_OTHER,
        PLAYER_ERROR,
        ENTER_LIVE_END;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final Fragment g() {
        return this;
    }

    public final q e() {
        return this.q;
    }

    public final i.a p() {
        return this.aj;
    }

    public final boolean a(Room room, boolean z2) {
        Room room2 = room;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{room2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11597a, false, 6001, new Class[]{Room.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{room2, Byte.valueOf(z2)}, this, f11597a, false, 6001, new Class[]{Room.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        g gVar = this.r;
        if (PatchProxy.isSupport(new Object[]{room2}, gVar, g.f9939a, false, 4073, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2}, gVar, g.f9939a, false, 4073, new Class[]{Room.class}, Void.TYPE);
        } else {
            room2.setUserFrom(gVar.i);
            room2.setRequestId(gVar.g);
            room2.setLog_pb(gVar.h);
            room2.setLabels(gVar.j);
            room2.setSourceType(gVar.A);
            if (!TextUtils.isEmpty(gVar.k)) {
                room2.setPrivateInfo(gVar.k);
            }
        }
        com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(Room.class);
        if (a2 instanceof n) {
            ((n) a2).a(room2);
        }
        LinkCrossRoomDataHolder a3 = LinkCrossRoomDataHolder.a(room.getId(), ViewModelProviders.of((Fragment) this), this);
        if (!TextUtils.isEmpty(room.getLinkMicInfo())) {
            a3.a((p) com.bytedance.android.live.a.a().fromJson(room.getLinkMicInfo(), p.class), room2);
        }
        this.f11598b = room.getId();
        if (room.getOwner() != null) {
            this.f11599c = room.getOwner().getId();
            if (room.getOwner().getAvatarThumb() != null && !Lists.isEmpty(room.getOwner().getAvatarThumb().getUrls())) {
                this.L = room.getOwner().getAvatarThumb().getUrls();
            }
            TTLiveSDKContext.getHostService().k().a((com.bytedance.android.live.base.model.user.i) room.getOwner());
        }
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("live.intent.extra.USER_ID", this.f11599c);
            getActivity().getIntent().putExtra("current_room_id", this.f11598b);
        }
        this.M = room.buildPullUrl();
        this.N = room.getSdkParams();
        this.P = room.getStreamType();
        this.O = room.getStreamSrConfig();
        this.r.a(this.f11598b, room.isLiveTypeAudio(), room2.isThirdParty, this.f11599c, room.getLinkMicInfo());
        if (this.f11598b != 0) {
            getArguments().putLong("live.intent.extra.ROOM_ID", this.f11598b);
        }
        if (this.f11599c != 0) {
            getArguments().putLong("live.intent.extra.USER_ID", this.f11599c);
        }
        if (room.getStatus() == 4) {
            com.bytedance.android.livesdk.j.a.a().a("rd_enter_room_live_end", com.bytedance.android.livesdk.j.c.j.class, Room.class);
            a(107, "room finish", this.f11598b);
            a(z2 ? a.ROOM_FETCH_FINISHED : a.FETCH_FAILED);
            return false;
        } else if (!room.isPullUrlValid()) {
            a(108, "fetch failed because the pull_url isn't valid", this.f11598b);
            a(a.FETCH_FAILED);
            return false;
        } else {
            if (room.getStreamUrl().c().size() > 1) {
                z3 = true;
            }
            this.j = z3;
            this.l = room.getStreamUrl().n;
            this.m = room.getStreamUrl().o;
            return true;
        }
    }

    public final void a(int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f11597a, false, 6011, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f11597a, false, 6011, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i5 != 0 && i6 != 0) {
            int[] iArr = new int[2];
            if (this.t != null) {
                this.t.getVideoSize(iArr);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            if (i5 <= i6 || this.n != 1) {
                marginLayoutParams.topMargin = 0;
                if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6013, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6013, new Class[0], Void.TYPE);
                } else {
                    a((int) C0906R.id.drs, 8);
                }
                if (this.A == null) {
                    this.ah = true;
                } else if (this.A instanceof PortraitInteractionFragment) {
                    ((PortraitInteractionFragment) this.A).m();
                }
            } else {
                marginLayoutParams.topMargin = ac.a(96.0f);
                this.p = ((ac.c() * i6) / i5) + marginLayoutParams.topMargin;
                if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6012, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6012, new Class[0], Void.TYPE);
                } else {
                    a((int) C0906R.id.drs, 0);
                }
                if (this.A == null) {
                    this.ah = false;
                } else if (this.A instanceof PortraitInteractionFragment) {
                    ((PortraitInteractionFragment) this.A).n();
                }
            }
            this.z.setLayoutParams(marginLayoutParams);
            if (this.z instanceof b) {
                RelativeLayout.LayoutParams layoutParams = null;
                if (this.z.getParent() != null && (this.z.getParent() instanceof RelativeLayout)) {
                    layoutParams = (RelativeLayout.LayoutParams) this.z.getLayoutParams();
                }
                if (this.n != 1) {
                    ((b) this.z).setScaleType(0);
                    if (layoutParams != null) {
                        layoutParams.addRule(13);
                    }
                } else if (i5 > i6) {
                    ((b) this.z).setScaleType(0);
                    if (layoutParams != null) {
                        layoutParams.addRule(13, 0);
                    }
                } else if (com.bytedance.android.live.core.utils.a.b.b() && com.bytedance.android.live.core.utils.a.b.a() == 0) {
                    ((b) this.z).setScaleType(0);
                    if (layoutParams != null) {
                        layoutParams.addRule(13);
                    }
                } else if (this.Q) {
                    if (this.z.getWidth() <= 0 || this.z.getHeight() <= 0 || (this.z.getHeight() * i5) / this.z.getWidth() >= i6) {
                        ((b) this.z).setScaleType(0);
                    } else {
                        ((b) this.z).setScaleType(2);
                    }
                    if (layoutParams != null) {
                        layoutParams.addRule(13, 0);
                    }
                } else {
                    ((b) this.z).setScaleType(2);
                    if (layoutParams != null) {
                        layoutParams.addRule(13);
                    }
                }
                ((b) this.z).a(iArr[0], iArr[1]);
                if (layoutParams != null) {
                    this.z.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11597a, false, 6015, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11597a, false, 6015, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.t != null) {
            if (this.t.getDecodeStatus() == 2) {
                this.r.a(false, 104, this.t.getMediaErrorMessage());
                this.I.a(104, this.t.getMediaErrorMessage(), this.f11598b);
                a(104, this.t.getMediaErrorMessage(), this.f11598b);
            } else if (this.t.getDecodeStatus() == 1) {
                this.r.a(true, 0, null);
                this.r.d();
            } else {
                this.I.a(this.f11598b);
                a(113, "room cancel", this.f11598b);
                this.r.d();
            }
            this.t.stop(z2);
            this.t = null;
            k();
            b("reset player");
            this.z.setVisibility(8);
            this.y = false;
            K.booleanValue();
        }
    }

    public final void a(Room room) {
        Room room2 = room;
        if (PatchProxy.isSupport(new Object[]{room2}, this, f11597a, false, 6016, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2}, this, f11597a, false, 6016, new Class[]{Room.class}, Void.TYPE);
        } else if (this.q == q.PREPARED) {
            this.q = q.LIVE_STARTED;
            this.v = false;
            this.af.removeMessages(28);
            TTLiveSDKContext.getLiveService().d().a(room2);
            d.a().b();
            com.bytedance.android.livesdk.app.dataholder.e.a().c();
            com.bytedance.android.livesdk.chatroom.detail.f fVar = new com.bytedance.android.livesdk.chatroom.detail.f(room.getId(), room.getStreamId(), room.getLabels(), false, new f.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11609a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f11609a, false, 6084, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11609a, false, 6084, new Class[0], Void.TYPE);
                        return;
                    }
                    LivePlayFragment.this.a(a.ROOM_PLAY_FINISHED);
                }

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f11609a, false, 6085, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11609a, false, 6085, new Class[0], Void.TYPE);
                        return;
                    }
                    LivePlayFragment.this.l();
                }

                public final boolean a() {
                    if (PatchProxy.isSupport(new Object[0], this, f11609a, false, 6083, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11609a, false, 6083, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (LivePlayFragment.this.t == null) {
                        return true;
                    } else {
                        Logger.d("LivePlayFragment", "send play ping room. id:" + LivePlayFragment.this.f11598b + ",mActivityPause:" + (!LivePlayFragment.this.isResumed()) + ",mAudioLostFocusTime:" + LivePlayFragment.this.t.getAudioLostFocusTime());
                        if (LivePlayFragment.this.isResumed() || LivePlayFragment.this.t.getAudioLostFocusTime() == -1 || System.currentTimeMillis() - LivePlayFragment.this.t.getAudioLostFocusTime() <= 10000) {
                            return true;
                        }
                        LivePlayFragment.this.i();
                        LivePlayFragment.this.a(120, "isn't resumed and lost audio", LivePlayFragment.this.f11598b);
                        LivePlayFragment.this.a(true);
                        LivePlayFragment.this.w = true;
                        return false;
                    }
                }

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11609a, false, 6082, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11609a, false, 6082, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else if (30004 == i) {
                        LivePlayFragment.this.a(a.PING_KICK_OUT);
                    } else {
                        LivePlayFragment.this.a(a.ROOM_PLAY_FINISHED);
                    }
                }
            });
            this.R = fVar;
            com.bytedance.android.livesdk.chatroom.detail.f fVar2 = this.R;
            if (PatchProxy.isSupport(new Object[0], fVar2, com.bytedance.android.livesdk.chatroom.detail.f.f9933a, false, 4067, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], fVar2, com.bytedance.android.livesdk.chatroom.detail.f.f9933a, false, 4067, new Class[0], Void.TYPE);
            } else if (!fVar2.f9934b) {
                fVar2.f9934b = true;
                fVar2.b();
            }
            b(room);
            if (room.isLiveTypeAudio()) {
                this.Z.setVisibility(0);
                this.aa.setVisibility(0);
                com.bytedance.android.livesdk.chatroom.f.b.a(this.Z, room.getOwner().getAvatarLarge(), (Postprocessor) new u(5, (float) (UIUtils.getScreenWidth(getContext()) / UIUtils.getScreenHeight(getContext())), null));
            }
            if (room.getMosaicStatus() != 0) {
                ax axVar = new ax();
                axVar.f16521c = 2;
                String mosaicTip = room.getMosaicTip();
                if (TextUtils.isEmpty(mosaicTip)) {
                    mosaicTip = getString(C0906R.string.d92);
                }
                axVar.f16520b = mosaicTip;
                a(axVar);
            }
            K.booleanValue();
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11597a, false, 6021, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11597a, false, 6021, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.V.getVisibility() != 8) {
            this.V.setVisibility(8);
        }
        a(false, str);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), str2}, this, f11597a, false, 6023, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), str2}, this, f11597a, false, 6023, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (g().getUserVisibleHint() || !g().isHidden()) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "liveplay_background_status");
            hashMap.put("view_status", z2 ? "show" : "hide");
            hashMap.put("view_bg_reason", str2);
            c.b().b("ttlive_room", (Map<String, Object>) hashMap);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_status", z2 ? "show" : "hide");
        hashMap2.put("bg_reason", str2);
        hashMap2.put("bg_illegal", String.valueOf(this.x));
        com.bytedance.android.livesdk.j.a.a().a("liveplay_background_monitor", hashMap2, new Object[0]);
    }

    public final void a(@NonNull ax axVar) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{axVar}, this, f11597a, false, 6026, new Class[]{ax.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{axVar}, this, f11597a, false, 6026, new Class[]{ax.class}, Void.TYPE);
        } else if (isAdded()) {
            if (axVar.f16521c == 2) {
                z2 = true;
            }
            if (z2 != this.x) {
                this.x = z2;
                if (this.x) {
                    b("illegal Status");
                    c(axVar.f16520b);
                    return;
                }
                if (this.t != null && this.t.getDecodeStatus() == 1) {
                    a("recover from illegal status");
                }
                z();
            }
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11597a, false, 6039, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11597a, false, 6039, new Class[]{a.class}, Void.TYPE);
            return;
        }
        switch (AnonymousClass5.f11622a[aVar.ordinal()]) {
            case 1:
                cp.a(Toast.makeText(getContext(), C0906R.string.d20, 0));
                q();
                return;
            case 2:
                if (this.J) {
                    cp.a(Toast.makeText(getContext(), C0906R.string.d20, 0));
                }
                this.J = true;
                q();
                return;
            case 3:
                if (getArguments() == null || !getArguments().getBoolean("from_notification", false)) {
                    cp.a(Toast.makeText(getContext(), C0906R.string.d1t, 0));
                    q();
                    return;
                }
                cp.a(Toast.makeText(getContext(), C0906R.string.d1s, 0));
                if (p() != null) {
                    p().a(this.f11599c);
                    return;
                } else {
                    q();
                    return;
                }
            case 4:
                a(109, "empty url", this.f11598b);
                cp.a(Toast.makeText(getContext(), C0906R.string.d20, 0));
                q();
                return;
            case 5:
                a(121, "enter live end", this.f11598b);
                cp.a(Toast.makeText(getContext(), C0906R.string.d1t, 0));
                q();
                return;
            case 6:
                a(116, "fetch finished", this.f11598b);
                n();
                s();
                this.q = q.LIVE_FINISHED;
                return;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                a(117, "fetch finished", this.f11598b);
                n();
                s();
                this.q = q.LIVE_FINISHED;
                return;
            case 8:
                cp.a(Toast.makeText(getContext(), C0906R.string.d8k, 1));
                a(118, "fetch finished", this.f11598b);
                n();
                s();
                return;
            case 9:
                a(114, "user close", this.f11598b);
                y();
                x();
                if (this.r != null) {
                    this.r.c();
                    if (com.bytedance.android.livesdk.utils.j.b(this.o)) {
                        ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "exit", d.a.a().a("duration", String.valueOf(this.r.b())).a(com.bytedance.android.livesdk.utils.j.c(this.o)).f15712b);
                    }
                }
                q();
                return;
            case 10:
                a(110, "this user is kicked out by other device", this.f11598b);
                cp.a(Toast.makeText(getContext(), C0906R.string.de7, 1));
                s();
                q();
                return;
            case 11:
                final be beVar = new be(getContext());
                if (isAdded() && !beVar.isShowing()) {
                    beVar.show();
                }
                this.af.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11617a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f11617a, false, 6061, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f11617a, false, 6061, new Class[0], Void.TYPE);
                            return;
                        }
                        if (beVar.isShowing()) {
                            beVar.dismiss();
                        }
                        LivePlayFragment.this.a(111, "watcher kit out", LivePlayFragment.this.f11598b);
                        LivePlayFragment.this.q();
                    }
                }, 2500);
                return;
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                s();
                b(false);
                a((int) SearchJediMixFeedAdapter.f42516e, "jump to other room", this.f11598b);
                return;
            default:
                a(119, "jump to other room", this.f11598b);
                s();
                return;
        }
    }

    public final void a(int i2, String str, long j2) {
        String str2 = str;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2, new Long(j3)}, this, f11597a, false, 6054, new Class[]{Integer.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2, new Long(j3)}, this, f11597a, false, 6054, new Class[]{Integer.TYPE, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.I != null) {
            this.I.b(i2, str2, j3);
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5997, new Class[0], Void.TYPE);
            return;
        }
        b(true);
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6005, new Class[0], Void.TYPE);
        } else if (this.s != null) {
            this.s.b();
            this.s = null;
            K.booleanValue();
        }
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6007, new Class[0], Void.TYPE);
        } else if (this.S != null) {
            this.S.b();
            this.S = null;
            K.booleanValue();
        }
    }

    private void v() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6009, new Class[0], Void.TYPE);
        } else if (this.u != null) {
            this.u.b();
            this.u = null;
            K.booleanValue();
        }
    }

    private void z() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6045, new Class[0], Void.TYPE);
        } else if (b_()) {
            this.t.setMute(false);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6004, new Class[0], Void.TYPE);
            return;
        }
        if (this.B != null && this.B.isShowing()) {
            this.B.dismiss();
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6049, new Class[0], Void.TYPE);
            return;
        }
        if (this.A != null) {
            this.A.i();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5989, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5989, new Class[0], Void.TYPE);
            return;
        }
        K.booleanValue();
        super.onStart();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5990, new Class[0], Void.TYPE);
            return;
        }
        K.booleanValue();
        super.onStop();
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6052, new Class[0], Void.TYPE);
            return;
        }
        r().f().a();
    }

    public final h r() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6053, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6053, new Class[0], h.class);
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof LiveRoomFragment) {
            return (h) parentFragment;
        }
        return new h.a();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11597a, true, 6055, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11597a, true, 6055, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LivePlayFragment.java", LivePlayFragment.class);
            ak = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onCreate", "com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment", "android.os.Bundle", "savedInstanceState", "", "void"), 263);
        }
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6019, new Class[0], Void.TYPE);
        } else if (this.A != null) {
            this.A.j();
            if (!this.g) {
                getChildFragmentManager().beginTransaction().remove(this.A).commitNowAllowingStateLoss();
            }
            this.A = null;
        }
    }

    private void x() {
        int i2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6040, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6040, new Class[0], Void.TYPE);
            return;
        }
        Object obj = null;
        if (this.o != null) {
            obj = this.o.get("data_member_count");
        }
        if (obj instanceof Integer) {
            i2 = ((Integer) obj).intValue();
        } else {
            i2 = 0;
        }
        com.bytedance.android.live.base.a.a aVar = new com.bytedance.android.live.base.a.a();
        if (this.q == q.LIVE_FINISHED) {
            z2 = true;
        }
        aVar.f7687d = z2;
        aVar.f7688e = i2;
        aVar.f7686c = this.f11599c;
        aVar.f7685b = this.f11598b;
        if (getActivity() != null) {
            Intent intent = getActivity().getIntent();
            if (intent != null) {
                intent.putExtra("host_room_status_event", aVar);
            }
        }
    }

    private void y() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6041, new Class[0], Void.TYPE);
            return;
        }
        if (!(!TTLiveSDKContext.getHostService().k().c() || this.s == null || this.s.f9930e == null || this.s.f9930e.f11127a == null || this.s.f9930e.f11127a.getOwner() == null || !this.s.f9930e.f11127a.getOwner().isFollowing())) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.e.a());
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6017, new Class[0], Void.TYPE);
        } else if (this.q == q.LIVE_STARTED) {
            this.af.removeMessages(28);
            w();
            z();
            if (this.R != null) {
                this.R.a();
                this.R = null;
            }
            TTLiveSDKContext.getLiveService().d().a((Room) null);
            com.bytedance.android.livesdk.chatroom.bl.h.a().a(null, this.f11598b);
            this.r.c();
            if (this.r != null) {
                this.r.b(this.o);
            }
            this.v = false;
            this.x = false;
            this.q = q.PREPARED;
            K.booleanValue();
        }
    }

    public final boolean i_() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6036, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6036, new Class[0], Boolean.TYPE)).booleanValue();
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment next : fragments) {
                if ((next instanceof com.bytedance.android.livesdkapi.depend.a.a) && ((com.bytedance.android.livesdkapi.depend.a.a) next).i_()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6024, new Class[0], Void.TYPE);
            return;
        }
        if (this.W.getVisibility() != 0) {
            this.W.setVisibility(0);
        }
        if (com.bytedance.android.livesdkapi.a.a.f18616d) {
            if (this.Y.getVisibility() != 0) {
                this.Y.setVisibility(0);
            }
        } else if (this.X.getVisibility() != 0) {
            this.X.setVisibility(0);
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6025, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6025, new Class[0], Void.TYPE);
            return;
        }
        if (com.bytedance.android.livesdkapi.a.a.f18616d) {
            if (this.Y.getVisibility() != 4) {
                this.Y.setVisibility(4);
            }
        } else if (this.X.getVisibility() != 4) {
            this.X.setVisibility(4);
        }
        if (this.W.getVisibility() != 8) {
            this.W.setVisibility(8);
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6035, new Class[0], Void.TYPE);
        } else if (TTLiveSDKContext.getHostService().k().c() && this.f11598b != 0) {
            t();
            b(this.f11598b);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5983, new Class[0], Void.TYPE);
            return;
        }
        K.booleanValue();
        super.onDestroy();
        com.bytedance.android.livesdkapi.d.f n2 = TTLiveSDKContext.getHostService().n();
        if (n2 != null) {
            n2.b(false);
        }
        c();
        com.bytedance.android.livesdk.v.j.q().f().b();
        if (this.r != null) {
            this.r.a();
        }
        this.f11598b = 0;
        this.f11599c = 0;
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO;
        this.O = null;
        this.q = q.IDLE;
        this.r = null;
        this.j = false;
        this.l = null;
        this.m = null;
        this.w = false;
        this.h = false;
        this.i = false;
        this.U = false;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5988, new Class[0], Void.TYPE);
            return;
        }
        K.booleanValue();
        if (this.t != null) {
            this.t.onBackground();
        }
        g gVar = this.r;
        if (PatchProxy.isSupport(new Object[0], gVar, g.f9939a, false, 4077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], gVar, g.f9939a, false, 4077, new Class[0], Void.TYPE);
        } else {
            gVar.n = true;
            if (gVar.o != -1) {
                gVar.r = SystemClock.elapsedRealtime();
                gVar.f9943e.removeCallbacksAndMessages(null);
                gVar.f9940b = true;
                gVar.a(gVar.B);
            }
        }
        super.onPause();
    }

    public final void f() {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5999, new Class[0], Void.TYPE);
            return;
        }
        if (this.s == null || this.s.f9930e == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.t != null && this.t.getDecodeStatus() == 1) {
            z3 = true;
        }
        K.booleanValue();
        if (z2) {
            if (z3) {
                this.af.removeMessages(28);
                this.af.sendMessage(Message.obtain(this.af, 28, this.s.f9930e.f11127a));
                return;
            } else if (!this.af.hasMessages(28)) {
                this.af.sendMessageDelayed(Message.obtain(this.af, 28, this.s.f9930e.f11127a), Math.min(0, (2000 - SystemClock.elapsedRealtime()) + this.r.o));
            }
        }
        if (this.f11598b != 0) {
            a(this.f11598b);
        } else {
            try {
                if (this.f11599c <= 0 && this.I != null) {
                    this.I.a(106, "roomId is 0L", this.f11598b);
                    a(106, "roomId is 0L", this.f11598b);
                }
            } catch (Exception unused) {
            }
            c(this.f11599c);
        }
        if (!TextUtils.isEmpty(this.M)) {
            a(this.M, this.P, this.O, this.N);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6037, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6037, new Class[0], Void.TYPE);
            return;
        }
        if (!this.x && TTLiveSDKContext.getLiveService().d().a() != null) {
            com.bytedance.android.livesdkapi.d.f n2 = TTLiveSDKContext.getHostService().n();
            if (n2 != null && !n2.a((Activity) getActivity(), false)) {
                return;
            }
        }
        if (this.q != q.LIVE_STARTED || this.x) {
            if (this.r != null && this.q == q.LIVE_STARTED) {
                this.r.c();
                this.r.b(this.o);
            }
            a(a.USER_CLOSE);
        } else if (p() == null || !p().k()) {
            cm cmVar = new cm(this);
            if (!this.A.a((Runnable) cmVar, false)) {
                cmVar.run();
            }
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6042, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6042, new Class[0], Void.TYPE);
        } else if (isAdded() && b_()) {
            if (this.A != null) {
                this.A.j();
            }
            com.bytedance.android.livesdkapi.d.f n2 = TTLiveSDKContext.getHostService().n();
            if (n2 != null) {
                n2.a(false);
            }
            if (this.n == 0) {
                this.n = 1;
                getActivity().setRequestedOrientation(1);
            }
            if (this.C == null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                Fragment findFragmentByTag = childFragmentManager.findFragmentByTag("LiveEndFragment");
                if (findFragmentByTag == null) {
                    Room room = null;
                    if (this.s != null && this.s.f9930e != null && this.s.f9930e.f11127a != null) {
                        room = this.s.f9930e.f11127a;
                    } else if (!(this.u == null || this.u.f9920d == null)) {
                        room = this.u.f9920d;
                    }
                    if (room != null) {
                        this.C = new LiveAudienceEndFragment();
                        this.C.a(getActivity(), room, new com.bytedance.android.livesdkapi.depend.a.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f11620a;

                            public final boolean i_() {
                                if (PatchProxy.isSupport(new Object[0], this, f11620a, false, 6062, new Class[0], Boolean.TYPE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11620a, false, 6062, new Class[0], Boolean.TYPE)).booleanValue();
                                }
                                com.bytedance.android.livesdk.j.f.a((Context) LivePlayFragment.this.getActivity()).a("audience_live_over", "back", 0, 0);
                                LivePlayFragment.this.m();
                                return true;
                            }
                        }, this.r.v);
                        childFragmentManager.beginTransaction().add(C0906R.id.aic, this.C, "LiveEndFragment").commitAllowingStateLoss();
                        this.C.getLifecycle().addObserver(new GenericLifecycleObserver() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f11611a;

                            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f11611a, false, 6063, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f11611a, false, 6063, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
                                    return;
                                }
                                if (event.equals(Lifecycle.Event.ON_START)) {
                                    LivePlayFragment.this.r().g().a(LivePlayFragment.this.C.getView(), LivePlayFragment.this.C.f10033b);
                                }
                            }
                        });
                    } else if (this.u == null || !this.u.f9919c) {
                        a(a.ENTER_LIVE_END);
                        return;
                    } else {
                        this.F = true;
                        return;
                    }
                } else {
                    this.C = (LiveAudienceEndFragment) findFragmentByTag;
                }
                this.C.h = this.o;
            }
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5987, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5987, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        g gVar = this.r;
        if (PatchProxy.isSupport(new Object[0], gVar, g.f9939a, false, 4078, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], gVar, g.f9939a, false, 4078, new Class[0], Void.TYPE);
        } else {
            gVar.n = false;
            if (gVar.r != -1) {
                gVar.s += SystemClock.elapsedRealtime() - gVar.r;
                gVar.r = -1;
                gVar.f9943e.post(gVar.f9942d);
                gVar.h();
            }
        }
        if (this.t != null) {
            if (!this.x) {
                this.t.onForeground();
            }
            if (!com.bytedance.android.live.uikit.a.a.f() || !this.ac) {
                this.t.tryResumePlay();
            }
        }
        K.booleanValue();
        if (this.w) {
            this.w = false;
            if (this.q == q.PREPARED) {
                a(this.M, this.P, this.O, this.N);
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5994, new Class[0], Void.TYPE);
            return;
        }
        K.booleanValue();
        this.af.removeCallbacksAndMessages(null);
        a(115, "change page", this.f11598b);
        b(false);
        com.bytedance.android.livesdk.app.dataholder.d.a().b();
        com.bytedance.android.livesdk.app.dataholder.e.a().c();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5993, new Class[0], Void.TYPE);
            return;
        }
        K.booleanValue();
        this.ai.dispose();
        this.o.removeObserver(this);
        this.af.removeCallbacksAndMessages(null);
        s();
        com.bytedance.android.livesdk.app.dataholder.d.a().b();
        com.bytedance.android.livesdk.app.dataholder.e.a().c();
        ab.a(this.f11598b);
        LinkCrossRoomDataHolder.a(this.f11598b);
    }

    public final void b() {
        Bundle bundle;
        String str;
        Context context;
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5991, new Class[0], Void.TYPE);
            return;
        }
        K.booleanValue();
        if (!this.U) {
            a(com.bytedance.android.livesdkapi.f.a.class);
            a(s.class);
            a(com.bytedance.android.livesdk.chatroom.event.u.class);
            a(l.class);
            a(w.class);
            this.U = true;
        }
        this.o.observeForever("cmd_interact_state_change", this).observeForever("cmd_pk_state_change", this).observeForever("cmd_pk_state_change", this);
        if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 5996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 5996, new Class[0], Void.TYPE);
        } else if (this.q != q.INITIALIZED) {
            com.bytedance.android.livesdk.v.j.q().i().f15874a = null;
        } else {
            g gVar = this.r;
            if (PatchProxy.isSupport(new Object[0], gVar, g.f9939a, false, 4084, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], gVar, g.f9939a, false, 4084, new Class[0], Void.TYPE);
            } else {
                com.bytedance.android.livesdk.live.provider.a i2 = com.bytedance.android.livesdk.v.j.q().i();
                com.bytedance.android.livesdk.live.b.a aVar = i2.f15874a;
                i2.f15874a = null;
                gVar.p = aVar;
                if (!com.bytedance.android.livesdkapi.a.a.f18616d) {
                    if (gVar.f9944f == null || gVar.f9944f.get() == null) {
                        context = null;
                    } else {
                        context = (Context) gVar.f9944f.get();
                    }
                    com.bytedance.android.livesdk.j.f.a(context).a("live_play", "enter", gVar.l, 0);
                }
            }
            com.bytedance.android.livesdk.player.i iVar = this.I;
            com.bytedance.android.livesdk.live.b.a aVar2 = this.r.p;
            if (PatchProxy.isSupport(new Object[]{aVar2}, iVar, com.bytedance.android.livesdk.player.i.f16820b, false, 12724, new Class[]{com.bytedance.android.livesdk.live.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, iVar, com.bytedance.android.livesdk.player.i.f16820b, false, 12724, new Class[]{com.bytedance.android.livesdk.live.b.a.class}, Void.TYPE);
            } else if (aVar2 != null) {
                iVar.f16821c = aVar2;
            } else {
                iVar.f16822d = SystemClock.uptimeMillis();
            }
            if (this.q == q.LIVE_FINISHED) {
                if (this.C == null) {
                    this.C = (LiveAudienceEndFragment) getChildFragmentManager().findFragmentByTag("LiveEndFragment");
                }
                if (this.C == null) {
                    this.q = q.INITIALIZED;
                }
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f11597a, false, 6043, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11597a, false, 6043, new Class[0], Void.TYPE);
            } else if (this.C != null) {
                if (!this.g) {
                    getChildFragmentManager().beginTransaction().remove(this.C).commitAllowingStateLoss();
                }
                this.C = null;
            }
            DataCenter dataCenter = this.o;
            Bundle arguments = getArguments();
            if (PatchProxy.isSupport(new Object[]{dataCenter, arguments}, null, com.bytedance.android.livesdk.rank.a.f16915a, true, 12924, new Class[]{DataCenter.class, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dataCenter, arguments}, null, com.bytedance.android.livesdk.rank.a.f16915a, true, 12924, new Class[]{DataCenter.class, Bundle.class}, Void.TYPE);
            } else if (com.bytedance.android.livesdk.rank.a.f16916b) {
                if (PatchProxy.isSupport(new Object[]{dataCenter, arguments}, null, com.bytedance.android.livesdk.rank.a.f16915a, true, 12926, new Class[]{DataCenter.class, Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dataCenter, arguments}, null, com.bytedance.android.livesdk.rank.a.f16915a, true, 12926, new Class[]{DataCenter.class, Bundle.class}, Void.TYPE);
                } else if (!(!com.bytedance.android.livesdk.rank.a.f16916b || arguments == null || dataCenter == null)) {
                    Bundle bundle2 = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
                    if (bundle2 != null) {
                        Bundle bundle3 = bundle2.getBundle("copy_extra");
                        if (Logger.debug()) {
                            StringBuilder sb = new StringBuilder("save:");
                            if (bundle3 != null) {
                                str = bundle3.toString();
                            } else {
                                str = "null";
                            }
                            sb.append(str);
                            Logger.d("BackToRoomDataUtils", sb.toString());
                        }
                        if (bundle3 != null) {
                            bundle3.remove("live.intent.extra.BACK_PRE_ROOM_EXTRA");
                            dataCenter.lambda$put$1$DataCenter("data_room_back_extra", bundle3);
                        }
                    }
                }
                if (!(arguments == null || dataCenter == null)) {
                    Bundle bundle4 = arguments.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA");
                    if (bundle4 != null && bundle4.getBoolean("can_go_back", false)) {
                        dataCenter.lambda$put$1$DataCenter("data_room_back", bundle4);
                    }
                }
            }
            this.q = q.PREPARING;
            com.bytedance.android.livesdkapi.host.i e2 = TTLiveSDKContext.getHostService().e();
            if (!com.bytedance.android.live.uikit.a.a.d() || e2 == null || e2.a(com.bytedance.android.livesdkapi.j.a.Player.getPackageName())) {
                if (getArguments() == null) {
                    bundle = new Bundle();
                } else {
                    bundle = getArguments();
                }
                String string = bundle.getString("live.intent.extra.ENTER_TYPE");
                bundle.remove("live.intent.extra.ENTER_TYPE");
                String string2 = bundle.getString("live.intent.extra.PAGE_DELAY_TYPE");
                bundle.remove("live.intent.extra.PAGE_DELAY_TYPE");
                this.o.lambda$put$1$DataCenter("log_action_type", string);
                g gVar2 = this.r;
                gVar2.t = string;
                gVar2.u = string2;
                this.r.B = this.o;
                g gVar3 = this.r;
                if (PatchProxy.isSupport(new Object[0], gVar3, g.f9939a, false, 4075, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], gVar3, g.f9939a, false, 4075, new Class[0], Void.TYPE);
                } else {
                    gVar3.o = SystemClock.elapsedRealtime();
                    gVar3.F = SystemClock.elapsedRealtime();
                    if (gVar3.n) {
                        gVar3.r = gVar3.o;
                    }
                    gVar3.f9943e.post(gVar3.f9942d);
                    gVar3.h();
                    if (PatchProxy.isSupport(new Object[0], gVar3, g.f9939a, false, 4096, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], gVar3, g.f9939a, false, 4096, new Class[0], Void.TYPE);
                    } else if (com.bytedance.android.live.uikit.a.a.f()) {
                        if (gVar3.C != null && !gVar3.C.isDisposed()) {
                            gVar3.C.dispose();
                        }
                        gVar3.C = Observable.timer(30, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new Consumer<Long>() {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f9950a;

                            public final /* synthetic */ void accept(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.detail.g.3.accept(java.lang.Object):void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.detail.g.3.accept(java.lang.Object):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/
                        });
                    }
                    DataCenter dataCenter2 = gVar3.B;
                    if (PatchProxy.isSupport(new Object[]{dataCenter2}, gVar3, g.f9939a, false, 4076, new Class[]{DataCenter.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dataCenter2}, gVar3, g.f9939a, false, 4076, new Class[]{DataCenter.class}, Void.TYPE);
                    } else if (com.bytedance.android.live.uikit.a.a.f()) {
                        gVar3.E = com.bytedance.android.livesdk.utils.b.b.a(300, 300, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new Consumer<Long>(dataCenter2) {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f9947a;

                            /* renamed from: b */
                            final /* synthetic */ DataCenter f9948b;

                            public final /* synthetic */ void accept(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.detail.g.2.accept(java.lang.Object):void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.detail.g.2.accept(java.lang.Object):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/
                        });
                    }
                }
                f();
                return;
            }
            this.r.a(false, 105, "ttengine plugin not installed");
            this.I.a(105, "ttengine plugin not installed", this.f11598b);
            a(105, "ttengine plugin not installed", this.f11598b);
            a(a.PLAYER_ERROR);
        }
    }

    public final void a(i.a aVar) {
        this.aj = aVar;
    }

    private void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11597a, false, 6020, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11597a, false, 6020, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.V.getVisibility() != 0) {
            this.V.setVisibility(0);
        }
        a(true, str);
    }

    private void c(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f11597a, false, 6006, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f11597a, false, 6006, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.S == null) {
            this.S = new j(new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11632a;

                public final void a(@NonNull Room room) {
                    if (PatchProxy.isSupport(new Object[]{room}, this, f11632a, false, 6071, new Class[]{Room.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{room}, this, f11632a, false, 6071, new Class[]{Room.class}, Void.TYPE);
                    } else if (room == null) {
                        com.bytedance.android.livesdk.j.a.a().a("rd_enter_room_live_end", com.bytedance.android.livesdk.j.c.j.class, Room.class);
                        LivePlayFragment.this.a(a.ENTER_LIVE_END);
                    } else {
                        if (LivePlayFragment.this.a(room, false)) {
                            LivePlayFragment.this.f();
                        }
                    }
                }

                public final void a(int i, String str) {
                    int i2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f11632a, false, 6070, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f11632a, false, 6070, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    if (!(i == 30003 || i == 30001)) {
                        if (i != 0) {
                            i2 = i;
                        } else {
                            i2 = 103;
                        }
                        LivePlayFragment.this.r.a(false, i2, str);
                        LivePlayFragment.this.I.a(i2, str, LivePlayFragment.this.f11598b);
                        LivePlayFragment.this.a(i2, str, LivePlayFragment.this.f11598b);
                    }
                    LivePlayFragment.this.a(a.FETCH_FAILED);
                    if (i != 30003) {
                        com.bytedance.android.livesdk.j.a.a().a("rd_info_by_user_failed", com.bytedance.android.livesdk.j.c.j.class, Room.class);
                        return;
                    }
                    com.bytedance.android.livesdk.j.a.a().a("rd_enter_room_live_end", com.bytedance.android.livesdk.j.c.j.class, Room.class);
                }
            }, j2);
            this.S.a();
            K.booleanValue();
        }
    }

    private void d(final long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f11597a, false, 6008, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f11597a, false, 6008, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.u == null) {
            this.u = new com.bytedance.android.livesdk.chatroom.detail.i(new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11602a;

                public final void a(@NonNull Room room) {
                    Room room2 = room;
                    if (PatchProxy.isSupport(new Object[]{room2}, this, f11602a, false, 6073, new Class[]{Room.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{room2}, this, f11602a, false, 6073, new Class[]{Room.class}, Void.TYPE);
                        return;
                    }
                    LivePlayFragment.this.a(room2, true);
                }

                public final void a(int i, String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f11602a, false, 6072, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f11602a, false, 6072, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                    } else if (LivePlayFragment.this.s == null) {
                        LivePlayFragment.this.a(a.FETCH_FAILED);
                        LivePlayFragment.this.a(i, str2, j2);
                    } else if (LivePlayFragment.this.s.f9930e != null && LivePlayFragment.this.s.f9930e.f11127a != null) {
                    } else {
                        if (!LivePlayFragment.this.s.f9929d) {
                            if (LivePlayFragment.this.F) {
                                LivePlayFragment.this.a(a.ROOM_PLAY_FINISHED);
                            }
                        } else if (!LivePlayFragment.this.u.f9955f) {
                            com.bytedance.android.livesdk.chatroom.detail.i iVar = LivePlayFragment.this.u;
                            if (PatchProxy.isSupport(new Object[0], iVar, com.bytedance.android.livesdk.chatroom.detail.i.f9954e, false, 4116, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], iVar, com.bytedance.android.livesdk.chatroom.detail.i.f9954e, false, 4116, new Class[0], Void.TYPE);
                                return;
                            }
                            iVar.f9955f = true;
                            iVar.a();
                        }
                    }
                }
            }, j2);
            this.u.a();
            K.booleanValue();
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11597a, false, 5986, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11597a, false, 5986, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (this.n != getActivity().getRequestedOrientation()) {
            getActivity().setRequestedOrientation(this.n);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment findFragmentByTag = childFragmentManager.findFragmentByTag("AbsInteractionFragment");
        if (findFragmentByTag != null) {
            childFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.event.u uVar) {
        com.bytedance.android.livesdk.chatroom.event.u uVar2 = uVar;
        if (PatchProxy.isSupport(new Object[]{uVar2}, this, f11597a, false, 6048, new Class[]{com.bytedance.android.livesdk.chatroom.event.u.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uVar2}, this, f11597a, false, 6048, new Class[]{com.bytedance.android.livesdk.chatroom.event.u.class}, Void.TYPE);
            return;
        }
        if (p() != null) {
            p().a(uVar2.f10200b);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Serializable serializable;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11597a, false, 6047, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11597a, false, 6047, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle.putAll(getArguments());
        bundle.putInt("live.SCREEN_ORIENTATION", this.n);
        if (this.o == null || !((Boolean) this.o.get("enter_from_dou_plus", Boolean.FALSE)).booleanValue()) {
            z2 = false;
        }
        bundle.putBoolean("enter_from_dou_plus", z2);
        if (this.o == null) {
            serializable = null;
        } else {
            serializable = (Serializable) this.o.get("live_douplus_log_extra", new HashMap());
        }
        bundle.putSerializable("live_douplus_log_extra", serializable);
        super.onSaveInstanceState(bundle);
    }

    public void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11597a, false, 6046, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11597a, false, 6046, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        if (this.C != null) {
            this.C.setUserVisibleHint(z2);
        }
    }

    private void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f11597a, false, 6002, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f11597a, false, 6002, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        b(j2);
        d(j2);
    }

    private void b(Room room) {
        AbsInteractionFragment absInteractionFragment;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{room}, this, f11597a, false, 6018, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room}, this, f11597a, false, 6018, new Class[]{Room.class}, Void.TYPE);
            return;
        }
        room.setRequestId(this.D);
        room.setLog_pb(this.E);
        room.setUserFrom(this.ad);
        if (this.A == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (this.n == 1) {
                absInteractionFragment = new PortraitInteractionFragment();
            } else {
                absInteractionFragment = new LandscapeInteractionFragment();
            }
            this.A = absInteractionFragment;
            this.A.setArguments(getArguments());
            this.o.lambda$put$1$DataCenter("data_room", room);
            this.o.lambda$put$1$DataCenter("data_room_logger", this.r);
            this.A.a(this.o, false, (AbsInteractionFragment.b) new AbsInteractionFragment.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11613a;

                public final void a(int i) {
                    if (LivePlayFragment.this.q == q.LIVE_STARTED) {
                        if (i == 3) {
                            LivePlayFragment.this.v = true;
                            return;
                        }
                        if (i == 2) {
                            LivePlayFragment.this.v = false;
                        }
                    }
                }

                public final void a(ax axVar) {
                    if (PatchProxy.isSupport(new Object[]{axVar}, this, f11613a, false, 6086, new Class[]{ax.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{axVar}, this, f11613a, false, 6086, new Class[]{ax.class}, Void.TYPE);
                    } else if (axVar != null && LivePlayFragment.this.q == q.LIVE_STARTED) {
                        LivePlayFragment.this.a(axVar);
                    }
                }
            }, this.s.f9930e.f11128b);
            this.A.w = this.r;
            this.A.t = this.P;
            if (this.A instanceof PortraitInteractionFragment) {
                ((PortraitInteractionFragment) this.A).X = this.ah;
            }
            if (this.t == null || !this.t.isVideoHorizontal()) {
                z2 = false;
            }
            this.k = z2;
            this.o.lambda$put$1$DataCenter("cmd_video_orientation_changed", new ai(this.k, this.p));
            childFragmentManager.beginTransaction().add(C0906R.id.aic, this.A, "AbsInteractionFragment").commitAllowingStateLoss();
            this.A.getLifecycle().addObserver(new GenericLifecycleObserver() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11634a;

                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f11634a, false, 6087, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f11634a, false, 6087, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
                    } else if (event.equals(Lifecycle.Event.ON_START) && LivePlayFragment.this.A != null) {
                        FragmentActivity activity = LivePlayFragment.this.getActivity();
                        if (!(activity == null || activity.getWindow() == null || LivePlayFragment.this.n != 1 || LivePlayFragment.this.A == null)) {
                            LivePlayFragment.this.r().g().a(true, LivePlayFragment.this.A.getView(), LivePlayFragment.this.A.k, LivePlayFragment.this.A.l, LivePlayFragment.this.A.c());
                        }
                    }
                }
            });
            this.A.a((Runnable) new cl(this, room));
            this.r.i();
        }
    }

    private void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11597a, false, 6044, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11597a, false, 6044, new Class[]{String.class}, Void.TYPE);
        } else if (b_()) {
            this.t.setMute(true);
        }
    }

    private void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11597a, false, 6029, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11597a, false, 6029, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        long j2 = -1;
        if (this.o != null) {
            j2 = ((Long) this.o.get("data_room_id", -1L)).longValue();
        }
        if (j2 > 0) {
            ab.a(j2, false, getContext());
        }
        if (!z2) {
            if (this.t != null) {
                this.t.setMute(true);
                this.t.stopWhenPlayingOther(getContext());
                this.ac = true;
            }
            this.af.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11615a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f11615a, false, 6060, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11615a, false, 6060, new Class[0], Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.u.a.a().a((Object) new s(34));
                }
            });
        } else if (this.t != null) {
            this.t.tryResumePlay();
            this.ac = false;
            com.bytedance.android.livesdk.utils.w.a(this);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f11597a, false, 6034, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f11597a, false, 6034, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        int requestedOrientation = getActivity().getRequestedOrientation();
        if ((requestedOrientation == 0 || requestedOrientation == 1) && requestedOrientation != this.n) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && this.T) {
            this.n = requestedOrientation;
        }
        int[] iArr = new int[2];
        if (this.t != null) {
            RoomPlayer roomPlayer = this.t;
            if (requestedOrientation == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            roomPlayer.setScreenOrientation(z3);
            this.t.getVideoSize(iArr);
        }
        if (iArr[0] > 0 && iArr[1] > 0) {
            a(iArr[0], iArr[1], (int) UIUtils.dip2Px(getContext(), (float) configuration.screenWidthDp));
        }
        this.o.lambda$put$1$DataCenter("cmd_video_orientation_changed", new ai(this.k, this.p));
        if (this.T) {
            if (z2) {
                this.T = false;
                if (this.u != null) {
                    b(this.s.f9930e.f11127a);
                }
            }
            super.onConfigurationChanged(configuration);
        }
    }

    public void onEvent(l lVar) {
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{lVar2}, this, f11597a, false, 6030, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar2}, this, f11597a, false, 6030, new Class[]{l.class}, Void.TYPE);
        } else if (lVar2.f10182a != this.f11598b) {
            long j2 = lVar2.f10182a;
            String str = lVar2.f10183b;
            Bundle bundle = lVar2.f10184c;
            if (PatchProxy.isSupport(new Object[]{new Long(j2), str, bundle}, this, f11597a, false, 6038, new Class[]{Long.TYPE, String.class, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2), str, bundle}, this, f11597a, false, 6038, new Class[]{Long.TYPE, String.class, Bundle.class}, Void.TYPE);
            } else if (this.q == q.LIVE_STARTED) {
                cn cnVar = new cn(this, j2, str, bundle);
                if (!this.A.a((Runnable) cnVar, true)) {
                    cnVar.run();
                }
            } else {
                a(a.JUMP_TO_OTHER);
                if (p() != null) {
                    p().a(j2, str, bundle);
                }
            }
        }
    }

    private <T> void a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f11597a, false, 5992, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f11597a, false, 5992, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        this.ai.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11623a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f11623a, false, 6064, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f11623a, false, 6064, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof com.bytedance.android.livesdkapi.f.a) {
                    LivePlayFragment.this.onEvent((com.bytedance.android.livesdkapi.f.a) t);
                } else if (t instanceof s) {
                    LivePlayFragment.this.onEvent((s) t);
                } else if (t instanceof com.bytedance.android.livesdk.chatroom.event.u) {
                    LivePlayFragment.this.onEvent((com.bytedance.android.livesdk.chatroom.event.u) t);
                } else if (t instanceof l) {
                    LivePlayFragment.this.onEvent((l) t);
                } else {
                    if (t instanceof w) {
                        LivePlayFragment.this.onEvent((w) t);
                    }
                }
            }
        }));
    }

    private void b(long j2) {
        final long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f11597a, false, 6003, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f11597a, false, 6003, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.s == null) {
            String str = "";
            if (!TextUtils.isEmpty(this.r.w)) {
                if (TextUtils.isEmpty(this.r.x)) {
                    str = this.r.w;
                } else {
                    str = this.r.w + "-" + this.r.x;
                }
            }
            if (com.bytedance.android.live.uikit.a.a.l()) {
                com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class);
                if (a2 instanceof k) {
                    k kVar = (k) a2;
                    if (kVar.a().containsKey("enter_from")) {
                        kVar.a().get("enter_from");
                    }
                    if (kVar.a().containsKey("source")) {
                        kVar.a().get("source");
                    }
                    Map a3 = kVar.a();
                    str = ((String) a3.get("enter_from_merge")) + "-" + ((String) a3.get("enter_method"));
                }
            }
            e eVar = new e(new e.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11625a;

                public final void a(@NonNull com.bytedance.android.livesdk.chatroom.model.j jVar) {
                    String str;
                    String str2;
                    com.bytedance.android.livesdk.chatroom.model.j jVar2 = jVar;
                    if (PatchProxy.isSupport(new Object[]{jVar2}, this, f11625a, false, 6066, new Class[]{com.bytedance.android.livesdk.chatroom.model.j.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jVar2}, this, f11625a, false, 6066, new Class[]{com.bytedance.android.livesdk.chatroom.model.j.class}, Void.TYPE);
                        return;
                    }
                    LivePlayFragment.this.h();
                    Room room = jVar2.f11127a;
                    if (room != null) {
                        com.bytedance.android.livesdk.player.i iVar = LivePlayFragment.this.I;
                        long j = j3;
                        if (PatchProxy.isSupport(new Object[]{new Long(j)}, iVar, com.bytedance.android.livesdk.player.i.f16820b, false, 12726, new Class[]{Long.TYPE}, Void.TYPE)) {
                            com.bytedance.android.livesdk.player.i iVar2 = iVar;
                            PatchProxy.accessDispatch(new Object[]{new Long(j)}, iVar2, com.bytedance.android.livesdk.player.i.f16820b, false, 12726, new Class[]{Long.TYPE}, Void.TYPE);
                        } else if (!iVar.f16823e) {
                            iVar.f16823e = true;
                            if (iVar.f16821c != null) {
                                str2 = iVar.f16821c.f15799b;
                            } else {
                                str2 = "other";
                            }
                            long a2 = iVar.a();
                            JSONObject jSONObject = new JSONObject();
                            com.bytedance.android.livesdk.player.i.a(jSONObject, "enter_room_type", str2);
                            com.bytedance.android.livesdk.player.i.a(jSONObject, "room_id", j);
                            com.bytedance.android.live.core.d.e.a("ttlive_audience_enter_room_all", 0, a2, jSONObject);
                        }
                        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).syncGiftList(null, LivePlayFragment.this.f11598b, 2, false);
                    }
                    boolean a3 = LivePlayFragment.this.a(room, true);
                    com.bytedance.android.livesdk.j.b.g a4 = com.bytedance.android.livesdk.j.a.a().a(Room.class);
                    if (a4 != null) {
                        room.setLog_pb(String.valueOf(a4.a().get("log_pb")));
                        room.setRequestId(String.valueOf(a4.a().get("request_id")));
                        a4.a().put("orientation", String.valueOf(room.getOrientation()));
                        String string = LivePlayFragment.this.getArguments().getString("is_preview");
                        Map<String, String> a5 = a4.a();
                        if (TextUtils.isEmpty(string)) {
                            string = PushConstants.PUSH_TYPE_NOTIFY;
                        }
                        a5.put("is_preview", string);
                        a4.a().put("starlight_rank", LivePlayFragment.this.getArguments().getString("starlight_rank"));
                        Map<String, String> a6 = a4.a();
                        if (room.hasCommerceGoods) {
                            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        } else {
                            str = PushConstants.PUSH_TYPE_NOTIFY;
                        }
                        a6.put("is_sale", str);
                        a4.a().put("is_live_recall", PushConstants.PUSH_TYPE_NOTIFY);
                        Bundle bundle = LivePlayFragment.this.getArguments().getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
                        if (bundle != null) {
                            a4.a().put("starlight_rank", bundle.getString("starlight_rank"));
                        }
                    }
                    LivePlayFragment.this.r.a(false, true);
                    if (a3) {
                        if (LivePlayFragment.this.q == q.PREPARING) {
                            LivePlayFragment.this.q = q.PREPARED;
                        }
                        LivePlayFragment.this.o.lambda$put$1$DataCenter("data_message_manager", ab.a(room.getId(), false, LivePlayFragment.this.getContext()));
                        LivePlayFragment.this.f();
                    }
                }

                public final void a(int i, String str, String str2) {
                    int i2;
                    int i3 = i;
                    String str3 = str;
                    String str4 = str2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, f11625a, false, 6065, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, f11625a, false, 6065, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
                    } else if ((TextUtils.isEmpty(str) || !str3.contains("30003")) && i3 != 30003) {
                        com.bytedance.android.livesdk.j.a.a().a("rd_enter_room_failed", com.bytedance.android.livesdk.j.c.j.class, Room.class);
                        if (i3 != 0) {
                            i2 = i3;
                        } else {
                            i2 = 103;
                        }
                        LivePlayFragment.this.r.a(false, i2, str3);
                        LivePlayFragment.this.I.a(i2, str3, j3);
                        LivePlayFragment.this.h();
                        if (TextUtils.isEmpty(str2) || i3 == 0) {
                            co.a(Toast.makeText(LivePlayFragment.this.getContext(), C0906R.string.d20, 0));
                            LivePlayFragment.this.a(a.ENTER_FAILED);
                        } else if ((TextUtils.isEmpty(str) || !str3.contains("30005")) && i3 != 30005) {
                            co.a(Toast.makeText(LivePlayFragment.this.getContext(), str4, 0));
                            LivePlayFragment.this.J = false;
                            LivePlayFragment.this.a(a.ENTER_FAILED);
                        } else if (LivePlayFragment.this.B == null || !LivePlayFragment.this.B.isShowing()) {
                            g gVar = LivePlayFragment.this.r;
                            if (PatchProxy.isSupport(new Object[0], gVar, g.f9939a, false, 4091, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], gVar, g.f9939a, false, 4091, new Class[0], Void.TYPE);
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("event_belong", "live");
                                hashMap.put("event_type", "show");
                                hashMap.put("event_page", "live_detail");
                                hashMap.put("event_module", "popup");
                                hashMap.put("live_type", gVar.y);
                                hashMap.put("request_id", gVar.g);
                                hashMap.put("log_pb", gVar.h);
                                com.bytedance.android.livesdk.j.a.a().a("crash_popup_show", hashMap, new Object[0]);
                            }
                            LivePlayFragment.this.B = new m.a(LivePlayFragment.this.getContext()).a(false).c((int) C0906R.string.d9d).b(0, (int) C0906R.string.d9c, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f11630a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11630a, false, 6068, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11630a, false, 6068, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    if (LivePlayFragment.this.s != null) {
                                        e eVar = LivePlayFragment.this.s;
                                        if (PatchProxy.isSupport(new Object[0], eVar, e.f9926a, false, 4065, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], eVar, e.f9926a, false, 4065, new Class[0], Void.TYPE);
                                        } else {
                                            com.bytedance.android.livesdk.chatroom.bl.h a2 = com.bytedance.android.livesdk.chatroom.bl.h.a();
                                            WeakHandler weakHandler = eVar.f9927b;
                                            if (PatchProxy.isSupport(new Object[]{weakHandler}, a2, com.bytedance.android.livesdk.chatroom.bl.h.f9797a, false, 4009, new Class[]{Handler.class}, Void.TYPE)) {
                                                Object[] objArr = {weakHandler};
                                                Object[] objArr2 = objArr;
                                                com.bytedance.android.livesdk.chatroom.bl.h hVar = a2;
                                                PatchProxy.accessDispatch(objArr2, hVar, com.bytedance.android.livesdk.chatroom.bl.h.f9797a, false, 4009, new Class[]{Handler.class}, Void.TYPE);
                                            } else {
                                                ((RoomRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(RoomRetrofitApi.class)).finishRoomAbnormal().compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new com.bytedance.android.livesdk.chatroom.bl.ab(weakHandler), new com.bytedance.android.livesdk.chatroom.bl.ac(weakHandler));
                                            }
                                        }
                                    }
                                    if (LivePlayFragment.this.r != null) {
                                        g gVar = LivePlayFragment.this.r;
                                        if (PatchProxy.isSupport(new Object[0], gVar, g.f9939a, false, 4092, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], gVar, g.f9939a, false, 4092, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("event_belong", "live");
                                        hashMap.put("event_type", "click");
                                        hashMap.put("event_page", "live_detail");
                                        hashMap.put("event_module", "popup");
                                        hashMap.put("live_type", gVar.y);
                                        hashMap.put("request_id", gVar.g);
                                        hashMap.put("log_pb", gVar.h);
                                        com.bytedance.android.livesdk.j.a.a().a("crash_popup_click_over", hashMap, new Object[0]);
                                    }
                                }
                            }).b(1, (int) C0906R.string.dkg, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f11628a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11628a, false, 6067, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11628a, false, 6067, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    LivePlayFragment.this.a(a.ENTER_FAILED);
                                }
                            }).a();
                            LivePlayFragment.this.B.show();
                        }
                    } else {
                        com.bytedance.android.livesdk.j.a.a().a("rd_enter_room_live_end", com.bytedance.android.livesdk.j.c.j.class, Room.class);
                        LivePlayFragment.this.n();
                    }
                }
            }, j2, this.D, this.r.t, this.r.j, this.r.v, str);
            this.s = eVar;
            this.s.a();
            K.booleanValue();
        }
    }

    private void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11597a, false, 6000, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11597a, false, 6000, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.q == q.PREPARING || this.q == q.PREPARED) {
            u();
            v();
            t();
            a(z2);
            this.r.a();
            this.q = q.INITIALIZED;
            K.booleanValue();
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f11597a, false, 6051, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f11597a, false, 6051, new Class[]{KVData.class}, Void.TYPE);
        } else if (b_() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1540323875) {
                if (hashCode == -1180299966 && key.equals("cmd_interact_state_change")) {
                    c2 = 0;
                }
            } else if (key.equals("cmd_pk_state_change")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    com.bytedance.android.livesdk.chatroom.event.q qVar = (com.bytedance.android.livesdk.chatroom.event.q) kVData.getData();
                    if (PatchProxy.isSupport(new Object[]{qVar}, this, f11597a, false, 6031, new Class[]{com.bytedance.android.livesdk.chatroom.event.q.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{qVar}, this, f11597a, false, 6031, new Class[]{com.bytedance.android.livesdk.chatroom.event.q.class}, Void.TYPE);
                        break;
                    } else {
                        if (isResumed() && this.q == q.LIVE_STARTED) {
                            if (3 == qVar.f10192a) {
                                if (this.t != null) {
                                    this.t.stopWhenJoinInteract(getContext());
                                }
                                this.z.setVisibility(4);
                                k();
                                break;
                            } else if (4 == qVar.f10192a) {
                                this.z.setVisibility(0);
                                if (this.t != null) {
                                    this.t.tryResumePlay();
                                    if (this.x) {
                                        this.t.setMute(true);
                                    }
                                }
                            }
                        }
                        return;
                    }
                case 1:
                    o oVar = (o) kVData.getData();
                    if (!PatchProxy.isSupport(new Object[]{oVar}, this, f11597a, false, 6032, new Class[]{o.class}, Void.TYPE)) {
                        if (b_() && this.t != null) {
                            if (oVar.f10187a == 0) {
                                this.t.setAnchorInteractMode(true);
                                this.Q = true;
                            } else if (oVar.f10187a == 1) {
                                this.t.setAnchorInteractMode(false);
                                this.Q = false;
                            }
                            int[] iArr = new int[2];
                            this.t.getVideoSize(iArr);
                            if (!(iArr[0] == 0 || iArr[1] == 0)) {
                                a(iArr[0], iArr[1], UIUtils.getScreenWidth(getContext()));
                                break;
                            }
                        } else {
                            return;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[]{oVar}, this, f11597a, false, 6032, new Class[]{o.class}, Void.TYPE);
                        return;
                    }
                    break;
            }
        }
    }

    public void onEvent(s sVar) {
        if (PatchProxy.isSupport(new Object[]{sVar}, this, f11597a, false, 6028, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, f11597a, false, 6028, new Class[]{s.class}, Void.TYPE);
            return;
        }
        int i2 = sVar.f10195a;
        if (i2 == 7) {
            a(a.ROOM_PLAY_FINISHED);
        } else if (i2 == 11) {
            a(a.USER_KICK_OUT);
        } else if (i2 == 20) {
            a(a.WATCHER_KIT_OUT);
        } else if (i2 == 35) {
            a(a.ENTER_FAILED);
        }
        if (isResumed()) {
            int i3 = sVar.f10195a;
            if (!(i3 == 8 || i3 == 17)) {
                switch (i3) {
                    case 5:
                    case 6:
                        break;
                }
            }
            if (getUserVisibleHint()) {
                if (this.n == 1) {
                    m();
                } else {
                    onEvent(new com.bytedance.android.livesdkapi.f.a(1));
                }
                if (this.q == q.LIVE_STARTED) {
                    int i4 = sVar.f10195a;
                    if (i4 == 10 || i4 == 24) {
                        l();
                        return;
                    }
                    if (i4 != 26) {
                        switch (i4) {
                            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.f69366e /*?: ONE_ARG  (30 int)*/:
                                float screenWidth = ((float) UIUtils.getScreenWidth(getContext())) / ((float) UIUtils.getScreenHeight(getContext()));
                                if (Lists.notEmpty(this.L)) {
                                    com.bytedance.android.livesdk.chatroom.f.b.a(this.V, new ImageModel(null, this.L), (Postprocessor) new u(5, screenWidth, null));
                                } else {
                                    com.bytedance.android.livesdk.chatroom.f.b.a(this.V, "res://" + getContext().getPackageName() + "/2130841224", (Postprocessor) new u(5, screenWidth, null));
                                }
                                b("anchor leave");
                                return;
                            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.f69367f /*?: ONE_ARG  (31 int)*/:
                                a("anchor back");
                                return;
                            case 32:
                                d(false);
                                return;
                            case 33:
                                d(true);
                                break;
                        }
                    } else if (!(p() == null || !p().a(sVar.f10196b) || getView() == null)) {
                        getView().getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
    }

    private void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11597a, false, 5998, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11597a, false, 5998, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.q != q.IDLE && this.q != q.INITIALIZED) {
            this.r.e();
            this.r.f();
            if (this.q != q.LIVE_FINISHED) {
                if (this.q == q.LIVE_STARTED) {
                    i();
                }
                if (this.q == q.PREPARED || this.q == q.PREPARING) {
                    c(z2);
                }
                if (this.r != null) {
                    this.r.a();
                }
            }
        }
    }

    public void onEvent(w wVar) {
        if (PatchProxy.isSupport(new Object[]{wVar}, this, f11597a, false, 6027, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, f11597a, false, 6027, new Class[]{w.class}, Void.TYPE);
        } else if (this.q == q.LIVE_STARTED) {
            String str = wVar.f10204b;
            String str2 = wVar.f10205c;
            if (!TextUtils.isEmpty(str)) {
                this.l = wVar.f10203a;
                this.y = true;
                this.t.stop(false);
                this.t = null;
                a(str, this.P, this.O, str2);
                com.bytedance.android.livesdk.utils.ai.a(getString(C0906R.string.dde));
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11597a, false, 6050, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11597a, false, 6050, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.A != null) {
            AbsInteractionFragment absInteractionFragment = this.A;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, absInteractionFragment, AbsInteractionFragment.f11424a, false, 5540, new Class[]{Integer.TYPE}, Void.TYPE)) {
                AbsInteractionFragment absInteractionFragment2 = absInteractionFragment;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, absInteractionFragment2, AbsInteractionFragment.f11424a, false, 5540, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (absInteractionFragment.E != null) {
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = absInteractionFragment.E;
                if (PatchProxy.isSupport(new Object[0], liveRoomUserInfoWidget, LiveRoomUserInfoWidget.f13402a, false, 7971, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], liveRoomUserInfoWidget, LiveRoomUserInfoWidget.f13402a, false, 7971, new Class[0], Void.TYPE);
                } else if (liveRoomUserInfoWidget.o != null && !liveRoomUserInfoWidget.o.isFinishing() && liveRoomUserInfoWidget.y != null && liveRoomUserInfoWidget.y.f()) {
                    liveRoomUserInfoWidget.y.dismiss();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r37) {
        /*
            r36 = this;
            r8 = r36
            r0 = r37
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f11597a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 5982(0x175e, float:8.383E-42)
            r2 = r36
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f11597a
            r4 = 0
            r5 = 5982(0x175e, float:8.383E-42)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r36
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            org.aspectj.lang.a$a r1 = ak
            org.aspectj.lang.a r11 = org.aspectj.a.a.b.a(r1, r8, r8, r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x03f8 }
            r1.<init>()     // Catch:{ Throwable -> 0x03f8 }
            r8.G = r1     // Catch:{ Throwable -> 0x03f8 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x03f8 }
            r8.H = r1     // Catch:{ Throwable -> 0x03f8 }
            super.onCreate(r37)     // Catch:{ Throwable -> 0x03f8 }
            android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.Fragment) r36)     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.ies.sdk.widgets.DataCenter r1 = com.bytedance.ies.sdk.widgets.DataCenter.create(r1, r8)     // Catch:{ Throwable -> 0x03f8 }
            r8.o = r1     // Catch:{ Throwable -> 0x03f8 }
            android.os.Bundle r1 = r36.getArguments()     // Catch:{ Throwable -> 0x03f8 }
            if (r1 != 0) goto L_0x0061
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Throwable -> 0x03f8 }
            r1.<init>()     // Catch:{ Throwable -> 0x03f8 }
        L_0x0061:
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r8.o     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.utils.j.a(r2, r1)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            r3 = 0
            long r5 = r1.getLong(r2, r3)     // Catch:{ Throwable -> 0x03f8 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x007b
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            long r5 = r1.getLong(r2)     // Catch:{ Throwable -> 0x03f8 }
            r8.f11598b = r5     // Catch:{ Throwable -> 0x03f8 }
            goto L_0x0095
        L_0x007b:
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            java.lang.String r5 = ""
            java.lang.String r2 = r1.getString(r2, r5)     // Catch:{ Throwable -> 0x03f8 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x03f8 }
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x0095 }
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x0095 }
            r8.f11598b = r5     // Catch:{ Exception -> 0x0095 }
        L_0x0095:
            java.lang.String r2 = "live.intent.extra.USER_ID"
            long r5 = r1.getLong(r2, r3)     // Catch:{ Throwable -> 0x03f8 }
            r8.f11599c = r5     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "live.intent.extra.SCREEN_ORIENTATION"
            int r2 = r1.getInt(r2, r9)     // Catch:{ Throwable -> 0x03f8 }
            r8.n = r2     // Catch:{ Throwable -> 0x03f8 }
            long r5 = r8.f11598b     // Catch:{ Throwable -> 0x03f8 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            long r5 = r8.f11599c     // Catch:{ Throwable -> 0x03f8 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            if (r0 == 0) goto L_0x00ec
            java.lang.String r1 = "live.intent.extra.ROOM_ID"
            boolean r1 = r0.containsKey(r1)     // Catch:{ Throwable -> 0x03f8 }
            if (r1 == 0) goto L_0x00c8
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r8.o     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.utils.j.a(r1, r0)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.ROOM_ID"
            long r1 = r0.getLong(r1, r3)     // Catch:{ Throwable -> 0x03f8 }
            r8.f11598b = r1     // Catch:{ Throwable -> 0x03f8 }
        L_0x00c8:
            java.lang.String r1 = "live.intent.extra.USER_ID"
            boolean r1 = r0.containsKey(r1)     // Catch:{ Throwable -> 0x03f8 }
            if (r1 == 0) goto L_0x00d8
            java.lang.String r1 = "live.intent.extra.USER_ID"
            long r1 = r0.getLong(r1, r3)     // Catch:{ Throwable -> 0x03f8 }
            r8.f11599c = r1     // Catch:{ Throwable -> 0x03f8 }
        L_0x00d8:
            java.lang.String r1 = "live.SCREEN_ORIENTATION"
            boolean r1 = r0.containsKey(r1)     // Catch:{ Throwable -> 0x03f8 }
            if (r1 == 0) goto L_0x00e8
            java.lang.String r1 = "live.SCREEN_ORIENTATION"
            int r1 = r0.getInt(r1)     // Catch:{ Throwable -> 0x03f8 }
            r8.n = r1     // Catch:{ Throwable -> 0x03f8 }
        L_0x00e8:
            r36.setArguments(r37)     // Catch:{ Throwable -> 0x03f8 }
            goto L_0x00ed
        L_0x00ec:
            r0 = r1
        L_0x00ed:
            java.lang.String r1 = "live.intent.extra.BG_URLS"
            java.util.ArrayList r1 = r0.getStringArrayList(r1)     // Catch:{ Throwable -> 0x03f8 }
            r8.L = r1     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.PULL_STREAM_URL"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Throwable -> 0x03f8 }
            r8.M = r1     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.PULL_SDK_PARAMS"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Throwable -> 0x03f8 }
            r8.N = r1     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.STREAM_TYPE"
            int r1 = r0.getInt(r1, r10)     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdkapi.depend.model.live.a r1 = com.bytedance.android.livesdkapi.depend.model.live.a.valueOf((int) r1)     // Catch:{ Throwable -> 0x03f8 }
            r8.P = r1     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.EXTRA_STREAM_SR_ENABLED"
            boolean r1 = r0.getBoolean(r1, r10)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS"
            boolean r2 = r0.getBoolean(r2, r10)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r5 = "live.intent.extra.EXTRA_STREAM_SR_STRENGTH"
            int r5 = r0.getInt(r5, r10)     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdkapi.depend.model.live.f$a r6 = new com.bytedance.android.livesdkapi.depend.model.live.f$a     // Catch:{ Throwable -> 0x03f8 }
            r6.<init>(r1, r2, r5)     // Catch:{ Throwable -> 0x03f8 }
            r8.O = r6     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.IS_THIRD_PARTY"
            boolean r16 = r0.getBoolean(r1, r10)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "from_notification"
            boolean r1 = r0.getBoolean(r1, r10)     // Catch:{ Throwable -> 0x03f8 }
            if (r1 == 0) goto L_0x0140
            long r1 = r8.f11599c     // Catch:{ Throwable -> 0x03f8 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0140
            r8.f11598b = r3     // Catch:{ Throwable -> 0x03f8 }
        L_0x0140:
            long r1 = r8.f11598b     // Catch:{ Throwable -> 0x03f8 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x014c
            long r1 = r8.f11599c     // Catch:{ Throwable -> 0x03f8 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0150
        L_0x014c:
            com.bytedance.android.livesdkapi.depend.d.q r1 = com.bytedance.android.livesdkapi.depend.d.q.INITIALIZED     // Catch:{ Throwable -> 0x03f8 }
            r8.q = r1     // Catch:{ Throwable -> 0x03f8 }
        L_0x0150:
            java.lang.String r1 = "live.intent.extra.REQUEST_ID"
            r2 = 0
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ Throwable -> 0x03f8 }
            r8.D = r1     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.LOG_PB"
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ Throwable -> 0x03f8 }
            r8.E = r1     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.USER_FROM"
            long r5 = r0.getLong(r1, r3)     // Catch:{ Throwable -> 0x03f8 }
            r8.ad = r5     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "live.intent.extra.SOURCE_EXTRA"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Throwable -> 0x03f8 }
            r8.ae = r1     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "scene_id"
            java.lang.String r15 = r0.getString(r1)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "enter_from_merge"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r5 = "enter_method"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r6 = "top_message_type"
            java.lang.String r7 = ""
            r0.getString(r6, r7)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r6 = "live.intent.extra.ROOM_LABELS"
            java.lang.String r23 = r0.getString(r6, r2)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "live.intent.extra.ENTER_LIVE_SOURCE"
            java.lang.String r6 = ""
            java.lang.String r24 = r0.getString(r2, r6)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r12 = r0.getBundle(r2)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "live.intent.extra.PRIVATE_INFO"
            java.lang.String r26 = r0.getString(r2)     // Catch:{ Throwable -> 0x03f8 }
            boolean r0 = com.bytedance.android.live.uikit.a.a.d()     // Catch:{ Throwable -> 0x03f8 }
            if (r0 != 0) goto L_0x01b0
            boolean r0 = com.bytedance.android.live.uikit.a.a.g()     // Catch:{ Throwable -> 0x03f8 }
            if (r0 == 0) goto L_0x01f9
        L_0x01b0:
            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r2 = com.bytedance.android.livesdk.j.c.j.class
            com.bytedance.android.livesdk.j.b.g r0 = r0.a((java.lang.Class) r2)     // Catch:{ Throwable -> 0x03f8 }
            if (r0 == 0) goto L_0x01f9
            java.util.Map r1 = r0.a()     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "enter_from"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x03f8 }
            java.util.Map r0 = r0.a()     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "source"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x03f8 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Throwable -> 0x03f8 }
            r2.<init>()     // Catch:{ Throwable -> 0x03f8 }
            if (r1 == 0) goto L_0x01e0
            java.lang.String r5 = "enter_from"
            r2.put(r5, r1)     // Catch:{ Throwable -> 0x03f8 }
        L_0x01e0:
            if (r0 == 0) goto L_0x01e7
            java.lang.String r1 = "source"
            r2.put(r1, r0)     // Catch:{ Throwable -> 0x03f8 }
        L_0x01e7:
            java.lang.String r0 = "enter_from_merge"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Throwable -> 0x03f8 }
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r0 = "enter_method"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Throwable -> 0x03f8 }
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x03f8 }
        L_0x01f9:
            r27 = r1
            r28 = r5
            if (r12 == 0) goto L_0x025b
            java.lang.String r0 = "live.intent.extra.OPEN_GIFT_PANEL"
            boolean r0 = r12.getBoolean(r0)     // Catch:{ Throwable -> 0x03f8 }
            r8.h = r0     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r0 = "live.intent.extra.OPEN_GIFT_PANEL"
            r12.remove(r0)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r0 = "live.intent.extra.OPEN_PROP_PANEL"
            boolean r0 = r12.getBoolean(r0)     // Catch:{ Throwable -> 0x03f8 }
            r8.i = r0     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r0 = "live.intent.extra.OPEN_PROP_PANEL"
            r12.remove(r0)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r0 = r8.D     // Catch:{ Throwable -> 0x03f8 }
            if (r0 != 0) goto L_0x022f
            java.lang.String r0 = "live.intent.extra.REQUEST_ID"
            boolean r0 = r12.containsKey(r0)     // Catch:{ Throwable -> 0x03f8 }
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = "live.intent.extra.REQUEST_ID"
            java.lang.String r1 = ""
            java.lang.String r0 = r12.getString(r0, r1)     // Catch:{ Throwable -> 0x03f8 }
            r8.D = r0     // Catch:{ Throwable -> 0x03f8 }
        L_0x022f:
            java.lang.String r0 = r8.E     // Catch:{ Throwable -> 0x03f8 }
            if (r0 != 0) goto L_0x0245
            java.lang.String r0 = "live.intent.extra.LOG_PB"
            boolean r0 = r12.containsKey(r0)     // Catch:{ Throwable -> 0x03f8 }
            if (r0 == 0) goto L_0x0245
            java.lang.String r0 = "live.intent.extra.LOG_PB"
            java.lang.String r1 = ""
            java.lang.String r0 = r12.getString(r0, r1)     // Catch:{ Throwable -> 0x03f8 }
            r8.E = r0     // Catch:{ Throwable -> 0x03f8 }
        L_0x0245:
            long r0 = r8.ad     // Catch:{ Throwable -> 0x03f8 }
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x025b
            java.lang.String r0 = "live.intent.extra.USER_FROM"
            boolean r0 = r12.containsKey(r0)     // Catch:{ Throwable -> 0x03f8 }
            if (r0 == 0) goto L_0x025b
            java.lang.String r0 = "live.intent.extra.USER_FROM"
            long r0 = r12.getLong(r0, r3)     // Catch:{ Throwable -> 0x03f8 }
            r8.ad = r0     // Catch:{ Throwable -> 0x03f8 }
        L_0x025b:
            java.lang.String r0 = r8.E     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r13 = r8.D     // Catch:{ Throwable -> 0x03f8 }
            r14 = 3
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x03f8 }
            r1[r10] = r0     // Catch:{ Throwable -> 0x03f8 }
            r1[r9] = r13     // Catch:{ Throwable -> 0x03f8 }
            r17 = 2
            r1[r17] = r12     // Catch:{ Throwable -> 0x03f8 }
            com.meituan.robust.ChangeQuickRedirect r3 = f11597a     // Catch:{ Throwable -> 0x03f8 }
            r4 = 0
            r5 = 5995(0x176b, float:8.401E-42)
            java.lang.Class[] r6 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r6[r17] = r2     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x03f8 }
            r2 = r36
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x03f8 }
            if (r1 == 0) goto L_0x02ab
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x03f8 }
            r1[r10] = r0     // Catch:{ Throwable -> 0x03f8 }
            r1[r9] = r13     // Catch:{ Throwable -> 0x03f8 }
            r1[r17] = r12     // Catch:{ Throwable -> 0x03f8 }
            com.meituan.robust.ChangeQuickRedirect r3 = f11597a     // Catch:{ Throwable -> 0x03f8 }
            r4 = 0
            r5 = 5995(0x176b, float:8.401E-42)
            java.lang.Class[] r6 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r17] = r0     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x03f8 }
            r2 = r36
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x03f8 }
            goto L_0x0376
        L_0x02ab:
            if (r12 == 0) goto L_0x0376
            com.bytedance.android.livesdk.j.a r1 = com.bytedance.android.livesdk.j.a.a()     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r2 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            com.bytedance.android.livesdk.j.b.g r1 = r1.a((java.lang.Class) r2)     // Catch:{ Throwable -> 0x03f8 }
            if (r1 == 0) goto L_0x0376
            java.lang.String r2 = "request_id"
            r1.a((java.lang.String) r2)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "live_window_mode"
            r1.a((java.lang.String) r2)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "log_pb"
            r1.a((java.lang.String) r2)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "starlight_rank"
            r1.a((java.lang.String) r2)     // Catch:{ Throwable -> 0x03f8 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x03f8 }
            if (r2 == 0) goto L_0x02d9
            java.lang.String r0 = "log_pb"
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Throwable -> 0x03f8 }
        L_0x02d9:
            java.lang.String r2 = "log_pb"
            r1.a((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03f8 }
            boolean r2 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x03f8 }
            if (r2 == 0) goto L_0x02ea
            java.lang.String r2 = "request_id"
            java.lang.String r13 = r12.getString(r2)     // Catch:{ Throwable -> 0x03f8 }
        L_0x02ea:
            java.lang.String r2 = "request_id"
            r1.a((java.lang.String) r2, (java.lang.String) r13)     // Catch:{ Throwable -> 0x03f8 }
            boolean r2 = r1 instanceof com.bytedance.android.livesdk.j.b.n     // Catch:{ Throwable -> 0x03f8 }
            if (r2 == 0) goto L_0x0358
            r2 = r1
            com.bytedance.android.livesdk.j.b.n r2 = (com.bytedance.android.livesdk.j.b.n) r2     // Catch:{ Throwable -> 0x03f8 }
            long r3 = r8.f11598b     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x03f8 }
            r4[r10] = r3     // Catch:{ Throwable -> 0x03f8 }
            r4[r9] = r0     // Catch:{ Throwable -> 0x03f8 }
            r4[r17] = r13     // Catch:{ Throwable -> 0x03f8 }
            com.meituan.robust.ChangeQuickRedirect r31 = com.bytedance.android.livesdk.j.b.n.f15660b     // Catch:{ Throwable -> 0x03f8 }
            r32 = 0
            r33 = 10949(0x2ac5, float:1.5343E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r9] = r6     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r17] = r6     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class r35 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x03f8 }
            r29 = r4
            r30 = r2
            r34 = r5
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r29, r30, r31, r32, r33, r34, r35)     // Catch:{ Throwable -> 0x03f8 }
            if (r4 == 0) goto L_0x034e
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x03f8 }
            r4[r10] = r3     // Catch:{ Throwable -> 0x03f8 }
            r4[r9] = r0     // Catch:{ Throwable -> 0x03f8 }
            r4[r17] = r13     // Catch:{ Throwable -> 0x03f8 }
            com.meituan.robust.ChangeQuickRedirect r31 = com.bytedance.android.livesdk.j.b.n.f15660b     // Catch:{ Throwable -> 0x03f8 }
            r32 = 0
            r33 = 10949(0x2ac5, float:1.5343E-41)
            java.lang.Class[] r0 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r10] = r3     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r9] = r3     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r17] = r3     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Class r35 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x03f8 }
            r29 = r4
            r30 = r2
            r34 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r29, r30, r31, r32, r33, r34, r35)     // Catch:{ Throwable -> 0x03f8 }
            goto L_0x0358
        L_0x034e:
            java.util.Map<java.lang.String, java.lang.String> r4 = r2.f15661c     // Catch:{ Throwable -> 0x03f8 }
            r4.put(r3, r0)     // Catch:{ Throwable -> 0x03f8 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f15662d     // Catch:{ Throwable -> 0x03f8 }
            r0.put(r3, r13)     // Catch:{ Throwable -> 0x03f8 }
        L_0x0358:
            android.support.v4.app.FragmentActivity r0 = r36.getActivity()     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "feed_live_span"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r2, r10)     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = "span_count"
            int r0 = r0.getInt(r2, r10)     // Catch:{ Throwable -> 0x03f8 }
            if (r0 <= 0) goto L_0x0376
            java.lang.String r2 = "live_window_mode"
            if (r0 <= r9) goto L_0x0371
            java.lang.String r0 = "live_small_picture"
            goto L_0x0373
        L_0x0371:
            java.lang.String r0 = "live_big_picture"
        L_0x0373:
            r1.a((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03f8 }
        L_0x0376:
            com.bytedance.android.livesdk.chatroom.detail.g r0 = new com.bytedance.android.livesdk.chatroom.detail.g     // Catch:{ Throwable -> 0x03f8 }
            android.content.Context r18 = r36.getContext()     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = r8.D     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r2 = r8.E     // Catch:{ Throwable -> 0x03f8 }
            long r3 = r8.ad     // Catch:{ Throwable -> 0x03f8 }
            r17 = r0
            r19 = r1
            r20 = r2
            r21 = r3
            r25 = r12
            r17.<init>(r18, r19, r20, r21, r23, r24, r25, r26, r27, r28)     // Catch:{ Throwable -> 0x03f8 }
            r8.r = r0     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.chatroom.detail.g r12 = r8.r     // Catch:{ Throwable -> 0x03f8 }
            long r13 = r8.f11598b     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdkapi.depend.model.live.a r0 = r8.P     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdkapi.depend.model.live.a r1 = com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO     // Catch:{ Throwable -> 0x03f8 }
            if (r0 != r1) goto L_0x039c
            goto L_0x039d
        L_0x039c:
            r9 = 0
        L_0x039d:
            long r0 = r8.f11599c     // Catch:{ Throwable -> 0x03f8 }
            r19 = 0
            r2 = r15
            r15 = r9
            r17 = r0
            r12.a(r13, r15, r16, r17, r19)     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.chatroom.detail.g r0 = r8.r     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = r8.ae     // Catch:{ Throwable -> 0x03f8 }
            r0.A = r1     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.chatroom.detail.g r0 = r8.r     // Catch:{ Throwable -> 0x03f8 }
            r0.G = r2     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.player.i r0 = new com.bytedance.android.livesdk.player.i     // Catch:{ Throwable -> 0x03f8 }
            r0.<init>()     // Catch:{ Throwable -> 0x03f8 }
            r8.I = r0     // Catch:{ Throwable -> 0x03f8 }
            java.lang.Boolean r0 = K     // Catch:{ Throwable -> 0x03f8 }
            r0.booleanValue()     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.w.c<java.lang.String> r0 = com.bytedance.android.livesdk.w.b.T     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = ""
            r0.a(r1)     // Catch:{ Throwable -> 0x03f8 }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r8.G     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "time"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x03f8 }
            long r4 = r8.H     // Catch:{ Throwable -> 0x03f8 }
            r6 = 0
            long r2 = r2 - r4
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x03f8 }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x03f8 }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r8.G     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "location"
            java.lang.String r2 = "finish live play oncreate"
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdkapi.host.g r0 = r0.d()     // Catch:{ Throwable -> 0x03f8 }
            java.lang.String r1 = "feed_enter_room"
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r8.G     // Catch:{ Throwable -> 0x03f8 }
            r0.a(r1, r2)     // Catch:{ Throwable -> 0x03f8 }
            com.bytedance.android.livesdk.a.a r0 = com.bytedance.android.livesdk.a.a.a()
            r0.a((org.aspectj.lang.a) r11)
            return
        L_0x03f8:
            r0 = move-exception
            com.bytedance.android.livesdk.a.a r1 = com.bytedance.android.livesdk.a.a.a()
            r1.a((org.aspectj.lang.a) r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment.onCreate(android.os.Bundle):void");
    }

    public void onEvent(com.bytedance.android.livesdkapi.f.a aVar) {
        View view;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11597a, false, 6033, new Class[]{com.bytedance.android.livesdkapi.f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11597a, false, 6033, new Class[]{com.bytedance.android.livesdkapi.f.a.class}, Void.TYPE);
        } else if (this.A != null) {
            if (aVar.f18759b != 2) {
                if (aVar.f18759b == 1) {
                    FragmentActivity activity = getActivity();
                    if (!(activity == null || activity.getWindow() == null || !com.bytedance.android.live.core.utils.g.a(activity))) {
                        activity.getWindow().clearFlags(1024);
                    }
                    if (aVar.f18758a.equals("login")) {
                        com.bytedance.android.livesdk.w.b.T.a("");
                    }
                    if (b_() && this.n != 1) {
                        w();
                        getActivity().setRequestedOrientation(1);
                        this.T = true;
                    }
                }
            } else if (b_() && this.n != 0) {
                FragmentActivity activity2 = getActivity();
                if (!(this.A == null || activity2 == null || activity2.getWindow() == null)) {
                    com.bytedance.android.livesdkapi.depend.d.m g = r().g();
                    View view2 = this.A.getView();
                    View view3 = this.A.k;
                    if (this.A == null) {
                        view = null;
                    } else {
                        view = this.A.l;
                    }
                    g.a(false, view2, view3, view, this.A.c());
                }
                w();
                getActivity().setRequestedOrientation(0);
                this.T = true;
            }
        }
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.drs), Integer.valueOf(i3)}, this, f11597a, false, 6014, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.drs), Integer.valueOf(i3)}, this, f11597a, false, 6014, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.ag != null) {
            View findViewById = this.ag.findViewById(C0906R.id.drs);
            if (!(findViewById == null || findViewById.getVisibility() == i3)) {
                findViewById.setVisibility(i3);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f11597a, false, 5985, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f11597a, false, 5985, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.ag = view;
        this.z = (TextureView) view.findViewById(C0906R.id.dt9);
        if (this.z instanceof com.bytedance.android.livesdkapi.view.b) {
            ((com.bytedance.android.livesdkapi.view.b) this.z).setScaleType(2);
        }
        this.V = (HSImageView) view.findViewById(C0906R.id.bd3);
        this.W = view.findViewById(C0906R.id.bej);
        this.X = (CircularProgressView) view.findViewById(C0906R.id.beh);
        this.Y = (LottieAnimationView) view.findViewById(C0906R.id.beg);
        this.ab = (ViewStub) view.findViewById(C0906R.id.r_);
        this.Z = (HSImageView) view.findViewById(C0906R.id.c_2);
        this.aa = view.findViewById(C0906R.id.c_3);
        if (this.P == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
            this.V.setBackgroundResource(2130840792);
        } else if (Lists.notEmpty(this.L)) {
            float screenWidth = ((float) UIUtils.getScreenWidth(getContext())) / ((float) UIUtils.getScreenHeight(getContext()));
            com.bytedance.android.livesdk.chatroom.f.b.a(this.V, new ImageModel(null, this.L), (Postprocessor) new u(5, screenWidth, null));
            com.bytedance.android.livesdk.chatroom.f.b.a((HSImageView) view.findViewById(C0906R.id.drs), new ImageModel(null, this.L), (Postprocessor) new u(8, screenWidth, null));
        } else {
            float screenWidth2 = ((float) UIUtils.getScreenWidth(getContext())) / ((float) UIUtils.getScreenHeight(getContext()));
            String str = "res://" + getContext().getPackageName() + "/2130841224";
            com.bytedance.android.livesdk.chatroom.f.b.a(this.V, str, (Postprocessor) new u(5, screenWidth2, null));
            com.bytedance.android.livesdk.chatroom.f.b.a((HSImageView) view.findViewById(C0906R.id.drs), str, (Postprocessor) new u(8, screenWidth2, null));
        }
        b("init");
        this.z.setVisibility(8);
        if (com.bytedance.android.livesdkapi.a.a.f18616d) {
            this.X.setVisibility(8);
        } else {
            this.Y.setVisibility(8);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f11597a, false, 5984, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return LayoutInflater.from(getContext()).inflate(C0906R.layout.aid, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f11597a, false, 5984, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    private void a(String str, com.bytedance.android.livesdkapi.depend.model.live.a aVar, @Nullable f.a aVar2, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, aVar, aVar2, str2}, this, f11597a, false, 6010, new Class[]{String.class, com.bytedance.android.livesdkapi.depend.model.live.a.class, f.a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar, aVar2, str2}, this, f11597a, false, 6010, new Class[]{String.class, com.bytedance.android.livesdkapi.depend.model.live.a.class, f.a.class, String.class}, Void.TYPE);
        } else if (this.t == null) {
            if (this.z == null) {
                com.ss.b.a.a.e("LivePlayFragment", "startPlayer  mVideoView is null");
                return;
            }
            K.booleanValue();
            this.z.setVisibility(0);
            if (!this.y) {
                b("start player");
            }
            TextureView textureView = this.z;
            AnonymousClass11 r13 = new RoomPlayer.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11605a;

                /* renamed from: c  reason: collision with root package name */
                private long f11607c;

                /* renamed from: d  reason: collision with root package name */
                private Queue<Long> f11608d = new LinkedList();

                public final void j() {
                    if (PatchProxy.isSupport(new Object[0], this, f11605a, false, 6074, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11605a, false, 6074, new Class[0], Void.TYPE);
                    } else if (!LivePlayFragment.this.v && LivePlayFragment.this.z.getVisibility() == 0) {
                        LivePlayFragment.this.j();
                    }
                }

                public final void l() {
                    if (PatchProxy.isSupport(new Object[0], this, f11605a, false, 6077, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11605a, false, 6077, new Class[0], Void.TYPE);
                    } else if (a()) {
                        this.f11607c = SystemClock.elapsedRealtime();
                    }
                }

                private boolean a() {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[0], this, f11605a, false, 6081, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11605a, false, 6081, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    if (LivePlayFragment.this.j && !TextUtils.equals(LivePlayFragment.this.m, LivePlayFragment.this.l) && com.bytedance.android.live.uikit.a.a.d()) {
                        z = true;
                    }
                    return z;
                }

                public final void m() {
                    if (PatchProxy.isSupport(new Object[0], this, f11605a, false, 6078, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11605a, false, 6078, new Class[0], Void.TYPE);
                    } else if (a() && this.f11607c != 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - this.f11607c > 3000) {
                            com.bytedance.android.livesdk.utils.ai.a(LivePlayFragment.this.getString(C0906R.string.d_h));
                            this.f11608d.clear();
                            return;
                        }
                        if (elapsedRealtime - this.f11607c > 1000) {
                            this.f11608d.add(Long.valueOf(elapsedRealtime));
                            if (this.f11608d.size() >= 3 && elapsedRealtime - this.f11608d.poll().longValue() < 10000) {
                                com.bytedance.android.livesdk.utils.ai.a(LivePlayFragment.this.getString(C0906R.string.d_h));
                            }
                        }
                    }
                }

                public final void k() {
                    if (PatchProxy.isSupport(new Object[0], this, f11605a, false, 6076, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11605a, false, 6076, new Class[0], Void.TYPE);
                        return;
                    }
                    LivePlayFragment.this.G.put("time", String.valueOf(System.currentTimeMillis() - LivePlayFragment.this.H));
                    LivePlayFragment.this.G.put("location", " after onPlayDisplayed");
                    TTLiveSDKContext.getHostService().d().a("feed_enter_room", LivePlayFragment.this.G);
                    g gVar = LivePlayFragment.this.r;
                    if (PatchProxy.isSupport(new Object[0], gVar, g.f9939a, false, 4082, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], gVar, g.f9939a, false, 4082, new Class[0], Void.TYPE);
                    } else if (!gVar.m) {
                        gVar.m = true;
                        if (gVar.p != null) {
                            gVar.q = gVar.p.a();
                        } else {
                            gVar.q = SystemClock.elapsedRealtime() - gVar.o;
                        }
                    }
                    LivePlayFragment.this.r.a(true, false);
                    int[] iArr = new int[2];
                    LivePlayFragment.this.t.getVideoSize(iArr);
                    if (!(iArr[0] == 0 || iArr[1] == 0)) {
                        LivePlayFragment.this.a(iArr[0], iArr[1], UIUtils.getScreenWidth(LivePlayFragment.this.getContext()));
                        if (LivePlayFragment.this.A != null) {
                            LivePlayFragment.this.o.lambda$put$1$DataCenter("cmd_video_orientation_changed", new ai(LivePlayFragment.this.k, LivePlayFragment.this.p));
                        }
                    }
                    LivePlayFragment.this.k();
                    if (!LivePlayFragment.this.x) {
                        LivePlayFragment.this.a("first frame");
                    } else {
                        LivePlayFragment livePlayFragment = LivePlayFragment.this;
                        if (PatchProxy.isSupport(new Object[]{"first frame but in illegal status"}, livePlayFragment, LivePlayFragment.f11597a, false, 6022, new Class[]{String.class}, Void.TYPE)) {
                            LivePlayFragment livePlayFragment2 = livePlayFragment;
                            PatchProxy.accessDispatch(new Object[]{"first frame but in illegal status"}, livePlayFragment2, LivePlayFragment.f11597a, false, 6022, new Class[]{String.class}, Void.TYPE);
                        } else {
                            livePlayFragment.a(true, "first frame but in illegal status");
                        }
                        LivePlayFragment.this.t.setMute(true);
                    }
                    LivePlayFragment.this.f();
                    if (LivePlayFragment.this.y) {
                        LivePlayFragment.this.y = false;
                        com.bytedance.android.livesdk.utils.ai.a(LivePlayFragment.this.getString(C0906R.string.ddc));
                    }
                    LivePlayFragment.this.r().g().a();
                }

                public final void a(Exception exc) {
                    if (PatchProxy.isSupport(new Object[]{exc}, this, f11605a, false, 6080, new Class[]{Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{exc}, this, f11605a, false, 6080, new Class[]{Exception.class}, Void.TYPE);
                        return;
                    }
                    LivePlayFragment.this.r.a(false, 105, "ttplayer init failed");
                    LivePlayFragment.this.I.a(105, "ttplayer init failed", LivePlayFragment.this.f11598b);
                    LivePlayFragment.this.a(105, "ttplayer init failed", LivePlayFragment.this.f11598b);
                    LivePlayFragment.this.a(a.PLAYER_ERROR);
                }

                public final void a(Object obj) {
                    boolean z;
                    Object obj2 = obj;
                    if (PatchProxy.isSupport(new Object[]{obj2}, this, f11605a, false, 6075, new Class[]{Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj2}, this, f11605a, false, 6075, new Class[]{Object.class}, Void.TYPE);
                    } else if (LivePlayFragment.this.A != null && (LivePlayFragment.this.A instanceof PortraitInteractionFragment) && (obj2 instanceof String)) {
                        if (!((Boolean) com.bytedance.android.livesdk.app.dataholder.d.a().f9041c).booleanValue() || 2 == ((Integer) com.bytedance.android.livesdk.app.dataholder.e.a().f9041c).intValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolean z2 = LinkCrossRoomDataHolder.a().f9029c;
                        if (z || z2) {
                            PortraitInteractionFragment portraitInteractionFragment = (PortraitInteractionFragment) LivePlayFragment.this.A;
                            String str = (String) obj2;
                            if (PatchProxy.isSupport(new Object[]{str}, portraitInteractionFragment, PortraitInteractionFragment.S, false, 6314, new Class[]{String.class}, Void.TYPE)) {
                                PortraitInteractionFragment portraitInteractionFragment2 = portraitInteractionFragment;
                                PatchProxy.accessDispatch(new Object[]{str}, portraitInteractionFragment2, PortraitInteractionFragment.S, false, 6314, new Class[]{String.class}, Void.TYPE);
                            } else if (portraitInteractionFragment.V != null) {
                                LinkControlWidget linkControlWidget = portraitInteractionFragment.V;
                                if (PatchProxy.isSupport(new Object[]{str}, linkControlWidget, LinkControlWidget.f12576a, false, 6942, new Class[]{String.class}, Void.TYPE)) {
                                    LinkControlWidget linkControlWidget2 = linkControlWidget;
                                    PatchProxy.accessDispatch(new Object[]{str}, linkControlWidget2, LinkControlWidget.f12576a, false, 6942, new Class[]{String.class}, Void.TYPE);
                                } else if (!linkControlWidget.i) {
                                    if (linkControlWidget.j == 1) {
                                        if (linkControlWidget.f12578c != null) {
                                            LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = linkControlWidget.f12578c;
                                            if (PatchProxy.isSupport(new Object[]{str}, linkInRoomVideoGuestWidget, LinkInRoomVideoGuestWidget.f10253a, false, 4384, new Class[]{String.class}, Void.TYPE)) {
                                                LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget2 = linkInRoomVideoGuestWidget;
                                                PatchProxy.accessDispatch(new Object[]{str}, linkInRoomVideoGuestWidget2, LinkInRoomVideoGuestWidget.f10253a, false, 4384, new Class[]{String.class}, Void.TYPE);
                                            } else {
                                                if (linkInRoomVideoGuestWidget.f10257e != null) {
                                                    com.bytedance.android.livesdk.chatroom.interact.e.g gVar = linkInRoomVideoGuestWidget.f10257e;
                                                    if (PatchProxy.isSupport(new Object[]{str}, gVar, com.bytedance.android.livesdk.chatroom.interact.e.g.f10909a, false, 5090, new Class[]{String.class}, Void.TYPE)) {
                                                        com.bytedance.android.livesdk.chatroom.interact.e.g gVar2 = gVar;
                                                        PatchProxy.accessDispatch(new Object[]{str}, gVar2, com.bytedance.android.livesdk.chatroom.interact.e.g.f10909a, false, 5090, new Class[]{String.class}, Void.TYPE);
                                                    } else if (gVar.l && gVar.j) {
                                                        gVar.h.a(str);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (linkControlWidget.j == 2) {
                                        LinkCrossRoomWidget linkCrossRoomWidget = linkControlWidget.f12579d;
                                        if (PatchProxy.isSupport(new Object[]{str}, linkCrossRoomWidget, LinkCrossRoomWidget.f12600a, false, 7000, new Class[]{String.class}, Void.TYPE)) {
                                            LinkCrossRoomWidget linkCrossRoomWidget2 = linkCrossRoomWidget;
                                            PatchProxy.accessDispatch(new Object[]{str}, linkCrossRoomWidget2, LinkCrossRoomWidget.f12600a, false, 7000, new Class[]{String.class}, Void.TYPE);
                                        } else if (!linkCrossRoomWidget.f12601b && linkCrossRoomWidget.f12604e != null) {
                                            linkCrossRoomWidget.f12604e.a(str);
                                            if (linkCrossRoomWidget.g && ((Boolean) LiveConfigSettingKeys.LIVE_PK_SEI_UPDATE.a()).booleanValue()) {
                                                ((aa) Single.just(str).map(new bg(str)).filter(bh.f13022b).as(linkCrossRoomWidget.autoDisposeWithTransformer())).a(new bi(linkCrossRoomWidget), bj.f13026b);
                                            }
                                        }
                                    } else if (linkControlWidget.j == 3) {
                                        LinkInRoomAudioWidget linkInRoomAudioWidget = linkControlWidget.f12580e;
                                        if (PatchProxy.isSupport(new Object[]{str}, linkInRoomAudioWidget, LinkInRoomAudioWidget.f12610a, false, 7042, new Class[]{String.class}, Void.TYPE)) {
                                            LinkInRoomAudioWidget linkInRoomAudioWidget2 = linkInRoomAudioWidget;
                                            PatchProxy.accessDispatch(new Object[]{str}, linkInRoomAudioWidget2, LinkInRoomAudioWidget.f12610a, false, 7042, new Class[]{String.class}, Void.TYPE);
                                        } else if (!linkInRoomAudioWidget.k && linkInRoomAudioWidget.f12615f != null) {
                                            linkInRoomAudioWidget.f12615f.a(str);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                public final void a(int i, int i2) {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f11605a, false, 6079, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f11605a, false, 6079, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    LivePlayFragment livePlayFragment = LivePlayFragment.this;
                    if (i > i2) {
                        z = true;
                    }
                    livePlayFragment.k = z;
                    if (LivePlayFragment.this.k || LivePlayFragment.this.n != 0) {
                        if (!(i == 0 || i2 == 0)) {
                            LivePlayFragment.this.a(i, i2, UIUtils.getScreenWidth(LivePlayFragment.this.getContext()));
                        }
                        if (LivePlayFragment.this.A != null) {
                            LivePlayFragment.this.o.lambda$put$1$DataCenter("cmd_video_orientation_changed", new ai(LivePlayFragment.this.k, LivePlayFragment.this.p));
                        }
                    } else if (LivePlayFragment.this.A != null) {
                        LivePlayFragment.this.onEvent(new com.bytedance.android.livesdkapi.f.a(1));
                    } else {
                        LivePlayFragment.this.getActivity().setRequestedOrientation(1);
                        LivePlayFragment.this.n = 1;
                        LivePlayFragment.this.t.setScreenOrientation(true);
                    }
                }
            };
            boolean z2 = false;
            RoomPlayer roomPlayer = new RoomPlayer(str, aVar, aVar2, textureView, r13, getContext(), str2);
            this.t = roomPlayer;
            this.t.start();
            this.t.setAnchorInteractMode(this.Q);
            RoomPlayer roomPlayer2 = this.t;
            if (this.n == 1) {
                z2 = true;
            }
            roomPlayer2.setScreenOrientation(z2);
            if (com.bytedance.android.livesdkapi.a.a.f18616d) {
                j();
            } else {
                k();
            }
        }
    }
}
