import java.util.HashMap;

/**
 * @author wyz
 * @create 2021-06-14 23:10
 */
public class Test {
    public static void main(String[] args) throws Exception {
        DouyinDownload douyinDownload = new DouyinDownload();
        String a = "5.69 PXM:/ %检方通报  北京市朝阳区人民检察院依法对犯罪嫌疑人吴某凡批准逮捕  https://v.douyin.com/dJdFRnu/ 复淛此链接，打鐦Dou吟搜索，直接观看视频！";
        douyinDownload.inUrl(a);
    }
}
