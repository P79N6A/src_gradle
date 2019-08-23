package com.bytedance.ies.dmt.ui.common.rebranding;

import android.content.res.Resources;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

public final class c {
    public static int a(TextView textView, ArrayList<Integer> arrayList, int i, int i2) {
        Resources resources = textView.getResources();
        Iterator<Integer> it2 = arrayList.iterator();
        int i3 = -1;
        while (it2.hasNext()) {
            i3 = Math.max(i3, ((int) textView.getPaint().measureText(resources.getString(it2.next().intValue()))) + textView.getPaddingLeft() + textView.getPaddingRight());
        }
        if (i3 >= i) {
            i = i3;
        }
        if (i > i2) {
            return i2;
        }
        return i;
    }
}
