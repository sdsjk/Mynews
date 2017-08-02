package anew.own.com.mynews.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import anew.own.com.mynews.R;
import anew.own.com.mynews.fragment.BaseFragment;
import anew.own.com.mynews.fragment.DuanziFragment;
import anew.own.com.mynews.fragment.IndexFragment;
import anew.own.com.mynews.fragment.PictureFragmnet;
import anew.own.com.mynews.fragment.VedioFragment;
import anew.own.com.mynews.uitils.ToastUtil;

import static android.R.attr.baseline;
import static android.R.attr.fragment;

public class MainActivity extends BaseActivity {
    private FrameLayout frament;
    private RadioGroup radioGroup;
    private RadioButton rbShouye;
    private RadioButton rbTupian;
    private RadioButton rbShipin;
    private RadioButton rbDuanzi;
    private BaseFragment baseFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        intlister();

    }

    private void intlister() {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                baseFragment=null;
                switch (checkedId){
                    case R.id.rb_shouye :
                        Log.e("TAG","shouye");
//                        ToastUtil.showToast(MainActivity.this,"shouye");
                        baseFragment=new IndexFragment();
                        break;

                    case R.id.rb_tupian:
//                        ToastUtil.showToast(MainActivity.this,"图片");
                         Log.e("TAG","tupian");
                        baseFragment=new PictureFragmnet();
                    break;
                    case R.id.rb_shipin:
                        Log.e("TAG","shipin");
//                        ToastUtil.showToast(MainActivity.this,"视频");
                        baseFragment=new VedioFragment();
                    break;
                    case R.id.rb_duanzi:
                        Log.e("TAG","duanzi");
//                        ToastUtil.showToast(MainActivity.this,"段子");
                        baseFragment=new DuanziFragment();

                    break;
                }


                showData(baseFragment);

            }
        });

    }

    private void showData(BaseFragment baseFragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frament,baseFragment).commit();
    }

    private void init() {
        frament = (FrameLayout) findViewById(R.id.frament);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        rbShouye = (RadioButton) findViewById(R.id.rb_shouye);
        rbTupian = (RadioButton) findViewById(R.id.rb_tupian);
        rbShipin = (RadioButton) findViewById(R.id.rb_shipin);
        rbDuanzi = (RadioButton) findViewById(R.id.rb_duanzi);
        radioGroup.check(R.id.rb_shouye);
        showData(new IndexFragment());

    }


}
