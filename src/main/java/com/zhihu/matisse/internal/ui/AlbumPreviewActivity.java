package com.zhihu.matisse.internal.ui;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.zhihu.matisse.internal.entity.a;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.entity.d;
import com.zhihu.matisse.internal.model.AlbumMediaCollection;
import com.zhihu.matisse.internal.ui.adapter.PreviewPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class AlbumPreviewActivity extends BasePreviewActivity implements AlbumMediaCollection.a {
    private AlbumMediaCollection l = new AlbumMediaCollection();
    private boolean m;

    public final void a() {
    }

    public void onDestroy() {
        super.onDestroy();
        this.l.a();
    }

    public final void a(Cursor cursor) {
        if (cursor != null) {
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                arrayList.add(c.a(cursor));
            }
            if (!arrayList.isEmpty()) {
                PreviewPagerAdapter previewPagerAdapter = (PreviewPagerAdapter) this.f82674c.getAdapter();
                previewPagerAdapter.a((List<c>) arrayList);
                previewPagerAdapter.notifyDataSetChanged();
                if (!this.m) {
                    this.m = true;
                    int indexOf = arrayList.indexOf((c) getIntent().getParcelableExtra("extra_item"));
                    this.f82674c.setCurrentItem(indexOf, false);
                    this.i = indexOf;
                }
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!d.a().q) {
            setResult(0);
            finish();
            return;
        }
        this.l.a((FragmentActivity) this, (AlbumMediaCollection.a) this);
        this.l.a((a) getIntent().getParcelableExtra("extra_album"), false);
        c cVar = (c) getIntent().getParcelableExtra("extra_item");
        if (this.f82673b.f82651f) {
            this.f82676e.setCheckedNum(this.f82672a.e(cVar));
        } else {
            this.f82676e.setChecked(this.f82672a.c(cVar));
        }
        a(cVar);
    }
}
