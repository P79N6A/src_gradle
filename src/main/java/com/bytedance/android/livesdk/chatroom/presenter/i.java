package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.bl.x;
import com.bytedance.android.livesdk.chatroom.bl.y;
import com.bytedance.android.livesdk.chatroom.model.DecorationTextAuditResult;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.ax;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.List;

public class i extends bx<a> implements WeakHandler.IHandler, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11359a = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f11360c = "i";

    /* renamed from: b  reason: collision with root package name */
    public boolean f11361b;

    /* renamed from: d  reason: collision with root package name */
    private WeakHandler f11362d = new WeakHandler(this);

    /* renamed from: e  reason: collision with root package name */
    private boolean f11363e;

    /* renamed from: f  reason: collision with root package name */
    private long f11364f;
    private long g;
    private String h;
    private String i;
    private int j = ((Integer) com.bytedance.android.livesdk.config.a.M.a()).intValue();
    private int k;
    private boolean l = true;

    public interface a extends al {
        void a(String str);

        void a(List<c> list);

        void b();

        void b(String str);

        void b(List<c> list);

        void c();

        int[] d();
    }

    public final boolean a() {
        if (this.k < this.j) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public String a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11359a, false, 5171, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11359a, false, 5171, new Class[]{Integer.TYPE}, String.class);
        }
        Context a2 = TTLiveSDKContext.getHostService().a().a();
        if (a2 == null) {
            return "";
        }
        String string = a2.getString(i2);
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        return string;
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11359a, false, 5165, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11359a, false, 5165, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).setDecoration(this.f11364f, new o().a("deco_list", String.valueOf(str)).f17622b).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(com.bytedance.android.live.core.rxutils.i.c(), new j(this));
    }

    public final String a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f11359a, false, 5170, new Class[]{c.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cVar}, this, f11359a, false, 5170, new Class[]{c.class}, String.class);
        } else if (!TextUtils.isEmpty(this.h)) {
            return this.h;
        } else {
            if (cVar != null) {
                return cVar.f18717d;
            }
            return "";
        }
    }

    public void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11359a, false, 5167, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11359a, false, 5167, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        switch (((com.bytedance.android.livesdk.message.model.c) iMessage).getMessageType()) {
            case REMIND:
                ax axVar = (ax) iMessage;
                if (axVar.f16521c == 1) {
                    if (b() != null) {
                        this.h = "";
                        b.as.a(31);
                        b.ar.a("");
                        ((a) b()).c();
                        ((a) b()).a(axVar.f16520b);
                        return;
                    }
                } else {
                    return;
                }
                break;
            case MODIFY_DECORATION:
                if (b() != null) {
                    ((a) b()).a(((com.bytedance.android.livesdk.message.model.o) iMessage).a());
                    break;
                } else {
                    return;
                }
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11359a, false, 5163, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11359a, false, 5163, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.MODIFY_DECORATION.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.REMIND.getIntType(), this);
        if (this.f11363e) {
            this.f11362d.sendEmptyMessageDelayed(0, 3000);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f11359a, false, 5164, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f11359a, false, 5164, new Class[]{String.class}, Void.TYPE);
        } else if (a() && !TextUtils.isEmpty(str) && !this.f11361b) {
            this.i = str2;
            this.f11361b = true;
            h a2 = h.a();
            WeakHandler weakHandler = this.f11362d;
            long j2 = this.f11364f;
            long b2 = TTLiveSDKContext.getHostService().k().b();
            if (PatchProxy.isSupport(new Object[]{weakHandler, new Long(j2), new Long(b2), str2}, a2, h.f9797a, false, 4007, new Class[]{Handler.class, Long.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
                h hVar = a2;
                PatchProxy.accessDispatch(new Object[]{weakHandler, new Long(j2), new Long(b2), str2}, hVar, h.f9797a, false, 4007, new Class[]{Handler.class, Long.TYPE, Long.TYPE, String.class}, Void.TYPE);
                return;
            }
            ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).sendDecorationText(new o().a("room_id", String.valueOf(j2)).a("user_id", String.valueOf(b2)).a("deco_text", String.valueOf(str)).f17622b).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new x(weakHandler), new y(weakHandler));
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f11359a, false, 5166, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f11359a, false, 5166, new Class[]{Message.class}, Void.TYPE);
        } else if (message != null && b() != null) {
            if (message.what == 0) {
                this.h = (String) b.ar.a();
                if (PatchProxy.isSupport(new Object[0], this, f11359a, false, 5169, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11359a, false, 5169, new Class[0], Void.TYPE);
                } else if (b() != null && this.f11363e) {
                    long longValue = ((Long) b.at.a()).longValue();
                    if (longValue != this.g || longValue == 0) {
                        b.at.a(0L);
                        b.au.a("");
                        b.ar.a("");
                        b.as.a(31);
                    } else {
                        String str = (String) b.au.a();
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                List list = (List) j.q().c().fromJson(str, new TypeToken<List<c>>() {
                                }.getType());
                                if (!Lists.isEmpty(list)) {
                                    int[] d2 = ((a) b()).d();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        c cVar = (c) it2.next();
                                        if (cVar.k != d2[0] || cVar.l != d2[1]) {
                                            it2.remove();
                                        }
                                    }
                                }
                                if (list != null && list.size() > 0) {
                                    ((a) b()).b(list);
                                }
                            } catch (Exception unused) {
                                b.au.a("");
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.h) && ((Integer) b.as.a()).intValue() != 33) {
                    this.l = false;
                    a(this.h);
                }
                return;
            }
            if (26 == message.what) {
                this.f11361b = false;
            }
            if (26 == message.what) {
                if (message.obj instanceof DecorationTextAuditResult) {
                    DecorationTextAuditResult decorationTextAuditResult = (DecorationTextAuditResult) message.obj;
                    if (PatchProxy.isSupport(new Object[]{decorationTextAuditResult}, this, f11359a, false, 5168, new Class[]{DecorationTextAuditResult.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{decorationTextAuditResult}, this, f11359a, false, 5168, new Class[]{DecorationTextAuditResult.class}, Void.TYPE);
                    } else if (!(b() == null || decorationTextAuditResult == null)) {
                        if (31 == decorationTextAuditResult.getAuditStatus()) {
                            this.h = "";
                            b.as.a(31);
                            b.ar.a("");
                            ((a) b()).c();
                            String auditNotPassWarnText = decorationTextAuditResult.getAuditNotPassWarnText();
                            if (TextUtils.isEmpty(auditNotPassWarnText)) {
                                auditNotPassWarnText = a((int) C0906R.string.cuw);
                            }
                            ((a) b()).a(auditNotPassWarnText);
                            this.l = true;
                        } else {
                            if (this.l) {
                                this.k++;
                                this.h = this.i;
                                ((a) b()).b(this.h);
                                ((a) b()).b();
                            } else {
                                this.l = true;
                            }
                            b.as.a(Integer.valueOf(decorationTextAuditResult.getAuditStatus()));
                            b.ar.a(this.h);
                        }
                    }
                } else if (message.obj instanceof com.bytedance.android.live.a.a.b.a) {
                    ((a) b()).a(((com.bytedance.android.live.a.a.b.a) message.obj).getPrompt());
                } else {
                    ((a) b()).a(a((int) C0906R.string.cux));
                }
            }
        }
    }

    public i(long j2, long j3, boolean z) {
        this.f11364f = j2;
        this.g = j3;
        this.f11363e = z;
    }
}
