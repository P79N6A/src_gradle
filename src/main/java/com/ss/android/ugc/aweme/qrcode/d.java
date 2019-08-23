package com.ss.android.ugc.aweme.qrcode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String describe;
    public String enterFrom;
    public String hashTagName;
    public boolean isEnterprisePoi;
    public boolean isEnterpriseUser;
    public boolean isHashTag;
    public String objectId;
    public String title;
    public int type;
    public String webDes;
    public String webImage;
    public String webUrl;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63386a;

        /* renamed from: b  reason: collision with root package name */
        public d f63387b = new d((byte) 0);

        public final a a(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f63386a, false, 70361, new Class[]{String.class, Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f63386a, false, 70361, new Class[]{String.class, Long.TYPE}, a.class);
            }
            this.f63387b.title = str2;
            this.f63387b.describe = String.valueOf(j);
            return this;
        }

        public final a a(String str, String str2, boolean z) {
            this.f63387b.title = str;
            this.f63387b.describe = str2;
            this.f63387b.isEnterpriseUser = z;
            return this;
        }

        public final a a(int i, String str, String str2) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, this, f63386a, false, 70358, new Class[]{Integer.TYPE, String.class, String.class}, a.class)) {
                return a(i, str, false, "", str2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, this, f63386a, false, 70358, new Class[]{Integer.TYPE, String.class, String.class}, a.class);
        }

        public final a a(int i, String str, boolean z, String str2, String str3) {
            this.f63387b.type = i;
            this.f63387b.objectId = str;
            this.f63387b.isHashTag = z;
            this.f63387b.hashTagName = str2;
            this.f63387b.enterFrom = str3;
            return this;
        }
    }

    private d() {
    }

    public String getWebDes() {
        return this.webDes;
    }

    public String getWebImage() {
        return this.webImage;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setWebDes(String str) {
        this.webDes = str;
    }

    public void setWebImage(String str) {
        this.webImage = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public d(int i, String str, String str2) {
        this.type = i;
        this.objectId = str;
        this.hashTagName = "";
        this.enterFrom = str2;
    }

    public d(int i, String str, boolean z, String str2, String str3) {
        this.type = i;
        this.objectId = str;
        this.isHashTag = z;
        this.hashTagName = str2;
        this.enterFrom = str3;
    }
}
