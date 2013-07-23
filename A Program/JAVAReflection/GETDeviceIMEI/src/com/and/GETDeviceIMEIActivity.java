package com.and;

import java.lang.reflect.Method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class GETDeviceIMEIActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String imei1 = getDeviceIdBySlot(this, 0);
        String imei2 = getDeviceIdBySlot(this, 1);

        TextView tv = (TextView) findViewById(R.id.tv);
        boolean isDualSIM = !(imei1.equals(imei2));
        tv.setText(" IME1 : " + imei1 + "\n IME2 : " + imei2 + "\n IS DUAL SIM : " + isDualSIM);
    }

    public String getDeviceIdBySlot(Context context, int slotID){
        String imei = null;
        TelephonyManager telephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        try{
            Class<?> telephonyClass = Class.forName(telephony.getClass().getName());
            Class<?>[] parameter = new Class[1];
            parameter[0] = int.class;
            Method getSimStateGemini = telephonyClass.getMethod("getDeviceIdGemini", parameter);
            Object[] obParameter = new Object[1];
            obParameter[0] = slotID;
            Object ob_phone = getSimStateGemini.invoke(telephony, obParameter);
            if(ob_phone != null){
                imei = ob_phone.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return telephony.getDeviceId();
        }
        return imei;
    }
}