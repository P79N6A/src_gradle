package com.bytedance.android.livesdk.chatroom.dutygift;

import android.arch.lifecycle.Observer;
import android.content.DialogInterface;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.dutygift.a;
import com.bytedance.android.livesdk.chatroom.dutygift.f;
import com.bytedance.android.livesdk.chatroom.ui.eo;
import com.bytedance.android.livesdk.chatroom.viewmodule.am;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.gift.model.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class DutyGiftControlWidget extends LiveWidget implements Observer<KVData>, a.C0084a, a.C0122a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9958a;

    /* renamed from: b  reason: collision with root package name */
    public a f9959b = new a(this, (byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.sticker.b.a f9960c;

    /* renamed from: d  reason: collision with root package name */
    n f9961d;

    /* renamed from: e  reason: collision with root package name */
    DutyGiftInfo f9962e;

    /* renamed from: f  reason: collision with root package name */
    Room f9963f;
    String g;
    long h;
    public eo i;
    private a j;

    public class a implements View.OnClickListener, d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9971a;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f9972e;

        /* renamed from: b  reason: collision with root package name */
        public l f9973b;

        /* renamed from: d  reason: collision with root package name */
        private View f9975d;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f9971a, false, 4176, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f9971a, false, 4176, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9971a, false, 4175, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9971a, false, 4175, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f9971a, true, 4174, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f9971a, true, 4174, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("DutyGiftControlWidget.java", a.class);
            f9972e = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.dutygift.DutyGiftControlWidget$ToolbarGameBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 435);
        }

        private a() {
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f9971a, false, 4172, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f9971a, false, 4172, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f9975d != null) {
                this.f9975d.setVisibility(i);
            }
        }

        public void onClick(View view) {
            boolean z;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f9971a, false, 4170, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f9971a, false, 4170, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f9972e, this, this, view2));
            if (view.getId() == C0906R.id.ajp) {
                DutyGiftControlWidget dutyGiftControlWidget = DutyGiftControlWidget.this;
                if (PatchProxy.isSupport(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4135, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4135, new Class[0], Void.TYPE);
                } else {
                    com.bytedance.android.live.core.c.a.c("DutyGiftControlWidget", "onStartGameClick mSticker: " + dutyGiftControlWidget.f9960c);
                    if (dutyGiftControlWidget.f9960c != null) {
                        dutyGiftControlWidget.f9961d.a(dutyGiftControlWidget.f9960c);
                    } else {
                        com.bytedance.android.live.uikit.d.a.a(dutyGiftControlWidget.context, (int) C0906R.string.d3n);
                    }
                }
                this.f9973b.dismiss();
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f9971a, false, 4171, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9971a, false, 4171, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (((Integer) LinkCrossRoomDataHolder.a().get("data_link_model", 0)).intValue() != 0) {
                com.bytedance.android.live.uikit.d.a.a(DutyGiftControlWidget.this.context, (int) C0906R.string.d3q);
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f9973b == null) {
                    this.f9973b = new l(DutyGiftControlWidget.this.context, this);
                    this.f9973b.setOnDismissListener(k.f10001b);
                }
                if (!this.f9973b.isShowing()) {
                    this.f9973b.show();
                    DutyGiftControlWidget dutyGiftControlWidget2 = DutyGiftControlWidget.this;
                    if (PatchProxy.isSupport(new Object[0], dutyGiftControlWidget2, DutyGiftControlWidget.f9958a, false, 4158, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], dutyGiftControlWidget2, DutyGiftControlWidget.f9958a, false, 4158, new Class[0], Void.TYPE);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("room_id", String.valueOf(dutyGiftControlWidget2.f9963f.getId()));
                    hashMap.put("anchor_id", String.valueOf(dutyGiftControlWidget2.f9963f.getOwner().getId()));
                    com.bytedance.android.livesdk.j.a.a().a("effect_game_click", hashMap, new j().b("live_take").f("click").a("live_take_detail"));
                }
            }
        }

        /* synthetic */ a(DutyGiftControlWidget dutyGiftControlWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9971a, false, 4169, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9971a, false, 4169, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f9975d = view;
            a(8);
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f9958a, false, 4161, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4161, new Class[0], String.class);
    }

    public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f9958a, false, 4162, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f9958a, false, 4162, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public final void b(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
    }

    public int getLayoutId() {
        return C0906R.layout.aml;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4140, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f9961d == null || this.f9960c == null)) {
            this.f9961d.b(this.f9960c);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4133, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.j.d();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4132, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().a(f.DUTY_GIFT, (d.a) this.f9959b);
        this.f9963f = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observeForever("receiver_effect_message", this).observe("cmd_stop_duty_gift", this);
        this.j = new a(this.f9963f, this.dataCenter);
        this.j.a((f.a) this);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4160, new Class[0], Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f9963f.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f9963f.getOwner().getId()));
        if (this.f9962e != null) {
            hashMap.put("effectgame_id", String.valueOf(this.f9962e.getDutyId()));
            hashMap.put("effectgame_gift_id", String.valueOf(this.f9962e.getGiftId()));
            hashMap.put("effectgame_gift_cnt", String.valueOf(this.f9962e.getTargetScore()));
            com.bytedance.android.livesdk.gift.model.b findGiftById = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(this.f9962e.getGiftId());
            if (findGiftById != null) {
                hashMap.put("effectgame_gift_money", String.valueOf(this.f9962e.getTargetScore() * ((long) findGiftById.f15107f)));
            }
            hashMap.put("time", String.valueOf((int) ((System.currentTimeMillis() - this.h) / 1000)));
            hashMap.put("is_success", String.valueOf(this.f9962e.isSuccess()));
        }
        com.bytedance.android.livesdk.j.a.a().a("effect_game_end", hashMap, new j().b("live_take").f("click").a("live_take_detail"));
    }

    public DutyGiftControlWidget(n nVar) {
        this.f9961d = nVar;
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9958a, false, 4141, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9958a, false, 4141, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a(z);
        }
    }

    public final void c(DutyGiftInfo dutyGiftInfo) {
        if (PatchProxy.isSupport(new Object[]{dutyGiftInfo}, this, f9958a, false, 4151, new Class[]{DutyGiftInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dutyGiftInfo}, this, f9958a, false, 4151, new Class[]{DutyGiftInfo.class}, Void.TYPE);
            return;
        }
        if (dutyGiftInfo == null || dutyGiftInfo.getStatus() <= 0) {
            this.f9959b.a(8);
        } else {
            this.f9959b.a(0);
            if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4134, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4134, new Class[0], Void.TYPE);
            } else {
                final com.bytedance.android.livesdk.sticker.c.a a2 = this.f9961d.a();
                if (a2 != null) {
                    a2.a("livegame", new a.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f9964a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f9964a, false, 4166, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f9964a, false, 4166, new Class[0], Void.TYPE);
                                return;
                            }
                            com.bytedance.android.live.core.c.a.c("DutyGiftControlWidget", "onSyncStickersFailed() ");
                        }

                        public final void a(EffectChannelResponse effectChannelResponse) {
                            if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f9964a, false, 4165, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f9964a, false, 4165, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                            } else if (effectChannelResponse != null) {
                                List<Effect> list = effectChannelResponse.allCategoryEffects;
                                if (!Lists.isEmpty(list)) {
                                    com.bytedance.android.livesdk.sticker.b.a a2 = h.a(list.get(0));
                                    a2.s = a2.a(a2);
                                    if (!a2.s) {
                                        a2.a("livegame", a2, (a.C0122a) DutyGiftControlWidget.this);
                                    } else {
                                        DutyGiftControlWidget.this.f9960c = a2;
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public final void d(DutyGiftInfo dutyGiftInfo) {
        if (PatchProxy.isSupport(new Object[]{dutyGiftInfo}, this, f9958a, false, 4154, new Class[]{DutyGiftInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dutyGiftInfo}, this, f9958a, false, 4154, new Class[]{DutyGiftInfo.class}, Void.TYPE);
            return;
        }
        if (dutyGiftInfo != null) {
            if (PatchProxy.isSupport(new Object[]{dutyGiftInfo}, this, f9958a, false, 4137, new Class[]{DutyGiftInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dutyGiftInfo}, this, f9958a, false, 4137, new Class[]{DutyGiftInfo.class}, Void.TYPE);
                return;
            }
            a(a((int) dutyGiftInfo.getTargetScore(), (int) dutyGiftInfo.getScore()));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f9958a, false, 4142, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f9958a, false, 4142, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (!(mVar == null || this.f9961d == null)) {
            this.f9961d.b(mVar);
        }
    }

    public final void a(DutyGiftInfo dutyGiftInfo) {
        String str;
        DutyGiftInfo dutyGiftInfo2 = dutyGiftInfo;
        if (PatchProxy.isSupport(new Object[]{dutyGiftInfo2}, this, f9958a, false, 4152, new Class[]{DutyGiftInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dutyGiftInfo2}, this, f9958a, false, 4152, new Class[]{DutyGiftInfo.class}, Void.TYPE);
            return;
        }
        if (dutyGiftInfo2 != null) {
            long giftId = dutyGiftInfo.getGiftId();
            com.bytedance.android.livesdk.gift.model.b findGiftById = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(giftId);
            com.bytedance.android.live.core.c.a.c("DutyGiftControlWidget", "downloadGiftImage giftId: " + giftId + ", gift: " + findGiftById);
            if (findGiftById != null) {
                this.f9962e = dutyGiftInfo2;
                ImageModel imageModel = findGiftById.f15103b;
                if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4157, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4157, new Class[0], String.class);
                } else {
                    if (this.context.getExternalCacheDir() != null) {
                        str = r0.getAbsolutePath() + "/dutyGift";
                    } else {
                        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                        str = absolutePath + "/Android/data/" + this.context.getPackageName() + "/cache/dutyGift";
                    }
                }
                String str2 = str;
                String valueOf = String.valueOf(giftId);
                if (PatchProxy.isSupport(new Object[]{imageModel, str2, valueOf}, this, f9958a, false, 4156, new Class[]{ImageModel.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel, str2, valueOf}, this, f9958a, false, 4156, new Class[]{ImageModel.class, String.class, String.class}, Void.TYPE);
                } else {
                    com.bytedance.android.livesdk.chatroom.f.b.a(imageModel).map(new i(str2, valueOf)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new j<Object>(this));
                }
            }
            return;
        }
        this.f9962e = null;
        b();
    }

    public final void b(DutyGiftInfo dutyGiftInfo) {
        m mVar;
        if (PatchProxy.isSupport(new Object[]{dutyGiftInfo}, this, f9958a, false, 4153, new Class[]{DutyGiftInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dutyGiftInfo}, this, f9958a, false, 4153, new Class[]{DutyGiftInfo.class}, Void.TYPE);
            return;
        }
        if (dutyGiftInfo != null) {
            dutyGiftInfo.setSuccess(this.f9962e.isSuccess());
            if (dutyGiftInfo.isSuccess() == 1 && dutyGiftInfo.getMvpUser() != null) {
                String nickName = dutyGiftInfo.getMvpUser().getNickName();
                if (PatchProxy.isSupport(new Object[]{nickName}, this, f9958a, false, 4149, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{nickName}, this, f9958a, false, 4149, new Class[]{String.class}, Void.TYPE);
                } else {
                    g gVar = new g();
                    if (TextUtils.isEmpty(nickName)) {
                        nickName = ac.a((int) C0906R.string.d1_);
                    }
                    String str = h.a(ac.e()) + File.separator + DigestUtils.md5Hex(nickName) + ".png";
                    if (!com.bytedance.android.live.core.utils.h.a(str)) {
                        if (nickName.length() > 6) {
                            nickName = nickName.substring(0, 6) + "...";
                        }
                        gVar.f15126e = nickName;
                        gVar.f15124c = 119;
                        gVar.f15125d = 16;
                        gVar.j = str;
                        gVar.g = "#ff7452";
                        gVar.f15127f = 14;
                        gVar.i = "center";
                        com.bytedance.android.livesdk.chatroom.bl.b.a(gVar);
                    }
                    if (com.bytedance.android.live.core.utils.h.a(str)) {
                        if (this.f9961d != null) {
                            this.f9961d.a("user_name_icon", str, false);
                        }
                        if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4138, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4138, new Class[0], Void.TYPE);
                        } else {
                            if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4145, new Class[0], m.class)) {
                                mVar = (m) PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4145, new Class[0], m.class);
                            } else {
                                mVar = new m();
                                mVar.f10005a = 4098;
                                mVar.f10006b = 2;
                            }
                            a(mVar);
                        }
                    }
                }
            }
        } else {
            b();
        }
        this.f9962e = null;
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f9958a, false, 4146, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f9958a, false, 4146, new Class[]{KVData.class}, Void.TYPE);
        } else if (isViewValid() && kVData != null && kVData.getData() != null) {
            if ("receiver_effect_message".equals(kVData.getKey())) {
                m mVar = (m) kVData.getData();
                com.bytedance.android.live.core.c.a.c("DutyGiftControlWidget", "onChanged message.what: " + mVar.f10005a);
                if (mVar.f10005a != 4099) {
                    if (mVar.f10005a == 4104) {
                        this.j.a();
                    }
                } else if (mVar.f10006b == 0 || mVar.f10006b == 1) {
                    this.f9962e.setSuccess(mVar.f10006b);
                    b(false);
                    c();
                } else {
                    com.bytedance.android.livesdk.w.b.aU.a(Integer.valueOf(mVar.f10007c));
                    b();
                }
            } else if ("cmd_stop_duty_gift".equals(kVData.getKey())) {
                if (PatchProxy.isSupport(new Object[0], this, f9958a, false, 4147, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f9958a, false, 4147, new Class[0], Void.TYPE);
                } else if (this.i == null || !this.i.isShowing()) {
                    if (this.i == null) {
                        eo.a aVar = new eo.a(getContext(), 2);
                        aVar.f12205b.f12208c = C0906R.layout.afv;
                        this.i = aVar.a(false).b((int) C0906R.string.d3m).a(ac.a((int) C0906R.string.d3l), new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f9969a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9969a, false, 4168, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9969a, false, 4168, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                dialogInterface.dismiss();
                                DutyGiftControlWidget.this.a(true);
                            }
                        }).b(ac.a((int) C0906R.string.d3k), new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f9967a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9967a, false, 4167, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9967a, false, 4167, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                dialogInterface.dismiss();
                            }
                        }).a();
                    }
                    this.i.show();
                }
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f9958a, false, 4139, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f9958a, false, 4139, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f9962e != null && this.f9962e.getStatus() > 0) {
            b();
            b(true);
            c();
            this.f9962e = null;
        }
    }

    /* access modifiers changed from: package-private */
    public m a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9958a, false, 4144, new Class[]{Integer.TYPE, Integer.TYPE}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9958a, false, 4144, new Class[]{Integer.TYPE, Integer.TYPE}, m.class);
        }
        m mVar = new m();
        mVar.f10005a = 4103;
        mVar.f10006b = i3;
        mVar.f10007c = i2;
        return mVar;
    }

    public final void c(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        String str2 = str;
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, this, f9958a, false, 4150, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2}, this, f9958a, false, 4150, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.live.core.c.a.c("DutyGiftControlWidget", "onDownloadSuccess panel: " + str2 + ", sticker: " + aVar2);
        if (str2 == "livegame") {
            this.f9960c = aVar2;
        }
    }
}
