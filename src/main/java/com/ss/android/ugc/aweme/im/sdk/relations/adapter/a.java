package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;

public class a implements SectionIndexer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52106a;

    /* renamed from: b  reason: collision with root package name */
    private String[] f52107b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f52108c;

    /* renamed from: d  reason: collision with root package name */
    private int f52109d;

    public Object[] getSections() {
        return this.f52107b;
    }

    public int getPositionForSection(int i) {
        if (i < 0 || i >= this.f52107b.length) {
            return -1;
        }
        return this.f52108c[i];
    }

    public int getSectionForPosition(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52106a, false, 52893, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52106a, false, 52893, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i < 0 || i >= this.f52109d) {
            return -1;
        } else {
            int binarySearch = Arrays.binarySearch(this.f52108c, i);
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return (-binarySearch) - 2;
        }
    }

    public a(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f52107b = strArr;
        this.f52108c = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (TextUtils.isEmpty(this.f52107b[i2])) {
                this.f52107b[i2] = " ";
            } else if (!this.f52107b[i2].equals(" ")) {
                String[] strArr2 = this.f52107b;
                strArr2[i2] = strArr2[i2].trim();
            }
            this.f52108c[i2] = i;
            i += iArr[i2];
        }
        this.f52109d = i;
    }
}
