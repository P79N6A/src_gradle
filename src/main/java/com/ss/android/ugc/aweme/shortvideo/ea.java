package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.property.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/PlanCMusicTipProvider;", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "(Landroid/support/v4/app/FragmentActivity;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "isMusicTipChanged", "", "()Z", "setMusicTipChanged", "(Z)V", "mShortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "createTip", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView;", "realCreateTip", "musicDuration", "", "maxDuration", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ea {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66825a = null;

    /* renamed from: e  reason: collision with root package name */
    public static final long f66826e = com.ss.android.ugc.aweme.port.in.a.L.c(e.a.LongVideoThreshold);

    /* renamed from: f  reason: collision with root package name */
    public static final long f66827f = f66827f;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public fh f66828b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f66829c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final FragmentActivity f66830d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/PlanCMusicTipProvider$Companion;", "", "()V", "LONG_TIME", "", "SHORT_TIME", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ea(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f66830d = fragmentActivity;
    }

    public final b a(long j, long j2) {
        boolean z;
        String str;
        int i;
        long j3 = j;
        long j4 = j2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f66825a, false, 74383, new Class[]{Long.TYPE, Long.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f66825a, false, 74383, new Class[]{Long.TYPE, Long.TYPE}, b.class);
        }
        fh fhVar = this.f66828b;
        if (fhVar == null || (!Intrinsics.areEqual((Object) "prop_reuse", (Object) fhVar.r) && !Intrinsics.areEqual((Object) "prop_page", (Object) fhVar.r))) {
            z = false;
        } else {
            z = true;
        }
        if (j3 < j4) {
            FragmentActivity fragmentActivity = this.f66830d;
            if (!z || this.f66829c) {
                i = C0906R.string.dph;
            } else {
                i = C0906R.string.dpj;
            }
            str = fragmentActivity.getString(i, new Object[]{Long.valueOf(j3 / 1000)});
            Intrinsics.checkExpressionValueIsNotNull(str, "activity.getString(if (i…ps, musicDuration / 1000)");
        } else if (!z || this.f66829c) {
            str = "";
        } else {
            str = this.f66830d.getString(C0906R.string.dpk);
            Intrinsics.checkExpressionValueIsNotNull(str, "activity.getString(R.string.use_origin_music_tips)");
        }
        if (this.f66830d != null) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return new b.a(this.f66830d).a(str).a(Color.parseColor("#E6FFFFFF")).a();
            }
        }
        return null;
    }
}
