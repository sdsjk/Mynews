package anew.own.com.mynews.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;

import anew.own.com.mynews.R;
import anew.own.com.mynews.uitils.UrlUtils;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.BufferedSink;

/**
 * Created by zhangyibo on 2017/7/27.
 */

public class PictureFragmnet extends BaseFragment {
    private RecyclerView picRecylerview;
    OkHttpClient okHttpClient;



    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.picture_fragment,null,false);
        picRecylerview = (RecyclerView)view.findViewById(R.id.pic_recylerview);
        return view;
    }


    @Override
    public void initData() {
        getDataFromNet();
    }

    private void getDataFromNet() {
         


    }
}
