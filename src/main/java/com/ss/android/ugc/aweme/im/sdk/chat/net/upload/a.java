package com.ss.android.ugc.aweme.im.sdk.chat.net.upload;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.utils.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a extends UrlModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("md5")
    String md5;
    @SerializedName("oid")
    String oid;
    @SerializedName("skey")
    String skey;

    public String getMd5() {
        return this.md5;
    }

    public String getOid() {
        return this.oid;
    }

    public String getSkey() {
        return this.skey;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setOid(String str) {
        this.oid = str;
    }

    public void setSkey(String str) {
        this.skey = str;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 51326, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 51326, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!TextUtils.equals(this.oid, aVar.oid) || !TextUtils.equals(this.skey, aVar.skey) || !TextUtils.equals(this.md5, aVar.md5)) {
                return false;
            }
            return true;
        }
    }

    public static UrlModel convert(a aVar) {
        v.a aVar2;
        List list;
        String str;
        a aVar3 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar3}, null, changeQuickRedirect, true, 51327, new Class[]{a.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{aVar3}, null, changeQuickRedirect, true, 51327, new Class[]{a.class}, UrlModel.class);
        }
        String str2 = null;
        if (aVar3 == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        String str3 = aVar3.oid;
        String str4 = aVar3.skey;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, v.f52659a, true, 53502, new Class[]{String.class, String.class}, v.a.class)) {
            aVar2 = (v.a) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, v.f52659a, true, 53502, new Class[]{String.class, String.class}, v.a.class);
        } else {
            List<String> list2 = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().i;
            if (list2 == null || list2.size() <= 0) {
                aVar2 = new v.a(Arrays.asList(v.f52660b), str3, str4, (byte) 0);
            } else {
                if (list2.size() < 3) {
                    int size = 3 - list2.size();
                    int i = 0;
                    while (i < v.f52660b.length && i < size) {
                        list2.add(v.f52660b[i]);
                        i++;
                    }
                }
                aVar2 = new v.a(list2, str3, str4, (byte) 0);
            }
        }
        if (PatchProxy.isSupport(new Object[0], aVar2, v.a.f52661a, false, 53503, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], aVar2, v.a.f52661a, false, 53503, new Class[0], List.class);
        } else {
            list = new ArrayList();
            String a2 = aVar2.a();
            if (aVar2.f52664b != null && aVar2.f52664b.size() > 0) {
                for (int i2 = 0; i2 < aVar2.f52664b.size(); i2++) {
                    list.add(aVar2.f52664b.get(i2) + a2);
                }
            }
        }
        urlModel.setUrlList(list);
        if (PatchProxy.isSupport(new Object[0], aVar2, v.a.f52661a, false, 53504, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], aVar2, v.a.f52661a, false, 53504, new Class[0], String.class);
        } else {
            String a3 = aVar2.a();
            if (aVar2.f52664b != null && aVar2.f52664b.size() > 0) {
                str2 = aVar2.f52664b.get(0) + a3;
            }
            str = str2;
        }
        urlModel.setUri(str);
        return urlModel;
    }
}
