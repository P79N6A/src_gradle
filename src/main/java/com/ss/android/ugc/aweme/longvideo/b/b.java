package com.ss.android.ugc.aweme.longvideo.b;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.b.f;
import com.ss.android.ugc.aweme.longvideo.e;
import com.ss.android.ugc.aweme.longvideo.j;
import com.ss.android.ugc.aweme.services.publish.PulishTitle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/utils/LongVideoUtils;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53879a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f53880b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J0\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J8\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u001a\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/utils/LongVideoUtils$Companion;", "", "()V", "addLongVideoLabelSpan", "Landroid/text/SpannableString;", "mContext", "Landroid/content/Context;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mEventType", "", "mPageType", "", "spannableString", "addLongVideoLabelSpanBuilder", "Landroid/text/SpannableStringBuilder;", "spannableStringBuilder", "buildLongVideoLabelSpan", "awemeDesc", "mNoTruncation", "", "getAid", "aweme", "getLongVideo", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "getLongVideoDuration", "getLongVideoId", "isLongVideo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53881a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/longvideo/utils/LongVideoUtils$Companion$addLongVideoLabelSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.b$a$a  reason: collision with other inner class name */
        public static final class C0622a extends ClickableSpan {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53882a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f53883b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Aweme f53884c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f53885d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f53886e;

            public final void onClick(@NotNull View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f53882a, false, 56760, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f53882a, false, 56760, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view, "widget");
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    e.a(this.f53883b, this.f53884c, this.f53885d, this.f53886e);
                    if (this.f53884c.isAd()) {
                        g.ac(GlobalContext.getContext(), this.f53884c);
                    }
                }
            }

            C0622a(Context context, Aweme aweme, String str, int i) {
                this.f53883b = context;
                this.f53884c = aweme;
                this.f53885d = str;
                this.f53886e = i;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/longvideo/utils/LongVideoUtils$Companion$addLongVideoLabelSpanBuilder$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.b$a$b  reason: collision with other inner class name */
        public static final class C0623b extends ClickableSpan {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53887a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f53888b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Aweme f53889c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f53890d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f53891e;

            public final void onClick(@NotNull View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f53887a, false, 56761, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f53887a, false, 56761, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view, "widget");
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    e.a(this.f53888b, this.f53889c, this.f53890d, this.f53891e);
                }
            }

            C0623b(Context context, Aweme aweme, String str, int i) {
                this.f53888b = context;
                this.f53889c = aweme;
                this.f53890d = str;
                this.f53891e = i;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @Nullable
        private Video d(@Nullable Aweme aweme) {
            Aweme aweme2 = aweme;
            if (!PatchProxy.isSupport(new Object[]{aweme2}, this, f53881a, false, 56752, new Class[]{Aweme.class}, Video.class)) {
                return j.f53966b.a(aweme2);
            }
            return (Video) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f53881a, false, 56752, new Class[]{Aweme.class}, Video.class);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
            if (r0 == null) goto L_0x003f;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.Aweme r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f53881a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r7[r9] = r3
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r5 = 0
                r6 = 56750(0xddae, float:7.9524E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f53881a
                r13 = 0
                r14 = 56750(0xddae, float:7.9524E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0037:
                if (r18 == 0) goto L_0x003f
                java.lang.String r0 = r18.getAid()
                if (r0 != 0) goto L_0x0041
            L_0x003f:
                java.lang.String r0 = ""
            L_0x0041:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideo.b.b.a.a(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
        }

        @JvmStatic
        public final boolean b(@Nullable Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, f53881a, false, 56753, new Class[]{Aweme.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f53881a, false, 56753, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            } else if (d(aweme2) != null) {
                return true;
            } else {
                return false;
            }
        }

        @JvmStatic
        @NotNull
        public final String c(@Nullable Aweme aweme) {
            Aweme aweme2 = aweme;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, f53881a, false, 56754, new Class[]{Aweme.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f53881a, false, 56754, new Class[]{Aweme.class}, String.class);
            }
            f.a aVar = f.f53897a;
            Video d2 = d(aweme2);
            if (d2 != null) {
                i = d2.getDuration() / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            }
            return aVar.a(i);
        }

        @JvmStatic
        @NotNull
        private SpannableString a(@NotNull Context context, @NotNull Aweme aweme, @NotNull String str, int i, @NotNull SpannableString spannableString) {
            Context context2 = context;
            Aweme aweme2 = aweme;
            String str2 = str;
            SpannableString spannableString2 = spannableString;
            if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2, Integer.valueOf(i), spannableString2}, this, f53881a, false, 56757, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE, SpannableString.class}, SpannableString.class)) {
                Object[] objArr = {context2, aweme2, str2, Integer.valueOf(i), spannableString2};
                return (SpannableString) PatchProxy.accessDispatch(objArr, this, f53881a, false, 56757, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE, SpannableString.class}, SpannableString.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "mContext");
            Intrinsics.checkParameterIsNotNull(aweme2, "mAweme");
            Intrinsics.checkParameterIsNotNull(str2, "mEventType");
            Intrinsics.checkParameterIsNotNull(spannableString2, "spannableString");
            r.a("show_complete_video_entrance", (Map) d.a().a("log_pb", ai.a().a(aweme.getAid())).a("local_time_ms", System.currentTimeMillis()).a("enter_from", str2).a("group_id", aweme.getAid()).f34114b);
            String spannableString3 = spannableString.toString();
            Intrinsics.checkExpressionValueIsNotNull(spannableString3, "spannableString.toString()");
            String string = context2.getString(C0906R.string.aik);
            Intrinsics.checkExpressionValueIsNotNull(string, "mContext.getString(R.string.full_version)");
            String format = String.format(string, Arrays.copyOf(new Object[]{c(aweme2)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            com.ss.android.ugc.aweme.feed.widget.e eVar = new com.ss.android.ugc.aweme.feed.widget.e(context2, C0906R.color.bz, format, 2130839649);
            c.a(spannableString2, new C0622a(context2, aweme2, str2, i), (spannableString3.length() - 4) + 1, spannableString3.length(), 17);
            c.a(spannableString2, eVar, (spannableString3.length() - 4) + 1, spannableString3.length(), 17);
            return spannableString2;
        }

        @JvmStatic
        @NotNull
        public final SpannableString a(@NotNull Context context, @NotNull String str, @NotNull Aweme aweme, @NotNull String str2, int i) {
            Context context2 = context;
            String str3 = str;
            Aweme aweme2 = aweme;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{context2, str3, aweme2, str4, Integer.valueOf(i)}, this, f53881a, false, 56755, new Class[]{Context.class, String.class, Aweme.class, String.class, Integer.TYPE}, SpannableString.class)) {
                Object[] objArr = {context2, str3, aweme2, str4, Integer.valueOf(i)};
                return (SpannableString) PatchProxy.accessDispatch(objArr, this, f53881a, false, 56755, new Class[]{Context.class, String.class, Aweme.class, String.class, Integer.TYPE}, SpannableString.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "mContext");
            Intrinsics.checkParameterIsNotNull(str3, "awemeDesc");
            Intrinsics.checkParameterIsNotNull(aweme2, "mAweme");
            Intrinsics.checkParameterIsNotNull(str4, "mEventType");
            return a(context, str, aweme, str2, i, false);
        }

        @JvmStatic
        @NotNull
        public final SpannableStringBuilder a(@NotNull Context context, @NotNull Aweme aweme, @NotNull String str, int i, @NotNull SpannableStringBuilder spannableStringBuilder) {
            Context context2 = context;
            Aweme aweme2 = aweme;
            String str2 = str;
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2, Integer.valueOf(i), spannableStringBuilder2}, this, f53881a, false, 56758, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE, SpannableStringBuilder.class}, SpannableStringBuilder.class)) {
                Object[] objArr = {context2, aweme2, str2, Integer.valueOf(i), spannableStringBuilder2};
                return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, this, f53881a, false, 56758, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE, SpannableStringBuilder.class}, SpannableStringBuilder.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "mContext");
            Intrinsics.checkParameterIsNotNull(aweme2, "mAweme");
            Intrinsics.checkParameterIsNotNull(str2, "mEventType");
            Intrinsics.checkParameterIsNotNull(spannableStringBuilder2, "spannableStringBuilder");
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            Intrinsics.checkExpressionValueIsNotNull(spannableStringBuilder3, "spannableStringBuilder.toString()");
            String string = context2.getString(C0906R.string.aik);
            Intrinsics.checkExpressionValueIsNotNull(string, "mContext.getString(R.string.full_version)");
            String format = String.format(string, Arrays.copyOf(new Object[]{c(aweme2)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            com.ss.android.ugc.aweme.feed.widget.e eVar = new com.ss.android.ugc.aweme.feed.widget.e(context2, C0906R.color.bz, format, 2130839649);
            spannableStringBuilder2.setSpan(new C0623b(context2, aweme2, str2, i), (spannableStringBuilder3.length() - 4) + 1, spannableStringBuilder3.length(), 17);
            spannableStringBuilder2.setSpan(eVar, (spannableStringBuilder3.length() - 4) + 1, spannableStringBuilder3.length(), 17);
            return spannableStringBuilder2;
        }

        @JvmStatic
        @NotNull
        private SpannableString a(@NotNull Context context, @NotNull String str, @NotNull Aweme aweme, @NotNull String str2, int i, boolean z) {
            Context context2 = context;
            String str3 = str;
            Aweme aweme2 = aweme;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{context2, str3, aweme2, str4, Integer.valueOf(i), (byte) 0}, this, f53881a, false, 56756, new Class[]{Context.class, String.class, Aweme.class, String.class, Integer.TYPE, Boolean.TYPE}, SpannableString.class)) {
                return (SpannableString) PatchProxy.accessDispatch(new Object[]{context2, str3, aweme2, str4, Integer.valueOf(i), (byte) 0}, this, f53881a, false, 56756, new Class[]{Context.class, String.class, Aweme.class, String.class, Integer.TYPE, Boolean.TYPE}, SpannableString.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "mContext");
            Intrinsics.checkParameterIsNotNull(str3, "awemeDesc");
            Intrinsics.checkParameterIsNotNull(aweme2, "mAweme");
            Intrinsics.checkParameterIsNotNull(str4, "mEventType");
            if (str.length() > PulishTitle.MAX_WORDS - 4) {
                Intrinsics.checkExpressionValueIsNotNull(str3.substring(0, (PulishTitle.MAX_WORDS - 4) - 3), "(this as java.lang.Strin…ing(startIndex, endIndex)");
                str3 = r0 + "...";
            }
            return a(context, aweme, str2, i, new SpannableString(str3 + " [r]"));
        }
    }

    @JvmStatic
    @NotNull
    public static final SpannableString a(@NotNull Context context, @NotNull String str, @NotNull Aweme aweme, @NotNull String str2, int i) {
        if (!PatchProxy.isSupport(new Object[]{context, str, aweme, str2, Integer.valueOf(i)}, null, f53879a, true, 56746, new Class[]{Context.class, String.class, Aweme.class, String.class, Integer.TYPE}, SpannableString.class)) {
            return f53880b.a(context, str, aweme, str2, i);
        }
        Object[] objArr = {context, str, aweme, str2, Integer.valueOf(i)};
        return (SpannableString) PatchProxy.accessDispatch(objArr, null, f53879a, true, 56746, new Class[]{Context.class, String.class, Aweme.class, String.class, Integer.TYPE}, SpannableString.class);
    }

    @JvmStatic
    @NotNull
    public static final SpannableStringBuilder a(@NotNull Context context, @NotNull Aweme aweme, @NotNull String str, int i, @NotNull SpannableStringBuilder spannableStringBuilder) {
        if (!PatchProxy.isSupport(new Object[]{context, aweme, str, Integer.valueOf(i), spannableStringBuilder}, null, f53879a, true, 56749, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE, SpannableStringBuilder.class}, SpannableStringBuilder.class)) {
            return f53880b.a(context, aweme, str, i, spannableStringBuilder);
        }
        Object[] objArr = {context, aweme, str, Integer.valueOf(i), spannableStringBuilder};
        return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, f53879a, true, 56749, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE, SpannableStringBuilder.class}, SpannableStringBuilder.class);
    }

    @JvmStatic
    public static final boolean a(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{aweme2}, null, f53879a, true, 56744, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return f53880b.b(aweme2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f53879a, true, 56744, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    @NotNull
    public static final String b(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{aweme2}, null, f53879a, true, 56745, new Class[]{Aweme.class}, String.class)) {
            return f53880b.c(aweme2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f53879a, true, 56745, new Class[]{Aweme.class}, String.class);
    }
}
