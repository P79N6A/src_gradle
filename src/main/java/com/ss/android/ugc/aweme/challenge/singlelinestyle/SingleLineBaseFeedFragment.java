package com.ss.android.ugc.aweme.challenge.singlelinestyle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.fragment.a;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;

public abstract class SingleLineBaseFeedFragment extends AmeBaseFragment implements d, b.a, AbstractBaseDetailFragment.a, ScreenBroadcastReceiver.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35417a;

    /* renamed from: b  reason: collision with root package name */
    protected a f35418b;

    public void K_() {
    }

    public void a() {
    }

    public abstract void a(Bundle bundle);

    public void a(View view, Bundle bundle) {
    }

    public void a(View view, Aweme aweme, String str) {
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35417a, false, 25898, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35417a, false, 25898, new Class[]{Boolean.TYPE}, Void.TYPE);
        }
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f35417a, false, 25897, new Class[0], Boolean.TYPE)) {
            return true;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35417a, false, 25897, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35417a, false, 25894, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35417a, false, 25894, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f35417a, false, 25896, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f35417a, false, 25896, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        a(view, bundle);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35417a, false, 25895, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35417a, false, 25895, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.n0, viewGroup2, false);
        a(getArguments());
        return inflate;
    }
}
