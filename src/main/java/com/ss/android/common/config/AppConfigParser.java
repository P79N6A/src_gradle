package com.ss.android.common.config;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.http.a.d.c;
import com.ss.android.linkselector.b.b;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppConfigParser {
    public static ChangeQuickRedirect changeQuickRedirect;

    public class _lancet {
        public static ChangeQuickRedirect changeQuickRedirect;

        private _lancet() {
        }

        @Insert
        @TargetClass
        static boolean com_ss_android_ugc_aweme_lancet_CookieLancet_parseCookieShareDomain(List list, JSONArray jSONArray) throws JSONException {
            if (!PatchProxy.isSupport(new Object[]{list, jSONArray}, null, changeQuickRedirect, true, 15755, new Class[]{List.class, JSONArray.class}, Boolean.TYPE)) {
                return AppConfigParser.parseCookieShareDomain$___twin___(list, jSONArray);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, jSONArray}, null, changeQuickRedirect, true, 15755, new Class[]{List.class, JSONArray.class}, Boolean.TYPE)).booleanValue();
        }
    }

    public static boolean parseCookieShareDomain(List list, JSONArray jSONArray) throws JSONException {
        if (!PatchProxy.isSupport(new Object[]{list, jSONArray}, null, changeQuickRedirect, true, 15750, new Class[]{List.class, JSONArray.class}, Boolean.TYPE)) {
            return _lancet.com_ss_android_ugc_aweme_lancet_CookieLancet_parseCookieShareDomain(list, jSONArray);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, jSONArray}, null, changeQuickRedirect, true, 15750, new Class[]{List.class, JSONArray.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean parseCookieShareDomain$___twin___(List<String> list, JSONArray jSONArray) throws JSONException {
        List<String> list2 = list;
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{list2, jSONArray2}, null, changeQuickRedirect, true, 15751, new Class[]{List.class, JSONArray.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2, jSONArray2}, null, changeQuickRedirect, true, 15751, new Class[]{List.class, JSONArray.class}, Boolean.TYPE)).booleanValue();
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            list2.add(jSONArray2.getString(i));
        }
        return true;
    }

    public static void parseDnsMap(HashMap<String, InetAddress[]> hashMap, JSONArray jSONArray) {
        HashMap<String, InetAddress[]> hashMap2 = hashMap;
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{hashMap2, jSONArray2}, null, changeQuickRedirect, true, 15754, new Class[]{HashMap.class, JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap2, jSONArray2}, null, changeQuickRedirect, true, 15754, new Class[]{HashMap.class, JSONArray.class}, Void.TYPE);
        } else if (hashMap2 != null && jSONArray2 != null) {
            try {
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < length; i++) {
                    try {
                        arrayList.clear();
                        JSONObject jSONObject = jSONArray2.getJSONObject(i);
                        String string = jSONObject.getString("host");
                        if (!TextUtils.isEmpty(string)) {
                            JSONArray jSONArray3 = jSONObject.getJSONArray("ip");
                            int min = Math.min(jSONArray3.length(), 3);
                            for (int i2 = 0; i2 < min; i2++) {
                                String string2 = jSONArray3.getString(i2);
                                if (c.f29148a.matcher(string2).matches()) {
                                    InetAddress byName = InetAddress.getByName(string2);
                                    if (byName != null) {
                                        arrayList.add(byName);
                                    }
                                }
                            }
                            if (arrayList.size() > 0) {
                                InetAddress[] inetAddressArr = new InetAddress[arrayList.size()];
                                arrayList.toArray(inetAddressArr);
                                hashMap2.put(string, inetAddressArr);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static boolean parsePathHostMap(HashMap<Pattern, String> hashMap, JSONArray jSONArray, HashMap<Pattern, String> hashMap2) throws JSONException {
        HashMap<Pattern, String> hashMap3 = hashMap;
        JSONArray jSONArray2 = jSONArray;
        HashMap<Pattern, String> hashMap4 = hashMap2;
        if (PatchProxy.isSupport(new Object[]{hashMap3, jSONArray2, hashMap4}, null, changeQuickRedirect, true, 15753, new Class[]{HashMap.class, JSONArray.class, HashMap.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hashMap3, jSONArray2, hashMap4}, null, changeQuickRedirect, true, 15753, new Class[]{HashMap.class, JSONArray.class, HashMap.class}, Boolean.TYPE)).booleanValue();
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray2.getJSONObject(i);
            String string = jSONObject.getString("path");
            String string2 = jSONObject.getString("host_group");
            Pattern compile = Pattern.compile(string);
            hashMap3.put(compile, string2);
            hashMap4.put(compile, string2);
        }
        return true;
    }

    public static boolean parseHostMap(HashMap<String, List<ConnectHost>> hashMap, JSONArray jSONArray, HashMap<String, List<b>> hashMap2) throws JSONException {
        int i;
        int i2;
        HashMap<String, List<ConnectHost>> hashMap3 = hashMap;
        JSONArray jSONArray2 = jSONArray;
        HashMap<String, List<b>> hashMap4 = hashMap2;
        if (PatchProxy.isSupport(new Object[]{hashMap3, jSONArray2, hashMap4}, null, changeQuickRedirect, true, 15752, new Class[]{HashMap.class, JSONArray.class, HashMap.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hashMap3, jSONArray2, hashMap4}, null, changeQuickRedirect, true, 15752, new Class[]{HashMap.class, JSONArray.class, HashMap.class}, Boolean.TYPE)).booleanValue();
        }
        int length = jSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            JSONObject jSONObject = jSONArray2.getJSONObject(i3);
            String string = jSONObject.getString("name");
            JSONArray jSONArray3 = jSONObject.getJSONArray("hosts");
            int length2 = jSONArray3.length();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (i4 < length2) {
                JSONObject jSONObject2 = jSONArray3.getJSONObject(i4);
                String optString = jSONObject2.optString("host");
                String optString2 = jSONObject2.optString("schema");
                int optInt = jSONObject2.optInt("weight");
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                    i2 = length;
                    i = i3;
                } else {
                    ConnectHost connectHost = new ConnectHost();
                    connectHost.setHost(optString);
                    connectHost.setSchema(optString2);
                    connectHost.setWeight(optInt);
                    i2 = length;
                    i = i3;
                    b bVar = new b(optString, optString2, (long) optInt);
                    arrayList.add(connectHost);
                    arrayList2.add(bVar);
                }
                i4++;
                length = i2;
                i3 = i;
            }
            int i5 = length;
            hashMap3.put(string, arrayList);
            hashMap4.put(string, arrayList2);
            i3++;
        }
        return true;
    }
}
