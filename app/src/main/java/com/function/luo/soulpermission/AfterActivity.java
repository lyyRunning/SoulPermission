package com.function.luo.soulpermission;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.function.luo.soulpermission.utils.Utils;
import com.function.luo.soulpermission.utils.UtilsWithPermission;


public class AfterActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_CONTACT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        /**
         * 拨打电话
         */
        findViewById(R.id.bt_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UtilsWithPermission.makeCall(AfterActivity.this, "10086");
            }
        });

        /**
         * 选择联系人
         */
        findViewById(R.id.bt_choose_contact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UtilsWithPermission.chooseContact(AfterActivity.this, REQUEST_CODE_CONTACT);
            }
        });

        /**
         * 去读电话状态
         */
        findViewById(R.id.bt_read_phone_status).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilsWithPermission.readPhoneStatus();
            }
        });
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                //读取联人返回状态
                case REQUEST_CODE_CONTACT:
                    Utils.onGetChooseContactData(AfterActivity.this, data, new Utils.ReadContactListener() {
                        @Override
                        public void onSuccess(Utils.ContactInfo contactInfo) {
                            Toast.makeText(AfterActivity.this, contactInfo.toString(), Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailed() {
                            Toast.makeText(AfterActivity.this, "失败了", Toast.LENGTH_SHORT).show();

                        }
                    });
                    break;
                default:
                    break;
            }
        }
    }
}
