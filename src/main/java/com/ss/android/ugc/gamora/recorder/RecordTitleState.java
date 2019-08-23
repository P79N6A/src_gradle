package com.ss.android.ugc.gamora.recorder;

import android.graphics.drawable.Drawable;
import com.bytedance.jedi.arch.x;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015\u0012\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\u0002\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015HÆ\u0003J\u001d\u00104\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J¹\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00152\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0001J\u0013\u0010>\u001a\u00020\u000b2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0007HÖ\u0001J\t\u0010B\u001a\u00020\tHÖ\u0001R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR%\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001d¨\u0006C"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "Lcom/bytedance/jedi/arch/State;", "progressMaxDuration", "", "tvChooseMusicAlpha", "", "ivChooseMusicAlpha", "", "tvChooseMusicText", "", "titleBarVisible", "", "closeChooseVisible", "topMargin", "ivChooseMusicVisible", "tvChooseMusicVisible", "tvChooseMusicClickable", "progressSegmentVisible", "ivChooseMusicDrawable", "Landroid/graphics/drawable/Drawable;", "closeChooseAlphaAnim", "Lkotlin/Pair;", "progressClipAnchors", "", "Lcom/ss/android/ugc/aweme/shortvideo/ui/TimeSpeedModelExtension;", "(JFILjava/lang/String;ZZIZZZZLandroid/graphics/drawable/Drawable;Lkotlin/Pair;Lkotlin/Pair;)V", "getCloseChooseAlphaAnim", "()Lkotlin/Pair;", "getCloseChooseVisible", "()Z", "getIvChooseMusicAlpha", "()I", "getIvChooseMusicDrawable", "()Landroid/graphics/drawable/Drawable;", "getIvChooseMusicVisible", "getProgressClipAnchors", "getProgressMaxDuration", "()J", "getProgressSegmentVisible", "getTitleBarVisible", "getTopMargin", "getTvChooseMusicAlpha", "()F", "getTvChooseMusicClickable", "getTvChooseMusicText", "()Ljava/lang/String;", "getTvChooseMusicVisible", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecordTitleState implements x {
    @Nullable
    private final Pair<Float, Float> closeChooseAlphaAnim;
    private final boolean closeChooseVisible;
    private final int ivChooseMusicAlpha;
    @Nullable
    private final Drawable ivChooseMusicDrawable;
    private final boolean ivChooseMusicVisible;
    @Nullable
    private final Pair<List<TimeSpeedModelExtension>, Long> progressClipAnchors;
    private final long progressMaxDuration;
    private final boolean progressSegmentVisible;
    private final boolean titleBarVisible;
    private final int topMargin;
    private final float tvChooseMusicAlpha;
    private final boolean tvChooseMusicClickable;
    @NotNull
    private final String tvChooseMusicText;
    private final boolean tvChooseMusicVisible;

    public RecordTitleState() {
        this(0, 0.0f, 0, null, false, false, 0, false, false, false, false, null, null, null, 16383, null);
    }

    public static /* synthetic */ RecordTitleState copy$default(RecordTitleState recordTitleState, long j, float f2, int i, String str, boolean z, boolean z2, int i2, boolean z3, boolean z4, boolean z5, boolean z6, Drawable drawable, Pair pair, Pair pair2, int i3, Object obj) {
        RecordTitleState recordTitleState2 = recordTitleState;
        int i4 = i3;
        return recordTitleState.copy((i4 & 1) != 0 ? recordTitleState2.progressMaxDuration : j, (i4 & 2) != 0 ? recordTitleState2.tvChooseMusicAlpha : f2, (i4 & 4) != 0 ? recordTitleState2.ivChooseMusicAlpha : i, (i4 & 8) != 0 ? recordTitleState2.tvChooseMusicText : str, (i4 & 16) != 0 ? recordTitleState2.titleBarVisible : z, (i4 & 32) != 0 ? recordTitleState2.closeChooseVisible : z2, (i4 & 64) != 0 ? recordTitleState2.topMargin : i2, (i4 & SearchJediMixFeedAdapter.f42517f) != 0 ? recordTitleState2.ivChooseMusicVisible : z3, (i4 & 256) != 0 ? recordTitleState2.tvChooseMusicVisible : z4, (i4 & 512) != 0 ? recordTitleState2.tvChooseMusicClickable : z5, (i4 & 1024) != 0 ? recordTitleState2.progressSegmentVisible : z6, (i4 & 2048) != 0 ? recordTitleState2.ivChooseMusicDrawable : drawable, (i4 & 4096) != 0 ? recordTitleState2.closeChooseAlphaAnim : pair, (i4 & 8192) != 0 ? recordTitleState2.progressClipAnchors : pair2);
    }

    public final long component1() {
        return this.progressMaxDuration;
    }

    public final boolean component10() {
        return this.tvChooseMusicClickable;
    }

    public final boolean component11() {
        return this.progressSegmentVisible;
    }

    @Nullable
    public final Drawable component12() {
        return this.ivChooseMusicDrawable;
    }

    @Nullable
    public final Pair<Float, Float> component13() {
        return this.closeChooseAlphaAnim;
    }

    @Nullable
    public final Pair<List<TimeSpeedModelExtension>, Long> component14() {
        return this.progressClipAnchors;
    }

    public final float component2() {
        return this.tvChooseMusicAlpha;
    }

    public final int component3() {
        return this.ivChooseMusicAlpha;
    }

    @NotNull
    public final String component4() {
        return this.tvChooseMusicText;
    }

    public final boolean component5() {
        return this.titleBarVisible;
    }

    public final boolean component6() {
        return this.closeChooseVisible;
    }

    public final int component7() {
        return this.topMargin;
    }

    public final boolean component8() {
        return this.ivChooseMusicVisible;
    }

    public final boolean component9() {
        return this.tvChooseMusicVisible;
    }

    @NotNull
    public final RecordTitleState copy(long j, float f2, int i, @NotNull String str, boolean z, boolean z2, int i2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable Drawable drawable, @Nullable Pair<Float, Float> pair, @Nullable Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair2) {
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(str2, "tvChooseMusicText");
        RecordTitleState recordTitleState = new RecordTitleState(j, f2, i, str2, z, z2, i2, z3, z4, z5, z6, drawable, pair, pair2);
        return recordTitleState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof RecordTitleState) {
                RecordTitleState recordTitleState = (RecordTitleState) obj;
                if ((this.progressMaxDuration == recordTitleState.progressMaxDuration) && Float.compare(this.tvChooseMusicAlpha, recordTitleState.tvChooseMusicAlpha) == 0) {
                    if ((this.ivChooseMusicAlpha == recordTitleState.ivChooseMusicAlpha) && Intrinsics.areEqual((Object) this.tvChooseMusicText, (Object) recordTitleState.tvChooseMusicText)) {
                        if (this.titleBarVisible == recordTitleState.titleBarVisible) {
                            if (this.closeChooseVisible == recordTitleState.closeChooseVisible) {
                                if (this.topMargin == recordTitleState.topMargin) {
                                    if (this.ivChooseMusicVisible == recordTitleState.ivChooseMusicVisible) {
                                        if (this.tvChooseMusicVisible == recordTitleState.tvChooseMusicVisible) {
                                            if (this.tvChooseMusicClickable == recordTitleState.tvChooseMusicClickable) {
                                                if (!(this.progressSegmentVisible == recordTitleState.progressSegmentVisible) || !Intrinsics.areEqual((Object) this.ivChooseMusicDrawable, (Object) recordTitleState.ivChooseMusicDrawable) || !Intrinsics.areEqual((Object) this.closeChooseAlphaAnim, (Object) recordTitleState.closeChooseAlphaAnim) || !Intrinsics.areEqual((Object) this.progressClipAnchors, (Object) recordTitleState.progressClipAnchors)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.progressMaxDuration;
        int floatToIntBits = ((((((int) (j ^ (j >>> 32))) * 31) + Float.floatToIntBits(this.tvChooseMusicAlpha)) * 31) + this.ivChooseMusicAlpha) * 31;
        String str = this.tvChooseMusicText;
        int i = 0;
        int hashCode = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.titleBarVisible;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.closeChooseVisible;
        if (z2) {
            z2 = true;
        }
        int i3 = (((i2 + (z2 ? 1 : 0)) * 31) + this.topMargin) * 31;
        boolean z3 = this.ivChooseMusicVisible;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.tvChooseMusicVisible;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.tvChooseMusicClickable;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.progressSegmentVisible;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        Drawable drawable = this.ivChooseMusicDrawable;
        int hashCode2 = (i7 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Pair<Float, Float> pair = this.closeChooseAlphaAnim;
        int hashCode3 = (hashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        Pair<List<TimeSpeedModelExtension>, Long> pair2 = this.progressClipAnchors;
        if (pair2 != null) {
            i = pair2.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        return "RecordTitleState(progressMaxDuration=" + this.progressMaxDuration + ", tvChooseMusicAlpha=" + this.tvChooseMusicAlpha + ", ivChooseMusicAlpha=" + this.ivChooseMusicAlpha + ", tvChooseMusicText=" + this.tvChooseMusicText + ", titleBarVisible=" + this.titleBarVisible + ", closeChooseVisible=" + this.closeChooseVisible + ", topMargin=" + this.topMargin + ", ivChooseMusicVisible=" + this.ivChooseMusicVisible + ", tvChooseMusicVisible=" + this.tvChooseMusicVisible + ", tvChooseMusicClickable=" + this.tvChooseMusicClickable + ", progressSegmentVisible=" + this.progressSegmentVisible + ", ivChooseMusicDrawable=" + this.ivChooseMusicDrawable + ", closeChooseAlphaAnim=" + this.closeChooseAlphaAnim + ", progressClipAnchors=" + this.progressClipAnchors + ")";
    }

    @Nullable
    public final Pair<Float, Float> getCloseChooseAlphaAnim() {
        return this.closeChooseAlphaAnim;
    }

    public final boolean getCloseChooseVisible() {
        return this.closeChooseVisible;
    }

    public final int getIvChooseMusicAlpha() {
        return this.ivChooseMusicAlpha;
    }

    @Nullable
    public final Drawable getIvChooseMusicDrawable() {
        return this.ivChooseMusicDrawable;
    }

    public final boolean getIvChooseMusicVisible() {
        return this.ivChooseMusicVisible;
    }

    @Nullable
    public final Pair<List<TimeSpeedModelExtension>, Long> getProgressClipAnchors() {
        return this.progressClipAnchors;
    }

    public final long getProgressMaxDuration() {
        return this.progressMaxDuration;
    }

    public final boolean getProgressSegmentVisible() {
        return this.progressSegmentVisible;
    }

    public final boolean getTitleBarVisible() {
        return this.titleBarVisible;
    }

    public final int getTopMargin() {
        return this.topMargin;
    }

    public final float getTvChooseMusicAlpha() {
        return this.tvChooseMusicAlpha;
    }

    public final boolean getTvChooseMusicClickable() {
        return this.tvChooseMusicClickable;
    }

    @NotNull
    public final String getTvChooseMusicText() {
        return this.tvChooseMusicText;
    }

    public final boolean getTvChooseMusicVisible() {
        return this.tvChooseMusicVisible;
    }

    public RecordTitleState(long j, float f2, int i, @NotNull String str, boolean z, boolean z2, int i2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable Drawable drawable, @Nullable Pair<Float, Float> pair, @Nullable Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair2) {
        Intrinsics.checkParameterIsNotNull(str, "tvChooseMusicText");
        this.progressMaxDuration = j;
        this.tvChooseMusicAlpha = f2;
        this.ivChooseMusicAlpha = i;
        this.tvChooseMusicText = str;
        this.titleBarVisible = z;
        this.closeChooseVisible = z2;
        this.topMargin = i2;
        this.ivChooseMusicVisible = z3;
        this.tvChooseMusicVisible = z4;
        this.tvChooseMusicClickable = z5;
        this.progressSegmentVisible = z6;
        this.ivChooseMusicDrawable = drawable;
        this.closeChooseAlphaAnim = pair;
        this.progressClipAnchors = pair2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RecordTitleState(long r17, float r19, int r20, java.lang.String r21, boolean r22, boolean r23, int r24, boolean r25, boolean r26, boolean r27, boolean r28, android.graphics.drawable.Drawable r29, kotlin.Pair r30, kotlin.Pair r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0014
        L_0x0012:
            r3 = r19
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001b
            r4 = 255(0xff, float:3.57E-43)
            goto L_0x001d
        L_0x001b:
            r4 = r20
        L_0x001d:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0039
            android.app.Application r5 = com.ss.android.ugc.aweme.port.in.a.f61119b
            java.lang.String r6 = "AVEnv.application"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131559158(0x7f0d02f6, float:1.8743652E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "AVEnv.application.resour…ng(R.string.choose_music)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            goto L_0x003b
        L_0x0039:
            r5 = r21
        L_0x003b:
            r6 = r0 & 16
            r7 = 1
            if (r6 == 0) goto L_0x0042
            r6 = 1
            goto L_0x0044
        L_0x0042:
            r6 = r22
        L_0x0044:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x004a
            r8 = 1
            goto L_0x004c
        L_0x004a:
            r8 = r23
        L_0x004c:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0052
            r9 = 0
            goto L_0x0054
        L_0x0052:
            r9 = r24
        L_0x0054:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x005a
            r10 = 1
            goto L_0x005c
        L_0x005a:
            r10 = r25
        L_0x005c:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0062
            r11 = 1
            goto L_0x0064
        L_0x0062:
            r11 = r26
        L_0x0064:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x006a
            r12 = 1
            goto L_0x006c
        L_0x006a:
            r12 = r27
        L_0x006c:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r7 = r28
        L_0x0073:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            r14 = 0
            if (r13 == 0) goto L_0x007a
            r13 = r14
            goto L_0x007c
        L_0x007a:
            r13 = r29
        L_0x007c:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0082
            r15 = r14
            goto L_0x0084
        L_0x0082:
            r15 = r30
        L_0x0084:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r14 = r31
        L_0x008b:
            r17 = r16
            r18 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r7
            r30 = r13
            r31 = r15
            r32 = r14
            r17.<init>(r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.RecordTitleState.<init>(long, float, int, java.lang.String, boolean, boolean, int, boolean, boolean, boolean, boolean, android.graphics.drawable.Drawable, kotlin.Pair, kotlin.Pair, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
