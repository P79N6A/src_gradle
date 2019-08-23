package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52659a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f52660b = {"http://p1-dy.bytecdn.cn", "http://p3-dy.bytecdn.cn", "http://p9-dy.bytecdn.cn"};

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52661a = null;

        /* renamed from: e  reason: collision with root package name */
        public static String f52662e = "";

        /* renamed from: f  reason: collision with root package name */
        public static String f52663f = "large";
        public static String g = "medium";
        public static String h = "thumb";

        /* renamed from: b  reason: collision with root package name */
        public List<String> f52664b;

        /* renamed from: c  reason: collision with root package name */
        String f52665c;

        /* renamed from: d  reason: collision with root package name */
        String f52666d;
        private String i;

        public String a() {
            if (PatchProxy.isSupport(new Object[0], this, f52661a, false, 53505, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f52661a, false, 53505, new Class[0], String.class);
            }
            return String.format("/img/%s~tplv-x-get:%s.image%s%s", new Object[]{this.f52665c, this.i, "%%secretKey=", this.f52666d});
        }

        private a(List<String> list, String str, String str2) {
            this.i = f52662e;
            this.f52664b = list;
            this.f52665c = str;
            this.f52666d = str2;
        }

        public /* synthetic */ a(List list, String str, String str2, byte b2) {
            this(list, str, str2);
        }
    }
}
