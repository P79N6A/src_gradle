package com.tt.frontendapiinterface;

import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.util.List;

@MiniAppProcess
public interface IActivityLife {
    @MiniAppProcess
    List<String> getCurrentPageInfo();

    @MiniAppProcess
    int getCurrentPageSize();

    @MiniAppProcess
    void goback();

    @MiniAppProcess
    boolean isTabFragment();

    @MiniAppProcess
    void registerBackPressedListener(IBackPressedListener iBackPressedListener);

    @MiniAppProcess
    void registerKeyboardListener(IKeyboardObserver iKeyboardObserver);

    @MiniAppProcess
    void setKeepScreenOn(boolean z);

    @MiniAppProcess
    void unRegisterBackPressedLinstener(IBackPressedListener iBackPressedListener);

    @MiniAppProcess
    void unRegisterKeyboardListener(IKeyboardObserver iKeyboardObserver);
}
