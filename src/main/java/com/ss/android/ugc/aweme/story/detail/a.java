package com.ss.android.ugc.aweme.story.detail;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.story.api.b.a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f72348a;

    /* renamed from: b  reason: collision with root package name */
    public C0754a f72349b;

    /* renamed from: c  reason: collision with root package name */
    public a.b f72350c;

    /* renamed from: com.ss.android.ugc.aweme.story.detail.a$a  reason: collision with other inner class name */
    public enum C0754a {
        STATE_SUCCESS,
        STATE_FAIL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public a(String str, C0754a aVar) {
        this(str, aVar, a.b.OTHER_ERROR);
    }

    public a(String str, C0754a aVar, a.b bVar) {
        this.f72348a = str;
        this.f72349b = aVar;
        this.f72350c = bVar;
    }
}
