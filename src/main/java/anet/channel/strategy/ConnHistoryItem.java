package anet.channel.strategy;

import java.io.Serializable;

public class ConnHistoryItem implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    byte f1314a;

    /* renamed from: b  reason: collision with root package name */
    long f1315b;

    /* renamed from: c  reason: collision with root package name */
    long f1316c;

    ConnHistoryItem() {
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int i = 0;
        for (int i2 = this.f1314a & 255; i2 > 0; i2 >>= 1) {
            i += i2 & 1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if ((this.f1314a & 1) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        if (a() >= 3 && System.currentTimeMillis() - this.f1316c <= 300000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        long j;
        if (this.f1315b > this.f1316c) {
            j = this.f1315b;
        } else {
            j = this.f1316c;
        }
        if (j == 0 || System.currentTimeMillis() - j <= 86400000) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            j = this.f1315b;
        } else {
            j = this.f1316c;
        }
        if (currentTimeMillis - j > 10000) {
            this.f1314a = (this.f1314a << 1) | (z ^ true) ? (byte) 1 : 0;
            if (z) {
                this.f1315b = currentTimeMillis;
                return;
            }
            this.f1316c = currentTimeMillis;
        }
    }
}
