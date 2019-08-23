package com.tt.option.permission;

import com.tt.miniapphost.permission.AppbrandPermissionType;
import com.tt.miniapphost.process.annotation.MiniAppProcess;

public interface HostOptionPermissionDepend {
    @MiniAppProcess
    PermissionCustomDialogMsgEntity getPermissionCustomDialogMsgEntity();

    @MiniAppProcess
    void savePermissionGrant(AppbrandPermissionType appbrandPermissionType, boolean z);
}
