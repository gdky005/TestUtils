package team.zhuoke.utilslibrary;

/**
 * 这是我的工具类，测试使用
 *
 * Created by WangQing on 2016/12/2.
 */

public class Log {

    /**
     * log 关键字
     */
    private static final String TAG = "Log";

    /**
     * 写一个文档注释
     * @param text
     */
    public static void wangqing(String text) {
        // 写一个 注释而已，没别的
        android.util.Log.i(TAG, "wangqing-》log：" + text);
    }
}
