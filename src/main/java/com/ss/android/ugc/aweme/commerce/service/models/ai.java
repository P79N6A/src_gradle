package com.ss.android.ugc.aweme.commerce.service.models;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/UICountDown;", "", "()V", "day", "", "getDay", "()I", "setDay", "(I)V", "dayString", "", "getDayString", "()Ljava/lang/String;", "setDayString", "(Ljava/lang/String;)V", "detailString", "getDetailString", "setDetailString", "hour", "getHour", "setHour", "hourString", "getHourString", "setHourString", "minute", "getMinute", "setMinute", "minuteString", "getMinuteString", "setMinuteString", "second", "getSecond", "setSecond", "secondString", "getSecondString", "setSecondString", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ai {
    public static final a j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f38174a;

    /* renamed from: b  reason: collision with root package name */
    public int f38175b;

    /* renamed from: c  reason: collision with root package name */
    public int f38176c;

    /* renamed from: d  reason: collision with root package name */
    public int f38177d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f38178e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f38179f;
    @Nullable
    public String g;
    @Nullable
    public String h;
    @Nullable
    public String i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/UICountDown$Companion;", "", "()V", "getCountDown", "Lcom/ss/android/ugc/aweme/commerce/service/models/UICountDown;", "context", "Landroid/content/Context;", "time", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38180a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ai a(@NotNull Context context, long j) {
            String str;
            String str2;
            String str3;
            String str4;
            Context context2 = context;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{context2, new Long(j2)}, this, f38180a, false, 29911, new Class[]{Context.class, Long.TYPE}, ai.class)) {
                return (ai) PatchProxy.accessDispatch(new Object[]{context2, new Long(j2)}, this, f38180a, false, 29911, new Class[]{Context.class, Long.TYPE}, ai.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            ai aiVar = new ai();
            String str5 = null;
            if (j2 > 0) {
                long j3 = j2 / 1000;
                int i = ((int) j3) % 60;
                long j4 = j3 / 60;
                int i2 = ((int) j4) % 60;
                int i3 = (int) (j4 / 60);
                int i4 = i3 % 24;
                int i5 = i3 / 24;
                aiVar.f38174a = i5;
                aiVar.f38175b = i4;
                aiVar.f38176c = i2;
                aiVar.f38177d = i;
                if (i5 > 0) {
                    str5 = String.valueOf(i5);
                }
                aiVar.f38178e = str5;
                if (i4 < 10) {
                    str = context2.getString(C0906R.string.c39, new Object[]{Integer.valueOf(i4)});
                } else {
                    str = String.valueOf(i4);
                }
                aiVar.f38179f = str;
                if (i2 < 10) {
                    str2 = context2.getString(C0906R.string.c39, new Object[]{Integer.valueOf(i2)});
                } else {
                    str2 = String.valueOf(i2);
                }
                aiVar.g = str2;
                if (i < 10) {
                    str3 = context2.getString(C0906R.string.c39, new Object[]{Integer.valueOf(i)});
                } else {
                    str3 = String.valueOf(i);
                }
                aiVar.h = str3;
                if (i5 > 0) {
                    str4 = context2.getString(C0906R.string.c2u, new Object[]{Integer.valueOf(i5), aiVar.f38179f, aiVar.g, aiVar.h});
                } else {
                    str4 = context2.getString(C0906R.string.c36, new Object[]{aiVar.f38179f, aiVar.g, aiVar.h});
                }
                aiVar.i = str4;
            } else {
                aiVar.f38174a = 0;
                aiVar.f38175b = 0;
                aiVar.f38176c = 0;
                aiVar.f38177d = 0;
                aiVar.f38178e = null;
                aiVar.f38179f = context2.getString(C0906R.string.c35);
                aiVar.g = context2.getString(C0906R.string.c35);
                aiVar.h = context2.getString(C0906R.string.c35);
            }
            return aiVar;
        }
    }
}
