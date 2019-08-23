package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.HashMap;
import java.util.Map;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Integer> f1451a;

    static {
        HashMap hashMap = new HashMap();
        f1451a = hashMap;
        hashMap.put("tpatch", 3);
        f1451a.put("so", 3);
        f1451a.put("json", 3);
        f1451a.put("html", 4);
        f1451a.put("htm", 4);
        f1451a.put("css", 5);
        f1451a.put("js", 5);
        f1451a.put("webp", 6);
        f1451a.put("png", 6);
        f1451a.put("jpg", 6);
        f1451a.put("do", 6);
        f1451a.put("zip", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f1451a.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f1451a.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }

    public static int a(Request request) {
        if (request == null) {
            throw new NullPointerException("url is null!");
        } else if (request.getHeaders().containsKey("x-pv")) {
            return 1;
        } else {
            String trySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
            if (trySolveFileExtFromUrlPath == null) {
                return 6;
            }
            Integer num = f1451a.get(trySolveFileExtFromUrlPath);
            if (num != null) {
                return num.intValue();
            }
            return 6;
        }
    }
}
