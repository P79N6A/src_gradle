package anetwork.channel.cache;

import anet.channel.util.HttpHelper;
import anetwork.channel.cache.Cache;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeZone f1500a = TimeZone.getTimeZone("GMT");

    /* renamed from: b  reason: collision with root package name */
    private static final DateFormat f1501b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f1501b = simpleDateFormat;
        simpleDateFormat.setTimeZone(f1500a);
    }

    public static String a(long j) {
        return f1501b.format(new Date(j));
    }

    private static long a(String str) {
        if (str.length() == 0) {
            return 0;
        }
        try {
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = f1501b.parse(str, parsePosition);
            if (parsePosition.getIndex() == str.length()) {
                return parse.getTime();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static Cache.Entry a(Map<String, List<String>> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Map<String, List<String>> map2 = map;
        long currentTimeMillis = System.currentTimeMillis();
        String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map2, "Cache-Control");
        boolean z = true;
        int i = 0;
        if (singleHeaderFieldByKey != null) {
            String[] split = singleHeaderFieldByKey.split(",");
            j = 0;
            while (true) {
                if (i >= split.length) {
                    break;
                }
                String trim = split[i].trim();
                if (trim.equals("no-store")) {
                    return null;
                }
                if (trim.equals("no-cache")) {
                    j = 0;
                    break;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                }
                i++;
            }
        } else {
            j = 0;
            z = false;
        }
        String singleHeaderFieldByKey2 = HttpHelper.getSingleHeaderFieldByKey(map2, "Date");
        if (singleHeaderFieldByKey2 != null) {
            j2 = a(singleHeaderFieldByKey2);
        } else {
            j2 = 0;
        }
        String singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(map2, "Expires");
        if (singleHeaderFieldByKey3 != null) {
            j3 = a(singleHeaderFieldByKey3);
        } else {
            j3 = 0;
        }
        String singleHeaderFieldByKey4 = HttpHelper.getSingleHeaderFieldByKey(map2, "Last-Modified");
        if (singleHeaderFieldByKey4 != null) {
            j4 = a(singleHeaderFieldByKey4);
        } else {
            j4 = 0;
        }
        String singleHeaderFieldByKey5 = HttpHelper.getSingleHeaderFieldByKey(map2, "ETag");
        if (z) {
            currentTimeMillis += j * 1000;
        } else if (j2 <= 0 || j3 < j2) {
            j5 = j4;
            if (j5 <= 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis != 0 && singleHeaderFieldByKey5 == null) {
                return null;
            }
            Cache.Entry entry = new Cache.Entry();
            entry.etag = singleHeaderFieldByKey5;
            entry.ttl = currentTimeMillis;
            entry.serverDate = j2;
            entry.lastModified = j5;
            entry.responseHeaders = map2;
            return entry;
        } else {
            currentTimeMillis += j3 - j2;
        }
        j5 = j4;
        if (currentTimeMillis != 0) {
        }
        Cache.Entry entry2 = new Cache.Entry();
        entry2.etag = singleHeaderFieldByKey5;
        entry2.ttl = currentTimeMillis;
        entry2.serverDate = j2;
        entry2.lastModified = j5;
        entry2.responseHeaders = map2;
        return entry2;
    }
}
