package anetwork.channel.util;

import java.util.concurrent.atomic.AtomicInteger;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f1605a = new AtomicInteger(0);

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        if (str != null) {
            sb.append(str);
            sb.append('.');
        }
        if (str2 != null) {
            sb.append(str2);
            sb.append(f1605a.incrementAndGet() & Integer.MAX_VALUE);
        }
        return sb.toString();
    }
}
