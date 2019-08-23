package com.zhihu.matisse.internal.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.entity.d;
import java.util.ArrayList;
import java.util.List;

public class SelectedPreviewActivity extends BasePreviewActivity {
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!d.a().q) {
            setResult(0);
            finish();
            return;
        }
        ArrayList parcelableArrayList = getIntent().getBundleExtra("extra_default_bundle").getParcelableArrayList("state_selection");
        this.f82675d.a((List<c>) parcelableArrayList);
        this.f82675d.notifyDataSetChanged();
        if (this.f82673b.f82651f) {
            this.f82676e.setCheckedNum(1);
        } else {
            this.f82676e.setChecked(true);
        }
        this.i = 0;
        a((c) parcelableArrayList.get(0));
    }
}
