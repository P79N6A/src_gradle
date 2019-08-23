package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class PhotoPreviewFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50756a;

    /* renamed from: b  reason: collision with root package name */
    private j f50757b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f50758c;

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f50756a, false, 51008, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f50756a, false, 51008, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putSerializable("photo_param", this.f50757b);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f50756a, false, 51007, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f50756a, false, 51007, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50756a, false, 51009, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50756a, false, 51009, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.f50757b = (j) bundle.getSerializable("photo_param");
        } else {
            this.f50757b = (j) getArguments().getSerializable("photo_param");
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, f50756a, false, 51010, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f50756a, false, 51010, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f50758c = (RemoteImageView) view.findViewById(C0906R.id.bxr);
        RemoteImageView remoteImageView = this.f50758c;
        c.a(remoteImageView, "file://" + this.f50757b.getPath());
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f50756a, false, 51006, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ru, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f50756a, false, 51006, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
