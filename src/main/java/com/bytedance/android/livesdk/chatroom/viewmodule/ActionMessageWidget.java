package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.chatroom.e.x;
import com.bytedance.android.livesdk.message.model.at;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayDeque;
import java.util.Queue;
import org.aspectj.lang.a;

public class ActionMessageWidget extends LiveWidget implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12336a;

    /* renamed from: b  reason: collision with root package name */
    public Room f12337b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12338c;

    /* renamed from: d  reason: collision with root package name */
    private long f12339d;

    /* renamed from: e  reason: collision with root package name */
    private Queue<b> f12340e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f12341f;
    private ViewGroup g;
    private IMessageManager h;
    private View.OnClickListener i = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12342a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12343c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12342a, true, 6549, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12342a, true, 6549, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("ActionMessageWidget.java", AnonymousClass1.class);
            f12343c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 235);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12342a, false, 6548, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12342a, false, 6548, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12343c, this, this, view));
            if (view.getTag() instanceof com.bytedance.android.livesdk.chatroom.e.a) {
                ((com.bytedance.android.livesdk.chatroom.e.a) view.getTag()).a(view.getContext(), ActionMessageWidget.this.f12337b);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12345a = new int[com.bytedance.android.livesdkapi.depend.f.a.values().length];

        static {
            try {
                f12345a[com.bytedance.android.livesdkapi.depend.f.a.PROMOTION_CARD_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12346a;

        /* renamed from: c  reason: collision with root package name */
        private ViewGroup f12348c;

        /* renamed from: d  reason: collision with root package name */
        private View f12349d;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f12346a, false, 6550, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f12346a, false, 6550, new Class[]{Animator.class}, Void.TYPE);
            } else if (this.f12348c != null && this.f12349d != null) {
                this.f12348c.removeView(this.f12349d);
                this.f12349d = null;
                ActionMessageWidget.this.f12338c = false;
                ActionMessageWidget.this.a();
            }
        }

        a(ViewGroup viewGroup, View view) {
            this.f12348c = viewGroup;
            this.f12349d = view;
        }
    }

    public int getLayoutId() {
        return C0906R.layout.als;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12336a, false, 6541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12336a, false, 6541, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.h.removeMessageListener(this);
        if (PatchProxy.isSupport(new Object[0], this, f12336a, false, 6542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12336a, false, 6542, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f12340e.isEmpty()) {
            this.f12340e.clear();
        }
        if (this.f12341f != null && this.f12341f.isRunning()) {
            this.f12341f.removeAllListeners();
            this.f12341f.cancel();
            this.f12341f = null;
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12336a, false, 6540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12336a, false, 6540, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f12339d = ((Long) this.dataCenter.get("data_room_id")).longValue();
        this.f12337b = (Room) this.dataCenter.get("data_room");
        this.f12340e = new ArrayDeque();
        this.g = (ViewGroup) this.contentView.getParent();
        this.h = (IMessageManager) this.dataCenter.get("data_message_manager");
        this.h.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.PROMOTION_CARD_MESSAGE.getIntType(), this);
        this.h.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LUCKY_BOX.getIntType(), this);
        this.h.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ROOM_PUSH.getIntType(), this);
    }

    public final void a() {
        com.bytedance.android.livesdk.widget.a aVar;
        do {
            if (PatchProxy.isSupport(new Object[0], this, f12336a, false, 6545, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12336a, false, 6545, new Class[0], Void.TYPE);
                return;
            } else if (!this.f12340e.isEmpty() && !this.f12338c) {
                b poll = this.f12340e.poll();
                if (poll instanceof com.bytedance.android.livesdk.chatroom.e.a) {
                    com.bytedance.android.livesdk.chatroom.e.a aVar2 = (com.bytedance.android.livesdk.chatroom.e.a) poll;
                    aVar = new com.bytedance.android.livesdk.widget.a(this.context);
                    aVar.setY((float) this.g.getHeight());
                    aVar.setAbsActionMessage(aVar2);
                    if (aVar2.d()) {
                        aVar.setTag(aVar2);
                        aVar.setOnClickListener(this.i);
                    } else {
                        aVar.setOnClickListener(null);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!aVar.f18372b);
        this.f12338c = true;
        this.g.addView(aVar);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aVar.getLayoutParams();
        layoutParams.addRule(14);
        aVar.setLayoutParams(layoutParams);
        this.f12341f = a(aVar, new a(this.g, aVar));
        this.f12341f.start();
    }

    public void onMessage(IMessage iMessage) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f12336a, false, 6543, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f12336a, false, 6543, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        c cVar = (c) iMessage;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12336a, false, 6546, new Class[]{com.bytedance.android.livesdkapi.h.a.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f12336a, false, 6546, new Class[]{com.bytedance.android.livesdkapi.h.a.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (cVar != null && cVar.isCurrentRoom(this.f12339d) && cVar.canText()) {
                if (AnonymousClass2.f12345a[cVar.getMessageType().ordinal()] == 1) {
                    at atVar = (at) cVar;
                    if (atVar.f16497b != null) {
                        String str = atVar.f16497b.f16498a;
                        char c2 = 65535;
                        int hashCode = str.hashCode();
                        if (hashCode != -984622807) {
                            if (hashCode == -407856239 && str.equals("enter_by_card")) {
                                c2 = 1;
                            }
                        } else if (str.equals("buy_card")) {
                            c2 = 0;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                                z = ((Boolean) com.bytedance.android.livesdk.config.a.Z.a()).booleanValue();
                                break;
                        }
                    }
                } else {
                    z = false;
                }
            }
            z = true;
        }
        if (!z) {
            b a2 = x.a(cVar);
            if (a2 != null) {
                if (PatchProxy.isSupport(new Object[]{a2}, this, f12336a, false, 6544, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{a2}, this, f12336a, false, 6544, new Class[]{b.class}, Void.TYPE);
                    return;
                }
                if (a2 != null) {
                    this.f12340e.add(a2);
                    a();
                }
            }
        }
    }

    private AnimatorSet a(View view, Animator.AnimatorListener animatorListener) {
        if (PatchProxy.isSupport(new Object[]{view, animatorListener}, this, f12336a, false, 6547, new Class[]{View.class, Animator.AnimatorListener.class}, AnimatorSet.class)) {
            return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{view, animatorListener}, this, f12336a, false, 6547, new Class[]{View.class, Animator.AnimatorListener.class}, AnimatorSet.class);
        }
        float y = view.getY();
        float dimension = this.context.getResources().getDimension(C0906R.dimen.pb) + this.context.getResources().getDimension(C0906R.dimen.pc);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{y, y - dimension}).setDuration(500);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2});
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(300);
        duration3.setStartDelay(3000);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{animatorSet, duration3});
        animatorSet2.addListener(animatorListener);
        return animatorSet2;
    }
}
