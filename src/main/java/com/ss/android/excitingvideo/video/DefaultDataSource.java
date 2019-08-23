package com.ss.android.excitingvideo.video;

import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.excitingvideo.utils.DigestUtils;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.ttvideoengine.DataSource;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class DefaultDataSource implements DataSource {
    private String mVideoId;

    public DefaultDataSource(String str) {
        this.mVideoId = str;
    }

    public String apiForFetcher(Map map) {
        return getUrlWithVideoId(0, this.mVideoId, map);
    }

    private static String getBytedangceOpenApiUrl(String str) {
        return "http://ib.snssdk.com/video/openapi/v1/" + "?action=GetPlayInfo_VIP&video_id=" + str;
    }

    private static String getBytedangcePlayUrl(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("version", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        hashMap.put(AllStoryActivity.f73306b, "toutiao");
        hashMap.put("video", str);
        hashMap.put("vtype", "mp4");
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        hashMap.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, valueOf);
        TreeSet<String> treeSet = new TreeSet<>(hashMap.keySet());
        StringBuilder sb = new StringBuilder();
        for (String str2 : treeSet) {
            sb.append(str2);
            sb.append((String) hashMap.get(str2));
        }
        sb.append("17601e2231500d8c3389dd5d6afd08de");
        String md5Hex = DigestUtils.md5Hex(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        arrayList.add("toutiao");
        arrayList.add(valueOf);
        arrayList.add(md5Hex);
        arrayList.add("mp4");
        arrayList.add(str);
        sb.delete(0, sb.length());
        sb.append("http://ib.snssdk.com/video/play/");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append("/");
        }
        return sb.substring(0, sb.length() - 1);
    }

    private String getUrlWithVideoId(int i, String str, Map<String, String> map) {
        String str2 = "";
        if (i == 0) {
            str2 = getBytedangcePlayUrl(str);
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2 + "?" + "play_type" + "=1";
            }
        } else if (i == 2) {
            str2 = getBytedangceOpenApiUrl(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
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
        return sb.toString();
    }
}
