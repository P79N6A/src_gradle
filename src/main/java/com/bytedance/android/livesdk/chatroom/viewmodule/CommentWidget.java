package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.l;
import com.bytedance.android.livesdk.chatroom.bl.m;
import com.bytedance.android.livesdk.chatroom.event.ad;
import com.bytedance.android.livesdk.chatroom.event.ae;
import com.bytedance.android.livesdk.chatroom.event.ag;
import com.bytedance.android.livesdk.chatroom.event.am;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.presenter.b;
import com.bytedance.android.livesdk.chatroom.presenter.d;
import com.bytedance.android.livesdk.chatroom.ui.LiveInputDialogFragment;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.message.model.ay;
import com.bytedance.android.livesdk.message.model.e;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.n;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.aspectj.lang.a;
import org.json.JSONObject;

public class CommentWidget extends LiveRecyclableWidget implements Observer<KVData>, View.OnClickListener, b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12395a;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12396e = ac.a(200.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final int f12397f = ac.a(128.0f);
    private static final /* synthetic */ a.C0900a y;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12398b;

    /* renamed from: c  reason: collision with root package name */
    public Room f12399c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12400d;
    public LiveInputDialogFragment g;
    public LiveInputDialogFragment.b h = new LiveInputDialogFragment.b();
    public Runnable i = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12403a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f12403a, false, 6643, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12403a, false, 6643, new Class[0], Void.TYPE);
                return;
            }
            if (CommentWidget.this.isViewValid()) {
                CommentWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new ag(1, "live_detail"));
            }
        }
    };
    private View j;
    private View k;
    private View l;
    private Activity m;
    private String n;
    private String o;
    private boolean p;
    private boolean q = true;
    private b r;
    private String s;
    private boolean t;
    private boolean u;
    private ay v;
    private LiveInputDialogFragment.c w = new LiveInputDialogFragment.c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12401a;

        public final void a(LiveInputDialogFragment.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f12401a, false, 6642, new Class[]{LiveInputDialogFragment.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f12401a, false, 6642, new Class[]{LiveInputDialogFragment.b.class}, Void.TYPE);
                return;
            }
            CommentWidget.this.g = null;
            CommentWidget.this.h = bVar;
            if (com.bytedance.android.live.uikit.a.a.f()) {
                com.bytedance.android.livesdk.w.b.aq.a(Boolean.valueOf(bVar.f11592a));
            }
        }

        public final void a(String str, boolean z) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12401a, false, 6641, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f12401a, false, 6641, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            CommentWidget.this.a(str2, z, false);
        }
    };
    private LiveInputDialogFragment.a x = new LiveInputDialogFragment.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12405a;

        public final boolean d() {
            return CommentWidget.this.f12398b;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f12405a, false, 6645, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12405a, false, 6645, new Class[0], Void.TYPE);
                return;
            }
            CommentWidget.this.containerView.post(CommentWidget.this.i);
        }

        public final boolean c() {
            if (!PatchProxy.isSupport(new Object[0], this, f12405a, false, 6644, new Class[0], Boolean.TYPE)) {
                return ((Boolean) CommentWidget.this.dataCenter.get("data_is_portrait", Boolean.TRUE)).booleanValue();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f12405a, false, 6644, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final int e() {
            if (PatchProxy.isSupport(new Object[0], this, f12405a, false, 6648, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f12405a, false, 6648, new Class[0], Integer.TYPE)).intValue();
            } else if (CommentWidget.this.f12399c == null) {
                return 0;
            } else {
                return CommentWidget.this.f12399c.getOrientation();
            }
        }

        public final User b() {
            if (PatchProxy.isSupport(new Object[0], this, f12405a, false, 6646, new Class[0], User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[0], this, f12405a, false, 6646, new Class[0], User.class);
            } else if (CommentWidget.this.dataCenter != null) {
                return (User) CommentWidget.this.dataCenter.get("data_user_in_room");
            } else {
                return User.from(TTLiveSDKContext.getHostService().k().a());
            }
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f12405a, false, 6647, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f12405a, false, 6647, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (CommentWidget.this.dataCenter != null) {
                CommentWidget.this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.FALSE);
            }
        }
    };

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12395a, false, 6638, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12395a, false, 6638, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12395a, false, 6639, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12395a, false, 6639, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.am1;
    }

    public final void a(String str, boolean z, boolean z2) {
        String str2 = str;
        boolean z3 = z;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12395a, false, 6631, new Class[]{String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f12395a, false, 6631, new Class[]{String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.s = str2;
        this.t = z3;
        this.u = z2;
        if (!TTLiveSDKContext.getHostService().k().c()) {
            TTLiveSDKContext.getHostService().k().a(this.context, i.a().a(ac.a((int) C0906R.string.csf)).c("comment_live").a(-1).a()).compose(getAutoUnbindTransformer()).subscribe((io.reactivex.Observer<? super T>) new g<Object>());
        } else if (!TTLiveSDKContext.getHostService().k().a(h.COMMENT)) {
            if (this.q) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new ae(true, 0));
                this.q = false;
            }
            if (!z3) {
                b bVar = this.r;
                String str3 = this.o;
                if (PatchProxy.isSupport(new Object[]{str2, str3}, bVar, b.f11261a, false, 5132, new Class[]{String.class, String.class}, Void.TYPE)) {
                    Object[] objArr = {str2, str3};
                    ChangeQuickRedirect changeQuickRedirect = b.f11261a;
                    PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, 5132, new Class[]{String.class, String.class}, Void.TYPE);
                } else if (!TextUtils.isEmpty(str) && bVar.f11263c) {
                    bVar.f11263c = false;
                    bVar.f11266f = 0;
                    com.bytedance.android.livesdk.chatroom.bl.h.a().a(bVar.f11264d, bVar.f11265e.getRequestId(), str3, bVar.f11265e.getId(), str, bVar.f11265e.getLabels());
                }
            } else if (str.length() > 15) {
                com.bytedance.android.live.uikit.d.a.a(this.context, (int) C0906R.string.d14);
            } else {
                b bVar2 = this.r;
                String str4 = this.o;
                if (PatchProxy.isSupport(new Object[]{str2, str4}, bVar2, b.f11261a, false, 5133, new Class[]{String.class, String.class}, Void.TYPE)) {
                    Object[] objArr2 = {str2, str4};
                    b bVar3 = bVar2;
                    ChangeQuickRedirect changeQuickRedirect2 = b.f11261a;
                    PatchProxy.accessDispatch(objArr2, bVar3, changeQuickRedirect2, false, 5133, new Class[]{String.class, String.class}, Void.TYPE);
                } else if (!TextUtils.isEmpty(str) && bVar2.f11262b) {
                    bVar2.f11262b = false;
                    com.bytedance.android.livesdk.chatroom.bl.h a2 = com.bytedance.android.livesdk.chatroom.bl.h.a();
                    com.bytedance.android.livesdkapi.depend.c.a aVar = bVar2.f11264d;
                    String requestId = bVar2.f11265e.getRequestId();
                    long id = bVar2.f11265e.getId();
                    String labels = bVar2.f11265e.getLabels();
                    if (PatchProxy.isSupport(new Object[]{aVar, str2, requestId, str4, new Long(id), labels}, a2, com.bytedance.android.livesdk.chatroom.bl.h.f9797a, false, 4000, new Class[]{Handler.class, String.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
                        com.bytedance.android.livesdk.chatroom.bl.h hVar = a2;
                        PatchProxy.accessDispatch(new Object[]{aVar, str2, requestId, str4, new Long(id), labels}, hVar, com.bytedance.android.livesdk.chatroom.bl.h.f9797a, false, 4000, new Class[]{Handler.class, String.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
                    } else {
                        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).sendBarrage(new o().a(PushConstants.CONTENT, str2).a("room_id", String.valueOf(id)).a("common_label_list", String.valueOf(labels)).a("request_id", requestId).a("enter_source", str4).f17622b).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new l(aVar), new m(aVar));
                    }
                }
            }
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f12395a, false, 6625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12395a, false, 6625, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            this.g.a("");
        } else {
            this.h.f11595d = "";
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12395a, false, 6633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12395a, false, 6633, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null && isViewValid()) {
            this.g.a();
            this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.FALSE);
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12395a, true, 6637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12395a, true, 6637, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("CommentWidget.java", CommentWidget.class);
            y = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 322);
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f12395a, false, 6620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12395a, false, 6620, new Class[0], Void.TYPE);
        } else if (!com.bytedance.android.live.uikit.a.a.d()) {
            if (com.bytedance.android.live.uikit.a.a.f() && this.f12398b) {
                return;
            }
            if (!com.bytedance.android.live.uikit.a.a.f() || this.f12400d) {
                final ViewGroup.LayoutParams layoutParams = this.contentView.getLayoutParams();
                layoutParams.width = -1;
                this.contentView.setLayoutParams(layoutParams);
                this.contentView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12409a;

                    public final void onGlobalLayout() {
                        if (PatchProxy.isSupport(new Object[0], this, f12409a, false, 6650, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f12409a, false, 6650, new Class[0], Void.TYPE);
                            return;
                        }
                        int width = CommentWidget.this.contentView.getWidth();
                        if (CommentWidget.this.f12400d) {
                            if (width > CommentWidget.f12397f && !com.bytedance.android.live.uikit.a.a.f()) {
                                layoutParams.width = CommentWidget.f12397f;
                            }
                        } else if (width > CommentWidget.f12396e) {
                            layoutParams.width = CommentWidget.f12396e;
                        }
                        CommentWidget.this.contentView.setLayoutParams(layoutParams);
                        if (Build.VERSION.SDK_INT >= 16) {
                            CommentWidget.this.contentView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            CommentWidget.this.contentView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                    }
                });
            }
        }
    }

    public final void b() {
        Context context;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f12395a, false, 6627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12395a, false, 6627, new Class[0], Void.TYPE);
            return;
        }
        if ((this.j instanceof TextView) && com.bytedance.android.live.uikit.a.a.f() && this.f12399c != null && this.f12399c.mRoomAuthStatus != null) {
            TextView textView = (TextView) this.j;
            if (this.f12399c.mRoomAuthStatus.enableChat) {
                context = getContext();
                i2 = C0906R.string.cqv;
            } else {
                context = getContext();
                i2 = C0906R.string.cq8;
            }
            UIUtils.setText(textView, context.getString(i2));
        }
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12395a, false, 6618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12395a, false, 6618, new Class[0], Void.TYPE);
            return;
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.r.d();
        this.p = false;
        this.q = true;
        this.s = null;
        this.t = false;
        this.u = false;
        this.v = null;
        if (this.g != null) {
            this.g.dismissAllowingStateLoss();
            this.g = null;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12395a, false, 6622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12395a, false, 6622, new Class[0], Void.TYPE);
        } else if (this.g == null) {
            if (com.bytedance.android.live.uikit.a.a.f() && this.f12399c != null && this.f12399c.mRoomAuthStatus != null && !this.f12399c.mRoomAuthStatus.enableChat) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.m, (int) C0906R.string.cq7);
            } else if (com.bytedance.android.live.uikit.a.a.a() && !TTLiveSDKContext.getHostService().k().c()) {
                TTLiveSDKContext.getHostService().k().a(this.context, i.a().a(ac.a((int) C0906R.string.csf)).c("comment_live").a(-1).a()).compose(getAutoUnbindTransformer()).subscribe((io.reactivex.Observer<? super T>) new g<Object>());
            } else if (!TTLiveSDKContext.getHostService().k().a(h.COMMENT)) {
                if (!this.h.f11594c) {
                    this.p = true;
                    this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.TRUE);
                    if (!(this.f12399c == null || this.f12399c.mRoomAuthStatus == null)) {
                        this.h.f11596e = this.f12399c.mRoomAuthStatus.enableDanmaku;
                        if (com.bytedance.android.live.uikit.a.a.f()) {
                            this.h.f11592a = ((Boolean) com.bytedance.android.livesdk.w.b.aq.a()).booleanValue();
                        }
                    }
                    this.g = LiveInputDialogFragment.a(this.h, this.x);
                    this.g.l = this.w;
                    try {
                        this.g.show(((FragmentActivity) this.m).getSupportFragmentManager(), "INPUT");
                    } catch (IllegalStateException unused) {
                        this.g = null;
                    }
                } else {
                    com.bytedance.android.live.uikit.d.a.a((Context) this.m, (int) C0906R.string.deg);
                }
            }
        }
    }

    public final void a(boolean z) {
        this.h.f11596e = z;
    }

    public void onEvent(am amVar) {
        if (PatchProxy.isSupport(new Object[]{amVar}, this, f12395a, false, 6634, new Class[]{am.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{amVar}, this, f12395a, false, 6634, new Class[]{am.class}, Void.TYPE);
            return;
        }
        a(amVar);
    }

    private void a(com.bytedance.android.live.a.a.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12395a, false, 6630, new Class[]{com.bytedance.android.live.a.a.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12395a, false, 6630, new Class[]{com.bytedance.android.live.a.a.b.a.class}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.core.network.b.a.a(aVar) && ((Boolean) LiveSettingKeys.ENABLE_COMMENT_BIND_PHONE.a()).booleanValue()) {
            TTLiveSDKContext.getHostService().c().a(this.m, "live_detail", "live_detail", new m(this));
        }
    }

    public void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f12395a, false, 6621, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f12395a, false, 6621, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(y, this, this, view2));
        int id = view.getId();
        if (id == C0906R.id.a8i || id == C0906R.id.a8j || id == C0906R.id.a8j || id == C0906R.id.d7g) {
            c();
        }
    }

    private void a(final am amVar) {
        if (PatchProxy.isSupport(new Object[]{amVar}, this, f12395a, false, 6632, new Class[]{am.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{amVar}, this, f12395a, false, 6632, new Class[]{am.class}, Void.TYPE);
        } else if (amVar.f10158a == 1) {
            this.contentView.postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12412a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f12412a, false, 6651, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12412a, false, 6651, new Class[0], Void.TYPE);
                    } else if (CommentWidget.this.isViewValid()) {
                        String a2 = n.a("@%s ", amVar.f10159b);
                        if (CommentWidget.this.g != null) {
                            CommentWidget.this.g.a(a2);
                            return;
                        }
                        CommentWidget.this.h.f11595d = a2;
                        CommentWidget.this.c();
                    }
                }
            }, 500);
        } else if (amVar.f10158a == 2) {
            this.contentView.postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12415a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f12415a, false, 6652, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12415a, false, 6652, new Class[0], Void.TYPE);
                    } else if (CommentWidget.this.isViewValid()) {
                        if (CommentWidget.this.g != null) {
                            LiveInputDialogFragment liveInputDialogFragment = CommentWidget.this.g;
                            boolean z = amVar.f10160c;
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, liveInputDialogFragment, LiveInputDialogFragment.f11578a, false, 5967, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                LiveInputDialogFragment liveInputDialogFragment2 = liveInputDialogFragment;
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, liveInputDialogFragment2, LiveInputDialogFragment.f11578a, false, 5967, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else if (liveInputDialogFragment.isAdded() && !liveInputDialogFragment.j && ((!liveInputDialogFragment.i || !z) && (liveInputDialogFragment.i || z))) {
                                liveInputDialogFragment.i = z;
                                if (z) {
                                    liveInputDialogFragment.f11579b.a(true);
                                } else {
                                    liveInputDialogFragment.f11579b.b(true);
                                }
                                liveInputDialogFragment.b();
                            }
                        } else {
                            CommentWidget.this.h.f11592a = amVar.f10160c;
                            CommentWidget.this.c();
                        }
                    }
                }
            }, 500);
        } else {
            c();
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f12395a, false, 6626, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f12395a, false, 6626, new Class[]{Exception.class}, Void.TYPE);
        } else if (exc instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) exc;
            int errorCode = aVar.getErrorCode();
            if (50001 == errorCode) {
                b(true);
            } else {
                if (50004 == errorCode) {
                    f();
                    d();
                }
                com.bytedance.android.live.uikit.d.a.a((Context) this.m, aVar.getPrompt());
            }
            a(aVar);
        } else {
            ai.a((int) C0906R.string.d0j);
        }
    }

    public final void a(Barrage barrage) {
        if (PatchProxy.isSupport(new Object[]{barrage}, this, f12395a, false, 6628, new Class[]{Barrage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{barrage}, this, f12395a, false, 6628, new Class[]{Barrage.class}, Void.TYPE);
        } else if (isViewValid()) {
            f();
            if (TextUtils.isEmpty(barrage.getOrderId())) {
                ai.a((int) C0906R.string.d13);
                return;
            }
            j.q().n().a(barrage.getLeftDiamond());
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("live_source", this.n);
                if (!TextUtils.isEmpty(this.f12399c.getSourceType())) {
                    hashMap.put("moment_room_source", this.f12399c.getSourceType());
                }
            } catch (Exception unused) {
            }
            if (com.bytedance.android.live.uikit.a.a.d()) {
                Context context = getContext();
                Room room = this.f12399c;
                if (PatchProxy.isSupport(new Object[]{context, room, 1}, null, com.bytedance.android.livesdk.r.a.f16870a, true, 12847, new Class[]{Context.class, Room.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, room, 1}, null, com.bytedance.android.livesdk.r.a.f16870a, true, 12847, new Class[]{Context.class, Room.class, Integer.TYPE}, Void.TYPE);
                } else if (!(context == null || room == null)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("bullet_screen_value", 1);
                    } catch (Exception unused2) {
                    }
                    com.bytedance.android.livesdk.r.a.a(context, room.getId(), "bullet_screen", jSONObject);
                }
            }
            com.bytedance.android.livesdk.j.a.a().a("send_barrage", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_interact"), Room.class);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12395a, false, 6623, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12395a, false, 6623, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && !this.f12398b) {
            if (this.g != null) {
                this.g.a(z);
            } else {
                this.h.f11594c = z;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r0.equals("cmd_do_send_message") != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.bytedance.ies.sdk.widgets.KVData r7 = (com.bytedance.ies.sdk.widgets.KVData) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12395a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6635(0x19eb, float:9.298E-42)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12395a
            r3 = 0
            r4 = 6635(0x19eb, float:9.298E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            boolean r0 = r10.isViewValid()
            if (r0 == 0) goto L_0x00fc
            if (r7 == 0) goto L_0x00fc
            java.lang.String r0 = r7.getKey()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r7.getData()
            if (r0 != 0) goto L_0x0049
            goto L_0x00fc
        L_0x0049:
            java.lang.String r0 = r7.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = 4
            switch(r2) {
                case -1679741667: goto L_0x007e;
                case -1548871708: goto L_0x0074;
                case -657921921: goto L_0x006b;
                case 1060055221: goto L_0x0061;
                case 1939188655: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x0088
        L_0x0057:
            java.lang.String r2 = "data_screen_record_is_open"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r8 = 2
            goto L_0x0089
        L_0x0061:
            java.lang.String r2 = "data_keyboard_status"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r8 = 3
            goto L_0x0089
        L_0x006b:
            java.lang.String r2 = "cmd_do_send_message"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0074:
            java.lang.String r2 = "cmd_hide_in_douyin_commerce"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r8 = 4
            goto L_0x0089
        L_0x007e:
            java.lang.String r2 = "cmd_wanna_send_message"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r8 = 0
            goto L_0x0089
        L_0x0088:
            r8 = -1
        L_0x0089:
            switch(r8) {
                case 0: goto L_0x00f1;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00a5;
                case 4: goto L_0x008d;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x00fb
        L_0x008d:
            java.lang.Object r0 = r7.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009f
            android.view.View r0 = r10.contentView
            r0.setVisibility(r3)
            return
        L_0x009f:
            android.view.View r0 = r10.contentView
            r0.setVisibility(r9)
            goto L_0x00fb
        L_0x00a5:
            java.lang.Object r0 = r7.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b7
            android.view.View r0 = r10.contentView
            r0.setVisibility(r3)
            return
        L_0x00b7:
            android.view.View r0 = r10.contentView
            r0.setVisibility(r9)
            r10.p = r9
            return
        L_0x00bf:
            java.lang.Object r0 = r7.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r10.p
            if (r0 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r3 = 0
        L_0x00d1:
            android.view.View r0 = r10.contentView
            r0.setVisibility(r3)
            return
        L_0x00d7:
            java.lang.Object r0 = r7.getData()
            com.bytedance.android.livesdk.chatroom.event.g r0 = (com.bytedance.android.livesdk.chatroom.event.g) r0
            if (r0 == 0) goto L_0x00fb
            boolean r1 = r0.f10173b
            if (r1 == 0) goto L_0x00e9
            java.lang.Object r1 = r0.f10174c
            com.bytedance.android.livesdk.message.model.ay r1 = (com.bytedance.android.livesdk.message.model.ay) r1
            r10.v = r1
        L_0x00e9:
            java.lang.String r1 = r0.f10172a
            boolean r0 = r0.f10173b
            r10.a(r1, r9, r0)
            return
        L_0x00f1:
            java.lang.Object r0 = r7.getData()
            com.bytedance.android.livesdk.chatroom.event.am r0 = (com.bytedance.android.livesdk.chatroom.event.am) r0
            r10.a((com.bytedance.android.livesdk.chatroom.event.am) r0)
            return
        L_0x00fb:
            return
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.onChanged(java.lang.Object):void");
    }

    public void onInit(Object... objArr) {
        String str;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12395a, false, 6616, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12395a, false, 6616, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12398b = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12399c = (Room) this.dataCenter.get("data_room");
        this.f12400d = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.o = (String) this.dataCenter.get("log_enter_live_source");
        this.m = (Activity) this.context;
        this.r = new b();
        if (PatchProxy.isSupport(new Object[0], this, f12395a, false, 6619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12395a, false, 6619, new Class[0], Void.TYPE);
        } else {
            this.j = this.contentView.findViewById(C0906R.id.a8j);
            this.k = this.contentView.findViewById(C0906R.id.a8i);
            this.l = this.containerView.findViewById(C0906R.id.d7g);
            if (this.j != null) {
                this.j.setOnClickListener(this);
            }
            this.h.f11593b = this.f12398b;
            if (c.a(this.m, "feed_live_span", 0).getInt("span_count", 0) > 1) {
                str = "live_small_picture";
            } else {
                str = "live_big_picture";
            }
            this.n = str;
            e();
            if (com.bytedance.android.live.uikit.a.a.f()) {
                if (this.f12399c == null || this.f12399c.mRoomAuthStatus == null || this.f12399c.mRoomAuthStatus.enableChat) {
                    if (this.j instanceof TextView) {
                        UIUtils.setText((TextView) this.j, getContext().getString(C0906R.string.cqv));
                    }
                } else if (this.j instanceof TextView) {
                    UIUtils.setText((TextView) this.j, getContext().getString(C0906R.string.cq8));
                }
            }
        }
        if (com.bytedance.android.live.uikit.a.a.f() && (!this.f12398b || this.f12400d)) {
            UIUtils.updateLayoutMargin(this.containerView, -3, -3, ac.a(16.0f), -3);
        }
        if (com.bytedance.android.live.uikit.a.a.f() && this.f12399c != null && this.f12399c.getOrientation() == 1) {
            UIUtils.updateLayoutMargin(this.containerView, ac.a(12.0f), -3, ac.a(16.0f), -3);
        }
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12395a, false, 6617, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12395a, false, 6617, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a(am.class).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<am>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12407a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                am amVar = (am) obj;
                if (PatchProxy.isSupport(new Object[]{amVar}, this, f12407a, false, 6649, new Class[]{am.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{amVar}, this, f12407a, false, 6649, new Class[]{am.class}, Void.TYPE);
                    return;
                }
                CommentWidget.this.onEvent(amVar);
            }
        });
        this.f12398b = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12399c = (Room) this.dataCenter.get("data_room");
        this.f12400d = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.o = (String) this.dataCenter.get("log_enter_live_source");
        this.m = (Activity) this.context;
        this.r.a((b.a) this);
        this.dataCenter.observe("cmd_do_send_message", this).observe("data_screen_record_is_open", this).observe("cmd_wanna_send_message", this).observeForever("data_keyboard_status", this).observeForever("cmd_hide_in_douyin_commerce", this);
        if (!this.f12400d) {
            UIUtils.setViewVisibility(this.j, 0);
        } else if (this.f12398b) {
            this.k.setOnClickListener(this);
            this.k.setVisibility(0);
            this.j.setVisibility(8);
        } else {
            if (this.k != null) {
                this.k.setVisibility(8);
            }
            this.j.setVisibility(0);
        }
        if (!com.bytedance.android.live.uikit.a.a.f() || !this.f12398b) {
            e();
        } else {
            UIUtils.setViewVisibility(this.l, 0);
            UIUtils.setViewVisibility(this.k, 8);
            UIUtils.setViewVisibility(this.j, 8);
            if (this.l != null) {
                this.l.setOnClickListener(this);
            }
        }
    }

    public final void a(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f12395a, false, 6624, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f12395a, false, 6624, new Class[]{e.class}, Void.TYPE);
        } else if (isViewValid()) {
            f();
            if (this.m instanceof FragmentActivity) {
                TTLiveSDKContext.getHostService().c().a((FragmentActivity) this.m, "live_comment");
            }
            ((IMessageManager) this.dataCenter.get("data_message_manager")).insertMessage(eVar2, true);
            com.bytedance.android.livesdk.u.a.a().a((Object) new ad(eVar2));
            if (!this.f12398b) {
                HashMap hashMap = new HashMap();
                if (com.bytedance.android.live.uikit.a.a.f() && eVar2 != null) {
                    hashMap.put("comment_id", eVar2.g);
                    if (eVar2.f16615d != null) {
                        hashMap.put("to_user_id", String.valueOf(eVar2.f16615d.getIdStr()));
                    }
                    if (this.f12399c != null) {
                        hashMap.put("orientation", String.valueOf(this.f12399c.getOrientation()));
                    }
                }
                if (this.s == null || !this.s.equals(eVar2.f16614c) || !this.u || this.v == null) {
                    try {
                        hashMap.put("comment_id", String.valueOf(eVar2.f16613b));
                        hashMap.put("to_user_id", String.valueOf(this.f12399c.getOwner().getId()));
                        hashMap.put("live_source", this.n);
                        if (!TextUtils.isEmpty(this.f12399c.getSourceType())) {
                            hashMap.put("moment_room_source", this.f12399c.getSourceType());
                        }
                    } catch (Exception unused) {
                    }
                    if (com.bytedance.android.live.uikit.a.a.d()) {
                        Context context = getContext();
                        Room room = this.f12399c;
                        if (PatchProxy.isSupport(new Object[]{context, room}, null, com.bytedance.android.livesdk.r.a.f16870a, true, 12846, new Class[]{Context.class, Room.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, room}, null, com.bytedance.android.livesdk.r.a.f16870a, true, 12846, new Class[]{Context.class, Room.class}, Void.TYPE);
                        } else if (!(context == null || room == null)) {
                            com.bytedance.android.livesdk.r.a.a(context, room.getId(), "comment", new JSONObject());
                        }
                    }
                    com.bytedance.android.livesdk.j.a.a().a("audience_live_message", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_interact"), Room.class, new k());
                } else {
                    d.a(this.v, hashMap);
                    this.v = null;
                }
                if (com.bytedance.android.live.uikit.a.a.f()) {
                    d();
                }
            }
        }
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f12395a, false, 6629, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f12395a, false, 6629, new Class[]{Exception.class}, Void.TYPE);
        } else if (exc2 instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) exc2;
            int errorCode = aVar.getErrorCode();
            if (50001 == errorCode) {
                b(true);
            } else if (50004 == errorCode || 50014 == errorCode) {
                f();
                d();
                com.bytedance.android.live.uikit.d.a.a((Context) this.m, aVar.getPrompt());
            } else if (40001 == errorCode) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.m, aVar.getPrompt());
                if (com.bytedance.android.live.uikit.a.a.f() && this.f12399c != null && this.f12399c.mRoomAuthStatus != null && !this.f12399c.mRoomAuthStatus.enableDanmaku) {
                    return;
                }
                if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.a()).intValue() == 1) {
                    this.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new ag(1, "live_detail"));
                }
            } else {
                com.bytedance.android.livesdk.utils.l.a(getContext(), aVar);
            }
            a(aVar);
        } else {
            Toast makeText = Toast.makeText(this.context, C0906R.string.d13, 0);
            if (PatchProxy.isSupport(new Object[]{makeText}, null, n.f13283a, true, 6653, new Class[]{Toast.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{makeText}, null, n.f13283a, true, 6653, new Class[]{Toast.class}, Void.TYPE);
                return;
            }
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(makeText);
            }
            makeText.show();
        }
    }
}
