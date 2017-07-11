package edu.gsu.httpscs.yan2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.gsu.httpscs.yan2017summer.util.UtilLog;

public class Quiz5Activity extends BaseActivity implements View.OnTouchListener  {


//    @BindView(R.id.activity_gesture_quiz5_tv)
//    TextView tv;

    @BindView(R.id.activity_gesture_quiz5_tv)
    TextView tv;


    private GestureDetector gestureDectector;
    private int sumX = 0;
    private int sumY = 0;
    private Animation transAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        ButterKnife.bind(this);

        transAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_trans);

        gestureDectector = new GestureDetector(this, new Quiz5Activity.simpleGestureLister());
        tv.setOnTouchListener(this);
        tv.setFocusable(true);
        tv.setClickable(true);
        tv.setLongClickable(true);

    }
    @Override
    public boolean onTouch(View v, MotionEvent event){
        return gestureDectector.onTouchEvent(event);
    }
    private class simpleGestureLister extends
            GestureDetector.SimpleOnGestureListener{
        /*******onDOwn-> onShowPress->onLongPress*********/

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            return super.onSingleTapUp(e);
        }
        @Override
        public void onLongPress(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            super.onLongPress(e);
        }
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            //Quiz 5 stuff

            //Quiz 5 stuff
            UtilLog.d("Gesture","onSingleTapUp");
            UtilLog.d("Gesture","distanceX:"+distanceX);
            UtilLog.d("Gesture","distanceY:"+distanceY);
            sumX+=distanceX;
            sumY+=distanceY;
            return super.onScroll(e1, e2, distanceX, distanceY);
        }
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            UtilLog.d("Gesture","onSingleTapUp");
            if(sumX<0){
                if(Math.abs(sumX)>200){
                    shortToast("You scroll from Left to Right");
                    tv.startAnimation(transAnimation);

                }
            }
            if(sumX>0){
                if(Math.abs(sumX)>200){
                    shortToast("You scroll from Right to Left");
                }
            }
            if(sumY<0){
                if(Math.abs(sumY)>200){
                    shortToast("You scroll from Top to Bottom");
                }
            }
            if(sumY>0){
                if(Math.abs(sumY)>200){
                    shortToast("You scroll from Bottom to Top");
                }
            }
            return super.onFling(e1, e2, velocityX, velocityY);
        }
        @Override
        public void onShowPress(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            super.onShowPress(e);
        }
        @Override
        public boolean onDown(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            return super.onDown(e);
        }
        @Override
        public boolean onDoubleTap(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            return super.onDoubleTap(e);
        }
        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            return super.onDoubleTapEvent(e);
        }
        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            return super.onSingleTapConfirmed(e);
        }
    }

}
