package com.ss.android.ugc.aweme.shortvideo.lrc;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcInfo;", "", "timeStart", "", "text", "", "(FLjava/lang/String;)V", "lrc", "getLrc", "()Ljava/lang/String;", "setLrc", "(Ljava/lang/String;)V", "lrcWidth", "getLrcWidth", "()F", "setLrcWidth", "(F)V", "getTimeStart", "setTimeStart", "Companion", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0719a f68356d = new C0719a((byte) 0);
    @SerializedName("timeId")

    /* renamed from: a  reason: collision with root package name */
    public float f68357a = 0.0f;
    @SerializedName("text")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f68358b;

    /* renamed from: c  reason: collision with root package name */
    public float f68359c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcInfo$Companion;", "", "()V", "shirkList", "", "Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcInfo;", "lrcInfos", "paint", "Landroid/text/TextPaint;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lrc.a$a  reason: collision with other inner class name */
    public static final class C0719a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68360a;

        private C0719a() {
        }

        public /* synthetic */ C0719a(byte b2) {
            this();
        }
    }

    public a(float f2, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f68358b = str;
    }
}
