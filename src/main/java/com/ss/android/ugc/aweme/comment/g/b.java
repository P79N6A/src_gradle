package com.ss.android.ugc.aweme.comment.g;

import com.bytedance.ies.dmt.ui.input.emoji.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36454a;

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f36455b = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f36456c = Pattern.compile("<no_trans>(.+?)</no_trans>");

    public static String a(String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f36454a, true, 27771, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f36454a, true, 27771, new Class[]{String.class}, String.class);
        }
        Matcher matcher = f36455b.matcher(str2);
        StringBuilder sb = new StringBuilder(str2);
        while (matcher.find()) {
            int start = matcher.start() + i;
            int end = matcher.end() + i;
            if (f.a(GlobalContext.getContext()).b(matcher.group()) > 0) {
                sb.insert(start, "<no_trans>");
                sb.insert(end + 10, "</no_trans>");
                i += 21;
            }
        }
        return sb.toString();
    }

    public static String b(String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f36454a, true, 27772, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f36454a, true, 27772, new Class[]{String.class}, String.class);
        }
        Matcher matcher = f36456c.matcher(str2);
        StringBuilder sb = new StringBuilder(str2);
        while (matcher.find()) {
            sb.replace(matcher.start() - i, matcher.end() - i, matcher.group(1));
            i += 21;
        }
        return sb.toString();
    }
}
