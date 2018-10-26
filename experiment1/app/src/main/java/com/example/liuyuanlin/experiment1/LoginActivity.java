package com.example.liuyuanlin.experiment1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
    private EditText username, password;
    private Button login;

    /**
     * 获取login页面中的信息
     */
    public void init(){
        username = (EditText) findViewById(R.id.edit_account);
        password = (EditText) findViewById(R.id.edit_password);
        login = (Button) findViewById(R.id.button_login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //显示自己的UI页面
        setContentView(R.layout.activity_main);
        init();
    }
}
