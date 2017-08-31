package jp.co.android.testviewflipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;

public class ViewflipperTwoCommand extends MainActivity implements OnClickListener {

    private Activity activity = null;

//    private LinearLayout viewflipperTwoLayout = null;

    public void onCreate(Activity activity) {
        this.activity = activity;

//        viewflipperTwoLayout = (LinearLayout)activity.findViewById(R.id.viewflipper_two_layout_id);
    }
    
    public void onCreate(Bundle saveInstanceState, Activity activity) {
        onCreate(activity);
    }
    
    public void onResume() {}
    public void onPause() {}
    
    /**
     * Click event
     * @param view クリック時のViewオブジェクト
     */
//    public void onClick(View view) {
////        if(view == imageButton2_1) {
////            ((MainActivity)activity).toastShow("imageButton2_1", Toast.LENGTH_LONG);
////        } else if (view == imageButton2_2) {
////            ((MainActivity)activity).toastShow("imageButton2_2", Toast.LENGTH_LONG);
////        } else if (view == imageButton2_3) {
////            ((MainActivity)activity).toastShow("imageButton2_3", Toast.LENGTH_LONG);
////        }
//        super.onClick(view);
//    }
}
