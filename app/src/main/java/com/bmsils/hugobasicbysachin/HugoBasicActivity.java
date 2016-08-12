package com.bmsils.hugobasicbysachin;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hugo.weaving.DebugLog;

public class HugoBasicActivity extends AppCompatActivity {

    @Bind(R.id.hugoBasicActivityToolbar)
    Toolbar hugoBasicActivityToolbar;

    @Bind(R.id.hugoBasicActivityFirstNumberTILEditText)
    TextInputEditText hugoBasicActivityFirstNumberTILEditText;

    @Bind(R.id.hugoBasicActivitySecondNumberTILEditText)
    TextInputEditText hugoBasicActivitySecondNumberTILEditText;

    @Bind(R.id.hugoBasicActivityAddButton)
    Button hugoBasicActivityAddButton;

    int num1, num2 = 0;

    int sum = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hugo_basic);
        ButterKnife.bind(this);
        setSupportActionBar(hugoBasicActivityToolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This Project is the property of Sachin", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @OnClick(R.id.hugoBasicActivityAddButton)
    public void hugoBasicActivityAddButtonClicked() {

        num1 = Integer.parseInt(hugoBasicActivityFirstNumberTILEditText.getText().toString());
        num2 = Integer.parseInt(hugoBasicActivitySecondNumberTILEditText.getText().toString());
        getSum(num1, num2);
        Toast.makeText(HugoBasicActivity.this, "sum is :" + sum, Toast.LENGTH_SHORT).show();
    }

    @DebugLog
    private int getSum(int firstNum, int secondNum) {
        sum = firstNum + secondNum;
        return sum;
    }

}
