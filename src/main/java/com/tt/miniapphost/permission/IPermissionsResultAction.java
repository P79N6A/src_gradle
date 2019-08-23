package com.tt.miniapphost.permission;

import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public interface IPermissionsResultAction {
    @AnyProcess
    void onDenied(String str);

    @AnyProcess
    void onGranted();
}
