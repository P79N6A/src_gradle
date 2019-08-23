package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.event.ad;
import com.bytedance.android.livesdk.chatroom.event.u;
import com.bytedance.android.livesdk.chatroom.model.ChatGuidanceResult;
import com.bytedance.android.livesdk.chatroom.presenter.d;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.message.model.ay;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

public class CommentPromotionWidget extends LiveRecyclableWidget implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12385a;

    /* renamed from: b  reason: collision with root package name */
    public ay f12386b;

    /* renamed from: c  reason: collision with root package name */
    private Room f12387c;

    /* renamed from: d  reason: collision with root package name */
    private String f12388d;

    /* renamed from: e  reason: collision with root package name */
    private d f12389e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f12390f;

    public int getLayoutId() {
        return C0906R.layout.akq;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12385a, false, 6609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12385a, false, 6609, new Class[0], Void.TYPE);
            return;
        }
        this.f12389e.a();
        this.f12390f.removeCallbacksAndMessages(null);
    }

    public final ay a() {
        if (PatchProxy.isSupport(new Object[0], this, f12385a, false, 6610, new Class[0], ay.class)) {
            return (ay) PatchProxy.accessDispatch(new Object[0], this, f12385a, false, 6610, new Class[0], ay.class);
        }
        ay ayVar = new ay();
        ayVar.baseMessage = this.f12386b.baseMessage;
        ayVar.f16526b = this.f12386b.f16526b;
        return ayVar;
    }

    /* access modifiers changed from: package-private */
    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f12385a, false, 6608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12385a, false, 6608, new Class[0], Void.TYPE);
            return;
        }
        b();
        if (this.contentView != null) {
            this.contentView.setVisibility(8);
        }
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12385a, false, 6602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12385a, false, 6602, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public void onEvent(ad adVar) {
        if (PatchProxy.isSupport(new Object[]{adVar}, this, f12385a, false, 6604, new Class[]{ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar}, this, f12385a, false, 6604, new Class[]{ad.class}, Void.TYPE);
            return;
        }
        dismiss();
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12385a, false, 6599, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12385a, false, 6599, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12389e = new d();
        this.f12390f = new WeakHandler(this);
    }

    private <T> void a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f12385a, false, 6601, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2}, this, f12385a, false, 6601, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        a.a().a(cls2).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12391a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f12391a, false, 6613, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f12391a, false, 6613, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof com.bytedance.android.livesdkapi.depend.b.a) {
                    CommentPromotionWidget.this.onEvent((com.bytedance.android.livesdkapi.depend.b.a) t);
                } else if (t instanceof u) {
                    CommentPromotionWidget.this.onEvent((u) t);
                } else {
                    if (t instanceof ad) {
                        CommentPromotionWidget.this.onEvent((ad) t);
                    }
                }
            }
        });
    }

    public void onEvent(u uVar) {
        u uVar2 = uVar;
        if (PatchProxy.isSupport(new Object[]{uVar2}, this, f12385a, false, 6606, new Class[]{u.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uVar2}, this, f12385a, false, 6606, new Class[]{u.class}, Void.TYPE);
            return;
        }
        if (uVar2.f10200b) {
            dismiss();
        }
    }

    public void onEvent(com.bytedance.android.livesdkapi.depend.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12385a, false, 6605, new Class[]{com.bytedance.android.livesdkapi.depend.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12385a, false, 6605, new Class[]{com.bytedance.android.livesdkapi.depend.b.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdkapi.depend.model.b.a aVar2 = aVar.f18619a;
        if (this.f12387c.getOwner() != null && aVar2.f18689a == this.f12387c.getOwner().getId() && aVar2.a() != 0) {
            b();
        }
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12385a, false, 6600, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12385a, false, 6600, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12387c = (Room) this.dataCenter.get("data_room");
        this.f12388d = (String) this.dataCenter.get("data_enter_source");
        this.f12389e = new d();
        this.f12390f = new WeakHandler(this);
        d dVar = this.f12389e;
        Room room = this.f12387c;
        Handler handler = this.f12390f;
        if (PatchProxy.isSupport(new Object[]{room, handler}, dVar, d.f11338a, false, 5139, new Class[]{Room.class, Handler.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{room, handler}, dVar2, d.f11338a, false, 5139, new Class[]{Room.class, Handler.class}, Void.TYPE);
        } else if (!dVar.f11340c && dVar.a(room)) {
            long intValue = (long) ((Integer) LiveSettingKeys.COMMENT_PROMOTION_DELAY.a()).intValue();
            if (intValue > 0) {
                dVar.f11339b.postDelayed(new Runnable(room, handler) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f11341a;

                    /* renamed from: b */
                    final /* synthetic */ Room f11342b;

                    /* renamed from: c */
                    final /* synthetic */ Handler f11343c;

                    public final void run(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.presenter.d.1.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.presenter.d.1.run():void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                }, intValue * 1000);
                dVar.f11340c = true;
            }
        }
        a(com.bytedance.android.livesdkapi.depend.b.a.class);
        a(u.class);
        a(ad.class);
    }

    public void handleMsg(Message message) {
        Map map;
        long j;
        String str;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f12385a, false, 6603, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f12385a, false, 6603, new Class[]{Message.class}, Void.TYPE);
        } else if (isViewValid() && 30 == message2.what && (message2.obj instanceof ChatGuidanceResult)) {
            this.f12386b = ((ChatGuidanceResult) message2.obj).getMessage();
            if (this.f12386b != null && this.f12386b.f16526b != null) {
                this.f12386b.baseMessage.f18776c = this.f12387c.getId();
                ay ayVar = this.f12386b;
                if (PatchProxy.isSupport(new Object[]{ayVar}, this, f12385a, false, 6607, new Class[]{ay.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{ayVar}, this, f12385a, false, 6607, new Class[]{ay.class}, Void.TYPE);
                    return;
                }
                b();
                this.contentView.setVisibility(0);
                TextView textView = (TextView) this.contentView.findViewById(C0906R.id.vk);
                View findViewById = this.contentView.findViewById(C0906R.id.vj);
                try {
                    findViewById.setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), 2130840683));
                } catch (Exception unused) {
                }
                textView.setText(ayVar.f16526b.f16531e);
                findViewById.setOnClickListener(new k(this, ayVar));
                this.f12390f.postDelayed(new l(this), 5000);
                Room room = this.f12387c;
                String str2 = this.f12388d;
                if (PatchProxy.isSupport(new Object[]{room, str2, ayVar}, null, d.f11338a, true, 5142, new Class[]{Room.class, String.class, ay.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{room, str2, ayVar}, null, d.f11338a, true, 5142, new Class[]{Room.class, String.class, ay.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap();
                if (PatchProxy.isSupport(new Object[]{room}, null, d.f11338a, true, 5144, new Class[]{Room.class}, Map.class)) {
                    map = (Map) PatchProxy.accessDispatch(new Object[]{room}, null, d.f11338a, true, 5144, new Class[]{Room.class}, Map.class);
                } else {
                    HashMap hashMap2 = new HashMap();
                    if (room != null) {
                        long id = room.getId();
                        String requestId = room.getRequestId();
                        if (room.getOwner() == null) {
                            j = 0;
                        } else {
                            j = room.getOwner().getId();
                        }
                        if (room.isLiveTypeAudio()) {
                            str = "voice_live";
                        } else {
                            str = "video_live";
                        }
                        hashMap2.put("user_id", String.valueOf(j));
                        hashMap2.put("request_id", requestId);
                        hashMap2.put("log_pb", room.getLog_pb());
                        hashMap2.put("room_id", String.valueOf(id));
                        hashMap2.put("live_type", str);
                    }
                    map = hashMap2;
                }
                hashMap.putAll(map);
                if (!(ayVar == null || ayVar.f16526b == null)) {
                    hashMap.put("prompt", ayVar.f16526b.f16531e);
                }
                com.bytedance.android.livesdk.j.a.a().a("message_guide_show", hashMap, new j().a("live_detail").c("comment").e(str2));
            }
        }
    }
}
