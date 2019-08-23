package com.ss.android.ugc.aweme.im.sdk.chat;

import android.text.TextUtils;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.k;
import com.bytedance.im.core.d.o;
import com.bytedance.im.core.d.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.net.n;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.d.b;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.c;

public class j extends b implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50667a = null;

    /* renamed from: e  reason: collision with root package name */
    private static String f50668e = "j";

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f50669b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f50670c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f50671d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f50672f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private o w;
    private MessageAdapter x;
    private e y;

    public final void a(int i2, p pVar) {
    }

    public final void g(List<p> list) {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50667a, false, 50400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50667a, false, 50400, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.im.core.d.b a2 = d.a().a(this.f50669b.toString());
        long a3 = e.a(this.f50669b.toString());
        if (a2 == null || a2.isTemp()) {
            d.a().a(a3, (com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b>) new com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50673a;

                public final void a(com.bytedance.im.core.d.j jVar) {
                }

                public final /* synthetic */ void a(Object obj) {
                    com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f50673a, false, 50415, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f50673a, false, 50415, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                        return;
                    }
                    d.a();
                    d.d(j.this.f50669b.toString());
                }
            });
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f50667a, false, 50399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50667a, false, 50399, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        o oVar = this.w;
        oVar.f21293d = null;
        oVar.f21290a.clear();
        g a2 = g.a();
        String str = oVar.f21291b;
        List list = a2.f21195e.get(str);
        list.remove(oVar);
        a2.f21195e.put(str, list);
        com.bytedance.im.core.b.c.b.a().a(oVar.h);
        oVar.h.clear();
        this.y.b();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50667a, false, 50397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50667a, false, 50397, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        a();
        o oVar = this.w;
        if (oVar.f21294e) {
            d a2 = d.a();
            a2.f21260c.add(oVar.f21291b);
        }
        d.a();
        d.c(this.w.f21291b);
        if (this.f50672f) {
            this.x.notifyDataSetChanged();
            this.f50672f = false;
        }
    }

    public void onStop() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f50667a, false, 50398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50667a, false, 50398, new Class[0], Void.TYPE);
            return;
        }
        o oVar = this.w;
        if (oVar.f21294e) {
            d.a().f21260c.remove(oVar.f21291b);
        }
        d.a();
        d.c(this.w.f21291b);
        this.p += com.ss.android.ugc.aweme.im.sdk.chat.net.o.f50968b;
        this.t += n.f50956d;
        com.ss.android.ugc.aweme.im.sdk.chat.net.o.f50968b = 0;
        n.f50956d = 0;
        z a2 = z.a();
        String charSequence = this.f50669b.toString();
        int i2 = this.g;
        int i3 = this.h;
        int i4 = this.i;
        int i5 = this.j;
        int i6 = this.k;
        int i7 = this.l;
        int i8 = this.m;
        int i9 = this.n;
        int i10 = this.o;
        int i11 = this.p;
        int i12 = this.q;
        int i13 = this.r;
        int i14 = this.s;
        z zVar = a2;
        int i15 = this.t;
        int i16 = this.u;
        int i17 = this.v;
        Object[] objArr = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)};
        int i18 = i13;
        Object[] objArr2 = objArr;
        int i19 = i12;
        int i20 = i11;
        int i21 = i10;
        int i22 = i9;
        int i23 = i8;
        int i24 = i7;
        if (PatchProxy.isSupport(objArr2, zVar, z.f52670a, false, 53567, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i24), Integer.valueOf(i23), Integer.valueOf(i22), Integer.valueOf(i21), Integer.valueOf(i20), Integer.valueOf(i19), Integer.valueOf(i18), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)}, zVar, z.f52670a, false, 53567, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            String str2 = "[" + (i2 + i3) + "," + i3 + "]";
            String str3 = "[" + (i4 + i5) + "," + i5 + "]";
            StringBuilder sb = new StringBuilder("[");
            int i25 = i24;
            sb.append(i6 + i25);
            sb.append(",");
            sb.append(i25);
            sb.append("]");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("[");
            int i26 = i22;
            sb3.append(i23 + i26);
            sb3.append(",");
            sb3.append(i26);
            sb3.append("]");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder("[");
            int i27 = i20;
            sb5.append(i21 + i27);
            sb5.append(",");
            sb5.append(i27);
            sb5.append("]");
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder("[");
            int i28 = i18;
            sb7.append(i19 + i28);
            sb7.append(",");
            sb7.append(i28);
            sb7.append("]");
            String sb8 = sb7.toString();
            String str4 = "[" + (i14 + i15) + "," + i15 + "]";
            long a3 = e.a(charSequence);
            HashMap hashMap = new HashMap();
            hashMap.put("send_message", str2);
            hashMap.put("send_emoji", str3);
            hashMap.put("send_favorite_emoji", sb2);
            hashMap.put("send_giphy", sb4);
            hashMap.put("send_pic", sb6);
            hashMap.put("send_text", sb8);
            hashMap.put("send_audio", str4);
            hashMap.put("send_video", "[" + (i16 + i17) + "," + i17 + "]");
            hashMap.put("to_user_id", String.valueOf(a3));
            r.a("chat_stats", (Map) hashMap);
        }
        String charSequence2 = this.f50669b.toString();
        if (this.x.h()) {
            str = "stranger";
        } else {
            str = "no_stranger";
        }
        int i29 = this.g;
        int i30 = this.h;
        if (PatchProxy.isSupport(new Object[]{charSequence2, str, Integer.valueOf(i29), Integer.valueOf(i30)}, zVar, z.f52670a, false, 53570, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2, str, Integer.valueOf(i29), Integer.valueOf(i30)}, zVar, z.f52670a, false, 53570, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event", "chat_stats");
            hashMap2.put("label", "message");
            hashMap2.put("success_cnt", String.valueOf(i29));
            hashMap2.put("fail_cnt", String.valueOf(i30));
            hashMap2.put("session_id", String.valueOf(e.a(charSequence2)));
            hashMap2.put("source_type", str);
            a.a().e().monitorMsgSendStatus(hashMap2);
        }
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.i = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.f50672f = true;
    }

    public final void a(com.bytedance.im.core.d.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f50667a, false, 50412, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f50667a, false, 50412, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
            return;
        }
        this.w.a(true);
    }

    public final void b(com.bytedance.im.core.d.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f50667a, false, 50414, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f50667a, false, 50414, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
            return;
        }
        super.b(bVar);
        if (this.f50671d != null) {
            this.f50671d.run();
        }
    }

    public final void c(com.bytedance.im.core.d.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f50667a, false, 50413, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f50667a, false, 50413, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
            return;
        }
        super.c(bVar);
        if (this.f50670c != null) {
            this.f50670c.run();
        }
    }

    public final void d(List<com.bytedance.im.core.d.n> list) {
        List<com.bytedance.im.core.d.n> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f50667a, false, 50407, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f50667a, false, 50407, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.x.a(list2, 4);
    }

    public final void e(List<com.bytedance.im.core.d.n> list) {
        List<com.bytedance.im.core.d.n> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f50667a, false, 50408, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f50667a, false, 50408, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.x.a(list2, 5);
    }

    public final void f(List<com.bytedance.im.core.d.n> list) {
        List<com.bytedance.im.core.d.n> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f50667a, false, 50409, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f50667a, false, 50409, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.x.a(list2, 6);
    }

    public static void c(com.bytedance.im.core.d.n nVar) {
        BaseExtra baseExtra;
        com.bytedance.im.core.d.n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, null, f50667a, true, 50396, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, null, f50667a, true, 50396, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE);
            return;
        }
        if (nVar.getMsgStatus() == 3 && !nVar.getLocalExt().isEmpty() && nVar.getLocalExt().containsKey("s:send_response_check_msg")) {
            try {
                baseExtra = (BaseExtra) l.a(nVar.getLocalExt().get("s:send_response_check_msg"), BaseExtra.class);
            } catch (Exception unused) {
                baseExtra = null;
            }
            if (com.ss.android.ugc.aweme.im.sdk.i.a.a(baseExtra)) {
                com.ss.android.ugc.aweme.im.sdk.i.a.a().a(nVar2, baseExtra.getStatusCode());
            }
        }
    }

    public final void a(com.bytedance.im.core.d.n nVar) {
        com.bytedance.im.core.d.n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f50667a, false, 50406, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f50667a, false, 50406, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar2);
        this.x.a((List<com.bytedance.im.core.d.n>) arrayList, 3);
    }

    public final void b(com.bytedance.im.core.d.n nVar) {
        com.bytedance.im.core.d.n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f50667a, false, 50410, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f50667a, false, 50410, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar2);
        this.x.a((List<com.bytedance.im.core.d.n>) arrayList, 7);
    }

    public final void c(List<com.bytedance.im.core.d.n> list) {
        List<com.bytedance.im.core.d.n> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f50667a, false, 50405, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f50667a, false, 50405, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.x.a(list2, 2);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50667a, false, 50411, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50667a, false, 50411, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        MessageAdapter messageAdapter = this.x;
        if (PatchProxy.isSupport(new Object[0], messageAdapter, MessageAdapter.f50217a, false, 50334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], messageAdapter, MessageAdapter.f50217a, false, 50334, new Class[0], Void.TYPE);
            return;
        }
        if (messageAdapter.f50218b == 1) {
            messageAdapter.f50218b = 0;
        }
        if (messageAdapter.f50221e != null) {
            messageAdapter.f50221e.clear();
        }
    }

    public j(String str, MessageAdapter messageAdapter) {
        this.f50669b = str;
        this.x = messageAdapter;
        this.w = new o(str);
        o oVar = this.w;
        oVar.f21293d = this;
        g a2 = g.a();
        String str2 = oVar.f21291b;
        List list = a2.f21195e.get(str2);
        list = list == null ? new ArrayList() : list;
        if (!list.contains(oVar)) {
            list.add(oVar);
        }
        a2.f21195e.put(str2, list);
        d.a();
        d.d(oVar.f21291b);
        messageAdapter.f50219c = this.w;
        this.y = new e(str);
        this.y.a((h) this);
    }

    public final void b(int i2, com.bytedance.im.core.d.n nVar) {
        com.bytedance.im.core.d.n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), nVar2}, this, f50667a, false, 50404, new Class[]{Integer.TYPE, com.bytedance.im.core.d.n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), nVar2}, this, f50667a, false, 50404, new Class[]{Integer.TYPE, com.bytedance.im.core.d.n.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar2);
        this.x.a((List<com.bytedance.im.core.d.n>) arrayList, 1);
    }

    public final void a(int i2, com.bytedance.im.core.d.n nVar) {
        String str;
        int i3;
        com.bytedance.im.core.d.n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), nVar2}, this, f50667a, false, 50403, new Class[]{Integer.TYPE, com.bytedance.im.core.d.n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), nVar2}, this, f50667a, false, 50403, new Class[]{Integer.TYPE, com.bytedance.im.core.d.n.class}, Void.TYPE);
            return;
        }
        if (this.x.h() && nVar.getMsgStatus() == 2) {
            c.a().d(new com.ss.android.ugc.aweme.im.sdk.model.d(this.f50669b.toString()));
        }
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f50667a, false, 50401, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f50667a, false, 50401, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE);
        } else if (nVar.getMsgStatus() == 3) {
            this.h++;
            if (nVar.getMsgType() == 5) {
                BaseContent content = m.content(nVar);
                if (content != null) {
                    if (content.getType() == 501) {
                        this.l++;
                    } else if (content.getType() == 502) {
                        this.n++;
                    } else {
                        this.j++;
                    }
                }
            } else if (nVar.getMsgType() == 2) {
                this.p++;
            } else if (nVar.getMsgType() == 7) {
                this.r++;
            } else if (nVar.getMsgType() == 17) {
                this.t++;
            } else if (nVar.getMsgType() == 30) {
                this.v++;
            }
        } else if (nVar.getMsgStatus() == 2) {
            this.g++;
            if (nVar.getMsgType() == 5) {
                BaseContent content2 = m.content(nVar);
                if (content2 != null) {
                    if (content2.getType() == 501) {
                        this.k++;
                    } else if (content2.getType() == 502) {
                        this.m++;
                    } else {
                        this.i++;
                    }
                }
            } else if (nVar.getMsgType() == 2) {
                this.o++;
            } else if (nVar.getMsgType() == 7) {
                this.q++;
            } else if (nVar.getMsgType() == 17) {
                this.s++;
            } else if (nVar.getMsgType() == 30) {
                this.u++;
            }
        }
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f50667a, false, 50402, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f50667a, false, 50402, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE);
        } else {
            o oVar = this.x.m;
            if (oVar.isGroupChat()) {
                str = "group";
            } else {
                str = PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE;
            }
            String str2 = str;
            String h2 = ad.h(nVar);
            try {
                i3 = ((CheckMessage) l.a(nVar.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class)).status_code;
            } catch (Exception unused) {
                i3 = 0;
            }
            if (!TextUtils.isEmpty(h2)) {
                if (nVar.getMsgStatus() == 2) {
                    z.a().a(oVar.getConversationId(), oVar.getSingleChatFromUserId(), str2, h2, "success", i3);
                } else if (nVar.getMsgStatus() == 3) {
                    z.a().a(oVar.getConversationId(), oVar.getSingleChatFromUserId(), str2, h2, "failure", i3);
                } else if (nVar.getMsgStatus() == 1) {
                    z.a().a(nVar2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar2);
        this.x.a((List<com.bytedance.im.core.d.n>) arrayList, 0);
        c(nVar);
        if (nVar.getMsgStatus() == 3) {
            a();
        }
    }
}
