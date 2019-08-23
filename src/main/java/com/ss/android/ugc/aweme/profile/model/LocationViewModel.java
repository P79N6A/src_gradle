package com.ss.android.ugc.aweme.profile.model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.d.w;
import java.io.IOException;

public class LocationViewModel extends ViewModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    LiveData<w> locationTree;

    private void loadRegionLevel(Context context) throws IOException {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 67482, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 67482, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        w.a aVar = new w.a();
        this.locationTree = new MutableLiveData();
        ((MutableLiveData) this.locationTree).setValue(aVar.a(context.getAssets().open("regiontree_in_order")));
    }

    public LiveData<w> getLocationTree(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 67481, new Class[]{Context.class}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 67481, new Class[]{Context.class}, LiveData.class);
        }
        if (this.locationTree == null) {
            try {
                loadRegionLevel(context);
            } catch (IOException unused) {
                if (this.locationTree != null) {
                    ((MutableLiveData) this.locationTree).setValue(new w());
                } else {
                    this.locationTree = new MutableLiveData();
                }
            }
        }
        return this.locationTree;
    }
}
