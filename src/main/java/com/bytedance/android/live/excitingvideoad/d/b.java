package com.bytedance.android.live.excitingvideoad.d;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.excitingvideoad.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.ttvideoengine.DataSource;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public final class b implements DataSource {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8398a;

    /* renamed from: b  reason: collision with root package name */
    private String f8399b;

    public b(String str) {
        this.f8399b = str;
    }

    public final String apiForFetcher(Map map) {
        if (!PatchProxy.isSupport(new Object[]{map}, this, f8398a, false, 1660, new Class[]{Map.class}, String.class)) {
            return a(0, this.f8399b, map);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{map}, this, f8398a, false, 1660, new Class[]{Map.class}, String.class);
    }

    private static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f8398a, true, 1662, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f8398a, true, 1662, new Class[]{String.class}, String.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("version", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        hashMap.put(AllStoryActivity.f73306b, "toutiao");
        hashMap.put("video", str2);
        hashMap.put("vtype", "mp4");
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        hashMap.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, valueOf);
        TreeSet<String> treeSet = new TreeSet<>(hashMap.keySet());
        StringBuilder sb = new StringBuilder();
        for (String str3 : treeSet) {
            sb.append(str3);
            sb.append((String) hashMap.get(str3));
        }
        sb.append("17601e2231500d8c3389dd5d6afd08de");
        String a2 = a.a(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        arrayList.add("toutiao");
        arrayList.add(valueOf);
        arrayList.add(a2);
        arrayList.add("mp4");
        arrayList.add(str2);
        sb.delete(0, sb.length());
        sb.append("http://ib.snssdk.com/video/play/");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append("/");
        }
        return sb.substring(0, sb.length() - 1);
    }

    private String a(int i, String str, Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{0, str, map}, this, f8398a, false, 1661, new Class[]{Integer.TYPE, String.class, Map.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{0, str, map}, this, f8398a, false, 1661, new Class[]{Integer.TYPE, String.class, Map.class}, String.class);
        }
        String a2 = a(str);
        if (!TextUtils.isEmpty(a2)) {
            a2 = a2 + "?" + "play_type" + "=1";
        }
        if (!TextUtils.isEmpty(a2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    try {
                        sb.append(String.format("&%s=%s", new Object[]{next.getKey(), URLEncoder.encode((String) next.getValue(), "UTF-8")}));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
            }
            try {
                sb.append(String.format("&device_type=%s", new Object[]{URLEncoder.encode(Build.MODEL, "UTF-8")}));
            } catch (UnsupportedEncodingException unused2) {
            }
            a2 = sb.toString();
        }
        return a2;
    }
}
