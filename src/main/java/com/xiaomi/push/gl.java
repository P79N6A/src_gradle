package com.xiaomi.push;

import android.os.Build;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fi;
import com.xiaomi.push.service.au;
import com.xiaomi.push.service.ba;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

public class gl {

    /* renamed from: a  reason: collision with root package name */
    private int f82111a;

    /* renamed from: a  reason: collision with other field name */
    private go f443a;

    /* renamed from: a  reason: collision with other field name */
    private OutputStream f444a;

    /* renamed from: a  reason: collision with other field name */
    ByteBuffer f445a = ByteBuffer.allocate(2048);

    /* renamed from: a  reason: collision with other field name */
    private Adler32 f446a = new Adler32();

    /* renamed from: a  reason: collision with other field name */
    private byte[] f447a;

    /* renamed from: b  reason: collision with root package name */
    private int f82112b;

    /* renamed from: b  reason: collision with other field name */
    private ByteBuffer f448b = ByteBuffer.allocate(4);

    gl(OutputStream outputStream, go goVar) {
        this.f444a = new BufferedOutputStream(outputStream);
        this.f443a = goVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f82111a = timeZone.getRawOffset() / 3600000;
        this.f82112b = timeZone.useDaylightTime() ? 1 : 0;
    }

    public int a(gj gjVar) {
        int c2 = gjVar.c();
        if (c2 > 32768) {
            b.a("Blob size=" + c2 + " should be less than 32768" + " Drop blob chid=" + gjVar.a() + " id=" + gjVar.e());
            return 0;
        }
        this.f445a.clear();
        int i = c2 + 8 + 4;
        if (i > this.f445a.capacity() || this.f445a.capacity() > 4096) {
            this.f445a = ByteBuffer.allocate(i);
        }
        this.f445a.putShort(-15618);
        this.f445a.putShort(5);
        this.f445a.putInt(c2);
        int position = this.f445a.position();
        this.f445a = gjVar.a(this.f445a);
        if (!"CONN".equals(gjVar.a())) {
            if (this.f447a == null) {
                this.f447a = this.f443a.a();
            }
            au.a(this.f447a, this.f445a.array(), true, position, c2);
        }
        this.f446a.reset();
        this.f446a.update(this.f445a.array(), 0, this.f445a.position());
        this.f448b.putInt(0, (int) this.f446a.getValue());
        this.f444a.write(this.f445a.array(), 0, this.f445a.position());
        this.f444a.write(this.f448b.array(), 0, 4);
        this.f444a.flush();
        int position2 = this.f445a.position() + 4;
        b.c("[Slim] Wrote {cmd=" + gjVar.a() + ";chid=" + gjVar.a() + ";len=" + position2 + "}");
        return position2;
    }

    public void a() {
        fi.e eVar = new fi.e();
        eVar.a(106);
        eVar.a(Build.MODEL);
        eVar.b(u.a());
        eVar.c(ba.a());
        eVar.b(38);
        eVar.d(this.f443a.b());
        eVar.e(this.f443a.a());
        eVar.f(Locale.getDefault().toString());
        eVar.c(Build.VERSION.SDK_INT);
        byte[] a2 = this.f443a.a().a();
        if (a2 != null) {
            eVar.a(fi.b.a(a2));
        }
        gj gjVar = new gj();
        gjVar.a(0);
        gjVar.a("CONN", (String) null);
        gjVar.a(0, "xiaomi.com", null);
        gjVar.a(eVar.a(), (String) null);
        a(gjVar);
        b.a("[slim] open conn: andver=" + Build.VERSION.SDK_INT + " sdk=38" + " hash=" + ba.a() + " tz=" + this.f82111a + ":" + this.f82112b + " Model=" + Build.MODEL + " os=" + Build.VERSION.INCREMENTAL);
    }

    public void b() {
        gj gjVar = new gj();
        gjVar.a("CLOSE", (String) null);
        a(gjVar);
        this.f444a.close();
    }
}
