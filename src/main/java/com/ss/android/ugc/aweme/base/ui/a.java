package com.ss.android.ugc.aweme.base.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public abstract class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34993a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f34994b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f34995c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f34996d;

    /* renamed from: e  reason: collision with root package name */
    protected Aweme f34997e;

    /* renamed from: f  reason: collision with root package name */
    protected int f34998f;
    protected int g;
    protected String h;
    protected Activity i;
    protected JSONObject j;
    protected int k;
    public boolean l;
    protected boolean m;
    protected String n = "list";

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f34993a, false, 24910, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34993a, false, 24910, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f34997e == null || this.f34997e.getOpenPlatformStruct() == null || TextUtils.isEmpty(this.f34997e.getOpenPlatformStruct().getName())) {
            return false;
        } else {
            return true;
        }
    }

    public void setFollowPageType(String str) {
        this.n = str;
    }

    public void setPageType(int i2) {
        this.k = i2;
    }

    public void setPoiTagVisible(boolean z) {
        this.l = z;
    }

    public void setRequestId(JSONObject jSONObject) {
        this.j = jSONObject;
    }

    public a(Context context) {
        super(context);
    }

    public a(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
