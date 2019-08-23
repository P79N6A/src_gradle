package com.ss.android.ugc.aweme.shortvideo.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.c;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/publish/ChallengeProxy;", "", "()V", "mChallenge", "Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;", "getMChallenge$tools_dmt_av_impl_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;", "setMChallenge$tools_dmt_av_impl_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;)V", "getChallenge", "getChallengeId", "", "getChallengeName", "setChallenge", "", "challenge", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68863a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public c f68864b;

    @Nullable
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f68863a, false, 78219, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68863a, false, 78219, new Class[0], String.class);
        }
        c cVar = this.f68864b;
        if (cVar != null) {
            return cVar.getCid();
        }
        return null;
    }
}
