package com.ss.android.ugc.aweme.challenge.ui;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/challenge/ui/CommerceDelegate$updateFragment$7", "Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;", "lastTab", "", "onPageSelected", "", "position", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommerceDelegate$updateFragment$7 extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35511a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n f35512b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref.IntRef f35513c;

    /* renamed from: d  reason: collision with root package name */
    private int f35514d;

    public final void onPageSelected(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35511a, false, 26186, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35511a, false, 26186, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Fragment item = this.f35512b.a().getItem(i2);
        String str = null;
        if (!(item instanceof CommerceChallengeFragment)) {
            item = null;
        }
        if (item != null) {
            if (item != null) {
                CommerceChallengeFragment commerceChallengeFragment = (CommerceChallengeFragment) item;
                if (PatchProxy.isSupport(new Object[0], commerceChallengeFragment, CommerceChallengeFragment.f2867a, false, 28041, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], commerceChallengeFragment, CommerceChallengeFragment.f2867a, false, 28041, new Class[0], Void.TYPE);
                } else {
                    new Handler().postDelayed(new CommerceChallengeFragment.a(commerceChallengeFragment), 100);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
            }
        }
        Fragment item2 = this.f35512b.a().getItem(this.f35514d);
        if (!(item2 instanceof CommerceChallengeFragment)) {
            item2 = null;
        }
        if (item2 != null) {
            if (item2 != null) {
                CommerceChallengeFragment commerceChallengeFragment2 = (CommerceChallengeFragment) item2;
                if (PatchProxy.isSupport(new Object[0], commerceChallengeFragment2, CommerceChallengeFragment.f2867a, false, 28040, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], commerceChallengeFragment2, CommerceChallengeFragment.f2867a, false, 28040, new Class[0], Void.TYPE);
                } else {
                    CrossPlatformWebView b2 = commerceChallengeFragment2.b();
                    if (b2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        CrossPlatformWebView b3 = commerceChallengeFragment2.b();
                        if (b3 != null) {
                            str = b3.getReactId();
                        }
                        b2.a("brand_room_left", jSONObject, str);
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
            }
        }
        this.f35514d = i2;
    }

    CommerceDelegate$updateFragment$7(n nVar, Ref.IntRef intRef) {
        this.f35512b = nVar;
        this.f35513c = intRef;
        this.f35514d = intRef.element;
    }
}
