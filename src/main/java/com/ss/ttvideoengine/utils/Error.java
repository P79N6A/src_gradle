package com.ss.ttvideoengine.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;

public class Error {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public String description;
    public String domain;
    public int internalCode;

    private boolean needRestartPlayer() {
        if (this.code == -499999 || this.code == -499997 || this.code == -499996 || this.code == -499992 || this.code == -499991 || this.code == -499990 || this.code == -499989) {
            return true;
        }
        return false;
    }

    private boolean needChangeURL() {
        if (this.code == -499988 || this.code == -499987 || this.code == -499986 || this.code == -499985 || this.code == -499899 || this.code == -499898 || this.code == -499897 || this.code == -499896 || this.code == -499894 || this.code == -499893 || this.code == -499891 || this.code == 251658241 || this.code == -499799 || this.code == -499795 || this.code == -499794 || this.code == -499793 || this.code == -499792) {
            return true;
        }
        return false;
    }

    public int getRetryStrategy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91576, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91576, new Class[0], Integer.TYPE)).intValue();
        } else if (this.domain.equals("kTTVideoErrorDomainHTTPDNS") || this.domain.equals("kTTVideoErrorDomainLocalDNS")) {
            return 2;
        } else {
            if (this.domain.equals("kTTVideoErrorDomainFetchingInfo")) {
                return 1;
            }
            if (!this.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") || needChangeURL() || !needRestartPlayer()) {
                return 2;
            }
            return 3;
        }
    }

    public int getType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91575, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91575, new Class[0], Integer.TYPE)).intValue();
        } else if (this.domain.equals("kTTVideoErrorDomainFetchingInfo")) {
            return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        } else {
            if (this.domain.equals("kTTVideoErrorDomainLocalDNS") || this.domain.equals("kTTVideoErrorDomainHTTPDNS")) {
                return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
            }
            if (!this.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") || !needRestartPlayer()) {
                return 1003;
            }
            return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
        }
    }

    public HashMap toMap() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91574, new Class[0], HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91574, new Class[0], HashMap.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("domain", this.domain);
        hashMap.put("code", Integer.valueOf(this.code));
        if (this.internalCode != 0) {
            hashMap.put("internalCode", Integer.valueOf(this.internalCode));
        }
        if (this.description != null) {
            hashMap.put("description", this.description);
        }
        return hashMap;
    }

    public String toString() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91573, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91573, new Class[0], String.class);
        }
        Object[] objArr = new Object[4];
        objArr[0] = this.domain;
        objArr[1] = Integer.valueOf(this.code);
        objArr[2] = Integer.valueOf(this.internalCode);
        if (this.description != null) {
            str = this.description;
        } else {
            str = "";
        }
        objArr[3] = str;
        return String.format("domain:%s, code:%d, internalCode:%d, description:%s", objArr);
    }

    public Error(String str, int i) {
        this(str, i, 0);
    }

    public Error(String str, int i, int i2) {
        this(str, i, i2, null);
    }

    public Error(String str, int i, String str2) {
        this(str, i, 0, str2);
    }

    public Error(String str, int i, int i2, String str2) {
        this.domain = str;
        this.code = i;
        this.internalCode = i2;
        this.description = str2;
    }
}
