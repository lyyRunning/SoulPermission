package com.function.luo.soulpermission.guide;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.function.luo.soulpermission.R;
import com.function.luo.soulpermission.utils.ApiGuideUtils;


/**
 * if your project based on Activity
 */
public class ApiGuideActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_api_guide);
        Toast.makeText(this, "use permission Based on Activity", Toast.LENGTH_SHORT).show();
        findViewById(R.id.checkSinglePermission)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.checkSinglePermission(v);
                    }
                });
        findViewById(R.id.requestSinglePermission)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.requestSinglePermission(v);
                    }
                });
        findViewById(R.id.requestPermissions)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.requestPermissions(v);
                    }
                });
        findViewById(R.id.requestSinglePermissionWithRationale)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.requestSinglePermissionWithRationale(v);
                    }
                });
        findViewById(R.id.checkNotification)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.checkNotification(v);
                    }
                });
        findViewById(R.id.checkAndRequestNotification)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.checkAndRequestNotification(v);
                    }
                });
        findViewById(R.id.checkAndRequestSystemAlert)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.checkAndRequestSystemAlert(v);
                    }
                });
        findViewById(R.id.checkAndRequestUnKnownSource)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.checkAndRequestUnKnownSource(v);
                    }
                });
        findViewById(R.id.goApplicationSettings)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.goApplicationSettings(v);
                    }
                });
        findViewById(R.id.getTopActivity)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ApiGuideUtils.getTopActivity(v);
                    }
                });
    }
}
