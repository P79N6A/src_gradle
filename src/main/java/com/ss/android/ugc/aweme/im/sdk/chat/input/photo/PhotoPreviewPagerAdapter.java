package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class PhotoPreviewPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50771a;

    /* renamed from: b  reason: collision with root package name */
    private List<j> f50772b;

    public int getCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f50771a, false, 51027, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50771a, false, 51027, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f50772b != null) {
            i = this.f50772b.size();
        }
        return i;
    }

    public Fragment getItem(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50771a, false, 51026, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50771a, false, 51026, new Class[]{Integer.TYPE}, Fragment.class);
        }
        PhotoPreviewFragment photoPreviewFragment = new PhotoPreviewFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("photo_param", this.f50772b.get(i));
        photoPreviewFragment.setArguments(bundle);
        return photoPreviewFragment;
    }

    public PhotoPreviewPagerAdapter(FragmentManager fragmentManager, List<j> list) {
        super(fragmentManager);
        this.f50772b = list;
    }
}
