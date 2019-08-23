package com.bytedance.frameworks.baselib.network.http.util;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UrlUtils {
    public static boolean isWhitespace(char c2) {
        return c2 == ' ' || c2 == 9 || c2 == 13 || c2 == 10;
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String format(Map<String, List<String>> map, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            String encode = encode((String) next.getKey(), str);
            List<String> list = (List) next.getValue();
            if (list != null && list.size() > 0) {
                for (String str3 : list) {
                    if (str3 != null) {
                        str2 = encode(str3, str);
                    } else {
                        str2 = "";
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(encode);
                    if (!str2.isEmpty()) {
                        sb.append("=");
                        sb.append(str2);
                    }
                }
            }
        }
        return sb.toString();
    }

    @Deprecated
    public static Pair<String, String> parseUrl(String str, Map<String, String> map) throws IOException {
        if (!StringUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
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
                String sb2 = sb.toString();
                String encodedPath = parse.getEncodedPath();
                if (map != null) {
                    String encodedQuery = parse.getEncodedQuery();
                    if (encodedQuery != null) {
                        for (String str2 : encodedQuery.split("&")) {
                            int indexOf = str2.indexOf("=");
                            if (indexOf >= 0) {
                                map.put(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                            } else {
                                map.put(URLDecoder.decode(str2, "UTF-8"), "");
                            }
                        }
                    }
                }
                return new Pair<>(sb2, encodedPath);
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    public static Pair<String, String> parseUrlWithValueList(String str, Map<String, List<String>> map) throws IOException {
        if (!StringUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
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
                String sb2 = sb.toString();
                String encodedPath = parse.getEncodedPath();
                if (map != null) {
                    String encodedQuery = parse.getEncodedQuery();
                    if (encodedQuery != null) {
                        for (String str2 : encodedQuery.split("&")) {
                            int indexOf = str2.indexOf("=");
                            if (indexOf >= 0) {
                                String decode = URLDecoder.decode(str2.substring(0, indexOf), "UTF-8");
                                List list = map.get(decode);
                                if (list == null) {
                                    list = new LinkedList();
                                }
                                list.add(URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                                map.put(decode, list);
                            } else {
                                String decode2 = URLDecoder.decode(str2, "UTF-8");
                                List list2 = map.get(decode2);
                                if (list2 == null) {
                                    list2 = new LinkedList();
                                }
                                list2.add("");
                                map.put(decode2, list2);
                            }
                        }
                    }
                }
                return new Pair<>(sb2, encodedPath);
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }
}
