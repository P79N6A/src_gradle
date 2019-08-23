package com.ss.android.ugc.aweme.profile.model;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SchoolViewModel extends ViewModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MutableLiveData<String> collegeName = new MutableLiveData<>();
    public MutableLiveData<Integer> degree = new MutableLiveData<>();
    public MutableLiveData<String> enrollYear = new MutableLiveData<>();
    public MutableLiveData<String> schoolName = new MutableLiveData<>();
    public MutableLiveData<Integer> showRange = new MutableLiveData<>();

    public SchoolViewModel() {
        this.schoolName.setValue("");
        this.collegeName.setValue("");
        this.enrollYear.setValue("");
        this.degree.setValue(0);
        this.showRange.setValue(1);
    }

    public void setCollegeName(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 67493, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 67493, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.collegeName.setValue(str2);
    }

    public void setEnrollYear(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 67494, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 67494, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.enrollYear.setValue(str2);
    }

    public void setSchoolName(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 67492, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 67492, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.schoolName.setValue(str2);
    }

    public void setDegree(@NonNull int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 67495, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 67495, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.degree.setValue(Integer.valueOf(i));
    }

    public void setShowRange(@NonNull int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 67496, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 67496, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.showRange.setValue(Integer.valueOf(i));
    }
}
