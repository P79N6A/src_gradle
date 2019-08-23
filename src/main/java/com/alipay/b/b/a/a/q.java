package com.alipay.b.b.a.a;

import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

public final class q extends d {
    private n g;

    public q(n nVar, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, "application/x-www-form-urlencoded", z);
        this.g = nVar;
    }

    public final Object a() {
        v vVar = new v(this.g.a());
        vVar.f5296b = this.f5256b;
        vVar.f5297c = this.f5259e;
        vVar.f5299e = this.f5260f;
        vVar.a("id", String.valueOf(this.f5258d));
        vVar.a("operationType", this.f5257c);
        vVar.a("gzip", String.valueOf(this.g.d()));
        vVar.a((Header) new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> list = this.g.c().f5262b;
        if (list != null && !list.isEmpty()) {
            for (Header a2 : list) {
                vVar.a(a2);
            }
        }
        StringBuilder sb = new StringBuilder("threadid = ");
        sb.append(Thread.currentThread().getId());
        sb.append("; ");
        sb.append(vVar.toString());
        try {
            ab abVar = (ab) this.g.b().a(vVar).get();
            if (abVar != null) {
                return abVar.f5243e;
            }
            throw new c((Integer) 9, "response is null");
        } catch (InterruptedException e2) {
            throw new c(13, "", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null || !(cause instanceof a)) {
                throw new c(9, "", e3);
            }
            a aVar = (a) cause;
            int code = aVar.getCode();
            switch (code) {
                case 1:
                    code = 2;
                    break;
                case 2:
                    code = 3;
                    break;
                case 3:
                    code = 4;
                    break;
                case 4:
                    code = 5;
                    break;
                case 5:
                    code = 6;
                    break;
                case 6:
                    code = 7;
                    break;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    code = 8;
                    break;
                case 8:
                    code = 15;
                    break;
                case 9:
                    code = 16;
                    break;
            }
            throw new c(Integer.valueOf(code), aVar.getMsg());
        } catch (CancellationException e4) {
            throw new c(13, "", e4);
        }
    }
}
