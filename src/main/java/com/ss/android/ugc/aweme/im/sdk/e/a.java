package com.ss.android.ugc.aweme.im.sdk.e;

import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LineHeightSpan;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.im.sdk.chat.e;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51430a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.e.a$a  reason: collision with other inner class name */
    public static class C0600a implements LineHeightSpan {

        /* renamed from: a  reason: collision with root package name */
        int f51431a;

        /* renamed from: b  reason: collision with root package name */
        int f51432b;

        /* renamed from: c  reason: collision with root package name */
        int f51433c;

        /* renamed from: d  reason: collision with root package name */
        int f51434d;

        /* renamed from: e  reason: collision with root package name */
        int f51435e;

        C0600a(int i, int i2, int i3) {
            this.f51431a = i;
            this.f51434d = i2;
            this.f51435e = i3;
        }

        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            if (this.f51432b == 0 && this.f51433c == 0) {
                this.f51432b = fontMetricsInt.ascent;
                this.f51433c = fontMetricsInt.ascent - this.f51431a;
            }
            if (i == this.f51434d) {
                fontMetricsInt.ascent = this.f51433c;
            } else {
                fontMetricsInt.ascent = this.f51432b;
            }
        }
    }

    public static void a(@NonNull TextView textView, @NonNull String str, Map<String, EPlatformCardContent.LinkItem> map, String str2, long j, int i) {
        boolean z;
        TextView textView2 = textView;
        Map<String, EPlatformCardContent.LinkItem> map2 = map;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{textView2, str, map2, str2, new Long(j2), Integer.valueOf(i)}, null, f51430a, true, 52058, new Class[]{TextView.class, String.class, Map.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, str, map2, str2, new Long(j2), Integer.valueOf(i)}, null, f51430a, true, 52058, new Class[]{TextView.class, String.class, Map.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (map2 == null || map.isEmpty()) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = 0;
            textView.setText(str);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = (int) UIUtils.dip2Px(textView.getContext(), 5.0f);
            ArrayList<Pair> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>(map.keySet());
            Collections.sort(arrayList2);
            String str3 = str;
            for (String str4 : arrayList2) {
                EPlatformCardContent.LinkItem linkItem = map2.get(str4);
                String str5 = "{{" + str4 + "}}";
                int indexOf = str3.indexOf(str5);
                if (linkItem != null) {
                    arrayList.add(new Pair(Integer.valueOf(indexOf), linkItem));
                    str3 = str3.replace(str5, linkItem.name);
                }
            }
            SpannableString spannableString = new SpannableString(str3);
            for (Pair pair : arrayList) {
                if (((EPlatformCardContent.LinkItem) pair.second).extraParams == null || !TextUtils.equals(((EPlatformCardContent.LinkItem) pair.second).extraParams.showMoreButton, PushConstants.PUSH_TYPE_NOTIFY)) {
                    z = true;
                } else {
                    z = false;
                }
                e.a aVar = r1;
                e.a aVar2 = new e.a(textView.getContext(), str2, j, (EPlatformCardContent.LinkItem) pair.second, i, z);
                b.a(spannableString, aVar, ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((EPlatformCardContent.LinkItem) pair.second).name.length(), 33);
                b.a(spannableString, new C0600a((int) UIUtils.dip2Px(textView.getContext(), 12.0f), ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((EPlatformCardContent.LinkItem) pair.second).name.length()), ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((EPlatformCardContent.LinkItem) pair.second).name.length(), 33);
                long j3 = j;
            }
            textView2.setText(spannableString);
        }
    }
}
