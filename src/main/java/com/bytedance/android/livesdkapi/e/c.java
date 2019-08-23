package com.bytedance.android.livesdkapi.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18752a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f18753b;

    /* renamed from: c  reason: collision with root package name */
    public static final List<Pattern> f18754c;

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f18755d;

    /* renamed from: e  reason: collision with root package name */
    public static final List<Pattern> f18756e;

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f18757f;
    public static final List<Pattern> g;
    public static final List<String> h;
    public static final List<Pattern> i;
    public static final List<String> j;
    public static final List<Pattern> k;

    static {
        List<String> list;
        List<Pattern> list2;
        List<String> list3;
        List<Pattern> list4;
        List<String> list5;
        List<Pattern> list6;
        List<String> list7;
        List<Pattern> list8;
        List<String> list9;
        List<Pattern> list10;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14914, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14914, new Class[0], List.class);
        } else {
            list = new ArrayList<>();
            list.add("webcast_douyin");
        }
        f18753b = list;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14915, new Class[0], List.class)) {
            list2 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14915, new Class[0], List.class);
        } else {
            list2 = new ArrayList<>();
            list2.add(Pattern.compile(".snssdk.com/falcon/"));
            list2.add(Pattern.compile("s3.bytecdn.cn/aweme/resource/falcon/"));
            list2.add(Pattern.compile("s3a.bytecdn.cn/aweme/resource/falcon/"));
            list2.add(Pattern.compile(".amemv.com/falcon/"));
            list2.add(Pattern.compile(".bytedance.net/falcon/"));
        }
        f18754c = list2;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14916, new Class[0], List.class)) {
            list3 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14916, new Class[0], List.class);
        } else {
            list3 = new ArrayList<>();
            list3.add("webcast_pipixia");
        }
        f18755d = list3;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14917, new Class[0], List.class)) {
            list4 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14917, new Class[0], List.class);
        } else {
            list4 = new ArrayList<>();
            list4.add(Pattern.compile("api.ribaoapi.com/falcon/"));
            list4.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
            list4.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
            list4.add(Pattern.compile("\\*.snssdk.com/falcon/"));
            list4.add(Pattern.compile(".bytedance.net/falcon/"));
        }
        f18756e = list4;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14918, new Class[0], List.class)) {
            list5 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14918, new Class[0], List.class);
        } else {
            list5 = new ArrayList<>();
            list5.add("webcast_huoshan");
        }
        f18757f = list5;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14919, new Class[0], List.class)) {
            list6 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14919, new Class[0], List.class);
        } else {
            list6 = new ArrayList<>();
            list6.add(Pattern.compile(".snssdk.com/falcon/"));
            list6.add(Pattern.compile("s3.bytecdn.cn/aweme/resource/falcon/"));
            list6.add(Pattern.compile("s3a.bytecdn.cn/aweme/resource/falcon/"));
            list6.add(Pattern.compile(".amemv.com/falcon/"));
            list6.add(Pattern.compile(".bytedance.net/falcon/"));
            list6.add(Pattern.compile(".huoshan.com/falcon/"));
        }
        g = list6;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14920, new Class[0], List.class)) {
            list7 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14920, new Class[0], List.class);
        } else {
            list7 = new ArrayList<>();
            list7.add("webcast_xigua");
        }
        h = list7;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14921, new Class[0], List.class)) {
            list8 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14921, new Class[0], List.class);
        } else {
            list8 = new ArrayList<>();
            list8.add(Pattern.compile(".snssdk.com/falcon/"));
            list8.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
            list8.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
            list8.add(Pattern.compile(".bytedance.net/falcon/"));
            list8.add(Pattern.compile(".ixigua.com/falcon/"));
        }
        i = list8;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14922, new Class[0], List.class)) {
            list9 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14922, new Class[0], List.class);
        } else {
            list9 = new ArrayList<>();
            list9.add("webcast_vigo");
        }
        j = list9;
        if (PatchProxy.isSupport(new Object[0], null, f18752a, true, 14923, new Class[0], List.class)) {
            list10 = (List) PatchProxy.accessDispatch(new Object[0], null, f18752a, true, 14923, new Class[0], List.class);
        } else {
            list10 = new ArrayList<>();
            list10.add(Pattern.compile(".hypstar.com/falcon/"));
            list10.add(Pattern.compile(".akamaized.net/ies/resource/falcon/"));
            list10.add(Pattern.compile(".hypstarcdn.com/ies/resource/falcon/"));
        }
        k = list10;
    }
}
