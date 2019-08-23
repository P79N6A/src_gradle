package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bj implements hc {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f81860a;

    /* renamed from: a  reason: collision with other field name */
    private a f174a = null;

    /* renamed from: a  reason: collision with other field name */
    private gq f175a = null;

    /* renamed from: a  reason: collision with other field name */
    private gt f176a = null;

    /* renamed from: a  reason: collision with other field name */
    private final String f177a = "[Slim] ";

    /* renamed from: a  reason: collision with other field name */
    private SimpleDateFormat f178a = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: b  reason: collision with root package name */
    private a f81861b = null;

    class a implements gv, hd {

        /* renamed from: a  reason: collision with other field name */
        String f179a;

        a(boolean z) {
            this.f179a = z ? " RCV " : " Sent ";
        }

        public void a(gj gjVar) {
            StringBuilder sb;
            String str;
            if (bj.f81860a) {
                sb = new StringBuilder("[Slim] ");
                sb.append(bj.a(bj.this).format(new Date()));
                sb.append(this.f179a);
                str = gjVar.toString();
            } else {
                sb = new StringBuilder("[Slim] ");
                sb.append(bj.a(bj.this).format(new Date()));
                sb.append(this.f179a);
                sb.append(" Blob [");
                sb.append(gjVar.a());
                sb.append(",");
                sb.append(gjVar.a());
                sb.append(",");
                sb.append(gjVar.e());
                str = "]";
            }
            sb.append(str);
            b.c(sb.toString());
        }

        public void a(hh hhVar) {
            StringBuilder sb;
            String str;
            if (bj.f81860a) {
                sb = new StringBuilder("[Slim] ");
                sb.append(bj.a(bj.this).format(new Date()));
                sb.append(this.f179a);
                sb.append(" PKT ");
                str = hhVar.a();
            } else {
                sb = new StringBuilder("[Slim] ");
                sb.append(bj.a(bj.this).format(new Date()));
                sb.append(this.f179a);
                sb.append(" PKT [");
                sb.append(hhVar.k());
                sb.append(",");
                sb.append(hhVar.j());
                str = "]";
            }
            sb.append(str);
            b.c(sb.toString());
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m118a(hh hhVar) {
            return true;
        }
    }

    static {
        boolean z = true;
        if (u.a() != 1) {
            z = false;
        }
        f81860a = z;
    }

    public bj(gq gqVar) {
        this.f175a = gqVar;
        a();
    }

    private void a() {
        this.f174a = new a(true);
        this.f81861b = new a(false);
        this.f175a.a((gv) this.f174a, (hd) this.f174a);
        this.f175a.b((gv) this.f81861b, (hd) this.f81861b);
        this.f176a = new bk(this);
    }
}
