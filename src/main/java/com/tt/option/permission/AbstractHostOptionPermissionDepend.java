package com.tt.option.permission;

import com.tt.miniapphost.permission.AppbrandPermissionType;
import com.tt.option.BaseAbstractHostDepend;

public class AbstractHostOptionPermissionDepend extends BaseAbstractHostDepend<HostOptionPermissionDepend> implements HostOptionPermissionDepend {
    public String getImplClassName() {
        return "HostOptionPermissionDependImpl";
    }

    public PermissionCustomDialogMsgEntity getPermissionCustomDialogMsgEntity() {
        if (inject()) {
            return ((HostOptionPermissionDepend) this.defaultOptionDepend).getPermissionCustomDialogMsgEntity();
        }
        return null;
    }

    public void savePermissionGrant(AppbrandPermissionType appbrandPermissionType, boolean z) {
        if (inject()) {
            ((HostOptionPermissionDepend) this.defaultOptionDepend).savePermissionGrant(appbrandPermissionType, z);
        }
    }
}
