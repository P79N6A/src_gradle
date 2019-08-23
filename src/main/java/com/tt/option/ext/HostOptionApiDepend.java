package com.tt.option.ext;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public interface HostOptionApiDepend {

    public interface ExtApiHandlerCreator {
        @AnyProcess
        ApiHandler create(String str, String str2, int i, ApiHandlerCallback apiHandlerCallback);
    }

    @AnyProcess
    ExtApiHandlerCreator createExtHandler();
}
