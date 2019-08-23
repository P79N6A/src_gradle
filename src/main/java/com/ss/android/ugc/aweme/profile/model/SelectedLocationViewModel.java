package com.ss.android.ugc.aweme.profile.model;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.profile.d.w;
import java.util.ArrayList;

public class SelectedLocationViewModel extends ViewModel {
    public MutableLiveData<ArrayList<w>> selectedLocation = new MutableLiveData<>();

    public SelectedLocationViewModel() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new w());
        }
        this.selectedLocation.setValue(arrayList);
    }
}
