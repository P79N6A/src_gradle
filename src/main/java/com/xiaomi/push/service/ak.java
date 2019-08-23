package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.dp;
import com.xiaomi.push.dt;
import com.xiaomi.push.ec;
import com.xiaomi.push.fi;
import com.xiaomi.push.gf;
import com.xiaomi.push.gj;
import com.xiaomi.push.gr;
import com.xiaomi.push.he;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.ie;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;
import java.util.Date;

public class ak {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f82496a;

    ak(XMPushService xMPushService) {
        this.f82496a = xMPushService;
    }

    private void a(he heVar) {
        String c2 = heVar.c();
        if (!TextUtils.isEmpty(c2)) {
            String[] split = c2.split(";");
            dp a2 = dt.a().a(gr.a(), false);
            if (a2 != null && split.length > 0) {
                a2.a(split);
                this.f82496a.a(20, (Exception) null);
                this.f82496a.a(true);
            }
        }
    }

    private void b(hh hhVar) {
        String l = hhVar.l();
        String k = hhVar.k();
        if (!TextUtils.isEmpty(l) && !TextUtils.isEmpty(k)) {
            al.b a2 = al.a().a(k, l);
            if (a2 != null) {
                hv.a(this.f82496a, a2.f939a, (long) hv.a(hhVar.a()), true, true, System.currentTimeMillis());
            }
        }
    }

    private void c(gj gjVar) {
        String g = gjVar.g();
        String num = Integer.toString(gjVar.a());
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(num)) {
            al.b a2 = al.a().a(num, g);
            if (a2 != null) {
                hv.a(this.f82496a, a2.f939a, (long) gjVar.c(), true, true, System.currentTimeMillis());
            }
        }
    }

    public void a(gj gjVar) {
        if (5 != gjVar.a()) {
            c(gjVar);
        }
        try {
            b(gjVar);
        } catch (Exception e2) {
            b.a("handle Blob chid = " + gjVar.a() + " cmd = " + gjVar.a() + " packetid = " + gjVar.e() + " failure ", (Throwable) e2);
        }
    }

    public void a(hh hhVar) {
        if (!"5".equals(hhVar.k())) {
            b(hhVar);
        }
        String k = hhVar.k();
        if (TextUtils.isEmpty(k)) {
            k = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            hhVar.l(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        if (k.equals(PushConstants.PUSH_TYPE_NOTIFY)) {
            b.a("Received wrong packet with chid = 0 : " + hhVar.a());
        }
        if (hhVar instanceof hf) {
            he a2 = hhVar.a("kick");
            if (a2 != null) {
                String l = hhVar.l();
                String a3 = a2.a("type");
                String a4 = a2.a("reason");
                b.a("kicked by server, chid=" + k + " res=" + al.b.a(l) + " type=" + a3 + " reason=" + a4);
                if ("wait".equals(a3)) {
                    al.b a5 = al.a().a(k, l);
                    if (a5 != null) {
                        this.f82496a.a(a5);
                        a5.a(al.c.unbind, 3, 0, a4, a3);
                    }
                } else {
                    this.f82496a.a(k, l, 3, a4, a3);
                    al.a().a(k, l);
                    return;
                }
            }
            this.f82496a.b().a(this.f82496a, k, hhVar);
        }
        if (hhVar instanceof hg) {
            hg hgVar = (hg) hhVar;
            if ("redir".equals(hgVar.b())) {
                he a6 = hgVar.a("hosts");
                if (a6 != null) {
                    a(a6);
                }
            }
        }
        this.f82496a.b().a(this.f82496a, k, hhVar);
    }

    public void b(gj gjVar) {
        al.c cVar;
        int i;
        int i2;
        String a2 = gjVar.a();
        if (gjVar.a() != 0) {
            String num = Integer.toString(gjVar.a());
            if ("SECMSG".equals(gjVar.a())) {
                if (!gjVar.a()) {
                    this.f82496a.b().a(this.f82496a, num, gjVar);
                } else {
                    b.a("Recv SECMSG errCode = " + gjVar.b() + " errStr = " + gjVar.c());
                }
            } else if ("BIND".equals(a2)) {
                fi.d a3 = fi.d.a(gjVar.a());
                String g = gjVar.g();
                al.b a4 = al.a().a(num, g);
                if (a4 != null) {
                    if (a3.a()) {
                        b.a("SMACK: channel bind succeeded, chid=" + gjVar.a());
                        a4.a(al.c.binded, 1, 0, (String) null, (String) null);
                        return;
                    }
                    String a5 = a3.a();
                    if ("auth".equals(a5)) {
                        if ("invalid-sig".equals(a3.b())) {
                            b.a("SMACK: bind error invalid-sig token = " + a4.f82500c + " sec = " + a4.h);
                            ie.a(0, gf.BIND_INVALID_SIG.a(), 1, null, 0);
                        }
                        cVar = al.c.unbind;
                        i = 1;
                        i2 = 5;
                    } else if ("cancel".equals(a5)) {
                        cVar = al.c.unbind;
                        i = 1;
                        i2 = 7;
                    } else {
                        if ("wait".equals(a5)) {
                            this.f82496a.a(a4);
                            a4.a(al.c.unbind, 1, 7, a3.b(), a5);
                        }
                        b.a("SMACK: channel bind failed, chid=" + num + " reason=" + a3.b());
                    }
                    a4.a(cVar, i, i2, a3.b(), a5);
                    al.a().a(num, g);
                    b.a("SMACK: channel bind failed, chid=" + num + " reason=" + a3.b());
                }
            } else if ("KICK".equals(a2)) {
                fi.g a6 = fi.g.a(gjVar.a());
                String g2 = gjVar.g();
                String a7 = a6.a();
                String b2 = a6.b();
                b.a("kicked by server, chid=" + num + " res= " + al.b.a(g2) + " type=" + a7 + " reason=" + b2);
                if ("wait".equals(a7)) {
                    al.b a8 = al.a().a(num, g2);
                    if (a8 != null) {
                        this.f82496a.a(a8);
                        a8.a(al.c.unbind, 3, 0, b2, a7);
                    }
                } else {
                    this.f82496a.a(num, g2, 3, b2, a7);
                    al.a().a(num, g2);
                }
            }
        } else if ("PING".equals(a2)) {
            byte[] a9 = gjVar.a();
            if (a9 != null && a9.length > 0) {
                fi.j a10 = fi.j.a(a9);
                if (a10.b()) {
                    ba.a().a(a10.a());
                }
            }
            if (!"com.xiaomi.xmsf".equals(this.f82496a.getPackageName())) {
                this.f82496a.a();
            }
            if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(gjVar.e())) {
                b.a("received a server ping");
            } else {
                ie.b();
            }
            this.f82496a.b();
        } else if ("SYNC".equals(a2)) {
            if ("CONF".equals(gjVar.b())) {
                ba.a().a(fi.b.a(gjVar.a()));
            } else if (TextUtils.equals("U", gjVar.b())) {
                fi.k a11 = fi.k.a(gjVar.a());
                ec.a((Context) this.f82496a).a(a11.a(), a11.b(), new Date(a11.a()), new Date(a11.b()), a11.c() * 1024, a11.e());
                gj gjVar2 = new gj();
                gjVar2.a(0);
                gjVar2.a(gjVar.a(), "UCA");
                gjVar2.a(gjVar.e());
                this.f82496a.a((XMPushService.i) new aw(this.f82496a, gjVar2));
            } else if (TextUtils.equals("P", gjVar.b())) {
                fi.i a12 = fi.i.a(gjVar.a());
                gj gjVar3 = new gj();
                gjVar3.a(0);
                gjVar3.a(gjVar.a(), "PCA");
                gjVar3.a(gjVar.e());
                fi.i iVar = new fi.i();
                if (a12.a()) {
                    iVar.a(a12.a());
                }
                gjVar3.a(iVar.a(), (String) null);
                this.f82496a.a((XMPushService.i) new aw(this.f82496a, gjVar3));
                b.a("ACK msgP: id = " + gjVar.e());
            }
        } else if ("NOTIFY".equals(gjVar.a())) {
            fi.h a13 = fi.h.a(gjVar.a());
            b.a("notify by server err = " + a13.c() + " desc = " + a13.a());
        }
    }
}
