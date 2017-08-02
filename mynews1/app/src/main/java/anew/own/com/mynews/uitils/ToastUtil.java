package anew.own.com.mynews.uitils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhangyibo on 2017/7/24.
 */

public class ToastUtil {
    private static Toast toast;

    /**
     * 显示字符串
     * @param context
     * @param content
     */
    public static void  showToast(Context context, String content){
        if(toast==null){
            toast=Toast.makeText(context,content,Toast.LENGTH_SHORT);
        }else {
            toast.setText(content);
        }
        toast.show();
    }

    /**
     * 显示非字符串
     * @param context
     * @param content
     */
    public static void showToast(Context context,int content){
        if(toast==null){
            toast=Toast.makeText(context,content+"",Toast.LENGTH_SHORT);
        }else {
            toast.setText(content+"");
        }
        toast.show();
    }
}
