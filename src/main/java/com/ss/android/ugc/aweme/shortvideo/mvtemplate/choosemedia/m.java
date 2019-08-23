package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final /* synthetic */ class m implements MvImageAlbumAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68612a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChoosePhotoActivity f68613b;

    m(MvChoosePhotoActivity mvChoosePhotoActivity) {
        this.f68613b = mvChoosePhotoActivity;
    }

    public final void a(MvImageAlbumAdapter.a aVar, boolean z, int i) {
        MvImageAlbumAdapter.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, f68612a, false, 77969, new Class[]{MvImageAlbumAdapter.a.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z), Integer.valueOf(i)}, this, f68612a, false, 77969, new Class[]{MvImageAlbumAdapter.a.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        MvChoosePhotoActivity mvChoosePhotoActivity = this.f68613b;
        if (aVar2 != null) {
            if (!(mvChoosePhotoActivity.m == -1 || (i & 8) == 0)) {
                MvChoosePhotoFragment mvChoosePhotoFragment = mvChoosePhotoActivity.f68529d;
                List<MvImageChooseAdapter.b> list = aVar2.f68562c;
                if (PatchProxy.isSupport(new Object[]{list}, mvChoosePhotoFragment, MvChoosePhotoFragment.f68541a, false, 77982, new Class[]{List.class}, Void.TYPE)) {
                    MvChoosePhotoFragment mvChoosePhotoFragment2 = mvChoosePhotoFragment;
                    PatchProxy.accessDispatch(new Object[]{list}, mvChoosePhotoFragment2, MvChoosePhotoFragment.f68541a, false, 77982, new Class[]{List.class}, Void.TYPE);
                } else if (list != null) {
                    mvChoosePhotoFragment.f68545e.setVisibility(8);
                    if (list.isEmpty()) {
                        mvChoosePhotoFragment.f68544d.setVisibility(0);
                        mvChoosePhotoFragment.f68544d.setText(C0906R.string.bhf);
                    } else {
                        mvChoosePhotoFragment.f68544d.setVisibility(8);
                    }
                    mvChoosePhotoFragment.f68542b.a((Collection<? extends MvImageChooseAdapter.b>) list);
                }
            }
            if (!(mvChoosePhotoActivity.l == -1 || (i & 16) == 0)) {
                ChooseVideoFragment chooseVideoFragment = mvChoosePhotoActivity.f68531f;
                List<MvImageChooseAdapter.b> list2 = aVar2.f68563d;
                if (PatchProxy.isSupport(new Object[]{list2}, chooseVideoFragment, ChooseVideoFragment.f68508a, false, 77914, new Class[]{List.class}, Void.TYPE)) {
                    ChooseVideoFragment chooseVideoFragment2 = chooseVideoFragment;
                    PatchProxy.accessDispatch(new Object[]{list2}, chooseVideoFragment2, ChooseVideoFragment.f68508a, false, 77914, new Class[]{List.class}, Void.TYPE);
                } else if (list2 != null) {
                    DmtLoadingLayout dmtLoadingLayout = chooseVideoFragment.h;
                    if (dmtLoadingLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
                    }
                    dmtLoadingLayout.setVisibility(8);
                    if (list2.isEmpty()) {
                        DmtTextView dmtTextView = chooseVideoFragment.g;
                        if (dmtTextView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("noVideoHintTextView");
                        }
                        dmtTextView.setVisibility(0);
                        DmtTextView dmtTextView2 = chooseVideoFragment.g;
                        if (dmtTextView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("noVideoHintTextView");
                        }
                        dmtTextView2.setText(C0906R.string.bi8);
                    } else {
                        DmtTextView dmtTextView3 = chooseVideoFragment.g;
                        if (dmtTextView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("noVideoHintTextView");
                        }
                        dmtTextView3.setVisibility(8);
                    }
                    MvImageChooseAdapter mvImageChooseAdapter = chooseVideoFragment.f68510c;
                    if (mvImageChooseAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
                    }
                    mvImageChooseAdapter.a((Collection<? extends MvImageChooseAdapter.b>) list2);
                }
            }
            if (!TextUtils.isEmpty(aVar2.f68561b)) {
                mvChoosePhotoActivity.f68528c.setText(aVar2.f68561b);
            }
        }
        if (z) {
            mvChoosePhotoActivity.b(false);
            mvChoosePhotoActivity.a("select_photo_album");
        }
    }
}
