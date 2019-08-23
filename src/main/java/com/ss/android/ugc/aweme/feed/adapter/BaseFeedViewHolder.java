package com.ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import butterknife.BindView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.feed.f.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.g;

public abstract class BaseFeedViewHolder implements Observer<a>, ViewModelStoreOwner, IFeedViewHolder {
    public static ChangeQuickRedirect i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f44642a;
    public DataCenter j;
    public WidgetManager k;
    public String l = "click";
    @Nullable
    @BindView(2131493179)
    RemoteImageView mAvatarDeco;

    public Aweme B() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 40289, new Class[0], Aweme.class)) {
            return q.a(this);
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, i, false, 40289, new Class[0], Aweme.class);
    }

    public boolean C() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 40291, new Class[0], Boolean.TYPE)) {
            return false;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, i, false, 40291, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void a(ad adVar) {
    }

    public void a(Aweme aweme, boolean z, int i2) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, (byte) 1, Integer.valueOf(i2)}, this, i, false, 40290, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, (byte) 1, Integer.valueOf(i2)}, this, i, false, 40290, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        q.a(this, aweme2, true, i2);
    }

    public void a(g gVar) {
    }

    public void a(String str, String str2) {
    }

    public void b(int i2) {
    }

    public void b(Aweme aweme) {
    }

    public void c(int i2) {
    }

    public void d(boolean z) {
    }

    public void e(int i2) {
    }

    public void e(boolean z) {
    }

    public com.ss.android.ugc.playerkit.videoview.g m() {
        return null;
    }

    public void o() {
    }

    public void p() {
    }

    public CommerceVideoDelegate r() {
        return null;
    }

    public void s() {
    }

    public p t() {
        return null;
    }

    public void t_() {
    }

    public final boolean u() {
        return this.f44642a;
    }

    @NonNull
    public ViewModelStore getViewModelStore() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 40288, new Class[0], ViewModelStore.class)) {
            return new ViewModelStore();
        }
        return (ViewModelStore) PatchProxy.accessDispatch(new Object[0], this, i, false, 40288, new Class[0], ViewModelStore.class);
    }

    @CallSuper
    public void f(@NonNull String str) {
        this.l = str;
    }

    public void a(boolean z) {
        this.f44642a = z;
    }
}
