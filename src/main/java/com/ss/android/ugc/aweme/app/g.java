package com.ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.e.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34185a;

    private String c(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, f34185a, false, 22247, new Class[]{Uri.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{uri}, this, f34185a, false, 22247, new Class[]{Uri.class}, String.class);
        } else if (uri == null) {
            return "";
        } else {
            String path = uri.getPath();
            if (!b(uri) || StringUtils.isEmpty(path) || !path.startsWith("/detail/")) {
                return "";
            }
            return uri.getLastPathSegment();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(Uri uri) {
        String str;
        Uri uri2 = uri;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, f34185a, false, 22248, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34185a, false, 22248, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        } else if (uri2 == null || !"aweme".equals(uri.getHost())) {
            return false;
        } else {
            try {
                str = uri2.getQueryParameter("gd_label");
            } catch (Throwable unused) {
                str = "";
            }
            if (!"click_push_recommend".equals(str) && !"click_push_newvideo".equals(str) && !"click_push_videoat".equals(str)) {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    public List<String> a(Uri uri) {
        String str;
        Uri uri2 = uri;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, f34185a, false, 22246, new Class[]{Uri.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34185a, false, 22246, new Class[]{Uri.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (uri2 == null) {
            return arrayList;
        }
        String path = uri.getPath();
        if (b(uri)) {
            if (!StringUtils.isEmpty(path) && path.startsWith("/detail/")) {
                arrayList.add(uri.getLastPathSegment());
            } else if (!StringUtils.isEmpty(path) && path.startsWith("/detail_list")) {
                String str2 = "";
                try {
                    str2 = uri2.getQueryParameter("gids");
                } catch (Throwable unused) {
                }
                if (!StringUtils.isEmpty(str2)) {
                    String[] split = str2.split(",");
                    int length = split.length;
                    while (i < length) {
                        arrayList.add(split[i]);
                        i++;
                    }
                } else {
                    try {
                        str = uri2.getQueryParameter("push_params");
                    } catch (Throwable unused2) {
                        str = "";
                    }
                    if (!StringUtils.isEmpty(str)) {
                        try {
                            String optString = new JSONObject(str).optString("gids");
                            if (!StringUtils.isEmpty(optString)) {
                                String[] split2 = optString.split(",");
                                int length2 = split2.length;
                                while (i < length2) {
                                    arrayList.add(split2[i]);
                                    i++;
                                }
                            }
                        } catch (Exception | JSONException unused3) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void a(Uri uri, boolean z) {
        if (PatchProxy.isSupport(new Object[]{uri, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34185a, false, 22244, new Class[]{Uri.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri, Byte.valueOf(z)}, this, f34185a, false, 22244, new Class[]{Uri.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (AwemeAppData.p().an) {
                if (z) {
                    a.a().a(c(uri));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
