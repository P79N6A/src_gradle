package com.ss.android.ugc.aweme.im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent;
import com.ss.android.ugc.aweme.im.sdk.utils.c;
import com.ss.android.ugc.aweme.im.sdk.utils.h;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.x;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50302a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f50303b = {"http://", "https://", "rtsp://"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f50304c = {"mailto:"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f50305d = {"top", "com.cn", "com", "net", "org", "edu", "gov", "int", "mil", AdvanceSetting.CLEAR_NOTIFICATION, "tel", "biz", "cc", "tv", "info", "name", "hk", "mobi", "asia", "cd", "travel", "pro", "museum", "coop", "aero", "ad", "ae", "af", "ag", "ai", "al", "am", "an", "ao", "aq", "ar", AdvanceSetting.ADVANCE_SETTING, "at", ActVideoSetting.ACT_URL, "aw", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", NotificationStyle.BANNER_IMAGE_URL, "bj", "bm", "bn", "bo", "br", NotificationStyle.BASE_STYLE, "bt", "bv", "bw", "by", "bz", "ca", "cc", "cf", "cg", "ch", "ci", "ck", "cl", "cm", AdvanceSetting.CLEAR_NOTIFICATION, "co", "cq", "cr", "cu", "cv", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh", "es", "et", "ev", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gh", "gi", "gl", "gm", "gn", "gp", "gr", "gt", "gu", "gw", "gy", "hk", "hm", AdvanceSetting.HEAD_UP_NOTIFICATION, "hr", "ht", "hu", "id", "ie", "il", "in", "io", "iq", "ir", "is", AdvanceSetting.NETWORK_TYPE, "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", AppIconSetting.LARGE_ICON_URL, "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "mg", "mh", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nt", "nu", "nz", "om", "qa", "pa", "pe", "pf", "pg", "ph", PushConstants.URI_PACKAGE_NAME, "pl", "pm", "pn", "pr", "pt", "pw", "py", "re", "ro", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", TimeDisplaySetting.START_SHOW_TIME, "su", "sy", "sz", "tc", TimeDisplaySetting.TIME_DISPLAY, "tf", "tg", "th", "tj", "tk", "tm", "tn", "to", "tp", "tr", PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, "tv", "tw", "ty", "tz", "ua", "ug", "uk", "us", "uy", "va", "vc", "ve", "vg", "vn", "vu", "wf", "ws", "xyz", "ye", "yu", "za", "zm", "zr", "zw"};

    /* renamed from: e  reason: collision with root package name */
    private static Pattern f50306e;

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f50307f = Pattern.compile("(1\\d{10})|(0\\d{9,10})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{8})|(0\\d{2}-\\d{7})|(0\\d{3}-\\d{7})|(\\d{5})|(1\\d{2}-\\d{4}-\\d{4})|(1\\d{2}-\\d{3}-\\d{5})");

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50308a;

        /* renamed from: b  reason: collision with root package name */
        EPlatformCardContent.LinkItem f50309b;

        /* renamed from: c  reason: collision with root package name */
        String f50310c;

        /* renamed from: d  reason: collision with root package name */
        private int f50311d;

        /* renamed from: e  reason: collision with root package name */
        private Context f50312e;

        /* renamed from: f  reason: collision with root package name */
        private long f50313f;
        private boolean g;

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f50308a, false, 50316, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f50308a, false, 50316, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setColor(this.f50311d);
        }

        public final void onClick(@NonNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f50308a, false, 50315, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f50308a, false, 50315, new Class[]{View.class}, Void.TYPE);
                return;
            }
            switch (this.f50309b.actionType) {
                case 1:
                    new com.ss.android.ugc.aweme.im.sdk.a.b(this.f50312e, new f(this)).sendMsg();
                    z.d(this.f50310c, String.valueOf(this.f50313f), "question_list");
                    return;
                case 2:
                    Uri parse = Uri.parse(this.f50309b.value);
                    String queryParameter = parse.getQueryParameter("target");
                    if (queryParameter == null || !queryParameter.endsWith(".pdf") || m.a()) {
                        if (!this.g) {
                            parse = parse.buildUpon().appendQueryParameter("hide_more", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).build();
                        }
                        com.ss.android.ugc.aweme.im.sdk.d.a.a().e().openUrl(this.f50312e, parse, false);
                        z.d(this.f50310c, String.valueOf(this.f50313f), "text");
                        return;
                    }
                    com.ss.android.ugc.aweme.im.sdk.d.a.a().e().downloadPdf(this.f50312e, queryParameter, "application/pdf");
                    return;
                case 3:
                    com.ss.android.ugc.aweme.im.sdk.d.a.a().e().makePhoneCall((Activity) this.f50312e, this.f50309b.phoneNumber, this.f50309b.phoneInstanceId, this.f50309b.phoneEncryptKey, "");
                    z.d(this.f50310c, String.valueOf(this.f50313f), "phone");
                    break;
            }
        }

        public a(@NonNull Context context, String str, long j, EPlatformCardContent.LinkItem linkItem, int i, boolean z) {
            this.f50309b = linkItem;
            this.f50311d = i;
            this.f50312e = context;
            this.f50310c = str;
            this.f50313f = j;
            this.g = z;
        }
    }

    static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50314a;

        /* renamed from: b  reason: collision with root package name */
        public String f50315b;

        /* renamed from: c  reason: collision with root package name */
        public String f50316c;
        @ColorInt

        /* renamed from: d  reason: collision with root package name */
        private int f50317d;

        /* renamed from: e  reason: collision with root package name */
        private int f50318e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f50319f;
        private String g;
        private long h;

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f50314a, false, 50319, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f50314a, false, 50319, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setColor(this.f50317d);
        }

        public final void onClick(View view) {
            final View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f50314a, false, 50318, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f50314a, false, 50318, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (this.f50319f) {
                z.d(this.g, String.valueOf(this.h), "link");
            } else {
                z a2 = z.a();
                String str = this.f50316c;
                if (PatchProxy.isSupport(new Object[]{str}, a2, z.f52670a, false, 53554, new Class[]{String.class}, Void.TYPE)) {
                    z zVar = a2;
                    PatchProxy.accessDispatch(new Object[]{str}, zVar, z.f52670a, false, 53554, new Class[]{String.class}, Void.TYPE);
                } else {
                    r.onEvent(MobClick.obtain().setEventName("click_link").setLabelName("chat").setValue(str));
                }
            }
            int i = this.f50318e;
            if (i != 4) {
                switch (i) {
                    case 1:
                        String a3 = e.a(this.f50315b, e.f50303b);
                        String str2 = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52880c;
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                j a4 = j.a(str2).a("target", a3).a("aid", AppLog.getAppId()).a("lang", com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getAppLanguage());
                                String b2 = c.b(view.getContext());
                                if (!TextUtils.isEmpty(b2)) {
                                    a4.a("version", b2);
                                }
                                a3 = a4.a();
                            } catch (Exception unused) {
                                com.ss.android.ugc.aweme.framework.a.a.a("urlSafeTemplate encode failed");
                            }
                        }
                        com.ss.android.ugc.aweme.im.sdk.d.a.a().e().openUrl(view.getContext(), Uri.parse(a3), true);
                        return;
                    case 2:
                        String a5 = e.a(this.f50315b, e.f50304c);
                        Context context = view.getContext();
                        if (!PatchProxy.isSupport(new Object[]{context, a5}, null, x.f52668a, true, 53539, new Class[]{Context.class, String.class}, Void.TYPE)) {
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse(a5));
                            x.a(context, intent);
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[]{context, a5}, null, x.f52668a, true, 53539, new Class[]{Context.class, String.class}, Void.TYPE);
                            return;
                        }
                }
                return;
            }
            h.a(view.getContext(), C0906R.string.aqs, C0906R.string.apk, C0906R.string.a0v, new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50320a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f50320a, false, 50320, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50320a, false, 50320, new Class[0], Void.TYPE);
                        return;
                    }
                    x.a(view2.getContext(), b.this.f50315b);
                }
            });
        }

        b(String str, @ColorInt int i, int i2, boolean z, String str2, long j) {
            this.f50315b = str;
            this.f50317d = i;
            this.f50318e = i2;
            this.f50319f = z;
            this.g = str2;
            this.h = j;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (String append : f50305d) {
            sb.append(append);
            sb.append("|");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        f50306e = Pattern.compile("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|((www\\.|[a-zA-Z0-9\\.\\-]+\\.)?[a-zA-Z0-9\\-]+\\." + sb.toString() + "(:[0-9]{1,5})?))((/[a-zA-Z0-9\\./,;\\?'\\+&%\\$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z\\./,;\\?'\\+&%\\$#=~_\\-]*))");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(@android.support.annotation.NonNull java.lang.String r17, @android.support.annotation.NonNull java.lang.String[] r18) {
        /*
            r6 = r17
            r7 = r18
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r15 = 0
            r8[r15] = r6
            r16 = 1
            r8[r16] = r7
            com.meituan.robust.ChangeQuickRedirect r10 = f50302a
            java.lang.Class[] r13 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r13[r15] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r13[r16] = r1
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r9 = 0
            r11 = 1
            r12 = 50314(0xc48a, float:7.0505E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r1 == 0) goto L_0x0047
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r15] = r6
            r2[r16] = r7
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f50302a
            r5 = 1
            r6 = 50314(0xc48a, float:7.0505E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r7[r15] = r0
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r7[r16] = r0
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0047:
            r8 = 0
        L_0x0048:
            int r0 = r7.length
            if (r8 >= r0) goto L_0x0091
            r1 = 1
            r2 = 0
            r3 = r7[r8]
            r4 = 0
            r0 = r7[r8]
            int r5 = r0.length()
            r0 = r17
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x008e
            r1 = 0
            r2 = 0
            r3 = r7[r8]
            r4 = 0
            r0 = r7[r8]
            int r5 = r0.length()
            r0 = r17
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0093
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r7[r8]
            r0.append(r1)
            r1 = r7[r8]
            int r1 = r1.length()
            java.lang.String r1 = r6.substring(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
            goto L_0x0093
        L_0x008e:
            int r8 = r8 + 1
            goto L_0x0048
        L_0x0091:
            r16 = 0
        L_0x0093:
            if (r16 != 0) goto L_0x00a9
            int r0 = r7.length
            if (r0 <= 0) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r7[r15]
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L_0x00a9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.e.a(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static void a(TextView textView, String str, String str2, boolean z, long j) {
        TextView textView2 = textView;
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{textView2, str3, str2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, null, f50302a, true, 50310, new Class[]{TextView.class, String.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {textView2, str3, str2, Byte.valueOf(z), new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f50302a, true, 50310, new Class[]{TextView.class, String.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            textView2.setText("");
        } else {
            SpannableString spannableString = new SpannableString(str3);
            TextView textView3 = textView;
            String str4 = str;
            SpannableString spannableString2 = spannableString;
            String str5 = str2;
            boolean z2 = z;
            long j3 = j;
            c(textView3, str4, spannableString2, str5, z2, j3);
            b(textView3, str4, spannableString2, str5, z2, j3);
            a(textView3, str4, spannableString2, str5, z2, j3);
            textView2.setText(spannableString);
        }
    }

    private static void b(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j) {
        String str3 = str;
        SpannableString spannableString2 = spannableString;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{textView, str3, spannableString2, str4, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, null, f50302a, true, 50312, new Class[]{TextView.class, String.class, SpannableString.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView, str3, spannableString2, str4, Byte.valueOf(z), new Long(j2)}, null, f50302a, true, 50312, new Class[]{TextView.class, String.class, SpannableString.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        Matcher matcher = f50306e.matcher(str3);
        Linkify.MatchFilter matchFilter = Linkify.sUrlMatchFilter;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            if (matchFilter.acceptMatch(str3, start, end)) {
                b bVar = r3;
                b bVar2 = new b(group, textView.getResources().getColor(C0906R.color.qb), 1, z, str2, j);
                b bVar3 = bVar;
                bVar3.f50316c = str4;
                g.a(spannableString2, bVar3, start, end, 33);
            }
            str3 = str;
        }
    }

    private static void c(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j) {
        String str3 = str;
        SpannableString spannableString2 = spannableString;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{textView, str3, spannableString2, str4, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, null, f50302a, true, 50313, new Class[]{TextView.class, String.class, SpannableString.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView, str3, spannableString2, str4, Byte.valueOf(z), new Long(j2)}, null, f50302a, true, 50313, new Class[]{TextView.class, String.class, SpannableString.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        Matcher matcher = f50307f.matcher(str3);
        Linkify.MatchFilter matchFilter = Linkify.sPhoneNumberMatchFilter;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            if (matchFilter.acceptMatch(str3, start, end)) {
                b bVar = r3;
                b bVar2 = new b(group, textView.getResources().getColor(C0906R.color.qb), 4, z, str2, j);
                b bVar3 = bVar;
                bVar3.f50316c = str4;
                g.a(spannableString2, bVar3, start, end, 33);
            }
            str3 = str;
        }
    }

    private static void a(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j) {
        String str3 = str;
        SpannableString spannableString2 = spannableString;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{textView, str3, spannableString2, str4, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, null, f50302a, true, 50311, new Class[]{TextView.class, String.class, SpannableString.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView, str3, spannableString2, str4, Byte.valueOf(z), new Long(j2)}, null, f50302a, true, 50311, new Class[]{TextView.class, String.class, SpannableString.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        Matcher matcher = Patterns.EMAIL_ADDRESS.matcher(str3);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            b bVar = r3;
            b bVar2 = new b(matcher.group(), textView.getResources().getColor(C0906R.color.qb), 2, z, str2, j);
            bVar.f50316c = str4;
            g.a(spannableString2, bVar, start, end, 33);
        }
    }
}
