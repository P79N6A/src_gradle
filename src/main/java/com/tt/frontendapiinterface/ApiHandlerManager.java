package com.tt.frontendapiinterface;

import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.util.ArrayList;
import java.util.List;

public class ApiHandlerManager {
    List<ApiHandler> activityResultApiHandler;
    private ApiHandler extResultHandler;

    static class Holder {
        static ApiHandlerManager apiHandlerManager = new ApiHandlerManager();

        Holder() {
        }
    }

    @AnyProcess
    public static ApiHandlerManager getInst() {
        return Holder.apiHandlerManager;
    }

    @AnyProcess
    public List<ApiHandler> getActivityResultApiHandler() {
        return this.activityResultApiHandler;
    }

    @MiniAppProcess
    public ApiHandler getExtResultHandler() {
        return this.extResultHandler;
    }

    @AnyProcess
    public void unRegisterActivityResultAllHandler() {
        this.activityResultApiHandler.clear();
    }

    private ApiHandlerManager() {
        this.activityResultApiHandler = new ArrayList();
    }

    @MiniAppProcess
    public void setExtResultHandler(ApiHandler apiHandler) {
        this.extResultHandler = apiHandler;
    }

    @AnyProcess
    public void registerActivityResultApiHandler(ApiHandler apiHandler) {
        if (apiHandler != null) {
            this.activityResultApiHandler.add(apiHandler);
        }
    }

    @AnyProcess
    public void unregisterActivityResultApiHandler(ApiHandler apiHandler) {
        this.activityResultApiHandler.remove(apiHandler);
    }
}
