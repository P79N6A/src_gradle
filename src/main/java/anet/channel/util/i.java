package anet.channel.util;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f1452a = new AtomicInteger();

    public static String a(String str) {
        if (f1452a.get() == Integer.MAX_VALUE) {
            f1452a.set(0);
        }
        if (!TextUtils.isEmpty(str)) {
            return StringUtils.concatString(str, ".AWCN", String.valueOf(f1452a.incrementAndGet()));
        }
        return StringUtils.concatString("AWCN", String.valueOf(f1452a.incrementAndGet()));
    }
}
