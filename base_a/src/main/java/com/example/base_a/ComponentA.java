package com.example.base_a;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.CCUtil;
import com.billy.cc.core.component.IComponent;

/**
 * Created by heyueyang on 2019/4/18
 */
public class ComponentA implements IComponent {
    @Override
    public String getName() {
        return "base_a.ComponentA";
    }

    @Override
    public boolean onCall(CC cc) {
        String actionName = cc.getActionName();
        switch (actionName) {
            case "showTest":
                showTest(cc);
                break;
            default:
                break;
        }
        return false;
    }

    private void showTest(CC cc) {
        CCUtil.navigateTo(cc, TestShowActivity.class);
        CC.sendCCResult(cc.getCallId(), CCResult.success());
    }


}
