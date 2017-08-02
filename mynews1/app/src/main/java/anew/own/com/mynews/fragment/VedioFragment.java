package anew.own.com.mynews.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import anew.own.com.mynews.R;

/**
 * Created by zhangyibo on 2017/7/27.
 */

public class VedioFragment extends BaseFragment {

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.vedio_fragment,null,false);
        return view;
    }


    @Override
    public void initData() {
        super.initData();
    }
}
