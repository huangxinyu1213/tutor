package com.tutor.qcloud;

import com.tutor.core.AppInit;
import com.tutor.log.AppLog;
import org.json.JSONException;

import com.qcloud.weapp.ConfigurationManager;
import com.qcloud.weapp.ConfigurationException;

public class QCloud {

    public static void setupSDK() {
        try {
            String configFilePath = getConfigFilePath();
            AppLog.stdout("QCloud SDK file path：" + configFilePath);

            ConfigurationManager.setupFromFile(configFilePath);
            AppLog.stdout("QCloud SDK config success！");
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    private static String getConfigFilePath() {
        String defaultConfigFilePath = AppInit.run.getEnvironment().getProperty("app.sdk.path");
        return defaultConfigFilePath;
    }

}
