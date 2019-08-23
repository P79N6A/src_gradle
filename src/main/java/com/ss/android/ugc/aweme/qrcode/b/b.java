package com.ss.android.ugc.aweme.qrcode.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.qrcode.b.a;
import java.util.List;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f63351c;

    public b(a.C0684a aVar) {
        super(aVar);
    }

    public final boolean a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f63351c, false, 70405, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f63351c, false, 70405, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        List<String> a2 = k.a(str);
        if (a2.size() != 2 || !TextUtils.equals(a2.get(0), "share") || !TextUtils.equals(a2.get(1), "billboard")) {
            return false;
        }
        String b2 = k.b(str, "id");
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        switch (Integer.parseInt(b2)) {
            case 0:
                this.f63349a = "hot_search_board";
                break;
            case 1:
                this.f63349a = "hot_search_video_board";
                break;
            case 2:
                this.f63349a = "hot_search_music_board";
                break;
        }
        return this.f63350b.a(10, null, str, i);
    }
}
