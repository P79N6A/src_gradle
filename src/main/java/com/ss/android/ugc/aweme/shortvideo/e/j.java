package com.ss.android.ugc.aweme.shortvideo.e;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.camera.g;
import com.ss.android.ugc.aweme.property.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66822a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f66823b = "j";

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66824a;

        public static String a(File file) {
            File file2 = file;
            if (PatchProxy.isSupport(new Object[]{file2}, null, f66824a, true, 75303, new Class[]{File.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{file2}, null, f66824a, true, 75303, new Class[]{File.class}, String.class);
            }
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    byte[] bArr = new byte[8192];
                    int i = 0;
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            i += read;
                            int i2 = i - 524288;
                            if (i2 >= 0) {
                                instance.update(bArr, 0, read - i2);
                                break;
                            }
                            instance.update(bArr, 0, read);
                        } catch (IOException e2) {
                            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                            try {
                                fileInputStream.close();
                            } catch (IOException unused) {
                            }
                            return null;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                            throw th;
                        }
                    }
                    String replace = String.format("%32s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0');
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                    return replace;
                } catch (FileNotFoundException unused4) {
                    return null;
                }
            } catch (NoSuchAlgorithmException unused5) {
                return null;
            }
        }
    }

    private static JSONObject a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f66822a, true, 75301, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], null, f66822a, true, 75301, new Class[0], JSONObject.class);
        }
        if (!com.ss.android.ugc.aweme.g.a.a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (f.a()) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            jSONObject.put("is_hardcode", str);
            jSONObject.put("bite_rate", String.valueOf(f.e()));
            jSONObject.put("video_quality", f.g());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONArray b() {
        if (PatchProxy.isSupport(new Object[0], null, f66822a, true, 75302, new Class[0], JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[0], null, f66822a, true, 75302, new Class[0], JSONArray.class);
        }
        JSONArray jSONArray = new JSONArray();
        if (g.f29526b != null) {
            for (int i = 0; i < g.f29526b.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("height", g.f29526b.get(i).first);
                    jSONObject.put("width", g.f29526b.get(i).second);
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray;
    }

    public static String a(boolean z, boolean z2, Context context, String str, Integer num, Integer num2, Integer num3) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), context, str, num, num2, num3}, null, f66822a, true, 75298, new Class[]{Boolean.TYPE, Boolean.TYPE, Context.class, String.class, Integer.class, Integer.class, Integer.class}, String.class)) {
            return a(z, z2, context, str, num, num2, num3, (List<com.ss.android.ugc.aweme.shortvideo.ui.f>) null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), context, str, num, num2, num3}, null, f66822a, true, 75298, new Class[]{Boolean.TYPE, Boolean.TYPE, Context.class, String.class, Integer.class, Integer.class, Integer.class}, String.class);
    }

    public static String a(boolean z, boolean z2, Context context, String str, Integer num, Integer num2, Integer num3, @Nullable List<com.ss.android.ugc.aweme.shortvideo.ui.f> list) {
        String str2 = str;
        Integer num4 = num;
        Integer num5 = num2;
        Integer num6 = num3;
        List<com.ss.android.ugc.aweme.shortvideo.ui.f> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), context, str2, num4, num5, num6, list2}, null, f66822a, true, 75297, new Class[]{Boolean.TYPE, Boolean.TYPE, Context.class, String.class, Integer.class, Integer.class, Integer.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), context, str2, num4, num5, num6, list2}, null, f66822a, true, 75297, new Class[]{Boolean.TYPE, Boolean.TYPE, Context.class, String.class, Integer.class, Integer.class, Integer.class, List.class}, String.class);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str2);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(num4);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(num5);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(num6);
        ArrayList arrayList5 = null;
        if (list2 != null) {
            arrayList5 = new ArrayList();
            arrayList5.add(list2);
        }
        return a(z, z2, context, (List<String>) arrayList, (List<Integer>) arrayList2, (List<Integer>) arrayList3, (List<Integer>) arrayList4, (List<List<com.ss.android.ugc.aweme.shortvideo.ui.f>>) arrayList5);
    }

    private static String a(boolean z, boolean z2, Context context, List<String> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<List<com.ss.android.ugc.aweme.shortvideo.ui.f>> list5) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), context, list, list2, list3, list4, list5}, null, f66822a, true, 75299, new Class[]{Boolean.TYPE, Boolean.TYPE, Context.class, List.class, List.class, List.class, List.class, List.class}, String.class)) {
            return a(z, z2, context, list, list2, list3, list4, null, list5);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), context, list, list2, list3, list4, list5}, null, f66822a, true, 75299, new Class[]{Boolean.TYPE, Boolean.TYPE, Context.class, List.class, List.class, List.class, List.class, List.class}, String.class);
    }

    public static String a(boolean z, boolean z2, Context context, List<String> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<String> list5, List<List<com.ss.android.ugc.aweme.shortvideo.ui.f>> list6) {
        String str;
        List list7;
        boolean z3 = z;
        List<String> list8 = list;
        List<Integer> list9 = list2;
        List<Integer> list10 = list3;
        List<Integer> list11 = list4;
        List<String> list12 = list5;
        List<List<com.ss.android.ugc.aweme.shortvideo.ui.f>> list13 = list6;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), context, list8, list9, list10, list11, list12, list13}, null, f66822a, true, 75300, new Class[]{Boolean.TYPE, Boolean.TYPE, Context.class, List.class, List.class, List.class, List.class, List.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), context, list8, list9, list10, list11, list12, list13}, null, f66822a, true, 75300, new Class[]{Boolean.TYPE, Boolean.TYPE, Context.class, List.class, List.class, List.class, List.class, List.class, List.class}, String.class);
        }
        JSONArray jSONArray = new JSONArray();
        if (!z3 && (list8 == null || list9 == null || list.size() != list2.size() || list10 == null || list11 == null)) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        for (int i = 0; i < list.size(); i++) {
            String str2 = list8.get(i);
            String str3 = "";
            JSONObject jSONObject = new JSONObject();
            if (str2 != null) {
                File file = new File(str2);
                if (z3 || file.exists()) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    if (!z3) {
                        try {
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            mediaMetadataRetriever.extractMetadata(23);
                        } catch (Exception unused) {
                        }
                    }
                    if (!z3) {
                        str3 = Lists.notEmpty(list5) ? list12.get(i) : a.a(new File(str2));
                    }
                }
                if (!z3) {
                    try {
                        jSONObject.put("creationDate", simpleDateFormat.format(Long.valueOf(file.lastModified())));
                    } catch (Exception unused2) {
                    }
                }
            }
            if (str3 == null) {
                str3 = "";
            }
            if (z3) {
                try {
                    jSONObject.put("creationDate", simpleDateFormat.format(new Date()));
                    JSONObject a2 = a();
                    if (a2 != null) {
                        jSONObject.put("record", a2);
                    }
                } catch (Exception unused3) {
                    boolean z4 = z2;
                }
            }
            jSONObject.put("location", "");
            if (z3) {
                jSONObject.put("make", "Android");
            } else {
                jSONObject.put("make", "");
            }
            jSONObject.put("videoIndex", i + 1);
            jSONObject.put("userSystem", Build.VERSION.RELEASE);
            if (z3) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            jSONObject.put("appRecord", str);
            jSONObject.put("MD5", str3);
            jSONObject.put("videoDevice", "");
            jSONObject.put("system", Build.VERSION.RELEASE);
            jSONObject.put("userDevice", Build.MODEL);
            jSONObject.put("deviceResolution", b());
            if (!z3) {
                if (str2 != null) {
                    str2 = new String(str2.getBytes(), "UTF-8");
                }
                jSONObject.put("importPath", str2);
            } else {
                jSONObject.put("importPath", "");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", list10.get(i));
            jSONObject2.put("height", list11.get(i));
            jSONObject.put("videoResolution", jSONObject2);
            jSONObject.put("videoDuration", list9.get(i));
            jSONObject.put("isRecord", z3 ? 1 : 0);
            try {
                jSONObject.put("isCropped", z2 ? 1 : 0);
                if (list13 == null) {
                    list7 = null;
                } else {
                    list7 = list13.get(i);
                }
                if (list7 != null && !list7.isEmpty()) {
                    jSONObject.put("reaction_info", new JSONArray(com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) list7)));
                }
                jSONArray.put(jSONObject);
            } catch (Exception unused4) {
            }
        }
        return jSONArray.toString();
    }
}
