package com.ss.android.ugc.aweme.translation.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74969a;
    @SerializedName("translation_info")

    /* renamed from: b  reason: collision with root package name */
    public List<C0783a> f74970b = new ArrayList();
    @SerializedName("trg_lang")

    /* renamed from: c  reason: collision with root package name */
    public String f74971c;

    /* renamed from: com.ss.android.ugc.aweme.translation.model.a$a  reason: collision with other inner class name */
    public class C0783a {
        @SerializedName("src_content")

        /* renamed from: a  reason: collision with root package name */
        public String f74972a;

        public C0783a(String str) {
            this.f74972a = str;
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f74969a, false, 87292, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f74969a, false, 87292, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f74970b.add(new C0783a(str));
    }
}
