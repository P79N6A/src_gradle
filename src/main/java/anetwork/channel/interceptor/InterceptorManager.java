package anetwork.channel.interceptor;

import anet.channel.util.ALog;
import java.util.concurrent.CopyOnWriteArrayList;

public class InterceptorManager {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<Interceptor> f1553a = new CopyOnWriteArrayList<>();

    private InterceptorManager() {
    }

    public static int getSize() {
        return f1553a.size();
    }

    public static boolean contains(Interceptor interceptor) {
        return f1553a.contains(interceptor);
    }

    public static Interceptor getInterceptor(int i) {
        return f1553a.get(i);
    }

    public static void removeInterceptor(Interceptor interceptor) {
        f1553a.remove(interceptor);
        ALog.i("anet.InterceptorManager", "[remoteInterceptor]", null, "interceptors", f1553a.toString());
    }

    public static void addInterceptor(Interceptor interceptor) {
        if (!f1553a.contains(interceptor)) {
            f1553a.add(interceptor);
            ALog.i("anet.InterceptorManager", "[addInterceptor]", null, "interceptors", f1553a.toString());
        }
    }
}
