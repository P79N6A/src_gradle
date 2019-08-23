package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.a.c.f;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.e;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.barrage.a.c;
import com.ss.ugc.live.barrage.b.a;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class OBSBarrageWidget extends LiveWidget implements Observer<KVData>, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12694a;

    /* renamed from: b  reason: collision with root package name */
    private final List<e> f12695b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private IMessageManager f12696c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.ugc.live.barrage.b.a f12697d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.ugc.live.barrage.b.a f12698e;

    /* renamed from: f  reason: collision with root package name */
    private BarrageLayout f12699f;
    private BarrageLayout g;
    private a.C0842a h = new a.C0842a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12700a;

        public final void a(com.ss.ugc.live.barrage.a.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12700a, false, 7312, new Class[]{com.ss.ugc.live.barrage.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12700a, false, 7312, new Class[]{com.ss.ugc.live.barrage.a.a.class}, Void.TYPE);
                return;
            }
            OBSBarrageWidget.this.a();
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12702a = new int[com.bytedance.android.livesdkapi.depend.f.a.values().length];

        static {
            try {
                f12702a[com.bytedance.android.livesdkapi.depend.f.a.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12703a;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12704d;

        /* renamed from: c  reason: collision with root package name */
        private Dialog f12706c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12703a, false, 7316, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12703a, false, 7316, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12703a, false, 7317, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12703a, false, 7317, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12703a, true, 7315, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12703a, true, 7315, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("OBSBarrageWidget.java", a.class);
            f12704d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget$ToolbarBarrageBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 200);
        }

        private a() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12703a, false, 7313, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12703a, false, 7313, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f12704d, this, this, view));
            if (this.f12706c == null) {
                this.f12706c = new com.bytedance.android.livesdk.chatroom.a.a(OBSBarrageWidget.this.context, new ds(this));
            }
            if (!this.f12706c.isShowing()) {
                this.f12706c.show();
            }
        }

        /* synthetic */ a(OBSBarrageWidget oBSBarrageWidget, byte b2) {
            this();
        }

        public final void b(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12703a, false, 7314, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12703a, false, 7314, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            if (this.f12706c != null) {
                Dialog dialog = this.f12706c;
                if (PatchProxy.isSupport(new Object[]{dialog}, null, dt.f13186a, true, 7319, new Class[]{Dialog.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialog}, null, dt.f13186a, true, 7319, new Class[]{Dialog.class}, Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    dialog.dismiss();
                } else {
                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                }
            }
            this.f12706c = null;
        }
    }

    public int getLayoutId() {
        return C0906R.layout.akz;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12694a, false, 7307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12694a, false, 7307, new Class[0], Void.TYPE);
            return;
        }
        this.f12696c.removeMessageListener(this);
        if (this.f12699f != null) {
            this.f12699f.a();
        }
        if (this.g != null) {
            this.g.a();
        }
        this.dataCenter.removeObserver(this);
        super.onDestroy();
    }

    public final void a() {
        com.ss.ugc.live.barrage.b.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f12694a, false, 7310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12694a, false, 7310, new Class[0], Void.TYPE);
        } else if (isViewValid() && ((this.f12699f != null || this.g != null) && this.f12697d != null && this.f12698e != null && this.f12697d.b() + this.f12698e.b() < 40 && !this.f12695b.isEmpty())) {
            c cVar = new f(LayoutInflater.from(this.context).inflate(C0906R.layout.akn, null), (((Float) com.bytedance.android.livesdk.w.b.N.a()).floatValue() * 12.0f) + 12.0f, (((Float) com.bytedance.android.livesdk.w.b.M.a()).floatValue() * 0.68f) + 0.32f, this.f12695b.remove(0)).f9741a;
            switch (((Integer) com.bytedance.android.livesdk.w.b.O.a()).intValue()) {
                case 0:
                    aVar = this.f12697d;
                    break;
                case 1:
                    aVar = this.f12698e;
                    break;
                case 2:
                    if (new Random().nextInt(2) != 0) {
                        aVar = this.f12698e;
                        break;
                    } else {
                        aVar = this.f12697d;
                        break;
                    }
                default:
                    return;
            }
            aVar.a((com.ss.ugc.live.barrage.a.a) cVar, false);
        }
    }

    public void onCreate() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f12694a, false, 7306, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12694a, false, 7306, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12696c = (IMessageManager) this.dataCenter.get("data_message_manager");
        this.f12696c.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.CHAT.getIntType(), this);
        int b2 = ((ac.b() / 2) - ac.d(C0906R.dimen.p_)) / ac.d(C0906R.dimen.p8);
        this.f12699f = (BarrageLayout) this.contentView.findViewById(C0906R.id.d52);
        this.f12697d = new com.ss.ugc.live.barrage.b.d(this.f12699f, ac.d(C0906R.dimen.p8), b2, 7000);
        this.f12697d.a(this.h);
        this.f12699f.a(this.f12697d);
        int b3 = ((ac.b() / 2) - ac.d(C0906R.dimen.p9)) / ac.d(C0906R.dimen.p8);
        this.g = (BarrageLayout) this.contentView.findViewById(C0906R.id.m7);
        this.f12698e = new com.ss.ugc.live.barrage.b.d(this.g, ac.d(C0906R.dimen.p8), b3, 7000);
        this.f12698e.a(this.h);
        this.g.a(this.f12698e);
        View view = this.contentView;
        if (((Boolean) com.bytedance.android.livesdk.w.b.P.a()).booleanValue()) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
        if (!com.bytedance.android.live.uikit.a.a.f() || !booleanValue) {
            j.a().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.BARRAGE, (d.a) new a(this, (byte) 0));
        } else {
            j.a().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.BROADCAST_BARRAGE, (d.a) new a(this, (byte) 0));
        }
        if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.a()).intValue() != 1) {
            this.contentView.setVisibility(4);
        }
        this.dataCenter.observe("cmd_barrage_visibility", this);
        if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.a()).intValue() != 1) {
            this.contentView.setVisibility(4);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12694a, false, 7311, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12694a, false, 7311, new Class[]{KVData.class}, Void.TYPE);
            return;
        }
        if (kVData != null) {
            UIUtils.setViewVisibility(this.contentView, ((Integer) kVData.getData()).intValue());
        }
    }

    public void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f12694a, false, 7309, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f12694a, false, 7309, new Class[]{IMessage.class}, Void.TYPE);
        } else if (isViewValid()) {
            com.bytedance.android.livesdk.message.model.c cVar = (com.bytedance.android.livesdk.message.model.c) iMessage;
            if (AnonymousClass2.f12702a[cVar.getMessageType().ordinal()] == 1) {
                e eVar = (e) cVar;
                if (PatchProxy.isSupport(new Object[]{eVar}, this, f12694a, false, 7308, new Class[]{e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar}, this, f12694a, false, 7308, new Class[]{e.class}, Void.TYPE);
                    return;
                }
                if (this.f12695b.size() >= 200) {
                    this.f12695b.remove(0);
                }
                this.f12695b.add(eVar);
                a();
            }
        }
    }
}
