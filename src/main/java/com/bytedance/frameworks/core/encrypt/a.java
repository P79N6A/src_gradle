package com.bytedance.frameworks.core.encrypt;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static C0163a f19988a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f19989b;

    /* renamed from: com.bytedance.frameworks.core.encrypt.a$a  reason: collision with other inner class name */
    public interface C0163a {
        boolean b();

        boolean c();

        boolean d();
    }

    public static void a(C0163a aVar) {
        f19988a = aVar;
    }

    private static String a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static void a(Uri uri, Map<String, List<String>> map) throws IOException {
        if (uri != null) {
            try {
                String query = uri.getQuery();
                if (query != null) {
                    for (String str : query.split("&")) {
                        int indexOf = str.indexOf("=");
                        if (indexOf >= 0) {
                            String decode = URLDecoder.decode(str.substring(0, indexOf), "UTF-8");
                            List list = map.get(decode);
                            if (list == null) {
                                list = new LinkedList();
                            }
                            list.add(URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
                            map.put(decode, list);
                        } else {
                            String decode2 = URLDecoder.decode(str, "UTF-8");
                            List list2 = map.get(decode2);
                            if (list2 == null) {
                                list2 = new LinkedList();
                            }
                            list2.add("");
                            map.put(decode2, list2);
                        }
                    }
                }
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is null !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    public static String a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str) || f19988a == null || f19989b) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Uri parse = Uri.parse(str);
            a(parse, (Map<String, List<String>>) linkedHashMap);
            LinkedList linkedList = new LinkedList();
            a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_id");
            a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_type");
            a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_brand");
            a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "uuid");
            a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "openudid");
            String a2 = a((List<Pair<String, List<String>>>) linkedList, false, "UTF-8");
            if (TextUtils.isEmpty(a2)) {
                return str;
            }
            byte[] bytes = a2.getBytes();
            byte[] a3 = TTEncryptUtils.a(bytes, bytes.length);
            if (a3 == null) {
                return str;
            }
            String encodeToString = Base64.encodeToString(a3, 2);
            LinkedList linkedList2 = new LinkedList();
            if (f19988a.b()) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(encodeToString);
                linkedList2.add(new Pair("ss_queries", linkedList3));
            }
            if (f19988a.c()) {
                list.add(new Pair("X-SS-QUERIES", a(encodeToString, "UTF-8")));
            }
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        linkedList2.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
            }
            String a4 = a((List<Pair<String, List<String>>>) linkedList2, true, "UTF-8");
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            String path = parse.getPath();
            String fragment = parse.getFragment();
            StringBuilder sb = new StringBuilder();
            if (host != null) {
                if (scheme != null) {
                    sb.append(scheme);
                    sb.append("://");
                }
                sb.append(host);
                if (port > 0) {
                    sb.append(':');
                    sb.append(port);
                }
            }
            if (path == null || !path.startsWith("/")) {
                sb.append('/');
            }
            if (path != null) {
                sb.append(path);
            }
            if (a4 != null) {
                sb.append('?');
                sb.append(a4);
            }
            if (fragment != null) {
                sb.append('#');
                sb.append(fragment);
            }
            return Uri.parse(sb.toString()).toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    private static boolean a(Map<String, List<String>> map, List<Pair<String, List<String>>> list, String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str) || !map.containsKey(str)) {
            return false;
        }
        list.add(new Pair(str, map.get(str)));
        if (!f19988a.d()) {
            map.remove(str);
        }
        return true;
    }

    private static String a(List<Pair<String, List<String>>> list, boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        for (Pair next : list) {
            String str2 = (String) next.first;
            if (z) {
                str2 = a((String) next.first, str);
            }
            List<String> list2 = (List) next.second;
            if (list2 != null && list2.size() > 0) {
                for (String str3 : list2) {
                    if (z) {
                        if (str3 != null) {
                            str3 = a(str3, str);
                        } else {
                            str3 = "";
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                }
            }
        }
        return sb.toString();
    }
}
