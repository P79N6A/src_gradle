package com.tt.option;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.ext.AbstractHostOptionApiDepend;
import com.tt.option.ext.AbstractHostOptionModuleExtDepend;
import com.tt.option.ext.AbstractHostOptionNativeViewExtDepend;
import com.tt.option.ext.HostOptionApiDepend;
import com.tt.option.ext.HostOptionModuleExtDepend;
import com.tt.option.ext.HostOptionNativeViewExtDepend;
import com.tt.option.hostdata.AbstractHostOptionDataHandlerDepend;
import com.tt.option.hostdata.HostOptionCallHandlerDepend;
import com.tt.option.logger.AbstractHostOptionLoggerDepend;
import com.tt.option.logger.HostOptionLoggerDepend;
import com.tt.option.media.AbstractHostOptionMediaDepend;
import com.tt.option.media.HostOptionMediaDepend;
import com.tt.option.menu.AbstractHostOptionMenuDepend;
import com.tt.option.menu.HostOptionMenuDepend;
import com.tt.option.net.AbstractHostOptionNetDepend;
import com.tt.option.net.HostOptionNetDepend;
import com.tt.option.others.AbstractHostOptionNormalDepend;
import com.tt.option.others.HostOptionNormalDepend;
import com.tt.option.permission.AbstractHostOptionPermissionDepend;
import com.tt.option.permission.HostOptionPermissionDepend;
import com.tt.option.router.AbstractHostOptionRouterDepend;
import com.tt.option.router.HostOptionRouterDepend;
import com.tt.option.scene.AbstractHostOptionSceneDepend;
import com.tt.option.scene.HostOptionSceneDepend;
import com.tt.option.share.AbstractHostOptionShareDepend;
import com.tt.option.share.HostOptionShareDepend;
import com.tt.option.ui.AbstractHostOptionUiDepend;
import com.tt.option.ui.HostOptionUiDepend;

public class HostOptionDependRegister {
    @NonNull
    private HostOptionApiDepend apiDepend = new AbstractHostOptionApiDepend();
    @NonNull
    private HostOptionCallHandlerDepend dataHandlerDepend = new AbstractHostOptionDataHandlerDepend();
    @Nullable
    private HostOptionLowPriorityDepend hostOptionLowPriorityDepend;
    @NonNull
    private HostOptionLoggerDepend loggerDepend = new AbstractHostOptionLoggerDepend();
    @NonNull
    private HostOptionMediaDepend mediaDepend = new AbstractHostOptionMediaDepend();
    @NonNull
    private HostOptionMenuDepend menuDepend = new AbstractHostOptionMenuDepend();
    @NonNull
    private HostOptionModuleExtDepend moduleExtDepend = new AbstractHostOptionModuleExtDepend();
    @NonNull
    private HostOptionNativeViewExtDepend nativeViewExtDepend = new AbstractHostOptionNativeViewExtDepend();
    @NonNull
    private HostOptionNetDepend netDepend = new AbstractHostOptionNetDepend();
    @NonNull
    private HostOptionNormalDepend normalDepend = new AbstractHostOptionNormalDepend();
    @NonNull
    private HostOptionPermissionDepend permissionDepend = new AbstractHostOptionPermissionDepend();
    @NonNull
    private HostOptionRouterDepend routerDepend = new AbstractHostOptionRouterDepend();
    @NonNull
    private HostOptionSceneDepend sceneDepend = new AbstractHostOptionSceneDepend();
    @NonNull
    private HostOptionShareDepend shareDepend = new AbstractHostOptionShareDepend();
    @NonNull
    private HostOptionUiDepend uiDepend = new AbstractHostOptionUiDepend();

    @AnyProcess
    @NonNull
    public HostOptionApiDepend getApiDepend() {
        return this.apiDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionCallHandlerDepend getDataHandlerDepend() {
        return this.dataHandlerDepend;
    }

    @Nullable
    @AnyProcess
    public HostOptionLowPriorityDepend getHostOptionLowPriorityDepend() {
        return this.hostOptionLowPriorityDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionLoggerDepend getLoggerDepend() {
        return this.loggerDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionMediaDepend getMediaDepend() {
        return this.mediaDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionMenuDepend getMenuDepend() {
        return this.menuDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionModuleExtDepend getModuleExtDepend() {
        return this.moduleExtDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionNativeViewExtDepend getNativeViewExtDepend() {
        return this.nativeViewExtDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionNetDepend getNetDepend() {
        return this.netDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionNormalDepend getNormalDepend() {
        return this.normalDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionPermissionDepend getPermissionDepend() {
        return this.permissionDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionRouterDepend getRouterDepend() {
        return this.routerDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionSceneDepend getSceneDepend() {
        return this.sceneDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionShareDepend getShareDepend() {
        return this.shareDepend;
    }

    @AnyProcess
    @NonNull
    public HostOptionUiDepend getUiDepend() {
        return this.uiDepend;
    }

    @AnyProcess
    public HostOptionDependRegister setApiDepend(@NonNull AbstractHostOptionApiDepend abstractHostOptionApiDepend) {
        this.apiDepend = abstractHostOptionApiDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setDataHandlerDepend(@NonNull AbstractHostOptionDataHandlerDepend abstractHostOptionDataHandlerDepend) {
        this.dataHandlerDepend = abstractHostOptionDataHandlerDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setHostOptionLowPriorityDepend(@NonNull HostOptionLowPriorityDepend hostOptionLowPriorityDepend2) {
        this.hostOptionLowPriorityDepend = hostOptionLowPriorityDepend2;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setLoggerDepend(@NonNull AbstractHostOptionLoggerDepend abstractHostOptionLoggerDepend) {
        this.loggerDepend = abstractHostOptionLoggerDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setMediaDepend(@NonNull AbstractHostOptionMediaDepend abstractHostOptionMediaDepend) {
        this.mediaDepend = abstractHostOptionMediaDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setMenuDepend(@NonNull AbstractHostOptionMenuDepend abstractHostOptionMenuDepend) {
        this.menuDepend = abstractHostOptionMenuDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setModuleExtDepend(@NonNull AbstractHostOptionModuleExtDepend abstractHostOptionModuleExtDepend) {
        this.moduleExtDepend = abstractHostOptionModuleExtDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setNativeViewExtDepend(@NonNull AbstractHostOptionNativeViewExtDepend abstractHostOptionNativeViewExtDepend) {
        this.nativeViewExtDepend = abstractHostOptionNativeViewExtDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setNetDepend(@NonNull AbstractHostOptionNetDepend abstractHostOptionNetDepend) {
        this.netDepend = abstractHostOptionNetDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setNormalDepend(@NonNull AbstractHostOptionNormalDepend abstractHostOptionNormalDepend) {
        this.normalDepend = abstractHostOptionNormalDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setPermissionDepend(@NonNull AbstractHostOptionPermissionDepend abstractHostOptionPermissionDepend) {
        this.permissionDepend = abstractHostOptionPermissionDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setRouterDepend(@NonNull AbstractHostOptionRouterDepend abstractHostOptionRouterDepend) {
        this.routerDepend = abstractHostOptionRouterDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setSceneDepend(@NonNull AbstractHostOptionSceneDepend abstractHostOptionSceneDepend) {
        this.sceneDepend = abstractHostOptionSceneDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setShareDepend(@NonNull AbstractHostOptionShareDepend abstractHostOptionShareDepend) {
        this.shareDepend = abstractHostOptionShareDepend;
        return this;
    }

    @AnyProcess
    public HostOptionDependRegister setUiDepend(@NonNull AbstractHostOptionUiDepend abstractHostOptionUiDepend) {
        this.uiDepend = abstractHostOptionUiDepend;
        return this;
    }
}
