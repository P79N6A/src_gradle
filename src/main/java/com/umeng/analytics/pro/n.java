package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.List;

public class n {

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final n f80680a = new n();

        private a() {
        }
    }

    public int b() {
        return 8;
    }

    public int c() {
        return SearchJediMixFeedAdapter.f42517f;
    }

    public int d() {
        return 512;
    }

    private n() {
    }

    public static n a() {
        return a.f80680a;
    }

    public boolean b(String str) {
        if (!TextUtils.isEmpty(str) && str.length() < 16 && a(str, 48)) {
            return true;
        }
        return false;
    }

    public boolean a(String str) {
        if ("".equals(str)) {
            return true;
        }
        if (str != null && str.getBytes().length < 160 && a(str, 48)) {
            return true;
        }
        return false;
    }

    public boolean b(List<String> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        int i = 0;
        for (String bytes : list) {
            i += bytes.getBytes().length;
        }
        if (i < 256) {
            return true;
        }
        return false;
    }

    public boolean a(List<String> list) {
        if (list == null) {
            return false;
        }
        if (list.size() > 1) {
            for (int i = 1; i < list.size(); i++) {
                if (TextUtils.isEmpty(list.get(i)) || !a(list.get(i), 48)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a(String str, int i) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) < i) {
                return false;
            }
        }
        return true;
    }
}
